package l;

/* compiled from: 57L9 */
/* renamed from: l.ۜ۟֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6611 extends AbstractC14371 {

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10139 f20346;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        C6319 c6319;
        C20661 c20661;
        boolean z;
        C6319 c63192;
        C20661 c206612;
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        AbstractC4308 abstractC43082 = (AbstractC4308) obj2;
        C10139 c10139 = this.f20346;
        c6319 = c10139.f30518;
        c20661 = c10139.f30514;
        if (!c6319.m17550(abstractC4308, c20661.f66533)) {
            c63192 = c10139.f30518;
            c206612 = c10139.f30514;
            if (!c63192.m17550(abstractC43082, c206612.f66533)) {
                z = false;
                EnumC9454 enumC9454 = EnumC9454.VOID;
                return (z || (!abstractC4308.m12913(enumC9454) || abstractC43082.m12913(enumC9454))) ? false : true;
            }
        }
        z = true;
        EnumC9454 enumC94542 = EnumC9454.VOID;
        if (z) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6611(C10139 c10139, EnumC18550 enumC18550) {
        super(c10139, enumC18550);
        this.f20346 = c10139;
    }

    @Override // l.AbstractC14371
    /* renamed from: ֫ */
    public final C0758 mo5675(AbstractC4308 abstractC4308, AbstractC4308 abstractC43082) {
        return m37193(new C17194(this, m18119(abstractC4308), m18119(abstractC43082)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC4308 m18119(AbstractC4308 abstractC4308) {
        C6319 c6319;
        C20661 c20661;
        C20661 c206612;
        boolean mo12941 = abstractC4308.mo12941();
        C10139 c10139 = this.f20346;
        if (mo12941) {
            return c10139.m25480(abstractC4308);
        }
        if (abstractC4308.m12913(EnumC9454.VOID) || abstractC4308.m12913(EnumC9454.BOT)) {
            return abstractC4308;
        }
        c6319 = c10139.f30518;
        c20661 = c10139.f30514;
        if (c6319.m17550(abstractC4308, c20661.f66533)) {
            return abstractC4308;
        }
        if (abstractC4308.m12913(EnumC9454.TYPEVAR)) {
            return m18119(abstractC4308.mo12939());
        }
        c206612 = c10139.f30514;
        return c206612.f66526;
    }
}
