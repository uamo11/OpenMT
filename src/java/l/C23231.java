package l;

/* compiled from: K5JX */
/* renamed from: l.᩺᩷֨, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23231 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f74648;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m51532() {
        while (!this.f74648) {
            wait();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m51533() {
        this.f74648 = false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m51534() {
        boolean z = this.f74648;
        this.f74648 = true;
        if (!z) {
            notify();
        }
    }
}
