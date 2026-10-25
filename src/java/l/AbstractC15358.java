package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: H32 */
/* renamed from: l.ܶܽᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC15358 extends AbstractC4071 implements InterfaceC4818, InterfaceC11728 {
    @Override // l.AbstractC4071, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.AbstractC4071, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public /* synthetic */ InterfaceC15234 spliterator() {
        return C10317.$default$spliterator(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        mo4104(((Float) obj).floatValue(), i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return Float.valueOf(mo4099(((Float) obj).floatValue(), i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36401(int i) {
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
    public final void m36402(int i) {
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

    @Override // l.AbstractC4071, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public InterfaceC16791 spliterator() {
        if (this instanceof RandomAccess) {
            return new C8304(this);
        }
        return new C6914(listIterator(0), C4248.m12789(this), 16720);
    }

    @Override // java.util.List, l.InterfaceC11728
    public final void sort(Comparator comparator) {
        InterfaceC6935 interfaceC6935;
        if (comparator == null || (comparator instanceof InterfaceC6935)) {
            interfaceC6935 = (InterfaceC6935) comparator;
        } else {
            interfaceC6935 = new C21047(comparator);
        }
        mo14044(interfaceC6935);
    }

    public boolean addAll(int i, Collection collection) {
        if (collection instanceof InterfaceC11169) {
            return mo4103(i, (InterfaceC11169) collection);
        }
        m36401(i);
        Iterator it = collection.iterator();
        boolean hasNext = it.hasNext();
        while (it.hasNext()) {
            mo4104(((Float) it.next()).floatValue(), i);
            i++;
        }
        return hasNext;
    }

    @Override // l.AbstractC4071, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        InterfaceC3407 listIterator = listIterator(0);
        int size = size();
        int i = 1;
        while (true) {
            int i2 = size - 1;
            if (size == 0) {
                return i;
            }
            i = (i * 31) + Float.floatToRawIntBits(listIterator.nextFloat());
            size = i2;
        }
    }

    @Override // l.AbstractC4071, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC4071, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public InterfaceC1290 iterator() {
        return listIterator(0);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.InterfaceC4818, java.util.List
    public final InterfaceC3407 listIterator() {
        return listIterator(0);
    }

    /* renamed from: ᩳ */
    public int mo14045(float f) {
        InterfaceC3407 listIterator = listIterator(0);
        while (listIterator.hasNext()) {
            if (Float.floatToRawIntBits(f) == Float.floatToRawIntBits(listIterator.nextFloat())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // l.InterfaceC11169
    /* renamed from: ܳ */
    public final boolean mo17038(float f) {
        return mo14045(f) >= 0;
    }

    /* renamed from: ۧ */
    public int mo14043(float f) {
        InterfaceC3407 listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Float.floatToRawIntBits(f) == Float.floatToRawIntBits(listIterator.mo2281())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // l.AbstractC4071, l.InterfaceC0584
    /* renamed from: ۧ */
    public void mo2423(InterfaceC4113 interfaceC4113) {
        if (!(this instanceof RandomAccess)) {
            iterator().forEachRemaining(interfaceC4113);
            return;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            interfaceC4113.mo12346(getFloat(i));
        }
    }

    @Override // java.util.List, l.InterfaceC11728
    public final void replaceAll(final UnaryOperator unaryOperator) {
        C11003.requireNonNull(unaryOperator);
        InterfaceC9737 interfaceC9737 = unaryOperator instanceof InterfaceC9737 ? (InterfaceC9737) unaryOperator : new InterfaceC9737() { // from class: l.᩶ᩳᩴ
            public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
                return C6584.$default$andThen(this, doubleUnaryOperator);
            }

            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
                return C6584.$default$compose(this, doubleUnaryOperator);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // l.InterfaceC9737
            /* renamed from: ۧ */
            public final float mo24727(float f) {
                return ((Float) UnaryOperator.this.apply(Float.valueOf(f))).floatValue();
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Float.valueOf(mo24727(((Float) obj).floatValue()));
            }

            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                return mo24727(C2837.m8730(d));
            }
        };
        InterfaceC3407 listIterator = listIterator(0);
        while (listIterator.hasNext()) {
            listIterator.mo2279(interfaceC9737.mo24727(listIterator.nextFloat()));
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Float.valueOf(getFloat(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        mo4100(0, size());
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return mo14045(((Float) obj).floatValue());
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return mo14043(((Float) obj).floatValue());
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
                if (list instanceof InterfaceC4818) {
                    InterfaceC3407 listIterator = listIterator(0);
                    InterfaceC3407 listIterator2 = ((InterfaceC4818) list).listIterator();
                    while (true) {
                        int i = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (listIterator.nextFloat() != listIterator2.nextFloat()) {
                            break;
                        }
                        size = i;
                    }
                } else {
                    InterfaceC3407 listIterator3 = listIterator(0);
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
    /* renamed from: ֫ */
    public int compareTo(List list) {
        if (list != this) {
            if (list instanceof InterfaceC4818) {
                InterfaceC3407 listIterator = listIterator(0);
                InterfaceC3407 listIterator2 = ((InterfaceC4818) list).listIterator();
                while (listIterator.hasNext() && listIterator2.hasNext()) {
                    int compare = Float.compare(listIterator.nextFloat(), listIterator2.nextFloat());
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
                InterfaceC3407 listIterator3 = listIterator(0);
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
        return Float.valueOf(mo4105(i));
    }

    /* renamed from: ۧ */
    public void mo14044(InterfaceC6935 interfaceC6935) {
        float[] fArr;
        int size = size();
        if (size == 0) {
            fArr = C13947.f41626;
        } else {
            float[] fArr2 = new float[size];
            mo4101(0, 0, size, fArr2);
            fArr = fArr2;
        }
        if (interfaceC6935 == null) {
            C13947.m33387(0, fArr.length, fArr, null);
        } else {
            C13947.m33388(fArr, 0, fArr.length, interfaceC6935, null);
        }
        mo4102(0, fArr.length, fArr);
    }

    /* renamed from: ֫ */
    public boolean mo4103(int i, InterfaceC11169 interfaceC11169) {
        m36401(i);
        InterfaceC1290 it = interfaceC11169.iterator();
        boolean hasNext = it.hasNext();
        while (it.hasNext()) {
            mo4104(it.nextFloat(), i);
            i++;
        }
        return hasNext;
    }

    @Override // l.AbstractC4071
    /* renamed from: ֫ */
    public final boolean mo12230(InterfaceC11169 interfaceC11169) {
        return mo4103(size(), interfaceC11169);
    }

    @Override // l.AbstractC4071, java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        InterfaceC3407 listIterator = listIterator(0);
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
                sb.append(String.valueOf(listIterator.nextFloat()));
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
}
