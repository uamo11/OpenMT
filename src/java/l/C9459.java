package l;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: K74T */
/* renamed from: l.ۢ۠ۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9459 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f28698 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C1315 f28699 = new C1315(200);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23569 m24305(AbstractC13921 abstractC13921, InterfaceC17889 interfaceC17889, int i) {
        boolean z = abstractC13921 instanceof AbstractC3163;
        if (z || (abstractC13921 instanceof C2499)) {
            String str = "hls-corrupt:" + C20892.m47725(abstractC13921, interfaceC17889, "short-lived");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C1315 c1315 = f28699;
            synchronized (c1315) {
                Long l2 = (Long) c1315.m4553(str);
                if (l2 != null) {
                    if (elapsedRealtime < l2.longValue() || elapsedRealtime - l2.longValue() >= 30000) {
                        c1315.m4558(str);
                    } else {
                        return new C23569(EnumC6636.CORRUPT, null);
                    }
                }
                ExecutorService executorService = z ? C1802.f6209 : C1802.f6207;
                final C13484 c13484 = new C13484(interfaceC17889, abstractC13921);
                Future submit = executorService.submit(new Callable() { // from class: l.ۗ֨ۜ
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C13484.this.m32518();
                    }
                });
                try {
                    C23569 c23569 = (C23569) submit.get(Math.max(1, i), TimeUnit.SECONDS);
                    if (c23569.m52038() == EnumC6636.CORRUPT) {
                        m24308(str);
                    }
                    return c23569;
                } catch (InterruptedException unused) {
                    submit.cancel(true);
                    c13484.m32517();
                    Thread.currentThread().interrupt();
                    return new C23569(EnumC6636.CANCELED, null);
                } catch (ExecutionException unused2) {
                    submit.cancel(true);
                    c13484.m32517();
                    return new C23569(EnumC6636.TRANSIENT_FAILURE, null);
                } catch (TimeoutException unused3) {
                    submit.cancel(true);
                    c13484.m32517();
                    return new C23569(EnumC6636.TIMEOUT, null);
                }
            }
        }
        return new C23569(EnumC6636.UNSUPPORTED, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24308(String str) {
        C1315 c1315 = f28699;
        synchronized (c1315) {
            c1315.m4554(str, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23569 m24306(AbstractC13921 abstractC13921, InterfaceC17889 interfaceC17889, C11369 c11369) {
        String str;
        String str2;
        C23569 c23569;
        try {
            try {
                try {
                    C17925 m41935 = C17925.m41935(interfaceC17889, abstractC13921);
                    try {
                        c11369.m28127(m41935);
                        try {
                            c11369.m28128();
                            C17219 m24304 = m24304(m41935.f54749, m41935.f54748, m41935.f54750, c11369);
                            str = m24304.f52825;
                            Bitmap m31773 = C13110.m31773(str);
                            if (m31773 != null) {
                                c11369.m28128();
                                c23569 = new C23569(EnumC6636.SUCCESS, m31773);
                            } else {
                                c11369.m28128();
                                Bitmap m24302 = m24302(m24304, m41935.m41936(), C11266.m27878(32.0f), c11369);
                                if (m24302 != null) {
                                    c11369.m28128();
                                    str2 = m24304.f52825;
                                    C13110.m31775(str2, m24302);
                                    c23569 = new C23569(EnumC6636.SUCCESS, m24302);
                                } else {
                                    c23569 = new C23569(EnumC6636.TRANSIENT_FAILURE, null);
                                }
                            }
                            m41935.close();
                            return c23569;
                        } finally {
                            c11369.m28129(m41935);
                        }
                    } catch (Throwable th) {
                        try {
                            m41935.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (C10870 | C11826 | C20748 unused) {
                    return new C23569(EnumC6636.UNSUPPORTED, null);
                }
            } catch (IOException | RuntimeException unused2) {
                return new C23569(EnumC6636.TRANSIENT_FAILURE, null);
            }
        } catch (InterruptedIOException unused3) {
            return new C23569(EnumC6636.CANCELED, null);
        } catch (C9080 unused4) {
            return new C23569(EnumC6636.CORRUPT, null);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17219 m24304(InterfaceC15097 interfaceC15097, C16513 c16513, Uri uri, C11369 c11369) {
        AbstractC10596 abstractC10596;
        AbstractC10596 abstractC105962;
        C4951 c4951;
        String str;
        C1697 c1697;
        Uri uri2;
        String str2;
        Uri uri3;
        String str3;
        long j;
        long j2;
        AbstractC10596 abstractC105963;
        m24311(uri);
        C1697 m24303 = m24303(interfaceC15097, uri, new C23295(), c11369);
        abstractC10596 = m24303.f5885;
        if (abstractC10596 instanceof C12712) {
            C12712 c12712 = (C12712) abstractC10596;
            if (!c12712.f38253.isEmpty() || !c12712.f38261.isEmpty()) {
                throw new C20748("External video renditions or session DRM are unsupported");
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C13417 c13417 : c12712.f38258) {
                C8353 c8353 = c13417.f40104;
                String str4 = c8353.f25619;
                if ((c8353.f25608 & 16384) == 0 && c13417.f40103 == null) {
                    String m24804 = C9786.m24804(str4);
                    String m24797 = C9786.m24797(str4);
                    boolean z = c8353.f25633 > 0 || c8353.f25609 > 0;
                    if (m24804 != null || z) {
                        arrayList.add(c13417);
                    } else if (m24797 == null) {
                        arrayList2.add(c13417);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = arrayList2;
            }
            C13417 c134172 = (C13417) C5378.stream(arrayList).min(C15254.thenComparing(C15254.thenComparingLong(C8200.comparingLong(new C21247()), new C21952()), new C19836())).orElseThrow(new C4313());
            Uri uri4 = c134172.f40105;
            m24311(uri4);
            c1697 = m24303(interfaceC15097, uri4, new C23295(c12712, null), c11369);
            abstractC105963 = c1697.f5885;
            if (!(abstractC105963 instanceof C4951)) {
                throw new C20748("Nested multivariant playlists are unsupported");
            }
            c4951 = (C4951) abstractC105963;
            C8353 c83532 = c134172.f40104;
            str = uri4 + "|" + c83532.f25619 + "|" + c83532.f25623 + "|" + c83532.f25615 + "|" + c83532.f25633 + "x" + c83532.f25609;
        } else {
            abstractC105962 = m24303.f5885;
            if (!(abstractC105962 instanceof C4951)) {
                throw new C20748("Unsupported HLS playlist type");
            }
            c4951 = (C4951) abstractC105962;
            str = "direct";
            c1697 = m24303;
        }
        for (C21885 c21885 : c4951.f15593) {
            if (!c21885.f73017) {
                EnumC20541 m36760 = C15600.m36760(c4951, c21885);
                if (m36760 == null) {
                    throw new C20748("HLS playlist is not eligible for thumbnails");
                }
                C21885 c218852 = c21885.f73015;
                C14396 m38892 = c218852 != null ? c16513.m38892(c4951, c218852) : null;
                C14396 m388922 = c16513.m38892(c4951, c21885);
                if (m36760 == EnumC20541.FRAGMENTED_MP4 && m38892 == null) {
                    throw new C20748("Fragmented MP4 initialization is missing");
                }
                if (m38892 != null) {
                    j = m38892.f43361;
                    j2 = m388922.f43361;
                    if (j > C13132.FOREVER_NS - j2) {
                        throw new C20748("HLS thumbnail resource length overflows");
                    }
                }
                MessageDigest m34534 = C14460.m34534();
                m24309(m34534, "hls-thumb-v1");
                uri2 = m24303.f5884;
                m24309(m34534, uri2.toString());
                str2 = m24303.f5883;
                m24309(m34534, str2);
                uri3 = c1697.f5884;
                m24309(m34534, uri3.toString());
                str3 = c1697.f5883;
                m24309(m34534, str3);
                m24309(m34534, str);
                m24309(m34534, m36760.name());
                m24310(m34534, m38892);
                m24310(m34534, m388922);
                return new C17219(m36760, m38892, m388922, "hls_thumb_v1_".concat(C14460.m34531(m34534.digest())));
            }
        }
        throw new C20748("HLS media segment is missing");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1697 m24303(InterfaceC15097 interfaceC15097, Uri uri, C23295 c23295, C11369 c11369) {
        m24311(uri);
        InterfaceC21449 mo6247 = interfaceC15097.mo6247();
        C4515 c4515 = new C4515();
        c4515.m13281(uri);
        c4515.m13279(1);
        C20038 c20038 = new C20038(mo6247, c4515.m13278());
        MessageDigest m34534 = C14460.m34534();
        C9958 m28125 = c11369.m28125(c20038);
        try {
            c11369.m28128();
            c20038.m46233();
            Uri mo1621 = mo6247.mo1621();
            if (mo1621 != null) {
                uri = mo1621;
            }
            m24311(uri);
            AbstractC10596 m51688 = c23295.m51688(uri, new C7135(new DigestInputStream(new C22657(c20038), m34534)));
            c11369.m28128();
            C1697 c1697 = new C1697(m51688, uri, C14460.m34531(m34534.digest()));
            m28125.close();
            return c1697;
        } catch (Throwable th) {
            try {
                m28125.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        if (r4 > 0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap m24302(final l.C17219 r19, final l.InterfaceC15097 r20, int r21, final l.C11369 r22) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9459.m24302(l.ܿ۠ۜ, l.ܶ۠֫, int, l.ۨ֨ۜ):android.graphics.Bitmap");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24310(MessageDigest messageDigest, C14396 c14396) {
        Uri uri;
        String str;
        long j;
        long j2;
        if (c14396 == null) {
            m24309(messageDigest, "none");
            return;
        }
        uri = c14396.f43363;
        m24309(messageDigest, uri.toString());
        str = c14396.f43360;
        m24309(messageDigest, str);
        j = c14396.f43362;
        m24309(messageDigest, Long.toString(j));
        j2 = c14396.f43361;
        m24309(messageDigest, Long.toString(j2));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24309(MessageDigest messageDigest, String str) {
        if (str != null) {
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
        }
        messageDigest.update((byte) 0);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m24311(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null || !"mt_media".equals(scheme.toLowerCase(Locale.ROOT)) || uri.getAuthority() != null) {
            throw new C20748("HLS thumbnail URI must stay in the current visitor");
        }
    }
}
