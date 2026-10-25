package l;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: 17B9 */
/* renamed from: l.ۜ۟ۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6613 extends AbstractFutureC7502 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC13851 f20347;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Future f20348;

    public C6613(AbstractFutureC7502 abstractFutureC7502, InterfaceC13851 interfaceC13851) {
        this.f20348 = abstractFutureC7502;
        this.f20347 = interfaceC13851;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f20348.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f20348.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f20348.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f20347.apply(this.f20348.get());
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f20347.apply(this.f20348.get(j, timeUnit));
    }
}
