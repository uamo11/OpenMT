package l;

import android.graphics.Path;

/* compiled from: TB7B */
/* renamed from: l.ۢ֨ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9258 extends AbstractC2202 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Path f28054;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18430 f28055;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f28056;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f28057;

    public C9258(C18430 c18430, float f, float f2, Path path) {
        this.f28055 = c18430;
        this.f28056 = f;
        this.f28057 = f2;
        this.f28054 = path;
    }

    @Override // l.AbstractC2202
    /* renamed from: ֫ */
    public final boolean mo7288(AbstractC10088 abstractC10088) {
        return !(abstractC10088 instanceof C5854);
    }

    @Override // l.AbstractC2202
    /* renamed from: ֫ */
    public final void mo7287(String str) {
        boolean m42893;
        C8552 c8552;
        C8552 c85522;
        C18430 c18430 = this.f28055;
        m42893 = c18430.m42893();
        if (m42893) {
            Path path = new Path();
            c85522 = c18430.f57191;
            c85522.f26148.getTextPath(str, 0, str.length(), this.f28056, this.f28057, path);
            this.f28054.addPath(path);
        }
        float f = this.f28056;
        c8552 = c18430.f57191;
        this.f28056 = c8552.f26148.measureText(str) + f;
    }
}
