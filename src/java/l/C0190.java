package l;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageButton;

/* compiled from: L9CC */
/* renamed from: l.֡ۙܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0190 extends Animation {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1419;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f1420;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3013 f1421;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f1422;

    public C0190(C3013 c3013, float f, float f2, int i) {
        this.f1421 = c3013;
        this.f1422 = f;
        this.f1420 = f2;
        this.f1419 = i;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        boolean m9214;
        ViewGroup viewGroup;
        float width;
        ImageButton imageButton;
        float f2 = this.f1422;
        float m46695 = C20382.m46695(this.f1420, f2, f, f2);
        C3013 c3013 = this.f1421;
        m9214 = c3013.m9214();
        if (m9214) {
            width = 0.0f;
        } else {
            viewGroup = c3013.f9524;
            width = viewGroup.getWidth() - this.f1419;
        }
        imageButton = c3013.f9512;
        imageButton.setX(m46695 + width);
    }
}
