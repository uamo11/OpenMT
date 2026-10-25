package l;

import java.io.IOException;

/* compiled from: 3BDE */
/* renamed from: l.۬ᩳܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13280 extends C8342 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C13280 f39762 = new C13280();

    @Override // l.C8342
    /* renamed from: ֫ */
    public final InterfaceC12575 mo21939(C22453 c22453, int i, String str, int i2, int i3) {
        int i4 = 0;
        if (i == 0) {
            if (str == "BootstrapMethods") {
                if (i3 < 2) {
                    m32242();
                    throw null;
                }
                C11186 m50388 = c22453.m50388();
                int m27753 = m50388.m27753(i2);
                int i5 = i2 + 2;
                int i6 = i3 - 2;
                C10396 m50387 = c22453.m50387();
                C12512 m50378 = c22453.m50378();
                C19590 c19590 = new C19590(m27753);
                for (int i7 = 0; i7 < m27753; i7++) {
                    if (i6 < 4) {
                        throw new C23158("truncated attribute", null);
                    }
                    int m277532 = m50388.m27753(i5);
                    int m277533 = m50388.m27753(i5 + 2);
                    i5 += 4;
                    i6 -= 4;
                    if (i6 < m277533 * 2) {
                        throw new C23158("truncated attribute", null);
                    }
                    C4067 c4067 = new C4067(m277533);
                    int i8 = 0;
                    while (i8 < m277533) {
                        c4067.mo12223(i8, m50387.get(m50388.m27753(i5)));
                        i8++;
                        i5 += 2;
                        i6 -= 2;
                    }
                    c4067.mo20349();
                    c19590.m45025(i7, m50378, (C21685) m50387.get(m277532), c4067);
                }
                c19590.mo20349();
                if (i6 == 0) {
                    return new C21542(c19590);
                }
                m32243(i6);
                throw null;
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C4608("Deprecated");
                }
                m32243(0);
                throw null;
            }
            if (str == "EnclosingMethod") {
                if (i3 != 4) {
                    m32243(4);
                    throw null;
                }
                C11186 m503882 = c22453.m50388();
                C10396 m503872 = c22453.m50387();
                C12512 c12512 = (C12512) m503872.get(m503882.m27753(i2));
                int m277534 = m503882.m27753(i2 + 2);
                return new C3197(c12512, (C20274) (m277534 != 0 ? m503872.get(m277534) : null));
            }
            if (str == "InnerClasses") {
                if (i3 < 2) {
                    m32242();
                    throw null;
                }
                C11186 m503883 = c22453.m50388();
                C10396 m503873 = c22453.m50387();
                int m277535 = m503883.m27753(i2);
                int i9 = i2 + 2;
                int i10 = m277535 * 8;
                if (i3 - 2 != i10) {
                    m32243(i10 + 2);
                    throw null;
                }
                C9006 c9006 = new C9006(m277535);
                while (i4 < m277535) {
                    int m277536 = m503883.m27753(i9);
                    int m277537 = m503883.m27753(i9 + 2);
                    int m277538 = m503883.m27753(i9 + 4);
                    c9006.m23248(i4, (C12512) m503873.get(m277536), (C12512) (m277537 == 0 ? null : m503873.get(m277537)), (C13217) (m277538 == 0 ? null : m503873.get(m277538)), m503883.m27753(i9 + 6));
                    i9 += 8;
                    i4++;
                }
                c9006.mo20349();
                return new C12369(c9006);
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m32244(c22453, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m32245(c22453, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C17472("Synthetic");
                }
                m32243(0);
                throw null;
            }
            if (str == "Signature") {
                return m32246(c22453, i2, i3);
            }
            if (str == "SourceDebugExtension") {
                return new C16766(new C13217(c22453.m50388().m27750(i2, i2 + i3)));
            }
            if (str == "SourceFile") {
                if (i3 == 2) {
                    return new C18178((C13217) c22453.m50387().get(c22453.m50388().m27753(i2)));
                }
                m32243(2);
                throw null;
            }
        } else if (i == 1) {
            if (str == "ConstantValue") {
                if (i3 == 2) {
                    return new C20131((AbstractC6162) c22453.m50387().get(c22453.m50388().m27753(i2)));
                }
                m32243(2);
                throw null;
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C4608("Deprecated");
                }
                m32243(0);
                throw null;
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m32244(c22453, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m32245(c22453, i2, i3);
            }
            if (str == "Signature") {
                return m32246(c22453, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C17472("Synthetic");
                }
                m32243(0);
                throw null;
            }
        } else if (i == 2) {
            if (str == "AnnotationDefault") {
                if (i3 >= 2) {
                    return new C15190(i3, new C1286(c22453, i2, i3).m4353());
                }
                m32242();
                throw null;
            }
            if (str == "Code") {
                if (i3 < 12) {
                    m32242();
                    throw null;
                }
                C11186 m503884 = c22453.m50388();
                C10396 m503874 = c22453.m50387();
                int m277539 = m503884.m27753(i2);
                int m2775310 = m503884.m27753(i2 + 2);
                int m27752 = m503884.m27752(i2 + 4);
                int i11 = i2 + 8;
                int i12 = i3 - 8;
                if (i12 < m27752 + 4) {
                    throw new C23158("truncated attribute", null);
                }
                int i13 = i11 + m27752;
                int i14 = i12 - m27752;
                C4772 c4772 = new C4772(m503884.m27750(i11, i13), m503874);
                int m2775311 = m503884.m27753(i13);
                C8300 c8300 = m2775311 == 0 ? C8300.f25495 : new C8300(m2775311);
                int i15 = i13 + 2;
                int i16 = i14 - 2;
                if (i16 < (m2775311 * 8) + 2) {
                    throw new C23158("truncated attribute", null);
                }
                while (i4 < m2775311) {
                    int m2775312 = m503884.m27753(i15);
                    int m2775313 = m503884.m27753(i15 + 2);
                    int m2775314 = m503884.m27753(i15 + 4);
                    int m2775315 = m503884.m27753(i15 + 6);
                    c8300.m21901(i4, m2775312, m2775313, m2775314, (C12512) (m2775315 == 0 ? null : m503874.get(m2775315)));
                    i15 += 8;
                    i16 -= 8;
                    i4++;
                }
                c8300.mo20349();
                C15396 c15396 = new C15396(c22453, 3, i15, this);
                C13985 m36435 = c15396.m36435();
                m36435.mo20349();
                int m36434 = c15396.m36434() - i15;
                if (m36434 == i16) {
                    return new C22247(m277539, m2775310, c4772, c8300, m36435);
                }
                m32243((i15 - i2) + m36434);
                throw null;
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C4608("Deprecated");
                }
                m32243(0);
                throw null;
            }
            if (str == "Exceptions") {
                if (i3 < 2) {
                    m32242();
                    throw null;
                }
                int m2775316 = c22453.m50388().m27753(i2);
                int i17 = i2 + 2;
                int i18 = m2775316 * 2;
                if (i3 - 2 == i18) {
                    return new C13074(c22453.m50377(i17, m2775316));
                }
                m32243(i18 + 2);
                throw null;
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m32244(c22453, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m32245(c22453, i2, i3);
            }
            if (str == "RuntimeInvisibleParameterAnnotations") {
                if (i3 >= 2) {
                    return new C13779("RuntimeInvisibleParameterAnnotations", new C1286(c22453, i2, i3).m4355(EnumC11623.BUILD), i3);
                }
                m32242();
                throw null;
            }
            if (str == "RuntimeVisibleParameterAnnotations") {
                if (i3 >= 2) {
                    return new C1950("RuntimeVisibleParameterAnnotations", new C1286(c22453, i2, i3).m4355(EnumC11623.RUNTIME), i3);
                }
                m32242();
                throw null;
            }
            if (str == "Signature") {
                return m32246(c22453, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C17472("Synthetic");
                }
                m32243(0);
                throw null;
            }
        } else if (i == 3) {
            if (str == "LineNumberTable") {
                if (i3 < 2) {
                    m32242();
                    throw null;
                }
                C11186 m503885 = c22453.m50388();
                int m2775317 = m503885.m27753(i2);
                int i19 = i2 + 2;
                int i20 = m2775317 * 4;
                if (i3 - 2 != i20) {
                    m32243(i20 + 2);
                    throw null;
                }
                C6183 c6183 = new C6183(m2775317);
                while (i4 < m2775317) {
                    c6183.m17105(i4, m503885.m27753(i19), m503885.m27753(i19 + 2));
                    i19 += 4;
                    i4++;
                }
                c6183.mo20349();
                return new C10253(c6183);
            }
            if (str == "LocalVariableTable") {
                if (i3 >= 2) {
                    C11186 m503886 = c22453.m50388();
                    return new C6019("LocalVariableTable", m32241(m503886.m27750(i2 + 2, i2 + i3), c22453.m50387(), m503886.m27753(i2), false));
                }
                m32242();
                throw null;
            }
            if (str == "LocalVariableTypeTable") {
                if (i3 >= 2) {
                    C11186 m503887 = c22453.m50388();
                    return new C11664("LocalVariableTypeTable", m32241(m503887.m27750(i2 + 2, i2 + i3), c22453.m50387(), m503887.m27753(i2), true));
                }
                m32242();
                throw null;
            }
        }
        C11186 m503888 = c22453.m50388();
        c22453.m50387();
        return new C16060(str, m503888, i2, i3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23116 m32241(C11186 c11186, C10396 c10396, int i, boolean z) {
        C13217 c13217;
        C13217 c132172;
        int i2 = i * 10;
        if (c11186.m27748() == i2) {
            C7224 c7224 = new C7224(new C2013(c11186));
            C23116 c23116 = new C23116(i);
            for (int i3 = 0; i3 < i; i3++) {
                try {
                    int readUnsignedShort = c7224.readUnsignedShort();
                    int readUnsignedShort2 = c7224.readUnsignedShort();
                    int readUnsignedShort3 = c7224.readUnsignedShort();
                    int readUnsignedShort4 = c7224.readUnsignedShort();
                    int readUnsignedShort5 = c7224.readUnsignedShort();
                    C13217 c132173 = (C13217) c10396.get(readUnsignedShort3);
                    C13217 c132174 = (C13217) c10396.get(readUnsignedShort4);
                    if (z) {
                        c132172 = null;
                        c13217 = c132174;
                    } else {
                        c13217 = null;
                        c132172 = c132174;
                    }
                    c23116.m51307(i3, readUnsignedShort, readUnsignedShort2, c132173, c132172, c13217, readUnsignedShort5);
                } catch (IOException e) {
                    throw new RuntimeException("shouldn't happen", e);
                }
            }
            c23116.mo20349();
            return c23116;
        }
        m32243(i2 + 2);
        throw null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C22952 m32244(C22453 c22453, int i, int i2) {
        if (i2 >= 2) {
            return new C22952("RuntimeInvisibleAnnotations", new C1286(c22453, i, i2).m4354(EnumC11623.BUILD), i2);
        }
        m32242();
        throw null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C7430 m32245(C22453 c22453, int i, int i2) {
        if (i2 >= 2) {
            return new C7430("RuntimeVisibleAnnotations", new C1286(c22453, i, i2).m4354(EnumC11623.RUNTIME), i2);
        }
        m32242();
        throw null;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C11123 m32246(C22453 c22453, int i, int i2) {
        if (i2 != 2) {
            m32243(2);
            throw null;
        }
        return new C11123((C13217) c22453.m50387().get(c22453.m50388().m27753(i)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32242() {
        throw new C23158("severely truncated attribute", null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32243(int i) {
        throw new C23158("bad attribute length; expected length ".concat(C14712.m35008(i)), null);
    }
}
