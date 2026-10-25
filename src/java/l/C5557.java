package l;

/* compiled from: H44W */
/* renamed from: l.ۚ᩵۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5557 extends AbstractC11349 implements InterfaceC8769 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C2609 f17179;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC10370 f17180;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C2176 f17181;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C2609 f17182;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2609 f17183;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC12612 f17184;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2609 f17185;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C14163 f17186;

    public C5557() {
        throw null;
    }

    @Override // l.AbstractC5144
    /* renamed from: ֫ */
    public final void mo988(AbstractC0204 abstractC0204) {
        abstractC0204.mo1215(this);
    }

    @Override // l.InterfaceC13206
    /* renamed from: ֫ */
    public final EnumC3329 mo987() {
        long j = this.f17181.f7169;
        if ((8192 & j) != 0) {
            return EnumC3329.ANNOTATION_TYPE;
        }
        if ((512 & j) != 0) {
            return EnumC3329.INTERFACE;
        }
        if ((16384 & j) != 0) {
            return EnumC3329.ENUM;
        }
        if ((j & 2305843009213693952L) != 0) {
            return EnumC3329.RECORD;
        }
        return EnumC3329.CLASS;
    }

    @Override // l.AbstractC5144, l.InterfaceC13206
    /* renamed from: ֫ */
    public final Object mo986(InterfaceC12501 interfaceC12501, Object obj) {
        return interfaceC12501.mo11791(this, obj);
    }

    @Override // l.AbstractC5144
    /* renamed from: ܽ֫ */
    public final EnumC18550 mo989() {
        return EnumC18550.f57582;
    }
}
