package l;

import java.util.ArrayList;

/* compiled from: I1KV */
/* renamed from: l.۫ܳۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12467 implements InterfaceC10815 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7528 f37481;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f37482;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f37483;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f37484;

    @Override // l.InterfaceC10815
    /* renamed from: ܽ */
    public final String mo27032() {
        return "Dex2Smali";
    }

    public C12467(ViewOnClickListenerC7528 viewOnClickListenerC7528, AbstractC15440 abstractC15440, AbstractC15440 abstractC154402, AbstractActivityC3346 abstractActivityC3346) {
        this.f37481 = viewOnClickListenerC7528;
        this.f37483 = abstractC15440;
        this.f37484 = abstractC154402;
        this.f37482 = abstractActivityC3346;
    }

    @Override // l.InterfaceC10815
    /* renamed from: ᩳ */
    public final AbstractC15440 mo27033() {
        return this.f37483;
    }

    @Override // l.InterfaceC10815
    /* renamed from: ֫ */
    public final AbstractC15440 mo27029() {
        return this.f37484;
    }

    @Override // l.InterfaceC10815
    /* renamed from: ۧ */
    public final AbstractActivityC3346 mo27031() {
        return this.f37482;
    }

    @Override // l.InterfaceC10815
    /* renamed from: ֫ */
    public final void mo27030(AbstractC15440 abstractC15440) {
        String mo23554 = abstractC15440.mo23554();
        ViewOnClickListenerC7528 viewOnClickListenerC7528 = this.f37481;
        new C6117(viewOnClickListenerC7528, (AbstractActivityC3346) viewOnClickListenerC7528.requireActivity(), mo23554, new ArrayList(), true).m20274();
    }
}
