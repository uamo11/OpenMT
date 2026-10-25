package l;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: 63TE */
/* renamed from: l.᩶ۖ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19872 implements X509TrustManager {
    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            x509Certificate.checkValidity();
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return C21988.f70395;
    }
}
