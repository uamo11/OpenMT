package l;

import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;

/* compiled from: L42O */
/* renamed from: l.ۖܶ۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C2609 extends AbstractCollection implements List {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C2609 f8237 = new C9665(null, null);

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Iterator f8238 = new C8959();

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f8239 = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f8240;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C2609 f8241;

    public C2609(Object obj, C2609 c2609) {
        this.f8241 = c2609;
        this.f8240 = obj;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C2609 m8239() {
        return f8237;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m8237(Object obj, C2609 c2609) {
        C12171.m29637(obj);
        Iterator it = c2609.iterator();
        C2609 c26092 = f8237;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null && !next.equals(obj)) {
                c26092.getClass();
                c26092 = new C2609(next, c26092);
            }
        }
        return c26092.m8250();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 m8247(C2609 c2609) {
        C18837 c18837 = new C18837();
        Iterator it = iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (c2609.contains(next)) {
                c18837.m43511(next);
            }
        }
        return c18837.m43517();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m8244(C2609 c2609) {
        C18837 c18837 = new C18837();
        Iterator it = iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!c2609.contains(next)) {
                c18837.m43511(next);
            }
        }
        return c18837.m43517();
    }

    public static C2609 of(Object obj) {
        return new C2609(obj, f8237);
    }

    public static C2609 of(Object obj, Object obj2) {
        return new C2609(obj, of(obj2));
    }

    public static C2609 of(Object obj, Object obj2, Object obj3) {
        return new C2609(obj, of(obj2, obj3));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m8236(Object obj, Object obj2, Object obj3, Object... objArr) {
        return new C2609(obj, new C2609(obj2, new C2609(obj3, m8238(objArr))));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m8238(Object[] objArr) {
        C2609 c2609 = f8237;
        if (objArr != null) {
            int length = objArr.length - 1;
            while (length >= 0) {
                C2609 c26092 = new C2609(objArr[length], c2609);
                length--;
                c2609 = c26092;
            }
        }
        return c2609;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m8235(Iterable iterable) {
        C18837 c18837 = new C18837();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c18837.m43511(it.next());
        }
        return c18837.m43517();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f8241 == null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m8249() {
        return this.f8241 != null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m8245() {
        int i = 0;
        C2609 c2609 = this;
        while (true) {
            c2609 = c2609.f8241;
            if (c2609 == null) {
                return i;
            }
            i++;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return m8245();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i2 > m8245() || i > i2) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2 - i);
        C2609 c2609 = this;
        for (int i3 = 0; c2609.f8241 != null && i3 != i2; i3++) {
            if (i3 >= i) {
                arrayList.add(c2609.f8240);
            }
            c2609 = c2609.f8241;
        }
        return C20195.unmodifiableList(arrayList);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[m8245()]);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2609 mo8251(C2609 c2609) {
        this.f8241 = c2609;
        return c2609;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 m8246(Object obj) {
        return new C2609(obj, this);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2609 m8248(C2609 c2609) {
        if (isEmpty()) {
            return c2609;
        }
        if (c2609.isEmpty()) {
            return this;
        }
        if (c2609.f8241.isEmpty()) {
            return new C2609(c2609.f8240, this);
        }
        C2609 m8250 = c2609.m8250();
        C12171.m29642(m8250 != c2609);
        C2609 c26092 = this;
        while (m8250.m8249()) {
            C2609 c26093 = m8250.f8241;
            m8250.mo8251(c26092);
            c26092 = m8250;
            m8250 = c26093;
        }
        return c26092;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2609 m8250() {
        if (isEmpty() || this.f8241.isEmpty()) {
            return this;
        }
        C2609 c2609 = f8237;
        C2609 c26092 = this;
        while (c26092.m8249()) {
            C2609 c26093 = new C2609(c26092.f8240, c2609);
            c26092 = c26092.f8241;
            c2609 = c26093;
        }
        return c2609;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m8242(Object obj) {
        return of(obj).m8248(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int i = 0;
        C2609 c2609 = this;
        while (c2609.m8249() && i < objArr.length) {
            objArr[i] = c2609.f8240;
            c2609 = c2609.f8241;
            i++;
        }
        if (c2609.isEmpty()) {
            if (i < objArr.length) {
                objArr[i] = null;
            }
            return objArr;
        }
        return toArray((Object[]) Array.newInstance(objArr.getClass().getComponentType(), m8245()));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m8241(String str) {
        if (isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8240);
        for (C2609 c2609 = this.f8241; c2609.m8249(); c2609 = c2609.f8241) {
            sb.append(str);
            sb.append(c2609.f8240);
        }
        return sb.toString();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return m8241(",");
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (C2609 c2609 = this; c2609.f8241 != null; c2609 = c2609.f8241) {
            int i2 = i * 31;
            Object obj = c2609.f8240;
            i = i2 + (obj == null ? 0 : obj.hashCode());
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0026, code lost:
    
        if (r1 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002a, code lost:
    
        if (r4.f8241 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        return false;
     */
    @Override // java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof l.C2609
            if (r0 == 0) goto L2d
            l.ۖܶ۠ r4 = (l.C2609) r4
            r0 = r3
        L7:
            l.ۖܶ۠ r1 = r0.f8241
            if (r1 == 0) goto L26
            l.ۖܶ۠ r2 = r4.f8241
            if (r2 == 0) goto L26
            java.lang.Object r1 = r0.f8240
            if (r1 != 0) goto L18
            java.lang.Object r1 = r4.f8240
            if (r1 == 0) goto L21
            goto L65
        L18:
            java.lang.Object r2 = r4.f8240
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L21
            goto L65
        L21:
            l.ۖܶ۠ r0 = r0.f8241
            l.ۖܶ۠ r4 = r4.f8241
            goto L7
        L26:
            if (r1 != 0) goto L65
            l.ۖܶ۠ r4 = r4.f8241
            if (r4 != 0) goto L65
            goto L63
        L2d:
            boolean r0 = r4 instanceof java.util.List
            if (r0 == 0) goto L65
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
            r0 = r3
        L38:
            l.ۖܶ۠ r1 = r0.f8241
            if (r1 == 0) goto L57
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r4.next()
            java.lang.Object r2 = r0.f8240
            if (r2 != 0) goto L4d
            if (r1 != 0) goto L65
            goto L54
        L4d:
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L54
            goto L65
        L54:
            l.ۖܶ۠ r0 = r0.f8241
            goto L38
        L57:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L65
            boolean r4 = r4.hasNext()
            if (r4 != 0) goto L65
        L63:
            r4 = 1
            return r4
        L65:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2609.equals(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        for (C2609 c2609 = this; c2609.f8241 != null; c2609 = c2609.f8241) {
            if (obj == null) {
                if (c2609.f8240 == null) {
                    return true;
                }
            } else if (c2609.f8240.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public final Object last() {
        Object obj = null;
        C2609 c2609 = this;
        while (true) {
            C2609 c26092 = c2609.f8241;
            if (c26092 == null) {
                return obj;
            }
            obj = c2609.f8240;
            c2609 = c26092;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m8243(Function function) {
        C18837 c18837 = new C18837();
        Iterator it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            Object apply = function.apply(next);
            c18837.m43511(apply);
            z |= apply != next;
        }
        return z ? c18837.m43517() : this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        if (this.f8241 == null) {
            return f8238;
        }
        C16013 c16013 = new C16013();
        c16013.f49414 = this;
        return c16013;
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        }
        C2609 c2609 = this;
        int i2 = i;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0 || c2609.isEmpty()) {
                break;
            }
            c2609 = c2609.f8241;
            i2 = i3;
        }
        if (!c2609.isEmpty()) {
            return c2609.f8240;
        }
        StringBuilder m32308 = C13325.m32308(i, "Index: ", ", Size: ");
        m32308.append(m8245());
        throw new IndexOutOfBoundsException(m32308.toString());
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = 0;
        C2609 c2609 = this;
        while (c2609.f8241 != null) {
            Object obj2 = c2609.f8240;
            if (obj2 == null) {
                if (obj == null) {
                    return i;
                }
                c2609 = c2609.f8241;
                i++;
            } else {
                if (obj2.equals(obj)) {
                    return i;
                }
                c2609 = c2609.f8241;
                i++;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = -1;
        int i2 = 0;
        C2609 c2609 = this;
        while (c2609.f8241 != null) {
            Object obj2 = c2609.f8240;
            if (obj2 == null) {
                if (obj != null) {
                    c2609 = c2609.f8241;
                    i2++;
                }
                i = i2;
                c2609 = c2609.f8241;
                i2++;
            } else {
                if (!obj2.equals(obj)) {
                    c2609 = c2609.f8241;
                    i2++;
                }
                i = i2;
                c2609 = c2609.f8241;
                i2++;
            }
        }
        return i;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return C20195.unmodifiableList(new ArrayList(this)).listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return C20195.unmodifiableList(new ArrayList(this)).listIterator(i);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static InterfaceC11688 m8240() {
        return C10277.of(new C23775(0), new C6842(0), new C20954(0), new C15420(8), new EnumC6043[0]);
    }
}
