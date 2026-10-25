package l;

import java.util.concurrent.RunnableFuture;

/* compiled from: K6PM */
/* renamed from: l.ۜۜ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableFutureC6606 extends AbstractFutureC8723 implements RunnableFuture {
    public static final long serialVersionUID = 5232453952276885070L;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Runnable f20341;

    @Override // l.AbstractFutureC8723
    /* renamed from: ᩳ */
    public final /* bridge */ /* synthetic */ Object mo12867() {
        return null;
    }

    public RunnableFutureC6606(Runnable runnable) {
        this.f20341 = runnable;
    }

    @Override // l.AbstractFutureC8723
    /* renamed from: ܽ */
    public final boolean mo12866() {
        this.f20341.run();
        return true;
    }

    public final String toString() {
        return super.toString() + "[Wrapped task = " + this.f20341 + "]";
    }
}
