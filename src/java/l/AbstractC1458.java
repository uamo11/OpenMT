package l;

import java.util.concurrent.Executor;

/* compiled from: I6PU */
/* renamed from: l.֨᩻᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC1458 extends AbstractRunnableC4281 {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public FutureC3575 f5205;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Executor f5206;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public FutureC3575 f5207;

    public AbstractC1458(Executor executor, FutureC3575 futureC3575, FutureC3575 futureC35752) {
        this.f5206 = executor;
        this.f5205 = futureC3575;
        this.f5207 = futureC35752;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m5011() {
        Executor executor = this.f5206;
        if (m22554()) {
            if (executor == null) {
                return true;
            }
            this.f5206 = null;
            executor.execute(this);
        }
        return false;
    }

    @Override // l.AbstractRunnableC4281
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo5012() {
        return this.f5205 != null;
    }
}
