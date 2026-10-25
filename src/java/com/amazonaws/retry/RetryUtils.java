package com.amazonaws.retry;

import com.amazonaws.AbortedException;
import com.amazonaws.AmazonServiceException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class RetryUtils {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m432(AmazonServiceException amazonServiceException) {
        String m142 = amazonServiceException.m142();
        return "RequestTimeTooSkewed".equals(m142) || "RequestExpired".equals(m142) || "InvalidSignatureException".equals(m142) || "SignatureDoesNotMatch".equals(m142);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m433(Exception exc) {
        if (exc instanceof AbortedException) {
            return true;
        }
        if (exc.getCause() == null) {
            return false;
        }
        Throwable cause = exc.getCause();
        if (cause instanceof InterruptedException) {
            return true;
        }
        return (cause instanceof InterruptedIOException) && !(cause instanceof SocketTimeoutException);
    }
}
