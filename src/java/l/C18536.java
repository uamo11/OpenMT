package l;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: L9CC */
/* renamed from: l.ᩴۙܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18536 extends Animation {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f57444;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f57445;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f57446;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3013 f57447;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f57448;

    public C18536(C3013 c3013, int i, int i2, float f, float f2) {
        this.f57447 = c3013;
        this.f57444 = i;
        this.f57445 = i2;
        this.f57448 = f;
        this.f57446 = f2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        ViewGroup viewGroup;
        boolean m9214;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        C19947 c19947;
        ViewGroup viewGroup6;
        ViewGroup viewGroup7;
        ViewGroup viewGroup8;
        C19947 c199472;
        int i = this.f57444;
        int i2 = this.f57445;
        C3013 c3013 = this.f57447;
        viewGroup = c3013.f9524;
        C3013.m9212(viewGroup, ((int) (f * (i - i2))) + i2);
        m9214 = c3013.m9214();
        if (m9214) {
            viewGroup7 = c3013.f9524;
            viewGroup7.setX(this.f57448);
            viewGroup8 = c3013.f9498;
            viewGroup8.setX(0.0f);
            c199472 = c3013.f9499;
            c199472.setX(0.0f);
            return;
        }
        viewGroup2 = c3013.f9524;
        viewGroup3 = c3013.f9524;
        viewGroup2.setX(this.f57446 - viewGroup3.getWidth());
        viewGroup4 = c3013.f9498;
        viewGroup5 = c3013.f9524;
        viewGroup4.setX(viewGroup5.getWidth() - i2);
        c19947 = c3013.f9499;
        viewGroup6 = c3013.f9524;
        c19947.setX(viewGroup6.getWidth() - i);
    }
}
