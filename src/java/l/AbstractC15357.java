package l;

import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.function.Supplier;

/* compiled from: B1VV */
/* renamed from: l.ܶܽᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC15357 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final HashMap f47068;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f47069;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f47070;

    /* renamed from: ֫ */
    public abstract int mo4093();

    /* renamed from: ֫ */
    public abstract void mo4094(InterfaceC0562 interfaceC0562, InterfaceC0562 interfaceC05622, InterfaceC0562 interfaceC05623, InterfaceC17066 interfaceC17066);

    /* renamed from: ۧ */
    public abstract String mo4095();

    /* renamed from: ܽ */
    public abstract int mo4096();

    /* renamed from: ܿ */
    public abstract AlgorithmParameterSpec mo4097();

    /* renamed from: ᩳ */
    public abstract String mo4098();

    static {
        HashMap hashMap = new HashMap();
        f47068 = hashMap;
        hashMap.put(257, new C6892());
        hashMap.put(258, new C21004());
        hashMap.put(259, new C9715());
        hashMap.put(260, new C9009());
        hashMap.put(513, new C16063());
        hashMap.put(514, new C2659());
        hashMap.put(769, new C4070());
        hashMap.put(1057, new C18887());
        hashMap.put(1059, new C19593());
        hashMap.put(1061, new C0541());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC15357 m36398(int i) {
        Supplier supplier = (Supplier) f47068.get(Integer.valueOf(i));
        if (supplier != null) {
            return (AbstractC15357) supplier.get();
        }
        throw new RuntimeException(C13540.m32584(new StringBuilder("Unsupported signature algorithm id: 0x"), i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15357 m36396(int i) {
        Supplier supplier = (Supplier) f47068.get(Integer.valueOf(i));
        if (supplier == null) {
            return null;
        }
        return (AbstractC15357) supplier.get();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36397(MessageDigest messageDigest, InterfaceC0562 interfaceC0562, OutputStream outputStream, InterfaceC17066 interfaceC17066) {
        int size = (int) ((interfaceC0562.size() + 1048575) / 1048576);
        byte[] bArr = new byte[5];
        bArr[0] = -91;
        for (int i = 0; i < size; i++) {
            long mo2312 = interfaceC0562.mo2312();
            int min = (int) (Math.min(mo2312 + 1048576, interfaceC0562.size()) - mo2312);
            C22955.m51078(min, 1, bArr);
            messageDigest.update(bArr);
            interfaceC0562.mo2315(messageDigest, min);
            outputStream.write(messageDigest.digest());
            if (interfaceC17066.mo1526()) {
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m36395(long j) {
        return (int) ((j + 1048575) / 1048576);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36400(PublicKey publicKey, byte[] bArr, byte[] bArr2) {
        String mo4098 = mo4098();
        AlgorithmParameterSpec mo4097 = mo4097();
        try {
            Signature signature = Signature.getInstance(mo4098);
            signature.initVerify(publicKey);
            if (mo4097 != null) {
                signature.setParameter(mo4097);
            }
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (InvalidAlgorithmParameterException e) {
            e = e;
            throw new SignatureException(C4860.m14172("Failed to verify generated ", mo4098, " signature using public key from certificate"), e);
        } catch (InvalidKeyException e2) {
            throw new InvalidKeyException(C4860.m14172("Failed to verify generated ", mo4098, " signature using public key from certificate"), e2);
        } catch (SignatureException e3) {
            e = e3;
            throw new SignatureException(C4860.m14172("Failed to verify generated ", mo4098, " signature using public key from certificate"), e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36399(PrivateKey privateKey, PublicKey publicKey, byte[] bArr) {
        String mo4098 = mo4098();
        AlgorithmParameterSpec mo4097 = mo4097();
        try {
            Signature signature = Signature.getInstance(mo4098);
            signature.initSign(privateKey);
            if (mo4097 != null) {
                signature.setParameter(mo4097);
            }
            signature.update(bArr);
            byte[] sign = signature.sign();
            try {
                Signature signature2 = Signature.getInstance(mo4098);
                signature2.initVerify(publicKey);
                if (mo4097 != null) {
                    signature2.setParameter(mo4097);
                }
                signature2.update(bArr);
                if (signature2.verify(sign)) {
                    this.f47070 = sign;
                    return;
                }
                throw new SignatureException("Failed to verify generated " + mo4098 + " signature using public key from certificate");
            } catch (InvalidAlgorithmParameterException e) {
                e = e;
                throw new SignatureException(C4860.m14172("Failed to verify generated ", mo4098, " signature using public key from certificate"), e);
            } catch (InvalidKeyException e2) {
                throw new InvalidKeyException(C4860.m14172("Failed to verify generated ", mo4098, " signature using public key from certificate"), e2);
            } catch (SignatureException e3) {
                e = e3;
                throw new SignatureException(C4860.m14172("Failed to verify generated ", mo4098, " signature using public key from certificate"), e);
            }
        } catch (InvalidAlgorithmParameterException e4) {
            e = e4;
            throw new SignatureException(C20094.m46315("Failed to sign using ", mo4098), e);
        } catch (InvalidKeyException e5) {
            throw new InvalidKeyException(C20094.m46315("Failed to sign using ", mo4098), e5);
        } catch (SignatureException e6) {
            e = e6;
            throw new SignatureException(C20094.m46315("Failed to sign using ", mo4098), e);
        }
    }
}
