package org.bouncycastle.jcajce.interfaces;

import java.security.PublicKey;

/* loaded from: classes.dex */
public interface MLDSAPublicKey extends PublicKey, MLDSAKey {
    byte[] getPublicData();
}
