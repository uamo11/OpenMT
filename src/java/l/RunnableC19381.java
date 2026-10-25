package l;

/* compiled from: 21RX */
/* renamed from: l.᩵ۢۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class RunnableC19381 implements Runnable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8091 f62733;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f62734;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f62735;

    public RunnableC19381(C8091 c8091) {
        this.f62733 = c8091;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int windowAttachCount;
        boolean z = this.f62734;
        C8091 c8091 = this.f62733;
        if (z != c8091.isPressed() || c8091.getParent() == null) {
            return;
        }
        int i = this.f62735;
        windowAttachCount = c8091.getWindowAttachCount();
        if (i == windowAttachCount) {
            c8091.performLongClick();
            c8091.f24904 = true;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44645() {
        int windowAttachCount;
        windowAttachCount = this.f62733.getWindowAttachCount();
        this.f62735 = windowAttachCount;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44644() {
        this.f62734 = this.f62733.isPressed();
    }
}
