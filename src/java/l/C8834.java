package l;

import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* compiled from: V9I0 */
/* renamed from: l.ۡۧۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C8834 extends C16614 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16614 f26906;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final SecretKey f26907;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15888 f26908;

    public C8834(C15888 c15888, C16614 c16614, SecretKey secretKey) {
        this.f26908 = c15888;
        this.f26906 = c16614;
        this.f26907 = secretKey;
    }

    @Override // l.C16614, l.InterfaceC0446
    /* renamed from: ܽ */
    public final void mo2003(C0097 c0097) {
        InterfaceC2148 interfaceC2148;
        C2215 c2215;
        EnumC0386 enumC0386;
        C16614 c16614 = this.f26906;
        C0097 c00972 = new C0097(c16614.mo3029());
        c16614.mo2003(c00972);
        byte[] m26081 = c00972.m26081();
        int m26091 = c00972.m26091();
        C15888 c15888 = this.f26908;
        byte[] m37664 = c15888.m37664();
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, m37664, 0, m37664.length);
        C8854 c8854 = new C8854(((C23670) c16614.mo3028()).m52203(), m26091, m37664);
        byte[] m37658 = C15888.m37658(c8854);
        try {
            c2215 = c15888.f49103;
            enumC0386 = c15888.f49101;
            String m1879 = enumC0386.m1879();
            c2215.getClass();
            InterfaceC3791 m9432 = C3085.m9432(m1879);
            m9432.mo11448(EnumC18608.ENCRYPT, this.f26907.getEncoded(), gCMParameterSpec);
            m9432.mo11449(m37658);
            byte[] mo11450 = m9432.mo11450(m26091, m26081);
            if (mo11450.length != m26091 + 16) {
                throw new IllegalStateException("Invalid length for cipherText after encryption.");
            }
            byte[] m22873 = c8854.m22873();
            System.arraycopy(mo11450, m26091, m22873, 0, m22873.length);
            c8854.m22874(c0097);
            c0097.m26077(m26091, mo11450);
        } catch (C8024 e) {
            interfaceC2148 = C15888.f49100;
            interfaceC2148.mo7079(c16614.mo3028(), "Security exception while encrypting packet << {} >>");
            throw new C10951(e);
        }
    }

    @Override // l.AbstractC0803
    /* renamed from: ۧ */
    public final InterfaceC5037 mo3028() {
        return (C23670) this.f26906.mo3028();
    }

    @Override // l.C16614
    /* renamed from: ܿ */
    public final int mo7975() {
        return this.f26906.mo7975();
    }

    @Override // l.AbstractC0803
    /* renamed from: ܽ */
    public final int mo3029() {
        return this.f26906.mo3029() + 52;
    }

    @Override // l.C16614
    public final String toString() {
        return "Encrypted[" + this.f26906.toString() + "]";
    }

    @Override // l.C16614
    /* renamed from: ܳ */
    public final C16614 mo7973() {
        return this.f26906.mo7973();
    }
}
