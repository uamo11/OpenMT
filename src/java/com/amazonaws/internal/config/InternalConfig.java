package com.amazonaws.internal.config;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.C20195;
import l.C22870;

/* loaded from: classes.dex */
public class InternalConfig {

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Log f215 = LogFactory.m302(InternalConfig.class);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SignerConfig f216 = new SignerConfig("AWS4SignerType");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f217;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f218;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f219;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f220;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f221;

    public InternalConfig() {
        HashMap hashMap = new HashMap();
        hashMap.put("eu-central-1", new SignerConfig("AWS4SignerType"));
        hashMap.put("cn-north-1", new SignerConfig("AWS4SignerType"));
        this.f221 = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("ec2", new SignerConfig("QueryStringSignerType"));
        hashMap2.put("email", new SignerConfig("AWS4SignerType"));
        hashMap2.put("s3", new SignerConfig("AWSS3V4SignerType"));
        hashMap2.put("sdb", new SignerConfig("QueryStringSignerType"));
        hashMap2.put("lex", new SignerConfig("AmazonLexV4Signer"));
        hashMap2.put("polly", new SignerConfig("AmazonPollyCustomPresigner"));
        this.f218 = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("s3/eu-central-1", new SignerConfig("AWSS3V4SignerType"));
        hashMap3.put("s3/cn-north-1", new SignerConfig("AWSS3V4SignerType"));
        hashMap3.put("s3/us-east-2", new SignerConfig("AWSS3V4SignerType"));
        hashMap3.put("s3/ca-central-1", new SignerConfig("AWSS3V4SignerType"));
        hashMap3.put("s3/ap-south-1", new SignerConfig("AWSS3V4SignerType"));
        hashMap3.put("s3/ap-northeast-2", new SignerConfig("AWSS3V4SignerType"));
        hashMap3.put("s3/eu-west-2", new SignerConfig("AWSS3V4SignerType"));
        hashMap3.put("lex/eu-central-1", new SignerConfig("AmazonLexV4Signer"));
        hashMap3.put("lex/cn-north-1", new SignerConfig("AmazonLexV4Signer"));
        hashMap3.put("polly/eu-central-1", new SignerConfig("AmazonPollyCustomPresigner"));
        hashMap3.put("polly/cn-north-1", new SignerConfig("AmazonPollyCustomPresigner"));
        this.f220 = hashMap3;
        HashMap hashMap4 = new HashMap();
        hashMap4.put("AmazonCloudWatchClient", new HttpClientConfig("monitoring"));
        hashMap4.put("AmazonCloudWatchLogsClient", new HttpClientConfig("logs"));
        hashMap4.put("AmazonCognitoIdentityClient", new HttpClientConfig("cognito-identity"));
        hashMap4.put("AmazonCognitoIdentityProviderClient", new HttpClientConfig("cognito-idp"));
        hashMap4.put("AmazonCognitoSyncClient", new HttpClientConfig("cognito-sync"));
        hashMap4.put("AmazonComprehendClient", new HttpClientConfig("comprehend"));
        hashMap4.put("AmazonConnectClient", new HttpClientConfig("connect"));
        hashMap4.put("AmazonKinesisFirehoseClient", new HttpClientConfig("firehose"));
        hashMap4.put("AWSKinesisVideoArchivedMediaClient", new HttpClientConfig("kinesisvideo"));
        hashMap4.put("AWSKinesisVideoSignalingClient", new HttpClientConfig("kinesisvideo"));
        hashMap4.put("AWSIotClient", new HttpClientConfig("execute-api"));
        hashMap4.put("AmazonLexRuntimeClient", new HttpClientConfig("lex"));
        hashMap4.put("AmazonPinpointClient", new HttpClientConfig("mobiletargeting"));
        hashMap4.put("AmazonPinpointAnalyticsClient", new HttpClientConfig("mobileanalytics"));
        hashMap4.put("AmazonSageMakerRuntimeClient", new HttpClientConfig("sagemaker"));
        hashMap4.put("AmazonSimpleDBClient", new HttpClientConfig("sdb"));
        hashMap4.put("AmazonSimpleEmailServiceClient", new HttpClientConfig("email"));
        hashMap4.put("AWSSecurityTokenServiceClient", new HttpClientConfig("sts"));
        hashMap4.put("AmazonTextractClient", new HttpClientConfig("textract"));
        hashMap4.put("AmazonTranscribeClient", new HttpClientConfig("transcribe"));
        hashMap4.put("AmazonTranslateClient", new HttpClientConfig("translate"));
        this.f219 = hashMap4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HostRegexToRegionMapping("(.+\\.)?s3\\.amazonaws\\.com", "us-east-1"));
        arrayList.add(new HostRegexToRegionMapping("(.+\\.)?s3-external-1\\.amazonaws\\.com", "us-east-1"));
        arrayList.add(new HostRegexToRegionMapping("(.+\\.)?s3-fips-us-gov-west-1\\.amazonaws\\.com", "us-gov-west-1"));
        this.f217 = arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HttpClientConfig m286(String str) {
        return (HttpClientConfig) this.f219.get(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SignerConfig m287(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (str2 != null) {
            SignerConfig signerConfig = (SignerConfig) this.f220.get(C22870.m50967(str, "/", str2));
            if (signerConfig != null) {
                return signerConfig;
            }
            SignerConfig signerConfig2 = (SignerConfig) this.f221.get(str2);
            if (signerConfig2 != null) {
                return signerConfig2;
            }
        }
        SignerConfig signerConfig3 = (SignerConfig) this.f218.get(str);
        return signerConfig3 == null ? this.f216 : signerConfig3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m288() {
        return C20195.unmodifiableList(this.f217);
    }

    public class Factory {

        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public static final InternalConfig f222;

        static {
            try {
                f222 = new InternalConfig();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new IllegalStateException("Fatal: Failed to load the internal config for AWS Android SDK", e2);
            }
        }

        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public static InternalConfig m289() {
            return f222;
        }
    }
}
