package org.bouncycastle.x509;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.AccessDescription;
import org.bouncycastle.asn1.x509.AuthorityInformationAccess;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.NameConstraints;
import org.bouncycastle.asn1.x509.qualified.ETSIQCObjectIdentifiers;
import org.bouncycastle.asn1.x509.qualified.MonetaryValue;
import org.bouncycastle.asn1.x509.qualified.QCStatement;
import org.bouncycastle.asn1.x509.qualified.RFC3739QCObjectIdentifiers;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.filter.TrustedInput;
import org.bouncycastle.i18n.filter.UntrustedInput;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidator;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException;
import org.bouncycastle.util.Integers;

/* loaded from: classes2.dex */
public class PKIXCertPathReviewer extends CertPathValidatorUtilities {
    public static final int NAME_CHECK_MAX = 1024;
    public static final String RESOURCE_NAME = "org.bouncycastle.x509.CertPathReviewerMessages";
    public CertPath certPath;
    public List certs;
    public Date currentDate;
    public List[] errors;
    public boolean initialized;
    public int n;
    public List[] notifications;
    public PKIXParameters pkixParams;
    public PolicyNode policyTree;
    public PublicKey subjectPublicKey;
    public TrustAnchor trustAnchor;
    public Date validDate;
    public static final String QC_STATEMENT = Extension.qCStatements.getId();
    public static final String CRL_DIST_POINTS = Extension.cRLDistributionPoints.getId();
    public static final String AUTH_INFO_ACCESS = Extension.authorityInfoAccess.getId();

    public PKIXCertPathReviewer() {
    }

    public PKIXCertPathReviewer(CertPath certPath, PKIXParameters pKIXParameters) {
        init(certPath, pKIXParameters);
    }

    private String IPtoString(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr).getHostAddress();
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i != bArr.length; i++) {
                sb.append(Integer.toHexString(bArr[i] & 255));
                sb.append(' ');
            }
            return sb.toString();
        }
    }

    private void checkCriticalExtensions() {
        List<PKIXCertPathChecker> certPathCheckers = this.pkixParams.getCertPathCheckers();
        Iterator<PKIXCertPathChecker> it = certPathCheckers.iterator();
        while (it.hasNext()) {
            try {
                try {
                    it.next().init(false);
                } catch (CertPathValidatorException e) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.certPathCheckerError", new Object[]{e.getMessage(), e, e.getClass().getName()}), e);
                }
            } catch (CertPathReviewerException e2) {
                addError(e2.getErrorMessage(), e2.getIndex());
                return;
            }
        }
        for (int size = this.certs.size() - 1; size >= 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty()) {
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.KEY_USAGE);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_MAPPINGS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.INHIBIT_ANY_POLICY);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.DELTA_CRL_INDICATOR);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.BASIC_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.NAME_CONSTRAINTS);
                if (size == 0) {
                    criticalExtensionOIDs.remove(Extension.extendedKeyUsage.getId());
                }
                String str = QC_STATEMENT;
                if (criticalExtensionOIDs.contains(str) && processQcStatements(x509Certificate, size)) {
                    criticalExtensionOIDs.remove(str);
                }
                Iterator<PKIXCertPathChecker> it2 = certPathCheckers.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().check(x509Certificate, criticalExtensionOIDs);
                    } catch (CertPathValidatorException e3) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.criticalExtensionError", new Object[]{e3.getMessage(), e3, e3.getClass().getName()}), e3.getCause(), this.certPath, size);
                    }
                }
                if (!criticalExtensionOIDs.isEmpty()) {
                    Iterator<String> it3 = criticalExtensionOIDs.iterator();
                    while (it3.hasNext()) {
                        addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.unknownCriticalExt", new Object[]{new ASN1ObjectIdentifier(it3.next())}), size);
                    }
                }
            }
        }
    }

    private void checkNameConstraints() {
        PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
        try {
            for (int size = this.certs.size() - 1; size > 0; size--) {
                X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
                if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                    X500Principal subjectPrincipal = CertPathValidatorUtilities.getSubjectPrincipal(x509Certificate);
                    try {
                        ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(new ByteArrayInputStream(subjectPrincipal.getEncoded())).readObject();
                        try {
                            pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence);
                            try {
                                pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence);
                                try {
                                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                                    if (aSN1Sequence2 != null) {
                                        if (aSN1Sequence2.size() > 1024) {
                                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.subjAltNameExtError"), this.certPath, size);
                                        }
                                        for (int i = 0; i < aSN1Sequence2.size(); i++) {
                                            GeneralName generalName = GeneralName.getInstance(aSN1Sequence2.getObjectAt(i));
                                            try {
                                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                                pKIXNameConstraintValidator.checkExcluded(generalName);
                                            } catch (PKIXNameConstraintValidatorException e) {
                                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedEmail", new Object[]{new UntrustedInput(generalName)}), e, this.certPath, size);
                                            }
                                        }
                                    }
                                } catch (AnnotatedException e2) {
                                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.subjAltNameExtError"), e2, this.certPath, size);
                                }
                            } catch (PKIXNameConstraintValidatorException e3) {
                                throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.excludedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e3, this.certPath, size);
                            }
                        } catch (PKIXNameConstraintValidatorException e4) {
                            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.notPermittedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e4, this.certPath, size);
                        }
                    } catch (IOException e5) {
                        throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncSubjectNameError", new Object[]{new UntrustedInput(subjectPrincipal)}), e5, this.certPath, size);
                    }
                }
                try {
                    ASN1Sequence aSN1Sequence3 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.NAME_CONSTRAINTS);
                    if (aSN1Sequence3 != null) {
                        NameConstraints nameConstraints = NameConstraints.getInstance(aSN1Sequence3);
                        GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                        if (permittedSubtrees != null) {
                            pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                        }
                        GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                        if (excludedSubtrees != null) {
                            for (int i2 = 0; i2 != excludedSubtrees.length; i2++) {
                                pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i2]);
                            }
                        }
                    }
                } catch (AnnotatedException e6) {
                    throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.ncExtError"), e6, this.certPath, size);
                }
            }
        } catch (CertPathReviewerException e7) {
            addError(e7.getErrorMessage(), e7.getIndex());
        }
    }

    private void checkPathLength() {
        BasicConstraints basicConstraints;
        ASN1Integer pathLenConstraintInteger;
        int i = this.n;
        int i2 = 0;
        for (int size = this.certs.size() - 1; size > 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                if (i <= 0) {
                    addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.pathLengthExtended"));
                }
                i--;
                i2++;
            }
            try {
                basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
            } catch (AnnotatedException unused) {
                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.processLengthConstError"), size);
                basicConstraints = null;
            }
            if (basicConstraints != null && basicConstraints.isCA() && (pathLenConstraintInteger = basicConstraints.getPathLenConstraintInteger()) != null) {
                i = Math.min(i, pathLenConstraintInteger.intPositiveValueExact());
            }
        }
        addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.totalPathLength", new Object[]{Integers.valueOf(i2)}));
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x011f, code lost:
    
        if (r10 >= r34.n) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0125, code lost:
    
        if (org.bouncycastle.x509.CertPathValidatorUtilities.isSelfIssued(r14) == false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020b A[Catch: CertPathReviewerException -> 0x05e6, TryCatch #6 {CertPathReviewerException -> 0x05e6, blocks: (B:15:0x006c, B:19:0x007c, B:22:0x0089, B:26:0x0099, B:27:0x00a4, B:29:0x00aa, B:32:0x00cb, B:33:0x00d3, B:35:0x00d9, B:41:0x00de, B:42:0x00ea, B:48:0x00f6, B:51:0x00fd, B:52:0x0106, B:54:0x010c, B:57:0x0116, B:64:0x011d, B:66:0x0121, B:71:0x0205, B:73:0x020b, B:74:0x020e, B:76:0x0214, B:78:0x0220, B:85:0x0228, B:83:0x022b, B:89:0x022e, B:91:0x0234, B:92:0x023d, B:94:0x0243, B:103:0x0266, B:104:0x0272, B:105:0x0273, B:111:0x0277, B:113:0x027f, B:114:0x0283, B:116:0x0289, B:119:0x02ab, B:121:0x02b5, B:123:0x02ba, B:124:0x02c6, B:126:0x02c7, B:127:0x02d3, B:130:0x02d6, B:131:0x02e3, B:133:0x02e9, B:135:0x030f, B:137:0x0327, B:138:0x031e, B:141:0x032e, B:142:0x0334, B:144:0x033a, B:153:0x0342, B:148:0x036c, B:162:0x034a, B:163:0x0356, B:158:0x0358, B:159:0x0367, B:166:0x0379, B:175:0x0396, B:177:0x03a0, B:178:0x03a4, B:180:0x03aa, B:194:0x03ba, B:183:0x03c7, B:204:0x03d4, B:206:0x03de, B:109:0x041e, B:213:0x03ea, B:214:0x03f8, B:216:0x03f9, B:217:0x0407, B:224:0x0409, B:225:0x0417, B:226:0x0130, B:227:0x0134, B:229:0x013a, B:232:0x0150, B:234:0x015a, B:235:0x015f, B:237:0x0165, B:238:0x0173, B:240:0x0179, B:242:0x0185, B:243:0x0193, B:244:0x0199, B:246:0x019f, B:254:0x01b9, B:259:0x0189, B:261:0x018d, B:263:0x01ed, B:267:0x01f8, B:268:0x0204, B:274:0x042d, B:275:0x043a, B:277:0x043b, B:282:0x044c, B:284:0x0456, B:285:0x045a, B:287:0x0460, B:290:0x046d, B:304:0x047e, B:311:0x05cb, B:312:0x05d7, B:314:0x0489, B:315:0x0495, B:316:0x0496, B:318:0x049c, B:320:0x04a4, B:322:0x04aa, B:324:0x04b4, B:325:0x04b7, B:327:0x04bd, B:329:0x04cd, B:330:0x04d1, B:332:0x04d7, B:334:0x04df, B:337:0x04e2, B:339:0x04e5, B:340:0x04e9, B:342:0x04ef, B:344:0x04fd, B:346:0x0505, B:347:0x0508, B:349:0x050e, B:351:0x051a, B:353:0x051e, B:356:0x0521, B:358:0x0524, B:359:0x0530, B:361:0x0535, B:363:0x053f, B:364:0x0542, B:366:0x0548, B:368:0x0558, B:369:0x055c, B:371:0x0562, B:374:0x0572, B:379:0x0576, B:382:0x0579, B:384:0x057c, B:385:0x0582, B:387:0x0588, B:389:0x059a, B:395:0x05a4, B:396:0x05a6, B:398:0x05aa, B:399:0x05ad, B:401:0x05b3, B:403:0x05bf, B:405:0x05c3, B:409:0x05d9, B:410:0x05e5), top: B:14:0x006c, inners: #0, #1, #2, #3, #4, #5, #7, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0234 A[Catch: CertPathReviewerException -> 0x05e6, TryCatch #6 {CertPathReviewerException -> 0x05e6, blocks: (B:15:0x006c, B:19:0x007c, B:22:0x0089, B:26:0x0099, B:27:0x00a4, B:29:0x00aa, B:32:0x00cb, B:33:0x00d3, B:35:0x00d9, B:41:0x00de, B:42:0x00ea, B:48:0x00f6, B:51:0x00fd, B:52:0x0106, B:54:0x010c, B:57:0x0116, B:64:0x011d, B:66:0x0121, B:71:0x0205, B:73:0x020b, B:74:0x020e, B:76:0x0214, B:78:0x0220, B:85:0x0228, B:83:0x022b, B:89:0x022e, B:91:0x0234, B:92:0x023d, B:94:0x0243, B:103:0x0266, B:104:0x0272, B:105:0x0273, B:111:0x0277, B:113:0x027f, B:114:0x0283, B:116:0x0289, B:119:0x02ab, B:121:0x02b5, B:123:0x02ba, B:124:0x02c6, B:126:0x02c7, B:127:0x02d3, B:130:0x02d6, B:131:0x02e3, B:133:0x02e9, B:135:0x030f, B:137:0x0327, B:138:0x031e, B:141:0x032e, B:142:0x0334, B:144:0x033a, B:153:0x0342, B:148:0x036c, B:162:0x034a, B:163:0x0356, B:158:0x0358, B:159:0x0367, B:166:0x0379, B:175:0x0396, B:177:0x03a0, B:178:0x03a4, B:180:0x03aa, B:194:0x03ba, B:183:0x03c7, B:204:0x03d4, B:206:0x03de, B:109:0x041e, B:213:0x03ea, B:214:0x03f8, B:216:0x03f9, B:217:0x0407, B:224:0x0409, B:225:0x0417, B:226:0x0130, B:227:0x0134, B:229:0x013a, B:232:0x0150, B:234:0x015a, B:235:0x015f, B:237:0x0165, B:238:0x0173, B:240:0x0179, B:242:0x0185, B:243:0x0193, B:244:0x0199, B:246:0x019f, B:254:0x01b9, B:259:0x0189, B:261:0x018d, B:263:0x01ed, B:267:0x01f8, B:268:0x0204, B:274:0x042d, B:275:0x043a, B:277:0x043b, B:282:0x044c, B:284:0x0456, B:285:0x045a, B:287:0x0460, B:290:0x046d, B:304:0x047e, B:311:0x05cb, B:312:0x05d7, B:314:0x0489, B:315:0x0495, B:316:0x0496, B:318:0x049c, B:320:0x04a4, B:322:0x04aa, B:324:0x04b4, B:325:0x04b7, B:327:0x04bd, B:329:0x04cd, B:330:0x04d1, B:332:0x04d7, B:334:0x04df, B:337:0x04e2, B:339:0x04e5, B:340:0x04e9, B:342:0x04ef, B:344:0x04fd, B:346:0x0505, B:347:0x0508, B:349:0x050e, B:351:0x051a, B:353:0x051e, B:356:0x0521, B:358:0x0524, B:359:0x0530, B:361:0x0535, B:363:0x053f, B:364:0x0542, B:366:0x0548, B:368:0x0558, B:369:0x055c, B:371:0x0562, B:374:0x0572, B:379:0x0576, B:382:0x0579, B:384:0x057c, B:385:0x0582, B:387:0x0588, B:389:0x059a, B:395:0x05a4, B:396:0x05a6, B:398:0x05aa, B:399:0x05ad, B:401:0x05b3, B:403:0x05bf, B:405:0x05c3, B:409:0x05d9, B:410:0x05e5), top: B:14:0x006c, inners: #0, #1, #2, #3, #4, #5, #7, #8, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void checkPolicy() {
        /*
            Method dump skipped, instructions count: 1523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.checkPolicy():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:(2:90|91)|(4:(16:93|94|95|(12:97|98|(2:101|99)|102|103|(2:106|104)|107|108|109|110|111|112)|119|98|(1:99)|102|103|(1:104)|107|108|109|110|111|112)|110|111|112)|122|94|95|(0)|119|98|(1:99)|102|103|(1:104)|107|108|109) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:30|(2:138|139)(2:32|(2:129|130)(18:34|(2:38|(1:40))|41|42|43|44|(19:90|91|(16:93|94|95|(12:97|98|(2:101|99)|102|103|(2:106|104)|107|108|109|110|111|112)|119|98|(1:99)|102|103|(1:104)|107|108|109|110|111|112)|122|94|95|(0)|119|98|(1:99)|102|103|(1:104)|107|108|109|110|111|112)(1:46)|47|(1:51)|52|(7:54|(1:58)|59|60|(2:62|(1:64))(1:85)|65|(1:71))(1:89)|72|73|74|76|77|79|80))|131|132|42|43|44|(0)(0)|47|(2:49|51)|52|(0)(0)|72|73|74|76|77|79|80) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:90|91|(16:93|94|95|(12:97|98|(2:101|99)|102|103|(2:106|104)|107|108|109|110|111|112)|119|98|(1:99)|102|103|(1:104)|107|108|109|110|111|112)|122|94|95|(0)|119|98|(1:99)|102|103|(1:104)|107|108|109|110|111|112) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x032a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x032b, code lost:
    
        r18 = r7;
        r16 = r9;
        r20 = r14;
        r14 = r8;
        r17 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02b5, code lost:
    
        addError(new org.bouncycastle.i18n.ErrorBundle(org.bouncycastle.x509.PKIXCertPathReviewer.RESOURCE_NAME, "CertPathReviewer.crlAuthInfoAccError"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x025a, code lost:
    
        r3 = new java.lang.Object[1];
        r3[r11] = new org.bouncycastle.i18n.filter.TrustedInput(r7.getNotAfter());
        r0 = new org.bouncycastle.i18n.ErrorBundle(org.bouncycastle.x509.PKIXCertPathReviewer.RESOURCE_NAME, "CertPathReviewer.certificateExpired", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0285, code lost:
    
        addError(r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0270, code lost:
    
        r3 = new java.lang.Object[1];
        r3[r11] = new org.bouncycastle.i18n.filter.TrustedInput(r7.getNotBefore());
        r0 = new org.bouncycastle.i18n.ErrorBundle(org.bouncycastle.x509.PKIXCertPathReviewer.RESOURCE_NAME, "CertPathReviewer.certificateNotYetValid", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x03f1, code lost:
    
        addError(new org.bouncycastle.i18n.ErrorBundle(org.bouncycastle.x509.PKIXCertPathReviewer.RESOURCE_NAME, "CertPathReviewer.pubKeyError"), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x03ef, code lost:
    
        r14 = r20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02d2 A[LOOP:1: B:99:0x02cc->B:101:0x02d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f5 A[LOOP:2: B:104:0x02ef->B:106:0x02f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0290 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b0 A[Catch: AnnotatedException -> 0x02b5, TRY_LEAVE, TryCatch #18 {AnnotatedException -> 0x02b5, blocks: (B:95:0x02a8, B:97:0x02b0), top: B:94:0x02a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00f8  */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void checkSignatures() {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.checkSignatures():void");
    }

    private X509CRL getCRL(String str) {
        try {
            URL url = new URL(str);
            if (!url.getProtocol().equals(a.s) && !url.getProtocol().equals(b.a)) {
                return null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return (X509CRL) CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME).generateCRL(httpURLConnection.getInputStream());
            }
            throw new Exception(httpURLConnection.getResponseMessage());
        } catch (Exception e) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.loadCrlDistPointError", new Object[]{new UntrustedInput(str), e.getMessage(), e, e.getClass().getName()}));
        }
    }

    private boolean processQcStatements(X509Certificate x509Certificate, int i) {
        boolean z;
        ErrorBundle errorBundle;
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, QC_STATEMENT);
            boolean z2 = false;
            for (int i2 = 0; i2 < aSN1Sequence.size(); i2++) {
                QCStatement qCStatement = QCStatement.getInstance(aSN1Sequence.getObjectAt(i2));
                if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcCompliance.equals((ASN1Primitive) qCStatement.getStatementId())) {
                    errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcEuCompliance");
                } else {
                    if (!RFC3739QCObjectIdentifiers.id_qcs_pkixQCSyntax_v1.equals((ASN1Primitive) qCStatement.getStatementId())) {
                        if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcSSCD.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            errorBundle = new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcSSCD");
                        } else if (ETSIQCObjectIdentifiers.id_etsi_qcs_LimiteValue.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            MonetaryValue monetaryValue = MonetaryValue.getInstance(qCStatement.getStatementInfo());
                            monetaryValue.getCurrency();
                            z = false;
                            try {
                                double doubleValue = monetaryValue.getAmount().doubleValue() * Math.pow(10.0d, monetaryValue.getExponent().doubleValue());
                                addNotification(monetaryValue.getCurrency().isAlphabetic() ? new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueAlpha", new Object[]{monetaryValue.getCurrency().getAlphabetic(), new TrustedInput(new Double(doubleValue)), monetaryValue}) : new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcLimitValueNum", new Object[]{Integers.valueOf(monetaryValue.getCurrency().getNumeric()), new TrustedInput(new Double(doubleValue)), monetaryValue}), i);
                            } catch (AnnotatedException unused) {
                                addError(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcStatementExtError"), i);
                                return z;
                            }
                        } else {
                            addNotification(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.QcUnknownStatement", new Object[]{qCStatement.getStatementId(), new UntrustedInput(qCStatement)}), i);
                            z2 = true;
                        }
                    }
                }
                addNotification(errorBundle, i);
            }
            return !z2;
        } catch (AnnotatedException unused2) {
            z = false;
        }
    }

    public void addError(ErrorBundle errorBundle) {
        this.errors[0].add(errorBundle);
    }

    public void addError(ErrorBundle errorBundle, int i) {
        if (i < -1 || i >= this.n) {
            throw new IndexOutOfBoundsException();
        }
        this.errors[i + 1].add(errorBundle);
    }

    public void addNotification(ErrorBundle errorBundle) {
        this.notifications[0].add(errorBundle);
    }

    public void addNotification(ErrorBundle errorBundle, int i) {
        if (i < -1 || i >= this.n) {
            throw new IndexOutOfBoundsException();
        }
        this.notifications[i + 1].add(errorBundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x042d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void checkCRLs(java.security.cert.PKIXParameters r21, java.security.cert.X509Certificate r22, java.util.Date r23, java.security.cert.X509Certificate r24, java.security.PublicKey r25, java.util.Vector r26, int r27) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.PKIXCertPathReviewer.checkCRLs(java.security.cert.PKIXParameters, java.security.cert.X509Certificate, java.util.Date, java.security.cert.X509Certificate, java.security.PublicKey, java.util.Vector, int):void");
    }

    public void checkRevocation(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, Vector vector2, int i) {
        checkCRLs(pKIXParameters, x509Certificate, date, x509Certificate2, publicKey, vector, i);
    }

    public void doChecks() {
        if (!this.initialized) {
            throw new IllegalStateException("Object not initialized. Call init() first.");
        }
        if (this.notifications != null) {
            return;
        }
        int i = this.n;
        this.notifications = new List[i + 1];
        this.errors = new List[i + 1];
        int i2 = 0;
        while (true) {
            List[] listArr = this.notifications;
            if (i2 >= listArr.length) {
                checkSignatures();
                checkNameConstraints();
                checkPathLength();
                checkPolicy();
                checkCriticalExtensions();
                return;
            }
            listArr[i2] = new ArrayList();
            this.errors[i2] = new ArrayList();
            i2++;
        }
    }

    public Vector getCRLDistUrls(CRLDistPoint cRLDistPoint) {
        Vector vector = new Vector();
        if (cRLDistPoint != null) {
            for (DistributionPoint distributionPoint : cRLDistPoint.getDistributionPoints()) {
                DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2.getType() == 0) {
                    GeneralName[] names = GeneralNames.getInstance(distributionPoint2.getName()).getNames();
                    for (int i = 0; i < names.length; i++) {
                        if (names[i].getTagNo() == 6) {
                            vector.add(((ASN1IA5String) names[i].getName()).getString());
                        }
                    }
                }
            }
        }
        return vector;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getCertPathSize() {
        return this.n;
    }

    public List getErrors(int i) {
        doChecks();
        return this.errors[i + 1];
    }

    public List[] getErrors() {
        doChecks();
        return this.errors;
    }

    public List getNotifications(int i) {
        doChecks();
        return this.notifications[i + 1];
    }

    public List[] getNotifications() {
        doChecks();
        return this.notifications;
    }

    public Vector getOCSPUrls(AuthorityInformationAccess authorityInformationAccess) {
        Vector vector = new Vector();
        if (authorityInformationAccess != null) {
            AccessDescription[] accessDescriptions = authorityInformationAccess.getAccessDescriptions();
            for (int i = 0; i < accessDescriptions.length; i++) {
                if (accessDescriptions[i].getAccessMethod().equals((ASN1Primitive) AccessDescription.id_ad_ocsp)) {
                    GeneralName accessLocation = accessDescriptions[i].getAccessLocation();
                    if (accessLocation.getTagNo() == 6) {
                        vector.add(((ASN1IA5String) accessLocation.getName()).getString());
                    }
                }
            }
        }
        return vector;
    }

    public PolicyNode getPolicyTree() {
        doChecks();
        return this.policyTree;
    }

    public PublicKey getSubjectPublicKey() {
        doChecks();
        return this.subjectPublicKey;
    }

    public TrustAnchor getTrustAnchor() {
        doChecks();
        return this.trustAnchor;
    }

    public Collection getTrustAnchors(X509Certificate x509Certificate, Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            byte[] extensionValue = x509Certificate.getExtensionValue(Extension.authorityKeyIdentifier.getId());
            if (extensionValue != null) {
                AuthorityKeyIdentifier authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1OctetString.getInstance(extensionValue).getOctets());
                if (authorityKeyIdentifier.getAuthorityCertSerialNumber() != null) {
                    x509CertSelector.setSerialNumber(authorityKeyIdentifier.getAuthorityCertSerialNumber());
                } else {
                    ASN1OctetString keyIdentifierObject = authorityKeyIdentifier.getKeyIdentifierObject();
                    if (keyIdentifierObject != null) {
                        x509CertSelector.setSubjectKeyIdentifier(keyIdentifierObject.getEncoded(ASN1Encoding.DER));
                    }
                }
            }
            while (it.hasNext()) {
                TrustAnchor trustAnchor = (TrustAnchor) it.next();
                if (trustAnchor.getTrustedCert() != null) {
                    if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                        arrayList.add(trustAnchor);
                    }
                } else if (trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null && CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).equals(new X500Principal(trustAnchor.getCAName()))) {
                    arrayList.add(trustAnchor);
                }
            }
            return arrayList;
        } catch (IOException unused) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.trustAnchorIssuerError"));
        }
    }

    public void init(CertPath certPath, PKIXParameters pKIXParameters) {
        if (this.initialized) {
            throw new IllegalStateException("object is already initialized!");
        }
        this.initialized = true;
        if (certPath == null) {
            throw new NullPointerException("certPath was null");
        }
        List<? extends Certificate> certificates = certPath.getCertificates();
        if (certificates.size() != 1) {
            HashSet hashSet = new HashSet();
            Iterator<TrustAnchor> it = pKIXParameters.getTrustAnchors().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getTrustedCert());
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != certificates.size(); i++) {
                if (!hashSet.contains(certificates.get(i))) {
                    arrayList.add(certificates.get(i));
                }
            }
            try {
                this.certPath = CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME).generateCertPath(arrayList);
                this.certs = arrayList;
            } catch (GeneralSecurityException unused) {
                throw new IllegalStateException("unable to rebuild certpath");
            }
        } else {
            this.certPath = certPath;
            this.certs = certPath.getCertificates();
        }
        this.n = this.certs.size();
        if (this.certs.isEmpty()) {
            throw new CertPathReviewerException(new ErrorBundle(RESOURCE_NAME, "CertPathReviewer.emptyCertPath"));
        }
        this.pkixParams = (PKIXParameters) pKIXParameters.clone();
        Date date = new Date();
        this.currentDate = date;
        this.validDate = CertPathValidatorUtilities.getValidityDate(this.pkixParams, date);
        this.notifications = null;
        this.errors = null;
        this.trustAnchor = null;
        this.subjectPublicKey = null;
        this.policyTree = null;
    }

    public boolean isValidCertPath() {
        doChecks();
        int i = 0;
        while (true) {
            List[] listArr = this.errors;
            if (i >= listArr.length) {
                return true;
            }
            if (!listArr[i].isEmpty()) {
                return false;
            }
            i++;
        }
    }
}
