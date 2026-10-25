package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithContext;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.jcajce.spec.ContextParameterSpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.SpecUtil;
import org.bouncycastle.util.Exceptions;

/* loaded from: classes.dex */
public abstract class BaseDeterministicOrRandomSignature extends SignatureSpi {
    public AlgorithmParameters engineParams;
    public AsymmetricKeyParameter keyParams;
    public ContextParameterSpec paramSpec;
    public final JcaJceHelper helper = new BCJcaJceHelper();
    public boolean isInitState = true;
    public final AlgorithmParameterSpec originalSpec = ContextParameterSpec.EMPTY_CONTEXT_SPEC;

    public BaseDeterministicOrRandomSignature(String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [org.bouncycastle.crypto.params.ParametersWithContext] */
    /* JADX WARN: Type inference failed for: r2v1, types: [org.bouncycastle.crypto.params.ParametersWithContext] */
    /* JADX WARN: Type inference failed for: r2v2, types: [org.bouncycastle.crypto.params.ParametersWithRandom] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.security.SignatureSpi, org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature] */
    private void reInit() {
        boolean z;
        AsymmetricKeyParameter asymmetricKeyParameter = this.keyParams;
        if (asymmetricKeyParameter.isPrivate()) {
            SecureRandom secureRandom = ((SignatureSpi) this).appRandom;
            if (secureRandom != null) {
                asymmetricKeyParameter = new ParametersWithRandom(asymmetricKeyParameter, secureRandom);
            }
            ContextParameterSpec contextParameterSpec = this.paramSpec;
            if (contextParameterSpec != null) {
                asymmetricKeyParameter = new ParametersWithContext(asymmetricKeyParameter, contextParameterSpec.getContext());
            }
            z = true;
        } else {
            ContextParameterSpec contextParameterSpec2 = this.paramSpec;
            if (contextParameterSpec2 != null) {
                asymmetricKeyParameter = new ParametersWithContext(asymmetricKeyParameter, contextParameterSpec2.getContext());
            }
            z = false;
        }
        reInitialize(z, asymmetricKeyParameter);
    }

    @Override // java.security.SignatureSpi
    public final Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("GetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public final AlgorithmParameters engineGetParameters() {
        ContextParameterSpec contextParameterSpec;
        if (this.engineParams == null && (contextParameterSpec = this.paramSpec) != null && contextParameterSpec != ContextParameterSpec.EMPTY_CONTEXT_SPEC) {
            try {
                AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters("CONTEXT");
                this.engineParams = createAlgorithmParameters;
                createAlgorithmParameters.init(this.paramSpec);
            } catch (Exception e) {
                throw Exceptions.illegalStateException(e.toString(), e);
            }
        }
        return this.engineParams;
    }

    @Override // java.security.SignatureSpi
    public final void engineInitSign(PrivateKey privateKey) {
        signInit(privateKey, null);
        this.paramSpec = ContextParameterSpec.EMPTY_CONTEXT_SPEC;
        this.isInitState = true;
        reInit();
    }

    @Override // java.security.SignatureSpi
    public final void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) {
        signInit(privateKey, secureRandom);
        this.paramSpec = ContextParameterSpec.EMPTY_CONTEXT_SPEC;
        this.isInitState = true;
        reInit();
    }

    @Override // java.security.SignatureSpi
    public final void engineInitVerify(PublicKey publicKey) {
        verifyInit(publicKey);
        this.paramSpec = ContextParameterSpec.EMPTY_CONTEXT_SPEC;
        this.isInitState = true;
        reInit();
    }

    @Override // java.security.SignatureSpi
    public final void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("SetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec == null && (algorithmParameterSpec = this.originalSpec) == null) {
            return;
        }
        if (!this.isInitState) {
            throw new ProviderException("cannot call setParameter in the middle of update");
        }
        if (algorithmParameterSpec instanceof ContextParameterSpec) {
            this.paramSpec = (ContextParameterSpec) algorithmParameterSpec;
        } else {
            byte[] contextFrom = SpecUtil.getContextFrom(algorithmParameterSpec);
            if (contextFrom == null) {
                throw new InvalidAlgorithmParameterException("unknown AlgorithmParameterSpec in signature");
            }
            this.paramSpec = new ContextParameterSpec(contextFrom);
        }
        reInit();
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte b) {
        this.isInitState = false;
        updateEngine(b);
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) {
        this.isInitState = false;
        updateEngine(bArr, i, i2);
    }

    public abstract void reInitialize(boolean z, CipherParameters cipherParameters);

    public abstract void signInit(PrivateKey privateKey, SecureRandom secureRandom);

    public abstract void updateEngine(byte b);

    public abstract void updateEngine(byte[] bArr, int i, int i2);

    public abstract void verifyInit(PublicKey publicKey);
}
