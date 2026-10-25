package l;

import bin.mt.plus.R;

/* compiled from: N1TT */
/* renamed from: l.ۚ᩸ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5622 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17394;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f17395;

    public /* synthetic */ RunnableC5622(int i, Object obj) {
        this.f17394 = i;
        this.f17395 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17394) {
            case 0:
                r0.f23945.m29307(49, r0.f23940.getHeight() - ((ViewOnLayoutChangeListenerC7738) this.f17395).m10241(R.id.MT_Protector_res_0x7f0a02af).getHeight(), true);
                break;
            case 1:
                ((C16310) this.f17395).m38377();
                break;
            case 2:
                C3885.m11724((C3885) this.f17395);
                break;
            default:
                ((InterfaceC17664) this.f17395).close();
                break;
        }
    }
}
