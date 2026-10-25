package l;

/* compiled from: S6MQ */
/* renamed from: l.᩵ܰۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19501 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f63022;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f63023;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f63024;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f63025;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44915(int i, float f, long j) {
        this.f63022 = i;
        this.f63023 = j;
        this.f63025 = Math.abs(f);
        this.f63024 = -1.0f;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m44914(int i, int i2, float f, float f2, float f3, long j) {
        if (f == f2) {
            return f;
        }
        int round = Math.round(f);
        int round2 = Math.round(f2);
        if (this.f63024 < 0.0f) {
            if (i2 < round || i2 > round2 || i < round || i > round2) {
                float f4 = this.f63025;
                this.f63024 = f4 / ((f3 * 1000.0f) + f4);
            } else {
                if (j > this.f63023) {
                    this.f63025 = (float) Math.abs(((i - this.f63022) * 1000.0d) / (j - r2));
                    this.f63022 = i;
                    this.f63023 = j;
                }
            }
        }
        int max = Math.max(round, Math.min(round2, i));
        return Math.max(f, Math.min(f2, max)) + ((float) ((i - max) * Math.max(0.0f, this.f63024)));
    }
}
