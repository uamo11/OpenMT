package l;

import android.content.Context;
import android.os.Build;
import com.alipay.sdk.m.y.k;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: E68Y */
/* renamed from: l.ۢ֨ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9255 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC10085 f28041;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C20177 f28042;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static boolean f28043;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static EnumC20544 f28044;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long f28045;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final boolean f28046;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final boolean f28047;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final boolean f28048;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f28049;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long f28050;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static Future f28051;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static synchronized void m23771() {
        synchronized (C9255.class) {
            if (f28044 != EnumC20544.FAILED) {
                return;
            }
            f28044 = EnumC20544.NONE;
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static synchronized EnumC20544 m23773() {
        EnumC20544 enumC20544;
        synchronized (C9255.class) {
            enumC20544 = f28044;
        }
        return enumC20544;
    }

    static {
        f28047 = new File("/system/bin/busybox").exists() || new File("/system/xbin/busybox").exists();
        f28048 = new File("/system/bin/toolbox").exists() || new File("/system/xbin/toolbox").exists();
        f28046 = new File("/system/bin/toybox").exists() || new File("/system/xbin/toybox").exists();
        f28041 = null;
        f28044 = EnumC20544.NONE;
        f28050 = 0L;
        f28045 = -1L;
        f28042 = new C20177();
        f28043 = true;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m23781() {
        InterfaceC10085 interfaceC10085 = f28041;
        return interfaceC10085 != null && interfaceC10085.mo25345();
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m23778() {
        EnumC23365 enumC23365;
        synchronized (C9255.class) {
            boolean z = f28049;
            if (z && m23781()) {
                return;
            }
            if (!z) {
                m23767();
                return;
            }
            if (m23779() || m23754()) {
                return;
            }
            synchronized (C9255.class) {
                if (f28049 && !m23781()) {
                    C6432 m23775 = m23775();
                    if (m23775 != null) {
                        f28045 = m23775.f19882;
                    }
                    if (m23775 == null) {
                        m23772(-1L, true);
                        return;
                    }
                    try {
                        m23775.f19881.get(1200L, TimeUnit.MILLISECONDS);
                        enumC23365 = EnumC23365.COMPLETED;
                    } catch (InterruptedException e) {
                        C19926.m45875("Shell.auto recovery shizuku interrupted, generation=" + m23775.f19882, e);
                        enumC23365 = EnumC23365.INTERRUPTED;
                    } catch (CancellationException unused) {
                        C19926.m45878("Shell.auto recovery shizuku canceled, generation=" + m23775.f19882);
                        enumC23365 = EnumC23365.CANCELED;
                    } catch (ExecutionException e2) {
                        C19926.m45875("Shell.auto recovery shizuku error, generation=" + m23775.f19882, e2);
                        enumC23365 = EnumC23365.FAILED;
                    } catch (TimeoutException unused2) {
                        C19926.m45878("Shell.auto recovery shizuku timeout, generation=" + m23775.f19882);
                        enumC23365 = EnumC23365.TIMEOUT;
                    }
                    if (enumC23365 == EnumC23365.COMPLETED && m23762(m23775.f19882)) {
                        return;
                    }
                    m23772(m23775.f19882, enumC23365 != EnumC23365.TIMEOUT);
                    if (enumC23365 == EnumC23365.INTERRUPTED) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[Catch: all -> 0x01aa, TryCatch #6 {, blocks: (B:4:0x0004, B:130:0x000a, B:6:0x000d, B:8:0x0015, B:13:0x0023, B:23:0x0055, B:25:0x005f, B:27:0x0067, B:28:0x006c, B:30:0x0085, B:32:0x0089, B:36:0x00e2, B:40:0x00f4, B:41:0x00f9, B:42:0x00f7, B:43:0x00fc, B:106:0x00a5, B:108:0x00a9, B:110:0x00ad, B:117:0x00d0, B:122:0x007f, B:126:0x0049, B:16:0x002d, B:18:0x0033, B:19:0x0039, B:119:0x0072, B:113:0x00c4), top: B:3:0x0004, inners: #4, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[Catch: all -> 0x01aa, TryCatch #6 {, blocks: (B:4:0x0004, B:130:0x000a, B:6:0x000d, B:8:0x0015, B:13:0x0023, B:23:0x0055, B:25:0x005f, B:27:0x0067, B:28:0x006c, B:30:0x0085, B:32:0x0089, B:36:0x00e2, B:40:0x00f4, B:41:0x00f9, B:42:0x00f7, B:43:0x00fc, B:106:0x00a5, B:108:0x00a9, B:110:0x00ad, B:117:0x00d0, B:122:0x007f, B:126:0x0049, B:16:0x002d, B:18:0x0033, B:19:0x0039, B:119:0x0072, B:113:0x00c4), top: B:3:0x0004, inners: #4, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m23767() {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9255.m23767():void");
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m23774() {
        synchronized (C9255.class) {
            if (m23781()) {
                return;
            }
            if (!C15871.m37616() && ApplicationC20075.m46266()) {
                boolean z = true;
                if (ApplicationC20075.f65010.getBoolean("get_adb", true)) {
                    Future future = f28051;
                    if (future == null || future.isDone()) {
                        boolean z2 = ApplicationC20075.f65010.getBoolean("get_root", true);
                        String string = ApplicationC20075.f65010.getString("last_shell_backend", "app");
                        if (z2) {
                            z = "shizuku".equals(string);
                        }
                        if (z) {
                            m23766();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C6432 m23775() {
        if (C15871.m37616() || !ApplicationC20075.m46266()) {
            return null;
        }
        if (!ApplicationC20075.f65010.getBoolean("get_adb", true)) {
            return null;
        }
        Future future = f28051;
        if (future != null && !future.isDone()) {
            return new C6432(f28050, future);
        }
        InterfaceC10085 interfaceC10085 = f28041;
        boolean z = (interfaceC10085 instanceof C19839) && !((C19839) interfaceC10085).mo25345();
        boolean z2 = ApplicationC20075.f65010.getBoolean("get_root", true);
        String string = ApplicationC20075.f65010.getString("last_shell_backend", "app");
        if (!z) {
            if (!(z2 ? "shizuku".equals(string) : true)) {
                return null;
            }
        }
        return m23766();
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C6432 m23766() {
        final long j = f28050 + 1;
        f28050 = j;
        EnumC20544 enumC20544 = EnumC20544.WAITING_BINDER;
        f28044 = enumC20544;
        C19926.m45878("Shell.prewarm start, generation=" + j + ", state=" + enumC20544);
        f28042.getClass();
        Future<?> submit = C1802.f6208.submit(new Runnable() { // from class: l.ܿ֨ۢ
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = j;
                try {
                    C19926.m45878("Shell.prewarm shizuku, generation=" + j2);
                    C19839.m45618(new C14192(j2));
                    C9255.m23758(j2, true);
                } catch (Throwable th) {
                    try {
                        C19926.m45875("Shell.prewarm error, generation=" + j2, th);
                    } finally {
                        C9255.m23758(j2, false);
                    }
                }
            }
        });
        f28051 = submit;
        return new C6432(j, submit);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23757(long j, EnumC12782 enumC12782) {
        EnumC20544 enumC20544;
        synchronized (C9255.class) {
            if (j != f28050) {
                return;
            }
            if (enumC12782 == EnumC12782.WAITING_BINDER) {
                enumC20544 = EnumC20544.WAITING_BINDER;
            } else {
                enumC20544 = EnumC20544.WAITING_PERMISSION_OR_SERVICE;
            }
            if (f28044 == enumC20544) {
                return;
            }
            f28044 = enumC20544;
            C19926.m45878("Shell.prewarm stage=" + enumC20544 + ", generation=" + j);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23758(long j, boolean z) {
        String str;
        InterfaceC10085 interfaceC10085;
        synchronized (C9255.class) {
            if (j != f28050) {
                C19926.m45878("Shell.prewarm result ignored: stale generation=" + j);
                return;
            }
            f28051 = null;
            f28044 = z ? EnumC20544.NONE : EnumC20544.FAILED;
            boolean z2 = (!z || (interfaceC10085 = f28041) == null || interfaceC10085.mo25346()) ? false : true;
            if (z2 && m23762(j)) {
                return;
            }
            synchronized (C9255.class) {
                if (f28045 != j) {
                    StringBuilder sb = new StringBuilder("Shell.prewarm result: ");
                    sb.append(z ? "success" : k.j);
                    sb.append(", generation=");
                    sb.append(j);
                    C19926.m45878(sb.toString());
                    return;
                }
                f28045 = -1L;
                InterfaceC10085 interfaceC100852 = f28041;
                if (interfaceC100852 != null) {
                    m23759(interfaceC100852);
                    StringBuilder sb2 = new StringBuilder("Shell.prewarm result: ");
                    sb2.append(z ? "success" : k.j);
                    sb2.append(", generation=");
                    sb2.append(j);
                    sb2.append(", backend=");
                    InterfaceC10085 interfaceC100853 = f28041;
                    if (interfaceC100853 != null) {
                        if (interfaceC100853.mo25347()) {
                            str = "root";
                        } else if (interfaceC100853.mo25348()) {
                            str = "shizuku";
                        }
                        sb2.append(str);
                        C19926.m45878(sb2.toString());
                    }
                    str = "app";
                    sb2.append(str);
                    C19926.m45878(sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder("Shell.prewarm result: ");
                    sb3.append(z ? "success" : k.j);
                    sb3.append(", generation=");
                    sb3.append(j);
                    sb3.append(", backend=app");
                    C19926.m45878(sb3.toString());
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23762(long j) {
        InterfaceC10085 interfaceC10085;
        synchronized (C9255.class) {
            if (j == f28050 && (interfaceC10085 = f28041) != null && !interfaceC10085.mo25346()) {
                if (!C19839.m45627()) {
                    return false;
                }
                try {
                    return m23763(j, new C19839(false, false), new RunnableC7281(2));
                } catch (IOException e) {
                    C19926.m45875("Shell.prewarm take over error, generation=" + j, e);
                    return false;
                }
            }
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23763(long j, C19839 c19839, RunnableC7281 runnableC7281) {
        InterfaceC10085 interfaceC10085;
        boolean z = false;
        try {
            synchronized (C9255.class) {
                if (j == f28050 && (interfaceC10085 = f28041) != null && !interfaceC10085.mo25346()) {
                    z = m23765(c19839);
                    if (z) {
                        synchronized (C9255.class) {
                            if (f28045 == j) {
                                f28045 = -1L;
                            }
                        }
                        C19926.m45878("Shell.prewarm result: success, generation=" + j + ", backend=shizuku");
                        runnableC7281.run();
                    }
                    return z;
                }
                c19839.close();
                return false;
            }
        } finally {
            if (!z) {
                c19839.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m23779() {
        /*
            java.lang.Class<l.ۢ֨ۢ> r0 = l.C9255.class
            monitor-enter(r0)
            boolean r1 = l.C9255.f28049     // Catch: java.lang.Throwable -> L76
            r2 = 1
            if (r1 == 0) goto L74
            boolean r1 = m23781()     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto Lf
            goto L74
        Lf:
            boolean r1 = l.C15871.m37616()     // Catch: java.lang.Throwable -> L76
            r3 = 0
            if (r1 != 0) goto L28
            boolean r1 = l.ApplicationC20075.m46266()     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto L28
            android.content.SharedPreferences r1 = l.ApplicationC20075.f65010     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = "get_root"
            boolean r1 = r1.getBoolean(r4, r2)     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto L28
            r1 = 1
            goto L29
        L28:
            r1 = 0
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L76
            if (r1 != 0) goto L2d
            goto L52
        L2d:
            r0 = 0
            java.lang.String r1 = l.C12925.m31436(r3)     // Catch: java.lang.Throwable -> L49
            if (r1 != 0) goto L3a
            java.lang.String r1 = "Shell.create su: Permission denied"
            l.C19926.m45878(r1)     // Catch: java.lang.Throwable -> L49
            goto L4f
        L3a:
            java.lang.String r4 = "Shell.create "
            java.lang.String r4 = r4.concat(r1)     // Catch: java.lang.Throwable -> L49
            l.C19926.m45878(r4)     // Catch: java.lang.Throwable -> L49
            l.۬ۚۢ r4 = new l.۬ۚۢ     // Catch: java.lang.Throwable -> L49
            r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> L49
            goto L50
        L49:
            r1 = move-exception
            java.lang.String r4 = "Shell.error"
            l.C19926.m45875(r4, r1)
        L4f:
            r4 = r0
        L50:
            if (r4 != 0) goto L53
        L52:
            return r3
        L53:
            java.lang.Class<l.ۢ֨ۢ> r0 = l.C9255.class
            monitor-enter(r0)
            boolean r1 = l.C9255.f28049     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L6c
            boolean r1 = m23781()     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L61
            goto L6c
        L61:
            m23760(r4, r2)     // Catch: java.lang.Throwable -> L71
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            l.C3468.m10611()
            l.C11496.m28324()
            return r2
        L6c:
            r4.close()     // Catch: java.lang.Throwable -> L71
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            return r2
        L71:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            throw r1
        L74:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L76
            return r2
        L76:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L76
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9255.m23779():boolean");
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static boolean m23754() {
        synchronized (C9255.class) {
            if (f28049 && !m23781()) {
                if (!C15871.m37616() && ApplicationC20075.m46266() && ApplicationC20075.f65010.getBoolean("get_adb", true)) {
                    if (!C19839.m45627()) {
                        return false;
                    }
                    try {
                        C19839 c19839 = new C19839(false, false);
                        synchronized (C9255.class) {
                            if (f28049 && !m23781()) {
                                m23760((InterfaceC10085) c19839, true);
                                C3468.m10611();
                                C11496.m28324();
                                return true;
                            }
                            c19839.close();
                            return true;
                        }
                    } catch (IOException e) {
                        C19926.m45875("Shell.reuse shizuku error", e);
                        return false;
                    }
                }
                return false;
            }
            return true;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m23772(long j, boolean z) {
        synchronized (C9255.class) {
            if (f28049 && !m23781() && (j < 0 || j == f28050)) {
                if (!z) {
                    f28045 = j;
                } else if (f28045 == j) {
                    f28045 = -1L;
                }
                C19926.m45878("Shell.create sh");
                m23760(new C12906("sh", false), z);
                C3468.m10611();
                C11496.m28324();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23765(C19839 c19839) {
        boolean z;
        synchronized (C9255.class) {
            InterfaceC10085 interfaceC10085 = f28041;
            z = interfaceC10085 == null || !interfaceC10085.mo25346();
            m23760((InterfaceC10085) c19839, true);
        }
        if (z) {
            C3468.m10611();
            C11496.m28324();
        }
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23760(InterfaceC10085 interfaceC10085, boolean z) {
        InterfaceC10085 interfaceC100852 = f28041;
        if (interfaceC100852 != null && interfaceC100852 != interfaceC10085) {
            interfaceC100852.close();
        }
        f28041 = interfaceC10085;
        f28049 = true;
        C19926.m45878("Shell.create success, uid=" + interfaceC10085.getUid());
        try {
            if (interfaceC10085.mo25347()) {
                C19926.m45878("Writing mtio");
                byte[] m21646 = C8172.m21646("/assets/" + String.valueOf(m23777()));
                File file = new File(C4925.m14322(), "mtio");
                if (file.exists() && file.canExecute()) {
                    if (!Arrays.equals(m21646, C20812.m47628(file))) {
                        C15843.m37503(file);
                    }
                }
                C15843.m37500(file, m21646);
                if (!file.setExecutable(true)) {
                    interfaceC10085.mo25343("chmod 755 " + file.getPath());
                }
            } else if (interfaceC10085.mo25348()) {
                C19926.m45878("Writing mtio");
                byte[] m216462 = C8172.m21646("/assets/" + String.valueOf(m23777()));
                File file2 = new File(C4925.f15522.getExternalCacheDir(), "mtio");
                C15843.m37500(file2, m216462);
                String concat = "/data/local/tmp/".concat(C4925.m14337());
                String str = concat + "/mtio";
                C12201 mo25343 = interfaceC10085.mo25343("mkdir -p " + concat + " && cp -f " + file2.getAbsolutePath() + " " + str + " && chmod 711 " + str);
                if (mo25343.m29683()) {
                    C19926.m45878("Error: " + mo25343.f36414);
                    interfaceC10085.close();
                    C19926.m45878("Shell.create sh");
                    C12906 c12906 = new C12906("sh", false);
                    try {
                        f28041 = c12906;
                        C19926.m45878("Shell.create success, uid=" + c12906.getUid());
                        interfaceC10085 = c12906;
                    } catch (IOException unused) {
                        interfaceC10085 = c12906;
                    }
                }
                C15843.m37503(file2);
            }
        } catch (IOException unused2) {
        }
        if (z) {
            m23759(interfaceC10085);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23759(InterfaceC10085 interfaceC10085) {
        String str;
        if (ApplicationC20075.f65010 == null) {
            return;
        }
        if (interfaceC10085 != null) {
            if (interfaceC10085.mo25347()) {
                str = "root";
            } else if (interfaceC10085.mo25348()) {
                str = "shizuku";
            }
            ApplicationC20075.f65010.edit().putString("last_shell_backend", str).apply();
        }
        str = "app";
        ApplicationC20075.f65010.edit().putString("last_shell_backend", str).apply();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10085 m23776() {
        return f28041;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m23780() {
        InterfaceC10085 interfaceC10085 = f28041;
        return interfaceC10085 != null && interfaceC10085.mo25347();
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m23770() {
        InterfaceC10085 interfaceC10085 = f28041;
        return interfaceC10085 != null && interfaceC10085.mo25348();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m23768() {
        InterfaceC10085 interfaceC10085 = f28041;
        return interfaceC10085 != null && interfaceC10085.mo25346();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23761(C10666 c10666) {
        ArrayList arrayList = new ArrayList();
        if (f28047) {
            StringBuilder m9834 = C3200.m9834("busybox mount -o remount,", "rw", " ");
            m9834.append(c10666.f32082);
            m9834.append(" ");
            m9834.append(c10666.f32083);
            arrayList.add(m9834.toString());
            arrayList.add("busybox mount -o remount,rw " + c10666.f32083);
            arrayList.add("busybox mount -o rw,remount " + c10666.f32082);
            arrayList.add("busybox mount -o rw,remount " + c10666.f32083);
        }
        if (f28048) {
            StringBuilder m98342 = C3200.m9834("toolbox mount -o remount,", "rw", " ");
            m98342.append(c10666.f32082);
            m98342.append(" ");
            m98342.append(c10666.f32083);
            arrayList.add(m98342.toString());
            arrayList.add("toolbox mount -o remount,rw " + c10666.f32083);
            arrayList.add("toolbox mount -o rw,remount " + c10666.f32082);
            arrayList.add("toolbox mount -o rw,remount " + c10666.f32083);
        }
        if (f28046) {
            StringBuilder m98343 = C3200.m9834("toybox mount -o remount,", "rw", " ");
            m98343.append(c10666.f32082);
            m98343.append(" ");
            m98343.append(c10666.f32083);
            arrayList.add(m98343.toString());
            arrayList.add("toybox mount -o remount,rw " + c10666.f32083);
            arrayList.add("toybox mount -o rw,remount " + c10666.f32082);
            arrayList.add("toybox mount -o rw,remount " + c10666.f32083);
        }
        StringBuilder m98344 = C3200.m9834("mount -o remount,", "rw", " ");
        m98344.append(c10666.f32082);
        m98344.append(" ");
        m98344.append(c10666.f32083);
        arrayList.add(m98344.toString());
        arrayList.add("mount -o remount,rw " + c10666.f32083);
        arrayList.add("mount -o rw,remount " + c10666.f32082);
        arrayList.add("mount -o rw,remount " + c10666.f32083);
        f28041.mo25343(C9679.m24609(arrayList, "\n"));
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static C12201 m23769() {
        if (m23780()) {
            return f28041.mo25343("cat /proc/mounts");
        }
        try {
            File file = new File("/proc/mounts");
            Charset charset = StandardCharsets.UTF_8;
            return new C12201("", (String[]) C15843.m37506(file).toArray(new String[0]));
        } catch (IOException e) {
            return new C12201(e);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m23777() {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, Build.SUPPORTED_ABIS);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            switch (str) {
                case "x86_64":
                    return 4;
                case "x86":
                    return 3;
                case "armeabi-v7a":
                    return 0;
                case "arm64-v8a":
                    return 2;
            }
        }
        return 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m23755(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if ("`!#$&*(){}|[]\\ ;\"'<>?".indexOf(c) != -1) {
                sb.append('\\');
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23756() {
        Future future;
        InterfaceC10085 interfaceC10085;
        synchronized (C9255.class) {
            future = f28051;
            f28051 = null;
            f28044 = EnumC20544.NONE;
            interfaceC10085 = f28041;
            if (f28045 >= 0 && interfaceC10085 != null) {
                m23759(interfaceC10085);
            }
            f28045 = -1L;
            f28050++;
            f28041 = null;
            f28049 = false;
        }
        if (future != null) {
            future.cancel(true);
        }
        if (interfaceC10085 != null) {
            interfaceC10085.close();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23764(Context context) {
        if (C21769.m49098(context)) {
            return true;
        }
        if (!m23768()) {
            return false;
        }
        String str = "pm grant " + context.getPackageName() + " android.permission.SYSTEM_ALERT_WINDOW";
        if (f28043) {
            if (f28041.mo25342(2000L, str).f36414.isEmpty() && C21769.m49098(context)) {
                return true;
            }
            f28043 = false;
        }
        return false;
    }
}
