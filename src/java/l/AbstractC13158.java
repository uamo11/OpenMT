package l;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* compiled from: N673 */
/* renamed from: l.۬ܰᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC13158 extends CountedCompleter {
    public static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    public final AbstractC9198 a;
    public InterfaceC15234 b;
    public long c;
    public AbstractC13158 d;
    public AbstractC13158 e;
    public Object f;

    public abstract Object a();

    public abstract AbstractC13158 c(InterfaceC15234 interfaceC15234);

    public AbstractC13158(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234) {
        super(null);
        this.a = abstractC9198;
        this.b = interfaceC15234;
        this.c = 0L;
    }

    public AbstractC13158(AbstractC13158 abstractC13158, InterfaceC15234 interfaceC15234) {
        super(abstractC13158);
        this.b = interfaceC15234;
        this.a = abstractC13158.a;
        this.c = abstractC13158.c;
    }

    public static long e(long j) {
        long j2 = j / g;
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    public void d(Object obj) {
        this.f = obj;
    }

    public final boolean b() {
        return ((AbstractC13158) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        InterfaceC15234 trySplit;
        InterfaceC15234 interfaceC15234 = this.b;
        long estimateSize = interfaceC15234.estimateSize();
        long j = this.c;
        if (j == 0) {
            j = e(estimateSize);
            this.c = j;
        }
        boolean z = false;
        AbstractC13158 abstractC13158 = this;
        while (estimateSize > j && (trySplit = interfaceC15234.trySplit()) != null) {
            AbstractC13158 c = abstractC13158.c(trySplit);
            abstractC13158.d = c;
            AbstractC13158 c2 = abstractC13158.c(interfaceC15234);
            abstractC13158.e = c2;
            abstractC13158.setPendingCount(1);
            if (z) {
                interfaceC15234 = trySplit;
                abstractC13158 = c;
                c = c2;
            } else {
                abstractC13158 = c2;
            }
            z = !z;
            c.fork();
            estimateSize = interfaceC15234.estimateSize();
        }
        abstractC13158.d(abstractC13158.a());
        abstractC13158.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }
}
