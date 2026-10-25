package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: 85MM */
/* renamed from: l.ܶۤۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15167 extends Animation {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46333;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12346 f46334;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46335;

    public C15167(C12346 c12346, int i, int i2) {
        this.f46334 = c12346;
        this.f46333 = i;
        this.f46335 = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.f46334.f36969.setAlpha((int) (((this.f46335 - r0) * f) + this.f46333));
    }
}
