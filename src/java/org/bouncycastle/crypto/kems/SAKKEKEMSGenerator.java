package org.bouncycastle.crypto.kems;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.SAKKEPublicKeyParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes.dex */
public class SAKKEKEMSGenerator implements EncapsulatedSecretGenerator {
    public final SecureRandom random;

    public SAKKEKEMSGenerator(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    public static BigInteger hashToIntegerRange(byte[] bArr, BigInteger bigInteger, Digest digest) {
        int digestSize = digest.getDigestSize();
        byte[] bArr2 = new byte[digestSize];
        digest.update(bArr, 0, bArr.length);
        digest.doFinal(bArr2, 0);
        int digestSize2 = digest.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        int bitLength = bigInteger.bitLength() >> 8;
        BigInteger bigInteger2 = BigInteger.ZERO;
        int digestSize3 = digest.getDigestSize();
        byte[] bArr4 = new byte[digestSize3];
        for (int i = 0; i <= bitLength; i++) {
            digest.update(bArr3, 0, digestSize2);
            digest.doFinal(bArr3, 0);
            digest.update(bArr3, 0, digestSize2);
            digest.update(bArr2, 0, digestSize);
            digest.doFinal(bArr4, 0);
            bigInteger2 = bigInteger2.shiftLeft(digestSize3 * 8).add(new BigInteger(1, bArr4));
        }
        return bigInteger2.mod(bigInteger);
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretGenerator
    public SecretWithEncapsulation generateEncapsulated(AsymmetricKeyParameter asymmetricKeyParameter) {
        SAKKEPublicKeyParameters sAKKEPublicKeyParameters = (SAKKEPublicKeyParameters) asymmetricKeyParameter;
        ECPoint z = sAKKEPublicKeyParameters.getZ();
        BigInteger identifier = sAKKEPublicKeyParameters.getIdentifier();
        BigInteger prime = sAKKEPublicKeyParameters.getPrime();
        BigInteger q = sAKKEPublicKeyParameters.getQ();
        BigInteger g = sAKKEPublicKeyParameters.getG();
        int n = sAKKEPublicKeyParameters.getN();
        ECCurve curve = sAKKEPublicKeyParameters.getCurve();
        ECPoint point = sAKKEPublicKeyParameters.getPoint();
        Digest digest = sAKKEPublicKeyParameters.getDigest();
        BigInteger createRandomBigInteger = BigIntegers.createRandomBigInteger(n, this.random);
        BigInteger hashToIntegerRange = hashToIntegerRange(Arrays.concatenate(createRandomBigInteger.toByteArray(), identifier.toByteArray()), q, digest);
        BigInteger order = curve.getOrder();
        ECPoint normalize = (order == null ? point.multiply(identifier).add(z).multiply(hashToIntegerRange) : ECAlgorithms.sumOfTwoMultiplies(point, identifier.multiply(hashToIntegerRange).mod(order), z, hashToIntegerRange)).normalize();
        BigInteger bigInteger = BigInteger.ONE;
        ECPoint createPoint = curve.createPoint(bigInteger, g);
        BigInteger bigInteger2 = bigInteger;
        BigInteger bigInteger3 = g;
        for (int bitLength = hashToIntegerRange.bitLength() - 2; bitLength >= 0; bitLength--) {
            BigInteger[] fp2PointSquare = SAKKEKEMExtractor.fp2PointSquare(bigInteger2, bigInteger3, prime);
            createPoint = createPoint.timesPow2(2);
            BigInteger bigInteger4 = fp2PointSquare[0];
            BigInteger bigInteger5 = fp2PointSquare[1];
            if (hashToIntegerRange.testBit(bitLength)) {
                BigInteger[] fp2Multiply = SAKKEKEMExtractor.fp2Multiply(bigInteger4, bigInteger5, bigInteger, g, prime);
                bigInteger4 = fp2Multiply[0];
                bigInteger5 = fp2Multiply[1];
            }
            BigInteger bigInteger6 = bigInteger4;
            bigInteger3 = bigInteger5;
            bigInteger2 = bigInteger6;
        }
        return new SecretWithEncapsulationImpl(BigIntegers.asUnsignedByteArray(n / 8, createRandomBigInteger), Arrays.concatenate(normalize.getEncoded(false), BigIntegers.asUnsignedByteArray(16, createRandomBigInteger.xor(hashToIntegerRange(bigInteger3.multiply(BigIntegers.modOddInverse(prime, bigInteger2)).mod(prime).toByteArray(), BigInteger.ONE.shiftLeft(n), digest)))));
    }
}
