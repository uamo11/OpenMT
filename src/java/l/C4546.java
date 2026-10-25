package l;

/* compiled from: 7BAL */
/* renamed from: l.ۙۡܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4546 extends C18947 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C21480[] f14504;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f14505;

    static {
        new C4546(0);
    }

    public C4546(int i) {
        super(i != 0);
        this.f14504 = new C21480[i];
        this.f14505 = 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4546)) {
            return false;
        }
        C4546 c4546 = (C4546) obj;
        C21480[] c21480Arr = c4546.f14504;
        C21480[] c21480Arr2 = this.f14504;
        int length = c21480Arr2.length;
        if (length != c21480Arr.length || size() != c4546.size()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            C21480 c21480 = c21480Arr2[i];
            Object obj2 = c21480Arr[i];
            if (c21480 != obj2 && (c21480 == null || !c21480.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        C21480[] c21480Arr = this.f14504;
        int length = c21480Arr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            C21480 c21480 = c21480Arr[i2];
            i = (i * 31) + (c21480 == null ? 0 : c21480.hashCode());
        }
        return i;
    }

    public final String toString() {
        C21480[] c21480Arr = this.f14504;
        StringBuilder sb = new StringBuilder(c21480Arr.length * 25);
        sb.append('{');
        boolean z = false;
        for (C21480 c21480 : c21480Arr) {
            if (c21480 != null) {
                if (z) {
                    sb.append(", ");
                } else {
                    z = true;
                }
                sb.append(c21480);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m13356() {
        return this.f14504.length;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m13357(C4546 c4546) {
        int length = c4546.f14504.length;
        for (int i = 0; i < length; i++) {
            C21480 c21480 = c4546.get(i);
            if (c21480 != null) {
                m13358(c21480);
            }
        }
    }

    public final int size() {
        int i = this.f14505;
        if (i >= 0) {
            return i;
        }
        int i2 = 0;
        for (C21480 c21480 : this.f14504) {
            if (c21480 != null) {
                i2++;
            }
        }
        this.f14505 = i2;
        return i2;
    }

    public final C21480 get(int i) {
        try {
            return this.f14504[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21480 m13354(C21480 c21480) {
        for (C21480 c214802 : this.f14504) {
            if (c214802 != null && c21480.m48651(c214802)) {
                return c214802;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21480 m13353(C18658 c18658) {
        for (C21480 c21480 : this.f14504) {
            if (c21480 != null && c18658.equals(c21480.m48653())) {
                return c21480;
            }
        }
        return null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m13359(C21480 c21480) {
        try {
            this.f14504[c21480.m48652()] = null;
            this.f14505 = -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m13358(C21480 c21480) {
        int i;
        C21480 c214802;
        C21480[] c21480Arr = this.f14504;
        m43734();
        if (c21480 == null) {
            throw new NullPointerException("spec == null");
        }
        this.f14505 = -1;
        try {
            int m48652 = c21480.m48652();
            c21480Arr[m48652] = c21480;
            if (m48652 > 0 && (c214802 = c21480Arr[m48652 - 1]) != null && c214802.m48645() == 2) {
                c21480Arr[i] = null;
            }
            if (c21480.m48645() == 2) {
                c21480Arr[m48652 + 1] = null;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("spec.getReg() out of range");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13355(C4546 c4546) {
        C21480 m48650;
        m43734();
        C21480[] c21480Arr = c4546.f14504;
        C21480[] c21480Arr2 = this.f14504;
        int length = c21480Arr2.length;
        int min = Math.min(length, c21480Arr.length);
        this.f14505 = -1;
        for (int i = 0; i < min; i++) {
            C21480 c21480 = c21480Arr2[i];
            if (c21480 != null && (m48650 = c21480.m48650(c21480Arr[i])) != c21480) {
                c21480Arr2[i] = m48650;
            }
        }
        while (min < length) {
            c21480Arr2[min] = null;
            min++;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4546 m13352(int i) {
        C21480[] c21480Arr = this.f14504;
        C4546 c4546 = new C4546(c21480Arr.length + i);
        for (C21480 c21480 : c21480Arr) {
            if (c21480 != null) {
                c4546.m13358(c21480.m48640(i));
            }
        }
        c4546.f14505 = this.f14505;
        if (m43735()) {
            c4546.mo20349();
        }
        return c4546;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C4546 m13351() {
        C21480[] c21480Arr = this.f14504;
        C4546 c4546 = new C4546(c21480Arr.length);
        for (C21480 c21480 : c21480Arr) {
            if (c21480 != null) {
                c4546.m13358(c21480);
            }
        }
        c4546.f14505 = this.f14505;
        return c4546;
    }
}
