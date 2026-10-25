package l;

import com.alipay.sdk.m.y.l;
import java.util.BitSet;

/* compiled from: 1BDR */
/* renamed from: l.ۨܿܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC11849 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m28953(int i) {
        return i == (i & 255);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m28957(int i) {
        return i == (i & 15);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m28960(int i) {
        return i == (65535 & i);
    }

    /* renamed from: ֫ */
    public abstract int mo7129();

    /* renamed from: ֫ */
    public abstract String mo7130(AbstractC10438 abstractC10438);

    /* renamed from: ֫ */
    public abstract void mo7132(C18241 c18241, AbstractC10438 abstractC10438);

    /* renamed from: ֫ */
    public boolean mo10098(C5415 c5415) {
        return this instanceof C16975;
    }

    /* renamed from: ۧ */
    public abstract String mo7133(AbstractC10438 abstractC10438);

    /* renamed from: ۧ */
    public abstract boolean mo7134(AbstractC4793 abstractC4793);

    /* renamed from: ֫ */
    public BitSet mo7131(AbstractC4793 abstractC4793) {
        return new BitSet();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m28956(C20069 c20069) {
        int size = c20069.size();
        StringBuilder sb = new StringBuilder((size * 5) + 2);
        sb.append('{');
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(c20069.m41004get(i).m48644());
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m28959(C20069 c20069) {
        int size = c20069.size();
        StringBuilder m32307 = C13325.m32307(30, "{");
        if (size != 0) {
            if (size != 1) {
                C21480 m41004get = c20069.m41004get(size - 1);
                if (m41004get.m48645() == 2) {
                    m41004get = m41004get.m48640(1);
                }
                m32307.append(c20069.m41004get(0).m48644());
                m32307.append("..");
                m32307.append(m41004get.m48644());
            } else {
                m32307.append(c20069.m41004get(0).m48644());
            }
        }
        m32307.append(l.d);
        return m32307.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m28946(AbstractC1223 abstractC1223) {
        StringBuilder sb = new StringBuilder(100);
        sb.append('#');
        if (abstractC1223 instanceof C19569) {
            sb.append("null");
        } else {
            sb.append(abstractC1223.mo8292());
            sb.append(' ');
            sb.append(abstractC1223.mo2463());
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m28947(AbstractC1223 abstractC1223, int i) {
        StringBuilder m32307 = C13325.m32307(20, "#");
        long mo2227 = abstractC1223 instanceof AbstractC5457 ? ((AbstractC5457) abstractC1223).mo2227() : abstractC1223.mo2231();
        if (i == 4) {
            m32307.append(C14712.m35007((int) mo2227));
        } else if (i == 8) {
            m32307.append(C14712.m35005((int) mo2227));
        } else if (i == 16) {
            m32307.append(C14712.m35006((int) mo2227));
        } else if (i == 32) {
            m32307.append(C14712.m35008((int) mo2227));
        } else {
            if (i != 64) {
                throw new RuntimeException("shouldn't happen");
            }
            m32307.append(C14712.m35004(mo2227));
        }
        return m32307.toString();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m28961(AbstractC10438 abstractC10438) {
        int m15496 = ((C5415) abstractC10438).m15496();
        return m15496 == ((char) m15496) ? C14712.m35006(m15496) : C14712.m35008(m15496);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m28958(AbstractC10438 abstractC10438) {
        int m15497 = ((C5415) abstractC10438).m15497();
        if (m15497 == ((short) m15497)) {
            char[] cArr = new char[5];
            if (m15497 < 0) {
                cArr[0] = '-';
                m15497 = -m15497;
            } else {
                cArr[0] = '+';
            }
            for (int i = 0; i < 4; i++) {
                cArr[4 - i] = Character.forDigit(m15497 & 15, 16);
                m15497 >>= 4;
            }
            return new String(cArr);
        }
        return C14712.m35003(m15497);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m28954(C20069 c20069) {
        int size = c20069.size();
        if (size < 2) {
            return true;
        }
        int m48652 = c20069.m41004get(0).m48652();
        for (int i = 0; i < size; i++) {
            C21480 m41004get = c20069.m41004get(i);
            if (m41004get.m48652() != m48652) {
                return false;
            }
            m48652 += m41004get.m48645();
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static short m28950(AbstractC4793 abstractC4793, int i) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("arg out of range 0..255");
        }
        int m32171 = abstractC4793.m13994().m32171();
        if ((m32171 & 255) == m32171) {
            return (short) (m32171 | (i << 8));
        }
        throw new IllegalArgumentException("opcode out of range 0..255");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static short m28948(int i, int i2) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("low out of range 0..255");
        }
        if ((i2 & 255) == i2) {
            return (short) (i | (i2 << 8));
        }
        throw new IllegalArgumentException("high out of range 0..255");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static short m28949(int i, int i2, int i3, int i4) {
        if ((i & 15) != i) {
            throw new IllegalArgumentException("n0 out of range 0..15");
        }
        if ((i2 & 15) != i2) {
            throw new IllegalArgumentException("n1 out of range 0..15");
        }
        if ((i3 & 15) != i3) {
            throw new IllegalArgumentException("n2 out of range 0..15");
        }
        if ((i4 & 15) == i4) {
            return (short) (i | (i2 << 4) | (i3 << 8) | (i4 << 12));
        }
        throw new IllegalArgumentException("n3 out of range 0..15");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m28955(int i, int i2) {
        if ((i & 15) != i) {
            throw new IllegalArgumentException("low out of range 0..15");
        }
        if ((i2 & 15) == i2) {
            return i | (i2 << 4);
        }
        throw new IllegalArgumentException("high out of range 0..15");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28951(InterfaceC5813 interfaceC5813, short s, short s2) {
        C18241 c18241 = (C18241) interfaceC5813;
        c18241.m42511(s);
        c18241.m42511(s2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28952(C18241 c18241, short s, int i) {
        c18241.m42511(s);
        c18241.m42511((short) i);
        c18241.m42511((short) (i >> 16));
    }
}
