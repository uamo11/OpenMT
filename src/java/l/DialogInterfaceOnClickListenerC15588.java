package l;

import android.content.DialogInterface;

/* compiled from: PAPA */
/* renamed from: l.ܺ֡ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC15588 implements DialogInterface.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f48023;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f48024;

    public /* synthetic */ DialogInterfaceOnClickListenerC15588(int i, Object obj) {
        this.f48023 = i;
        this.f48024 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f48023;
        Object obj = this.f48024;
        switch (i2) {
            case 0:
                int i3 = AbstractActivityC0772.f2860;
                ((AbstractActivityC0772) obj).finish();
                break;
            case 1:
                ((C22708) obj).f73363 = i;
                break;
            default:
                ((ActivityC16315) obj).m38449(false);
                break;
        }
    }
}
