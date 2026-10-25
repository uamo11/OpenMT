package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

/* compiled from: QUZ */
/* renamed from: l.᩵ܰۘ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC19499 extends AbstractC20910 implements InterfaceC1084, InterfaceC11728 {
    @Override // l.AbstractC20910, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.AbstractC20910, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public /* synthetic */ InterfaceC15234 spliterator() {
        return C10317.$default$spliterator(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        mo3752(((Character) obj).charValue(), i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return Character.valueOf(mo3747(((Character) obj).charValue(), i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44912(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(C18307.m42645(i, "Index (", ") is negative"));
        }
        if (i <= size()) {
            return;
        }
        StringBuilder m32308 = C13325.m32308(i, "Index (", ") is greater than list size (");
        m32308.append(size());
        m32308.append(MotionUtils.EASING_TYPE_FORMAT_END);
        throw new IndexOutOfBoundsException(m32308.toString());
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m44913(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(C18307.m42645(i, "Index (", ") is negative"));
        }
        if (i < size()) {
            return;
        }
        StringBuilder m32308 = C13325.m32308(i, "Index (", ") is greater than or equal to list size (");
        m32308.append(size());
        m32308.append(MotionUtils.EASING_TYPE_FORMAT_END);
        throw new IndexOutOfBoundsException(m32308.toString());
    }

    @Override // l.AbstractC20910, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public InterfaceC16770 spliterator() {
        if (this instanceof RandomAccess) {
            return new C18793(this);
        }
        return new C9716(listIterator(0), C4248.m12789(this), 16720);
    }

    @Override // java.util.List, l.InterfaceC11728
    public final void sort(Comparator comparator) {
        InterfaceC1790 interfaceC1790;
        if (comparator == null || (comparator instanceof InterfaceC1790)) {
            interfaceC1790 = (InterfaceC1790) comparator;
        } else {
            interfaceC1790 = new C10963(comparator);
        }
        mo3750(interfaceC1790);
    }

    public boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC5755) {
            return mo12022(i, (InterfaceC5755) collection);
        }
        m44912(i);
        Iterator it = collection.iterator();
        boolean hasNext = it.hasNext();
        while (it.hasNext()) {
            mo3752(((Character) it.next()).charValue(), i);
            i++;
        }
        return hasNext;
    }

    @Override // l.AbstractC20910, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        InterfaceC15194 listIterator = listIterator(0);
        int size = size();
        int i = 1;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return i;
            }
            i = (i * 31) + listIterator.mo7691();
            size = i2;
        }
    }

    @Override // l.InterfaceC1084
    public int indexOf(char c) {
        InterfaceC15194 listIterator = listIterator(0);
        while (listIterator.hasNext()) {
            if (c == listIterator.mo7691()) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // l.AbstractC20910, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC20910, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public InterfaceC15900 iterator() {
        return listIterator(0);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.InterfaceC1084, java.util.List
    public final InterfaceC15194 listIterator() {
        return listIterator(0);
    }

    @Override // l.InterfaceC5755
    /* renamed from: ᩻ */
    public final boolean mo8956(char c) {
        return indexOf(c) >= 0;
    }

    @Override // l.InterfaceC1084
    public int lastIndexOf(char c) {
        InterfaceC15194 listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (c == listIterator.mo7697()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // l.AbstractC20910, l.InterfaceC9552
    /* renamed from: ֫ */
    public void mo10076(InterfaceC23662 interfaceC23662) {
        if (!(this instanceof RandomAccess)) {
            iterator().forEachRemaining(interfaceC23662);
            return;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            interfaceC23662.mo18328(getChar(i));
        }
    }

    @Override // java.util.List, l.InterfaceC11728
    public final void replaceAll(final UnaryOperator unaryOperator) {
        C11003.requireNonNull(unaryOperator);
        InterfaceC2660 interfaceC2660 = unaryOperator instanceof InterfaceC2660 ? (InterfaceC2660) unaryOperator : new InterfaceC2660() { // from class: l.ۚۧᩴ
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                return C15755.$default$andThen(this, intUnaryOperator);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }

            public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                return C15755.$default$compose(this, intUnaryOperator);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // l.InterfaceC2660
            /* renamed from: ᩻ */
            public final char mo8347(char c) {
                return ((Character) UnaryOperator.this.apply(Character.valueOf(c))).charValue();
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Character.valueOf(mo8347(((Character) obj).charValue()));
            }

            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i) {
                return mo8347(C2837.m8732(i));
            }
        };
        InterfaceC15194 listIterator = listIterator(0);
        while (listIterator.hasNext()) {
            listIterator.mo7696(interfaceC2660.mo8347(listIterator.mo7691()));
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Character.valueOf(getChar(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo3748(0, size());
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return indexOf(((Character) obj).charValue());
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return lastIndexOf(((Character) obj).charValue());
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof InterfaceC1084) {
                    InterfaceC15194 listIterator = listIterator(0);
                    InterfaceC15194 listIterator2 = ((InterfaceC1084) list).listIterator();
                    while (true) {
                        int i = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (listIterator.mo7691() != listIterator2.mo7691()) {
                            break;
                        }
                        size = i;
                    }
                } else {
                    InterfaceC15194 listIterator3 = listIterator(0);
                    ListIterator listIterator4 = list.listIterator();
                    while (true) {
                        int i2 = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (!C11003.equals(listIterator3.next(), listIterator4.next())) {
                            break;
                        }
                        size = i2;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public int compareTo(List list) {
        if (list != this) {
            if (list instanceof InterfaceC1084) {
                InterfaceC15194 listIterator = listIterator(0);
                InterfaceC15194 listIterator2 = ((InterfaceC1084) list).listIterator();
                while (listIterator.hasNext() && listIterator2.hasNext()) {
                    int compare = Character.compare(listIterator.mo7691(), listIterator2.mo7691());
                    if (compare != 0) {
                        return compare;
                    }
                }
                if (listIterator2.hasNext()) {
                    return -1;
                }
                if (listIterator.hasNext()) {
                    return 1;
                }
            } else {
                InterfaceC15194 listIterator3 = listIterator(0);
                ListIterator listIterator4 = list.listIterator();
                while (listIterator3.hasNext() && listIterator4.hasNext()) {
                    int compareTo = ((Comparable) listIterator3.next()).compareTo(listIterator4.next());
                    if (compareTo != 0) {
                        return compareTo;
                    }
                }
                if (listIterator4.hasNext()) {
                    return -1;
                }
                if (listIterator3.hasNext()) {
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return Character.valueOf(mo3746(i));
    }

    @Override // l.InterfaceC1084
    /* renamed from: ۧ */
    public void mo3753(InterfaceC1790 interfaceC1790) {
        char[] cArr;
        int size = size();
        if (size == 0) {
            cArr = C12810.f38455;
        } else {
            char[] cArr2 = new char[size];
            mo3749(0, 0, cArr2, size);
            cArr = cArr2;
        }
        if (interfaceC1790 == null) {
            C12810.m31124(cArr, cArr.length);
        } else {
            C12810.m31126(cArr, 0, cArr.length, interfaceC1790);
        }
        mo3751(cArr, 0, cArr.length);
    }

    /* renamed from: ֫ */
    public boolean mo12022(int i, InterfaceC5755 interfaceC5755) {
        m44912(i);
        InterfaceC15900 it = interfaceC5755.iterator();
        boolean hasNext = it.hasNext();
        while (it.hasNext()) {
            mo3752(it.mo7691(), i);
            i++;
        }
        return hasNext;
    }

    @Override // l.AbstractC20910
    /* renamed from: ֫ */
    public final boolean mo28161(InterfaceC5755 interfaceC5755) {
        return mo12022(size(), interfaceC5755);
    }

    @Override // l.AbstractC20910, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        InterfaceC15194 listIterator = listIterator(0);
        int size = size();
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(String.valueOf(listIterator.mo7691()));
                size = i;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // l.InterfaceC1084
    /* renamed from: ֫ */
    public void mo3750(InterfaceC1790 interfaceC1790) {
        char[] cArr;
        if (interfaceC1790 != null) {
            int size = size();
            if (size == 0) {
                cArr = C12810.f38455;
            } else {
                char[] cArr2 = new char[size];
                mo3749(0, 0, cArr2, size);
                cArr = cArr2;
            }
            C12810.m31127(cArr, 0, cArr.length, interfaceC1790, (char[]) null);
            mo3751(cArr, 0, cArr.length);
            return;
        }
        mo3753(interfaceC1790);
    }
}
