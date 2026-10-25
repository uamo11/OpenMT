package l;

import android.content.Context;
import android.view.View;
import bin.mt.plus.R;

/* compiled from: Y6Y9 */
/* renamed from: l.ܳ۫᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC14532 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44525;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f44526;

    public /* synthetic */ RunnableC14532(int i, Object obj) {
        this.f44525 = i;
        this.f44526 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44525) {
            case 0:
                C17294.m40607(((View) this.f44526).findViewById(R.id.MT_Protector_res_0x7f0a0184));
                break;
            case 1:
                DialogInterfaceOnClickListenerC19407.m44692((C13136) this.f44526);
                break;
            case 2:
                ((InterfaceC14544) this.f44526).mo13743(-1);
                break;
            default:
                C4835.m14079((Context) this.f44526);
                break;
        }
    }
}
