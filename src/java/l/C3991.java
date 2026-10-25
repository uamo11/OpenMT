package l;

import android.content.IntentFilter;

/* compiled from: 422Y */
/* renamed from: l.ۘܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3991 extends AbstractC2580 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7518 f12654;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C5402 f12655;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3991(LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402, C7518 c7518) {
        super(layoutInflaterFactory2C5402);
        this.f12655 = layoutInflaterFactory2C5402;
        this.f12654 = c7518;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m12037() {
        return this.f12654.m20160() ? 2 : 1;
    }

    @Override // l.AbstractC2580
    /* renamed from: ܽ */
    public final void mo8180() {
        this.f12655.mo15456();
    }

    @Override // l.AbstractC2580
    /* renamed from: ۧ */
    public final IntentFilter mo8179() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }
}
