package l;

/* compiled from: 0BC1 */
/* renamed from: l.ۛܿܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6204 extends AbstractC1181 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C18821[] f19030;

    @Override // l.AbstractC4793
    /* renamed from: ֫ */
    public final String mo2080() {
        return null;
    }

    public C6204(C10191 c10191, C20069 c20069) {
        super(c10191, c20069);
        if (c20069.size() == 0) {
            throw new IllegalArgumentException("registers.size() == 0");
        }
        this.f19030 = null;
    }

    @Override // l.AbstractC4793
    /* renamed from: ۧ */
    public final int mo2084() {
        m17124();
        int i = 0;
        for (C18821 c18821 : this.f19030) {
            i += c18821.mo2084();
        }
        return i;
    }

    @Override // l.AbstractC4793
    /* renamed from: ֫ */
    public final void mo2082(C18241 c18241) {
        m17124();
        for (C18821 c18821 : this.f19030) {
            c18821.mo2082(c18241);
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m17124() {
        if (this.f19030 != null) {
            return;
        }
        C20069 m13993 = m13993();
        int size = m13993.size();
        this.f19030 = new C18821[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C21480 m41004get = m13993.m41004get(i2);
            this.f19030[i2] = AbstractC4793.m13979(C10191.f30620, C21480.m48631(i, m41004get.getType()), m41004get);
            i += m41004get.m48645();
        }
    }

    @Override // l.AbstractC4793
    /* renamed from: ֫ */
    public final AbstractC4793 mo2081(C20069 c20069) {
        return new C6204(m13983(), c20069);
    }

    @Override // l.AbstractC4793
    /* renamed from: ܺ */
    public final String mo2085() {
        C20069 m13993 = m13993();
        int size = m13993.size();
        StringBuilder sb = new StringBuilder(100);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C21480 m41004get = m13993.m41004get(i2);
            C18821 m13979 = AbstractC4793.m13979(C10191.f30620, C21480.m48631(i, m41004get.getType()), m41004get);
            if (i2 != 0) {
                sb.append('\n');
            }
            sb.append(m13979.mo2085());
            i += m41004get.m48645();
        }
        return sb.toString();
    }
}
