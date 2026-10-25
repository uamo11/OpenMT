package org.bouncycastle.crypto.kems;

import java.math.BigInteger;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.crypto.params.SAKKEPrivateKeyParameters;
import org.bouncycastle.crypto.params.SAKKEPublicKeyParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes.dex */
public class SAKKEKEMExtractor implements EncapsulatedSecretExtractor {
    public final ECPoint K_bs;
    public final ECPoint P;
    public final ECPoint Z_S;
    public final ECCurve curve;
    public final Digest digest;
    public final BigInteger identifier;
    public final int n;
    public final BigInteger p;
    public final BigInteger q;

    public SAKKEKEMExtractor(SAKKEPrivateKeyParameters sAKKEPrivateKeyParameters) {
        SAKKEPublicKeyParameters publicParams = sAKKEPrivateKeyParameters.getPublicParams();
        this.curve = publicParams.getCurve();
        BigInteger q = publicParams.getQ();
        this.q = q;
        ECPoint point = publicParams.getPoint();
        this.P = point;
        this.p = publicParams.getPrime();
        this.Z_S = publicParams.getZ();
        BigInteger identifier = publicParams.getIdentifier();
        this.identifier = identifier;
        this.K_bs = point.multiply(identifier.add(sAKKEPrivateKeyParameters.getMasterSecret()).modInverse(q)).normalize();
        this.n = publicParams.getN();
        this.digest = publicParams.getDigest();
    }

    public static BigInteger computePairing(ECPoint eCPoint, ECPoint eCPoint2, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = BigInteger.ONE;
        BigInteger[] bigIntegerArr = {bigInteger3, BigInteger.ZERO};
        BigInteger subtract = bigInteger2.subtract(bigInteger3);
        int bitLength = subtract.bitLength();
        BigInteger bigInteger4 = eCPoint2.getAffineXCoord().toBigInteger();
        BigInteger bigInteger5 = eCPoint2.getAffineYCoord().toBigInteger();
        BigInteger bigInteger6 = eCPoint.getAffineXCoord().toBigInteger();
        BigInteger bigInteger7 = eCPoint.getAffineYCoord().toBigInteger();
        BigInteger valueOf = BigInteger.valueOf(3L);
        ECPoint eCPoint3 = eCPoint;
        for (int i = bitLength - 2; i >= 0; i--) {
            BigInteger bigInteger8 = eCPoint3.getAffineXCoord().toBigInteger();
            BigInteger bigInteger9 = eCPoint3.getAffineYCoord().toBigInteger();
            BigInteger mod = bigInteger8.multiply(bigInteger8).mod(bigInteger).subtract(BigInteger.ONE).multiply(valueOf).multiply(BigIntegers.modOddInverse(bigInteger, bigInteger9.shiftLeft(1))).mod(bigInteger);
            BigInteger[] fp2PointSquare = fp2PointSquare(bigIntegerArr[0], bigIntegerArr[1], bigInteger);
            bigIntegerArr = fp2Multiply(fp2PointSquare[0], fp2PointSquare[1], mod.multiply(bigInteger4.add(bigInteger8)).subtract(bigInteger9).mod(bigInteger), bigInteger5, bigInteger);
            eCPoint3 = eCPoint3.twice().normalize();
            if (subtract.testBit(i)) {
                BigInteger bigInteger10 = eCPoint3.getAffineXCoord().toBigInteger();
                BigInteger bigInteger11 = eCPoint3.getAffineYCoord().toBigInteger();
                bigIntegerArr = fp2Multiply(bigIntegerArr[0], bigIntegerArr[1], bigInteger11.subtract(bigInteger7).multiply(BigIntegers.modOddInverse(bigInteger, bigInteger10.subtract(bigInteger6))).mod(bigInteger).multiply(bigInteger4.add(bigInteger10)).subtract(bigInteger11).mod(bigInteger), bigInteger5, bigInteger);
                if (i > 0) {
                    eCPoint3 = eCPoint3.add(eCPoint).normalize();
                }
            }
        }
        BigInteger[] fp2PointSquare2 = fp2PointSquare(bigIntegerArr[0], bigIntegerArr[1], bigInteger);
        BigInteger[] fp2PointSquare3 = fp2PointSquare(fp2PointSquare2[0], fp2PointSquare2[1], bigInteger);
        return fp2PointSquare3[1].multiply(BigIntegers.modOddInverse(bigInteger, fp2PointSquare3[0])).mod(bigInteger);
    }

    public static BigInteger[] fp2Multiply(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        return new BigInteger[]{bigInteger.multiply(bigInteger3).subtract(bigInteger2.multiply(bigInteger4)).mod(bigInteger5), bigInteger.multiply(bigInteger4).add(bigInteger2.multiply(bigInteger3)).mod(bigInteger5)};
    }

    public static BigInteger[] fp2PointSquare(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return new BigInteger[]{bigInteger.add(bigInteger2).multiply(bigInteger.subtract(bigInteger2)).mod(bigInteger3), bigInteger.multiply(bigInteger2).shiftLeft(1).mod(bigInteger3)};
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public byte[] extractSecret(byte[] bArr) {
        ECPoint sumOfTwoMultiplies;
        ECPoint decodePoint = this.curve.decodePoint(Arrays.copyOfRange(bArr, 0, 257));
        BigInteger fromUnsignedByteArray = BigIntegers.fromUnsignedByteArray(bArr, 257, 16);
        BigInteger computePairing = computePairing(decodePoint, this.K_bs, this.p, this.q);
        BigInteger mod = fromUnsignedByteArray.xor(SAKKEKEMSGenerator.hashToIntegerRange(computePairing.toByteArray(), BigInteger.ONE.shiftLeft(this.n), this.digest)).mod(this.p);
        BigInteger bigInteger = this.identifier;
        BigInteger hashToIntegerRange = SAKKEKEMSGenerator.hashToIntegerRange(Arrays.concatenate(mod.toByteArray(), bigInteger.toByteArray()), this.q, this.digest);
        BigInteger order = this.curve.getOrder();
        if (order == null) {
            sumOfTwoMultiplies = this.P.multiply(bigInteger).add(this.Z_S).multiply(hashToIntegerRange);
        } else {
            sumOfTwoMultiplies = ECAlgorithms.sumOfTwoMultiplies(this.P, bigInteger.multiply(hashToIntegerRange).mod(order), this.Z_S, hashToIntegerRange);
        }
        if (sumOfTwoMultiplies.subtract(decodePoint).isInfinity()) {
            return BigIntegers.asUnsignedByteArray(this.n / 8, mod);
        }
        throw new IllegalStateException("Validation of R_bS failed");
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public int getEncapsulationLength() {
        return 273;
    }
}
