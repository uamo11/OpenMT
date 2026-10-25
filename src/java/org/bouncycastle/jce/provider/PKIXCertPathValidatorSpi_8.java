package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.jcajce.PKIXCertRevocationChecker;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.interfaces.BCX509Certificate;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.x509.ExtendedPKIXParameters;

/* loaded from: classes.dex */
public class PKIXCertPathValidatorSpi_8 extends CertPathValidatorSpi {
    public final JcaJceHelper helper;
    public final boolean isForCRLCheck;

    public PKIXCertPathValidatorSpi_8() {
        this(false);
    }

    public PKIXCertPathValidatorSpi_8(boolean z) {
        this.helper = new BCJcaJceHelper();
        this.isForCRLCheck = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void checkCertificate(X509Certificate x509Certificate) {
        if (x509Certificate instanceof BCX509Certificate) {
            try {
            } catch (RuntimeException e) {
                e = e;
            }
            if (((BCX509Certificate) x509Certificate).getTBSCertificateNative() != null) {
                return;
            }
            e = null;
            throw new AnnotatedException("unable to process TBSCertificate", e);
        }
        try {
            TBSCertificate.getInstance(x509Certificate.getTBSCertificate());
        } catch (IllegalArgumentException e2) {
            throw new AnnotatedException(e2.getMessage());
        } catch (CertificateEncodingException e3) {
            throw new AnnotatedException("unable to process TBSCertificate", e3);
        }
    }

    @Override // java.security.cert.CertPathValidatorSpi
    public PKIXCertPathChecker engineGetRevocationChecker() {
        return new ProvRevocationChecker(this.helper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) {
        PKIXExtendedParameters pKIXExtendedParameters;
        List<? extends Certificate> list;
        X500Name ca;
        PublicKey cAPublicKey;
        HashSet hashSet;
        int i;
        int i2;
        ArrayList[] arrayListArr;
        ArrayList arrayList;
        HashSet hashSet2;
        if (certPathParameters instanceof PKIXParameters) {
            PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder((PKIXParameters) certPathParameters);
            if (certPathParameters instanceof ExtendedPKIXParameters) {
                ExtendedPKIXParameters extendedPKIXParameters = (ExtendedPKIXParameters) certPathParameters;
                builder.setUseDeltasEnabled(extendedPKIXParameters.isUseDeltasEnabled());
                builder.setValidityModel(extendedPKIXParameters.getValidityModel());
            }
            pKIXExtendedParameters = builder.build();
        } else if (certPathParameters instanceof PKIXExtendedBuilderParameters) {
            pKIXExtendedParameters = ((PKIXExtendedBuilderParameters) certPathParameters).getBaseParameters();
        } else {
            if (!(certPathParameters instanceof PKIXExtendedParameters)) {
                throw new InvalidAlgorithmParameterException("Parameters must be a " + PKIXParameters.class.getName() + " instance.");
            }
            pKIXExtendedParameters = (PKIXExtendedParameters) certPathParameters;
        }
        if (pKIXExtendedParameters.getTrustAnchors() == null) {
            throw new InvalidAlgorithmParameterException("trustAnchors is null, this is not allowed for certification path validation.");
        }
        List<? extends Certificate> certificates = certPath.getCertificates();
        int size = certificates.size();
        if (certificates.isEmpty()) {
            throw new CertPathValidatorException("Certification path is empty.", null, certPath, -1);
        }
        Date validityDate = CertPathValidatorUtilities.getValidityDate(pKIXExtendedParameters, new Date());
        Set initialPolicies = pKIXExtendedParameters.getInitialPolicies();
        try {
            TrustAnchor findTrustAnchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate) certificates.get(certificates.size() - 1), pKIXExtendedParameters.getTrustAnchors(), pKIXExtendedParameters.getSigProvider());
            if (findTrustAnchor == null) {
                list = certificates;
                try {
                    throw new CertPathValidatorException("Trust anchor for certification path not found.", null, certPath, -1);
                } catch (AnnotatedException e) {
                    e = e;
                    throw new CertPathValidatorException(e.getMessage(), e.getUnderlyingException(), certPath, list.size() - 1);
                }
            }
            checkCertificate(findTrustAnchor.getTrustedCert());
            PKIXExtendedParameters build = new PKIXExtendedParameters.Builder(pKIXExtendedParameters).setTrustAnchor(findTrustAnchor).build();
            ArrayList arrayList2 = new ArrayList();
            PKIXCertRevocationChecker pKIXCertRevocationChecker = null;
            for (PKIXCertPathChecker pKIXCertPathChecker : build.getCertPathCheckers()) {
                pKIXCertPathChecker.init(false);
                if (!(pKIXCertPathChecker instanceof PKIXRevocationChecker)) {
                    arrayList2.add(pKIXCertPathChecker);
                } else {
                    if (pKIXCertRevocationChecker != null) {
                        throw new CertPathValidatorException("only one PKIXRevocationChecker allowed");
                    }
                    pKIXCertRevocationChecker = pKIXCertPathChecker instanceof PKIXCertRevocationChecker ? (PKIXCertRevocationChecker) pKIXCertPathChecker : new WrappedRevocationChecker(pKIXCertPathChecker);
                }
            }
            if (build.isRevocationEnabled() && pKIXCertRevocationChecker == null) {
                pKIXCertRevocationChecker = new ProvRevocationChecker(this.helper);
            }
            PKIXCertRevocationChecker pKIXCertRevocationChecker2 = pKIXCertRevocationChecker;
            int i3 = size + 1;
            ArrayList[] arrayListArr2 = new ArrayList[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                arrayListArr2[i4] = new ArrayList();
            }
            HashSet hashSet3 = new HashSet();
            hashSet3.add("2.5.29.32.0");
            PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), "2.5.29.32.0", false);
            arrayListArr2[0].add(pKIXPolicyNode);
            PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
            HashSet hashSet4 = new HashSet();
            int i5 = build.isExplicitPolicyRequired() ? 0 : i3;
            int i6 = build.isAnyPolicyInhibited() ? 0 : i3;
            if (build.isPolicyMappingInhibited()) {
                i3 = 0;
            }
            X509Certificate trustedCert = findTrustAnchor.getTrustedCert();
            try {
                if (trustedCert != null) {
                    ca = PrincipalUtils.getSubjectPrincipal(trustedCert);
                    cAPublicKey = trustedCert.getPublicKey();
                } else {
                    ca = PrincipalUtils.getCA(findTrustAnchor);
                    cAPublicKey = findTrustAnchor.getCAPublicKey();
                }
                try {
                    AlgorithmIdentifier algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(cAPublicKey);
                    algorithmIdentifier.getAlgorithm();
                    algorithmIdentifier.getParameters();
                    int i7 = i3;
                    if (build.getTargetConstraints() != null && !build.getTargetConstraints().match((Certificate) certificates.get(0))) {
                        throw new ExtCertPathValidatorException("Target certificate in certification path does not match targetConstraints.", null, certPath, 0);
                    }
                    PublicKey publicKey = cAPublicKey;
                    X500Name x500Name = ca;
                    X509Certificate x509Certificate = trustedCert;
                    PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
                    int i8 = i5;
                    X509Certificate x509Certificate2 = null;
                    int i9 = i7;
                    int i10 = size;
                    int i11 = i6;
                    int size2 = certificates.size() - 1;
                    int i12 = i11;
                    while (size2 >= 0) {
                        int i13 = size - size2;
                        int i14 = i10;
                        X509Certificate x509Certificate3 = (X509Certificate) certificates.get(size2);
                        int i15 = i12;
                        boolean z = size2 == certificates.size() + (-1);
                        try {
                            checkCertificate(x509Certificate3);
                            List<? extends Certificate> list2 = certificates;
                            PKIXExtendedParameters pKIXExtendedParameters2 = build;
                            PKIXExtendedParameters pKIXExtendedParameters3 = build;
                            int i16 = i8;
                            Date date = validityDate;
                            Date date2 = validityDate;
                            int i17 = i9;
                            int i18 = size2;
                            PKIXNameConstraintValidator pKIXNameConstraintValidator2 = pKIXNameConstraintValidator;
                            ArrayList[] arrayListArr3 = arrayListArr2;
                            ArrayList arrayList3 = arrayList2;
                            TrustAnchor trustAnchor = findTrustAnchor;
                            RFC3280CertPathUtilities.processCertA(certPath, pKIXExtendedParameters2, date, pKIXCertRevocationChecker2, size2, publicKey, z, x500Name, x509Certificate);
                            RFC3280CertPathUtilities.processCertBC(certPath, i18, pKIXNameConstraintValidator2, this.isForCRLCheck);
                            PKIXPolicyNode processCertE = RFC3280CertPathUtilities.processCertE(certPath, i18, RFC3280CertPathUtilities.processCertD(certPath, i18, hashSet4, pKIXPolicyNode2, arrayListArr3, i15, this.isForCRLCheck));
                            RFC3280CertPathUtilities.processCertF(certPath, i18, processCertE, i16);
                            if (i13 != size) {
                                if (x509Certificate3 == null || x509Certificate3.getVersion() != 1) {
                                    RFC3280CertPathUtilities.prepareNextCertA(certPath, i18);
                                    arrayListArr = arrayListArr3;
                                    PKIXPolicyNode prepareCertB = RFC3280CertPathUtilities.prepareCertB(certPath, i18, arrayListArr, processCertE, i17);
                                    RFC3280CertPathUtilities.prepareNextCertG(certPath, i18, pKIXNameConstraintValidator2);
                                    int prepareNextCertH1 = RFC3280CertPathUtilities.prepareNextCertH1(certPath, i18, i16);
                                    int prepareNextCertH2 = RFC3280CertPathUtilities.prepareNextCertH2(certPath, i18, i17);
                                    int prepareNextCertH3 = RFC3280CertPathUtilities.prepareNextCertH3(certPath, i18, i15);
                                    i16 = RFC3280CertPathUtilities.prepareNextCertI1(certPath, i18, prepareNextCertH1);
                                    i2 = RFC3280CertPathUtilities.prepareNextCertI2(certPath, i18, prepareNextCertH2);
                                    int prepareNextCertJ = RFC3280CertPathUtilities.prepareNextCertJ(certPath, i18, prepareNextCertH3);
                                    RFC3280CertPathUtilities.prepareNextCertK(certPath, i18);
                                    i = RFC3280CertPathUtilities.prepareNextCertM(certPath, i18, RFC3280CertPathUtilities.prepareNextCertL(certPath, i18, i14));
                                    RFC3280CertPathUtilities.prepareNextCertN(certPath, i18);
                                    Set<String> criticalExtensionOIDs = x509Certificate3.getCriticalExtensionOIDs();
                                    if (criticalExtensionOIDs != null) {
                                        hashSet2 = new HashSet(criticalExtensionOIDs);
                                        hashSet2.remove(RFC3280CertPathUtilities.KEY_USAGE);
                                        hashSet2.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                                        hashSet2.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                                        hashSet2.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                                        hashSet2.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                                        hashSet2.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                                        hashSet2.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                                        hashSet2.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                                        hashSet2.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                                        hashSet2.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                                    } else {
                                        hashSet2 = new HashSet();
                                    }
                                    arrayList = arrayList3;
                                    RFC3280CertPathUtilities.prepareNextCertO(certPath, i18, hashSet2, arrayList);
                                    X500Name subjectPrincipal = PrincipalUtils.getSubjectPrincipal(x509Certificate3);
                                    try {
                                        PublicKey nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(certPath.getCertificates(), i18, this.helper);
                                        AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                                        algorithmIdentifier2.getAlgorithm();
                                        algorithmIdentifier2.getParameters();
                                        pKIXPolicyNode2 = prepareCertB;
                                        i12 = prepareNextCertJ;
                                        x500Name = subjectPrincipal;
                                        publicKey = nextWorkingKey;
                                        x509Certificate = x509Certificate3;
                                        i8 = i16;
                                        int i19 = i;
                                        i9 = i2;
                                        arrayListArr2 = arrayListArr;
                                        arrayList2 = arrayList;
                                        pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                        findTrustAnchor = trustAnchor;
                                        certificates = list2;
                                        validityDate = date2;
                                        size2 = i18 - 1;
                                        x509Certificate2 = x509Certificate3;
                                        i10 = i19;
                                        build = pKIXExtendedParameters3;
                                    } catch (CertPathValidatorException e2) {
                                        throw new CertPathValidatorException("Next working key could not be retrieved.", e2, certPath, i18);
                                    }
                                } else if (i13 != 1 || !x509Certificate3.equals(trustAnchor.getTrustedCert())) {
                                    throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath, i18);
                                }
                            }
                            i = i14;
                            i2 = i17;
                            arrayListArr = arrayListArr3;
                            arrayList = arrayList3;
                            pKIXPolicyNode2 = processCertE;
                            i12 = i15;
                            i8 = i16;
                            int i192 = i;
                            i9 = i2;
                            arrayListArr2 = arrayListArr;
                            arrayList2 = arrayList;
                            pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                            findTrustAnchor = trustAnchor;
                            certificates = list2;
                            validityDate = date2;
                            size2 = i18 - 1;
                            x509Certificate2 = x509Certificate3;
                            i10 = i192;
                            build = pKIXExtendedParameters3;
                        } catch (AnnotatedException e3) {
                            throw new CertPathValidatorException(e3.getMessage(), e3.getUnderlyingException(), certPath, size2);
                        }
                    }
                    PKIXExtendedParameters pKIXExtendedParameters4 = build;
                    ArrayList arrayList4 = arrayList2;
                    TrustAnchor trustAnchor2 = findTrustAnchor;
                    int i20 = size2;
                    ArrayList[] arrayListArr4 = arrayListArr2;
                    int i21 = i20 + 1;
                    int wrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath, i21, RFC3280CertPathUtilities.wrapupCertA(i8, x509Certificate2));
                    Set<String> criticalExtensionOIDs2 = x509Certificate2.getCriticalExtensionOIDs();
                    if (criticalExtensionOIDs2 != null) {
                        hashSet = new HashSet(criticalExtensionOIDs2);
                        hashSet.remove(RFC3280CertPathUtilities.KEY_USAGE);
                        hashSet.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                        hashSet.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                        hashSet.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                        hashSet.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                        hashSet.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                        hashSet.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                        hashSet.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                        hashSet.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                        hashSet.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                        hashSet.remove(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS);
                        hashSet.remove(Extension.extendedKeyUsage.getId());
                    } else {
                        hashSet = new HashSet();
                    }
                    RFC3280CertPathUtilities.wrapupCertF(certPath, i21, arrayList4, hashSet);
                    X509Certificate x509Certificate4 = x509Certificate2;
                    PKIXPolicyNode wrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath, pKIXExtendedParameters4, initialPolicies, i21, arrayListArr4, pKIXPolicyNode2, hashSet4);
                    if (wrapupCertB > 0 || wrapupCertG != null) {
                        return new PKIXCertPathValidatorResult(trustAnchor2, wrapupCertG, x509Certificate4.getPublicKey());
                    }
                    throw new CertPathValidatorException("Path processing failed on policy.", null, certPath, i20);
                } catch (CertPathValidatorException e4) {
                    throw new ExtCertPathValidatorException("Algorithm identifier of public key of trust anchor could not be read.", e4, certPath, -1);
                }
            } catch (RuntimeException e5) {
                throw new ExtCertPathValidatorException("Subject of trust anchor could not be (re)encoded.", e5, certPath, -1);
            }
        } catch (AnnotatedException e6) {
            e = e6;
            list = certificates;
        }
    }
}
