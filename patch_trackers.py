import re
import os

manifest_path = r"C:\Users\Usuario\Documents\REA\MT2\openMT\apk_project\AndroidManifest.xml"
print("Patching AndroidManifest.xml...")
with open(manifest_path, "r", encoding="utf-8") as f:
    manifest = f.read()

# 1. Update package name to y.open.mt
manifest = manifest.replace('package="bin.mt.plus"', 'package="y.open.mt"')
manifest = manifest.replace('android:name="bin.mt.plus.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"', 'android:name="y.open.mt.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"')
manifest = manifest.replace('android:authorities="bin.mt.plus.html-preview"', 'android:authorities="y.open.mt.html-preview"')
manifest = manifest.replace('android:authorities="bin.mt.plus.fp"', 'android:authorities="y.open.mt.fp"')
manifest = manifest.replace('android:authorities="bin.mt.plus.shizuku"', 'android:authorities="y.open.mt.shizuku"')
manifest = manifest.replace('android:authorities="bin.mt.plus.androidx-startup"', 'android:authorities="y.open.mt.androidx-startup"')

# 2. Remove UMENG_CHANNEL metadata
manifest = re.sub(r'\s*<meta-data\s+android:name="UMENG_CHANNEL"[^>]*/>', '', manifest)

with open(manifest_path, "w", encoding="utf-8") as f:
    f.write(manifest)
print("AndroidManifest.xml patched successfully.")

def stub_void_methods(file_path, method_patterns):
    if not os.path.exists(file_path):
        print(f"Skipping {file_path} (not found)")
        return
    with open(file_path, "r", encoding="utf-8") as f:
        content = f.read()

    for pattern in method_patterns:
        # Regex to match method header to .end method
        regex = rf"(\.method [^\n]*?{pattern}\([^\n]*?\)[^\n]*?\n)([\s\S]*?)(\.end method)"
        replacement = r"\1    .locals 0\n\n    return-void\n\3"
        content, count = re.subn(regex, replacement, content)
        print(f"Stubbed {pattern} in {os.path.basename(file_path)}: {count} matches")

    with open(file_path, "w", encoding="utf-8") as f:
        f.write(content)

umconfigure_path = r"C:\Users\Usuario\Documents\REA\MT2\openMT\apk_project\smali\com\umeng\commonsdk\UMConfigure.smali"
stub_void_methods(umconfigure_path, ["init", "preInit", "preInitInternal"])

mobclick_path = r"C:\Users\Usuario\Documents\REA\MT2\openMT\apk_project\smali\com\umeng\analytics\MobclickAgent.smali"
stub_void_methods(mobclick_path, ["onEvent", "onPageStart", "onPageEnd", "onResume", "onPause", "reportError"])

crash_path = r"C:\Users\Usuario\Documents\REA\MT2\openMT\apk_project\smali\com\umeng\commonsdk\internal\crash\UMCrashManager.smali"
stub_void_methods(crash_path, ["buildEnvelope", "buildEnvelopeWithExtInfo", "splitByByte"])

print("All tracker stubs successfully applied!")
