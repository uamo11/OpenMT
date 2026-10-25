package l;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: DB1R */
/* renamed from: l.ۡۤ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC8809 implements Runnable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Handler f26832;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Callable f26833;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC13041 f26834;

    public RunnableC8809(Handler handler, Callable callable, InterfaceC13041 interfaceC13041) {
        this.f26833 = callable;
        this.f26834 = interfaceC13041;
        this.f26832 = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            obj = ((CallableC7458) this.f26833).call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f26832.post(new RunnableC9515(this.f26834, obj));
    }
}
