package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.SSEAlgorithm;
import com.amazonaws.util.DateUtils;
import l.C15472;

/* loaded from: classes.dex */
public class ServiceUtils {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f512 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Log f513 = LogFactory.m302(ServiceUtils.class);

    static {
        new DateUtils();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m486(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("\"")) {
            trim = trim.substring(1);
        }
        return trim.endsWith("\"") ? C15472.m36561(1, 0, trim) : trim;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m487(AmazonWebServiceRequest amazonWebServiceRequest) {
        if (System.getProperty("com.amazonaws.services.s3.disableGetObjectMD5Validation") != null) {
            return true;
        }
        if (amazonWebServiceRequest instanceof GetObjectRequest) {
            return ((GetObjectRequest) amazonWebServiceRequest).m574() != null;
        }
        if (!(amazonWebServiceRequest instanceof PutObjectRequest)) {
            return false;
        }
        PutObjectRequest putObjectRequest = (PutObjectRequest) amazonWebServiceRequest;
        ObjectMetadata m519 = putObjectRequest.m519();
        if (m519 != null && m519.m630() != null) {
            return true;
        }
        if (putObjectRequest.m505() == null) {
            return false;
        }
        putObjectRequest.m505().getClass();
        return (SSEAlgorithm.KMS.getAlgorithm() == null && putObjectRequest.m505().m671() == null) ? false : true;
    }
}
