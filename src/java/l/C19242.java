package l;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: L9CC */
/* renamed from: l.᩵ۙܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19242 extends Animation {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f60559;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f60560;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3013 f60561;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f60562;

    public C19242(C3013 c3013, int i, int i2, float f) {
        this.f60561 = c3013;
        this.f60559 = i;
        this.f60562 = i2;
        this.f60560 = f;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        ViewGroup viewGroup;
        boolean z;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        int i = this.f60559;
        int i2 = this.f60562;
        int i3 = (int) (f * (i - i2));
        C3013 c3013 = this.f60561;
        viewGroup = c3013.f9524;
        C3013.m9195(viewGroup, i3 + i2);
        z = c3013.f9495;
        if (z) {
            viewGroup2 = c3013.f9524;
            viewGroup3 = c3013.f9524;
            viewGroup2.setY(this.f60560 - (viewGroup3.getHeight() - i2));
            C3013.m9222(c3013);
        }
    }
}
