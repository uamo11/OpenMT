package org.bouncycastle.jcajce.provider.asymmetric;

import java.util.HashMap;
import java.util.Map;
import l.C9045;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.CompositeIndex;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* loaded from: classes.dex */
public class CompositeSignatures {
    public static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.";
    public static final Map compositesAttributes;

    static {
        HashMap hashMap = new HashMap();
        compositesAttributes = hashMap;
        hashMap.put("SupportedKeyClasses", "org.bouncycastle.jcajce.CompositePublicKey|org.bouncycastle.jcajce.CompositePrivateKey");
        hashMap.put("SupportedKeyFormats", "PKCS#8|X.509");
    }

    /* loaded from: classes2.dex */
    public class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("Signature.COMPOSITE", "org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.SignatureSpi$COMPOSITE");
            for (ASN1ObjectIdentifier aSN1ObjectIdentifier : CompositeIndex.getSupportedIdentifiers()) {
                String algorithmName = CompositeIndex.getAlgorithmName(aSN1ObjectIdentifier);
                String replace = algorithmName.replace('-', '_');
                configurableProvider.addAlgorithm("Alg.Alias.KeyFactory", aSN1ObjectIdentifier, "COMPOSITE");
                configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.".concat(algorithmName), "COMPOSITE");
                configurableProvider.addAlgorithm("KeyPairGenerator.".concat(algorithmName), "org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.KeyPairGeneratorSpi$" + replace);
                configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator", aSN1ObjectIdentifier, algorithmName);
                configurableProvider.addAlgorithm("Signature.".concat(algorithmName), "org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.SignatureSpi$" + replace);
                configurableProvider.addAlgorithm("Alg.Alias.Signature", aSN1ObjectIdentifier, algorithmName);
                configurableProvider.addAlgorithm(C9045.m23341(new StringBuilder("Signature."), algorithmName, "-PREHASH"), "org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.SignatureSpi$" + replace + "_PREHASH");
                configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, new KeyFactorySpi());
            }
        }
    }
}
