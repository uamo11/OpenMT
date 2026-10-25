package l;

import android.content.Context;
import android.content.DialogInterface;

/* compiled from: PAKQ */
/* renamed from: l.ᩴۨܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC18742 implements DialogInterface.OnDismissListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59228;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Context f59229;

    public /* synthetic */ DialogInterfaceOnDismissListenerC18742(Context context, int i) {
        this.f59228 = i;
        this.f59229 = context;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.f59228;
        Context context = this.f59229;
        switch (i) {
            case 0:
                int i2 = ServiceC3219.f10121;
                ((AbstractActivityC3346) context).finish();
                break;
            default:
                C21769.m49102(context);
                break;
        }
    }
}
