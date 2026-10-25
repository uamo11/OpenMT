package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: R9K1 */
/* renamed from: l.ܶۧۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15182 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4332 f46388;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23650 f46389;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C22239 f46390;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6717 f46391;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8128 f46392;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C22239 f46393;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final byte[] f46378 = C3395.m10360("SMBC2SCipherKey");

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final byte[] f46381 = C3395.m10360("SMBS2CCipherKey");

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final byte[] f46383 = C3395.m10360("SMB2AESCCM");

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final byte[] f46377 = C3395.m10360("ServerIn ");

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final byte[] f46382 = C3395.m10360("ServerOut");

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final byte[] f46384 = C3395.m10360("SmbSign");

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final byte[] f46385 = C3395.m10360("SMB2AESCMAC");

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final byte[] f46376 = C3395.m10360("SMBSigningKey");

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final byte[] f46387 = C3395.m10360("SmbRpc");

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final byte[] f46380 = C3395.m10360("SMB2APP");

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final byte[] f46386 = C3395.m10360("SMBAppKey");

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f46379 = C11321.m27961(C15182.class);

    public C15182(C23650 c23650, C4332 c4332, InterfaceC8128 interfaceC8128) {
        this.f46389 = c23650;
        this.f46388 = c4332;
        this.f46391 = c23650.m52167();
        this.f46390 = c23650.m52165();
        this.f46393 = c23650.m52159();
        this.f46392 = interfaceC8128;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15346 m35909(C2921 c2921) {
        try {
            InterfaceC12798 m35907 = m35907(c2921);
            boolean z = m35907 instanceof C11388;
            C4332 c4332 = this.f46388;
            if (z && c4332.m13032().m46870() && (!c2921.m8919() || c2921.m8918())) {
                m35907 = new C22676((C11388) m35907);
            }
            C1072 c1072 = new C1072();
            c1072.f3926 = m35907;
            c1072.f3924 = c2921;
            m35907.mo28154(c4332);
            m35906(c1072, this.f46391.m18288());
            C15346 m35908 = m35908(c1072);
            f46379.mo7085(c2921.m8917(), this.f46389.m52160(), Long.valueOf(m35908.m36383()));
            this.f46390.m49949(Long.valueOf(m35908.m36383()), m35908);
            return m35908;
        } catch (IOException | C20329 e) {
            throw new C10951(e);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C15346 m35908(C1072 c1072) {
        byte[] bArr;
        long j;
        C24002 c24002;
        C2921 c2921;
        InterfaceC12798 interfaceC12798;
        long j2;
        byte[] bArr2;
        C24002 c240022;
        C24002 c240023;
        C24002 c240024;
        C24002 c240025;
        byte[] bArr3;
        C2921 c29212;
        InterfaceC12798 interfaceC127982;
        long j3;
        C24002 c240026;
        C24002 c240027;
        long j4;
        bArr = c1072.f3927;
        C6717 c6717 = this.f46391;
        C24002 c240028 = new C24002(c6717.m18285().m47645(), EnumSet.of(c6717.m18283() ? EnumC17652.SMB2_NEGOTIATE_SIGNING_REQUIRED : EnumC17652.SMB2_NEGOTIATE_SIGNING_ENABLED), c6717.m18287());
        c240028.m52838(bArr);
        C23670 c23670 = (C23670) c240028.mo3028();
        j = c1072.f3931;
        c23670.m52212(j);
        c1072.f3930 = c240028;
        C23650 c23650 = this.f46389;
        c1072.f3929 = (C24002) c23650.m52155(c240028);
        c24002 = c1072.f3929;
        c1072.f3931 = ((C23670) c24002.mo3028()).m52203();
        EnumC22094 m47645 = c6717.m18285().m47645();
        long m52202 = ((C23670) c24002.mo3028()).m52202();
        long value = EnumC7462.STATUS_MORE_PROCESSING_REQUIRED.getValue();
        C22239 c22239 = this.f46393;
        if (m52202 == value) {
            if (m47645 == EnumC22094.SMB_3_1_1) {
                j3 = c1072.f3931;
                C15346 m49948 = c22239.m49948(Long.valueOf(j3));
                if (m49948 == null) {
                    m49948 = m35904(c1072);
                    j4 = c1072.f3931;
                    c22239.m49949(Long.valueOf(j4), m49948);
                }
                C21698 m36382 = m49948.m36382();
                c240026 = c1072.f3930;
                m35905(c1072, m36382, c240026);
                C21698 m363822 = m49948.m36382();
                c240027 = c1072.f3929;
                m35905(c1072, m363822, c240027);
            }
            c29212 = c1072.f3924;
            String m8917 = c29212.m8917();
            interfaceC127982 = c1072.f3926;
            f46379.mo7082("More processing required for authentication of {} using {}", m8917, interfaceC127982);
            m35906(c1072, c24002.m52839());
            return m35908(c1072);
        }
        if (((C23670) c24002.mo3028()).m52202() != EnumC7462.STATUS_SUCCESS.getValue()) {
            C23670 c236702 = (C23670) c24002.mo3028();
            c2921 = c1072.f3924;
            String m89172 = c2921.m8917();
            interfaceC12798 = c1072.f3926;
            throw new C1092(c236702, String.format("Authentication failed for '%s' using %s", m89172, interfaceC12798));
        }
        j2 = c1072.f3931;
        C15346 m499482 = c22239.m49948(Long.valueOf(j2));
        EnumC22094 enumC22094 = EnumC22094.SMB_3_1_1;
        if (m47645 == enumC22094 && m499482 != null) {
            c22239.m49950(Long.valueOf(m499482.m36383()));
        } else {
            m499482 = m35904(c1072);
        }
        C21698 m363823 = m499482.m36382();
        m35906(c1072, c24002.m52839());
        bArr2 = c1072.f3925;
        if (bArr2 != null) {
            bArr3 = c1072.f3925;
            m363823.m48983(new SecretKeySpec(bArr3, "HmacSHA256"));
        }
        if (m47645 == enumC22094) {
            c240025 = c1072.f3930;
            m35905(c1072, m363823, c240025);
        }
        C4332 c4332 = this.f46388;
        c4332.getClass();
        m363823.m48977(c23650.m52167().m18283());
        c240022 = c1072.f3929;
        EnumSet m52840 = c240022.m52840();
        EnumC14829 enumC14829 = EnumC14829.SMB2_SESSION_FLAG_IS_NULL;
        if (m52840.contains(enumC14829)) {
            m363823.m48977(false);
        }
        c240023 = c1072.f3929;
        EnumSet m528402 = c240023.m52840();
        EnumC14829 enumC148292 = EnumC14829.SMB2_SESSION_FLAG_IS_GUEST;
        boolean contains = m528402.contains(enumC148292);
        if (contains && m363823.m48988()) {
            if (contains && c4332.m13020() && !c4332.m13025()) {
                m363823.m48977(false);
            } else {
                throw new C1236("Cannot require message signing when authenticating with a guest account");
            }
        } else if (contains) {
            m363823.m48977(false);
        }
        if (c23650.m52161().m47645().m49681() && c23650.m52167().m18282()) {
            c240024 = c1072.f3929;
            if (c240024.m52840().contains(EnumC14829.SMB2_SESSION_FLAG_ENCRYPT_DATA)) {
                m363823.m48979();
                m363823.m48977(false);
            }
        }
        if (m47645.m49681() && !c24002.m52840().contains(enumC14829) && !c24002.m52840().contains(enumC148292)) {
            if (m47645 == enumC22094) {
                m363823.m48987(m35903(this.f46388, m363823.m48986(), f46376, m363823.m48984(), "AesCmac", 16));
            } else {
                m363823.m48987(m35903(this.f46388, m363823.m48986(), f46385, f46384, "AesCmac", 16));
            }
            if (c6717.m18282()) {
                String m1879 = c6717.m18284().m1879();
                int m1880 = c6717.m18284().m1880();
                if (m47645 == enumC22094) {
                    m363823.m48981(m35903(this.f46388, m363823.m48986(), f46378, m363823.m48984(), m1879, m1880));
                    m363823.m48976(m35903(this.f46388, m363823.m48986(), f46381, m363823.m48984(), m1879, m1880));
                    m35903(this.f46388, m363823.m48986(), f46386, m363823.m48984(), m1879, 16);
                    return m499482;
                }
                SecretKeySpec m48986 = m363823.m48986();
                byte[] bArr4 = f46377;
                C4332 c43322 = this.f46388;
                byte[] bArr5 = f46383;
                m363823.m48981(m35903(c43322, m48986, bArr5, bArr4, m1879, m1880));
                m363823.m48976(m35903(this.f46388, m363823.m48986(), bArr5, f46382, m1879, m1880));
                m35903(this.f46388, m363823.m48986(), f46380, f46387, m1879, 16);
            }
        }
        return m499482;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C15346 m35904(C1072 c1072) {
        C2921 c2921;
        C4332 c4332;
        C17464 c17464;
        InterfaceC4059 interfaceC4059;
        InterfaceC20123 interfaceC20123;
        C15888 c15888;
        long j;
        c2921 = c1072.f3924;
        C18006 c18006 = (C18006) this.f46392;
        c18006.getClass();
        C23650 c23650 = c18006.f56158;
        c4332 = c23650.f76610;
        c17464 = c23650.f76621;
        interfaceC4059 = c23650.f76615;
        interfaceC20123 = c23650.f76614;
        c15888 = c23650.f76617;
        C15346 c15346 = new C15346(c23650, c4332, c2921, c17464, interfaceC4059, interfaceC20123, c15888);
        j = c1072.f3931;
        c15346.m36380(j);
        c15346.m36382().m48978(this.f46391.m18281());
        return c15346;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35906(C1072 c1072, byte[] bArr) {
        InterfaceC12798 interfaceC12798;
        C2921 c2921;
        interfaceC12798 = c1072.f3926;
        c2921 = c1072.f3924;
        C6717 c6717 = this.f46391;
        C23415 mo28153 = interfaceC12798.mo28153(c2921, bArr, c6717);
        if (mo28153 == null) {
            return;
        }
        c6717.getClass();
        c1072.f3925 = mo28153.m51873();
        AbstractC4806 m51862 = mo28153.m51862();
        C12441 c12441 = new C12441();
        try {
            m51862.mo14016(c12441);
            c1072.f3927 = c12441.m26098();
        } catch (C20329 e) {
            throw new IOException(e);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private InterfaceC12798 m35907(C2921 c2921) {
        ArrayList arrayList = new ArrayList(this.f46388.m13028());
        ArrayList arrayList2 = new ArrayList();
        C6717 c6717 = this.f46391;
        if (c6717.m18288().length > 0) {
            C8334 c8334 = new C8334();
            c8334.m36428(c6717.m18288());
            arrayList2 = c8334.m36426();
        }
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            InterfaceC22319 interfaceC22319 = (InterfaceC22319) it.next();
            if (arrayList2.isEmpty() || arrayList2.contains(new C21574(interfaceC22319.getName()))) {
                InterfaceC12798 interfaceC12798 = (InterfaceC12798) interfaceC22319.create();
                if (interfaceC12798.mo28155(c2921)) {
                    return interfaceC12798;
                }
            }
        }
        throw new C10951("Could not find a configured authenticator for mechtypes: " + arrayList2 + " and authentication context: " + c2921);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35905(C1072 c1072, C21698 c21698, C24002 c24002) {
        InterfaceC0968 interfaceC0968;
        InterfaceC0968 interfaceC09682;
        interfaceC0968 = c1072.f3928;
        if (interfaceC0968 == null) {
            String m15263 = this.f46389.m52167().m18291().m15263();
            try {
                this.f46388.m13038().getClass();
                c1072.f3928 = C2215.m7389(m15263);
            } catch (C8024 e) {
                throw new C10951(C20094.m46315("Cannot get the message digest for ", m15263), e);
            }
        }
        interfaceC09682 = c1072.f3928;
        byte[] m48984 = c21698.m48984();
        byte[] m44214 = C19149.m44214(c24002);
        C15619 c15619 = (C15619) interfaceC09682;
        c15619.m36820();
        c15619.m36816(m48984);
        c15619.m36816(m44214);
        c21698.m48978(c15619.m36818());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SecretKeySpec m35903(C4332 c4332, SecretKeySpec secretKeySpec, byte[] bArr, byte[] bArr2, String str, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(25);
        int i2 = i * 8;
        try {
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(bArr2);
            byteArrayOutputStream.write(new byte[]{0, 0, (byte) (i2 >> 8), (byte) i2});
            try {
                c4332.m13038().getClass();
                InterfaceC0262 m38473 = C16325.m38473();
                m38473.mo1528(new C3626(secretKeySpec.getEncoded(), byteArrayOutputStream.toByteArray()));
                byte[] bArr3 = new byte[i];
                m38473.mo1527(i, bArr3);
                return new SecretKeySpec(bArr3, str);
            } catch (C8024 e) {
                throw new C10951(e);
            }
        } catch (IOException e2) {
            f46379.mo7091("Unable to format suffix, error occur : ", (Throwable) e2);
            return null;
        }
    }
}
