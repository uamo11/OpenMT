package l;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Q151 */
/* renamed from: l.ܳܶܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14608 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m34861(InputStream inputStream, C12164 c12164, boolean z, C12534 c12534) {
        boolean z2;
        try {
            C15206 m35970 = C15206.m35970(inputStream);
            Iterator it = m35970.f46672.m47857().iterator();
            while (it.hasNext()) {
                c12164.m29615reset((CharSequence) ((InterfaceC3571) it.next()).getValue());
                if (z) {
                    if (c12164.matches()) {
                        return true;
                    }
                } else if (c12164.find()) {
                    return true;
                }
            }
            XmlResourceParserC10269 m35994 = m35970.m35994();
            do {
                try {
                    int next = m35994.next();
                    if (next == 1) {
                        m35994.close();
                        return false;
                    }
                    z2 = false;
                    if (next == 2) {
                        int attributeCount = m35994.getAttributeCount();
                        for (int i = 0; i != attributeCount; i++) {
                            int m26023 = m35994.m26023(i);
                            if (m26023 == 2 || m26023 == 1) {
                                c12164.m29615reset((CharSequence) C20094.m46315(m26023 == 2 ? "?" : "@", c12534.m30776(m35994.m26020(i)).toLowerCase()));
                                if (!z) {
                                    if (c12164.find()) {
                                        z2 = true;
                                        break;
                                        break;
                                    }
                                } else {
                                    if (c12164.matches()) {
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } finally {
                }
            } while (!z2);
            m35994.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m34863(InputStream inputStream, C12164 c12164, boolean z, boolean z2, String str, C22108 c22108) {
        try {
            C15206 m35970 = C15206.m35970(inputStream);
            ArrayList arrayList = new ArrayList(1);
            boolean z3 = false;
            for (C3383 c3383 : m35970.f46672.m47859()) {
                String m9356 = C3058.m9356(c3383.getValue(), str, c12164, z, z2, c22108, arrayList);
                if (m9356 != null) {
                    c3383.m10319(m9356);
                    z3 = true;
                }
            }
            if (z3) {
                return m35970.m35985();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static byte[] m34866(InputStream inputStream, final int i, final int i2, C22108 c22108) {
        try {
            return m34864(C15206.m35970(inputStream), c22108, new InterfaceC17431() { // from class: l.ۧܶܽ
                @Override // l.InterfaceC17431
                /* renamed from: ֫ */
                public final int mo6263(int i3, int i4) {
                    return ((i3 == 2 || i3 == 1) && i4 == i) ? i2 : i4;
                }
            });
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m34862(InputStream inputStream, final int i, final int i2, C22108 c22108) {
        try {
            return m34864(C15206.m35970(inputStream), c22108, new InterfaceC17431() { // from class: l.ܽܶܽ
                @Override // l.InterfaceC17431
                /* renamed from: ֫ */
                public final int mo6263(int i3, int i4) {
                    return (i3 < 28 || i3 > 31 || i4 != i) ? i4 : i2;
                }
            });
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m34865(InputStream inputStream, final int i, final int i2, C22108 c22108) {
        try {
            return m34864(C15206.m35970(inputStream), c22108, new InterfaceC17431() { // from class: l.ᩳܶܽ
                @Override // l.InterfaceC17431
                /* renamed from: ֫ */
                public final int mo6263(int i3, int i4) {
                    return (i3 < 16 || i3 > 31 || i4 != i) ? i4 : i2;
                }
            });
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34860(C15206 c15206, InterfaceC17431 interfaceC17431) {
        m34864(c15206, null, new C1909(interfaceC17431));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m34864(C15206 c15206, C22108 c22108, InterfaceC17431 interfaceC17431) {
        try {
            XmlResourceParserC10269 m35994 = c15206.m35994();
            int i = 0;
            while (true) {
                int next = m35994.next();
                if (next == 1) {
                    break;
                }
                if (next == 2) {
                    int attributeCount = m35994.getAttributeCount();
                    int i2 = 0;
                    while (true) {
                        if (i2 != attributeCount) {
                            int m26023 = m35994.m26023(i2);
                            int m26020 = m35994.m26020(i2);
                            int mo6263 = interfaceC17431.mo6263(m26023, m26020);
                            if (mo6263 != m26020) {
                                C15972.m37746((((i2 * 5) + 4) * 4) + c15206.m35993() + m35994.f30939, mo6263, c15206.m35989());
                                i++;
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
            m35994.close();
            if (i <= 0) {
                return null;
            }
            if (c22108 != null) {
                c22108.m49685(i);
            }
            return c15206.m35989();
        } catch (Exception unused) {
            return null;
        }
    }
}
