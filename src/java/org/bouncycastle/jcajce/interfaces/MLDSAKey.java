package org.bouncycastle.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.jcajce.spec.MLDSAParameterSpec;

/* loaded from: classes.dex */
public interface MLDSAKey extends Key {
    MLDSAParameterSpec getParameterSpec();
}
