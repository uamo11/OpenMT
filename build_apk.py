import os
import sys
import subprocess
import zipfile
import shutil

BASE_DIR = os.path.dirname(os.path.abspath(__file__))
PROJECT_DIR = os.path.join(BASE_DIR, "apk_project")
DIST_DIR = os.path.join(BASE_DIR, "dist")
TEMP_APK = os.path.join(DIST_DIR, "temp_raw.apk")
FINAL_APK = os.path.join(DIST_DIR, "openMT-y.open.mt.apk")
BINARY_MANIFEST = os.path.join(PROJECT_DIR, "AndroidManifest_binary.xml")

def main():
    os.makedirs(DIST_DIR, exist_ok=True)
    if os.path.exists(TEMP_APK):
        os.remove(TEMP_APK)
    
    print("[1/4] Building APK with Apktool...")
    apktool_cmd = ["apktool", "b", PROJECT_DIR, "-o", TEMP_APK]
    if os.name == "nt":
        # Windows: try local or PATH apktool
        local_bat = os.path.expanduser("~/.local/share/rea/apktool/apktool.bat")
        if os.path.exists(local_bat):
            apktool_cmd[0] = local_bat
    
    subprocess.check_call(apktool_cmd)
    
    print("[2/4] Injecting binary AndroidManifest.xml (package=y.open.mt)...")
    if not os.path.exists(BINARY_MANIFEST):
        raise FileNotFoundError(f"Missing binary manifest: {BINARY_MANIFEST}")
        
    with open(BINARY_MANIFEST, "rb") as f:
        manifest_data = f.read()
        
    patched_apk = os.path.join(DIST_DIR, "openMT_patched.apk")
    with zipfile.ZipFile(TEMP_APK, "r") as zin, zipfile.ZipFile(patched_apk, "w", compression=zipfile.ZIP_DEFLATED) as zout:
        for item in zin.infolist():
            if item.filename == "AndroidManifest.xml":
                zout.writestr(item, manifest_data)
            elif item.filename.startswith("META-INF/"):
                pass  # strip signatures to resign cleanly
            else:
                zout.writestr(item, zin.read(item.filename))
                
    os.remove(TEMP_APK)
    shutil.move(patched_apk, FINAL_APK)
    print(f"Patched APK ready at: {FINAL_APK}")
    
    print("[3/4] Aligning and signing with APK Signature Schemes v1, v2, v3...")
    signer_jar = os.path.expanduser("~/.local/share/rea/signer/uber-apk-signer.jar")
    if not os.path.exists(signer_jar):
        # Fallback to local ./uber-apk-signer.jar or download
        signer_jar = os.path.join(BASE_DIR, "uber-apk-signer.jar")
        if not os.path.exists(signer_jar):
            import urllib.request
            print("Downloading uber-apk-signer...")
            urllib.request.urlretrieve("https://github.com/patrickfav/uber-apk-signer/releases/download/v1.3.0/uber-apk-signer-1.3.0.jar", signer_jar)
            
    java_cmd = "java"
    java_home = os.environ.get("JAVA_HOME")
    if java_home and os.path.exists(os.path.join(java_home, "bin", "java.exe")):
        java_cmd = os.path.join(java_home, "bin", "java.exe")
    elif os.name == "nt":
        candidate = os.path.expanduser("~/.local/share/rea/jdk-21/bin/java.exe")
        if os.path.exists(candidate):
            java_cmd = candidate

    sign_cmd = [java_cmd, "-jar", signer_jar, "-a", FINAL_APK, "--overwrite", "--allowResign", "--verbose"]
    subprocess.check_call(sign_cmd)
    
    print(f"[4/4] Successfully built, aligned, and signed: {FINAL_APK}")

if __name__ == "__main__":
    main()
