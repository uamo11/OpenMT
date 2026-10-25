package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* compiled from: O8UQ */
/* renamed from: l.ܰ᩸ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14084 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2112 f42537;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14084(AbstractActivityC3346 abstractActivityC3346, C2112 c2112) {
        super(abstractActivityC3346, -1);
        this.f42537 = c2112;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        String trim = m31260().trim();
        try {
            if (trim.isEmpty()) {
                throw new NumberFormatException();
            }
            int parseInt = Integer.parseInt(trim);
            if (parseInt < 1 || parseInt > 999) {
                C21374.m48457(R.string.MT_Protector_res_0x7f1206a7);
            } else {
                C21805.m49153(parseInt);
                m31262();
            }
        } catch (NumberFormatException unused) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1206a7);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        AbstractDialogInterfaceOnClickListenerC12849 abstractDialogInterfaceOnClickListenerC12849;
        C2112 c2112 = this.f42537;
        abstractDialogInterfaceOnClickListenerC12849 = c2112.f7046;
        if (abstractDialogInterfaceOnClickListenerC12849 == this) {
            c2112.f7046 = null;
        }
    }
}
