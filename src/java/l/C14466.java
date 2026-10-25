package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import bin.mt.plus.R;
import java.io.OutputStream;

/* compiled from: 964K */
/* renamed from: l.ܳۤܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14466 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f44336;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Bitmap f44337;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44338;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC19407 f44339;

    public C14466(DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407, AbstractC15440 abstractC15440, int i) {
        this.f44339 = dialogInterfaceOnClickListenerC19407;
        this.f44336 = abstractC15440;
        this.f44338 = i;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C16560 c16560;
        C4021 c4021;
        DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407 = this.f44339;
        c16560 = dialogInterfaceOnClickListenerC19407.f62792;
        m20267(c16560.m39056(), R.string.MT_Protector_res_0x7f12037b);
        c4021 = dialogInterfaceOnClickListenerC19407.f62796;
        this.f44337 = DialogInterfaceOnClickListenerC19407.m44690(c4021.m12090());
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        OutputStream mo23555 = this.f44336.mo23555(false);
        try {
            int i = this.f44338;
            if (i == 1) {
                this.f44337.compress(Bitmap.CompressFormat.PNG, 90, mo23555);
            } else if (i == 2) {
                this.f44337.compress(Bitmap.CompressFormat.WEBP, 90, mo23555);
            }
            if (mo23555 != null) {
                mo23555.close();
            }
        } catch (Throwable th) {
            if (mo23555 != null) {
                try {
                    mo23555.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        DialogInterfaceC0206 dialogInterfaceC0206;
        C16560 c16560;
        DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407 = this.f44339;
        dialogInterfaceC0206 = dialogInterfaceOnClickListenerC19407.f62789;
        dialogInterfaceC0206.dismiss();
        c16560 = dialogInterfaceOnClickListenerC19407.f62792;
        c16560.m39005(this.f44336);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C16560 c16560;
        c16560 = this.f44339.f62792;
        c16560.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
        this.f44336.mo23552();
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
        C15528.m36596();
    }
}
