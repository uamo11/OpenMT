package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

/* compiled from: 1AZL */
/* renamed from: l.᩻ܿۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23834 extends AbstractMap implements Serializable {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Comparator f77117 = new C7627();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C18190 f77118;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14661 f77119;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f77120;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14661 f77121;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f77122;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C11135 f77123;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f77124;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Comparator f77125;

    public C23834() {
        this(true);
    }

    public C23834(boolean z) {
        this.f77120 = 0;
        this.f77122 = 0;
        this.f77125 = f77117;
        this.f77124 = z;
        this.f77119 = new C14661(z);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f77120;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f77124) {
            throw new NullPointerException("value == null");
        }
        C14661 m52529 = m52529(obj, true);
        Object obj3 = m52529.f44806;
        m52529.f44806 = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f77121 = null;
        this.f77120 = 0;
        this.f77122++;
        C14661 c14661 = this.f77119;
        c14661.f44808 = c14661;
        c14661.f44804 = c14661;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14661 m52529(Object obj, boolean z) {
        int i;
        C14661 c14661;
        C14661 c146612 = this.f77121;
        Comparator comparator = f77117;
        Comparator comparator2 = this.f77125;
        if (c146612 != null) {
            Comparable comparable = comparator2 == comparator ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c146612.f44810;
                if (comparable != null) {
                    i = comparable.compareTo(obj2);
                } else {
                    i = comparator2.compare(obj, obj2);
                }
                if (i == 0) {
                    return c146612;
                }
                C14661 c146613 = i < 0 ? c146612.f44805 : c146612.f44807;
                if (c146613 == null) {
                    break;
                }
                c146612 = c146613;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C14661 c146614 = this.f77119;
        if (c146612 == null) {
            if (comparator2 == comparator && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c14661 = new C14661(this.f77124, c146612, obj, c146614, c146614.f44808);
            this.f77121 = c14661;
        } else {
            c14661 = new C14661(this.f77124, c146612, obj, c146614, c146614.f44808);
            if (i < 0) {
                c146612.f44805 = c14661;
            } else {
                c146612.f44807 = c14661;
            }
            m52528(c146612, true);
        }
        this.f77120++;
        this.f77122++;
        return c14661;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C14661 c14661 = null;
        if (obj != null) {
            try {
                c14661 = m52529(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c14661 != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            l.ܳܿۖ r3 = r2.m52529(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Lf
            java.lang.Object r3 = r3.f44806
            return r3
        Lf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23834.get(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            l.ܳܿۖ r3 = r2.m52529(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.m52530(r3, r1)
        L10:
            if (r3 == 0) goto L15
            java.lang.Object r3 = r3.f44806
            return r3
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23834.remove(java.lang.Object):java.lang.Object");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52530(C14661 c14661, boolean z) {
        int i;
        if (z) {
            C14661 c146612 = c14661.f44808;
            c146612.f44804 = c14661.f44804;
            c14661.f44804.f44808 = c146612;
        }
        C14661 c146613 = c14661.f44805;
        C14661 c146614 = c14661.f44807;
        C14661 c146615 = c14661.f44809;
        int i2 = 0;
        if (c146613 != null && c146614 != null) {
            if (c146613.f44812 <= c146614.f44812) {
                for (C14661 c146616 = c146614.f44805; c146616 != null; c146616 = c146616.f44805) {
                    c146614 = c146616;
                }
            } else {
                C14661 c146617 = c146613.f44807;
                while (true) {
                    C14661 c146618 = c146617;
                    c146614 = c146613;
                    c146613 = c146618;
                    if (c146613 == null) {
                        break;
                    } else {
                        c146617 = c146613.f44807;
                    }
                }
            }
            m52530(c146614, false);
            C14661 c146619 = c14661.f44805;
            if (c146619 != null) {
                i = c146619.f44812;
                c146614.f44805 = c146619;
                c146619.f44809 = c146614;
                c14661.f44805 = null;
            } else {
                i = 0;
            }
            C14661 c1466110 = c14661.f44807;
            if (c1466110 != null) {
                i2 = c1466110.f44812;
                c146614.f44807 = c1466110;
                c1466110.f44809 = c146614;
                c14661.f44807 = null;
            }
            c146614.f44812 = Math.max(i, i2) + 1;
            m52526(c14661, c146614);
            return;
        }
        if (c146613 != null) {
            m52526(c14661, c146613);
            c14661.f44805 = null;
        } else if (c146614 != null) {
            m52526(c14661, c146614);
            c14661.f44807 = null;
        } else {
            m52526(c14661, (C14661) null);
        }
        m52528(c146615, false);
        this.f77120--;
        this.f77122++;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52526(C14661 c14661, C14661 c146612) {
        C14661 c146613 = c14661.f44809;
        c14661.f44809 = null;
        if (c146612 != null) {
            c146612.f44809 = c146613;
        }
        if (c146613 != null) {
            if (c146613.f44805 == c14661) {
                c146613.f44805 = c146612;
                return;
            } else {
                c146613.f44807 = c146612;
                return;
            }
        }
        this.f77121 = c146612;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m52528(C14661 c14661, boolean z) {
        while (c14661 != null) {
            C14661 c146612 = c14661.f44805;
            C14661 c146613 = c14661.f44807;
            int i = c146612 != null ? c146612.f44812 : 0;
            int i2 = c146613 != null ? c146613.f44812 : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C14661 c146614 = c146613.f44805;
                C14661 c146615 = c146613.f44807;
                int i4 = (c146614 != null ? c146614.f44812 : 0) - (c146615 != null ? c146615.f44812 : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    m52525(c14661);
                } else {
                    m52527(c146613);
                    m52525(c14661);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C14661 c146616 = c146612.f44805;
                C14661 c146617 = c146612.f44807;
                int i5 = (c146616 != null ? c146616.f44812 : 0) - (c146617 != null ? c146617.f44812 : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    m52527(c14661);
                } else {
                    m52525(c146612);
                    m52527(c14661);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c14661.f44812 = i + 1;
                if (z) {
                    return;
                }
            } else {
                c14661.f44812 = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c14661 = c14661.f44809;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52525(C14661 c14661) {
        C14661 c146612 = c14661.f44805;
        C14661 c146613 = c14661.f44807;
        C14661 c146614 = c146613.f44805;
        C14661 c146615 = c146613.f44807;
        c14661.f44807 = c146614;
        if (c146614 != null) {
            c146614.f44809 = c14661;
        }
        m52526(c14661, c146613);
        c146613.f44805 = c14661;
        c14661.f44809 = c146613;
        int max = Math.max(c146612 != null ? c146612.f44812 : 0, c146614 != null ? c146614.f44812 : 0) + 1;
        c14661.f44812 = max;
        c146613.f44812 = Math.max(max, c146615 != null ? c146615.f44812 : 0) + 1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m52527(C14661 c14661) {
        C14661 c146612 = c14661.f44805;
        C14661 c146613 = c14661.f44807;
        C14661 c146614 = c146612.f44805;
        C14661 c146615 = c146612.f44807;
        c14661.f44805 = c146615;
        if (c146615 != null) {
            c146615.f44809 = c14661;
        }
        m52526(c14661, c146612);
        c146612.f44807 = c14661;
        c14661.f44809 = c146612;
        int max = Math.max(c146613 != null ? c146613.f44812 : 0, c146615 != null ? c146615.f44812 : 0) + 1;
        c14661.f44812 = max;
        c146612.f44812 = Math.max(max, c146614 != null ? c146614.f44812 : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C11135 c11135 = this.f77123;
        if (c11135 != null) {
            return c11135;
        }
        C11135 c111352 = new C11135(this);
        this.f77123 = c111352;
        return c111352;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C18190 c18190 = this.f77118;
        if (c18190 != null) {
            return c18190;
        }
        C18190 c181902 = new C18190(this);
        this.f77118 = c181902;
        return c181902;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }
}
