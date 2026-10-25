package l;

import com.alipay.sdk.m.p.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.HashMap;
import javax.crypto.EncryptedPrivateKeyInfo;

/* compiled from: A1W4 */
/* renamed from: l.۬ܿᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC13262 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f39715 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f39716;

    /* renamed from: ֡ */
    public void mo14000() {
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo32190() {
    }

    /* renamed from: ۘ */
    public abstract String mo10324();

    /* renamed from: ۜ */
    public abstract byte[] mo10325();

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean mo32195() {
        return this instanceof C22435;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public void mo32196() {
    }

    /* renamed from: ᩷ */
    public abstract byte[] mo10326();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32192(String str) {
        this.f39716 = str;
        f39715.put(mo10324(), str);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m32191() {
        return this.f39716;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final X509Certificate m32197() {
        return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(mo10325()));
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final PrivateKey m32193() {
        byte[] mo10326 = mo10326();
        try {
            return KeyFactory.getInstance(new EncryptedPrivateKeyInfo(mo10326).getAlgName()).generatePrivate(new PKCS8EncodedKeySpec(mo10326));
        } catch (IOException unused) {
            PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(mo10326);
            try {
                try {
                    return KeyFactory.getInstance(d.a).generatePrivate(pKCS8EncodedKeySpec);
                } catch (InvalidKeySpecException unused2) {
                    return KeyFactory.getInstance("EC").generatePrivate(pKCS8EncodedKeySpec);
                }
            } catch (InvalidKeySpecException unused3) {
                return KeyFactory.getInstance("DSA").generatePrivate(pKCS8EncodedKeySpec);
            }
        }
    }

    public final String toString() {
        return mo10324();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m32194() {
        C15378 c15378;
        C10130 c10130 = new C10130();
        c15378 = C8324.f25539;
        if (this != c15378) {
            c10130.writeByte(0);
            c10130.m25439(mo10324());
            c10130.m25434(mo10325());
            c10130.m25434(mo10326());
        } else {
            c10130.m25425(true);
        }
        return c10130.m25444();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC13262 m32189(byte[] bArr) {
        C15378 c15378;
        C12951 c12951 = new C12951(bArr);
        if (c12951.m31498()) {
            c15378 = C8324.f25539;
            return c15378;
        }
        return new C3385(c12951.m31496(), c12951.m31506(), c12951.m31496());
    }

    /* renamed from: ۖ */
    public String mo14002() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ۢ */
    public String mo14004() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ܳ */
    public String mo14006() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ֫ */
    public String mo14001(String str) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ۧ */
    public void mo14005() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ܿ */
    public String mo14007() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ᩳ */
    public byte[] mo14008() {
        throw new UnsupportedOperationException();
    }
}
