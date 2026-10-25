package l;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: L9CC */
/* renamed from: l.֨ۙܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0896 extends Animation {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3468;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3469;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3013 f3470;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f3471;

    public C0896(C3013 c3013, int i, int i2, float f) {
        this.f3470 = c3013;
        this.f3468 = i;
        this.f3469 = i2;
        this.f3471 = f;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        ViewGroup viewGroup;
        boolean z;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        int i = this.f3468;
        int i2 = this.f3469;
        int i3 = (int) (f * (i - i2));
        C3013 c3013 = this.f3470;
        viewGroup = c3013.f9524;
        C3013.m9195(viewGroup, i2 + i3);
        z = c3013.f9495;
        if (z) {
            viewGroup2 = c3013.f9524;
            viewGroup3 = c3013.f9524;
            viewGroup2.setY(this.f3471 - viewGroup3.getHeight());
            C3013.m9222(c3013);
        }
    }
}
