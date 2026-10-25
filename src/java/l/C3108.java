package l;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: B74J */
/* renamed from: l.ۗ۠ۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3108 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Object f9720 = new Object();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f9719 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21453 m9475(C23713 c23713, Uri uri, InterfaceC15097 interfaceC15097, C15663 c15663) {
        C4519 c4519;
        String str;
        C16197 m52285 = c23713.m52285();
        if (m52285 == null) {
            return C21453.m48601();
        }
        String m47724 = C20892.m47724(uri, interfaceC15097);
        synchronized (f9720) {
            C15101 c15101 = (C15101) C13843.computeIfAbsent(f9719, m47724, new C8047());
            C21453 c21453 = new C21453(c15101, 0);
            c15101.f46186++;
            if (c15663 != null) {
                C2259.m7462(c15663.f48221, c21453);
            }
            while (c15101.f46182 && !c21453.f69071) {
                try {
                    f9720.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    c21453.m48602();
                    throw new InterruptedIOException("Interrupted while waiting for HTTP validation");
                }
            }
            if (c21453.f69071) {
                return C21453.m48601();
            }
            if (c23713.m52286().equals(c15101.f46184) && (str = c15101.f46181) != null) {
                C21453.m48598(c21453, str, c15101.f46183, c15101.f46185);
                return c21453;
            }
            c15101.f46182 = true;
            C4519 c45192 = null;
            try {
                c4519 = m9473(m52285, m47724, uri, interfaceC15097, c15101);
            } catch (IOException | RuntimeException unused2) {
                c4519 = null;
            }
            synchronized (f9720) {
                if (c4519 != null) {
                    if (c4519.f14361 != null) {
                        while (c15101.f46179 > 0) {
                            try {
                                f9720.wait();
                            } catch (InterruptedException unused3) {
                                Thread.currentThread().interrupt();
                                c15101.f46182 = false;
                                c21453.m48602();
                                f9720.notifyAll();
                                throw new InterruptedIOException("Interrupted while waiting to replace HTTP cache generation");
                            }
                        }
                        try {
                            m52285.m38150(c4519.f14361);
                        } catch (RuntimeException unused4) {
                        }
                    }
                }
                c45192 = c4519;
                c15101.f46182 = false;
                if (c45192 == null) {
                    c21453.m48602();
                    c23713.m52287();
                    f9720.notifyAll();
                    return C21453.m48601();
                }
                c15101.f46184 = c23713.m52286();
                c15101.f46181 = c45192.f14359;
                c15101.f46183 = c45192.f14360;
                c15101.f46185 = c45192.f14362;
                if (!c21453.f69071) {
                    C21453.m48598(c21453, c45192.f14359, c45192.f14360, c45192.f14362);
                }
                f9720.notifyAll();
                if (c21453.f69071) {
                    c21453 = C21453.m48601();
                }
                return c21453;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015e  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C4519 m9473(l.C16197 r26, java.lang.String r27, android.net.Uri r28, l.InterfaceC15097 r29, l.C15101 r30) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3108.m9473(l.ܺ᩸֫, java.lang.String, android.net.Uri, l.ܶ۠֫, l.ܶ۠ۜ):l.ۙ۠ۜ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x009a, code lost:
    
        if (r2 >= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cc, code lost:
    
        if (r2 >= 0) goto L61;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C20042 m9474(l.InterfaceC15097 r16, android.net.Uri r17, l.C22158 r18, boolean r19, boolean r20, l.C15101 r21) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3108.m9474(l.ܶ۠֫, android.net.Uri, l.᩹۠ۜ, boolean, boolean, l.ܶ۠ۜ):l.᩶۠ۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9476(C15101 c15101, InterfaceC21449 interfaceC21449) {
        synchronized (f9720) {
            if (!c15101.f46182 || c15101.f46186 + c15101.f46179 == 0) {
                throw new InterruptedIOException("HTTP validation was canceled");
            }
            c15101.f46187 = interfaceC21449;
            c15101.f46180 = Thread.currentThread();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m9479(C15101 c15101, InterfaceC21449 interfaceC21449) {
        synchronized (f9720) {
            if (c15101.f46187 == interfaceC21449) {
                c15101.f46187 = null;
                c15101.f46180 = null;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m9478(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && ((String) entry.getKey()).equalsIgnoreCase(str) && entry.getValue() != null && !((List) entry.getValue()).isEmpty()) {
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m9477(Uri uri) {
        MessageDigest m34534 = C14460.m34534();
        m34534.update(uri.buildUpon().fragment(null).build().toString().getBytes(StandardCharsets.UTF_8));
        return C14460.m34531(m34534.digest());
    }
}
