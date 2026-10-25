package l;

import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* compiled from: V9I0 */
/* renamed from: l.ܺۧۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15888 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f49100 = C11321.m27961(C15888.class);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC0386 f49101;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC22094 f49102;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2215 f49103;

    public C15888(C2215 c2215) {
        this.f49103 = c2215;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37662(C6717 c6717) {
        this.f49102 = c6717.m18285().m47645();
        if (c6717.m18285().m47645().equals(EnumC22094.SMB_3_1_1)) {
            this.f49101 = c6717.m18284();
        } else {
            this.f49101 = EnumC0386.AES_128_CCM;
        }
        f49100.mo7087(this.f49101, "Initialized PacketEncryptor with Cipher << {} >>");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m37663(C18732 c18732) {
        return this.f49102.m49681() && c18732.m21060().m26092() != 0 && ((C8854) c18732.m21061()).m22876() == 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m37665(C18732 c18732, SecretKey secretKey) {
        InterfaceC2148 interfaceC2148 = f49100;
        try {
            C0097 m21060 = c18732.m21060();
            int m37655 = m37655(c18732, m21060);
            byte[] m37658 = m37658((C8854) c18732.m21061());
            byte[] m22873 = ((C8854) c18732.m21061()).m22873();
            C2215 c2215 = this.f49103;
            String m1879 = this.f49101.m1879();
            c2215.getClass();
            InterfaceC3791 m9432 = C3085.m9432(m1879);
            m9432.mo11448(EnumC18608.DECRYPT, secretKey.getEncoded(), new GCMParameterSpec(128, ((C8854) c18732.m21061()).m22878(), 0, this.f49101.m1881()));
            m9432.mo11449(m37658);
            byte[] update = m9432.update(m21060.m26081(), m21060.m26083(), m37655);
            byte[] mo11450 = m9432.mo11450(m22873.length, m22873);
            int length = update.length;
            int length2 = mo11450.length;
            if (length == 0) {
                return mo11450;
            }
            if (length2 == 0) {
                return update;
            }
            byte[] bArr = new byte[length + length2];
            System.arraycopy(update, 0, bArr, 0, length);
            System.arraycopy(mo11450, 0, bArr, length, length2);
            return bArr;
        } catch (C8024 e) {
            interfaceC2148.mo7079(c18732, "Security exception while decrypting packet << {} >>");
            throw new C10951(e);
        } catch (C13146 e2) {
            interfaceC2148.mo7079(c18732, "Could not read cipherText from packet << {} >>");
            throw new C10951("Could not read cipherText from packet", e2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16614 m37661(C16614 c16614, SecretKey secretKey) {
        if (secretKey != null) {
            return new C8834(this, c16614, secretKey);
        }
        f49100.mo7100(((C23670) c16614.mo3028()).m52217(), "Not wrapping {} as encrypted, as no key is set.");
        return c16614;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m37658(C8854 c8854) {
        byte[] bArr = new byte[32];
        byte[] m22878 = c8854.m22878();
        System.arraycopy(m22878, 0, bArr, 0, Math.min(m22878.length, 16));
        int m22877 = c8854.m22877();
        bArr[16] = (byte) m22877;
        bArr[17] = (byte) (m22877 >>> 8);
        bArr[18] = (byte) (m22877 >>> 16);
        bArr[19] = (byte) (m22877 >>> 24);
        int m22875 = c8854.m22875();
        bArr[20] = (byte) m22875;
        bArr[21] = (byte) (m22875 >>> 8);
        int m22876 = c8854.m22876();
        bArr[22] = (byte) m22876;
        bArr[23] = (byte) (m22876 >>> 8);
        m37657(c8854.m22879(), 24, bArr);
        return bArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m37664() {
        long nanoTime = System.nanoTime();
        byte[] bArr = new byte[this.f49101.m1881()];
        m37657(nanoTime, 0, bArr);
        return bArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m37655(C18732 c18732, C0097 c0097) {
        int m22877 = ((C8854) c18732.m21061()).m22877();
        if (c0097.m26092() >= m22877) {
            return m22877;
        }
        throw new C13146("Underflow");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37657(long j, int i, byte[] bArr) {
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >>> 8);
        bArr[i + 2] = (byte) (j >>> 16);
        bArr[i + 3] = (byte) (j >>> 24);
        bArr[i + 4] = (byte) (j >>> 32);
        bArr[i + 5] = (byte) (j >>> 40);
        bArr[i + 6] = (byte) (j >>> 48);
        bArr[i + 7] = (byte) (j >>> 56);
    }
}
