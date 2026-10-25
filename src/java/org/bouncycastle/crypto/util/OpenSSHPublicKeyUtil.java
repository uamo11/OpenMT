package org.bouncycastle.crypto.util;

import l.C19462;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.math.ec.ECCurve;

/* loaded from: classes.dex */
public class OpenSSHPublicKeyUtil {
    public static final String DSS = "ssh-dss";
    public static final String ECDSA = "ecdsa";
    public static final String ED_25519 = "ssh-ed25519";
    public static final String FIDO2_EC_P256 = "sk-ecdsa-sha2-nistp256@openssh.com";
    public static final String FIDO_ED_25519 = "sk-ssh-ed25519@openssh.com";
    public static final String RSA = "ssh-rsa";

    public static byte[] encodePublicKey(AsymmetricKeyParameter asymmetricKeyParameter) {
        if (asymmetricKeyParameter == null) {
            throw new IllegalArgumentException("cipherParameters was null.");
        }
        if (asymmetricKeyParameter instanceof RSAKeyParameters) {
            if (asymmetricKeyParameter.isPrivate()) {
                throw new IllegalArgumentException("RSAKeyParamaters was for encryption");
            }
            RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) asymmetricKeyParameter;
            SSHBuilder sSHBuilder = new SSHBuilder();
            sSHBuilder.writeString(RSA);
            sSHBuilder.writeBigNum(rSAKeyParameters.getExponent());
            sSHBuilder.writeBigNum(rSAKeyParameters.getModulus());
            return sSHBuilder.getBytes();
        }
        if (asymmetricKeyParameter instanceof ECPublicKeyParameters) {
            SSHBuilder sSHBuilder2 = new SSHBuilder();
            ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) asymmetricKeyParameter;
            String nameForParameters = SSHNamedCurves.getNameForParameters(eCPublicKeyParameters.getParameters());
            if (nameForParameters == null) {
                throw new IllegalArgumentException("unable to derive ssh curve name for ".concat(eCPublicKeyParameters.getParameters().getCurve().getClass().getName()));
            }
            sSHBuilder2.writeString("ecdsa-sha2-".concat(nameForParameters));
            sSHBuilder2.writeString(nameForParameters);
            sSHBuilder2.writeBlock(eCPublicKeyParameters.getQ().getEncoded(false));
            return sSHBuilder2.getBytes();
        }
        if (asymmetricKeyParameter instanceof DSAPublicKeyParameters) {
            DSAPublicKeyParameters dSAPublicKeyParameters = (DSAPublicKeyParameters) asymmetricKeyParameter;
            DSAParameters parameters = dSAPublicKeyParameters.getParameters();
            SSHBuilder sSHBuilder3 = new SSHBuilder();
            sSHBuilder3.writeString(DSS);
            sSHBuilder3.writeBigNum(parameters.getP());
            sSHBuilder3.writeBigNum(parameters.getQ());
            sSHBuilder3.writeBigNum(parameters.getG());
            sSHBuilder3.writeBigNum(dSAPublicKeyParameters.getY());
            return sSHBuilder3.getBytes();
        }
        if (asymmetricKeyParameter instanceof Ed25519PublicKeyParameters) {
            SSHBuilder sSHBuilder4 = new SSHBuilder();
            sSHBuilder4.writeString(ED_25519);
            sSHBuilder4.writeBlock(((Ed25519PublicKeyParameters) asymmetricKeyParameter).getEncoded());
            return sSHBuilder4.getBytes();
        }
        throw new IllegalArgumentException("unable to convert " + asymmetricKeyParameter.getClass().getName() + " to public key");
    }

    public static AsymmetricKeyParameter parsePublicKey(SSHBuffer sSHBuffer) {
        AsymmetricKeyParameter asymmetricKeyParameter;
        String readString = sSHBuffer.readString();
        if (RSA.equals(readString)) {
            asymmetricKeyParameter = new RSAKeyParameters(false, sSHBuffer.readBigNumPositive(), sSHBuffer.readBigNumPositive());
        } else if (DSS.equals(readString)) {
            asymmetricKeyParameter = new DSAPublicKeyParameters(sSHBuffer.readBigNumPositive(), new DSAParameters(sSHBuffer.readBigNumPositive(), sSHBuffer.readBigNumPositive(), sSHBuffer.readBigNumPositive()));
        } else if (readString.startsWith(ECDSA)) {
            String readString2 = sSHBuffer.readString();
            ASN1ObjectIdentifier byName = SSHNamedCurves.getByName(readString2);
            X9ECParameters parameters = SSHNamedCurves.getParameters(byName);
            if (parameters == null) {
                throw new IllegalStateException(C19462.m44858("unable to find curve for ", readString, " using curve name ", readString2));
            }
            asymmetricKeyParameter = new ECPublicKeyParameters(parameters.getCurve().decodePoint(sSHBuffer.readBlock()), new ECNamedDomainParameters(byName, parameters));
        } else if (readString.equals(FIDO2_EC_P256)) {
            String readString3 = sSHBuffer.readString();
            ASN1ObjectIdentifier byName2 = SSHNamedCurves.getByName(readString3);
            X9ECParameters parameters2 = SSHNamedCurves.getParameters(byName2);
            if (parameters2 == null) {
                throw new IllegalStateException(C19462.m44858("unable to find curve for ", readString, " using curve name ", readString3));
            }
            ECCurve curve = parameters2.getCurve();
            byte[] readBlock = sSHBuffer.readBlock();
            sSHBuffer.readString();
            asymmetricKeyParameter = new ECPublicKeyParameters(curve.decodePoint(readBlock), new ECNamedDomainParameters(byName2, parameters2));
        } else if (ED_25519.equals(readString)) {
            byte[] readBlock2 = sSHBuffer.readBlock();
            if (readBlock2.length != 32) {
                throw new IllegalStateException("public key value of wrong length");
            }
            asymmetricKeyParameter = new Ed25519PublicKeyParameters(readBlock2, 0);
        } else if (FIDO2_EC_P256.equals(readString)) {
            byte[] readBlock3 = sSHBuffer.readBlock();
            if (readBlock3.length != 32) {
                throw new IllegalStateException("public key value of wrong length");
            }
            sSHBuffer.readString();
            asymmetricKeyParameter = new Ed25519PublicKeyParameters(readBlock3, 0);
        } else {
            asymmetricKeyParameter = null;
        }
        if (asymmetricKeyParameter == null) {
            throw new IllegalArgumentException("unable to parse key");
        }
        if (sSHBuffer.hasRemaining()) {
            throw new IllegalArgumentException("decoded key has trailing data");
        }
        return asymmetricKeyParameter;
    }

    public static AsymmetricKeyParameter parsePublicKey(byte[] bArr) {
        return parsePublicKey(new SSHBuffer(bArr));
    }
}
