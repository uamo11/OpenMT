package org.bouncycastle.jcajce;

import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertStore;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.util.Collection;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Selector;

/* loaded from: classes.dex */
public class PKIXCRLStoreSelector implements Selector {
    public final CRLSelector baseSelector;
    public final boolean completeCRLEnabled;
    public final boolean deltaCRLIndicator;
    public final byte[] issuingDistributionPoint;
    public final boolean issuingDistributionPointEnabled;
    public final BigInteger maxBaseCRLNumber;

    public class Builder {
        public final CRLSelector baseSelector;
        public boolean deltaCRLIndicator = false;
        public boolean completeCRLEnabled = false;
        public BigInteger maxBaseCRLNumber = null;
        public byte[] issuingDistributionPoint = null;
        public boolean issuingDistributionPointEnabled = false;

        public Builder(CRLSelector cRLSelector) {
            this.baseSelector = (CRLSelector) cRLSelector.clone();
        }

        public PKIXCRLStoreSelector build() {
            return new PKIXCRLStoreSelector(this);
        }

        public Builder setCompleteCRLEnabled(boolean z) {
            this.completeCRLEnabled = z;
            return this;
        }

        public Builder setDeltaCRLIndicatorEnabled(boolean z) {
            this.deltaCRLIndicator = z;
            return this;
        }

        public void setIssuingDistributionPoint(byte[] bArr) {
            this.issuingDistributionPoint = Arrays.clone(bArr);
        }

        public void setIssuingDistributionPointEnabled(boolean z) {
            this.issuingDistributionPointEnabled = z;
        }

        public void setMaxBaseCRLNumber(BigInteger bigInteger) {
            this.maxBaseCRLNumber = bigInteger;
        }
    }

    public class SelectorClone extends X509CRLSelector {
        public final PKIXCRLStoreSelector selector;

        public SelectorClone(PKIXCRLStoreSelector pKIXCRLStoreSelector) {
            this.selector = pKIXCRLStoreSelector;
            if (pKIXCRLStoreSelector.baseSelector instanceof X509CRLSelector) {
                X509CRLSelector x509CRLSelector = (X509CRLSelector) pKIXCRLStoreSelector.baseSelector;
                setCertificateChecking(x509CRLSelector.getCertificateChecking());
                setDateAndTime(x509CRLSelector.getDateAndTime());
                setIssuers(x509CRLSelector.getIssuers());
                setMinCRLNumber(x509CRLSelector.getMinCRL());
                setMaxCRLNumber(x509CRLSelector.getMaxCRL());
            }
        }

        @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
        public boolean match(CRL crl) {
            PKIXCRLStoreSelector pKIXCRLStoreSelector = this.selector;
            return pKIXCRLStoreSelector == null ? crl != null : pKIXCRLStoreSelector.match(crl);
        }
    }

    public PKIXCRLStoreSelector(Builder builder) {
        this.baseSelector = builder.baseSelector;
        this.deltaCRLIndicator = builder.deltaCRLIndicator;
        this.completeCRLEnabled = builder.completeCRLEnabled;
        this.maxBaseCRLNumber = builder.maxBaseCRLNumber;
        this.issuingDistributionPoint = builder.issuingDistributionPoint;
        this.issuingDistributionPointEnabled = builder.issuingDistributionPointEnabled;
    }

    public static Collection getCRLs(PKIXCRLStoreSelector pKIXCRLStoreSelector, CertStore certStore) {
        return certStore.getCRLs(new SelectorClone(pKIXCRLStoreSelector));
    }

    @Override // org.bouncycastle.util.Selector
    public Object clone() {
        return this;
    }

    public X509Certificate getCertificateChecking() {
        CRLSelector cRLSelector = this.baseSelector;
        if (cRLSelector instanceof X509CRLSelector) {
            return ((X509CRLSelector) cRLSelector).getCertificateChecking();
        }
        return null;
    }

    public byte[] getIssuingDistributionPoint() {
        return Arrays.clone(this.issuingDistributionPoint);
    }

    public BigInteger getMaxBaseCRLNumber() {
        return this.maxBaseCRLNumber;
    }

    public boolean isCompleteCRLEnabled() {
        return this.completeCRLEnabled;
    }

    public boolean isDeltaCRLIndicatorEnabled() {
        return this.deltaCRLIndicator;
    }

    public boolean isIssuingDistributionPointEnabled() {
        return this.issuingDistributionPointEnabled;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (org.bouncycastle.util.Arrays.areEqual(r0, r2) == false) goto L34;
     */
    @Override // org.bouncycastle.util.Selector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean match(java.security.cert.CRL r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.security.cert.X509CRL
            if (r0 != 0) goto L5
            goto L61
        L5:
            r0 = r5
            java.security.cert.X509CRL r0 = (java.security.cert.X509CRL) r0
            r1 = 0
            org.bouncycastle.asn1.ASN1ObjectIdentifier r2 = org.bouncycastle.asn1.x509.Extension.deltaCRLIndicator     // Catch: java.lang.Exception -> L68
            java.lang.String r2 = r2.getId()     // Catch: java.lang.Exception -> L68
            byte[] r2 = r0.getExtensionValue(r2)     // Catch: java.lang.Exception -> L68
            if (r2 == 0) goto L22
            org.bouncycastle.asn1.ASN1OctetString r2 = org.bouncycastle.asn1.ASN1OctetString.getInstance(r2)     // Catch: java.lang.Exception -> L68
            byte[] r2 = r2.getOctets()     // Catch: java.lang.Exception -> L68
            org.bouncycastle.asn1.ASN1Integer r2 = org.bouncycastle.asn1.ASN1Integer.getInstance(r2)     // Catch: java.lang.Exception -> L68
            goto L23
        L22:
            r2 = 0
        L23:
            if (r2 != 0) goto L2c
            boolean r2 = r4.isDeltaCRLIndicatorEnabled()
            if (r2 == 0) goto L45
            return r1
        L2c:
            boolean r3 = r4.isCompleteCRLEnabled()
            if (r3 == 0) goto L33
            return r1
        L33:
            java.math.BigInteger r3 = r4.maxBaseCRLNumber
            if (r3 == 0) goto L45
            java.math.BigInteger r2 = r2.getPositiveValue()
            java.math.BigInteger r3 = r4.maxBaseCRLNumber
            int r2 = r2.compareTo(r3)
            r3 = 1
            if (r2 != r3) goto L45
            return r1
        L45:
            boolean r2 = r4.issuingDistributionPointEnabled
            if (r2 == 0) goto L61
            org.bouncycastle.asn1.ASN1ObjectIdentifier r2 = org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint
            java.lang.String r2 = r2.getId()
            byte[] r0 = r0.getExtensionValue(r2)
            byte[] r2 = r4.issuingDistributionPoint
            if (r2 != 0) goto L5a
            if (r0 == 0) goto L61
            return r1
        L5a:
            boolean r0 = org.bouncycastle.util.Arrays.areEqual(r0, r2)
            if (r0 != 0) goto L61
            goto L68
        L61:
            java.security.cert.CRLSelector r0 = r4.baseSelector
            boolean r5 = r0.match(r5)
            return r5
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.PKIXCRLStoreSelector.match(java.security.cert.CRL):boolean");
    }
}
