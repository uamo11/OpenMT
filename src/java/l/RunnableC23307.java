package l;

import android.os.Handler;

/* compiled from: B6NL */
/* renamed from: l.᩺᩺ᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC23307 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14134 f74923;

    public RunnableC23307(C14134 c14134) {
        this.f74923 = c14134;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Handler handler;
        C14134 c14134 = this.f74923;
        z = c14134.f42635;
        if (z) {
            return;
        }
        if (!c14134.m33743()) {
            c14134.m33740();
        } else {
            handler = c14134.f42634;
            handler.postDelayed(this, 200L);
        }
    }
}
