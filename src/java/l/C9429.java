package l;

/* compiled from: K6PM */
/* renamed from: l.ۢۜ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9429 extends AbstractFutureC8723 {
    public static final long serialVersionUID = 5232453952276885070L;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Runnable f28612;

    @Override // l.AbstractFutureC8723
    /* renamed from: ᩳ */
    public final /* bridge */ /* synthetic */ Object mo12867() {
        return null;
    }

    @Override // l.AbstractFutureC8723
    /* renamed from: ֫ */
    public final void mo22553(Throwable th) {
        C14157 c14157 = C17189.f52693;
        throw th;
    }

    public C9429(Runnable runnable) {
        this.f28612 = runnable;
    }

    @Override // l.AbstractFutureC8723
    /* renamed from: ܽ */
    public final boolean mo12866() {
        this.f28612.run();
        return true;
    }
}
