package l;

/* compiled from: PBC9 */
/* renamed from: l.ܶᩳܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15396 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8342 f47141;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22453 f47142;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f47143;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f47144;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13985 f47145;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f47146;

    public C15396(C22453 c22453, int i, int i2, C8342 c8342) {
        if (c22453 == null) {
            throw new NullPointerException("cf == null");
        }
        if (c8342 == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        int m27753 = c22453.m50388().m27753(i2);
        this.f47142 = c22453;
        this.f47144 = i;
        this.f47143 = i2;
        this.f47141 = c8342;
        this.f47145 = new C13985(m27753);
        this.f47146 = -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m36434() {
        m36433();
        return this.f47146;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13985 m36435() {
        m36433();
        return this.f47145;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m36433() {
        if (this.f47146 < 0) {
            C13985 c13985 = this.f47145;
            int size = c13985.size();
            int i = this.f47143 + 2;
            C22453 c22453 = this.f47142;
            c22453.getClass();
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    AbstractC23822 m21940 = this.f47141.m21940(c22453, this.f47144, i);
                    i += m21940.mo9828();
                    c13985.m40989(i2, m21940);
                } catch (C23158 e) {
                    e.m21602("...while parsing attributes[" + i2 + "]");
                    throw e;
                } catch (RuntimeException e2) {
                    C23158 c23158 = new C23158(null, e2);
                    c23158.m21602("...while parsing attributes[" + i2 + "]");
                    throw c23158;
                }
            }
            this.f47146 = i;
        }
    }
}
