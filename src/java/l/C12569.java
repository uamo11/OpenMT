package l;

/* compiled from: S776 */
/* renamed from: l.۫ᩳۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12569 extends C10355 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C22405 f37879;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C16096 f37880;

    public C12569(C22405 c22405, C16096 c16096) {
        super(c22405.m50278());
        this.f37879 = c22405;
        this.f37880 = c16096;
    }

    @Override // l.C10355
    /* renamed from: ۧ */
    public final C17515 mo26163() {
        return this.f37879.m50279();
    }

    @Override // l.C10355
    /* renamed from: ֫ */
    public final int mo26157(String str) {
        return this.f37879.m50276(str);
    }

    @Override // l.C10355
    /* renamed from: ֫ */
    public final int mo26156(int i, String str) {
        Integer m33458;
        m33458 = C13979.m33458(str);
        if (m33458 != null) {
            return m33458.intValue();
        }
        if (!this.f37880.f49590 || str.startsWith("android:")) {
            return this.f37879.m50275(i, str);
        }
        return -1;
    }
}
