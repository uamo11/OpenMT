package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import l.C9045;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.RawAgreement;
import org.bouncycastle.crypto.agreement.X25519Agreement;
import org.bouncycastle.crypto.agreement.X448Agreement;
import org.bouncycastle.crypto.agreement.XDHUnifiedAgreement;
import org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator;
import org.bouncycastle.crypto.generators.HKDFBytesGenerator;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.X25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.X448PrivateKeyParameters;
import org.bouncycastle.crypto.params.XDHUPrivateParameters;
import org.bouncycastle.crypto.params.XDHUPublicParameters;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.spec.DHUParameterSpec;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;
import org.bouncycastle.util.Properties;

/* loaded from: classes.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    public RawAgreement agreement;
    public DHUParameterSpec dhuSpec;
    public byte[] result;

    /* loaded from: classes2.dex */
    public final class X25519 extends KeyAgreementSpi {
        public X25519() {
            super(XDHParameterSpec.X25519);
        }
    }

    /* loaded from: classes2.dex */
    public class X25519UwithSHA256CKDF extends KeyAgreementSpi {
        public X25519UwithSHA256CKDF() {
            super("X25519UwithSHA256CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA256()));
        }
    }

    /* loaded from: classes2.dex */
    public class X25519UwithSHA256KDF extends KeyAgreementSpi {
        public X25519UwithSHA256KDF() {
            super("X25519UwithSHA256KDF", new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    /* loaded from: classes2.dex */
    public final class X25519withSHA256CKDF extends KeyAgreementSpi {
        public X25519withSHA256CKDF() {
            super("X25519withSHA256CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA256()));
        }
    }

    /* loaded from: classes2.dex */
    public final class X25519withSHA256HKDF extends KeyAgreementSpi {
        public X25519withSHA256HKDF() {
            super("X25519withSHA256HKDF", new HKDFBytesGenerator(DigestFactory.createSHA256()));
        }
    }

    /* loaded from: classes2.dex */
    public final class X25519withSHA256KDF extends KeyAgreementSpi {
        public X25519withSHA256KDF() {
            super("X25519withSHA256KDF", new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    /* loaded from: classes2.dex */
    public class X25519withSHA384CKDF extends KeyAgreementSpi {
        public X25519withSHA384CKDF() {
            super("X25519withSHA384CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA384()));
        }
    }

    /* loaded from: classes2.dex */
    public class X25519withSHA512CKDF extends KeyAgreementSpi {
        public X25519withSHA512CKDF() {
            super("X25519withSHA512CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA512()));
        }
    }

    /* loaded from: classes2.dex */
    public final class X448 extends KeyAgreementSpi {
        public X448() {
            super(XDHParameterSpec.X448);
        }
    }

    /* loaded from: classes2.dex */
    public class X448UwithSHA512CKDF extends KeyAgreementSpi {
        public X448UwithSHA512CKDF() {
            super("X448UwithSHA512CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA512()));
        }
    }

    /* loaded from: classes2.dex */
    public class X448UwithSHA512KDF extends KeyAgreementSpi {
        public X448UwithSHA512KDF() {
            super("X448UwithSHA512KDF", new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    /* loaded from: classes2.dex */
    public final class X448withSHA256CKDF extends KeyAgreementSpi {
        public X448withSHA256CKDF() {
            super("X448withSHA256CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA256()));
        }
    }

    /* loaded from: classes2.dex */
    public class X448withSHA384CKDF extends KeyAgreementSpi {
        public X448withSHA384CKDF() {
            super("X448withSHA384CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA384()));
        }
    }

    /* loaded from: classes2.dex */
    public final class X448withSHA512CKDF extends KeyAgreementSpi {
        public X448withSHA512CKDF() {
            super("X448withSHA512CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA512()));
        }
    }

    /* loaded from: classes2.dex */
    public final class X448withSHA512HKDF extends KeyAgreementSpi {
        public X448withSHA512HKDF() {
            super("X448withSHA512HKDF", new HKDFBytesGenerator(DigestFactory.createSHA512()));
        }
    }

    /* loaded from: classes2.dex */
    public final class X448withSHA512KDF extends KeyAgreementSpi {
        public X448withSHA512KDF() {
            super("X448withSHA512KDF", new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    /* loaded from: classes2.dex */
    public final class XDH extends KeyAgreementSpi {
        public XDH() {
            super("XDH");
        }
    }

    public KeyAgreementSpi(String str) {
        super(Properties.isOverrideSet(Properties.EMULATE_ORACLE) ? "XDH" : str, null);
    }

    public KeyAgreementSpi(String str, DerivationFunction derivationFunction) {
        super(Properties.isOverrideSet(Properties.EMULATE_ORACLE) ? "XDH" : str, derivationFunction);
    }

    private RawAgreement getAgreement(String str) {
        if (this.kaAlgorithm.equals("XDH") || this.kaAlgorithm.startsWith(str)) {
            int indexOf = this.kaAlgorithm.indexOf(85);
            boolean startsWith = str.startsWith(XDHParameterSpec.X448);
            return indexOf > 0 ? startsWith ? new XDHUnifiedAgreement(new X448Agreement()) : new XDHUnifiedAgreement(new X25519Agreement()) : startsWith ? new X448Agreement() : new X25519Agreement();
        }
        throw new InvalidKeyException("inappropriate key for " + this.kaAlgorithm);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] doCalcSecret() {
        return this.result;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public void doInitFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        String str;
        if (!(key instanceof PrivateKey)) {
            throw new InvalidKeyException("private XDH key required");
        }
        AsymmetricKeyParameter generatePrivateKeyParameter = EdECUtil.generatePrivateKeyParameter((PrivateKey) key);
        if (generatePrivateKeyParameter instanceof X25519PrivateKeyParameters) {
            str = XDHParameterSpec.X25519;
        } else {
            if (!(generatePrivateKeyParameter instanceof X448PrivateKeyParameters)) {
                throw new InvalidKeyException("unsupported private key type");
            }
            str = XDHParameterSpec.X448;
        }
        this.agreement = getAgreement(str);
        this.ukmParameters = null;
        this.ukmParametersSalt = null;
        if (algorithmParameterSpec instanceof DHUParameterSpec) {
            if (this.kaAlgorithm.indexOf(85) < 0) {
                throw new InvalidAlgorithmParameterException("agreement algorithm not DHU based");
            }
            DHUParameterSpec dHUParameterSpec = (DHUParameterSpec) algorithmParameterSpec;
            this.dhuSpec = dHUParameterSpec;
            this.ukmParameters = dHUParameterSpec.getUserKeyingMaterial();
            this.agreement.init(new XDHUPrivateParameters(generatePrivateKeyParameter, ((BCXDHPrivateKey) this.dhuSpec.getEphemeralPrivateKey()).engineGetKeyParameters(), ((BCXDHPublicKey) this.dhuSpec.getEphemeralPublicKey()).engineGetKeyParameters()));
        } else if (algorithmParameterSpec != null) {
            this.agreement.init(generatePrivateKeyParameter);
            if (!(algorithmParameterSpec instanceof UserKeyingMaterialSpec)) {
                throw new InvalidAlgorithmParameterException("unknown ParameterSpec");
            }
            if (this.kdf == null) {
                throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
            }
            UserKeyingMaterialSpec userKeyingMaterialSpec = (UserKeyingMaterialSpec) algorithmParameterSpec;
            this.ukmParameters = userKeyingMaterialSpec.getUserKeyingMaterial();
            this.ukmParametersSalt = userKeyingMaterialSpec.getSalt();
        } else {
            this.agreement.init(generatePrivateKeyParameter);
        }
        if (this.kdf == null || this.ukmParameters != null) {
            return;
        }
        this.ukmParameters = new byte[0];
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z) {
        if (!(key instanceof PublicKey)) {
            throw new InvalidKeyException("public XDH key required");
        }
        if (this.agreement == null) {
            throw new IllegalStateException(C9045.m23341(new StringBuilder(), this.kaAlgorithm, " not initialised."));
        }
        if (!z) {
            throw new IllegalStateException(C9045.m23341(new StringBuilder(), this.kaAlgorithm, " can only be between two parties."));
        }
        AsymmetricKeyParameter generatePublicKeyParameter = EdECUtil.generatePublicKeyParameter((PublicKey) key);
        byte[] bArr = new byte[this.agreement.getAgreementSize()];
        this.result = bArr;
        DHUParameterSpec dHUParameterSpec = this.dhuSpec;
        if (dHUParameterSpec != null) {
            this.agreement.calculateAgreement(new XDHUPublicParameters(generatePublicKeyParameter, ((BCXDHPublicKey) dHUParameterSpec.getOtherPartyEphemeralKey()).engineGetKeyParameters()), this.result, 0);
            return null;
        }
        this.agreement.calculateAgreement(generatePublicKeyParameter, bArr, 0);
        return null;
    }
}
