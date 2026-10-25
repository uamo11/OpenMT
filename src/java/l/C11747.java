package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.j0.a;
import com.google.android.material.motion.MotionUtils;

/* compiled from: C60Q */
/* renamed from: l.ۨܰᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11747 implements Cloneable {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f35061;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f35062;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f35063;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f35064;

    public C11747() {
    }

    public C11747(int i, int i2, int i3) {
        m28751(i, i2, i3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28751(int i, int i2, int i3) {
        this.f35062 = i;
        this.f35063 = i2;
        this.f35064 = i3;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m28755() {
        return this.f35061;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28753(boolean z) {
        this.f35061 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28752(C7744 c7744) {
        int i = this.f35062;
        int i2 = this.f35063;
        int i3 = i2 - i;
        boolean z = false;
        if (i3 > 300000) {
            if (i3 <= 350000) {
                int i4 = 0;
                while (i < i2) {
                    char charAt = c7744.charAt(i);
                    if (charAt <= 127 || ((19968 <= charAt && charAt <= 40869) || C13835.m33198(charAt) || (i4 = i4 + 1) <= 75000)) {
                        i++;
                    }
                }
            }
            z = true;
            break;
        }
        this.f35061 = z;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m28754() {
        return this.f35061 && this.f35063 - this.f35062 > 300000;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m28750() {
        return m28754() ? this.f35062 + a.a : this.f35063;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m28749(CharSequence charSequence, C9584 c9584) {
        if (!m28754()) {
            return c9584.m24487(charSequence, this.f35062, this.f35063, 0.0f);
        }
        String m14327 = C4925.m14327(R.string.MT_Protector_res_0x7f1202e7);
        int i = this.f35062;
        return c9584.f29058.measureText(m14327) + c9584.m24487(charSequence, i, a.a + i, 0.0f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Line(");
        sb.append(this.f35062);
        sb.append(", ");
        sb.append(this.f35063);
        sb.append(", ");
        return C3200.m9831(this.f35064, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }

    public final C11747 clone() {
        try {
            return (C11747) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
