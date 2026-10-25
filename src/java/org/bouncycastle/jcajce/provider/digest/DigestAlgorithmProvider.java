package org.bouncycastle.jcajce.provider.digest;

import l.C19462;
import l.C20094;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: classes.dex */
public abstract class DigestAlgorithmProvider extends AlgorithmProvider {
    public void addHMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String m46315 = C20094.m46315("HMAC", str);
        configurableProvider.addAlgorithm("Mac." + m46315, str2);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC-" + str, m46315);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC/" + str, m46315);
        configurableProvider.addAlgorithm("KeyGenerator." + m46315, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC-" + str, m46315);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC/" + str, m46315);
    }

    public void addHMACAlias(ConfigurableProvider configurableProvider, String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String m46315 = C20094.m46315("HMAC", str);
        configurableProvider.addAlgorithm("Alg.Alias.Mac." + aSN1ObjectIdentifier, m46315);
        C19462.m44861(new StringBuilder("Alg.Alias.KeyGenerator."), aSN1ObjectIdentifier, configurableProvider, m46315);
    }

    public void addKMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String m46315 = C20094.m46315("KMAC", str);
        configurableProvider.addAlgorithm("Mac." + m46315, str2);
        configurableProvider.addAlgorithm("KeyGenerator." + m46315, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.KMAC" + str, m46315);
    }
}
