package l;

import java.util.Iterator;

/* compiled from: I3GH */
/* renamed from: l.᩶ۚ۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C19961 implements InterfaceC12501 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17013 f64644;

    public C19961(C17013 c17013) {
        this.f64644 = c17013;
    }

    /* renamed from: ֫ */
    public AbstractC5144 mo8690(AbstractC5144 abstractC5144, Object obj) {
        if (abstractC5144 == null) {
            return null;
        }
        if (AbstractC5144.m14708()) {
            return (AbstractC5144) AbstractC5144.m14706(new C22077(this, abstractC5144, obj));
        }
        return (AbstractC5144) abstractC5144.mo986(this, obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m46040(Object obj, C2609 c2609) {
        if (c2609 == null || c2609.isEmpty()) {
            return c2609;
        }
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            c18837.m43511(mo8690((AbstractC5144) it.next(), obj));
        }
        return c18837.m43517();
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11825(C18257 c18257, Object obj) {
        C2609 m46040 = m46040(obj, c18257.f56778);
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c18257.f56779, obj);
        int i = c18257.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39937(abstractC12612, m46040);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11822(C17551 c17551, Object obj) {
        AbstractC5144 mo8690 = mo8690(c17551.f53650, obj);
        C2609 m46040 = m46040(obj, c17551.f53653);
        EnumC3329 mo987 = c17551.mo987();
        EnumC3329 enumC3329 = EnumC3329.TYPE_ANNOTATION;
        C17013 c17013 = this.f64644;
        if (mo987 == enumC3329) {
            c17013.f52172 = c17551.f16085;
            C17551 m39966 = c17013.m39966(mo8690, m46040);
            m39966.f53652 = c17551.f53652;
            return m39966;
        }
        c17013.f52172 = c17551.f16085;
        C17551 m39932 = c17013.m39932(mo8690, m46040);
        m39932.f53652 = c17551.f53652;
        return m39932;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11794(C6968 c6968, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c6968.f21475, obj);
        AbstractC12612 abstractC126122 = (AbstractC12612) mo8690(c6968.f21476, obj);
        int i = c6968.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        C6968 c69682 = new C6968();
        c69682.f21475 = abstractC12612;
        c69682.f21476 = abstractC126122;
        c69682.f16085 = c17013.f52172;
        return c69682;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11830(C21080 c21080, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c21080.f67987, obj);
        AbstractC12612 abstractC126122 = (AbstractC12612) mo8690(c21080.f67988, obj);
        int i = c21080.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39941(abstractC12612, abstractC126122);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11801(C9791 c9791, Object obj) {
        AbstractC5144 mo8690 = mo8690(c9791.f29619, obj);
        AbstractC5144 mo86902 = mo8690(c9791.f29618, obj);
        int i = c9791.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39924(c9791.f2829, mo8690, mo86902);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11799(C9085 c9085, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c9085.f27533, obj);
        AbstractC12612 abstractC126122 = (AbstractC12612) mo8690(c9085.f27532, obj);
        int i = c9085.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39919(c9085.f2829, abstractC12612, abstractC126122);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11786(C2735 c2735, Object obj) {
        C2609 m46040 = m46040(obj, c2735.f8521);
        int i = c2735.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39902(c2735.f8522, m46040);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11789(C4146 c4146, Object obj) {
        int i = c4146.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39906(c4146.f13545);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11785(C2322 c2322, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c2322.f7456, obj);
        int i = c2322.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39959(abstractC12612);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11827(C18963 c18963, Object obj) {
        AbstractC5144 abstractC5144;
        C2609 m46040 = m46040(obj, c18963.f59815);
        C2609 m460402 = m46040(obj, c18963.f59814);
        EnumC6652 enumC6652 = c18963.f59817;
        if (enumC6652 == EnumC6652.RULE) {
            abstractC5144 = ((c18963.f59813 instanceof AbstractC12612) && ((AbstractC11349) c18963.f59814.f8240).m14709(EnumC18550.f57493)) ? ((C2322) c18963.f59814.f8240).f7456 : (AbstractC5144) c18963.f59814.f8240;
        } else {
            abstractC5144 = null;
        }
        int i = c18963.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39938(enumC6652, m46040, m460402, abstractC5144);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11780(C0617 c0617, Object obj) {
        C9378 c9378 = (C9378) mo8690((AbstractC5144) c0617.f2373, obj);
        C2735 c2735 = (C2735) mo8690((AbstractC5144) c0617.f2372, obj);
        int i = c0617.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39897(c9378, c2735);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11791(C5557 c5557, Object obj) {
        C2176 c2176 = (C2176) mo8690((AbstractC5144) c5557.f17181, obj);
        C2609 m46040 = m46040(obj, c5557.f17185);
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c5557.f17184, obj);
        C2609 m460402 = m46040(obj, c5557.f17183);
        C2609 m460403 = m46040(obj, c5557.f17179);
        int i = c5557.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39908(c2176, c5557.f17180, m46040, abstractC12612, m460402, m460403);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11796(C8379 c8379, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c8379.f25701, obj);
        AbstractC12612 abstractC126122 = (AbstractC12612) mo8690(c8379.f25699, obj);
        AbstractC12612 abstractC126123 = (AbstractC12612) mo8690(c8379.f25700, obj);
        int i = c8379.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39916(abstractC12612, abstractC126122, abstractC126123);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11815(C15433 c15433, Object obj) {
        int i = c15433.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        AbstractC10370 abstractC10370 = c15433.f47247;
        C15433 c154332 = new C15433();
        c154332.f47247 = abstractC10370;
        c154332.f47248 = null;
        c154332.f16085 = c17013.f52172;
        return c154332;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11828(C20374 c20374, Object obj) {
        AbstractC11349 abstractC11349 = (AbstractC11349) mo8690(c20374.f65770, obj);
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c20374.f65771, obj);
        int i = c20374.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        C20374 c203742 = new C20374();
        c203742.f65770 = abstractC11349;
        c203742.f65771 = abstractC12612;
        c203742.f16085 = c17013.f52172;
        return c203742;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo27295(C3440 c3440, Object obj) {
        C2609 m46040 = m46040(obj, c3440.f10874);
        int i = c3440.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39949(m46040);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11803(C10496 c10496, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c10496.f31483, obj);
        int i = c10496.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39953(abstractC12612);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11790(C4851 c4851, Object obj) {
        C9378 c9378 = (C9378) mo8690((AbstractC5144) c4851.f15325, obj);
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c4851.f15326, obj);
        AbstractC11349 abstractC11349 = (AbstractC11349) mo8690(c4851.f15324, obj);
        int i = c4851.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        C4851 c48512 = new C4851();
        c48512.f15325 = c9378;
        c48512.f15326 = abstractC12612;
        c48512.f15324 = abstractC11349;
        c48512.f16085 = c17013.f52172;
        return c48512;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11806(C11907 c11907, Object obj) {
        C2609 m46040 = m46040(obj, c11907.f35587);
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c11907.f35588, obj);
        C2609 m460402 = m46040(obj, c11907.f35586);
        AbstractC11349 abstractC11349 = (AbstractC11349) mo8690(c11907.f35585, obj);
        int i = c11907.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39926(m46040, abstractC12612, m460402, abstractC11349);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo5306(C7673 c7673, Object obj) {
        int i = c7673.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39951(c7673.f23696);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11782(C1470 c1470, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c1470.f5225, obj);
        AbstractC11349 abstractC11349 = (AbstractC11349) mo8690(c1470.f5226, obj);
        AbstractC11349 abstractC113492 = (AbstractC11349) mo8690(c1470.f5227, obj);
        int i = c1470.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39898(abstractC12612, abstractC11349, abstractC113492);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11804(C10643 c10643, Object obj) {
        AbstractC5144 mo8690 = mo8690(c10643.f32021, obj);
        int i = c10643.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        boolean z = c10643.f32020;
        C10643 c106432 = new C10643();
        c106432.f32021 = mo8690;
        c106432.f32020 = z;
        c106432.f16085 = c17013.f52172;
        return c106432;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11813(C14728 c14728, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c14728.f44980, obj);
        AbstractC12612 abstractC126122 = (AbstractC12612) mo8690(c14728.f44979, obj);
        int i = c14728.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39956(abstractC12612, abstractC126122);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11823(C17698 c17698, Object obj) {
        AbstractC11349 abstractC11349 = (AbstractC11349) mo8690(c17698.f54159, obj);
        int i = c17698.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        AbstractC10370 abstractC10370 = c17698.f54160;
        C17698 c176982 = new C17698();
        c176982.f54160 = abstractC10370;
        c176982.f54159 = abstractC11349;
        c176982.f16085 = c17013.f52172;
        return c176982;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11832(C23342 c23342, Object obj) {
        int i = c23342.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39944(c23342.f74996, c23342.f74997);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11797(C8526 c8526, Object obj) {
        C2176 c2176 = (C2176) mo8690((AbstractC5144) c8526.f26046, obj);
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c8526.f26051, obj);
        C2609 m46040 = m46040(obj, c8526.f26047);
        C2609 m460402 = m46040(obj, c8526.f26048);
        C9378 c9378 = (C9378) mo8690((AbstractC5144) c8526.f26052, obj);
        C2609 m460403 = m46040(obj, c8526.f26042);
        C2735 c2735 = (C2735) mo8690((AbstractC5144) c8526.f26043, obj);
        AbstractC12612 abstractC126122 = (AbstractC12612) mo8690(c8526.f26049, obj);
        int i = c8526.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39917(c2176, c8526.f26044, abstractC12612, m46040, c9378, m460402, m460403, c2735, abstractC126122);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11816(C15580 c15580, Object obj) {
        C2609 m46040 = m46040(obj, c15580.f48010);
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c15580.f48011, obj);
        C2609 m460402 = m46040(obj, c15580.f48012);
        int i = c15580.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39929(abstractC12612, m46040, m460402);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11784(C2176 c2176, Object obj) {
        C2609 m46040 = m46040(obj, c2176.f7168);
        int i = c2176.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39947(c2176.f7169, m46040);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11826(C18404 c18404, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c18404.f57138, obj);
        C2609 m46040 = m46040(obj, c18404.f57140);
        C2609 m460402 = m46040(obj, c18404.f57139);
        int i = c18404.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39958(abstractC12612, m46040, m460402);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public C19110 mo6993(C19110 c19110, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c19110.f60199, obj);
        C2609 m46040 = m46040(obj, c19110.f60198);
        AbstractC12612 abstractC126122 = (AbstractC12612) mo8690(c19110.f60196, obj);
        C2609 m460402 = m46040(obj, c19110.f60197);
        C5557 c5557 = (C5557) mo8690((AbstractC5144) c19110.f60195, obj);
        int i = c19110.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39939(abstractC12612, m46040, abstractC126122, m460402, c5557, false);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public C14169 mo6992(C14169 c14169, Object obj) {
        C2609 m46040 = m46040(obj, c14169.f42775);
        AbstractC5144 mo8690 = mo8690(c14169.f42776, obj);
        int i = c14169.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39955(mo8690, m46040);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11814(C14875 c14875, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c14875.f45392, obj);
        int i = c14875.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        C14875 c148752 = new C14875();
        c148752.f45392 = abstractC12612;
        c148752.f16085 = c17013.f52172;
        return c148752;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11802(C9938 c9938, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c9938.f30017, obj);
        int i = c9938.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39964(abstractC12612);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo5305(C6262 c6262, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c6262.f19397, obj);
        int i = c6262.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39912(abstractC12612, c6262.f19395);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public AbstractC5144 mo11800(C9232 c9232, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c9232.f27945, obj);
        C2609 m46040 = m46040(obj, c9232.f27947);
        int i = c9232.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        C9232 c92322 = new C9232(c9232.f27940, c9232.f27944, abstractC12612, m46040);
        c92322.f16085 = c17013.f52172;
        return c92322;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11792(C5704 c5704, Object obj) {
        int i = c5704.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39963();
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11831(C22637 c22637, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c22637.f73103, obj);
        C2609 m46040 = m46040(obj, c22637.f73102);
        int i = c22637.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39972(abstractC12612, m46040);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11811(C13464 c13464, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c13464.f40197, obj);
        C2609 m46040 = m46040(obj, c13464.f40199);
        int i = c13464.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39968(abstractC12612, m46040);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11795(C7115 c7115, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c7115.f21831, obj);
        C2735 c2735 = (C2735) mo8690((AbstractC5144) c7115.f21830, obj);
        int i = c7115.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        C7115 c71152 = new C7115();
        c71152.f21831 = abstractC12612;
        c71152.f21830 = c2735;
        c71152.f16085 = c17013.f52172;
        return c71152;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11783(C1616 c1616, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c1616.f5680, obj);
        int i = c1616.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39971(abstractC12612);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11781(C1323 c1323, Object obj) {
        C2609 m46040 = m46040(obj, c1323.f4738);
        int i = c1323.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39970(m46040);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo27296(C7820 c7820, Object obj) {
        C2609 m46040 = m46040(obj, c7820.f24198);
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c7820.f24199, obj);
        int i = c7820.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        C12171.m29637(m46040);
        C12171.m29637(abstractC12612);
        C7820 c78202 = new C7820();
        c78202.f24198 = m46040;
        c78202.f24199 = abstractC12612;
        c78202.f16085 = c17013.f52172;
        return c78202;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11805(C10789 c10789, Object obj) {
        C2609 m46040 = m46040(obj, c10789.f32446);
        C2735 c2735 = (C2735) mo8690((AbstractC5144) c10789.f32445, obj);
        C2609 m460402 = m46040(obj, c10789.f32449);
        C2735 c27352 = (C2735) mo8690((AbstractC5144) c10789.f32448, obj);
        int i = c10789.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39925(m46040, c2735, m460402, c27352);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11820(C16432 c16432, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c16432.f50542, obj);
        C2609 m46040 = m46040(obj, c16432.f50541);
        int i = c16432.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39960(abstractC12612, m46040);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11833(C23488 c23488, Object obj) {
        C2609 m46040 = m46040(obj, c23488.f75416);
        int i = c23488.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        C23488 c234882 = new C23488();
        c234882.f75416 = m46040;
        c234882.f16085 = c17013.f52172;
        return c234882;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11821(C17138 c17138, Object obj) {
        C2609 m46040 = m46040(obj, c17138.f52525);
        int i = c17138.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        C17138 c171382 = new C17138();
        c171382.f52525 = m46040;
        c171382.f16085 = c17013.f52172;
        return c171382;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11834(C23901 c23901, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c23901.f77274, obj);
        int i = c23901.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39969(abstractC12612);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11824(C17844 c17844, Object obj) {
        AbstractC5144 mo8690 = mo8690(c17844.f54511, obj);
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c17844.f54512, obj);
        int i = c17844.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39936(mo8690, abstractC12612);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11787(C2882 c2882, Object obj) {
        int i = c2882.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39903(c2882.f9190);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11812(C14315 c14315, Object obj) {
        C2609 m46040 = m46040(obj, c14315.f43168);
        C2609 m460402 = m46040(obj, c14315.f43170);
        int i = c14315.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        AbstractC10370 abstractC10370 = c14315.f43169;
        C14315 c143152 = new C14315();
        c143152.f43169 = abstractC10370;
        c143152.f43170 = m460402;
        c143152.f43168 = m46040;
        c143152.f16085 = c17013.f52172;
        return c143152;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11819(C16286 c16286, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c16286.f50075, obj);
        AbstractC5144 mo8690 = mo8690(c16286.f50076, obj);
        int i = c16286.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        C16286 c162862 = new C16286();
        c162862.f50075 = abstractC12612;
        c162862.f50076 = mo8690;
        c162862.f16085 = c17013.f52172;
        return c162862;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11818(C16139 c16139, Object obj) {
        C9378 c9378 = (C9378) mo8690((AbstractC5144) c16139.f49721, obj);
        int i = c16139.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        C16139 c161392 = new C16139();
        c161392.f49721 = c9378;
        c161392.f16085 = c17013.f52172;
        return c161392;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo27297(C14022 c14022, Object obj) {
        AbstractC21932 abstractC21932 = (AbstractC21932) mo8690(c14022.f42404, obj);
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c14022.f42403, obj);
        int i = c14022.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        C14022 c140222 = new C14022();
        c140222.f42404 = abstractC21932;
        c140222.f42403 = abstractC12612;
        c140222.f16085 = c17013.f52172;
        return c140222;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo27298(C21227 c21227, Object obj) {
        AbstractC21932 abstractC21932 = (AbstractC21932) mo8690(c21227.f68420, obj);
        int i = c21227.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        C21227 c212272 = new C21227();
        c212272.f68420 = abstractC21932;
        c212272.f16085 = c17013.f52172;
        return c212272;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo27299(C21785 c21785) {
        int i = c21785.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39942();
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11793(C6555 c6555, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c6555.f20226, obj);
        int i = c6555.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39913(c6555.f2829, abstractC12612);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public C9378 mo8689(C9378 c9378, Object obj) {
        C2176 c2176 = (C2176) mo8690((AbstractC5144) c9378.f28486, obj);
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c9378.f28488, obj);
        AbstractC12612 abstractC126122 = c9378.f28483;
        C17013 c17013 = this.f64644;
        if (abstractC126122 == null) {
            AbstractC12612 abstractC126123 = (AbstractC12612) mo8690(c9378.f28487, obj);
            c17013.f52172 = c9378.f16085;
            return c17013.m39920(c2176, c9378.f28484, abstractC12612, abstractC126123);
        }
        AbstractC12612 abstractC126124 = (AbstractC12612) mo8690(abstractC126122, obj);
        c17013.f52172 = c9378.f16085;
        return c17013.m39922(c2176, abstractC126124, abstractC12612);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11798(C8672 c8672, Object obj) {
        AbstractC11349 abstractC11349 = (AbstractC11349) mo8690(c8672.f26444, obj);
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c8672.f26445, obj);
        int i = c8672.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        C8672 c86722 = new C8672();
        c86722.f26445 = abstractC12612;
        c86722.f26444 = abstractC11349;
        c86722.f16085 = c17013.f52172;
        return c86722;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11817(C15726 c15726, Object obj) {
        C19256 c19256 = c15726.f48502;
        int i = c19256.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        C19256 m39940 = c17013.m39940(c19256.f60620);
        AbstractC5144 mo8690 = mo8690(c15726.f48501, obj);
        c17013.f52172 = c15726.f16085;
        return c17013.m39930(m39940, mo8690);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11788(C3587 c3587, Object obj) {
        C2176 c2176 = (C2176) mo8690((AbstractC5144) c3587.f11379, obj);
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c3587.f11378, (Object) null);
        C2609 m46040 = m46040((Object) null, c3587.f11376);
        int i = c3587.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        return c17013.m39904(c2176, c3587.mo10982(), abstractC12612, m46040);
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11810(C13317 c13317, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c13317.f39865, obj);
        C2609 m46040 = m46040(obj, c13317.f39866);
        int i = c13317.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        C13317 c133172 = new C13317();
        c133172.f39865 = abstractC12612;
        c133172.f39866 = m46040;
        c133172.f16085 = c17013.f52172;
        return c133172;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11779(C0058 c0058, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c0058.f946, obj);
        C2609 m46040 = m46040(obj, c0058.f947);
        int i = c0058.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        C0058 c00582 = new C0058();
        c00582.f946 = abstractC12612;
        c00582.f947 = m46040;
        c00582.f16085 = c17013.f52172;
        return c00582;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11808(C12759 c12759, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c12759.f38349, obj);
        C2609 m46040 = m46040(obj, c12759.f38348);
        int i = c12759.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        C12759 c127592 = new C12759();
        c127592.f38349 = abstractC12612;
        c127592.f38348 = m46040;
        c127592.f16085 = c17013.f52172;
        return c127592;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11807(C12054 c12054, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c12054.f36052, obj);
        int i = c12054.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        boolean z = c12054.f36053;
        boolean z2 = c12054.f36054;
        C12054 c120542 = new C12054();
        c120542.f36053 = z;
        c120542.f36054 = z2;
        c120542.f36052 = abstractC12612;
        c120542.f16085 = c17013.f52172;
        return c120542;
    }

    @Override // l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo11829(C20667 c20667, Object obj) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo8690(c20667.f66557, obj);
        int i = c20667.f16085;
        C17013 c17013 = this.f64644;
        c17013.f52172 = i;
        C20667 c206672 = new C20667();
        c206672.f66557 = abstractC12612;
        c206672.f16085 = c17013.f52172;
        return c206672;
    }
}
