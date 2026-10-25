package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes2.dex */
public class SNTRUPrimeKeyParameters extends AsymmetricKeyParameter {
    public final SNTRUPrimeParameters params;

    public SNTRUPrimeKeyParameters(boolean z, SNTRUPrimeParameters sNTRUPrimeParameters) {
        super(z);
        this.params = sNTRUPrimeParameters;
    }

    public SNTRUPrimeParameters getParameters() {
        return this.params;
    }
}
