package l;

import java.util.Collection;
import java.util.Set;

/* compiled from: O4TJ */
/* renamed from: l.᩻᩷ۚ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23941 extends C16885 implements InterfaceC23527 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f77639;

    @Override // l.InterfaceC23527
    /* renamed from: ֫ */
    public final InterfaceC14062 mo51991(InterfaceC9272 interfaceC9272) {
        return ((C17591) interfaceC9272).f53758;
    }

    @Override // l.InterfaceC23527
    /* renamed from: ֫ */
    public final C23589 mo51992(InterfaceC20561 interfaceC20561) {
        return ((C18297) interfaceC20561).f56889;
    }

    @Override // l.InterfaceC22821
    /* renamed from: ۧ */
    public final int mo10659(Object obj) {
        return ((C18297) obj).f56890;
    }

    @Override // l.InterfaceC23527
    /* renamed from: ۧ */
    public final int mo51993(InterfaceC20561 interfaceC20561) {
        return ((C18297) interfaceC20561).f56888;
    }

    @Override // l.InterfaceC23527
    /* renamed from: ۧ */
    public final C7382 mo51994(InterfaceC9272 interfaceC9272) {
        return ((C17591) interfaceC9272).f53759;
    }

    @Override // l.InterfaceC23527
    /* renamed from: ܽ */
    public final Set mo51995(InterfaceC20561 interfaceC20561) {
        return ((C18297) interfaceC20561).f56891;
    }

    public C23941(C19357 c19357) {
        super(c19357);
        this.f77639 = new ConcurrentMapC10942();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C18297 m52768(InterfaceC20561 interfaceC20561) {
        ConcurrentMapC10942 concurrentMapC10942 = this.f77639;
        C18297 c18297 = (C18297) concurrentMapC10942.get(interfaceC20561);
        if (c18297 != null) {
            return c18297;
        }
        int visibility = interfaceC20561.getVisibility();
        C19357 c19357 = this.f51819;
        C18297 c182972 = new C18297(visibility, c19357.f68957.m34448(interfaceC20561.getType()), AbstractC6079.m16989(C4648.m13611(interfaceC20561.getElements().iterator(), new C15827(c19357))));
        C18297 c182973 = (C18297) concurrentMapC10942.putIfAbsent(c182972, c182972);
        return c182973 == null ? c182972 : c182973;
    }

    @Override // l.InterfaceC22821
    /* renamed from: ֫ */
    public final Collection mo10657() {
        return new C14768(this.f77639.values());
    }
}
