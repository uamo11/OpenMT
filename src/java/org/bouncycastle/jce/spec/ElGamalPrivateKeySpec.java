package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes.dex */
public class ElGamalPrivateKeySpec extends ElGamalKeySpec {
    public BigInteger x;

    public ElGamalPrivateKeySpec(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.x = bigInteger;
    }

    public BigInteger getX() {
        return this.x;
    }
}
