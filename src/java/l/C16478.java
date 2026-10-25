package l;

/* compiled from: WBEW */
/* renamed from: l.ܽۜܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16478 extends AbstractC17890 implements Comparable {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C8985 f50666;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f50666.compareTo(((C16478) obj).f50666);
    }

    public C16478(C8985 c8985, int i) {
        super(i);
        this.f50666 = c8985;
    }

    public final int hashCode() {
        return this.f50666.hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C16478) && this.f50666.compareTo(((C16478) obj).f50666) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C16478.class.getName());
        sb.append('{');
        sb.append(C14712.m35006(m41857()));
        sb.append(' ');
        sb.append(this.f50666);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38845(C1662 c1662) {
        c1662.m5626().m18104(this.f50666);
    }

    @Override // l.InterfaceC0601
    /* renamed from: ֫ */
    public final String mo2463() {
        return this.f50666.mo2463();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8985 m38846() {
        return this.f50666;
    }

    @Override // l.AbstractC17890
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo38844(C1662 c1662, C18241 c18241, int i, int i2) {
        C6601 m5626 = c1662.m5626();
        C8985 c8985 = this.f50666;
        int m18102 = m5626.m18102(c8985);
        int i3 = m18102 - i;
        int m41857 = m41857();
        if (c18241.m42506()) {
            c18241.m42501(0, String.format("  [%x] %s", Integer.valueOf(i2), c8985.mo2463()));
            c18241.m42501(C1080.m3668(i3), "    field_idx:    ".concat(C14712.m35008(m18102)));
            c18241.m42501(C1080.m3668(m41857), "    access_flags: " + C1724.m5774(m41857));
        }
        c18241.m42507(i3);
        c18241.m42507(m41857);
        return m18102;
    }
}
