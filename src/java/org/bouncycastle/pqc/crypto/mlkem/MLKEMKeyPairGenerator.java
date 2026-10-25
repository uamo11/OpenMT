package org.bouncycastle.pqc.crypto.mlkem;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes2.dex */
public class MLKEMKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    public MLKEMParameters mlkemParams;
    public SecureRandom random;

    private AsymmetricCipherKeyPair genKeyPair() {
        MLKEMEngine engine = this.mlkemParams.getEngine();
        engine.init(this.random);
        byte[][] generateKemKeyPair = engine.generateKemKeyPair();
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new MLKEMPublicKeyParameters(this.mlkemParams, generateKemKeyPair[0], generateKemKeyPair[1]), (AsymmetricKeyParameter) new MLKEMPrivateKeyParameters(this.mlkemParams, generateKemKeyPair[2], generateKemKeyPair[3], generateKemKeyPair[4], generateKemKeyPair[0], generateKemKeyPair[1], generateKemKeyPair[5]));
    }

    private void initialize(KeyGenerationParameters keyGenerationParameters) {
        this.mlkemParams = ((MLKEMKeyGenerationParameters) keyGenerationParameters).getParameters();
        this.random = keyGenerationParameters.getRandom();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }
}
