package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.jcajce.MLDSAProxyPrivateKey;
import org.bouncycastle.jcajce.interfaces.MLDSAPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature;
import org.bouncycastle.jcajce.spec.MLDSAParameterSpec;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAParameters;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAPublicKeyParameters;
import org.bouncycastle.pqc.crypto.mldsa.MLDSASigner;
import org.bouncycastle.pqc.crypto.util.PublicKeyFactory;

/* loaded from: classes.dex */
public class SignatureSpi extends BaseDeterministicOrRandomSignature {
    public MLDSAParameters parameters;
    public MLDSASigner signer;

    /* loaded from: classes2.dex */
    public class MLDSA extends SignatureSpi {
        public MLDSA() {
            super(new MLDSASigner());
        }
    }

    /* loaded from: classes2.dex */
    public class MLDSA44 extends SignatureSpi {
        public MLDSA44() {
            super(new MLDSASigner(), MLDSAParameters.ml_dsa_44);
        }
    }

    /* loaded from: classes2.dex */
    public class MLDSA65 extends SignatureSpi {
        public MLDSA65() {
            super(new MLDSASigner(), MLDSAParameters.ml_dsa_65);
        }
    }

    /* loaded from: classes2.dex */
    public class MLDSA87 extends SignatureSpi {
        public MLDSA87() {
            super(new MLDSASigner(), MLDSAParameters.ml_dsa_87);
        }
    }

    /* loaded from: classes2.dex */
    public class MLDSACalcMu extends SignatureSpi {
        public MLDSACalcMu() {
            super(new MLDSASigner());
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, java.security.SignatureSpi
        public byte[] engineSign() {
            try {
                return this.signer.generateMu();
            } catch (Exception e) {
                throw new SignatureException(e.toString());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, java.security.SignatureSpi
        public boolean engineVerify(byte[] bArr) {
            return this.signer.verifyMu(bArr);
        }
    }

    /* loaded from: classes2.dex */
    public class MLDSAExtMu extends SignatureSpi {
        public ByteArrayOutputStream bOut;

        public MLDSAExtMu() {
            super(new MLDSASigner());
            this.bOut = new ByteArrayOutputStream(64);
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, java.security.SignatureSpi
        public byte[] engineSign() {
            try {
                byte[] byteArray = this.bOut.toByteArray();
                this.bOut.reset();
                return this.signer.generateMuSignature(byteArray);
            } catch (DataLengthException e) {
                throw new SignatureException(e.getMessage());
            } catch (Exception e2) {
                throw new SignatureException(e2.toString());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, java.security.SignatureSpi
        public boolean engineVerify(byte[] bArr) {
            byte[] byteArray = this.bOut.toByteArray();
            this.bOut.reset();
            try {
                return this.signer.verifyMuSignature(byteArray, bArr);
            } catch (DataLengthException e) {
                throw new SignatureException(e.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
        public void updateEngine(byte b) {
            this.bOut.write(b);
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
        public void updateEngine(byte[] bArr, int i, int i2) {
            this.bOut.write(bArr, i, i2);
        }
    }

    public SignatureSpi(MLDSASigner mLDSASigner) {
        super("MLDSA");
        this.signer = mLDSASigner;
        this.parameters = null;
    }

    public SignatureSpi(MLDSASigner mLDSASigner, MLDSAParameters mLDSAParameters) {
        super(MLDSAParameterSpec.fromName(mLDSAParameters.getName()).getName());
        this.signer = mLDSASigner;
        this.parameters = mLDSAParameters;
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() {
        try {
            return this.signer.generateSignature();
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) {
        return this.signer.verifySignature(bArr);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void reInitialize(boolean z, CipherParameters cipherParameters) {
        this.signer.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void signInit(PrivateKey privateKey, SecureRandom secureRandom) {
        ((java.security.SignatureSpi) this).appRandom = secureRandom;
        if (privateKey instanceof BCMLDSAPrivateKey) {
            BCMLDSAPrivateKey bCMLDSAPrivateKey = (BCMLDSAPrivateKey) privateKey;
            this.keyParams = bCMLDSAPrivateKey.getKeyParams();
            MLDSAParameters mLDSAParameters = this.parameters;
            if (mLDSAParameters != null) {
                String name = MLDSAParameterSpec.fromName(mLDSAParameters.getName()).getName();
                if (!name.equals(bCMLDSAPrivateKey.getAlgorithm())) {
                    throw new InvalidKeyException("signature configured for ".concat(name));
                }
                return;
            }
            return;
        }
        if (!(privateKey instanceof MLDSAProxyPrivateKey) || !(this instanceof MLDSACalcMu)) {
            throw new InvalidKeyException("unknown private key passed to ML-DSA");
        }
        MLDSAPublicKey publicKey = ((MLDSAProxyPrivateKey) privateKey).getPublicKey();
        try {
            this.keyParams = PublicKeyFactory.createKey(publicKey.getEncoded());
            MLDSAParameters mLDSAParameters2 = this.parameters;
            if (mLDSAParameters2 != null) {
                String name2 = MLDSAParameterSpec.fromName(mLDSAParameters2.getName()).getName();
                if (!name2.equals(publicKey.getAlgorithm())) {
                    throw new InvalidKeyException("signature configured for ".concat(name2));
                }
            }
        } catch (IOException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void updateEngine(byte b) {
        this.signer.update(b);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void updateEngine(byte[] bArr, int i, int i2) {
        this.signer.update(bArr, i, i2);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void verifyInit(PublicKey publicKey) {
        if (publicKey instanceof BCMLDSAPublicKey) {
            this.keyParams = ((BCMLDSAPublicKey) publicKey).getKeyParams();
        } else {
            try {
                AsymmetricKeyParameter createKey = PublicKeyFactory.createKey(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
                this.keyParams = createKey;
                publicKey = new BCMLDSAPublicKey((MLDSAPublicKeyParameters) createKey);
            } catch (Exception unused) {
                throw new InvalidKeyException("unknown public key passed to ML-DSA");
            }
        }
        MLDSAParameters mLDSAParameters = this.parameters;
        if (mLDSAParameters != null) {
            String name = MLDSAParameterSpec.fromName(mLDSAParameters.getName()).getName();
            if (!name.equals(publicKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(name));
            }
        }
    }
}
