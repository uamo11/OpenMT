package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* compiled from: D26 */
/* renamed from: l.᩺֫ᩴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C22688 implements InterfaceC5755, Serializable, InterfaceC1144 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC5755 f73316;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C10142 f73317;

    @Override // java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final /* synthetic */ void forEach(Consumer consumer) {
        C20841.m47659(this, consumer);
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return C18370.convert(parallelStream());
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return C9989.m25150(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream stream() {
        return C18370.convert(stream());
    }

    @Override // java.util.Collection, l.InterfaceC1144
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    public C22688(InterfaceC11668 interfaceC11668, C10142 c10142) {
        C11003.requireNonNull(interfaceC11668);
        this.f73316 = interfaceC11668;
        this.f73317 = c10142;
    }

    @Override // l.InterfaceC5755
    /* renamed from: ۧ */
    public boolean mo8955(char c) {
        boolean mo8955;
        synchronized (this.f73317) {
            mo8955 = this.f73316.mo8955(c);
        }
        return mo8955;
    }

    @Override // l.InterfaceC5755
    /* renamed from: ᩻ */
    public boolean mo8956(char c) {
        boolean mo8956;
        synchronized (this.f73317) {
            mo8956 = this.f73316.mo8956(c);
        }
        return mo8956;
    }

    @Override // l.InterfaceC5755
    /* renamed from: ܿ */
    public boolean mo2005(char c) {
        boolean mo2005;
        synchronized (this.f73317) {
            mo2005 = this.f73316.mo2005(c);
        }
        return mo2005;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f73317) {
            size = this.f73316.size();
        }
        return size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f73317) {
            isEmpty = this.f73316.isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f73317) {
            array = this.f73316.toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    @Deprecated
    /* renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public boolean add(Character ch) {
        boolean add;
        synchronized (this.f73317) {
            add = this.f73316.add(ch);
        }
        return add;
    }

    @Override // l.InterfaceC5755, java.util.Collection
    @Deprecated
    public boolean contains(Object obj) {
        boolean contains;
        synchronized (this.f73317) {
            contains = this.f73316.contains(obj);
        }
        return contains;
    }

    @Override // l.InterfaceC5755, java.util.Collection
    @Deprecated
    public boolean remove(Object obj) {
        boolean remove;
        synchronized (this.f73317) {
            remove = this.f73316.remove(obj);
        }
        return remove;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f73317) {
            array = this.f73316.toArray(objArr);
        }
        return array;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public InterfaceC15900 iterator() {
        return this.f73316.iterator();
    }

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public InterfaceC16770 spliterator() {
        return this.f73316.spliterator();
    }

    @Override // l.InterfaceC5755, java.util.Collection
    @Deprecated
    public InterfaceC17664 stream() {
        return this.f73316.stream();
    }

    @Override // l.InterfaceC5755, java.util.Collection
    @Deprecated
    public InterfaceC17664 parallelStream() {
        return this.f73316.parallelStream();
    }

    @Override // l.InterfaceC9552
    /* renamed from: ֫ */
    public void mo10076(InterfaceC23662 interfaceC23662) {
        synchronized (this.f73317) {
            this.f73316.mo10076(interfaceC23662);
        }
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        boolean addAll;
        synchronized (this.f73317) {
            addAll = this.f73316.addAll(collection);
        }
        return addAll;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        boolean containsAll;
        synchronized (this.f73317) {
            containsAll = this.f73316.containsAll(collection);
        }
        return containsAll;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean removeAll;
        synchronized (this.f73317) {
            removeAll = this.f73316.removeAll(collection);
        }
        return removeAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean retainAll;
        synchronized (this.f73317) {
            retainAll = this.f73316.retainAll(collection);
        }
        return retainAll;
    }

    @Override // l.InterfaceC5755
    /* renamed from: ֫ */
    public boolean mo16207(InterfaceC6023 interfaceC6023) {
        boolean mo16207;
        synchronized (this.f73317) {
            mo16207 = this.f73316.mo16207(interfaceC6023);
        }
        return mo16207;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f73317) {
            this.f73316.clear();
        }
    }

    public String toString() {
        String obj;
        synchronized (this.f73317) {
            obj = this.f73316.toString();
        }
        return obj;
    }

    @Override // java.util.Collection
    public int hashCode() {
        int hashCode;
        synchronized (this.f73317) {
            hashCode = this.f73316.hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f73317) {
            equals = this.f73316.equals(obj);
        }
        return equals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f73317) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
