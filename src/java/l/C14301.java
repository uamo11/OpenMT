package l;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageButton;

/* compiled from: L9CC */
/* renamed from: l.ܳۙܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14301 extends Animation {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43121;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f43122;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3013 f43123;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f43124;

    public C14301(C3013 c3013, float f, float f2, int i) {
        this.f43123 = c3013;
        this.f43124 = f;
        this.f43122 = f2;
        this.f43121 = i;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        boolean m9214;
        ViewGroup viewGroup;
        float width;
        ImageButton imageButton;
        float f2 = this.f43124;
        float m46695 = C20382.m46695(this.f43122, f2, f, f2);
        C3013 c3013 = this.f43123;
        m9214 = c3013.m9214();
        if (m9214) {
            width = 0.0f;
        } else {
            viewGroup = c3013.f9524;
            width = viewGroup.getWidth() - this.f43121;
        }
        imageButton = c3013.f9512;
        imageButton.setX(m46695 + width);
    }
}
