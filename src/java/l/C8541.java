package l;

/* compiled from: 34PY */
/* renamed from: l.ۡ֨֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C8541 extends AbstractC4308 {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f26106;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f26107;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f26108;

    @Override // l.AbstractC4308
    /* renamed from: ֨֫ */
    public final boolean mo12908() {
        return true;
    }

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public boolean mo22227() {
        return false;
    }

    @Override // l.AbstractC4308
    /* renamed from: ܺ֫ */
    public final boolean mo12936() {
        return true;
    }

    public C8541(AbstractC5698 abstractC5698, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370) {
        super(null, C20743.f66779);
        this.f26107 = null;
        this.f26108 = -1;
        C12171.m29637(abstractC4308);
        this.f13890 = new C4287(0L, abstractC10370, this, abstractC5698);
        mo21267((AbstractC4308) null);
        this.f26106 = abstractC4308;
    }

    public C8541(AbstractC19810 abstractC19810, AbstractC4308 abstractC4308, AbstractC4308 abstractC43082, C20743 c20743) {
        super(abstractC19810, c20743);
        this.f26107 = null;
        this.f26108 = -1;
        C12171.m29637(abstractC43082);
        mo21267(abstractC4308);
        this.f26106 = abstractC43082;
    }

    @Override // l.AbstractC4308
    /* renamed from: ֫ */
    public C8541 mo1357(C20743 c20743) {
        return new C9247(this, this.f13890, mo12939(), this.f26106, c20743);
    }

    @Override // l.AbstractC4308
    /* renamed from: ֫֫ */
    public final EnumC9454 mo3258() {
        return EnumC9454.TYPEVAR;
    }

    @Override // l.AbstractC4308
    /* renamed from: ֫ */
    public Object mo2962(InterfaceC21242 interfaceC21242, Object obj) {
        return interfaceC21242.mo2142(this, obj);
    }

    @Override // l.AbstractC4308
    /* renamed from: ᩳ֫ */
    public AbstractC4308 mo12939() {
        return this.f26107;
    }

    /* renamed from: ᩳ */
    public void mo21267(AbstractC4308 abstractC4308) {
        this.f26107 = abstractC4308;
    }

    @Override // l.AbstractC4308
    /* renamed from: ۤ */
    public final AbstractC4308 mo12927() {
        return this.f26106;
    }

    @Override // l.AbstractC4308, l.InterfaceC5641
    /* renamed from: ֫ */
    public final EnumC0701 mo3256() {
        return EnumC0701.TYPEVAR;
    }
}
