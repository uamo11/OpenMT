package l;

import android.app.Dialog;
import android.view.View;

/* compiled from: Z4K7 */
/* renamed from: l.۬ܳ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13165 implements InterfaceC1008 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC10344 f39373;

    public C13165(DialogInterfaceOnCancelListenerC10344 dialogInterfaceOnCancelListenerC10344) {
        this.f39373 = dialogInterfaceOnCancelListenerC10344;
    }

    @Override // l.InterfaceC1008
    /* renamed from: ֫ */
    public final void mo1617(Object obj) {
        boolean z;
        Dialog dialog;
        Dialog dialog2;
        Dialog dialog3;
        if (((InterfaceC23586) obj) != null) {
            DialogInterfaceOnCancelListenerC10344 dialogInterfaceOnCancelListenerC10344 = this.f39373;
            z = dialogInterfaceOnCancelListenerC10344.mShowsDialog;
            if (z) {
                View requireView = dialogInterfaceOnCancelListenerC10344.requireView();
                if (requireView.getParent() == null) {
                    dialog = dialogInterfaceOnCancelListenerC10344.mDialog;
                    if (dialog != null) {
                        if (AbstractC5180.m14853(3)) {
                            dialog3 = dialogInterfaceOnCancelListenerC10344.mDialog;
                            C11003.toString(dialog3);
                        }
                        dialog2 = dialogInterfaceOnCancelListenerC10344.mDialog;
                        dialog2.setContentView(requireView);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }
}
