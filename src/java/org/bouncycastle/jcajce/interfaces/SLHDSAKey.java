package org.bouncycastle.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.jcajce.spec.SLHDSAParameterSpec;

/* loaded from: classes.dex */
public interface SLHDSAKey extends Key {
    SLHDSAParameterSpec getParameterSpec();
}
