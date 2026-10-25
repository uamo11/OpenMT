package l;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: Z4K7 */
/* renamed from: l.ۙܳ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnCancelListenerC4699 implements DialogInterface.OnCancelListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC10344 f14930;

    public DialogInterfaceOnCancelListenerC4699(DialogInterfaceOnCancelListenerC10344 dialogInterfaceOnCancelListenerC10344) {
        this.f14930 = dialogInterfaceOnCancelListenerC10344;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        DialogInterfaceOnCancelListenerC10344 dialogInterfaceOnCancelListenerC10344 = this.f14930;
        dialog = dialogInterfaceOnCancelListenerC10344.mDialog;
        if (dialog != null) {
            dialog2 = dialogInterfaceOnCancelListenerC10344.mDialog;
            dialogInterfaceOnCancelListenerC10344.onCancel(dialog2);
        }
    }
}
