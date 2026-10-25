package l;

import java.util.HashMap;

/* compiled from: SBD8 */
/* renamed from: l.֡ۡܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0312 extends C18947 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f1693;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f1694;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4546 f1695;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4546[] f1696;

    public C0312(C13012 c13012) {
        C17246 m31591 = c13012.m31591();
        int m38023 = m31591.m38023();
        int m40536 = m31591.m40536();
        this.f1693 = m40536;
        C4546 c4546 = new C4546(m40536);
        this.f1695 = c4546;
        this.f1696 = new C4546[m38023];
        this.f1694 = new HashMap(m31591.m40533());
        c4546.mo20349();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m1726(int i, C4546 c4546) {
        C4546[] c4546Arr = this.f1696;
        try {
            C4546 c45462 = c4546Arr[i];
            if (c45462 == null) {
                m43734();
                try {
                    c4546Arr[i] = c4546;
                    return true;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new IllegalArgumentException("bogus label");
                }
            }
            C4546 m13351 = c45462.m13351();
            if (c45462.size() != 0) {
                m13351.m13355(c4546);
            } else {
                m13351 = c4546.m13351();
            }
            if (c45462.equals(m13351)) {
                return false;
            }
            m13351.mo20349();
            m43734();
            try {
                c4546Arr[i] = m13351;
                return true;
            } catch (ArrayIndexOutOfBoundsException unused2) {
                throw new IllegalArgumentException("bogus label");
            }
        } catch (ArrayIndexOutOfBoundsException unused3) {
            throw new IllegalArgumentException("bogus label");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4546 m1723(C16540 c16540) {
        try {
            C4546 c4546 = this.f1696[c16540.mo2269()];
            return c4546 != null ? c4546 : this.f1695;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus label");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1725(AbstractC15834 abstractC15834, C21480 c21480) {
        m43734();
        this.f1694.put(abstractC15834, c21480);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21480 m1724(AbstractC15834 abstractC15834) {
        return (C21480) this.f1694.get(abstractC15834);
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m1727() {
        return this.f1694.size();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4546 m1722(int i) {
        try {
            C4546 c4546 = this.f1696[i];
            return c4546 != null ? c4546.m13351() : new C4546(this.f1693);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus label");
        }
    }
}
