package l;

/* compiled from: X43L */
/* renamed from: l.۠᩸֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8436 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f25834;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f25835;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f25836;

    public C8436(AbstractC4308 abstractC4308, AbstractC4308 abstractC43082, C6319 c6319) {
        this.f25836 = c6319;
        this.f25834 = abstractC4308;
        this.f25835 = abstractC43082;
    }

    public final int hashCode() {
        return C6319.m17468(this.f25835) + (C6319.m17468(this.f25834) * 127);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8436)) {
            return false;
        }
        C8436 c8436 = (C8436) obj;
        AbstractC4308 abstractC4308 = this.f25834;
        AbstractC4308 abstractC43082 = c8436.f25834;
        C6319 c6319 = this.f25836;
        return c6319.m17550(abstractC4308, abstractC43082) && c6319.m17550(this.f25835, c8436.f25835);
    }
}
