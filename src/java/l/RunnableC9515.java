package l;

/* compiled from: DB1R */
/* renamed from: l.ۢۤ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC9515 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13041 f28895;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f28896;

    public RunnableC9515(InterfaceC13041 interfaceC13041, Object obj) {
        this.f28895 = interfaceC13041;
        this.f28896 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28895.accept(this.f28896);
    }
}
