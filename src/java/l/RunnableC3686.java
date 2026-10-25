package l;

import android.os.IBinder;

/* compiled from: X6AW */
/* renamed from: l.ۘۘ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class RunnableC3686 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0157 f11633;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0863 f11634;

    public RunnableC3686(C0157 c0157, C0863 c0863) {
        this.f11633 = c0157;
        this.f11634 = c0863;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = this.f11634.f3353.getBinder();
        C9996 c9996 = (C9996) this.f11633.f1338.f45642.remove(binder);
        if (c9996 != null) {
            binder.unlinkToDeath(c9996, 0);
        }
    }
}
