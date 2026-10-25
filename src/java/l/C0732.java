package l;

/* compiled from: 71FI */
/* renamed from: l.֡᩺᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0732 implements Comparable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f2758;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f2759;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C11005 f2760;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f2763;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f2764;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C11005 f2765;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f2762 = -1;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f2761 = -1;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2758.compareTo(((C0732) obj).f2758);
    }

    public C0732(String str, boolean z) {
        this.f2758 = str;
        this.f2759 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m2837() {
        C11005 c11005 = this.f2765;
        C11003.requireNonNull(c11005);
        C11541 c11541 = new C11541(c11005.m27340());
        try {
            c11541.seek(this.f2763);
            if (this.f2759) {
                String m11701 = C3878.m11701(c11541.m28420());
                c11541.close();
                return m11701;
            }
            String m28421 = c11541.m28421();
            c11541.close();
            return m28421;
        } catch (Throwable th) {
            try {
                c11541.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0732.class != obj.getClass()) {
            return false;
        }
        return this.f2758.equals(((C0732) obj).f2758);
    }

    public final int hashCode() {
        return this.f2758.hashCode();
    }
}
