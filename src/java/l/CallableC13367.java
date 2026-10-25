package l;

import java.util.concurrent.Callable;

/* compiled from: 61L9 */
/* renamed from: l.۬᩷ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class CallableC13367 implements Callable {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11957 f39991;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39992;

    public /* synthetic */ CallableC13367(C11957 c11957, int i) {
        this.f39991 = c11957;
        this.f39992 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C13658 c13658;
        C11957 c11957 = this.f39991;
        c13658 = c11957.f35803.f6052;
        return C17622.m41185(new C4733(c13658.f40732), this.f39992, new C10546(c11957));
    }
}
