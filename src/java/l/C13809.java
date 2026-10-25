package l;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: S424 */
/* renamed from: l.ܰ۫֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13809 extends AbstractC0204 {

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final C4314 f41143 = new C4314();

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C6319 f41144;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13395 f41146;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C20661 f41147;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C4767 f41148;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C18837 f41149;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C6136 f41150;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f41151;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C5557 f41152;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15240 f41153;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22364 f41154;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C1755 f41156;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C4824 f41157;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC11223 f41158;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C11139 f41159;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C16782 f41160;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC19173 f41161;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C3267 f41162;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C18837 f41145 = new C18837();

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C14190 f41155 = new C11694();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13809 m33121(C2903 c2903) {
        C13809 c13809 = (C13809) c2903.m8838(f41143);
        return c13809 == null ? new C13809(c2903) : c13809;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1755 m33123(AbstractC19810 abstractC19810) {
        return this.f41160.m39519(abstractC19810);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Collection m33129() {
        return this.f41160.m39522();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1755 m33120(C1755 c1755, C5557 c5557) {
        C1755 m5877 = c1755.m5877(c5557, ((C8604) c1755.f6073).m22358(AbstractC14016.m33607(c5557.f17186)));
        m5877.f6079 = c5557;
        m5877.f6076 = c1755;
        C8604 c8604 = (C8604) m5877.f6073;
        c8604.f26299 = false;
        c8604.f26289 = null;
        c8604.f26295 = C7260.m19449(c1755.f6074);
        return m5877;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C1755 m33127(C1323 c1323) {
        C8604 c8604 = new C8604();
        C1755 c1755 = new C1755(c1323, c8604);
        c1755.f6075 = c1323;
        c1755.f6079 = this.f41152;
        c1323.f4737 = AbstractC14016.m33607(c1323.f4746);
        c1323.f4742 = new C22484(c1323.f4746);
        c1323.f4740 = new C23189(c1323.f4746);
        c8604.f26285 = c1323.f4737;
        c8604.f26289 = this.f41157;
        return c1755;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC14016 m33122(C1755 c1755) {
        if (c1755.f6074.m14709(EnumC18550.f57582)) {
            return ((C5557) c1755.f6074).f17186.f42762;
        }
        return ((C8604) c1755.f6073).f26285;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m33125(AbstractC5144 abstractC5144, C1755 c1755) {
        AbstractC4308 m36110;
        C13395 c13395 = this.f41146;
        C1755 c17552 = this.f41156;
        try {
            try {
                this.f41156 = c1755;
                c13395.m32410();
                abstractC5144.mo988(this);
                m36110 = this.f41151;
            } catch (C20515 e) {
                C15240 c15240 = this.f41153;
                abstractC5144.getClass();
                m36110 = c15240.m36110(abstractC5144, e);
            }
            return m36110;
        } finally {
            c13395.m32414();
            this.f41156 = c17552;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m33124(C2609 c2609, C1755 c1755) {
        C18837 c18837 = new C18837();
        while (c2609.m8249()) {
            AbstractC4308 m33125 = m33125((AbstractC5144) c2609.f8240, c1755);
            if (m33125 != null) {
                c18837.m43511(m33125);
            }
            c2609 = c2609.f8241;
        }
        return c18837.m43517();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1367(final l.C1323 r17) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13809.mo1367(l.֨᩵۠):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x019a  */
    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1215(l.C5557 r22) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13809.mo1215(l.ۚ᩵۠):void");
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1403(C14315 c14315) {
        C8541 c8541;
        AbstractC4308 abstractC4308 = c14315.f16086;
        if (abstractC4308 != null) {
            c8541 = (C8541) abstractC4308;
        } else {
            c8541 = new C8541(((C8604) this.f41156.f6073).f26285.f23673, this.f41147.f66522, c14315.f43169);
        }
        c14315.f16086 = c8541;
        if (this.f41153.m36162(c14315, c8541.f13890, ((C8604) this.f41156.f6073).f26285)) {
            ((C8604) this.f41156.f6073).f26285.mo26382(c8541.f13890);
        }
        this.f41151 = c8541;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1375(C3587 c3587) {
        C1755 c1755 = this.f41156;
        C12171.m29637(c3587.f11377);
        C1755 m5877 = c1755.m5877(c3587, ((C8604) c1755.f6073).m22358(AbstractC14016.m33607(c3587.f11377)));
        m5877.f6079 = this.f41152;
        m5877.f6076 = c1755;
        C8604 c8604 = (C8604) m5877.f6073;
        c8604.f26299 = false;
        c8604.f26289 = null;
        this.f41160.m39521(c3587.f11377, m5877);
        if (this.f41162.m10059(c3587.f11377)) {
            this.f41148.add(m5877);
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1379(AbstractC5144 abstractC5144) {
        this.f41151 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33126(C14163 c14163, C2609 c2609) {
        C13395 c13395 = this.f41146;
        c13395.m32410();
        C18837 c18837 = this.f41149;
        C11139 c11139 = this.f41159;
        if (c11139.f33434) {
            this.f41149 = new C18837();
        }
        try {
            m33124(c2609, (C1755) null);
            if (c11139.f33434) {
                while (this.f41149.m43518()) {
                    C14163 c141632 = (C14163) this.f41149.m43516();
                    if (c14163 != null && c14163 != c141632 && c18837 != null) {
                        c18837.m43511(c141632);
                    }
                    c141632.mo16101();
                }
                boolean m10065 = this.f41162.m10065();
                C18837 c188372 = this.f41145;
                if (!m10065) {
                    Iterator it = c2609.iterator();
                    while (it.hasNext()) {
                        C1323 c1323 = (C1323) it.next();
                        if (c1323.m4616() != null) {
                            c188372.m43511(c1323);
                        } else {
                            c11139.m27651(C2609.of((Object) c1323));
                        }
                    }
                } else {
                    c11139.m27651(c188372.m43517());
                    c188372.clear();
                    c11139.m27651(c2609);
                }
            }
        } finally {
            this.f41149 = c18837;
            c13395.m32414();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m33128() {
        this.f41160.m39520();
    }

    public C13809(C2903 c2903) {
        c2903.m8841(f41143, this);
        this.f41154 = C22364.m50099(c2903);
        C17013 m39896 = C17013.m39896(c2903);
        C20661 m47250 = C20661.m47250(c2903);
        this.f41147 = m47250;
        this.f41153 = C15240.m36054(c2903);
        C11139 c11139 = (C11139) c2903.m8838(C11139.f33424);
        this.f41159 = c11139 == null ? new C11139(c2903) : c11139;
        this.f41144 = C6319.m17456(c2903);
        this.f41146 = C13395.m32391(c2903);
        this.f41157 = C4824.m14050(c2903);
        this.f41150 = C6136.m17057(c2903);
        this.f41162 = C3267.m10022(c2903);
        C5931.m16615(c2903);
        C2176 m39899 = m39896.m39899(1L);
        C14163 c14163 = m47250.f66458;
        C5557 m39908 = m39896.m39908(m39899, c14163.f17562, C2609.m8239(), (AbstractC12612) null, C2609.m8239(), C2609.m8239());
        this.f41152 = m39908;
        m39908.f17186 = c14163;
        this.f41148 = C4767.m13930(c2903);
        this.f41158 = (InterfaceC11223) c2903.m8837(InterfaceC11223.class);
        this.f41161 = EnumC19173.m44252(C11781.m28823(c2903));
        this.f41160 = C16782.m39518(c2903);
    }
}
