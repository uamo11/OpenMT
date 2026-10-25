package l;

import android.view.View;

/* compiled from: P55W */
/* renamed from: l.᩺᩷, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC23229 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C1732 f74646;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17254 f74647;

    public RunnableC23229(C17254 c17254, C1732 c1732) {
        this.f74647 = c17254;
        this.f74646 = c1732;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3060 c3060;
        Object obj;
        C3060 c30602;
        C17254 c17254 = this.f74647;
        c3060 = c17254.f26497;
        if (c3060 != null) {
            c30602 = c17254.f26497;
            c30602.changeMenuMode();
        }
        obj = c17254.f26501;
        View view = (View) obj;
        if (view != null && view.getWindowToken() != null) {
            C1732 c1732 = this.f74646;
            if (c1732.m42640()) {
                c17254.f52899 = c1732;
            }
        }
        c17254.f52900 = null;
    }
}
