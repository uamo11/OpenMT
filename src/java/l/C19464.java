package l;

/* compiled from: R68J */
/* renamed from: l.᩵۫ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19464 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3432 f62936 = new C3432();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5549 f62937 = new C5549();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11435 m44865(AbstractC3255 abstractC3255) {
        return m44862(abstractC3255, 4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11435 m44863(AbstractC3255 abstractC3255) {
        return m44862(abstractC3255, 8);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C11435 m44862(AbstractC3255 abstractC3255, int i) {
        C3941 c3941;
        C11435 c11435;
        C3432 c3432 = this.f62936;
        int m10495 = c3432.m10495(abstractC3255);
        if (m10495 >= 0 && (c3941 = (C3941) c3432.m10498(m10495)) != null) {
            int i2 = c3941.f12559;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c3941.f12559 = i3;
                if (i == 4) {
                    c11435 = c3941.f12561;
                } else if (i == 8) {
                    c11435 = c3941.f12560;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    c3432.m10500(m10495);
                    c3941.f12559 = 0;
                    c3941.f12561 = null;
                    c3941.f12560 = null;
                    C3941.f12558.mo16807(c3941);
                }
                return c11435;
            }
        }
        return null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m44866(AbstractC3255 abstractC3255) {
        C3941 c3941 = (C3941) this.f62936.getOrDefault(abstractC3255, null);
        if (c3941 == null) {
            return;
        }
        c3941.f12559 &= -2;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m44867(AbstractC3255 abstractC3255) {
        C5549 c5549 = this.f62937;
        int m15699 = c5549.m15699();
        while (true) {
            m15699--;
            if (m15699 < 0) {
                break;
            } else if (abstractC3255 == c5549.m15701(m15699)) {
                c5549.m15700(m15699);
                break;
            }
        }
        C3941 c3941 = (C3941) this.f62936.remove(abstractC3255);
        if (c3941 != null) {
            c3941.f12559 = 0;
            c3941.f12561 = null;
            c3941.f12560 = null;
            C3941.f12558.mo16807(c3941);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44864(AbstractC3255 abstractC3255, C11435 c11435) {
        C3432 c3432 = this.f62936;
        C3941 c3941 = (C3941) c3432.getOrDefault(abstractC3255, null);
        if (c3941 == null) {
            c3941 = C3941.m11993();
            c3432.put(abstractC3255, c3941);
        }
        c3941.f12560 = c11435;
        c3941.f12559 |= 8;
    }
}
