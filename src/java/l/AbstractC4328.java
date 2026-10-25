package l;

import java.io.IOException;

/* compiled from: A4E9 */
/* renamed from: l.ۙ֫֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC4328 implements InterfaceC1274 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7582 f13925;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11384 f13926;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f13927 = 0;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f13928;

    public AbstractC4328(C11384 c11384) {
        this.f13926 = c11384;
        this.f13925 = new C7582(c11384.f34055.mo4333());
    }

    @Override // l.InterfaceC1274
    /* renamed from: ۢ */
    public final C15384 mo4333() {
        return this.f13925;
    }

    @Override // l.InterfaceC1274
    /* renamed from: ۧ */
    public long mo4334(C12521 c12521, long j) {
        try {
            long mo4334 = this.f13926.f34055.mo4334(c12521, j);
            if (mo4334 > 0) {
                this.f13927 += mo4334;
            }
            return mo4334;
        } catch (IOException e) {
            m12985(false, e);
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12985(boolean z, IOException iOException) {
        C11384 c11384 = this.f13926;
        int i = c11384.f34054;
        if (i == 6) {
            return;
        }
        if (i == 5) {
            C7582 c7582 = this.f13925;
            C15384 m20334 = c7582.m20334();
            c7582.m20327();
            m20334.mo20325();
            m20334.mo20328();
            c11384.f34054 = 6;
            C15615 c15615 = c11384.f34052;
            if (c15615 != null) {
                c15615.m36808(!z, c11384, iOException);
                return;
            }
            return;
        }
        throw new IllegalStateException("state: " + c11384.f34054);
    }
}
