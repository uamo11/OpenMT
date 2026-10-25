package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.pqc.math.ntru.HPSPolynomial;
import org.bouncycastle.pqc.math.ntru.Polynomial;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class NTRUOWCPA {
    public final NTRUParameterSet params;
    public final NTRUSampling sampling;

    public NTRUOWCPA(NTRUParameterSet nTRUParameterSet) {
        this.params = nTRUParameterSet;
        this.sampling = new NTRUSampling(nTRUParameterSet);
    }

    private int checkCiphertext(byte[] bArr) {
        return (((~((short) (bArr[this.params.ntruCiphertextBytes() - 1] & (255 << (8 - ((this.params.packDegree() * this.params.logQ()) & 7)))))) + 1) >>> 15) & 1;
    }

    private int checkM(HPSPolynomial hPSPolynomial) {
        short s = 0;
        short s2 = 0;
        for (int i = 0; i < this.params.n() - 1; i++) {
            short s3 = hPSPolynomial.coeffs[i];
            s = (short) (s + (s3 & 1));
            s2 = (short) (s2 + (s3 & 2));
        }
        return (((~(((s2 >>> 1) ^ s) | (((NTRUHPSParameterSet) this.params).weight() ^ s2))) + 1) >>> 31) & 1;
    }

    private int checkR(Polynomial polynomial) {
        int i = 0;
        for (int i2 = 0; i2 < this.params.n() - 1; i2++) {
            short s = polynomial.coeffs[i2];
            i = i | ((s + 1) & (this.params.q() - 4)) | ((s + 2) & 4);
        }
        return (((~(polynomial.coeffs[this.params.n() - 1] | i)) + 1) >>> 31) & 1;
    }

    public OWCPADecryptResult decrypt(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[this.params.owcpaMsgBytes()];
        Polynomial createPolynomial = this.params.createPolynomial();
        Polynomial createPolynomial2 = this.params.createPolynomial();
        Polynomial createPolynomial3 = this.params.createPolynomial();
        Polynomial createPolynomial4 = this.params.createPolynomial();
        createPolynomial.rqSumZeroFromBytes(bArr);
        createPolynomial2.s3FromBytes(bArr2);
        createPolynomial2.z3ToZq();
        createPolynomial3.rqMul(createPolynomial, createPolynomial2);
        createPolynomial2.rqToS3(createPolynomial3);
        createPolynomial3.s3FromBytes(Arrays.copyOfRange(bArr2, this.params.packTrinaryBytes(), bArr2.length));
        createPolynomial4.s3Mul(createPolynomial2, createPolynomial3);
        createPolynomial4.s3ToBytes(bArr3, this.params.packTrinaryBytes());
        int checkCiphertext = checkCiphertext(bArr);
        if (this.params instanceof NTRUHPSParameterSet) {
            checkCiphertext |= checkM((HPSPolynomial) createPolynomial4);
        }
        createPolynomial2.lift(createPolynomial4);
        for (int i = 0; i < this.params.n(); i++) {
            short[] sArr = createPolynomial.coeffs;
            sArr[i] = (short) (sArr[i] - createPolynomial2.coeffs[i]);
        }
        createPolynomial3.sqFromBytes(Arrays.copyOfRange(bArr2, this.params.packTrinaryBytes() * 2, bArr2.length));
        createPolynomial4.sqMul(createPolynomial, createPolynomial3);
        int checkR = checkCiphertext | checkR(createPolynomial4);
        createPolynomial4.trinaryZqToZ3();
        createPolynomial4.s3ToBytes(bArr3, 0);
        return new OWCPADecryptResult(bArr3, checkR);
    }

    public byte[] encrypt(Polynomial polynomial, Polynomial polynomial2, byte[] bArr) {
        Polynomial createPolynomial = this.params.createPolynomial();
        Polynomial createPolynomial2 = this.params.createPolynomial();
        createPolynomial.rqSumZeroFromBytes(bArr);
        createPolynomial2.rqMul(polynomial, createPolynomial);
        createPolynomial.lift(polynomial2);
        for (int i = 0; i < this.params.n(); i++) {
            short[] sArr = createPolynomial2.coeffs;
            sArr[i] = (short) (sArr[i] + createPolynomial.coeffs[i]);
        }
        return createPolynomial2.rqSumZeroToBytes(this.params.ntruCiphertextBytes());
    }

    public OWCPAKeyPair keypair(byte[] bArr) {
        int owcpaSecretKeyBytes = this.params.owcpaSecretKeyBytes();
        byte[] bArr2 = new byte[owcpaSecretKeyBytes];
        int n = this.params.n();
        this.params.q();
        Polynomial createPolynomial = this.params.createPolynomial();
        Polynomial createPolynomial2 = this.params.createPolynomial();
        Polynomial createPolynomial3 = this.params.createPolynomial();
        PolynomialPair sampleFg = this.sampling.sampleFg(bArr);
        Polynomial f = sampleFg.f();
        Polynomial g = sampleFg.g();
        createPolynomial.s3Inv(f);
        f.s3ToBytes(bArr2, 0);
        createPolynomial.s3ToBytes(bArr2, this.params.packTrinaryBytes());
        f.z3ToZq();
        g.z3ToZq();
        if (this.params instanceof NTRUHRSSParameterSet) {
            while (true) {
                n--;
                if (n <= 0) {
                    break;
                }
                short[] sArr = g.coeffs;
                sArr[n] = (short) ((sArr[n - 1] - sArr[n]) * 3);
            }
            short[] sArr2 = g.coeffs;
            sArr2[0] = (short) (-(sArr2[0] * 3));
        } else {
            for (int i = 0; i < n; i++) {
                short[] sArr3 = g.coeffs;
                sArr3[i] = (short) (sArr3[i] * 3);
            }
        }
        createPolynomial.rqMul(g, f);
        createPolynomial2.rqInv(createPolynomial);
        createPolynomial3.rqMul(createPolynomial2, f);
        createPolynomial.sqMul(createPolynomial3, f);
        byte[] sqToBytes = createPolynomial.sqToBytes(owcpaSecretKeyBytes - (this.params.packTrinaryBytes() * 2));
        System.arraycopy(sqToBytes, 0, bArr2, this.params.packTrinaryBytes() * 2, sqToBytes.length);
        createPolynomial3.rqMul(createPolynomial2, g);
        createPolynomial.rqMul(createPolynomial3, g);
        return new OWCPAKeyPair(createPolynomial.rqSumZeroToBytes(this.params.owcpaPublicKeyBytes()), bArr2);
    }
}
