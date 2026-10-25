package l;

import android.content.DialogInterface;

/* compiled from: 313O */
/* renamed from: l.᩻۠ܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23577 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3822 f76468;

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
    }

    public C23577(C3822 c3822) {
        this.f76468 = c3822;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        DialogInterfaceC0206 dialogInterfaceC0206;
        dialogInterfaceC0206 = this.f76468.f12238;
        dialogInterfaceC0206.dismiss();
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C3822.m11576(this.f76468);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C8776 c8776;
        C8776 c87762;
        DialogInterfaceC0206 dialogInterfaceC0206;
        C3822 c3822 = this.f76468;
        c8776 = c3822.f12234;
        ((C6644) c8776.getAdapter()).m18161();
        c87762 = c3822.f12234;
        c87762.scrollToPosition(0);
        dialogInterfaceC0206 = c3822.f12238;
        dialogInterfaceC0206.m1449();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractActivityC3346 abstractActivityC3346;
        abstractActivityC3346 = this.f76468.f12233;
        abstractActivityC3346.m10223(exc, (DialogInterface.OnDismissListener) null);
    }
}
