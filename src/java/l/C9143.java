package l;

import android.os.ConditionVariable;

/* compiled from: M74O */
/* renamed from: l.ۡ᩸֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9143 extends Thread {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16197 f27683;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ConditionVariable f27684;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9143(C16197 c16197, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f27683 = c16197;
        this.f27684 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        InterfaceC12481 interfaceC12481;
        synchronized (this.f27683) {
            this.f27684.open();
            C16197.m38134(this.f27683);
            interfaceC12481 = this.f27683.f49881;
            interfaceC12481.getClass();
        }
    }
}
