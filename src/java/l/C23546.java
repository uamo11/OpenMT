package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: N7BM */
/* renamed from: l.᩻۟ۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23546 extends AbstractFutureC7502 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f75601;

    public C23546(ArrayList arrayList) {
        this.f75601 = arrayList;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        Iterator it = this.f75601.iterator();
        while (it.hasNext()) {
            if (!((Future) it.next()).isCancelled()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        Iterator it = this.f75601.iterator();
        while (true) {
            while (it.hasNext()) {
                z2 = z2 && ((Future) it.next()).cancel(z);
            }
            return z2;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Iterator it = this.f75601.iterator();
        while (it.hasNext()) {
            if (!((Future) it.next()).isDone()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f75601.iterator();
        while (it.hasNext()) {
            arrayList.add(((Future) it.next()).get());
        }
        return arrayList;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f75601.iterator();
        while (it.hasNext()) {
            arrayList.add(((Future) it.next()).get(j, timeUnit));
        }
        return arrayList;
    }
}
