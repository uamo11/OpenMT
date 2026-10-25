package l;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: N673 */
/* renamed from: l.ܿܰᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC17392 extends AbstractC13158 {
    public final AtomicReference h;
    public volatile boolean i;

    public abstract Object h();

    public AbstractC17392(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234) {
        super(abstractC9198, interfaceC15234);
        this.h = new AtomicReference(null);
    }

    public AbstractC17392(AbstractC17392 abstractC17392, InterfaceC15234 interfaceC15234) {
        super(abstractC17392, interfaceC15234);
        this.h = abstractC17392.h;
    }

    @Override // l.AbstractC13158, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object obj;
        InterfaceC15234 trySplit;
        InterfaceC15234 interfaceC15234 = this.b;
        long estimateSize = interfaceC15234.estimateSize();
        long j = this.c;
        if (j == 0) {
            j = AbstractC13158.e(estimateSize);
            this.c = j;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        AbstractC17392 abstractC17392 = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z2 = abstractC17392.i;
            if (!z2) {
                CountedCompleter<?> completer = abstractC17392.getCompleter();
                while (true) {
                    AbstractC17392 abstractC173922 = (AbstractC17392) ((AbstractC13158) completer);
                    if (z2 || abstractC173922 == null) {
                        break;
                    }
                    z2 = abstractC173922.i;
                    completer = abstractC173922.getCompleter();
                }
            }
            if (z2) {
                obj = abstractC17392.h();
                break;
            }
            if (estimateSize <= j || (trySplit = interfaceC15234.trySplit()) == null) {
                break;
            }
            AbstractC17392 abstractC173923 = (AbstractC17392) abstractC17392.c(trySplit);
            abstractC17392.d = abstractC173923;
            AbstractC17392 abstractC173924 = (AbstractC17392) abstractC17392.c(interfaceC15234);
            abstractC17392.e = abstractC173924;
            abstractC17392.setPendingCount(1);
            if (z) {
                interfaceC15234 = trySplit;
                abstractC17392 = abstractC173923;
                abstractC173923 = abstractC173924;
            } else {
                abstractC17392 = abstractC173924;
            }
            z = !z;
            abstractC173923.fork();
            estimateSize = interfaceC15234.estimateSize();
        }
        obj = abstractC17392.a();
        abstractC17392.d(obj);
        abstractC17392.tryComplete();
    }

    @Override // l.AbstractC13158
    public final void d(Object obj) {
        if (!b()) {
            this.f = obj;
        } else if (obj != null) {
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // l.AbstractC13158, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return i();
    }

    public final Object i() {
        if (b()) {
            Object obj = this.h.get();
            return obj == null ? h() : obj;
        }
        return this.f;
    }

    public void f() {
        this.i = true;
    }

    public final void g() {
        AbstractC17392 abstractC17392 = this;
        for (AbstractC17392 abstractC173922 = (AbstractC17392) ((AbstractC13158) getCompleter()); abstractC173922 != null; abstractC173922 = (AbstractC17392) ((AbstractC13158) abstractC173922.getCompleter())) {
            if (abstractC173922.d == abstractC17392) {
                AbstractC17392 abstractC173923 = (AbstractC17392) abstractC173922.e;
                if (!abstractC173923.i) {
                    abstractC173923.f();
                }
            }
            abstractC17392 = abstractC173922;
        }
    }
}
