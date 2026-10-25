package l;

/* compiled from: PBHV */
/* renamed from: l.ۙᩳܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC4814 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8342 f15232;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22453 f15233;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12512 f15234;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f15235;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f15236;

    /* renamed from: ֫ */
    public abstract int mo10371();

    /* renamed from: ֫ */
    public abstract InterfaceC6225 mo10372(int i, int i2, C20274 c20274, C13985 c13985);

    /* renamed from: ܿ */
    public abstract String mo10373();

    public AbstractC4814(C22453 c22453, C12512 c12512, int i, C8342 c8342) {
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (c8342 == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        this.f15233 = c22453;
        this.f15234 = c12512;
        this.f15235 = i;
        this.f15232 = c8342;
        this.f15236 = -1;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m14037() {
        m14035();
        return this.f15236;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m14035() {
        if (this.f15236 < 0) {
            int mo10371 = mo10371();
            int m14034 = m14034();
            int i = this.f15235 + 2;
            C22453 c22453 = this.f15233;
            C11186 m50388 = c22453.m50388();
            C10396 m50387 = c22453.m50387();
            for (int i2 = 0; i2 < m14034; i2++) {
                try {
                    int m27753 = m50388.m27753(i);
                    int m277532 = m50388.m27753(i + 2);
                    int m277533 = m50388.m27753(i + 4);
                    C13217 c13217 = (C13217) m50387.get(m277532);
                    C13217 c132172 = (C13217) m50387.get(m277533);
                    C15396 c15396 = new C15396(c22453, mo10371, i + 6, this.f15232);
                    i = c15396.m36434();
                    C13985 m36435 = c15396.m36435();
                    m36435.mo20349();
                    mo10372(i2, m27753, new C20274(c13217, c132172), m36435);
                } catch (C23158 e) {
                    e.m21602("...while parsing " + mo10373() + "s[" + i2 + "]");
                    throw e;
                } catch (RuntimeException e2) {
                    C23158 c23158 = new C23158(null, e2);
                    c23158.m21602("...while parsing " + mo10373() + "s[" + i2 + "]");
                    throw c23158;
                }
            }
            this.f15236 = i;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m14034() {
        return this.f15233.m50388().m27753(this.f15235);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12512 m14036() {
        return this.f15234;
    }
}
