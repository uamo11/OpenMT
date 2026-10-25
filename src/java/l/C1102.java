package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bin.mt.plus.R;

/* compiled from: PAKQ */
/* renamed from: l.֨ۨܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1102 extends BroadcastReceiver {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206[] f4008;

    public C1102(DialogInterfaceC0206[] dialogInterfaceC0206Arr) {
        this.f4008 = dialogInterfaceC0206Arr;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f4008[0];
        z = ServiceC3219.f10120;
        if (z) {
            dialogInterfaceC0206.dismiss();
        } else {
            dialogInterfaceC0206.m1447().setText(R.string.MT_Protector_res_0x7f1209d2);
        }
    }
}
