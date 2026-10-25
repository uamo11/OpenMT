package l;

import android.content.DialogInterface;

/* compiled from: K5R1 */
/* renamed from: l.ۗ᩻ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC3573 implements DialogInterface.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11326;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11327;

    public /* synthetic */ DialogInterfaceOnClickListenerC3573(int i, Object obj) {
        this.f11326 = i;
        this.f11327 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f11326;
        Object obj = this.f11327;
        switch (i2) {
            case 0:
                int i3 = ActivityC6604.f20335;
                ((ActivityC6604) obj).finish();
                break;
            case 1:
                AbstractActivityC12266.m29775((AbstractActivityC12266) obj);
                break;
            default:
                ((DialogInterfaceOnClickListenerC19407) obj).m44706(false);
                break;
        }
    }
}
