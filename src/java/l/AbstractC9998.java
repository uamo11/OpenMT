package l;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* compiled from: K7YO */
/* renamed from: l.ۤۖۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC9998 implements InterfaceC14415 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public KeyFactory f30123;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Signature f30124;

    /* renamed from: ֫ */
    public abstract String mo8965();

    @Override // l.InterfaceC17944
    public void init() {
        String str;
        String mo8965 = mo8965();
        if (mo8965.equals("ecdsa-sha2-nistp384")) {
            str = "SHA384withECDSA";
        } else {
            str = mo8965.equals("ecdsa-sha2-nistp521") ? "SHA512withECDSA" : "SHA256withECDSA";
        }
        this.f30124 = Signature.getInstance(str);
        this.f30123 = KeyFactory.getInstance("EC");
    }

    @Override // l.InterfaceC14415
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo25163(byte[] bArr, byte[] bArr2) {
        String str;
        byte[] m25160 = m25160(bArr);
        byte[] m251602 = m25160(bArr2);
        if (m25160.length >= 64) {
            str = "secp521r1";
        } else {
            str = m25160.length >= 48 ? "secp384r1" : "secp256r1";
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec(str));
        this.f30124.initVerify(this.f30123.generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, m25160), new BigInteger(1, m251602)), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class))));
    }

    @Override // l.InterfaceC14415
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo25162(byte[] bArr) {
        String str;
        byte[] m25160 = m25160(bArr);
        if (m25160.length >= 64) {
            str = "secp521r1";
        } else {
            str = m25160.length >= 48 ? "secp384r1" : "secp256r1";
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec(str));
        this.f30124.initSign(this.f30123.generatePrivate(new ECPrivateKeySpec(new BigInteger(1, m25160), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class))));
    }

    @Override // l.InterfaceC17944
    public byte[] sign() {
        byte[] sign = this.f30124.sign();
        if (sign[0] == '0') {
            int i = sign[1];
            int i2 = 3;
            if (i + 2 == sign.length || ((i & 128) != 0 && (sign[2] & 255) + 3 == sign.length)) {
                if ((i & 128) != 0 && (sign[2] & 255) + 3 == sign.length) {
                    i2 = 4;
                }
                int i3 = sign[i2];
                byte[] bArr = new byte[i3];
                int i4 = sign[i2 + 2 + i3];
                byte[] bArr2 = new byte[i4];
                System.arraycopy(sign, i2 + 1, bArr, 0, i3);
                System.arraycopy(sign, i2 + 3 + sign[i2], bArr2, 0, i4);
                if (bArr[0] == 0) {
                    int i5 = i3 - 1;
                    byte[] bArr3 = new byte[i5];
                    System.arraycopy(bArr, 1, bArr3, 0, i5);
                    C14270.m33917(bArr);
                    bArr = bArr3;
                }
                if (bArr2[0] == 0) {
                    int i6 = i4 - 1;
                    byte[] bArr4 = new byte[i6];
                    System.arraycopy(bArr2, 1, bArr4, 0, i6);
                    C14270.m33917(bArr2);
                    bArr2 = bArr4;
                }
                C16261 c16261 = new C16261();
                c16261.m38253(bArr);
                c16261.m38253(bArr2);
                byte[] bArr5 = new byte[c16261.m38255()];
                c16261.m38240();
                c16261.m38238(bArr5);
                return bArr5;
            }
        }
        return sign;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (((r11[2] & 255) + 3) != r11.length) goto L10;
     */
    @Override // l.InterfaceC17944
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean verify(byte[] r11) {
        /*
            Method dump skipped, instructions count: 172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC9998.verify(byte[]):boolean");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static byte[] m25160(byte[] bArr) {
        if ((bArr[0] & GCMSIVBlockCipher.MASK) == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        C14270.m33917(bArr);
        return bArr2;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static byte[] m25161(byte[] bArr) {
        if (bArr.length >= 2) {
            int i = 0;
            while (i < bArr.length - 1 && bArr[i] == 0) {
                int i2 = i + 1;
                if ((bArr[i2] & GCMSIVBlockCipher.MASK) != 0) {
                    break;
                }
                i = i2;
            }
            if (i != 0) {
                int length = bArr.length - i;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, i, bArr2, 0, length);
                C14270.m33917(bArr);
                return bArr2;
            }
        }
        return bArr;
    }
}
