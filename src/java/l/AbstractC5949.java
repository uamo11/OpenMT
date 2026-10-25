package l;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMExtractor;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMKeyPairGenerator;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMPublicKeyParameters;

/* compiled from: G7YC */
/* renamed from: l.ۛۡۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC5949 implements InterfaceC10910 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public MLKEMExtractor f18246;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public MLKEMParameters f18247;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public MLKEMPublicKeyParameters f18248;

    @Override // l.InterfaceC10910
    public void init() {
        MLKEMKeyPairGenerator mLKEMKeyPairGenerator = new MLKEMKeyPairGenerator();
        mLKEMKeyPairGenerator.init(new MLKEMKeyGenerationParameters(new SecureRandom(), this.f18247));
        AsymmetricCipherKeyPair generateKeyPair = mLKEMKeyPairGenerator.generateKeyPair();
        this.f18246 = new MLKEMExtractor((MLKEMPrivateKeyParameters) generateKeyPair.getPrivate());
        this.f18248 = (MLKEMPublicKeyParameters) generateKeyPair.getPublic();
    }
}
