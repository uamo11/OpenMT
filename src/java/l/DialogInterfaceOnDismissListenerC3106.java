package l;

import android.content.DialogInterface;
import com.tencent.open.web.security.JniInterface;

/* compiled from: 51RR */
/* renamed from: l.ۗ۠ۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnDismissListenerC3106 implements DialogInterface.OnDismissListener {
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        try {
            if (JniInterface.f907) {
                JniInterface.clearAllPWD();
            }
        } catch (Exception unused) {
        }
    }
}
