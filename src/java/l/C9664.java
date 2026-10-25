package l;

import android.view.View;

/* compiled from: X8B6 */
/* renamed from: l.ۢܶۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9664 implements InterfaceC3047 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16012 f29262;

    public C9664(ActivityC16012 activityC16012) {
        this.f29262 = activityC16012;
    }

    @Override // l.InterfaceC3047
    /* renamed from: ֫ */
    public final void mo9337(int i) {
        C8958 c8958;
        InterfaceC17889 m37856;
        C8958 c89582;
        ActivityC16012 activityC16012 = this.f29262;
        c8958 = activityC16012.f49409;
        m37856 = activityC16012.m37856(i);
        c8958.f27214 = m37856.getPath();
        c89582 = activityC16012.f49409;
        c89582.f27211 = null;
        activityC16012.m37864();
    }

    @Override // l.InterfaceC3047
    /* renamed from: ۧ */
    public final void mo9338(int i) {
        ActivityC16012.m37849(this.f29262, i);
    }

    @Override // l.InterfaceC3047
    /* renamed from: ֫ */
    public final void mo9335() {
        AbstractC12924 abstractC12924;
        C8958 c8958;
        InterfaceC17889 m37844;
        C20478 c20478;
        C20478 c204782;
        AbstractC12924 abstractC129242;
        C20478 c204783;
        ActivityC16012 activityC16012 = this.f29262;
        abstractC12924 = activityC16012.f49408;
        abstractC12924.getClass();
        if (!(abstractC12924 instanceof C5164)) {
            m37844 = activityC16012.m37844();
            if (!C6554.m18062(m37844)) {
                c20478 = activityC16012.f49392;
                if (c20478 != null) {
                    c204782 = activityC16012.f49392;
                    abstractC129242 = activityC16012.f49408;
                    if (c204782.m46929(abstractC129242.mo14785())) {
                        c204783 = activityC16012.f49392;
                        c204783.m46933();
                        return;
                    }
                }
            }
        }
        c8958 = activityC16012.f49409;
        activityC16012.m37851(!c8958.f27208);
    }

    @Override // l.InterfaceC3047
    /* renamed from: ֫ */
    public final void mo9336(float f) {
        C9762 c9762;
        View view;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        ActivityC16012 activityC16012 = this.f29262;
        c9762 = activityC16012.f10584;
        float f3 = 1.0f - f;
        c9762.setAlpha(f3);
        view = activityC16012.f49410;
        view.setAlpha(f3);
        f2 = activityC16012.f49400;
        boolean z4 = f2 > 0.0f;
        activityC16012.f49400 = f;
        if (z4 != (f > 0.0f)) {
            z = activityC16012.f49395;
            if (!z && !activityC16012.isFinishing() && !activityC16012.isDestroyed()) {
                if (f > 0.0f) {
                    z3 = activityC16012.f49393;
                    if (z3) {
                        activityC16012.m37857(true);
                    }
                }
                if (f == 0.0f) {
                    z2 = activityC16012.f49396;
                    if (z2) {
                        activityC16012.m37857(false);
                    }
                }
            }
            activityC16012.m37846();
        }
    }

    @Override // l.InterfaceC3047
    public final void onDismiss() {
        this.f29262.m37830(true);
    }
}
