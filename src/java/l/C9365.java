package l;

/* compiled from: R6U3 */
/* renamed from: l.ۢۙᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9365 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f28438;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f28439;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9365 f28440;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9365 f28441;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C21605 f28442;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile long f28443 = -1;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f28444;

    public C9365(Object obj) {
        C11003.requireNonNull(obj);
        this.f28439 = obj;
        this.f28440 = null;
        this.f28441 = null;
        this.f28444 = 1;
        this.f28438 = 1;
    }

    public C9365(C9365 c9365, C9365 c93652) {
        C11003.requireNonNull(c9365);
        this.f28441 = c9365;
        C11003.requireNonNull(c93652);
        this.f28440 = c93652;
        this.f28439 = null;
        this.f28438 = Math.max(c9365.f28438, c93652.f28438) + 1;
        long j = c9365.f28444 + c93652.f28444;
        int i = (int) j;
        if (j != i) {
            throw new ArithmeticException();
        }
        this.f28444 = i;
    }
}
