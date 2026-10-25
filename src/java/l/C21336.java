package l;

import java.util.BitSet;

/* compiled from: EBE1 */
/* renamed from: l.᩸ۘܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21336 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f68759;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f68760;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f68761;

    public C21336(C13739 c13739, C23650 c23650, InterfaceC9436 interfaceC9436) {
        this.f68761 = c13739;
        this.f68759 = c23650;
        this.f68760 = interfaceC9436;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C13739 m48371() {
        return (C13739) this.f68761;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC8730 m48370() {
        return (C23650) this.f68759;
    }

    public C21336(C13012 c13012) {
        this.f68761 = c13012;
        C17246 m31591 = c13012.m31591();
        this.f68759 = m31591;
        this.f68760 = m31591.m40534();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC9436 m48369() {
        return (InterfaceC9436) this.f68760;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C13012 m48372() {
        int i;
        int i2;
        C13012 c13012 = (C13012) this.f68761;
        C17246 c17246 = (C17246) this.f68760;
        C17246 c172462 = (C17246) this.f68759;
        int size = c172462.size();
        BitSet bitSet = new BitSet(c172462.m38023());
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= size) {
                break;
            }
            C16540 m41002get = c172462.m41002get(i3);
            if (!bitSet.get(m41002get.mo2269())) {
                C21064 m31592 = c13012.m31592(m41002get.mo2269());
                int size2 = m31592.size();
                int i5 = 0;
                while (i5 < size2) {
                    int i6 = m31592.get(i5);
                    C16540 m40535 = c172462.m40535(i6);
                    if (!bitSet.get(i6) && m40535.m38911().size() <= i4 && m40535.m38914().m37484().m9562() != 55) {
                        C21064 c21064 = new C21064();
                        int i7 = i5 + 1;
                        while (i7 < size2) {
                            int i8 = m31592.get(i7);
                            C16540 m405352 = c172462.m40535(i8);
                            if (m405352.m38911().size() == i4 && m40535.m38916().m7867(m405352.m38916())) {
                                c21064.add(i8);
                                bitSet.set(i8);
                            }
                            i7++;
                            i4 = 1;
                        }
                        int size3 = c21064.size();
                        int i9 = 0;
                        while (i9 < size3) {
                            int i10 = c21064.get(i9);
                            C21064 m315922 = c13012.m31592(c172462.m40535(i10).mo2269());
                            int size4 = m315922.size();
                            int i11 = size3;
                            int i12 = 0;
                            while (i12 < size4) {
                                C17246 c172463 = c172462;
                                C16540 m405353 = c17246.m40535(m315922.get(i12));
                                C21064 c210642 = m31592;
                                C21064 m47913 = m405353.m38911().m47913();
                                int m47912 = m47913.m47912(i10);
                                if (m47912 >= 0) {
                                    i = size2;
                                    i2 = m47912;
                                } else {
                                    i = size2;
                                    i2 = -1;
                                }
                                m47913.set(i2, i6);
                                int m38913 = m405353.m38913();
                                if (m38913 == i10) {
                                    m38913 = i6;
                                }
                                m47913.mo20349();
                                c17246.m40531(c17246.m38027(m405353.mo2269()), new C16540(m405353.mo2269(), m405353.m38916(), m47913, m38913));
                                i12++;
                                c172462 = c172463;
                                i6 = i6;
                                m31592 = c210642;
                                size2 = i;
                                i10 = i10;
                                c21064 = c21064;
                            }
                            i9++;
                            size3 = i11;
                        }
                    }
                    i5++;
                    i4 = 1;
                    c172462 = c172462;
                    m31592 = m31592;
                    size2 = size2;
                }
            }
            i3++;
            c172462 = c172462;
        }
        while (true) {
            size--;
            if (size >= 0) {
                if (bitSet.get(c17246.m41002get(size).mo2269())) {
                    c17246.m40531(size, (C16540) null);
                }
            } else {
                c17246.mo38026();
                c17246.mo20349();
                return new C13012(c17246, c13012.m31593());
            }
        }
    }
}
