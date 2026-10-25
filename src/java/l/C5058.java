package l;

import com.umeng.analytics.pro.cb;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* compiled from: 37XE */
/* renamed from: l.ۚۖۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5058 implements InterfaceC1737 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f15905;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f15906;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f15907;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public SecretKeyFactory f15908;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final byte[] f15902 = {42, -122, 72, -122, -9, cb.k, 2, 7};

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f15901 = {42, -122, 72, -122, -9, cb.k, 2, 8};

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final byte[] f15904 = {42, -122, 72, -122, -9, cb.k, 2, 9};

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final byte[] f15898 = {42, -122, 72, -122, -9, cb.k, 2, 10};

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final byte[] f15903 = {42, -122, 72, -122, -9, cb.k, 2, 11};

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final byte[] f15900 = {42, -122, 72, -122, -9, cb.k, 2, 12};

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final byte[] f15899 = {42, -122, 72, -122, -9, cb.k, 2, cb.k};

    @Override // l.InterfaceC1737
    /* renamed from: ֫ */
    public final void mo5811(byte[] bArr) {
        throw new C12651("initWithOpenSSHv1KDFOptions() not supported");
    }

    @Override // l.InterfaceC1737
    /* renamed from: ֫ */
    public final void mo5810(HashMap hashMap) {
        throw new C12651("initWithPPKv3Header() not supported");
    }

    @Override // l.InterfaceC1737
    /* renamed from: ۧ */
    public final void mo5813(byte[] bArr) {
        C5244 c5244;
        try {
            C5244 c52442 = new C5244(bArr);
            if (!c52442.m15141()) {
                throw new C1010();
            }
            C5244[] m15136 = c52442.m15136();
            if (m15136.length < 2 || m15136.length > 4) {
                throw new C1010();
            }
            if (!m15136[0].m15135()) {
                throw new C1010();
            }
            boolean z = true;
            if (!m15136[1].m15137()) {
                throw new C1010();
            }
            byte[] bArr2 = null;
            if (m15136.length != 4) {
                if (m15136.length == 3) {
                    if (m15136[2].m15141()) {
                        c5244 = m15136[2];
                    } else if (!m15136[2].m15137()) {
                        throw new C1010();
                    }
                }
                c5244 = null;
            } else {
                if (!m15136[2].m15137()) {
                    throw new C1010();
                }
                if (!m15136[3].m15141()) {
                    throw new C1010();
                }
                c5244 = m15136[3];
            }
            this.f15907 = m15136[0].m15134();
            this.f15905 = C5244.m15131(m15136[1].m15134());
            if (c5244 != null) {
                C5244[] m151362 = c5244.m15136();
                if (m151362.length != 2) {
                    throw new C1010();
                }
                if (!m151362[0].m15142()) {
                    throw new C1010();
                }
                if (m151362[1].m15140() != 5) {
                    z = false;
                }
                if (!z) {
                    throw new C1010();
                }
                bArr2 = m151362[0].m15134();
            }
            String m14585 = m14585(bArr2);
            this.f15906 = m14585;
            this.f15908 = SecretKeyFactory.getInstance(m14585);
        } catch (Exception e) {
            if (e instanceof C12651) {
                throw ((C12651) e);
            }
            if (e instanceof NoSuchAlgorithmException) {
                throw new C12651("unsupported pbkdf2 algorithm: ".concat(this.f15906), e);
            }
            if (!(e instanceof C1010) && !(e instanceof ArithmeticException)) {
                throw new C12651("pbkdf2 unavailable", e);
            }
            throw new C12651("invalid ASN1", e);
        }
    }

    @Override // l.InterfaceC1737
    /* renamed from: ֫ */
    public final byte[] mo5812(int i, byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            cArr[i2] = (char) (bArr[i2] & 255);
        }
        try {
            return this.f15908.generateSecret(new PBEKeySpec(cArr, this.f15907, this.f15905, i * 8)).getEncoded();
        } catch (InvalidKeySpecException unused) {
            return null;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m14585(byte[] bArr) {
        String str;
        if (bArr == null || Arrays.equals(bArr, f15902)) {
            str = "PBKDF2WithHmacSHA1";
        } else if (Arrays.equals(bArr, f15901)) {
            str = "PBKDF2WithHmacSHA224";
        } else if (Arrays.equals(bArr, f15904)) {
            str = "PBKDF2WithHmacSHA256";
        } else if (Arrays.equals(bArr, f15898)) {
            str = "PBKDF2WithHmacSHA384";
        } else if (Arrays.equals(bArr, f15903)) {
            str = "PBKDF2WithHmacSHA512";
        } else if (Arrays.equals(bArr, f15900)) {
            str = "PBKDF2WithHmacSHA512/224";
        } else {
            str = Arrays.equals(bArr, f15899) ? "PBKDF2WithHmacSHA512/256" : null;
        }
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder("unsupported pbkdf2 function oid: ");
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        while (i < bArr.length) {
            String hexString = Integer.toHexString(bArr[i] & 255);
            StringBuilder sb3 = new StringBuilder("0x");
            sb3.append(hexString.length() == 1 ? "0" : "");
            sb3.append(hexString);
            sb2.append(sb3.toString());
            i++;
            if (i < bArr.length) {
                sb2.append(":");
            }
        }
        sb.append(sb2.toString());
        throw new C12651(sb.toString());
    }
}
