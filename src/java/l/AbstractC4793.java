package l;

import java.util.BitSet;

/* compiled from: 7BB0 */
/* renamed from: l.ۙܿܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC4793 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f15191;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13259 f15192;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C10191 f15193;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20069 f15194;

    /* renamed from: ֫ */
    public abstract String mo2080();

    /* renamed from: ֫ */
    public abstract AbstractC4793 mo3993(C13259 c13259);

    /* renamed from: ֫ */
    public abstract AbstractC4793 mo2081(C20069 c20069);

    /* renamed from: ֫ */
    public abstract void mo2082(C18241 c18241);

    /* renamed from: ۧ */
    public abstract int mo2084();

    /* renamed from: ۧ */
    public abstract AbstractC4793 mo3994(int i);

    /* renamed from: ܺ */
    public abstract String mo2085();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18821 m13979(C10191 c10191, C21480 c21480, C21480 c214802) {
        C13259 c13259;
        boolean z = c21480.m48645() == 1;
        boolean m20311 = c21480.getType().m20311();
        int m48652 = c21480.m48652();
        if ((c214802.m48652() | m48652) < 16) {
            if (m20311) {
                c13259 = C12554.f37848;
            } else {
                c13259 = z ? C12554.f37773 : C12554.f37814;
            }
        } else if (m48652 < 256) {
            if (m20311) {
                c13259 = C12554.f37739;
            } else {
                c13259 = z ? C12554.f37768 : C12554.f37789;
            }
        } else if (m20311) {
            c13259 = C12554.f37783;
        } else {
            c13259 = z ? C12554.f37758 : C12554.f37809;
        }
        return new C18821(c13259, c10191, C20069.m46250(c21480, c214802));
    }

    public AbstractC4793(C13259 c13259, C10191 c10191, C20069 c20069) {
        if (c13259 == null) {
            throw new NullPointerException("opcode == null");
        }
        if (c10191 == null) {
            throw new NullPointerException("position == null");
        }
        if (c20069 == null) {
            throw new NullPointerException("registers == null");
        }
        this.f15191 = -1;
        this.f15192 = c13259;
        this.f15193 = c10191;
        this.f15194 = c20069;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder(100);
        sb.append(m13984());
        sb.append(' ');
        sb.append(this.f15193);
        sb.append(": ");
        sb.append(this.f15192.m32170());
        C20069 c20069 = this.f15194;
        if (c20069.size() != 0) {
            sb.append(c20069.m40980(" ", (String) null));
            z = true;
        } else {
            z = false;
        }
        String mo2080 = mo2080();
        if (mo2080 != null) {
            if (z) {
                sb.append(',');
            }
            sb.append(' ');
            sb.append(mo2080);
        }
        return sb.toString();
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m13985() {
        return this.f15191 >= 0;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m13990() {
        int i = this.f15191;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("address not yet known");
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C13259 m13994() {
        return this.f15192;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C10191 m13983() {
        return this.f15193;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC4793 mo13980(C16354 c16354) {
        return mo2081(c16354.m9122(this.f15194));
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20069 m13993() {
        return this.f15194;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18821 m13986(BitSet bitSet) {
        if (!this.f15192.m32173() || bitSet.get(0)) {
            return null;
        }
        C21480 m41004get = this.f15194.m41004get(0);
        return m13979(this.f15193, m41004get, m41004get.m48646(0));
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC4793 m13987() {
        return mo2081(this.f15194.m46256(this.f15192.m32173(), (BitSet) null));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC4793 m13989(BitSet bitSet) {
        return mo2081(this.f15194.m46256(this.f15192.m32173(), bitSet));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ܿᩴܺ, l.᩶ۡܺ] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.BitSet] */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m13991(BitSet bitSet) {
        ?? m32173 = this.f15192.m32173();
        ?? r1 = this.f15194;
        int size = r1.size();
        int i = 0;
        int m48645 = (m32173 == 0 || bitSet.get(0)) ? 0 : r1.m41004get(0).m48645();
        while (m32173 < size) {
            if (!bitSet.get(m32173)) {
                i = r1.m41004get(m32173).m48645() + i;
            }
            m32173++;
        }
        return Math.max(i, m48645);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6204 m13981(BitSet bitSet) {
        boolean z = bitSet.get(0);
        C13259 c13259 = this.f15192;
        if (c13259.m32173()) {
            bitSet.set(0);
        }
        C20069 m46254 = this.f15194.m46254(bitSet);
        if (c13259.m32173()) {
            bitSet.set(0, z);
        }
        if (m46254.size() == 0) {
            return null;
        }
        return new C6204(this.f15193, m46254);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m13984() {
        int i = this.f15191;
        return i != -1 ? String.format("%04x", Integer.valueOf(i)) : C14712.m35008(System.identityHashCode(this));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13982(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        this.f15191 = i;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String mo13992() {
        throw new UnsupportedOperationException("Not supported.");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String mo13988() {
        throw new UnsupportedOperationException("Not supported.");
    }
}
