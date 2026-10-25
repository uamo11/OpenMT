package l;

/* compiled from: J4LB */
/* renamed from: l.ܰܳ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC13870 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ComponentCallbacksC9205 f41354;

    public RunnableC13870(ComponentCallbacksC9205 componentCallbacksC9205) {
        this.f41354 = componentCallbacksC9205;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41354.callStartTransitionListener(false);
    }
}
