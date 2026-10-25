package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* compiled from: N673 */
/* renamed from: l.᩺ۛᩴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C22811 implements Collection, Serializable, InterfaceC1144 {
    public static final long serialVersionUID = 3053995032091335093L;
    public final Collection a;
    public final Object b;

    @Override // java.util.Collection, l.InterfaceC1144
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    public C22811(Collection collection) {
        this.a = (Collection) C11003.requireNonNull(collection);
        this.b = this;
    }

    public C22811(Collection collection, Object obj) {
        this.a = (Collection) C11003.requireNonNull(collection);
        this.b = C11003.requireNonNull(obj);
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.b) {
            size = this.a.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.b) {
            isEmpty = this.a.isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        boolean contains;
        synchronized (this.b) {
            contains = this.a.contains(obj);
        }
        return contains;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.b) {
            array = this.a.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.b) {
            array = this.a.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        boolean add;
        synchronized (this.b) {
            add = this.a.add(obj);
        }
        return add;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        boolean remove;
        synchronized (this.b) {
            remove = this.a.remove(obj);
        }
        return remove;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        boolean containsAll;
        synchronized (this.b) {
            containsAll = this.a.containsAll(collection);
        }
        return containsAll;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean addAll;
        synchronized (this.b) {
            addAll = this.a.addAll(collection);
        }
        return addAll;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean removeAll;
        synchronized (this.b) {
            removeAll = this.a.removeAll(collection);
        }
        return removeAll;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean retainAll;
        synchronized (this.b) {
            retainAll = this.a.retainAll(collection);
        }
        return retainAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.b) {
            this.a.clear();
        }
    }

    public final String toString() {
        String obj;
        synchronized (this.b) {
            obj = this.a.toString();
        }
        return obj;
    }

    @Override // java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        synchronized (this.b) {
            C5378.a(this.a, consumer);
        }
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public final boolean removeIf(Predicate predicate) {
        boolean removeIf;
        synchronized (this.b) {
            removeIf = C5378.removeIf(this.a, predicate);
        }
        return removeIf;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return C8180.convert(C5378.b(this.a));
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return C5378.b(this.a);
    }

    @Override // java.util.Collection
    public final Stream stream() {
        return C18370.convert(C5378.stream(this.a));
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* renamed from: stream */
    public final InterfaceC17664 mo42464stream() {
        return C5378.stream(this.a);
    }

    @Override // java.util.Collection
    public final Stream parallelStream() {
        return C18370.convert(C5378.parallelStream(this.a));
    }

    @Override // java.util.Collection, l.InterfaceC1144
    /* renamed from: parallelStream */
    public final InterfaceC17664 mo42463parallelStream() {
        return C5378.parallelStream(this.a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.b) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
