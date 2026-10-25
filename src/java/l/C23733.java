package l;

import android.graphics.RectF;

/* compiled from: G6MJ */
/* renamed from: l.᩻ܰۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23733 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f76844;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final RectF f76845;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f76846;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f76847;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final RectF f76848;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f76849;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float f76850;

    public C23733(long j, long j2, int i, int i2, int i3, int i4) {
        this.f76849 = i3;
        this.f76844 = j;
        this.f76846 = j2;
        this.f76847 = i4;
        float scalb = Math.scalb(1.0f, i3);
        this.f76850 = scalb;
        double d = i4;
        double d2 = j * d;
        double d3 = j2 * d;
        double d4 = scalb;
        double d5 = i;
        double d6 = d2 + d;
        float min = (float) Math.min(d5, d6 / d4);
        double d7 = i2;
        double d8 = d + d3;
        this.f76845 = new RectF((float) (d2 / d4), (float) (d3 / d4), min, (float) Math.min(d7, d8 / d4));
        this.f76848 = new RectF((float) Math.max(0.0d, (d2 - 1.0d) / d4), (float) Math.max(0.0d, (d3 - 1.0d) / d4), (float) Math.min(d5, (d6 + 1.0d) / d4), (float) Math.min(d7, (d8 + 1.0d) / d4));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23733)) {
            return false;
        }
        C23733 c23733 = (C23733) obj;
        return this.f76849 == c23733.f76849 && this.f76847 == c23733.f76847 && this.f76844 == c23733.f76844 && this.f76846 == c23733.f76846;
    }

    public final int hashCode() {
        int i = ((this.f76849 * 31) + this.f76847) * 31;
        long j = this.f76844;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f76846;
        return i2 + ((int) (j2 ^ (j2 >>> 32)));
    }
}
