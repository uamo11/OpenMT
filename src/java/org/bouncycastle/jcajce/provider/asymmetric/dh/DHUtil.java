package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Fingerprint;
import org.bouncycastle.util.Strings;

/* loaded from: classes.dex */
public class DHUtil {
    public static String generateKeyFingerprint(BigInteger bigInteger, DHParameters dHParameters) {
        return new Fingerprint(Arrays.concatenate(bigInteger.toByteArray(), dHParameters.getP().toByteArray(), dHParameters.getG().toByteArray())).toString();
    }

    public static String privateKeyToString(String str, BigInteger bigInteger, DHParameters dHParameters) {
        StringBuilder sb = new StringBuilder();
        String lineSeparator = Strings.lineSeparator();
        BigInteger modPow = dHParameters.getG().modPow(bigInteger, dHParameters.getP());
        sb.append(str);
        sb.append(" Private Key [");
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, generateKeyFingerprint(modPow, dHParameters), "]", lineSeparator, "              Y: ");
        sb.append(modPow.toString(16));
        sb.append(lineSeparator);
        return sb.toString();
    }

    public static String publicKeyToString(String str, BigInteger bigInteger, DHParameters dHParameters) {
        StringBuilder sb = new StringBuilder();
        String lineSeparator = Strings.lineSeparator();
        sb.append(str);
        sb.append(" Public Key [");
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, generateKeyFingerprint(bigInteger, dHParameters), "]", lineSeparator, "             Y: ");
        sb.append(bigInteger.toString(16));
        sb.append(lineSeparator);
        return sb.toString();
    }
}
