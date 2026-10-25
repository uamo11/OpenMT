package com.github.luben.zstd.util;

import com.umeng.commonsdk.statistics.idtracking.g;
import java.io.File;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.concurrent.atomic.AtomicBoolean;
import l.C3435;
import l.C9045;

/* loaded from: classes.dex */
public enum Native {
    ;

    public static final String libname = "libzstd-jni-1.5.7-7";
    public static final String libnameShort = "zstd-jni-1.5.7-7";
    public static final String nativePathOverride = "ZstdNativePath";
    public static final String tempFolderOverride = "ZstdTempFolder";
    public static final String errorMsg = C9045.m23341(new StringBuilder("Unsupported OS/arch, cannot find "), resourceName(), " or load zstd-jni-1.5.7-7 from system libraries. Please try building from source the jar or providing libzstd-jni-1.5.7-7 in your system.");
    public static AtomicBoolean loaded = new AtomicBoolean(false);

    public static synchronized void assumeLoaded() {
        synchronized (Native.class) {
            loaded.set(true);
        }
    }

    public static synchronized boolean isLoaded() {
        boolean z;
        synchronized (Native.class) {
            z = loaded.get();
        }
        return z;
    }

    public static String osName() {
        String replace = System.getProperty("os.name").toLowerCase().replace(' ', '_');
        return replace.startsWith("win") ? "win" : replace.startsWith(g.a) ? "darwin" : replace;
    }

    public static String libExtension() {
        return (osName().contains("os_x") || osName().contains("darwin")) ? "dylib" : osName().contains("win") ? "dll" : "so";
    }

    public static String resourceName() {
        String osName = osName();
        String property = System.getProperty("os.arch");
        if (osName.equals("darwin") && property.equals("amd64")) {
            property = "x86_64";
        }
        StringBuilder m10501 = C3435.m10501("/", osName, "/", property, "/libzstd-jni-1.5.7-7.");
        m10501.append(libExtension());
        return m10501.toString();
    }

    public static void loadLibrary(final String str) {
        AccessController.doPrivileged(new PrivilegedAction() { // from class: com.github.luben.zstd.util.Native.1
            @Override // java.security.PrivilegedAction
            public Void run() {
                System.loadLibrary(str);
                return null;
            }
        });
    }

    public static void loadLibraryFile(final String str) {
        AccessController.doPrivileged(new PrivilegedAction() { // from class: com.github.luben.zstd.util.Native.2
            @Override // java.security.PrivilegedAction
            public Void run() {
                System.load(str);
                return null;
            }
        });
    }

    public static synchronized void load() {
        synchronized (Native.class) {
            String property = System.getProperty(tempFolderOverride);
            if (property == null) {
                load(null);
            } else {
                load(new File(property));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd A[Catch: IOException -> 0x00c9, all -> 0x014f, TryCatch #7 {, blocks: (B:4:0x0005, B:9:0x000f, B:11:0x001c, B:19:0x0037, B:88:0x003f, B:40:0x00b8, B:42:0x00bd, B:43:0x00c0, B:45:0x00c6, B:65:0x013b, B:67:0x0140, B:69:0x0145, B:71:0x014b, B:73:0x014e, B:92:0x004c, B:93:0x0072, B:15:0x0026), top: B:3:0x0005, inners: #6, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6 A[Catch: IOException -> 0x00c9, all -> 0x014f, TRY_LEAVE, TryCatch #7 {, blocks: (B:4:0x0005, B:9:0x000f, B:11:0x001c, B:19:0x0037, B:88:0x003f, B:40:0x00b8, B:42:0x00bd, B:43:0x00c0, B:45:0x00c6, B:65:0x013b, B:67:0x0140, B:69:0x0145, B:71:0x014b, B:73:0x014e, B:92:0x004c, B:93:0x0072, B:15:0x0026), top: B:3:0x0005, inners: #6, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0140 A[Catch: IOException -> 0x014e, all -> 0x014f, TryCatch #2 {IOException -> 0x014e, blocks: (B:65:0x013b, B:67:0x0140, B:69:0x0145, B:71:0x014b), top: B:64:0x013b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void load(java.io.File r9) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.luben.zstd.util.Native.load(java.io.File):void");
    }
}
