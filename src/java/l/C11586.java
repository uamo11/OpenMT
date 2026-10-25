package l;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: M9MB */
/* renamed from: l.ۨ۠᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11586 extends AbstractC10175 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object[] f34538 = new Object[0];

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f34539;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object[] f34540 = f34538;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f34541;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int m28480;
        C11233.m27805(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f34540.length != 0) {
            int m284802 = m28480(this.f34539 + this.f34541);
            int i = this.f34541;
            if (i < m284802) {
                m28480 = i;
                while (i < m284802) {
                    Object obj = this.f34540[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f34540[m28480] = obj;
                        m28480++;
                    }
                    i++;
                }
                C22874.m50972(this.f34540, null, m28480, m284802);
            } else {
                int length = this.f34540.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.f34540;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f34540[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                m28480 = m28480(i2);
                for (int i3 = 0; i3 < m284802; i3++) {
                    Object[] objArr2 = this.f34540;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f34540[m28480] = obj3;
                        m28480 = m28479(m28480);
                    }
                }
                z = z2;
            }
            if (z) {
                m28477();
                this.f34539 = m28478(m28480 - this.f34541);
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int m28480;
        C11233.m27805(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f34540.length != 0) {
            int m284802 = m28480(this.f34539 + this.f34541);
            int i = this.f34541;
            if (i < m284802) {
                m28480 = i;
                while (i < m284802) {
                    Object obj = this.f34540[i];
                    if (collection.contains(obj)) {
                        this.f34540[m28480] = obj;
                        m28480++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                C22874.m50972(this.f34540, null, m28480, m284802);
            } else {
                int length = this.f34540.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.f34540;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f34540[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                m28480 = m28480(i2);
                for (int i3 = 0; i3 < m284802; i3++) {
                    Object[] objArr2 = this.f34540;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f34540[m28480] = obj3;
                        m28480 = m28479(m28480);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m28477();
                this.f34539 = m28478(m28480 - this.f34541);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int mo25534 = mo25534();
        if (i < 0 || i >= mo25534) {
            throw new IndexOutOfBoundsException(C18307.m42646("index: ", i, mo25534, ", size: "));
        }
        return this.f34540[m28480(this.f34541 + i)];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo25534() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int mo25534 = mo25534();
        if (i < 0 || i >= mo25534) {
            throw new IndexOutOfBoundsException(C18307.m42646("index: ", i, mo25534, ", size: "));
        }
        int m28480 = m28480(this.f34541 + i);
        Object[] objArr = this.f34540;
        Object obj2 = objArr[m28480];
        objArr[m28480] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo25534()]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.f34539;
        if (i < 0 || i > i3) {
            throw new IndexOutOfBoundsException(C18307.m42646("index: ", i, i3, ", size: "));
        }
        if (i == i3) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m28477();
        m28475(this.f34539 + 1);
        int m28480 = m28480(this.f34541 + i);
        int i4 = this.f34539;
        if (i < ((i4 + 1) >> 1)) {
            if (m28480 == 0) {
                Object[] objArr = this.f34540;
                C11233.m27805(objArr, "<this>");
                m28480 = objArr.length;
            }
            int i5 = m28480 - 1;
            int i6 = this.f34541;
            if (i6 == 0) {
                Object[] objArr2 = this.f34540;
                C11233.m27805(objArr2, "<this>");
                i2 = objArr2.length - 1;
            } else {
                i2 = i6 - 1;
            }
            int i7 = this.f34541;
            if (i5 >= i7) {
                Object[] objArr3 = this.f34540;
                objArr3[i2] = objArr3[i7];
                C13701.m32950(i7, i7 + 1, i5 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f34540;
                C13701.m32950(i7 - 1, i7, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f34540;
                objArr5[objArr5.length - 1] = objArr5[0];
                C13701.m32950(0, 1, i5 + 1, objArr5, objArr5);
            }
            this.f34540[i5] = obj;
            this.f34541 = i2;
        } else {
            int m284802 = m28480(i4 + this.f34541);
            if (m28480 < m284802) {
                Object[] objArr6 = this.f34540;
                C13701.m32950(m28480 + 1, m28480, m284802, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f34540;
                C13701.m32950(1, 0, m284802, objArr7, objArr7);
                Object[] objArr8 = this.f34540;
                objArr8[0] = objArr8[objArr8.length - 1];
                C13701.m32950(m28480 + 1, m28480, objArr8.length - 1, objArr8, objArr8);
            }
            this.f34540[m28480] = obj;
        }
        this.f34539++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        C11233.m27805(collection, "elements");
        int i2 = this.f34539;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C18307.m42646("index: ", i, i2, ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f34539) {
            return addAll(collection);
        }
        m28477();
        m28475(collection.size() + this.f34539);
        int m28480 = m28480(this.f34539 + this.f34541);
        int m284802 = m28480(this.f34541 + i);
        int size = collection.size();
        if (i >= ((this.f34539 + 1) >> 1)) {
            int i3 = m284802 + size;
            if (m284802 < m28480) {
                int i4 = size + m28480;
                Object[] objArr = this.f34540;
                if (i4 <= objArr.length) {
                    C13701.m32950(i3, m284802, m28480, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    C13701.m32950(i3 - objArr.length, m284802, m28480, objArr, objArr);
                } else {
                    int length = m28480 - (i4 - objArr.length);
                    C13701.m32950(0, length, m28480, objArr, objArr);
                    Object[] objArr2 = this.f34540;
                    C13701.m32950(i3, m284802, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f34540;
                C13701.m32950(size, 0, m28480, objArr3, objArr3);
                Object[] objArr4 = this.f34540;
                if (i3 >= objArr4.length) {
                    C13701.m32950(i3 - objArr4.length, m284802, objArr4.length, objArr4, objArr4);
                } else {
                    C13701.m32950(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f34540;
                    C13701.m32950(i3, m284802, objArr5.length - size, objArr5, objArr5);
                }
            }
            m28474(m284802, collection);
            return true;
        }
        int i5 = this.f34541;
        int i6 = i5 - size;
        if (m284802 < i5) {
            Object[] objArr6 = this.f34540;
            C13701.m32950(i6, i5, objArr6.length, objArr6, objArr6);
            if (size >= m284802) {
                Object[] objArr7 = this.f34540;
                C13701.m32950(objArr7.length - size, 0, m284802, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f34540;
                C13701.m32950(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f34540;
                C13701.m32950(0, size, m284802, objArr9, objArr9);
            }
        } else if (i6 >= 0) {
            Object[] objArr10 = this.f34540;
            C13701.m32950(i6, i5, m284802, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f34540;
            i6 += objArr11.length;
            int i7 = m284802 - i5;
            int length2 = objArr11.length - i6;
            if (length2 >= i7) {
                C13701.m32950(i6, i5, m284802, objArr11, objArr11);
            } else {
                C13701.m32950(i6, i5, i5 + length2, objArr11, objArr11);
                Object[] objArr12 = this.f34540;
                C13701.m32950(0, this.f34541 + length2, m284802, objArr12, objArr12);
            }
        }
        this.f34541 = i6;
        m28474(m28478(m284802 - size), collection);
        return true;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        C20053.m46240(i, i2, this.f34539);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f34539) {
            clear();
            return;
        }
        if (i3 == 1) {
            mo25533(i);
            return;
        }
        m28477();
        if (i < this.f34539 - i2) {
            int m28480 = m28480(this.f34541 + (i - 1));
            int m284802 = m28480(this.f34541 + (i2 - 1));
            while (i > 0) {
                int i4 = m28480 + 1;
                int min = Math.min(i, Math.min(i4, m284802 + 1));
                Object[] objArr = this.f34540;
                int i5 = m284802 - min;
                int i6 = m28480 - min;
                C13701.m32950(i5 + 1, i6 + 1, i4, objArr, objArr);
                m28480 = m28478(i6);
                m284802 = m28478(i5);
                i -= min;
            }
            int m284803 = m28480(this.f34541 + i3);
            m28476(this.f34541, m284803);
            this.f34541 = m284803;
        } else {
            int m284804 = m28480(this.f34541 + i2);
            int m284805 = m28480(this.f34541 + i);
            int i7 = this.f34539;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f34540;
                i2 = Math.min(i7, Math.min(objArr2.length - m284804, objArr2.length - m284805));
                Object[] objArr3 = this.f34540;
                int i8 = m284804 + i2;
                C13701.m32950(m284805, m284804, i8, objArr3, objArr3);
                m284804 = m28480(i8);
                m284805 = m28480(m284805 + i2);
            }
            int m284806 = m28480(this.f34539 + this.f34541);
            m28476(m28478(m284806 - i3), m284806);
        }
        this.f34539 -= i3;
    }

    @Override // l.AbstractC10175
    /* renamed from: ֫ */
    public final Object mo25533(int i) {
        int i2 = this.f34539;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C18307.m42646("index: ", i, i2, ", size: "));
        }
        if (i == C1913.m6271((List) this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m28477();
        int m28480 = m28480(this.f34541 + i);
        Object[] objArr = this.f34540;
        Object obj = objArr[m28480];
        if (i < (this.f34539 >> 1)) {
            int i3 = this.f34541;
            if (m28480 >= i3) {
                C13701.m32950(i3 + 1, i3, m28480, objArr, objArr);
            } else {
                C13701.m32950(1, 0, m28480, objArr, objArr);
                Object[] objArr2 = this.f34540;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.f34541;
                C13701.m32950(i4 + 1, i4, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f34540;
            int i5 = this.f34541;
            objArr3[i5] = null;
            this.f34541 = m28479(i5);
        } else {
            int m284802 = m28480(C1913.m6271((List) this) + this.f34541);
            if (m28480 <= m284802) {
                Object[] objArr4 = this.f34540;
                C13701.m32950(m28480, m28480 + 1, m284802 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f34540;
                C13701.m32950(m28480, m28480 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f34540;
                objArr6[objArr6.length - 1] = objArr6[0];
                C13701.m32950(0, 1, m284802 + 1, objArr6, objArr6);
            }
            this.f34540[m284802] = null;
        }
        this.f34539--;
        return obj;
    }

    @Override // l.AbstractC10175
    /* renamed from: ۧ */
    public final int mo25534() {
        return this.f34539;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final void m28475(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f34540;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f34538) {
            if (i < 10) {
                i = 10;
            }
            this.f34540 = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        C13701.m32950(0, this.f34541, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f34540;
        int length2 = objArr3.length;
        int i3 = this.f34541;
        C13701.m32950(length2 - i3, 0, i3, objArr3, objArr2);
        this.f34541 = 0;
        this.f34540 = objArr2;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private final int m28480(int i) {
        Object[] objArr = this.f34540;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private final int m28478(int i) {
        return i < 0 ? i + this.f34540.length : i;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private final int m28479(int i) {
        C11233.m27805(this.f34540, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final void addFirst(Object obj) {
        m28477();
        m28475(this.f34539 + 1);
        int i = this.f34541;
        if (i == 0) {
            Object[] objArr = this.f34540;
            C11233.m27805(objArr, "<this>");
            i = objArr.length;
        }
        int i2 = i - 1;
        this.f34541 = i2;
        this.f34540[i2] = obj;
        this.f34539++;
    }

    public final void addLast(Object obj) {
        m28477();
        m28475(mo25534() + 1);
        this.f34540[m28480(mo25534() + this.f34541)] = obj;
        this.f34539 = mo25534() + 1;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m28477();
        Object[] objArr = this.f34540;
        int i = this.f34541;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f34541 = m28479(i);
        this.f34539 = mo25534() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m28477();
        int m28480 = m28480(C1913.m6271((List) this) + this.f34541);
        Object[] objArr = this.f34540;
        Object obj = objArr[m28480];
        objArr[m28480] = null;
        this.f34539 = mo25534() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m28474(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f34540.length;
        while (i < length && it.hasNext()) {
            this.f34540[i] = it.next();
            i++;
        }
        int i2 = this.f34541;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f34540[i3] = it.next();
        }
        this.f34539 = collection.size() + this.f34539;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        C11233.m27805(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m28477();
        m28475(collection.size() + mo25534());
        m28474(m28480(mo25534() + this.f34541), collection);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int m28480 = m28480(mo25534() + this.f34541);
        int i2 = this.f34541;
        if (i2 < m28480) {
            while (i2 < m28480) {
                if (C11233.m27802(obj, this.f34540[i2])) {
                    i = this.f34541;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (isEmpty() || (i2 = this.f34541) < m28480) {
            return -1;
        }
        int length = this.f34540.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < m28480; i3++) {
                    if (C11233.m27802(obj, this.f34540[i3])) {
                        i2 = i3 + this.f34540.length;
                        i = this.f34541;
                    }
                }
                return -1;
            }
            if (C11233.m27802(obj, this.f34540[i2])) {
                i = this.f34541;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int m28480 = m28480(this.f34539 + this.f34541);
        int i2 = this.f34541;
        if (i2 < m28480) {
            length = m28480 - 1;
            if (i2 <= length) {
                while (!C11233.m27802(obj, this.f34540[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f34541;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.f34541 >= m28480) {
            while (true) {
                m28480--;
                if (-1 >= m28480) {
                    Object[] objArr = this.f34540;
                    C11233.m27805(objArr, "<this>");
                    length = objArr.length - 1;
                    int i3 = this.f34541;
                    if (i3 <= length) {
                        while (!C11233.m27802(obj, this.f34540[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.f34541;
                    }
                } else if (C11233.m27802(obj, this.f34540[m28480])) {
                    length = m28480 + this.f34540.length;
                    i = this.f34541;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        mo25533(indexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m28477();
            m28476(this.f34541, m28480(mo25534() + this.f34541));
        }
        this.f34541 = 0;
        this.f34539 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        C11233.m27805(objArr, "array");
        int length = objArr.length;
        int i = this.f34539;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            C11233.m27800(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int m28480 = m28480(this.f34539 + this.f34541);
        int i2 = this.f34541;
        if (i2 < m28480) {
            C22874.m50973(this.f34540, objArr, 0, i2, m28480, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f34540;
            C13701.m32950(0, this.f34541, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f34540;
            C13701.m32950(objArr3.length - this.f34541, 0, m28480, objArr3, objArr);
        }
        int i3 = this.f34539;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final void m28476(int i, int i2) {
        if (i < i2) {
            C22874.m50972(this.f34540, null, i, i2);
            return;
        }
        Object[] objArr = this.f34540;
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        C22874.m50972(this.f34540, null, 0, i2);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private final void m28477() {
        ((AbstractList) this).modCount++;
    }
}
