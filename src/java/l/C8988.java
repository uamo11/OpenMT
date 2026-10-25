package l;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: K1X4 */
/* renamed from: l.ۡܺᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8988 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9694 f27309;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Exception f27310;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object f27311;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f27312 = false;

    public C8988(InterfaceC9694 interfaceC9694) {
        this.f27309 = interfaceC9694;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m23229() {
        Handler handler;
        Handler handler2;
        this.f27312 = true;
        this.f27310 = null;
        handler = ServiceC16042.f49474;
        handler2 = ServiceC16042.f49474;
        handler.sendMessage(handler2.obtainMessage(0, this));
        while (this.f27312) {
            SystemClock.sleep(1L);
        }
        Exception exc = this.f27310;
        if (exc != null) {
            throw exc;
        }
        return this.f27311;
    }
}
