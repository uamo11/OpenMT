package l;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* compiled from: N673 */
/* renamed from: l.֫ۤᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C1769 extends AbstractC7474 implements Set, Serializable, InterfaceC8886 {
    public static final long serialVersionUID = 7249069246763182397L;
    public final Object b;

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        InterfaceC17664 stream;
        stream = C14841.stream(C5378.b(this), true);
        return C18370.convert(stream);
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* renamed from: parallelStream */
    public final /* synthetic */ InterfaceC17664 mo42463parallelStream() {
        InterfaceC17664 stream;
        stream = C14841.stream(C5378.b(this), true);
        return stream;
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return C0438.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream stream() {
        InterfaceC17664 stream;
        stream = C14841.stream(C5378.b(this), false);
        return C18370.convert(stream);
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* renamed from: stream */
    public final /* synthetic */ InterfaceC17664 mo42464stream() {
        InterfaceC17664 stream;
        stream = C14841.stream(C5378.b(this), false);
        return stream;
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    public C1769(ConcurrentMapC10942 concurrentMapC10942, Object obj) {
        super(concurrentMapC10942);
        this.b = obj;
    }

    @Override // l.AbstractC7474, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // l.AbstractC7474, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.a.remove(obj) != null;
    }

    @Override // l.AbstractC7474, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ConcurrentMapC10942 concurrentMapC10942 = this.a;
        C0357[] c0357Arr = concurrentMapC10942.a;
        int length = c0357Arr == null ? 0 : c0357Arr.length;
        return new C3886(c0357Arr, length, length, concurrentMapC10942, 0);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        Object obj2 = this.b;
        if (obj2 != null) {
            return this.a.f(obj, obj2, true) == null;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Object obj = this.b;
        if (obj == null) {
            throw new UnsupportedOperationException();
        }
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (this.a.f(it.next(), obj, true) == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Object it = iterator();
        int i = 0;
        while (((AbstractC23641) it).hasNext()) {
            i += ((C3886) it).next().hashCode();
        }
        return i;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set != this) {
            return containsAll(set) && set.containsAll(this);
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, l.InterfaceC8886, l.InterfaceC4323
    public final InterfaceC15234 spliterator() {
        ConcurrentMapC10942 concurrentMapC10942 = this.a;
        long j = concurrentMapC10942.j();
        C0357[] c0357Arr = concurrentMapC10942.a;
        int length = c0357Arr == null ? 0 : c0357Arr.length;
        return new C18703(c0357Arr, length, 0, length, j < 0 ? 0L : j, 0);
    }

    @Override // java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        C0357[] c0357Arr = this.a.a;
        if (c0357Arr == null) {
            return;
        }
        C15173 c15173 = new C15173(c0357Arr, c0357Arr.length, 0, c0357Arr.length);
        while (true) {
            C0357 a = c15173.a();
            if (a == null) {
                return;
            } else {
                consumer.n(a.b);
            }
        }
    }
}
