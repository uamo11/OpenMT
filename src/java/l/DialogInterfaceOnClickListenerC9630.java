package l;

import android.content.DialogInterface;

/* compiled from: C5GL */
/* renamed from: l.ۢܰܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC9630 implements DialogInterface.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29187;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f29188;

    public /* synthetic */ DialogInterfaceOnClickListenerC9630(AbstractActivityC3346 abstractActivityC3346, int i) {
        this.f29187 = i;
        this.f29188 = abstractActivityC3346;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f29187;
        AbstractActivityC3346 abstractActivityC3346 = this.f29188;
        switch (i2) {
            case 0:
                int i3 = ViewOnClickListenerC5396.f16757;
                ((ViewOnClickListenerC5396) abstractActivityC3346).finish();
                break;
            case 1:
                ((ActivityC17169) abstractActivityC3346).finish();
                break;
            default:
                ViewOnLayoutChangeListenerC7738.m20723((ViewOnLayoutChangeListenerC7738) abstractActivityC3346, dialogInterface, i);
                break;
        }
    }
}
