package l;

import java.util.BitSet;

/* compiled from: 9BEU */
/* renamed from: l.ۚᩳܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5520 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11186 f17082;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f17083;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f17084;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C10396 f17085;

    public C5520(C11186 c11186) {
        int m27753 = c11186.m27753(8);
        this.f17082 = c11186;
        this.f17085 = new C10396(m27753);
        this.f17084 = new int[m27753];
        this.f17083 = -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15653() {
        m15652();
        return this.f17083;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10396 m15654() {
        m15652();
        return this.f17085;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m15652() {
        int i;
        if (this.f17083 >= 0) {
            return;
        }
        int i2 = 10;
        int i3 = 1;
        while (true) {
            int[] iArr = this.f17084;
            if (i3 < iArr.length) {
                iArr[i3] = i2;
                C11186 c11186 = this.f17082;
                int m27755 = c11186.m27755(i2);
                switch (m27755) {
                    case 1:
                        i2 += c11186.m27753(i2 + 1) + 3;
                        break;
                    case 2:
                    case 13:
                    case 14:
                    case 17:
                    default:
                        throw new C23158("unknown tag byte: " + C14712.m35005(m27755), null);
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 18:
                        i2 += 5;
                        break;
                    case 5:
                    case 6:
                        i2 += 9;
                        i = 2;
                        continue;
                        i3 += i;
                    case 7:
                    case 8:
                    case 16:
                        i2 += 3;
                        break;
                    case 15:
                        try {
                            i2 += 4;
                            break;
                        } catch (C23158 e) {
                            e.m21602("...while preparsing cst " + C14712.m35006(i3) + " at offset " + C14712.m35008(i2));
                            throw e;
                        }
                }
                i = 1;
                i3 += i;
            } else {
                this.f17083 = i2;
                BitSet bitSet = new BitSet(iArr.length);
                for (int i4 = 1; i4 < iArr.length; i4++) {
                    if (iArr[i4] != 0 && this.f17085.m26225(i4) == null) {
                        m15651(bitSet, i4);
                    }
                }
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC13717 m15651(BitSet bitSet, int i) {
        AbstractC13717 m15650;
        AbstractC13717 m8291;
        AbstractC13717 abstractC13717;
        int i2;
        C11186 c11186 = this.f17082;
        C10396 c10396 = this.f17085;
        AbstractC13717 m26225 = c10396.m26225(i);
        if (m26225 != null) {
            return m26225;
        }
        int i3 = this.f17084[i];
        try {
            int m27755 = c11186.m27755(i3);
            switch (m27755) {
                case 1:
                    m15650 = m15650(i3);
                    bitSet.set(i);
                    m8291 = m15650;
                    c10396.m26226(i, m8291);
                    return m8291;
                case 2:
                case 13:
                case 14:
                case 17:
                default:
                    throw new C23158("unknown tag byte: ".concat(C14712.m35005(m27755)), null);
                case 3:
                    m8291 = C2635.m8291(c11186.m27752(i3 + 1));
                    c10396.m26226(i, m8291);
                    return m8291;
                case 4:
                    m8291 = C16039.m37916(c11186.m27752(i3 + 1));
                    c10396.m26226(i, m8291);
                    return m8291;
                case 5:
                    m8291 = C8279.m21878(c11186.m27754(i3 + 1));
                    c10396.m26226(i, m8291);
                    return m8291;
                case 6:
                    m8291 = C20980.m47790(c11186.m27754(i3 + 1));
                    c10396.m26226(i, m8291);
                    return m8291;
                case 7:
                    m15650 = new C12512(C7573.m20298(((C13217) m15651(bitSet, c11186.m27753(i3 + 1))).getString()));
                    m8291 = m15650;
                    c10396.m26226(i, m8291);
                    return m8291;
                case 8:
                    m8291 = m15651(bitSet, c11186.m27753(i3 + 1));
                    c10396.m26226(i, m8291);
                    return m8291;
                case 9:
                    m15650 = new C8985((C12512) m15651(bitSet, c11186.m27753(i3 + 1)), (C20274) m15651(bitSet, c11186.m27753(i3 + 3)));
                    m8291 = m15650;
                    c10396.m26226(i, m8291);
                    return m8291;
                case 10:
                    m15650 = new C22390((C12512) m15651(bitSet, c11186.m27753(i3 + 1)), (C20274) m15651(bitSet, c11186.m27753(i3 + 3)));
                    m8291 = m15650;
                    c10396.m26226(i, m8291);
                    return m8291;
                case 11:
                    m15650 = new C4046((C12512) m15651(bitSet, c11186.m27753(i3 + 1)), (C20274) m15651(bitSet, c11186.m27753(i3 + 3)));
                    m8291 = m15650;
                    c10396.m26226(i, m8291);
                    return m8291;
                case 12:
                    m15650 = new C20274((C13217) m15651(bitSet, c11186.m27753(i3 + 1)), (C13217) m15651(bitSet, c11186.m27753(i3 + 3)));
                    m8291 = m15650;
                    c10396.m26226(i, m8291);
                    return m8291;
                case 15:
                    int m277552 = c11186.m27755(i3 + 1);
                    int m27753 = c11186.m27753(i3 + 2);
                    switch (m277552) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            abstractC13717 = (C8985) m15651(bitSet, m27753);
                            break;
                        case 5:
                        case 8:
                            abstractC13717 = (C22390) m15651(bitSet, m27753);
                            break;
                        case 6:
                        case 7:
                            abstractC13717 = m15651(bitSet, m27753);
                            if (!(abstractC13717 instanceof C22390) && !(abstractC13717 instanceof C4046)) {
                                throw new C23158("Unsupported ref constant type for MethodHandle " + abstractC13717.getClass(), null);
                            }
                            break;
                        case 9:
                            abstractC13717 = (C4046) m15651(bitSet, m27753);
                            break;
                        default:
                            throw new C23158("Unsupported MethodHandle kind: " + m277552, null);
                    }
                    switch (m277552) {
                        case 1:
                            i2 = 3;
                            break;
                        case 2:
                            i2 = 1;
                            break;
                        case 3:
                            i2 = 2;
                            break;
                        case 4:
                            i2 = 0;
                            break;
                        case 5:
                            i2 = 5;
                            break;
                        case 6:
                            i2 = 4;
                            break;
                        case 7:
                            i2 = 7;
                            break;
                        case 8:
                            i2 = 6;
                            break;
                        case 9:
                            i2 = 8;
                            break;
                        default:
                            throw new IllegalArgumentException(C19370.m44628(m277552, "invalid kind: "));
                    }
                    m8291 = C21685.m48963(i2, abstractC13717);
                    c10396.m26226(i, m8291);
                    return m8291;
                case 16:
                    m15650 = new C4751(C23095.m51254(((C13217) m15651(bitSet, c11186.m27753(i3 + 1))).getString()));
                    m8291 = m15650;
                    c10396.m26226(i, m8291);
                    return m8291;
                case 18:
                    m8291 = C18863.m43562(c11186.m27753(i3 + 1), (C20274) m15651(bitSet, c11186.m27753(i3 + 3)));
                    c10396.m26226(i, m8291);
                    return m8291;
            }
        } catch (C23158 e) {
            e.m21602("...while parsing cst " + C14712.m35006(i) + " at offset " + C14712.m35008(i3));
            throw e;
        } catch (RuntimeException e2) {
            C23158 c23158 = new C23158(null, e2);
            c23158.m21602("...while parsing cst " + C14712.m35006(i) + " at offset " + C14712.m35008(i3));
            throw c23158;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C13217 m15650(int i) {
        C11186 c11186 = this.f17082;
        int m27753 = c11186.m27753(i + 1);
        int i2 = i + 3;
        try {
            return new C13217(c11186.m27750(i2, m27753 + i2));
        } catch (IllegalArgumentException e) {
            throw new C23158(null, e);
        }
    }
}
