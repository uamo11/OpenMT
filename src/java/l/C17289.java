package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import bin.mt.plus.R;

/* compiled from: 964K */
/* renamed from: l.ܿۤܿ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17289 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f52978;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Bitmap f52979;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC19407 f52980;

    public C17289(DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407, AbstractC15440 abstractC15440) {
        this.f52980 = dialogInterfaceOnClickListenerC19407;
        this.f52978 = abstractC15440;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C16560 c16560;
        C4021 c4021;
        DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407 = this.f52980;
        c16560 = dialogInterfaceOnClickListenerC19407.f62792;
        m20267(c16560.m39056(), R.string.MT_Protector_res_0x7f12037b);
        c4021 = dialogInterfaceOnClickListenerC19407.f62796;
        this.f52979 = DialogInterfaceOnClickListenerC19407.m44690(c4021.m12090());
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        AbstractC15440 abstractC15440;
        C4021 c4021;
        C4021 c40212;
        DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407 = this.f52980;
        abstractC15440 = dialogInterfaceOnClickListenerC19407.f62788;
        C18090 c18090 = new C18090(abstractC15440);
        try {
            C8918 c8918 = new C8918(this.f52978);
            try {
                c8918.m23012("icon.png");
                this.f52979.compress(Bitmap.CompressFormat.PNG, 90, c8918.m23007());
                c4021 = dialogInterfaceOnClickListenerC19407.f62796;
                if (c4021.m12093() != 0) {
                    C12534 c12534 = new C12534(0, new C23326(c18090.m42193(c18090.m42211("resources.arsc"), (C19277) null)));
                    C9028 m23280 = C9028.m23280();
                    c40212 = dialogInterfaceOnClickListenerC19407.f62796;
                    DialogInterfaceOnClickListenerC19407.m44694(c18090, c8918, c12534, c40212.m12093(), false, m23280);
                    if (m23280.mo14956() != 0) {
                        c8918.m23012("resources.arsc");
                        m23280.m23282(c8918.m23007());
                    }
                    c8918.close();
                    c18090.close();
                    return;
                }
                c8918.close();
                c18090.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                c18090.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        DialogInterfaceC0206 dialogInterfaceC0206;
        C16560 c16560;
        DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407 = this.f52980;
        dialogInterfaceC0206 = dialogInterfaceOnClickListenerC19407.f62789;
        dialogInterfaceC0206.dismiss();
        c16560 = dialogInterfaceOnClickListenerC19407.f62792;
        c16560.m39005(this.f52978);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C16560 c16560;
        c16560 = this.f52980.f62792;
        c16560.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
        this.f52978.mo23552();
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
        C15528.m36596();
    }
}
