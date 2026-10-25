package l;

import java.util.Arrays;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;

/* compiled from: E7WQ */
/* renamed from: l.᩷ۢۘ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20788 extends AbstractC8793 {
    @Override // l.AbstractC8793
    /* renamed from: ܳ */
    public final String mo22693() {
        return EdDSAParameterSpec.Ed25519;
    }

    @Override // l.AbstractC17965
    /* renamed from: ܽ */
    public final int mo24336() {
        return 32;
    }

    @Override // l.AbstractC8793
    /* renamed from: ᩻ */
    public final String mo22694() {
        return OpenSSHPublicKeyUtil.ED_25519;
    }

    public C20788(C22529 c22529) {
        super(c22529, null, null);
    }

    public C20788(C22529 c22529, byte[] bArr) {
        super(c22529, bArr, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC17965 m47588(C22529 c22529, C16261 c16261) {
        byte[][] m38239 = c16261.m38239(4, "invalid key format");
        C20788 c20788 = new C20788(c22529, m38239[1], Arrays.copyOf(m38239[2], 32));
        c20788.f56025 = C19356.m44588(m38239[3]);
        c20788.f56026 = 0;
        return c20788;
    }
}
