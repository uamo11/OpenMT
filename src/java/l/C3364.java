package l;

import bin.mt.plus.R;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.ZipException;

/* compiled from: L1W7 */
/* renamed from: l.ۗܽᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3364 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f10648;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C19370 f10649;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C11940 f10650;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0055, code lost:
    
        continue;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m10284(l.AbstractC15440 r11, l.AbstractC15440 r12, l.InterfaceC13077 r13) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3364.m10284(l.ܶ᩵ܿ, l.ܶ᩵ܿ, l.۬ۧᩳ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10285(AbstractC15440 abstractC15440, AbstractC15440 abstractC154402, AbstractC13262 abstractC13262, String str, boolean z, boolean z2, final InterfaceC13077 interfaceC13077) {
        ExecutorService executorService;
        Throwable th;
        Throwable th2;
        ExecutorService executorService2;
        ByteArrayOutputStream byteArrayOutputStream;
        String str2;
        ByteArrayOutputStream byteArrayOutputStream2;
        String str3;
        ByteArrayOutputStream byteArrayOutputStream3;
        ByteArrayOutputStream byteArrayOutputStream4;
        String str4;
        ByteArrayOutputStream byteArrayOutputStream5;
        String str5;
        ByteArrayOutputStream byteArrayOutputStream6;
        Throwable th3;
        ExecutorService executorService3 = null;
        try {
            C18090 c18090 = new C18090(abstractC15440);
            try {
                C8918 c8918 = new C8918(abstractC154402);
                if (interfaceC13077 != null) {
                    try {
                        interfaceC13077.mo13119();
                    } catch (Throwable th4) {
                        th = th4;
                        executorService = executorService3;
                        th2 = th;
                        try {
                            try {
                                c8918.close();
                                throw th2;
                            } catch (Throwable th5) {
                                th2.addSuppressed(th5);
                                throw th2;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            th = th;
                            try {
                                try {
                                    c18090.close();
                                    throw th;
                                } catch (Throwable th7) {
                                    th.addSuppressed(th7);
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                if (executorService != null) {
                                    executorService.shutdownNow();
                                }
                                throw th;
                            }
                        }
                    }
                }
                c8918.m23025();
                C19370 c19370 = f10649;
                C11003.requireNonNull(c19370);
                C7433 m44631 = c19370.m44631(c18090);
                EnumC13782 m17126 = C6207.m17126(abstractC13262.m32197().getPublicKey(), m44631.f22849);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                long j = 0;
                for (C3545 c3545 : c18090.m42210()) {
                    String m10813 = c3545.m10813();
                    if (m10286(m10813)) {
                        j = c3545.m10793() + (c3545.getSize() * 3) + j;
                        linkedHashMap.put(m10813, c3545);
                    } else if (f10648 && m10813.endsWith("/")) {
                        linkedHashMap.put(m10813, c3545);
                    }
                }
                long j2 = (j / 100) * 25;
                final C23825 c23825 = new C23825(j + j2, interfaceC13077);
                C4775 c4775 = new C4775();
                final ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942();
                final C14561 m42196 = c18090.m42196();
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue(linkedHashMap.values());
                ExecutorService executorService4 = C1802.f6211;
                int i = C17615.f53826;
                ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(i);
                int i2 = 0;
                while (i2 < i) {
                    try {
                        final EnumC13782 enumC13782 = m17126;
                        C7433 c7433 = m44631;
                        int i3 = i2;
                        final ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                        EnumC13782 enumC137822 = m17126;
                        executorService2 = newFixedThreadPool;
                        int i4 = i;
                        ConcurrentLinkedQueue concurrentLinkedQueue3 = concurrentLinkedQueue;
                        try {
                            executorService2.submit(new Callable() { // from class: l.᩹ܽᩳ
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    C23825 c238252 = c23825;
                                    MessageDigest messageDigest = MessageDigest.getInstance(EnumC13782.this.m33093());
                                    byte[] bArr = new byte[UMModuleRegister.PUSH_EVENT_VALUE_HIGH];
                                    C18090 m34753 = m42196.m34753();
                                    while (true) {
                                        C3545 c35452 = (C3545) concurrentLinkedQueue2.poll();
                                        if (c35452 == null) {
                                            return null;
                                        }
                                        if (!c35452.isDirectory()) {
                                            try {
                                                InputStream m42189 = m34753.m42189(c35452);
                                                while (true) {
                                                    int read = m42189.read(bArr);
                                                    if (read <= 0) {
                                                        concurrentMapC10942.put(c35452.m10813(), messageDigest.digest());
                                                        break;
                                                    }
                                                    messageDigest.update(bArr, 0, read);
                                                    c238252.m52515(read * 3);
                                                    InterfaceC13077 interfaceC130772 = interfaceC13077;
                                                    if (interfaceC130772 != null && interfaceC130772.mo1526()) {
                                                        return null;
                                                    }
                                                }
                                            } catch (IOException e) {
                                                ZipException zipException = new ZipException(C4925.m14306(R.string.MT_Protector_res_0x7f120b44, c35452.m10813()));
                                                zipException.initCause(e);
                                                throw zipException;
                                            }
                                        }
                                    }
                                }
                            });
                            i2 = i3 + 1;
                            m44631 = c7433;
                            newFixedThreadPool = executorService2;
                            i = i4;
                            concurrentLinkedQueue = concurrentLinkedQueue3;
                            m17126 = enumC137822;
                        } catch (Throwable th9) {
                            th3 = th9;
                            th2 = th3;
                            executorService = executorService2;
                            c8918.close();
                            throw th2;
                        }
                    } catch (Throwable th10) {
                        th3 = th10;
                        executorService2 = newFixedThreadPool;
                        th2 = th3;
                        executorService = executorService2;
                        c8918.close();
                        throw th2;
                    }
                }
                EnumC13782 enumC137823 = m17126;
                C7433 c74332 = m44631;
                executorService2 = newFixedThreadPool;
                try {
                    byte[] bArr = new byte[UMModuleRegister.PUSH_EVENT_VALUE_HIGH];
                    for (C3545 c35452 : linkedHashMap.values()) {
                        if (c35452.isDirectory()) {
                            c8918.m23013(c35452);
                        } else if (c8918.m23024(c35452)) {
                            c23825.m52516(c35452.m10793());
                        } else {
                            c8918.m23020(c35452);
                            C12445 m42206 = c18090.m42206(c35452);
                            while (true) {
                                int read = m42206.read(bArr);
                                if (read > 0) {
                                    c8918.m23010(read, bArr);
                                    c23825.m52515(read);
                                    if (interfaceC13077 == null || !interfaceC13077.mo1526()) {
                                    }
                                }
                            }
                        }
                    }
                    C1802.m5992(executorService2);
                    if (interfaceC13077 != null) {
                        if (interfaceC13077.mo1526()) {
                            try {
                                c8918.close();
                                try {
                                    c18090.close();
                                    if (executorService2.isShutdown()) {
                                        return;
                                    }
                                    executorService2.shutdownNow();
                                    return;
                                } catch (Throwable th11) {
                                    th = th11;
                                    executorService = executorService2;
                                    if (executorService != null && !executorService.isShutdown()) {
                                        executorService.shutdownNow();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                executorService = executorService2;
                                th = th;
                                c18090.close();
                                throw th;
                            }
                        }
                    }
                    c4775.m13947(concurrentMapC10942, abstractC13262, enumC137823, c74332, str, z, z2, j2, c23825);
                    if (interfaceC13077 != null && interfaceC13077.mo1526()) {
                        c8918.close();
                        c18090.close();
                        if (executorService2.isShutdown()) {
                            return;
                        }
                        executorService2.shutdownNow();
                        return;
                    }
                    OutputStream m23007 = c8918.m23007();
                    C11940 c11940 = f10650;
                    if (c11940 == null) {
                        c8918.m23012("META-INF/MANIFEST.MF");
                        byteArrayOutputStream4 = c4775.f15147;
                        byteArrayOutputStream4.writeTo(m23007);
                        str4 = c4775.f15149;
                        c8918.m23012(str4);
                        byteArrayOutputStream5 = c4775.f15148;
                        byteArrayOutputStream5.writeTo(m23007);
                        str5 = c4775.f15150;
                        c8918.m23012(str5);
                        byteArrayOutputStream6 = c4775.f15151;
                        byteArrayOutputStream6.writeTo(m23007);
                    } else {
                        long j3 = c11940.f35700;
                        C3545 c35453 = new C3545("META-INF/MANIFEST.MF");
                        c35453.setTime(j3);
                        c8918.m23013(c35453);
                        byteArrayOutputStream = c4775.f15147;
                        byteArrayOutputStream.writeTo(m23007);
                        str2 = c4775.f15149;
                        C3545 c35454 = new C3545(str2);
                        c35454.setTime(j3);
                        c8918.m23013(c35454);
                        byteArrayOutputStream2 = c4775.f15148;
                        byteArrayOutputStream2.writeTo(m23007);
                        str3 = c4775.f15150;
                        C3545 c35455 = new C3545(str3);
                        c35455.setTime(j3);
                        c8918.m23013(c35455);
                        byteArrayOutputStream3 = c4775.f15151;
                        byteArrayOutputStream3.writeTo(m23007);
                    }
                    c8918.close();
                    c18090.close();
                    if (executorService2.isShutdown()) {
                        return;
                    }
                    executorService2.shutdownNow();
                } catch (Throwable th13) {
                    th = th13;
                    executorService3 = executorService2;
                    executorService = executorService3;
                    th2 = th;
                    c8918.close();
                    throw th2;
                }
            } catch (Throwable th14) {
                th = th14;
                executorService = null;
            }
        } catch (Throwable th15) {
            th = th15;
            executorService = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m10286(String str) {
        if (str.endsWith("/")) {
            return false;
        }
        if (!str.startsWith("META-INF/")) {
            return true;
        }
        boolean z = str.indexOf(47, 9) != -1;
        String lowerCase = str.substring(9).toLowerCase(Locale.US);
        return ("manifest.mf".equals(lowerCase) || lowerCase.endsWith(".sf") || lowerCase.endsWith(".rsa") || lowerCase.endsWith(".dsa") || lowerCase.endsWith(".ec") || (lowerCase.startsWith("sig-") && !z)) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m10283(EnumC13782 enumC13782) {
        int i = C20298.f65554[enumC13782.ordinal()];
        if (i == 1) {
            return "SHA1-Digest";
        }
        if (i == 2) {
            return "SHA-256-Digest";
        }
        throw new IllegalArgumentException("Unexpected content digest algorithm: " + enumC13782);
    }
}
