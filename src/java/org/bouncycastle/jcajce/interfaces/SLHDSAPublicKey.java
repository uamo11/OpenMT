package org.bouncycastle.jcajce.interfaces;

import java.security.PublicKey;

/* loaded from: classes.dex */
public interface SLHDSAPublicKey extends PublicKey, SLHDSAKey {
    byte[] getPublicData();
}
