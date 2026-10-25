package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.VersionInfoUtils;

/* loaded from: classes.dex */
public class TransferUtility {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Log f377 = LogFactory.m302(TransferUtility.class);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object f376 = new Object();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String f378 = "";

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m403() {
        synchronized (f376) {
            String str = f378;
            if (str != null && !str.trim().isEmpty()) {
                return str.trim() + "/";
            }
            return "";
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m405(AmazonWebServiceRequest amazonWebServiceRequest) {
        RequestClientOptions m161 = amazonWebServiceRequest.m161();
        StringBuilder sb = new StringBuilder("TransferService/");
        sb.append(m403());
        int i = VersionInfoUtils.f849;
        sb.append("2.81.1");
        m161.m197(sb.toString());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m404(AmazonWebServiceRequest amazonWebServiceRequest) {
        RequestClientOptions m161 = amazonWebServiceRequest.m161();
        StringBuilder sb = new StringBuilder("TransferService_multipart/");
        sb.append(m403());
        int i = VersionInfoUtils.f849;
        sb.append("2.81.1");
        m161.m197(sb.toString());
    }
}
