package l;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: Q4EB */
/* renamed from: l.۠ܽ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8288 implements HostnameVerifier {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C8288 f25465 = new C8288();

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return m21885((X509Certificate) sSLSession.getPeerCertificates()[0], str);
        } catch (SSLException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[LOOP:1: B:14:0x0034->B:43:?, LOOP_END, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m21885(java.security.cert.X509Certificate r8, java.lang.String r9) {
        /*
            boolean r0 = l.C20032.m46187(r9)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L25
            r0 = 7
            java.util.List r8 = m21884(r8, r0)
            int r0 = r8.size()
            r3 = 0
        L12:
            if (r3 >= r0) goto Le4
            java.lang.Object r4 = r8.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r9.equalsIgnoreCase(r4)
            if (r4 == 0) goto L22
            goto Le3
        L22:
            int r3 = r3 + 1
            goto L12
        L25:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r9 = r9.toLowerCase(r0)
            r0 = 2
            java.util.List r8 = m21884(r8, r0)
            java.util.Iterator r8 = r8.iterator()
        L34:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Le4
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r9 == 0) goto Le0
            int r3 = r9.length()
            if (r3 == 0) goto Le0
            java.lang.String r3 = "."
            boolean r4 = r9.startsWith(r3)
            if (r4 != 0) goto Le0
            java.lang.String r4 = ".."
            boolean r5 = r9.endsWith(r4)
            if (r5 == 0) goto L5a
            goto Le0
        L5a:
            if (r0 == 0) goto Le0
            int r5 = r0.length()
            if (r5 == 0) goto Le0
            boolean r5 = r0.startsWith(r3)
            if (r5 != 0) goto Le0
            boolean r4 = r0.endsWith(r4)
            if (r4 == 0) goto L70
            goto Le0
        L70:
            boolean r4 = r9.endsWith(r3)
            if (r4 != 0) goto L7b
            java.lang.String r4 = r9.concat(r3)
            goto L7c
        L7b:
            r4 = r9
        L7c:
            boolean r5 = r0.endsWith(r3)
            if (r5 != 0) goto L86
            java.lang.String r0 = r0.concat(r3)
        L86:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r3)
            java.lang.String r3 = "*"
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L99
            boolean r0 = r4.equals(r0)
            goto Le1
        L99:
            java.lang.String r3 = "*."
            boolean r5 = r0.startsWith(r3)
            if (r5 == 0) goto Le0
            r5 = 42
            int r5 = r0.indexOf(r5, r2)
            r6 = -1
            if (r5 == r6) goto Lab
            goto Le0
        Lab:
            int r5 = r4.length()
            int r7 = r0.length()
            if (r5 >= r7) goto Lb6
            goto Le0
        Lb6:
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto Lbd
            goto Le0
        Lbd:
            java.lang.String r0 = r0.substring(r2)
            boolean r3 = r4.endsWith(r0)
            if (r3 != 0) goto Lc8
            goto Le0
        Lc8:
            int r3 = r4.length()
            int r0 = r0.length()
            int r3 = r3 - r0
            if (r3 <= 0) goto Lde
            int r3 = r3 + (-1)
            r0 = 46
            int r0 = r4.lastIndexOf(r0, r3)
            if (r0 == r6) goto Lde
            goto Le0
        Lde:
            r0 = 1
            goto Le1
        Le0:
            r0 = 0
        Le1:
            if (r0 == 0) goto L34
        Le3:
            return r2
        Le4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8288.m21885(java.security.cert.X509Certificate, java.lang.String):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m21883(X509Certificate x509Certificate) {
        List m21884 = m21884(x509Certificate, 7);
        List m218842 = m21884(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(m218842.size() + m21884.size());
        arrayList.addAll(m21884);
        arrayList.addAll(m218842);
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m21884(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }
}
