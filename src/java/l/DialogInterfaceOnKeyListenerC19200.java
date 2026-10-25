package l;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* compiled from: D4GG */
/* renamed from: l.᩵ۗܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnKeyListenerC19200 implements DialogInterface.OnKeyListener {
    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        dialogInterface.cancel();
        return true;
    }
}
