package l;

/* compiled from: C4QU */
/* renamed from: l.ܽۨܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class RunnableC16624 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11521 f51066;

    public RunnableC16624(C11521 c11521, C20177 c20177) {
        this.f51066 = c11521;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final EnumC5876 enumC5876 = EnumC5876.COMMAND_FAILED;
        try {
            enumC5876 = C14507.m34643();
        } catch (Throwable unused) {
        }
        C4925.m14315(new Runnable() { // from class: l.ۧۨܿ
            @Override // java.lang.Runnable
            public final void run() {
                C14507.m34646(RunnableC16624.this.f51066, enumC5876);
            }
        });
    }
}
