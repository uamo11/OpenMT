package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: V9EH */
/* renamed from: l.ۚۧۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5306 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f16552 = C11321.m27961(C5306.class);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4332 f16553;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C23650 f16554;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6717 f16555;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C0366 f16556 = new C0366();

    public C5306(C23650 c23650, C4332 c4332, C6717 c6717) {
        this.f16554 = c23650;
        this.f16553 = c4332;
        this.f16555 = c6717;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15225() {
        C22964 m15224;
        C22964 c22964;
        C22964 c229642;
        C22964 c229643;
        C22964 c229644;
        AbstractC0803 abstractC0803;
        C22964 c229645;
        EnumC5326 enumC5326;
        C4332 c4332 = this.f16553;
        EnumSet m13027 = c4332.m13027();
        InterfaceC2148 interfaceC2148 = f16552;
        interfaceC2148.mo7100(m13027, "Negotiating dialects {}");
        boolean m13021 = c4332.m13021();
        C23650 c23650 = this.f16554;
        C0366 c0366 = this.f16556;
        if (m13021) {
            C19273 c19273 = new C19273(c4332.m13027());
            long j = c23650.f76618.m48694(1)[0];
            if (j != 0) {
                throw new IllegalStateException("The SMBv1 SMB_COM_NEGOTIATE packet needs to be the first packet sent.");
            }
            C18712 c18712 = new C18712(c19273, j, UUID.randomUUID(), false);
            c23650.f76613.m24413(c18712);
            c0366.f1779 = c19273;
            c23650.f76619.m4341(c19273);
            C10847 m43334 = c18712.m43334((InterfaceC1674) null);
            long m13023 = c4332.m13023();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            InterfaceC16490 interfaceC16490 = C2380.f7586;
            C16614 c16614 = (C16614) C17902.m41878(m13023, m43334);
            if (!(c16614 instanceof C22964)) {
                throw new IllegalStateException("Expected a SMB2 NEGOTIATE Response to our SMB_COM_NEGOTIATE, but got: " + c16614);
            }
            m15224 = (C22964) c16614;
            if (m15224.m51105() == EnumC22094.SMB_2XX) {
                m15224 = m15224();
            }
        } else {
            m15224 = m15224();
        }
        c0366.f1781 = m15224;
        if (!EnumC7462.m19987(((C23670) m15224.mo3028()).m52202())) {
            throw new C1092((C23670) m15224.mo3028(), "Failure during dialect negotiation");
        }
        c22964 = c0366.f1781;
        EnumC22094 m51105 = c22964.m51105();
        if (m51105 == EnumC22094.SMB_3_1_1) {
            c229644 = c0366.f1781;
            List<AbstractC1424> m51097 = c229644.m51097();
            if (m51097 == null) {
                throw new IllegalStateException("negotiate context list is null for SMB 3.1.1 dialect");
            }
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (AbstractC1424 abstractC1424 : m51097) {
                int i = C19418.f62814[abstractC1424.m4922().ordinal()];
                if (i == 1) {
                    if (z) {
                        throw new IllegalStateException("SMB2_PREAUTH_INTEGRITY_CAPABILITIES should only appear once in the NegotiateContextList");
                    }
                    C21886 c21886 = (C21886) abstractC1424;
                    if (c21886.m49271().size() != 1) {
                        throw new IllegalStateException("The SMB2PreauthIntegrityCapabilities NegotiateContext does not contain exactly 1 hash algorithm");
                    }
                    c0366.f1780 = (EnumC5326) c21886.m49271().get(0);
                    abstractC0803 = c0366.f1779;
                    byte[] m44214 = C19149.m44214(abstractC0803);
                    c229645 = c0366.f1781;
                    byte[] m442142 = C19149.m44214(c229645);
                    enumC5326 = c0366.f1780;
                    String m15263 = enumC5326.m15263();
                    try {
                        c4332.m13038().getClass();
                        C15619 m7389 = C2215.m7389(m15263);
                        byte[] bArr = new byte[m7389.m36819()];
                        m7389.m36820();
                        m7389.m36816(bArr);
                        m7389.m36816(m44214);
                        byte[] m36818 = m7389.m36818();
                        m7389.m36820();
                        m7389.m36816(m36818);
                        m7389.m36816(m442142);
                        c0366.f1778 = m7389.m36818();
                        z = true;
                    } catch (C8024 e) {
                        throw new C10951(C20094.m46315("Cannot get the message digest for ", m15263), e);
                    }
                } else if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("unknown negotiate context type");
                    }
                    if (z3) {
                        throw new IllegalStateException("SMB2_COMPRESSION_CAPABILITIES should only appear once in the NegotiateContextList");
                    }
                    ArrayList m45460 = ((C19770) abstractC1424).m45460();
                    if (m45460.size() == 0) {
                        throw new IllegalStateException("The SMB2CompressionCapabilities NegotiateContext should contain at least 1 algorithm");
                    }
                    if (m45460.size() == 1 && m45460.get(0) == EnumC3915.NONE) {
                        interfaceC2148.mo7096("SMB3CompressionAlgorithm is 'NONE', continuing without compression");
                    } else {
                        c0366.f1777 = EnumSet.copyOf((Collection) m45460);
                    }
                    z3 = true;
                } else {
                    if (z2) {
                        throw new IllegalStateException("SMB2_ENCRYPTION_CAPABILITIES should only appear once in the NegotiateContextList");
                    }
                    List m2822 = ((C0718) abstractC1424).m2822();
                    if (m2822.size() != 1) {
                        throw new IllegalStateException("The SMB2EncryptionCapabilities NegotiateContext does not contain exactly 1 cipher");
                    }
                    c0366.f1776 = (EnumC0386) m2822.get(0);
                    z2 = true;
                }
            }
        } else if (m51105.m49681()) {
            c229642 = c0366.f1781;
            if (c229642.m51099().contains(EnumC5866.SMB2_GLOBAL_CAP_ENCRYPTION)) {
                c0366.f1776 = EnumC0386.AES_128_CCM;
            }
        }
        C6717 c6717 = this.f16555;
        C0530 m18290 = c6717.m18290();
        c229643 = c0366.f1781;
        m18290.m2250(c229643.m51103(), c229643.m51105(), c229643.m51098(), c229643.m51099());
        C0530 m15568 = c23650.f76612.m15568(m18290.m2254());
        if (m15568 == null) {
            c23650.f76612.m15569(m18290);
            c0366.f1782 = m18290;
        } else {
            if (!m18290.m2251(m15568)) {
                throw new C2380(C4860.m14172("Different server found for same hostname '", m18290.m2254(), "', disconnecting..."));
            }
            c0366.f1782 = m15568;
        }
        c6717.m18279(c0366);
        interfaceC2148.mo7100(c6717, "Negotiated the following connection settings: {}");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C22964 m15224() {
        byte[] bArr = new byte[32];
        C4332 c4332 = this.f16553;
        c4332.m13034().nextBytes(bArr);
        C11676 c11676 = new C11676(c4332.m13027(), this.f16555.m18289(), false, c4332.m13022(), bArr);
        this.f16556.f1779 = c11676;
        return (C22964) this.f16554.m52155(c11676);
    }
}
