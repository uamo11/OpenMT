package org.bouncycastle.jcajce.interfaces;

import java.security.PrivateKey;

/* loaded from: classes.dex */
public interface SLHDSAPrivateKey extends PrivateKey, SLHDSAKey {
    SLHDSAPublicKey getPublicKey();
}
