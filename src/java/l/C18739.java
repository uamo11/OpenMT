package l;

import java.util.function.BooleanSupplier;

/* compiled from: 77HY */
/* renamed from: l.ᩴۨܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18739 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17889 f59217;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f59218;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BooleanSupplier f59219;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10917 f59220;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f59221;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f59222;

    public C18739(C16560 c16560, BooleanSupplier booleanSupplier, InterfaceC17889 interfaceC17889, Runnable runnable) {
        this.f59218 = c16560;
        this.f59219 = booleanSupplier;
        this.f59217 = interfaceC17889;
        this.f59221 = runnable;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        this.f59220 = this.f59218.m39045();
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        this.f59222 = this.f59219.getAsBoolean();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        if (this.f59220.m27225()) {
            return;
        }
        if (this.f59222) {
            C19568.m45012(this.f59218, this.f59217);
        } else {
            this.f59221.run();
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f59220.m27225()) {
            return;
        }
        C19568.m45012(this.f59218, this.f59217);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        this.f59220.m27224();
    }
}
