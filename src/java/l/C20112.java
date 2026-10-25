package l;

import android.content.DialogInterface;

/* compiled from: G668 */
/* renamed from: l.᩶ۤܿ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20112 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f65132;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f65133;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f65134;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f65135;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3178 f65136;

    public C20112(C3178 c3178, byte[] bArr, byte[] bArr2, DialogInterfaceC0206 dialogInterfaceC0206) {
        this.f65136 = c3178;
        this.f65132 = bArr;
        this.f65135 = bArr2;
        this.f65133 = dialogInterfaceC0206;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        AbstractActivityC3346 abstractActivityC3346;
        abstractActivityC3346 = this.f65136.f9989;
        m20272(abstractActivityC3346, 100);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        AbstractC15440 abstractC15440;
        AbstractC15440 m22897 = C8863.m22897();
        abstractC15440 = this.f65136.f9991;
        this.f65134 = C22435.m50360(m22897, abstractC15440.m36517(), this.f65132, this.f65135);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        InterfaceC13041 interfaceC13041;
        C15528.m36596();
        this.f65133.dismiss();
        interfaceC13041 = this.f65136.f9992;
        interfaceC13041.accept(this.f65134);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractActivityC3346 abstractActivityC3346;
        abstractActivityC3346 = this.f65136.f9989;
        abstractActivityC3346.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
