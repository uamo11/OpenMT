package l;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.widget.ImageView;

/* compiled from: T5PO */
/* renamed from: l.ۘۙ۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class RunnableC3712 implements Runnable {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC18529 f11709;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7945 f11710;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f11711;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f11712;

    public RunnableC3712(Context context, ViewOnTouchListenerC18529 viewOnTouchListenerC18529) {
        this.f11709 = viewOnTouchListenerC18529;
        this.f11710 = new C7945(context);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11296() {
        this.f11710.m21246();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11297(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        RectF m43067 = this.f11709.m43067();
        if (m43067 == null) {
            return;
        }
        int round = Math.round(-m43067.left);
        float f = i;
        if (f < m43067.width()) {
            i6 = Math.round(m43067.width() - f);
            i5 = 0;
        } else {
            i5 = round;
            i6 = i5;
        }
        int round2 = Math.round(-m43067.top);
        float f2 = i2;
        if (f2 < m43067.height()) {
            i8 = Math.round(m43067.height() - f2);
            i7 = 0;
        } else {
            i7 = round2;
            i8 = i7;
        }
        this.f11711 = round;
        this.f11712 = round2;
        if (round == i6 && round2 == i8) {
            return;
        }
        this.f11710.m21244(round, round2, i3, i4, i5, i6, i7, i8);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnTouchListenerC18529 viewOnTouchListenerC18529;
        ImageView m43073;
        Matrix matrix;
        C7945 c7945 = this.f11710;
        if (c7945.m21248() || (m43073 = (viewOnTouchListenerC18529 = this.f11709).m43073()) == null || !c7945.m21245()) {
            return;
        }
        int m21247 = c7945.m21247();
        int m21249 = c7945.m21249();
        matrix = viewOnTouchListenerC18529.f57412;
        matrix.postTranslate(this.f11711 - m21247, this.f11712 - m21249);
        viewOnTouchListenerC18529.m43059(viewOnTouchListenerC18529.m43070());
        this.f11711 = m21247;
        this.f11712 = m21249;
        m43073.postOnAnimation(this);
    }
}
