package l;

import android.graphics.RectF;

/* compiled from: EAJU */
/* renamed from: l.ܳ᩸ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14792 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f45162;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f45163;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final RectF f45164 = new RectF();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f45165;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f45166;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f45167;

    public C14792(int i) {
        this.f45165 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35175(float f, float f2, float f3, float f4) {
        m35176(this.f45165, f, f2, f3, f4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35176(int i, float f, float f2, float f3, float f4) {
        this.f45163 = f;
        this.f45166 = f2;
        this.f45167 = f3;
        this.f45162 = f4;
        float f5 = f3 - f;
        float f6 = f4 - f2;
        if (i == -1) {
            throw new IllegalStateException();
        }
        if (i == 0) {
            f4 += f6 * 2.5f;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        f -= f5 * 2.5f;
                    }
                    this.f45164.set(f, f2, f3, f4);
                }
                f3 += f5 * 2.5f;
                float f7 = f6 / 2.0f;
                f2 -= f7;
                f4 += f7;
                this.f45164.set(f, f2, f3, f4);
            }
            f2 -= f6 * 2.5f;
        }
        float f8 = f5 / 2.0f;
        f -= f8;
        f3 += f8;
        this.f45164.set(f, f2, f3, f4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35174() {
        this.f45162 = 0.0f;
        this.f45166 = 0.0f;
        this.f45167 = 0.0f;
        this.f45163 = 0.0f;
        this.f45164.setEmpty();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m35177(float f, float f2) {
        return this.f45164.contains(f, f2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m35178(float f, float f2) {
        return f >= this.f45163 && f <= this.f45167 && f2 >= this.f45166 && f2 <= this.f45162;
    }
}
