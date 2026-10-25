package l;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;

/* compiled from: 9B2H */
/* renamed from: l.֨᩸ᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1394 {

    /* renamed from: ᩹᩸ᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f5032;

    static {
        ApplicationC12518.m30701(20);
        f5032 = new short[]{6516, 10984, 10995, 11000, 10995};
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static native void m4882(AbstractC3322 abstractC3322, CharSequence charSequence, String str, C23077 c23077, C22749 c22749);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4886(C22878 c22878, CharSequence charSequence, String str, int i) {
        m4877(c22878, charSequence, str, i, (List) null, (C22749) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4877(OutputStream outputStream, CharSequence charSequence, String str, int i, List list, C22749 c22749) {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, C14776.m35151(i)));
        try {
            if (i == C14776.f45120) {
                outputStream.write(new byte[]{-17, -69, -65});
            } else if (i == C14776.f45129) {
                outputStream.write(new byte[]{-2, -1});
            } else if (i == C14776.f45122) {
                outputStream.write(new byte[]{-1, -2});
            } else if (i == C14776.f45123) {
                outputStream.write(new byte[]{0, 0, -2, -1});
            } else if (i == C14776.f45133) {
                outputStream.write(new byte[]{-1, -2, 0, 0});
            }
            C0688 c0688 = new C0688(bufferedWriter, str);
            if (c22749 != null) {
                c22749.m50827(c0688);
            } else if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(((AbstractC15440) it.next()).mo27926());
                    try {
                        C22194.m49853(gZIPInputStream, c0688, StandardCharsets.UTF_8);
                        gZIPInputStream.close();
                    } finally {
                    }
                }
            } else {
                int length = charSequence.length();
                for (int i2 = 0; i2 < length; i2++) {
                    c0688.write(charSequence.charAt(i2));
                }
            }
            bufferedWriter.close();
        } catch (Throwable th) {
            try {
                bufferedWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x012b, code lost:
    
        if (l.RunnableC0588.f2309 < 0) goto L31;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m4880(l.AbstractC3322 r25, java.lang.CharSequence r26, final java.lang.String r27, final int r28, int r29, java.util.List r30) {
        /*
            Method dump skipped, instructions count: 1956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1394.m4880(l.ۗܶᩳ, java.lang.CharSequence, java.lang.String, int, int, java.util.List):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4879(String str, int i, List list, AbstractC15440 abstractC15440) {
        C5628 c5628 = new C5628(abstractC15440.mo23555(false));
        C0521 c0521 = c5628.f17399;
        m4877(c5628, (CharSequence) null, str, i, list, (C22749) null);
        if (c0521.f2177 != 0) {
            MessageDigest m34526 = C14460.m34526();
            m34526.update(c0521.f2176, 0, c0521.f2177);
            C16398.m38654(C14460.m34531(m34526.digest()), C14776.m35153(i));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4881(AbstractC3322 abstractC3322, CharSequence charSequence, String str, C23077 c23077) {
        m4882(abstractC3322, charSequence, str, c23077, (C22749) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4883(AbstractC3322 abstractC3322, String str, C23077 c23077, C22749 c22749) {
        m4882(abstractC3322, (CharSequence) null, str, c23077, c22749);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4878(CharSequence charSequence, String str, C23077 c23077, C22749 c22749, AbstractC15440 abstractC15440) {
        C5628 c5628 = new C5628(abstractC15440.mo23555(false));
        C0521 c0521 = c5628.f17399;
        m4877(c5628, charSequence, str, c23077.f74223, (List) null, c22749);
        if (c0521.f2177 != 0) {
            MessageDigest m34526 = C14460.m34526();
            m34526.update(c0521.f2176, 0, c0521.f2177);
            C16398.m38654(C14460.m34531(m34526.digest()), C14776.m35153(c23077.f74223));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4884(AbstractC15440 abstractC15440, CharSequence charSequence, String str, int i) {
        C7744 mo26562 = charSequence instanceof InterfaceC20445 ? ((InterfaceC20445) charSequence).mo26562() : null;
        CharSequence charSequence2 = mo26562 == null ? charSequence : mo26562;
        try {
            abstractC15440.mo35195();
            abstractC15440.mo27915(new C19740(charSequence2, str, i, C16999.m39879(abstractC15440) && !abstractC15440.mo23120(), abstractC15440)).m47984();
            if (mo26562 != null) {
                mo26562.close();
            }
        } catch (Throwable th) {
            if (mo26562 != null) {
                try {
                    mo26562.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m4887(AbstractC15440 abstractC15440, CharSequence charSequence, String str, int i) {
        C7744 mo26562 = charSequence instanceof InterfaceC20445 ? ((InterfaceC20445) charSequence).mo26562() : null;
        try {
            m4877(abstractC15440.mo23555(false), mo26562 == null ? charSequence : mo26562, str, i, (List) null, (C22749) null);
            if (mo26562 != null) {
                mo26562.close();
            }
        } catch (Throwable th) {
            if (mo26562 != null) {
                try {
                    mo26562.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m4876(CharSequence charSequence) {
        if (!(charSequence instanceof C7744)) {
            return charSequence.toString();
        }
        C7744 c7744 = (C7744) charSequence;
        return c7744.subSequence(0, c7744.length());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4885(AbstractC15440 abstractC15440, String str, int i, C22749 c22749) {
        m4877(abstractC15440.mo23555(false), (CharSequence) null, str, i, (List) null, c22749);
    }
}
