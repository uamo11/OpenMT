package l;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: N5Q6 */
/* renamed from: l.ۧ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C11194 implements Iterable {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23166 f33600;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23166 f33602;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final WeakHashMap f33603 = new WeakHashMap();

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f33601 = 0;

    public C23166 get(Object obj) {
        C23166 c23166 = this.f33600;
        while (c23166 != null && !c23166.f74453.equals(obj)) {
            c23166 = c23166.f74454;
        }
        return c23166;
    }

    /* renamed from: ۧ */
    public Object mo26347(Object obj, Object obj2) {
        C23166 c23166 = get(obj);
        if (c23166 != null) {
            return c23166.f74451;
        }
        m27762(obj, obj2);
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23166 m27762(Object obj, Object obj2) {
        C23166 c23166 = new C23166(obj, obj2);
        this.f33601++;
        C23166 c231662 = this.f33602;
        if (c231662 == null) {
            this.f33600 = c23166;
            this.f33602 = c23166;
            return c23166;
        }
        c231662.f74454 = c23166;
        c23166.f74452 = c231662;
        this.f33602 = c23166;
        return c23166;
    }

    public Object remove(Object obj) {
        C23166 c23166 = get(obj);
        if (c23166 == null) {
            return null;
        }
        this.f33601--;
        WeakHashMap weakHashMap = this.f33603;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC2021) it.next()).mo6575(c23166);
            }
        }
        C23166 c231662 = c23166.f74452;
        if (c231662 != null) {
            c231662.f74454 = c23166.f74454;
        } else {
            this.f33600 = c23166.f74454;
        }
        C23166 c231663 = c23166.f74454;
        if (c231663 != null) {
            c231663.f74452 = c231662;
        } else {
            this.f33602 = c231662;
        }
        c23166.f74454 = null;
        c23166.f74452 = null;
        return c23166.f74451;
    }

    public final int size() {
        return this.f33601;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C6233 c6233 = new C6233(this.f33600, this.f33602);
        this.f33603.put(c6233, Boolean.FALSE);
        return c6233;
    }

    public final Iterator descendingIterator() {
        C11878 c11878 = new C11878(this.f33602, this.f33600);
        this.f33603.put(c11878, Boolean.FALSE);
        return c11878;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13993 m27764() {
        C13993 c13993 = new C13993(this);
        this.f33603.put(c13993, Boolean.FALSE);
        return c13993;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map.Entry m27763() {
        return this.f33600;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Map.Entry m27765() {
        return this.f33602;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((l.AbstractC7644) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof l.C11194
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            l.ۧ᩵ r7 = (l.C11194) r7
            int r1 = r6.f33601
            int r3 = r7.f33601
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            l.۟ᩴ r3 = (l.AbstractC7644) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            l.۟ᩴ r4 = (l.AbstractC7644) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            l.۟ᩴ r7 = (l.AbstractC7644) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11194.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            AbstractC7644 abstractC7644 = (AbstractC7644) it;
            if (!abstractC7644.hasNext()) {
                return i;
            }
            i += ((Map.Entry) abstractC7644.next()).hashCode();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            AbstractC7644 abstractC7644 = (AbstractC7644) it;
            if (abstractC7644.hasNext()) {
                sb.append(((Map.Entry) abstractC7644.next()).toString());
                if (abstractC7644.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
