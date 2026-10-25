package l;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: 28WH */
/* renamed from: l.۠۫ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8179 implements InterfaceC18702 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7473 f25179;

    public C8179(C7473 c7473) {
        this.f25179 = c7473;
    }

    @Override // l.InterfaceC18702
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo21671() {
        boolean z;
        C12392 c12392;
        C7473 c7473 = this.f25179;
        z = c7473.f23027;
        if (!z) {
            return true;
        }
        c12392 = c7473.f23051;
        return c12392.m30401();
    }

    @Override // l.InterfaceC18702
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21666() {
        boolean z;
        C12392 c12392;
        C7473 c7473 = this.f25179;
        z = c7473.f23027;
        if (z) {
            c12392 = c7473.f23051;
            c12392.invalidate();
        }
    }

    @Override // l.InterfaceC18702
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo21672() {
        C12412 c12412;
        c12412 = this.f25179.f23035;
        c12412.f37386 = false;
        c12412.f37390 = null;
        c12412.f37384 = null;
        c12412.f37383 = null;
        c12412.f37387 = null;
        c12412.f37382.clear();
    }

    @Override // l.InterfaceC18702
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21670(boolean z) {
        C12412 c12412;
        C7473 c7473 = this.f25179;
        c12412 = c7473.f23035;
        C7473.m20029(c7473, c12412, z);
    }

    @Override // l.InterfaceC18702
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21669(C20736 c20736, int i, int i2, int i3, Canvas canvas, Paint paint, C22686 c22686) {
        C7473.m20033(this.f25179, true, c20736, i, i2, i3, canvas, paint, c22686);
    }

    @Override // l.InterfaceC18702
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21668(C20736 c20736, int i, int i2, float f, float f2, boolean z, Canvas canvas, C1539 c1539, InterfaceC10961 interfaceC10961, C22686 c22686) {
        C7473.m20032(this.f25179, true, c20736, i, i2, f, f2, z, canvas, (Paint) c1539, interfaceC10961, c22686);
    }

    @Override // l.InterfaceC18702
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21667(C20736 c20736, float f, float f2, float f3, float f4, Canvas canvas, C1539 c1539, C22686 c22686) {
        C7473.m20031(this.f25179, true, c20736, f, f2, f3, f4, canvas, c1539, c22686);
    }
}
