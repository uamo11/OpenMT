package l;

import java.io.Serializable;

/* compiled from: X4TD */
/* renamed from: l.ܰۤܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13758 implements InterfaceC18842, Serializable {
    public static final long serialVersionUID = 0;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C13758 f41050;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f41051 = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC3675 f41052;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC3675 f41053;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C13758 m33069() {
        return new C13758(new C8614(0), new C8614(0));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C13758 m33068(Comparable comparable) {
        C15668 c15668;
        c15668 = C15668.f48229;
        return new C13758(c15668, AbstractC3675.m11185(comparable));
    }

    @Override // l.InterfaceC18842
    @Deprecated
    public final boolean apply(Object obj) {
        return m33073((Comparable) obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13758 m33064(AbstractC3675 abstractC3675, AbstractC3675 abstractC36752) {
        return new C13758(abstractC3675, abstractC36752);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13758 m33067(Integer num, Integer num2) {
        return new C13758(AbstractC3675.m11186(num), new C2264(num2));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13758 m33066(Comparable comparable, EnumC3717 enumC3717) {
        C15668 c15668;
        int i = C11643.f34732[enumC3717.ordinal()];
        if (i == 1) {
            c15668 = C15668.f48229;
            return new C13758(c15668, AbstractC3675.m11186(comparable));
        }
        if (i == 2) {
            return m33068(comparable);
        }
        throw new AssertionError();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13758 m33065(Comparable comparable) {
        C9320 c9320;
        C2264 m11186 = AbstractC3675.m11186(comparable);
        c9320 = C9320.f28269;
        return new C13758(m11186, c9320);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13758 m33061(Comparable comparable, EnumC3717 enumC3717) {
        C9320 c9320;
        int i = C11643.f34732[enumC3717.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return m33065(comparable);
            }
            throw new AssertionError();
        }
        C8614 m11185 = AbstractC3675.m11185(comparable);
        c9320 = C9320.f28269;
        return new C13758(m11185, c9320);
    }

    static {
        C15668 c15668;
        C9320 c9320;
        c15668 = C15668.f48229;
        c9320 = C9320.f28269;
        f41050 = new C13758(c15668, c9320);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C13758 m33070() {
        return f41050;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13758 m33063(Integer num, Integer num2) {
        return new C13758(new C2264(num), new C8614(num2));
    }

    public C13758(AbstractC3675 abstractC3675, AbstractC3675 abstractC36752) {
        C9320 c9320;
        C15668 c15668;
        abstractC3675.getClass();
        this.f41052 = abstractC3675;
        abstractC36752.getClass();
        this.f41053 = abstractC36752;
        if (abstractC3675.compareTo(abstractC36752) <= 0) {
            c9320 = C9320.f28269;
            if (abstractC3675 != c9320) {
                c15668 = C15668.f48229;
                if (abstractC36752 != c15668) {
                    return;
                }
            }
        }
        StringBuilder sb = new StringBuilder("Invalid range: ");
        StringBuilder sb2 = new StringBuilder(16);
        abstractC3675.mo7488(sb2);
        sb2.append("..");
        abstractC36752.mo7491(sb2);
        sb.append(sb2.toString());
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Comparable m33075() {
        return this.f41052.mo11188();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Comparable m33077() {
        return this.f41053.mo11188();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33072() {
        return this.f41052.equals(this.f41053);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33074(C13758 c13758) {
        return this.f41052.compareTo(c13758.f41052) <= 0 && this.f41053.compareTo(c13758.f41053) >= 0;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m33078(C13758 c13758) {
        return this.f41052.compareTo(c13758.f41053) <= 0 && c13758.f41052.compareTo(this.f41053) <= 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13758 m33076(C13758 c13758) {
        AbstractC3675 abstractC3675 = c13758.f41052;
        AbstractC3675 abstractC36752 = this.f41052;
        int compareTo = abstractC36752.compareTo(abstractC3675);
        AbstractC3675 abstractC36753 = c13758.f41053;
        AbstractC3675 abstractC36754 = this.f41053;
        int compareTo2 = abstractC36754.compareTo(abstractC36753);
        if (compareTo >= 0 && compareTo2 <= 0) {
            return this;
        }
        if (compareTo <= 0 && compareTo2 >= 0) {
            return c13758;
        }
        if (compareTo < 0) {
            abstractC36752 = c13758.f41052;
        }
        if (compareTo2 <= 0) {
            abstractC36753 = abstractC36754;
        }
        C4025.m12111(abstractC36752.compareTo(abstractC36753) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, c13758);
        return new C13758(abstractC36752, abstractC36753);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13758 m33079(C13758 c13758) {
        AbstractC3675 abstractC3675 = c13758.f41052;
        AbstractC3675 abstractC36752 = this.f41052;
        int compareTo = abstractC36752.compareTo(abstractC3675);
        AbstractC3675 abstractC36753 = c13758.f41053;
        AbstractC3675 abstractC36754 = this.f41053;
        int compareTo2 = abstractC36754.compareTo(abstractC36753);
        if (compareTo <= 0 && compareTo2 >= 0) {
            return this;
        }
        if (compareTo >= 0 && compareTo2 <= 0) {
            return c13758;
        }
        if (compareTo > 0) {
            abstractC36752 = c13758.f41052;
        }
        if (compareTo2 >= 0) {
            abstractC36753 = abstractC36754;
        }
        return new C13758(abstractC36752, abstractC36753);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13758) {
            C13758 c13758 = (C13758) obj;
            if (this.f41052.equals(c13758.f41052) && this.f41053.equals(c13758.f41053)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f41052.hashCode() * 31) + this.f41053.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.f41052.mo7488(sb);
        sb.append("..");
        this.f41053.mo7491(sb);
        return sb.toString();
    }

    public Object readResolve() {
        C13758 c13758 = f41050;
        return equals(c13758) ? c13758 : this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13758 m33062(Comparable comparable, EnumC3717 enumC3717, Comparable comparable2, EnumC3717 enumC37172) {
        enumC3717.getClass();
        enumC37172.getClass();
        EnumC3717 enumC37173 = EnumC3717.OPEN;
        return new C13758(enumC3717 == enumC37173 ? AbstractC3675.m11185(comparable) : AbstractC3675.m11186(comparable), enumC37172 == enumC37173 ? AbstractC3675.m11186(comparable2) : AbstractC3675.m11185(comparable2));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13758 m33071(AbstractC19198 abstractC19198) {
        abstractC19198.getClass();
        AbstractC3675 abstractC3675 = this.f41052;
        AbstractC3675 mo11189 = abstractC3675.mo11189(abstractC19198);
        AbstractC3675 abstractC36752 = this.f41053;
        AbstractC3675 mo111892 = abstractC36752.mo11189(abstractC19198);
        return (mo11189 == abstractC3675 && mo111892 == abstractC36752) ? this : new C13758(mo11189, mo111892);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33073(Comparable comparable) {
        comparable.getClass();
        return this.f41052.mo7489(comparable) && !this.f41053.mo7489(comparable);
    }
}
