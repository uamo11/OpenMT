package l;

/* compiled from: 57L9 */
/* renamed from: l.֫۟֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1672 extends AbstractC14371 {

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10139 f5844;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        C6319 c6319;
        C6319 c63192;
        AbstractC4308 abstractC4308 = (AbstractC4308) obj2;
        C10139 c10139 = this.f5844;
        c6319 = c10139.f30518;
        AbstractC4308 m17559 = c6319.m17559((AbstractC4308) obj);
        EnumC9454 enumC9454 = EnumC9454.BOOLEAN;
        if (!m17559.m12913(enumC9454)) {
            return false;
        }
        c63192 = c10139.f30518;
        return c63192.m17559(abstractC4308).m12913(enumC9454);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1672(C10139 c10139, EnumC18550 enumC18550) {
        super(c10139, enumC18550);
        this.f5844 = c10139;
    }

    @Override // l.AbstractC14371
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0758 mo5675(AbstractC4308 abstractC4308, AbstractC4308 abstractC43082) {
        C20661 c20661;
        C20661 c206612;
        C10139 c10139 = this.f5844;
        c20661 = c10139.f30514;
        C7254 c7254 = c20661.f66469;
        c206612 = c10139.f30514;
        return m37193(new C17194(this, c7254, c206612.f66469));
    }
}
