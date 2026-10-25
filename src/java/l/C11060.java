package l;

/* compiled from: 4BF0 */
/* renamed from: l.ۧܳܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11060 extends AbstractC8237 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C4546 f33235;

    public C11060(C10191 c10191, C4546 c4546) {
        super(c10191);
        if (c4546 == null) {
            throw new NullPointerException("locals == null");
        }
        this.f33235 = c4546;
    }

    @Override // l.AbstractC8237, l.AbstractC4793
    /* renamed from: ۧ */
    public final AbstractC4793 mo3994(int i) {
        return new C11060(m13983(), this.f33235.m13352(i));
    }

    @Override // l.AbstractC4793
    /* renamed from: ֫ */
    public final AbstractC4793 mo2081(C20069 c20069) {
        return new C11060(m13983(), this.f33235);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C4546 m27446() {
        return this.f33235;
    }

    @Override // l.AbstractC4793
    /* renamed from: ֫ */
    public final String mo2080() {
        return this.f33235.toString();
    }

    @Override // l.AbstractC4793
    /* renamed from: ܺ */
    public final String mo2085() {
        C4546 c4546 = this.f33235;
        int size = c4546.size();
        int m13356 = c4546.m13356();
        StringBuilder sb = new StringBuilder((size * 40) + 100);
        sb.append("local-snapshot");
        for (int i = 0; i < m13356; i++) {
            C21480 c21480 = c4546.get(i);
            if (c21480 != null) {
                sb.append("\n  ");
                sb.append(C16703.m39268(c21480));
            }
        }
        return sb.toString();
    }

    @Override // l.AbstractC4793
    /* renamed from: ֫ */
    public final AbstractC4793 mo13980(C16354 c16354) {
        C10191 m13983 = m13983();
        C4546 c4546 = this.f33235;
        int m13356 = c4546.m13356();
        C4546 c45462 = new C4546(c16354.m38500());
        for (int i = 0; i < m13356; i++) {
            C21480 c21480 = c4546.get(i);
            if (c21480 != null) {
                c45462.m13358(c16354.mo9123(c21480));
            }
        }
        c45462.mo20349();
        if (!c45462.equals(c4546)) {
            c4546 = c45462;
        }
        return new C11060(m13983, c4546);
    }
}
