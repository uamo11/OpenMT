package l;

/* compiled from: Y50P */
/* renamed from: l.۫᩹ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12692 extends AbstractC0634 {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f38211;

    public C12692() {
        super(EnumC1340.ARRAY, null, null);
    }

    public C12692(AbstractC8396 abstractC8396, AbstractC8396 abstractC83962, String str) {
        super(EnumC1340.ARRAY, abstractC8396, abstractC83962);
        this.f38211 = str;
    }

    @Override // l.AbstractC0634, l.AbstractC8396
    public final AbstractC8396 clone() {
        AbstractC8396 abstractC8396 = this.f2428;
        abstractC8396.getClass();
        AbstractC8396 clone = abstractC8396.clone();
        AbstractC8396 abstractC83962 = this.f2429;
        abstractC83962.getClass();
        return new C12692(clone, abstractC83962.clone(), this.f38211);
    }

    @Override // l.AbstractC8396
    /* renamed from: ֫ */
    public final AbstractC8396 mo6718(C1403 c1403) {
        return new C12692(this.f2428.mo6718(c1403), this.f2429.mo6718(c1403), this.f38211);
    }

    @Override // l.AbstractC8396
    /* renamed from: ܳ */
    public final String mo6719() {
        return this.f2428 + "[" + this.f2429 + "]";
    }
}
