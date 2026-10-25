package l;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: TB7B */
/* renamed from: l.ܺ֨ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15606 extends AbstractC2202 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public RectF f48068 = new RectF();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18430 f48069;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f48070;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f48071;

    public C15606(C18430 c18430, float f, float f2) {
        this.f48069 = c18430;
        this.f48070 = f;
        this.f48071 = f2;
    }

    @Override // l.AbstractC2202
    /* renamed from: ֫ */
    public final boolean mo7288(AbstractC10088 abstractC10088) {
        if (!(abstractC10088 instanceof C5854)) {
            return true;
        }
        AbstractC19261 m38398 = abstractC10088.f16090.m38398(((C5854) abstractC10088).f17955);
        if (m38398 == null) {
            return false;
        }
        C4298 c4298 = (C4298) m38398;
        Path path = new C23368(c4298.f13865).f75064;
        Matrix matrix = c4298.f57156;
        if (matrix != null) {
            path.transform(matrix);
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f48068.union(rectF);
        return false;
    }

    @Override // l.AbstractC2202
    /* renamed from: ֫ */
    public final void mo7287(String str) {
        boolean m42893;
        C8552 c8552;
        C8552 c85522;
        C18430 c18430 = this.f48069;
        m42893 = c18430.m42893();
        if (m42893) {
            Rect rect = new Rect();
            c85522 = c18430.f57191;
            c85522.f26148.getTextBounds(str, 0, str.length(), rect);
            RectF rectF = new RectF(rect);
            rectF.offset(this.f48070, this.f48071);
            this.f48068.union(rectF);
        }
        float f = this.f48070;
        c8552 = c18430.f57191;
        this.f48070 = c8552.f26148.measureText(str) + f;
    }
}
