package l;

import java.util.EnumSet;

/* compiled from: Z5U8 */
/* renamed from: l.ۙ᩻۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4976 extends AbstractC20708 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f15669;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4976(C20002 c20002, AbstractC10370 abstractC10370, EnumC16970 enumC16970, EnumSet enumSet) {
        super(c20002, abstractC10370, enumC16970, enumSet);
        this.f15669 = c20002;
    }

    @Override // l.AbstractC20708
    /* renamed from: ֫ */
    public final boolean mo10868(EnumC6596 enumC6596) {
        return super.mo10868(enumC6596) && this.f15669.f64747;
    }

    @Override // l.AbstractC20708
    /* renamed from: ֫ */
    public final void mo2858(int i, AbstractC5698 abstractC5698) {
        C2609 m43517;
        C2609 m435172;
        if (abstractC5698.f17559 == EnumC1296.f4582) {
            AbstractC5698 abstractC56982 = abstractC5698.f17561;
            if (abstractC56982.f17559 == EnumC1296.f4568) {
                C0052 c0052 = (C0052) abstractC56982;
                EnumSet enumSet = c0052.f916;
                C18837 c18837 = new C18837();
                C20002 c20002 = this.f15669;
                C20085 c20085 = c20002.f64767;
                char m46124 = c20002.m46124();
                C6136 c6136 = c20002.f64785;
                C11003.requireNonNull(c6136);
                AbstractC10370 abstractC10370 = (AbstractC10370) c20085.m46282(m46124, new C23674(c6136));
                AbstractC10370 abstractC103702 = c20002.f64782.f17562;
                if (abstractC103702 != abstractC10370) {
                    throw c20002.m46116("module.name.mismatch", abstractC10370, abstractC103702);
                }
                char m461242 = c20002.m46124();
                EnumSet noneOf = EnumSet.noneOf(EnumC18398.class);
                for (EnumC18398 enumC18398 : EnumC18398.values()) {
                    if ((enumC18398.f57129 & m461242) != 0) {
                        noneOf.add(enumC18398);
                    }
                }
                enumSet.addAll(noneOf);
                char m461243 = c20002.m46124();
                C20085 c200852 = c20002.f64767;
                C11003.requireNonNull(c200852);
                c0052.f912 = (AbstractC10370) C20002.m46103(m461243, new C14853(c200852), (Object) null);
                C18837 c188372 = new C18837();
                char m461244 = c20002.m46124();
                for (int i2 = 0; i2 < m461244; i2++) {
                    C0052 m46285 = c20002.f64767.m46285(c20002.m46124());
                    char m461245 = c20002.m46124();
                    EnumSet noneOf2 = EnumSet.noneOf(EnumC9058.class);
                    for (EnumC9058 enumC9058 : EnumC9058.values()) {
                        if ((enumC9058.f27475 & m461245) != 0) {
                            noneOf2.add(enumC9058);
                        }
                    }
                    if (m46285 == c20002.f64770.f66509 && c20002.f64758 >= EnumC16970.V54.f52075) {
                        EnumC9058 enumC90582 = EnumC9058.TRANSITIVE;
                        if (noneOf2.contains(enumC90582)) {
                            throw c20002.m46116("bad.requires.flag", enumC90582);
                        }
                        EnumC9058 enumC90583 = EnumC9058.STATIC_PHASE;
                        if (noneOf2.contains(enumC90583)) {
                            throw c20002.m46116("bad.requires.flag", enumC90583);
                        }
                    }
                    c20002.m46124();
                    c188372.m43511(new C9764(m46285, noneOf2));
                }
                C2609 m435173 = c188372.m43517();
                c0052.f929 = m435173;
                c18837.addAll(m435173);
                C18837 c188373 = new C18837();
                char m461246 = c20002.m46124();
                for (int i3 = 0; i3 < m461246; i3++) {
                    C7814 m46283 = c20002.f64767.m46283(c20002.m46124());
                    char m461247 = c20002.m46124();
                    EnumSet noneOf3 = EnumSet.noneOf(EnumC14701.class);
                    for (EnumC14701 enumC14701 : EnumC14701.values()) {
                        if ((enumC14701.f44903 & m461247) != 0) {
                            noneOf3.add(enumC14701);
                        }
                    }
                    char m461248 = c20002.m46124();
                    if (m461248 == 0) {
                        m435172 = null;
                    } else {
                        C18837 c188374 = new C18837();
                        for (int i4 = 0; i4 < m461248; i4++) {
                            c188374.m43511(c20002.f64767.m46285(c20002.m46124()));
                        }
                        m435172 = c188374.m43517();
                    }
                    c188373.m43511(new C17524(m46283, m435172, noneOf3));
                }
                C2609 m435174 = c188373.m43517();
                c0052.f921 = m435174;
                c18837.addAll(m435174);
                C18837 c188375 = new C18837();
                char m461249 = c20002.m46124();
                if (m461249 != 0 && enumSet.contains(EnumC18398.OPEN)) {
                    throw c20002.m46116("module.non.zero.opens", c20002.f64782.f17562);
                }
                for (int i5 = 0; i5 < m461249; i5++) {
                    C7814 m462832 = c20002.f64767.m46283(c20002.m46124());
                    char m4612410 = c20002.m46124();
                    EnumSet noneOf4 = EnumSet.noneOf(EnumC6941.class);
                    for (EnumC6941 enumC6941 : EnumC6941.values()) {
                        if ((enumC6941.f21405 & m4612410) != 0) {
                            noneOf4.add(enumC6941);
                        }
                    }
                    char m4612411 = c20002.m46124();
                    if (m4612411 == 0) {
                        m43517 = null;
                    } else {
                        C18837 c188376 = new C18837();
                        for (int i6 = 0; i6 < m4612411; i6++) {
                            c188376.m43511(c20002.f64767.m46285(c20002.m46124()));
                        }
                        m43517 = c188376.m43517();
                    }
                    c188375.m43511(new C23874(m462832, m43517, noneOf4));
                }
                C2609 m435175 = c188375.m43517();
                c0052.f919 = m435175;
                c18837.addAll(m435175);
                c0052.f920 = c18837.m43517();
                C18837 c188377 = new C18837();
                char m4612412 = c20002.m46124();
                for (int i7 = 0; i7 < m4612412; i7++) {
                    c188377.m43511(new C19297((AbstractC10370) c20002.f64767.m46279(c20002.m46124(), new InterfaceC13191() { // from class: l.᩶᩻۠
                        @Override // l.InterfaceC13191
                        /* renamed from: ֫ */
                        public final Object mo23247(int i8, int i9, byte[] bArr) {
                            return C4976.this.f15669.f64785.m17058(C18382.m42811(i8, i9, bArr));
                        }
                    })));
                }
                c20002.f64745 = c188377.m43517();
                C18837 c188378 = new C18837();
                char m4612413 = c20002.m46124();
                for (int i8 = 0; i8 < m4612413; i8++) {
                    AbstractC10370 abstractC103703 = (AbstractC10370) c20002.f64767.m46279(c20002.m46124(), new InterfaceC13191() { // from class: l.᩶᩻۠
                        @Override // l.InterfaceC13191
                        /* renamed from: ֫ */
                        public final Object mo23247(int i82, int i9, byte[] bArr) {
                            return C4976.this.f15669.f64785.m17058(C18382.m42811(i82, i9, bArr));
                        }
                    });
                    char m4612414 = c20002.m46124();
                    C18837 c188379 = new C18837();
                    for (int i9 = 0; i9 < m4612414; i9++) {
                        c188379.m43511((AbstractC10370) c20002.f64767.m46279(c20002.m46124(), new InterfaceC13191() { // from class: l.᩶᩻۠
                            @Override // l.InterfaceC13191
                            /* renamed from: ֫ */
                            public final Object mo23247(int i82, int i92, byte[] bArr) {
                                return C4976.this.f15669.f64785.m17058(C18382.m42811(i82, i92, bArr));
                            }
                        }));
                        c188378.m43511(new C18591(abstractC103703, c188379.m43517()));
                    }
                }
                c20002.f64780 = c188378.m43517();
            }
        }
    }
}
