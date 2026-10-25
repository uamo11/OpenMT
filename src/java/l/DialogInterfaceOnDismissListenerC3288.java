package l;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: Z4K7 */
/* renamed from: l.ۗܳ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnDismissListenerC3288 implements DialogInterface.OnDismissListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC10344 f10329;

    public DialogInterfaceOnDismissListenerC3288(DialogInterfaceOnCancelListenerC10344 dialogInterfaceOnCancelListenerC10344) {
        this.f10329 = dialogInterfaceOnCancelListenerC10344;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Dialog dialog;
        Dialog dialog2;
        DialogInterfaceOnCancelListenerC10344 dialogInterfaceOnCancelListenerC10344 = this.f10329;
        dialog = dialogInterfaceOnCancelListenerC10344.mDialog;
        if (dialog != null) {
            dialog2 = dialogInterfaceOnCancelListenerC10344.mDialog;
            dialogInterfaceOnCancelListenerC10344.onDismiss(dialog2);
        }
    }
}
