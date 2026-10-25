package l;

import java.security.NoSuchAlgorithmException;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* compiled from: 37ZK */
/* renamed from: l.۬ۡۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13004 implements InterfaceC15847 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f38930;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f38931;

    @Override // l.InterfaceC15847
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] mo31574() {
        return this.f38930;
    }

    @Override // l.InterfaceC15847
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] mo31573() {
        return this.f38931;
    }

    @Override // l.InterfaceC15847
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo31572(String str, byte[] bArr) {
        if (!str.equals(EdDSAParameterSpec.Ed25519) && !str.equals(EdDSAParameterSpec.Ed448)) {
            throw new NoSuchAlgorithmException("invalid curve ".concat(str));
        }
        if (str.equals(EdDSAParameterSpec.Ed25519)) {
            Ed25519PrivateKeyParameters ed25519PrivateKeyParameters = new Ed25519PrivateKeyParameters(bArr);
            this.f38931 = ed25519PrivateKeyParameters.generatePublicKey().getEncoded();
            this.f38930 = ed25519PrivateKeyParameters.getEncoded();
        } else {
            Ed448PrivateKeyParameters ed448PrivateKeyParameters = new Ed448PrivateKeyParameters(bArr);
            this.f38931 = ed448PrivateKeyParameters.generatePublicKey().getEncoded();
            this.f38930 = ed448PrivateKeyParameters.getEncoded();
        }
        int length = this.f38930.length;
    }
}
