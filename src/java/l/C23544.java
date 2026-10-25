package l;

/* compiled from: 57L9 */
/* renamed from: l.᩻۟֨, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23544 extends AbstractC14371 {

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10139 f75599;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        C10139 c10139 = this.f75599;
        EnumC9454 mo3258 = c10139.m25480((AbstractC4308) obj).mo3258();
        EnumC9454 mo32582 = c10139.m25480((AbstractC4308) obj2).mo3258();
        EnumC9454 enumC9454 = EnumC9454.LONG;
        if (mo3258 == enumC9454 || mo3258 == EnumC9454.INT) {
            return mo32582 == enumC9454 || mo32582 == EnumC9454.INT;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23544(C10139 c10139, EnumC18550 enumC18550) {
        super(c10139, enumC18550);
        this.f75599 = c10139;
    }

    @Override // l.AbstractC14371
    /* renamed from: ֫ */
    public final C0758 mo5675(AbstractC4308 abstractC4308, AbstractC4308 abstractC43082) {
        C10139 c10139 = this.f75599;
        return m37193(new C17194(this, c10139.m25480(abstractC4308), c10139.m25480(abstractC43082)));
    }
}
