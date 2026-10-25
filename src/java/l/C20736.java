package l;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: 1BJ4 */
/* renamed from: l.᩷۟ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20736 extends AbstractList {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10858 f66760 = new C10858();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47347(C20736 c20736) {
        ((AbstractList) c20736).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m47353((C11747) obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        C11747 c11747 = get(i);
        this.f66760.m27153(i, (C11747) obj);
        return c11747;
    }

    public C20736() {
    }

    public C20736(int i) {
    }

    public C20736(Collection collection) {
        addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f66760.m27149(), collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f66760.m27149();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47348(int i) {
        int m27149 = this.f66760.m27149() - 1;
        int i2 = 0;
        while (i2 <= m27149) {
            int i3 = (i2 + m27149) >>> 1;
            int m47357 = m47357(i3);
            if (i < m47357) {
                m27149 = i3 - 1;
            } else {
                if (i <= m47357) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47353(C11747 c11747) {
        add(this.f66760.m27149(), c11747);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m47356(int i) {
        return i == this.f66760.m27149() - 1 || m47357(i + 1) != m47357(i);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m47363() {
        return this.f66760.m27149() == 1 && m47355(0) == m47358(0);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m47364() {
        return this.f66760.m27149() - 1;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m47367(int i, int i2) {
        if (i2 >= 0) {
            int m27149 = this.f66760.m27149();
            if (m27149 == 0) {
                return -1;
            }
            int min = Math.min(i2, m27149 - 1);
            int m47357 = m47357(min);
            if (m47357 == i) {
                return min;
            }
            if (m47357 < i) {
                int m47345 = m47345(i, min, false);
                if (m47345 >= m27149 || m47357(m47345) != i) {
                    return -1;
                }
                return m47345;
            }
            int m473452 = m47345(i, min, true) - 1;
            if (m473452 < 0 || m47357(m473452) != i) {
                return -1;
            }
            return m473452;
        }
        throw new IndexOutOfBoundsException("Negative line index");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f66760.m27143();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final C11747 get(int i) {
        C11747 c11747 = new C11747();
        this.f66760.m27152(i, c11747);
        return c11747;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47362(int i, C11747 c11747) {
        this.f66760.m27153(i, c11747);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final void add(int i, C11747 c11747) {
        this.f66760.m27147(i, c11747);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        C11747 c11747 = get(i);
        m47349(i, i + 1);
        return c11747;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        C20736 c20736;
        if (collection instanceof C20736) {
            c20736 = (C20736) collection;
        } else {
            C20736 c207362 = new C20736();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                c207362.m47353((C11747) it.next());
            }
            c20736 = c207362;
        }
        this.f66760.m27151(i, i, c20736.f66760);
        ((AbstractList) this).modCount++;
        return !c20736.isEmpty();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47349(int i, int i2) {
        this.f66760.m27151(i, i2, new C10858());
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m47349(i, i2);
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m47355(int i) {
        return this.f66760.m27150(i, 0);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m47358(int i) {
        return this.f66760.m27150(i, 1);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m47357(int i) {
        return this.f66760.m27150(i, 2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13862 m47359() {
        C10858 c10858 = this.f66760;
        c10858.getClass();
        return new C13862(c10858);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47350(int i, int i2, int i3, int i4) {
        this.f66760.m27145(i, i2, i3, i4);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47360(int i, int i2) {
        this.f66760.m27144(i, i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47351(int i, int i2, C20736 c20736) {
        this.f66760.m27146(i, i2, c20736.f66760);
        ((AbstractList) this).modCount++;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47354(C20736 c20736) {
        if (this.f66760.m27148(c20736.f66760)) {
            ((AbstractList) this).modCount++;
            ((AbstractList) c20736).modCount++;
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m47369(int i) {
        return i == 0 || m47357(i + (-1)) != m47357(i);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m47366(int i) {
        return m47345(m47357(i), i, false);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m47365(int i) {
        return m47345(m47357(i), i, true) - 1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m47345(int i, int i2, boolean z) {
        int i3;
        int i4;
        long j = 1;
        if (!m47344(i2, i, z)) {
            i3 = i2;
            while (true) {
                if (j > i2) {
                    i4 = 0;
                    break;
                }
                int i5 = i2 - ((int) j);
                if (m47344(i5, i, z)) {
                    i4 = i5 + 1;
                    break;
                }
                j <<= 1;
                i3 = i5;
            }
        } else {
            i4 = i2 + 1;
            i3 = this.f66760.m27149();
            while (true) {
                if (j >= r4.m27149() - i2) {
                    break;
                }
                int i6 = ((int) j) + i2;
                if (!m47344(i6, i, z)) {
                    i3 = i6;
                    break;
                }
                i4 = i6 + 1;
                j <<= 1;
            }
        }
        while (i4 < i3) {
            int i7 = (i4 + i3) >>> 1;
            if (m47344(i7, i, z)) {
                i4 = i7 + 1;
            } else {
                i3 = i7;
            }
        }
        return i4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m47344(int i, int i2, boolean z) {
        int m47357 = m47357(i);
        if (m47357 >= i2) {
            return z && m47357 == i2;
        }
        return true;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11747 m47368() {
        return get(m47364());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47361(int i, int i2, C20736 c20736) {
        this.f66760.m27151(i, i2 + i, c20736.f66760);
        ((AbstractList) this).modCount++;
    }
}
