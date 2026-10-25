package org.bouncycastle.crypto.agreement.ecjpake;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECPoint;

/* loaded from: classes.dex */
public class ECSchnorrZKP {
    public final ECPoint V;
    public final BigInteger r;

    public ECSchnorrZKP(ECPoint eCPoint, BigInteger bigInteger) {
        this.V = eCPoint;
        this.r = bigInteger;
    }

    public ECPoint getV() {
        return this.V;
    }

    public BigInteger getr() {
        return this.r;
    }
}
