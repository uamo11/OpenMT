package l;

import com.google.android.material.motion.MotionUtils;

/* compiled from: P4QJ */
/* renamed from: l.۬ۙ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12877 extends AbstractC5116 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f38651;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f38652;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C11467 f38653;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C22755 f38654;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C13582 f38655;

    @Override // l.AbstractC5116
    /* renamed from: ֫ */
    public final int mo10104(int i) {
        return i + 12;
    }

    public C12877(C3454 c3454) {
        super(c3454);
        this.f38651 = 0;
        this.f38652 = null;
    }

    public C12877(C3454 c3454, C22755 c22755, C13582 c13582) {
        this(c3454);
        String m50834 = c22755.m50834();
        if (c13582 != null) {
            StringBuilder m15339 = C5368.m15339(m50834);
            StringBuilder sb = new StringBuilder();
            for (C22755 c227552 : c13582.f40520) {
                sb.append(c227552.m50834());
            }
            m15339.append(sb.toString());
            m50834 = m15339.toString();
        }
        this.f38653 = C11467.m28270(m50834, c3454);
        this.f38654 = c22755;
        this.f38655 = c13582;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12877 m31309(C3454 c3454, C22755 c22755, C13582 c13582) {
        return (C12877) c3454.f10931.m25237(new C12877(c3454, c22755, c13582));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12877 m31311(C3454 c3454) {
        C22755 m50831 = C22755.m50831(this.f38654.m50835(), c3454);
        C13582 c13582 = this.f38655;
        return (C12877) c3454.f10931.m25237(new C12877(c3454, m50831, c13582 != null ? c13582.m32666(c3454) : null));
    }

    @Override // l.AbstractC5116
    /* renamed from: ֫ */
    public final void mo10109(C10720 c10720, C12172 c12172) {
        C3454 c3454 = this.f16031;
        this.f38653 = (C11467) c3454.f10947.m1314(c10720.m26904());
        this.f38654 = (C22755) c3454.f10926.m1314(c10720.m26904());
        this.f38655 = (C13582) c12172.m29651(EnumC14993.TYPE_TYPE_LIST, c10720.m26904());
    }

    @Override // l.AbstractC5116
    /* renamed from: ֫ */
    public final void mo10108(C1547 c1547) {
        c1547.m5302(this.f38653.f16032);
        c1547.m5302(this.f38654.f16032);
        C13582 c13582 = this.f38655;
        c1547.m5302(c13582 == null ? 0 : c13582.f16030);
    }

    @Override // java.lang.Comparable
    /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C12877 c12877) {
        int compareTo = this.f38654.compareTo(c12877.f38654);
        if (compareTo != 0) {
            return compareTo;
        }
        C13582 c13582 = this.f38655;
        if (c13582 == null) {
            return c12877.f38655 == null ? 0 : -1;
        }
        C13582 c135822 = c12877.f38655;
        if (c135822 == null) {
            return 1;
        }
        return c13582.compareTo(c135822);
    }

    @Override // l.AbstractC5116
    /* renamed from: ֫ */
    public final String mo10106() {
        return "proto_id_item: " + m31312();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m31312() {
        if (this.f38652 == null) {
            StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
            C13582 c13582 = this.f38655;
            if (c13582 != null) {
                sb.append(c13582.m32665(""));
            }
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            sb.append(this.f38654.m50835());
            this.f38652 = sb.toString();
        }
        return this.f38652;
    }

    public final int hashCode() {
        if (this.f38651 == 0) {
            int hashCode = this.f38654.hashCode();
            this.f38651 = hashCode;
            int i = hashCode * 31;
            C13582 c13582 = this.f38655;
            this.f38651 = i + (c13582 == null ? 0 : c13582.hashCode());
        }
        return this.f38651;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12877.class.equals(obj.getClass())) {
            C12877 c12877 = (C12877) obj;
            if (this.f38654 == c12877.f38654 && this.f38655 == c12877.f38655) {
                return true;
            }
        }
        return false;
    }
}
