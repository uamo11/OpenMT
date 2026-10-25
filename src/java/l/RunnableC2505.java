package l;

import android.graphics.drawable.Drawable;

/* compiled from: F90M */
/* renamed from: l.ۖۨۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class RunnableC2505 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3916 f7968;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Drawable f7969;

    public RunnableC2505(C3916 c3916, Drawable drawable) {
        this.f7968 = c3916;
        this.f7969 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7968.invalidateDrawable(this.f7969);
    }
}
