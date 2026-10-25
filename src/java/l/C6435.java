package l;

import android.graphics.Canvas;
import android.graphics.Path;

/* compiled from: TB7B */
/* renamed from: l.ۜ֨ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6435 extends C20547 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18430 f19903;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Path f19904;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6435(C18430 c18430, Path path, float f) {
        super(c18430, f, 0.0f);
        this.f19903 = c18430;
        this.f19904 = path;
    }

    @Override // l.C20547, l.AbstractC2202
    /* renamed from: ֫ */
    public final void mo7287(String str) {
        boolean m42893;
        C8552 c8552;
        C8552 c85522;
        C8552 c85523;
        Canvas canvas;
        C8552 c85524;
        Canvas canvas2;
        C8552 c85525;
        C18430 c18430 = this.f19903;
        m42893 = c18430.m42893();
        if (m42893) {
            c85522 = c18430.f57191;
            if (c85522.f26150) {
                canvas2 = c18430.f57197;
                float f = this.f66196;
                float f2 = this.f66197;
                c85525 = c18430.f57191;
                canvas2.drawTextOnPath(str, this.f19904, f, f2, c85525.f26148);
            }
            c85523 = c18430.f57191;
            if (c85523.f26152) {
                canvas = c18430.f57197;
                float f3 = this.f66196;
                float f4 = this.f66197;
                c85524 = c18430.f57191;
                canvas.drawTextOnPath(str, this.f19904, f3, f4, c85524.f26153);
            }
        }
        float f5 = this.f66196;
        c8552 = c18430.f57191;
        this.f66196 = c8552.f26148.measureText(str) + f5;
    }
}
