package l;

import javax.crypto.spec.GCMParameterSpec;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;

/* compiled from: G9IQ */
/* renamed from: l.ܶ۟ۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C15078 extends AbstractC4496 {
    @Override // l.AbstractC4496
    /* renamed from: ֫ */
    public final AEADParameters mo13244(byte[] bArr, GCMParameterSpec gCMParameterSpec) {
        return new AEADParameters(new KeyParameter(bArr), gCMParameterSpec.getTLen(), gCMParameterSpec.getIV());
    }
}
