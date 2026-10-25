package l;

import android.view.View;

/* compiled from: 47G1 */
/* renamed from: l.֡ۡۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0308 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f1674;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f1675;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f1676;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f1677 = -1;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f1678;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object f1679;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f1680;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f1681;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f1682;

    public C0308(int i, int i2) {
        this.f1680 = i;
        this.f1675 = i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1720(View view, int i, float f, float f2, boolean z) {
        m1719();
        if (!z || view == null) {
            return;
        }
        this.f1679 = view;
        this.f1677 = i;
        this.f1674 = f;
        this.f1676 = f2;
        this.f1682 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC19360 m1718(View view, float f, float f2, int i) {
        if (!this.f1682 || this.f1681) {
            return EnumC19360.NONE;
        }
        if (view == null || view != this.f1679 || i != this.f1677) {
            m1719();
            return EnumC19360.NONE;
        }
        float f3 = f - this.f1674;
        float f4 = f2 - this.f1676;
        float abs = Math.abs(f3);
        float abs2 = Math.abs(f4);
        int i2 = this.f1680;
        if (f3 < 0.0f && abs > i2 && abs > abs2) {
            m1719();
            return EnumC19360.NONE;
        }
        float f5 = i2;
        if (abs2 > f5 && abs2 > abs) {
            m1719();
            return EnumC19360.NONE;
        }
        boolean z = f3 > f5 && f3 > abs2;
        if (f3 >= this.f1675 && f3 > abs2) {
            this.f1678 = true;
            this.f1681 = true;
            return EnumC19360.TRIGGER_LONG_CLICK;
        }
        if (z && !this.f1678) {
            this.f1678 = true;
            return EnumC19360.REQUEST_DISALLOW_INTERCEPT;
        }
        return EnumC19360.NONE;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1719() {
        this.f1679 = null;
        this.f1677 = -1;
        this.f1674 = 0.0f;
        this.f1676 = 0.0f;
        this.f1682 = false;
        this.f1678 = false;
        this.f1681 = false;
    }
}
