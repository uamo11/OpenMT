package com.amazonaws;

import com.amazonaws.auth.RegionAwareSigner;
import com.amazonaws.auth.Signer;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.UrlHttpClient;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.Classes;
import com.amazonaws.util.StringUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class AmazonWebServiceClient {

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Log f79 = LogFactory.m302(AmazonWebServiceClient.class);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AmazonHttpClient f80;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ClientConfiguration f81;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile Signer f82;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile URI f83;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile String f84;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f85 = new CopyOnWriteArrayList();

    public AmazonWebServiceClient(ClientConfiguration clientConfiguration, UrlHttpClient urlHttpClient) {
        this.f81 = clientConfiguration;
        this.f80 = new AmazonHttpClient(clientConfiguration, urlHttpClient);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo157(String str) {
        if (!str.contains("://")) {
            str = this.f81.m170().toString() + "://" + str;
        }
        try {
            URI uri = new URI(str);
            Signer m151 = m151(uri, false);
            synchronized (this) {
                this.f83 = uri;
                this.f82 = m151;
            }
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Signer m153(URI uri) {
        return m151(uri, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Signer m151(URI uri, boolean z) {
        Signer m225;
        if (uri == null) {
            throw new IllegalArgumentException("Endpoint is not set. Use setEndpoint to set an endpoint before performing any request.");
        }
        String m154 = m154();
        String m739 = AwsHostNameUtils.m739(uri.getHost(), m154);
        String m174 = this.f81.m174();
        if (m174 == null) {
            m225 = SignerFactory.m224(m154, m739);
        } else {
            m225 = SignerFactory.m225(m174, m154);
        }
        Signer signer = m225;
        if (signer instanceof RegionAwareSigner) {
            RegionAwareSigner regionAwareSigner = (RegionAwareSigner) signer;
            if (m739 != null && z) {
                regionAwareSigner.setRegionName(m739);
            }
        }
        synchronized (this) {
            RegionUtils.m423(m739);
        }
        return signer;
    }

    @Deprecated
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m155(AmazonWebServiceRequest amazonWebServiceRequest) {
        amazonWebServiceRequest.getClass();
        this.f80.getClass();
        AwsSdkMetrics.m329();
    }

    @Deprecated
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m156(AWSRequestMetrics aWSRequestMetrics, DefaultRequest defaultRequest) {
        aWSRequestMetrics.mo732(AWSRequestMetrics.Field.ClientExecuteTime);
        aWSRequestMetrics.m731().mo790();
        defaultRequest.m192().getClass();
        this.f80.getClass();
        AwsSdkMetrics.m329().getClass();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m154() {
        if (this.f84 == null) {
            synchronized (this) {
                if (this.f84 == null) {
                    this.f84 = m152();
                    return this.f84;
                }
            }
        }
        return this.f84;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private String m152() {
        int i;
        String simpleName = Classes.m761(AmazonWebServiceClient.class, this).getSimpleName();
        String m201 = ServiceNameFactory.m201(simpleName);
        if (m201 != null) {
            return m201;
        }
        int indexOf = simpleName.indexOf("JavaClient");
        if (indexOf == -1 && (indexOf = simpleName.indexOf("Client")) == -1) {
            throw new IllegalStateException("Unrecognized suffix for the AWS http client class name ".concat(simpleName));
        }
        int indexOf2 = simpleName.indexOf("Amazon");
        if (indexOf2 == -1) {
            indexOf2 = simpleName.indexOf("AWS");
            if (indexOf2 == -1) {
                throw new IllegalStateException("Unrecognized prefix for the AWS http client class name ".concat(simpleName));
            }
            i = 3;
        } else {
            i = 6;
        }
        if (indexOf2 >= indexOf) {
            throw new IllegalStateException("Unrecognized AWS http client class name ".concat(simpleName));
        }
        return StringUtils.m789(simpleName.substring(indexOf2 + i, indexOf));
    }
}
