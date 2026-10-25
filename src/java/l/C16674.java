package l;

import java.nio.charset.Charset;

/* compiled from: J9EH */
/* renamed from: l.ܽܰۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16674 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Charset f51186 = C8208.f25225;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m39201(C2215 c2215, byte[] bArr, byte[]... bArr2) {
        try {
            c2215.getClass();
            InterfaceC5202 m7390 = C2215.m7390("HMACT64");
            m7390.init(bArr);
            for (byte[] bArr3 : bArr2) {
                m7390.update(bArr3);
            }
            return m7390.mo14975();
        } catch (C8024 e) {
            throw new C4952(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m39202(C2215 c2215, byte[]... bArr) {
        try {
            c2215.getClass();
            C15619 m7389 = C2215.m7389("MD5");
            for (byte[] bArr2 : bArr) {
                m7389.m36816(bArr2);
            }
            return m7389.m36818();
        } catch (C8024 e) {
            throw new C4952(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m39200(C2215 c2215, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr2.length];
        try {
            c2215.getClass();
            InterfaceC19314 m32835 = C13667.m32835();
            m32835.mo28433(EnumC18608.ENCRYPT, bArr);
            m32835.doFinal(bArr3, m32835.mo28432(bArr2.length, bArr2, bArr3));
            return bArr3;
        } catch (C8024 e) {
            throw new C4952(e);
        }
    }
}
