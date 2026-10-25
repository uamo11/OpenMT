package l;

import java.util.function.Predicate;

/* compiled from: W7SR */
/* renamed from: l.۫۫֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12399 extends AbstractC0204 {

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C4314 f37338 = new C4314();

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C19961 f37339;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13395 f37340;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C22364 f37341;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C17013 f37342;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C6319 f37343;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C11714 f37344 = new C11714();

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C10222 f37345;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C13809 f37346;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5572 f37347;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1380 f37348;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C6735 f37349;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9310 f37350;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2002 f37351;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15240 f37352;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C22406 f37353;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C7673 f37354;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13124 f37355;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C5931 f37356;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5144 m30568(AbstractC5144 abstractC5144, C1755 c1755, C23420 c23420, C19961 c19961, C11964 c11964, EnumC7480 enumC7480, C21095 c21095) {
        final AbstractC5144 mo8690 = c19961.mo8690(abstractC5144, (Object) null);
        C13809 c13809 = this.f37346;
        C8604 c8604 = (C8604) c1755.f6073;
        AbstractC14016 abstractC14016 = c8604.f26285;
        C1755 m5877 = c1755.m5877(mo8690, c8604.m22358(abstractC14016.mo26383(abstractC14016.f23673)));
        ((C8604) m5877.f6073).f26283 = enumC7480;
        C22364 c22364 = this.f37341;
        AbstractC1197 c8872 = c11964 != null ? (AbstractC1197) c11964.get() : new C8872(c22364, new Predicate() { // from class: l.᩷۫֨
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                InterfaceC3109 m39356 = ((C16719) obj).m39356();
                C9578 c9578 = new C9578();
                c9578.f29039 = false;
                c9578.f29040 = m39356;
                c9578.mo10758(AbstractC5144.this);
                return c9578.f29039;
            }
        });
        C2002 c2002 = this.f37351;
        InterfaceC7213 m6533 = c2002.m6533(c2002.f6698);
        C4929 c4929 = new C4929(new C18837(), new C18837(), new C18837(), new C18837());
        C13395 c13395 = this.f37340;
        C4929 m32402 = c13395.m32402(c4929);
        int i = c22364.f72451;
        c22364.f72451 = 0;
        try {
            this.f37350.m23930(mo8690, m5877, c23420);
            return mo8690;
        } finally {
            c13395.m32402(m32402);
            c2002.m6533(m6533);
            c22364.f72451 += i;
            C1323 c1323 = c1755.f6075;
            c13809.getClass();
            new C22982(c13809, c1323.f4739).mo10758(mo8690);
            c22364.m50112(c8872);
            if (c21095 != null) {
                c21095.f68037.f17260 = c21095.f68036;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12399 m30567(C2903 c2903) {
        C12399 c12399 = (C12399) c2903.m8838(f37338);
        return c12399 == null ? new C12399(c2903) : c12399;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14169 m30569(C14169 c14169, C1755 c1755, C23420 c23420) {
        Object obj;
        C18837 c18837 = new C18837();
        c18837.addAll(c14169.f42775);
        EnumC13706 m33819 = c14169.m33819();
        EnumC13706 enumC13706 = EnumC13706.EXPRESSION;
        C17013 c17013 = this.f37342;
        if (m33819 == enumC13706) {
            obj = c17013.m39964((AbstractC12612) c14169.f42776);
        } else {
            obj = (C2735) c14169.f42776;
        }
        c18837.m43511(obj);
        c17013.f52172 = c14169.f16085;
        C2735 m39902 = c17013.m39902(0L, c18837.m43517());
        C9310 c9310 = this.f37350;
        C1755 m23922 = c9310.m23922(c14169, c1755);
        Object obj2 = m23922.f6073;
        try {
            ((C8604) obj2).f26284 = c23420;
            C2735 c2735 = (C2735) m30568(m39902, m23922, c23420, this.f37339, null, EnumC7480.SPECULATIVE, null);
            C2609 c2609 = (C2609) C5378.stream(c2735.f8521).filter(new C3247()).map(new C1775(7)).collect(C2609.m8240());
            AbstractC5144 abstractC5144 = (AbstractC5144) c2735.f8521.last();
            if (abstractC5144.m14709(EnumC18550.f57530)) {
                abstractC5144 = ((C9938) abstractC5144).f30017;
            }
            C14169 m39955 = c17013.m39955(abstractC5144, c2609);
            c9310.f28225.m21193();
            new C12878(c9310).mo10758(m39955.f42776);
            this.f37345.m25664(c1755, m39955, c17013, false);
            return m39955;
        } finally {
            ((C8604) obj2).f26285.mo26377();
        }
    }

    public C12399(C2903 c2903) {
        c2903.m8841(f37338, this);
        this.f37340 = C13395.m32391(c2903);
        this.f37350 = C9310.m23901(c2903);
        this.f37347 = C5572.m15819(c2903);
        this.f37352 = C15240.m36054(c2903);
        this.f37356 = C5931.m16615(c2903);
        this.f37346 = C13809.m33121(c2903);
        C6735 m18336 = C6735.m18336(c2903);
        this.f37349 = m18336;
        this.f37353 = C22406.m50289(c2903);
        this.f37341 = C22364.m50099(c2903);
        C20661.m47250(c2903);
        C17013 m39896 = C17013.m39896(c2903);
        this.f37342 = m39896;
        this.f37343 = C6319.m17456(c2903);
        this.f37345 = C10222.m25648(c2903);
        C7673 m39951 = m39896.m39951(C6136.m17057(c2903).f18867);
        m39951.f16086 = AbstractC4308.f13886;
        this.f37354 = m39951;
        C16782.m39518(c2903);
        this.f37351 = C2002.m6532(c2903);
        this.f37355 = new C13124(this, EnumC13829.CHECK, null, EnumC16761.f51453, m18336.f20931, null, null);
        this.f37339 = new C10303(this, m39896);
        this.f37348 = new C6069(this);
    }
}
