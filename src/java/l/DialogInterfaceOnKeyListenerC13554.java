package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import bin.mt.plus.R;

/* compiled from: 7AJG */
/* renamed from: l.ܰۗܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class DialogInterfaceOnKeyListenerC13554 implements DialogInterface.OnKeyListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C8817 f40455 = C8817.m22787();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1848 f40456;

    public DialogInterfaceOnKeyListenerC13554(C1848 c1848) {
        this.f40456 = c1848;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        boolean z;
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        C1848 c1848 = this.f40456;
        z = c1848.f6316;
        if (z) {
            return true;
        }
        if (this.f40455.m22793()) {
            c1848.m6143();
            return true;
        }
        C21374.m48457(R.string.MT_Protector_res_0x7f12015f);
        return true;
    }
}
