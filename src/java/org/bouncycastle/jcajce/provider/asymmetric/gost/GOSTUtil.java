package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Fingerprint;
import org.bouncycastle.util.Strings;

/* loaded from: classes.dex */
public class GOSTUtil {
    public static String generateKeyFingerprint(BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        return new Fingerprint(Arrays.concatenate(bigInteger.toByteArray(), gOST3410Parameters.getP().toByteArray(), gOST3410Parameters.getA().toByteArray())).toString();
    }

    public static String privateKeyToString(String str, BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        StringBuilder sb = new StringBuilder();
        String lineSeparator = Strings.lineSeparator();
        BigInteger modPow = gOST3410Parameters.getA().modPow(bigInteger, gOST3410Parameters.getP());
        sb.append(str);
        sb.append(" Private Key [");
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, generateKeyFingerprint(modPow, gOST3410Parameters), "]", lineSeparator, "                  Y: ");
        sb.append(modPow.toString(16));
        sb.append(lineSeparator);
        return sb.toString();
    }

    public static String publicKeyToString(String str, BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        StringBuilder sb = new StringBuilder();
        String lineSeparator = Strings.lineSeparator();
        sb.append(str);
        sb.append(" Public Key [");
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, generateKeyFingerprint(bigInteger, gOST3410Parameters), "]", lineSeparator, "                 Y: ");
        sb.append(bigInteger.toString(16));
        sb.append(lineSeparator);
        return sb.toString();
    }
}
