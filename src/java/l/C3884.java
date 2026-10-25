package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;

/* compiled from: 964K */
/* renamed from: l.ۘۤܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3884 extends BroadcastReceiver {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WeakReference f12409;

    public C3884(DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407) {
        this.f12409 = new WeakReference(dialogInterfaceOnClickListenerC19407);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        DialogInterfaceC0206 dialogInterfaceC0206;
        C4021 c4021;
        C16560 c16560;
        final DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407 = (DialogInterfaceOnClickListenerC19407) this.f12409.get();
        if (dialogInterfaceOnClickListenerC19407 != null) {
            dialogInterfaceC0206 = dialogInterfaceOnClickListenerC19407.f62789;
            if (dialogInterfaceC0206.m1442()) {
                final String stringExtra = intent.getStringExtra("pkgName");
                c4021 = dialogInterfaceOnClickListenerC19407.f62796;
                if (C11003.equals(stringExtra, c4021.m12094())) {
                    DialogInterfaceOnClickListenerC19407.f62785 = false;
                    c16560 = dialogInterfaceOnClickListenerC19407.f62792;
                    C19258 buildDialog = c16560.m39056().buildDialog();
                    buildDialog.m44433(R.string.MT_Protector_res_0x7f120b7b);
                    buildDialog.m44416(R.string.MT_Protector_res_0x7f12005d);
                    buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ܺۤܿ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C16560 c165602;
                            DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC194072 = DialogInterfaceOnClickListenerC19407.this;
                            dialogInterfaceOnClickListenerC194072.f62794 = true;
                            Intent intent2 = new Intent("android.intent.action.DELETE", Uri.fromParts("package", stringExtra, null));
                            c165602 = dialogInterfaceOnClickListenerC194072.f62792;
                            c165602.m39056().startActivity(intent2);
                        }
                    });
                    buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                    buildDialog.m44440(R.string.MT_Protector_res_0x7f1204b4, new DialogInterface.OnClickListener() { // from class: l.ۖۤܿ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            DialogInterfaceOnClickListenerC19407.this.m44706(false);
                        }
                    });
                    C8960.m23095(buildDialog.m44438());
                    return;
                }
                return;
            }
        }
        C2234.m7411(C4925.m14335()).m7413(this);
    }
}
