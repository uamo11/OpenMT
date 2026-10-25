package l;

import android.content.DialogInterface;

/* compiled from: B4RX */
/* renamed from: l.֨ܶۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC1200 implements DialogInterface.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8256 f4337;

    public DialogInterfaceOnClickListenerC1200(C8256 c8256) {
        this.f4337 = c8256;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C8256 c8256 = this.f4337;
        c8256.f25409 = i;
        c8256.onClick(dialogInterface, -1);
        dialogInterface.dismiss();
    }
}
