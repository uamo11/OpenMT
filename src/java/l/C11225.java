package l;

import android.os.Handler;
import bin.mt.term.Exec;

/* compiled from: M1TZ */
/* renamed from: l.ۧ᩶ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11225 extends Thread {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17574 f33664;

    public C11225(C17574 c17574) {
        this.f33664 = c17574;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i;
        Handler handler;
        Handler handler2;
        C17574 c17574 = this.f33664;
        i = c17574.f53709;
        int waitFor = Exec.waitFor(i);
        handler = c17574.f53708;
        handler2 = c17574.f53708;
        handler.sendMessage(handler2.obtainMessage(4, Integer.valueOf(waitFor)));
    }
}
