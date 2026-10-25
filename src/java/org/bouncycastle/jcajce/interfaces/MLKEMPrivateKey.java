package org.bouncycastle.jcajce.interfaces;

import java.security.PrivateKey;

/* loaded from: classes.dex */
public interface MLKEMPrivateKey extends PrivateKey, MLKEMKey {
    byte[] getPrivateData();

    MLKEMPrivateKey getPrivateKey(boolean z);

    MLKEMPublicKey getPublicKey();

    byte[] getSeed();
}
