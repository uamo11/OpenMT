package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: ZARU */
/* renamed from: l.֫᩷֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C2064 implements Set {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f6883 = 0;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f6884;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f6885;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f6886;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object[][] f6887;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC2821 f6888;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object mo6748(Object obj) {
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object[] mo6749(int i) {
        throw null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object[][] mo6751(int i) {
        throw null;
    }

    public C2064(AbstractC2821 abstractC2821, int i) {
        this.f6888 = abstractC2821 == null ? C7003.f21607 : abstractC2821;
        this.f6884 = 16;
        this.f6886 = i;
        this.f6887 = mo6751(16);
        this.f6885 = (int) Math.floor(16 * 0.75d);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object m6754(Object obj) {
        Object[] objArr;
        int i = this.f6883;
        int i2 = this.f6885;
        int i3 = this.f6886;
        if (i > i2) {
            Object[][] objArr2 = this.f6887;
            int length = objArr2.length * 2;
            Object[][] mo6751 = mo6751(length);
            int[] iArr = new int[mo6751.length];
            this.f6887 = mo6751;
            this.f6885 = (int) (length * 0.75d);
            for (Object[] objArr3 : objArr2) {
                if (objArr3 != null) {
                    for (Object obj2 : objArr3) {
                        if (obj2 == null) {
                            break;
                        }
                        int m6752 = m6752(obj2);
                        int i4 = iArr[m6752];
                        if (i4 == 0) {
                            objArr = mo6749(i3);
                            mo6751[m6752] = objArr;
                        } else {
                            objArr = mo6751[m6752];
                            if (i4 == objArr.length) {
                                objArr = Arrays.copyOf(objArr, objArr.length * 2);
                                mo6751[m6752] = objArr;
                            }
                        }
                        objArr[i4] = obj2;
                        iArr[m6752] = iArr[m6752] + 1;
                    }
                }
            }
        }
        int m67522 = m6752(obj);
        Object[] objArr4 = this.f6887[m67522];
        if (objArr4 == null) {
            Object[] mo6749 = mo6749(i3);
            mo6749[0] = obj;
            this.f6887[m67522] = mo6749;
            this.f6883++;
            return obj;
        }
        for (int i5 = 0; i5 < objArr4.length; i5++) {
            Object obj3 = objArr4[i5];
            if (obj3 == null) {
                objArr4[i5] = obj;
                this.f6883++;
                return obj;
            }
            if (this.f6888.mo8715(obj3, obj)) {
                return obj3;
            }
        }
        int length2 = objArr4.length;
        Object[] copyOf = Arrays.copyOf(objArr4, objArr4.length * 2);
        this.f6887[m67522] = copyOf;
        copyOf[length2] = obj;
        this.f6883++;
        return obj;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m6750(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f6887[m6752(obj)];
            Object obj2 = null;
            if (objArr != null) {
                int length = objArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj3 = objArr[i];
                        if (obj3 == null) {
                            break;
                        }
                        if (this.f6888.mo8715(obj3, obj)) {
                            obj2 = obj3;
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            if (obj2 != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m6752(Object obj) {
        return this.f6888.mo8711(obj) & (this.f6887.length - 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int i = 0;
        for (Object[] objArr : this.f6887) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        break;
                    }
                    i = C2093.m6876(i, this.f6888.mo8711(obj));
                }
            }
        }
        return C2093.m6873(i, this.f6883);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2064)) {
            return false;
        }
        C2064 c2064 = (C2064) obj;
        if (c2064.f6883 != this.f6883) {
            return false;
        }
        return containsAll(c2064);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return m6754(obj) == obj;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f6883;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        Object[] mo6749 = mo6749(this.f6883);
        int i = 0;
        for (Object[] objArr : this.f6887) {
            if (objArr != null) {
                int length = objArr.length;
                int i2 = 0;
                while (i2 < length) {
                    Object obj = objArr[i2];
                    if (obj == null) {
                        break;
                    }
                    mo6749[i] = obj;
                    i2++;
                    i++;
                }
            }
        }
        return mo6749;
    }

    public final String toString() {
        if (this.f6883 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        for (Object[] objArr : this.f6887) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        break;
                    }
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(obj.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f6883 == 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return m6750(mo6748(obj));
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C7294(this, toArray());
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f6883;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = 0;
        for (Object[] objArr2 : this.f6887) {
            if (objArr2 != null) {
                int length2 = objArr2.length;
                int i3 = 0;
                while (i3 < length2) {
                    Object obj = objArr2[i3];
                    if (obj == null) {
                        break;
                    }
                    objArr[i2] = obj;
                    i3++;
                    i2++;
                }
            }
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return m6753(mo6748(obj));
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m6753(Object obj) {
        Object obj2;
        if (obj != null) {
            Object[] objArr = this.f6887[m6752(obj)];
            if (objArr != null) {
                for (int i = 0; i < objArr.length && (obj2 = objArr[i]) != null; i++) {
                    if (this.f6888.mo8715(obj2, obj)) {
                        System.arraycopy(objArr, i + 1, objArr, i, (objArr.length - i) - 1);
                        objArr[objArr.length - 1] = null;
                        this.f6883--;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        continue;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsAll(java.util.Collection r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof l.C2064
            r1 = 0
            if (r0 == 0) goto L2c
            l.֫᩷֡ r8 = (l.C2064) r8
            java.lang.Object[][] r8 = r8.f6887
            int r0 = r8.length
            r2 = 0
        Lb:
            if (r2 >= r0) goto L45
            r3 = r8[r2]
            if (r3 != 0) goto L12
            goto L29
        L12:
            int r4 = r3.length
            r5 = 0
        L14:
            if (r5 >= r4) goto L29
            r6 = r3[r5]
            if (r6 != 0) goto L1b
            goto L29
        L1b:
            java.lang.Object r6 = r7.mo6748(r6)
            boolean r6 = r7.m6750(r6)
            if (r6 != 0) goto L26
            goto L44
        L26:
            int r5 = r5 + 1
            goto L14
        L29:
            int r2 = r2 + 1
            goto Lb
        L2c:
            java.util.Iterator r8 = r8.iterator()
        L30:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r8.next()
            java.lang.Object r0 = r7.mo6748(r0)
            boolean r0 = r7.m6750(r0)
            if (r0 != 0) goto L30
        L44:
            return r1
        L45:
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2064.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            if (m6754(obj) != obj) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Object obj;
        int i = 0;
        for (Object[] objArr : this.f6887) {
            if (objArr != null) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < objArr.length && (obj = objArr[i2]) != null) {
                    if (collection.contains(obj)) {
                        if (i2 != i3) {
                            objArr[i3] = objArr[i2];
                        }
                        i3++;
                        i++;
                    }
                    i2++;
                }
                i += i3;
                while (i3 < i2) {
                    objArr[i3] = null;
                    i3++;
                }
            }
        }
        boolean z = i != this.f6883;
        this.f6883 = i;
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= m6753(mo6748(it.next()));
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f6883 = 0;
        int i = this.f6884;
        this.f6887 = mo6751(i);
        this.f6885 = (int) Math.floor(i * 0.75d);
    }
}
