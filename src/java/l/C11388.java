package l;

import java.io.IOException;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

/* compiled from: P9FO */
/* renamed from: l.ۨ֫ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11388 implements InterfaceC12798 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C20475 f34069;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18086 f34070;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C2215 f34071;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractSet f34072;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Random f34073;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f34074;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public EnumC5743 f34075;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f34068 = C11321.m27961(C11388.class);

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C21574 f34067 = new C21574("1.3.6.1.4.1.311.2.2.10");

    @Override // l.InterfaceC12798
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23415 mo28153(C2921 c2921, byte[] bArr, C6717 c6717) {
        try {
            EnumC5743 enumC5743 = this.f34075;
            EnumC5743 enumC57432 = EnumC5743.COMPLETE;
            if (enumC5743 == enumC57432) {
                return null;
            }
            EnumC5743 enumC57433 = EnumC5743.NEGOTIATE;
            InterfaceC2148 interfaceC2148 = f34068;
            if (enumC5743 == enumC57433) {
                interfaceC2148.mo7100(c2921.m8917(), "Initialized Authentication of {} using NTLM");
                this.f34075 = EnumC5743.AUTHENTICATE;
                return m28152(c2921);
            }
            interfaceC2148.mo7100(C1152.m3949(bArr), "Received token: {}");
            C21740 c21740 = new C21740();
            c21740.m49066(bArr);
            C14557 c14557 = new C14557();
            try {
                c14557.m34745(new C12441(c21740.m49067()));
                interfaceC2148.mo7095(c14557, "Received NTLM challenge: {}");
                interfaceC2148.mo7100(c14557.m34749(), "Received NTLM challenge from: {}");
                final EnumSet m34744 = c14557.m34744();
                EnumC20909 enumC20909 = EnumC20909.NTLMSSP_NEGOTIATE_128;
                Boolean valueOf = Boolean.valueOf(m34744.contains(enumC20909));
                EnumC20909 enumC209092 = EnumC20909.NTLMSSP_NEGOTIATE_56;
                interfaceC2148.mo7092("Server NTLM negotiate flags: {}, supports128Bit={}, supports56Bit={}", m34744, valueOf, Boolean.valueOf(m34744.contains(enumC209092)));
                C5378.removeIf(this.f34072, new Predicate() { // from class: l.۫֫ۘ
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
                        return !m34744.contains((EnumC20909) obj);
                    }
                });
                if (this.f34072.contains(enumC20909)) {
                    interfaceC2148.mo7100(m34744, "Using NTLM 128-bit session security, serverFlags={}");
                } else {
                    AbstractSet abstractSet = this.f34072;
                    if (!abstractSet.contains(enumC20909) && !abstractSet.contains(enumC209092)) {
                        interfaceC2148.mo7103(m34744, "Falling back to legacy NTLM session security (<56-bit), serverFlags={}");
                    }
                    interfaceC2148.mo7103(m34744, "Falling back to NTLM 56-bit session security, serverFlags={}");
                }
                C23415 m28151 = m28151(c2921, c6717, c14557, c21740.m49067());
                this.f34075 = enumC57432;
                return m28151;
            } catch (C13146 e) {
                throw new IOException(e);
            }
        } catch (C20329 e2) {
            throw new C10951(e2);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C23415 m28152(C2921 c2921) {
        C23415 c23415 = new C23415();
        this.f34072 = EnumSet.of(EnumC20909.NTLMSSP_NEGOTIATE_128, EnumC20909.NTLMSSP_NEGOTIATE_56, EnumC20909.NTLMSSP_REQUEST_TARGET, EnumC20909.NTLMSSP_NEGOTIATE_EXTENDED_SESSIONSECURITY);
        this.f34069.getClass();
        if (this.f34069.m46869() != null) {
            this.f34072.add(EnumC20909.NTLMSSP_NEGOTIATE_VERSION);
        }
        if (!c2921.m8919()) {
            this.f34072.add(EnumC20909.NTLMSSP_NEGOTIATE_SIGN);
            this.f34072.add(EnumC20909.NTLMSSP_NEGOTIATE_ALWAYS_SIGN);
            this.f34072.add(EnumC20909.NTLMSSP_NEGOTIATE_KEY_EXCH);
        } else if (c2921.m8918()) {
            this.f34072.add(EnumC20909.NTLMSSP_NEGOTIATE_KEY_EXCH);
        } else {
            this.f34072.add(EnumC20909.NTLMSSP_NEGOTIATE_ANONYMOUS);
        }
        if (!this.f34072.contains(EnumC20909.NTLMSSP_NEGOTIATE_VERSION)) {
            if (C3395.m10361(c2921.m8915())) {
                this.f34072.add(EnumC20909.NTLMSSP_NEGOTIATE_OEM_DOMAIN_SUPPLIED);
            }
            this.f34069.getClass();
        }
        AbstractSet abstractSet = this.f34072;
        String m8915 = c2921.m8915();
        this.f34069.getClass();
        C19498 m46869 = this.f34069.m46869();
        this.f34069.getClass();
        C6797 c6797 = new C6797(abstractSet, m8915, null, m46869, false);
        f34068.mo7095(this.f34074, "Sending NTLM negotiate message: {}");
        C15388 c15388 = new C15388();
        c15388.m36427(f34067);
        C12441 c12441 = new C12441();
        c6797.m18440(c12441);
        byte[] m26098 = c12441.m26098();
        this.f34074 = m26098;
        c15388.m36430(m26098);
        c23415.m51864(c15388);
        c23415.m51863(this.f34072);
        return c23415;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C23415 m28151(C2921 c2921, C6717 c6717, C14557 c14557, byte[] bArr) {
        C8914 m22982;
        byte[] bArr2;
        C23415 c23415 = new C23415();
        c23415.m51865(c14557.m34748());
        if (c14557.m34747() != null) {
            C8914 m34747 = c14557.m34747();
            EnumC3541 enumC3541 = EnumC3541.MsvAvNbComputerName;
            if (m34747.m22987(enumC3541)) {
            }
        }
        if (c2921.m8919() && !c6717.m18285().m47645().m49681()) {
            String m8917 = c2921.m8917();
            String m8915 = c2921.m8915();
            this.f34069.getClass();
            C17380 c17380 = new C17380(null, null, m8917, m8915, null, null, this.f34072, this.f34069.m46869());
            C21740 c21740 = new C21740();
            C12441 c12441 = new C12441();
            c17380.m40726(c12441);
            c21740.m49069(c12441.m26098());
            c23415.m51864(c21740);
            return c23415;
        }
        this.f34072.add(EnumC20909.NTLMSSP_NEGOTIATE_TARGET_INFO);
        if (c14557.m34747() == null) {
            m22982 = null;
        } else {
            m22982 = c14557.m34747().m22982();
            if (this.f34069.m46870() && c14557.m34747().m22987(EnumC3541.MsvAvTimestamp)) {
                EnumC3541 enumC35412 = EnumC3541.MsvAvFlags;
                m22982.m22985(new C23296(enumC35412, Long.valueOf(m22982.m22987(enumC35412) ? ((Long) m22982.m22983(enumC35412).m32435()).longValue() | 2 : 2L)));
            }
            if (c14557.m34744().contains(EnumC20909.NTLMSSP_REQUEST_TARGET)) {
                C7774 c7774 = (C7774) m22982.m22983(EnumC3541.MsvAvDnsComputerName);
                if (c7774 != null) {
                    m22982.m22985(new C7774(EnumC3541.MsvAvTargetName, String.format("cifs/%s", c7774.m32435())));
                }
            } else {
                m22982.m22985(new C7774(EnumC3541.MsvAvTargetName, ""));
            }
        }
        long m51132 = new C22984((TimeUnit.NANOSECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) / 100) + 116444736000000000L).m51132();
        if (m22982 != null) {
            EnumC3541 enumC35413 = EnumC3541.MsvAvTimestamp;
            if (m22982.m22987(enumC35413)) {
                m51132 = ((C22984) ((C1858) m22982.m22983(enumC35413)).m32435()).m51132();
            }
        }
        C11031 m42158 = this.f34070.m42158(c2921.m8917(), c2921.m8915(), c2921.m8916(), c14557, m51132, m22982);
        byte[] m27372 = m42158.m27372();
        byte[] m27371 = m42158.m27371();
        byte[] bArr3 = new byte[0];
        this.f34070.getClass();
        EnumSet m34744 = c14557.m34744();
        if (m34744.contains(EnumC20909.NTLMSSP_NEGOTIATE_KEY_EXCH) && (m34744.contains(EnumC20909.NTLMSSP_NEGOTIATE_SEAL) || m34744.contains(EnumC20909.NTLMSSP_NEGOTIATE_SIGN) || m34744.contains(EnumC20909.NTLMSSP_NEGOTIATE_ALWAYS_SIGN))) {
            byte[] bArr4 = new byte[16];
            this.f34073.nextBytes(bArr4);
            bArr2 = C16674.m39200(this.f34071, m27372, bArr4);
            m27372 = bArr4;
        } else {
            bArr2 = m27372;
        }
        String m89172 = c2921.m8917();
        String m89152 = c2921.m8915();
        this.f34069.getClass();
        C17380 c173802 = new C17380(bArr3, m27371, m89172, m89152, null, bArr2, m34744, this.f34069.m46869());
        C23296 c23296 = m22982 != null ? (C23296) m22982.m22983(EnumC3541.MsvAvFlags) : null;
        if (c23296 != null && (((Long) c23296.m32435()).longValue() & 2) > 0) {
            c173802.m40727(new byte[16]);
            C12441 c124412 = new C12441();
            c173802.m40726(c124412);
            c173802.m40727(C16674.m39201(this.f34071, m27372, this.f34074, bArr, c124412.m26098()));
        }
        c23415.m51866(m27372);
        f34068.mo7095(c173802, "Sending NTLM authenticate message: {}");
        C21740 c217402 = new C21740();
        C12441 c124413 = new C12441();
        c173802.m40726(c124413);
        c217402.m49069(c124413.m26098());
        c23415.m51864(c217402);
        c23415.m51863(this.f34072);
        return c23415;
    }

    @Override // l.InterfaceC12798
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28154(C4332 c4332) {
        this.f34071 = c4332.m13038();
        this.f34073 = c4332.m13034();
        this.f34069 = c4332.m13032();
        this.f34075 = EnumC5743.NEGOTIATE;
        this.f34072 = new HashSet();
        this.f34070 = new C18086(this.f34073, this.f34071);
    }

    @Override // l.InterfaceC12798
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo28155(C2921 c2921) {
        return c2921.getClass().equals(C2921.class);
    }
}
