package l;

import java.util.function.Supplier;

/* compiled from: L7ER */
/* renamed from: l.᩵۟ۚ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19316 implements InterfaceC1800 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5868 f60734;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C5868 f60735;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C5868 f60736;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f60739;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3917 f60741;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f60737 = 0;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f60738 = -1;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f60733 = -1;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC23006 f60740 = EnumC23006.UNKNOWN_TYPE;

    public C19316(C3917 c3917, boolean z) {
        this.f60741 = c3917;
        this.f60739 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44509(C19316 c19316) {
        this.f60733 = c19316 == null ? this.f60738 : (this.f60738 - c19316.f60738) - 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44506(int i) {
        this.f60733 = i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44510(int i) {
        this.f60738 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44508(String str) {
        C11003.requireNonNull(str, new Supplier() { // from class: l.ܺ۟ۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                Object[] objArr = {"String stackFrameType"};
                ((C5080) C19316.this.f60741.m45770()).getClass();
                return AbstractC13546.m32594("Fatal Error: Object reference \"{0}\" is null", objArr);
            }
        });
        EnumC23006 m51148 = EnumC23006.m51148(str);
        this.f60740 = m51148;
        if (m51148 == EnumC23006.UNKNOWN_TYPE) {
            this.f60741.mo9065(this.f60737, "Unknown entry type \"{0}\" of the StackMapTable", str);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m44512(int i) {
        EnumC23006 m51150 = EnumC23006.m51150(i);
        this.f60740 = m51150;
        if (m51150 == EnumC23006.SAME_FRAME) {
            this.f60733 = i;
            return;
        }
        EnumC23006 enumC23006 = EnumC23006.SAME_LOCALS_1_STACK_ITEM_FRAME;
        if (m51150 == enumC23006) {
            this.f60733 = i - enumC23006.m51152();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44507(long j) {
        this.f60737 = j;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m44514() {
        return this.f60739 ? this.f60740 != EnumC23006.UNKNOWN_TYPE : this.f60738 != -1;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m44513() {
        return this.f60739 && this.f60740 == EnumC23006.EARLY_LARVAL;
    }

    @Override // l.InterfaceC1800
    /* renamed from: ۧ */
    public final boolean mo2829() {
        return !m44513();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC15204 m44505() {
        switch (C2382.f7587[this.f60740.ordinal()]) {
            case 2:
                if (m44504(this.f60736)) {
                    return null;
                }
                return EnumC15204.f46505;
            case 3:
                if (m44504(this.f60735)) {
                    return null;
                }
                return EnumC15204.f46477;
            case 4:
                if (this.f60733 == -1) {
                    return EnumC15204.f46506;
                }
                if (m44504(this.f60736)) {
                    return null;
                }
                return EnumC15204.f46505;
            case 5:
            case 6:
            case 7:
            case 8:
                if (this.f60733 == -1) {
                    return EnumC15204.f46506;
                }
                return null;
            case 9:
                if (this.f60733 == -1) {
                    return EnumC15204.f46506;
                }
                if (m44504(this.f60734)) {
                    return null;
                }
                return EnumC15204.f46595;
            case 10:
                if (this.f60733 == -1) {
                    return EnumC15204.f46506;
                }
                if (!m44504(this.f60734)) {
                    return EnumC15204.f46595;
                }
                if (m44504(this.f60736)) {
                    return null;
                }
                return EnumC15204.f46505;
            default:
                return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m44504(C5868... c5868Arr) {
        for (C5868 c5868 : c5868Arr) {
            if (c5868 == null) {
                return false;
            }
        }
        return true;
    }

    @Override // l.InterfaceC1800
    public final int getLength() {
        int m16431;
        int m164312;
        boolean m44514 = m44514();
        boolean z = this.f60739;
        if (!m44514 || !z) {
            this.f60740 = EnumC23006.FULL_FRAME;
        }
        int i = 0;
        switch (C2382.f7587[this.f60740.ordinal()]) {
            case 2:
                m16431 = this.f60736.m16431() - 2;
                return m16431 + (z ? 1 : 0);
            case 3:
                C5868 c5868 = this.f60735;
                if (c5868 != null) {
                    m164312 = c5868.m16431();
                    i = m164312 - 2;
                }
                return i + 2 + (z ? 1 : 0);
            case 4:
                m16431 = this.f60736.m16431();
                return m16431 + (z ? 1 : 0);
            case 5:
            case 6:
            case 7:
            case 8:
                return (z ? 1 : 0) + 2;
            case 9:
                C5868 c58682 = this.f60734;
                if (c58682 != null) {
                    m164312 = c58682.m16431();
                    i = m164312 - 2;
                }
                return i + 2 + (z ? 1 : 0);
            case 10:
                int i2 = (z ? 1 : 0) + 2;
                C5868 c58683 = this.f60734;
                int m164313 = i2 + (c58683 == null ? 2 : c58683.m16431());
                C5868 c58684 = this.f60736;
                return m164313 + (c58684 != null ? c58684.m16431() : 2);
            default:
                return z ? 1 : 0;
        }
    }

    @Override // l.InterfaceC1800
    /* renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) {
        boolean z;
        boolean z2 = this.f60739;
        if (!z2) {
            this.f60740 = EnumC23006.FULL_FRAME;
        }
        int i = C2382.f7587[this.f60740.ordinal()];
        boolean z3 = true;
        C3917 c3917 = this.f60741;
        switch (i) {
            case 1:
                if (!EnumC23006.SAME_FRAME.m51153(this.f60733)) {
                    c3917.mo9065(this.f60737, "Offset value {0} is not valid  for the \"{1}\" entry type", Integer.valueOf(this.f60733), this.f60740.m51157());
                    break;
                } else {
                    ((C6053) interfaceC0408).m16882(this.f60733);
                    break;
                }
            case 2:
                C5868 c5868 = this.f60736;
                if (c5868 == null) {
                    c3917.mo9065(this.f60737, "Stack map element for the \"{0}\" entry type is absent", this.f60740.m51157());
                    break;
                } else if (c5868.f18006.size() != 1) {
                    c3917.mo9065(this.f60737, "Should be only one stack map element for the \"{0}\" entry type", this.f60740.m51157());
                    break;
                } else {
                    int i2 = this.f60733;
                    if (i2 >= 64) {
                        c3917.mo9065(this.f60737, "Offset value {0} is not valid  for the \"{1}\" entry type", Integer.valueOf(i2), this.f60740.m51157());
                        break;
                    } else {
                        C6053 c6053 = (C6053) interfaceC0408;
                        c6053.m16882(this.f60740.m51152() + this.f60733);
                        this.f60736.m16432(c6053);
                        break;
                    }
                }
            case 3:
                C6053 c60532 = (C6053) interfaceC0408;
                c60532.m16882(this.f60740.m51152());
                C5868 c58682 = this.f60735;
                if (c58682 == null) {
                    c60532.m16889(0);
                    break;
                } else {
                    c58682.m16429(c60532);
                    break;
                }
            case 4:
                C5868 c58683 = this.f60736;
                if (c58683 == null) {
                    c3917.mo9065(this.f60737, "Locals map element for the \"{0}\" entry type is absent", this.f60740.m51157());
                    break;
                } else if (c58683.f18006.size() != 1) {
                    c3917.mo9065(this.f60737, "Should be only one stack map element for the \"{0}\" entry type", this.f60740.m51157());
                    break;
                } else {
                    C6053 c60533 = (C6053) interfaceC0408;
                    c60533.m16882(this.f60740.m51152());
                    c60533.m16889(this.f60733);
                    this.f60736.m16432(c60533);
                    break;
                }
            case 5:
            case 6:
            case 7:
            case 8:
                if (this.f60736 != null) {
                    c3917.mo9065(this.f60737, "There are unexpected stack maps for the \"{0}\" entry type", this.f60740.m51157());
                    z = true;
                } else {
                    z = false;
                }
                if (this.f60734 != null) {
                    c3917.mo9065(this.f60737, "There are unexpected locals maps for the \"{0}\" entry type", this.f60740.m51157());
                } else {
                    z3 = z;
                }
                if (!z3) {
                    C6053 c60534 = (C6053) interfaceC0408;
                    c60534.m16882(this.f60740.m51152());
                    c60534.m16889(this.f60733);
                    break;
                }
                break;
            case 9:
                C5868 c58684 = this.f60734;
                if (c58684 == null) {
                    c3917.mo9065(this.f60737, "Locals map element for the \"{0}\" entry type is absent", this.f60740.m51157());
                    break;
                } else if (c58684.f18006.size() > 3) {
                    c3917.mo9065(this.f60737, "There are more than locals map elements for the \"append_frame\" entry type", new Object[0]);
                    break;
                } else {
                    C6053 c60535 = (C6053) interfaceC0408;
                    c60535.m16882((this.f60734.f18006.size() + this.f60740.m51152()) - 1);
                    c60535.m16889(this.f60733);
                    this.f60734.m16432(c60535);
                    break;
                }
            case 10:
                if (z2) {
                    C6053 c60536 = (C6053) interfaceC0408;
                    c60536.m16882(this.f60740.m51152());
                    c60536.m16889(this.f60733);
                } else {
                    ((C6053) interfaceC0408).m16889(this.f60738);
                }
                C5868 c58685 = this.f60734;
                if (c58685 == null) {
                    ((C6053) interfaceC0408).m16889(0);
                } else {
                    c58685.m16429(interfaceC0408);
                }
                C5868 c58686 = this.f60736;
                if (c58686 == null) {
                    ((C6053) interfaceC0408).m16889(0);
                    break;
                } else {
                    c58686.m16429(interfaceC0408);
                    break;
                }
            default:
                c3917.mo9065(this.f60737, "StackMap entry type is not set", Integer.valueOf(this.f60740.m51152()));
                break;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC23006 m44511() {
        return this.f60740;
    }
}
