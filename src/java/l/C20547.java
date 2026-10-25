package l;

import android.graphics.Canvas;

/* compiled from: TB7B */
/* renamed from: l.᩷֨ܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C20547 extends AbstractC2202 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18430 f66195;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f66196;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f66197;

    @Override // l.AbstractC2202
    /* renamed from: ֫ */
    public void mo7287(String str) {
        boolean m42893;
        C8552 c8552;
        C8552 c85522;
        C8552 c85523;
        Canvas canvas;
        C8552 c85524;
        Canvas canvas2;
        C8552 c85525;
        C18430 c18430 = this.f66195;
        m42893 = c18430.m42893();
        if (m42893) {
            c85522 = c18430.f57191;
            if (c85522.f26150) {
                canvas2 = c18430.f57197;
                float f = this.f66196;
                float f2 = this.f66197;
                c85525 = c18430.f57191;
                canvas2.drawText(str, f, f2, c85525.f26148);
            }
            c85523 = c18430.f57191;
            if (c85523.f26152) {
                canvas = c18430.f57197;
                float f3 = this.f66196;
                float f4 = this.f66197;
                c85524 = c18430.f57191;
                canvas.drawText(str, f3, f4, c85524.f26153);
            }
        }
        float f5 = this.f66196;
        c8552 = c18430.f57191;
        this.f66196 = c8552.f26148.measureText(str) + f5;
    }

    public C20547(C18430 c18430, float f, float f2) {
        this.f66195 = c18430;
        this.f66196 = f;
        this.f66197 = f2;
    }
}
