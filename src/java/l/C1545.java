package l;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import java.net.URI;
import java.util.Locale;

/* compiled from: Q7TX */
/* renamed from: l.֫ۖ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1545 extends AmazonS3Client {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public URI f5455;

    static {
        SignerFactory.m223(C10759.class, "UnsignedPayloadSignerType");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5293(URI uri) {
        this.f5455 = uri;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5292(boolean z) {
        this.f470.m454(z);
    }

    @Override // com.amazonaws.services.s3.AmazonS3Client, com.amazonaws.AmazonWebServiceClient
    /* renamed from: ֫ */
    public final void mo157(String str) {
        if (m5291(str)) {
            ClientConfiguration clientConfiguration = this.f81;
            clientConfiguration.m175();
            clientConfiguration.m169();
        }
        super.mo157(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5291(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        int indexOf = lowerCase.indexOf("://");
        if (indexOf >= 0) {
            lowerCase = lowerCase.substring(indexOf + 3);
        }
        int indexOf2 = lowerCase.indexOf(47);
        if (indexOf2 >= 0) {
            lowerCase = lowerCase.substring(0, indexOf2);
        }
        int indexOf3 = lowerCase.indexOf(58);
        if (indexOf3 >= 0) {
            lowerCase = lowerCase.substring(0, indexOf3);
        }
        return "s3.cstcloud.cn".equals(lowerCase);
    }

    @Override // com.amazonaws.services.s3.AmazonS3Client
    /* renamed from: ֫ */
    public final void mo449(DefaultRequest defaultRequest, String str, String str2, URI uri) {
        if (this.f5455 != null && (defaultRequest.m192() instanceof GetObjectRequest)) {
            defaultRequest.m183(this.f5455);
            if (str2 != null && str2.startsWith("/")) {
                str2 = "/".concat(str2);
            }
            defaultRequest.m181(str2);
            return;
        }
        super.mo449(defaultRequest, str, str2, uri);
    }
}
