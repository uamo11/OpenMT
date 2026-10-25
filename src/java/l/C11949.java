package l;

import com.google.android.material.motion.MotionUtils;

/* compiled from: O44L */
/* renamed from: l.ۨ᩷۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11949 extends C17262 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14439 f35712;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11949(C14439 c14439, AbstractC5698 abstractC5698) {
        super(c14439, abstractC5698);
        this.f35712 = c14439;
    }

    @Override // l.C17262, l.AbstractC7715
    /* renamed from: ᩳ */
    public final AbstractC7715 mo5817() {
        AbstractC7715[] abstractC7715Arr;
        AbstractC5698 abstractC5698 = this.f52913;
        C12171.m29642(abstractC5698.f17559 == EnumC1296.f4567);
        C14439 c14439 = this.f35712;
        int m4782 = C1365.m4782(abstractC5698.mo16091(c14439.f44256));
        c14439.f44254.m4809((InterfaceC8090) abstractC5698);
        abstractC7715Arr = c14439.f44255;
        return abstractC7715Arr[m4782];
    }

    @Override // l.C17262, l.AbstractC7715
    /* renamed from: ܳ */
    public final void mo5815() {
        C12171.m29640("this method shouldn't be invoked");
        throw null;
    }

    @Override // l.C17262, l.AbstractC7715
    /* renamed from: ܽ */
    public final AbstractC7715 mo20666() {
        AbstractC7715[] abstractC7715Arr;
        AbstractC5698 abstractC5698 = this.f52913;
        C12171.m29642(abstractC5698.f17559 == EnumC1296.f4571);
        C14439 c14439 = this.f35712;
        C10658 c10658 = (C10658) abstractC5698.mo16091(c14439.f44256);
        int m4782 = C1365.m4782(c10658.f32060);
        c14439.f44254.m4810((C9226) abstractC5698, c10658);
        abstractC7715Arr = c14439.f44255;
        return abstractC7715Arr[m4782];
    }

    @Override // l.C17262
    public final String toString() {
        return "dynamic(" + this.f52913 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
