package com.amazonaws.retry;

import com.alipay.sdk.m.o.b;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.retry.RetryPolicy;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Random;

/* loaded from: classes.dex */
public class PredefinedRetryPolicies {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final RetryPolicy f450;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final RetryPolicy.BackoffStrategy f451;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final SDKDefaultRetryCondition f452;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final RetryPolicy f453 = new RetryPolicy(RetryPolicy.RetryCondition.f461, RetryPolicy.BackoffStrategy.f460, 0, false);

    static {
        SDKDefaultRetryCondition sDKDefaultRetryCondition = new SDKDefaultRetryCondition();
        f452 = sDKDefaultRetryCondition;
        SDKDefaultBackoffStrategy sDKDefaultBackoffStrategy = new SDKDefaultBackoffStrategy();
        f451 = sDKDefaultBackoffStrategy;
        f450 = new RetryPolicy(sDKDefaultRetryCondition, sDKDefaultBackoffStrategy, 3, true);
        new RetryPolicy(sDKDefaultRetryCondition, sDKDefaultBackoffStrategy, 10, true);
    }

    public class SDKDefaultRetryCondition implements RetryPolicy.RetryCondition {
        @Override // com.amazonaws.retry.RetryPolicy.RetryCondition
        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final boolean mo428(AmazonClientException amazonClientException, int i) {
            if ((amazonClientException.getCause() instanceof IOException) && !(amazonClientException.getCause() instanceof InterruptedIOException)) {
                return true;
            }
            if (!(amazonClientException instanceof AmazonServiceException)) {
                return false;
            }
            AmazonServiceException amazonServiceException = (AmazonServiceException) amazonClientException;
            int m149 = amazonServiceException.m149();
            if (m149 == 500 || m149 == 503 || m149 == 502 || m149 == 504) {
                return true;
            }
            String m142 = amazonServiceException.m142();
            return "Throttling".equals(m142) || "ThrottlingException".equals(m142) || "ProvisionedThroughputExceededException".equals(m142) || RetryUtils.m432(amazonServiceException);
        }
    }

    public final class SDKDefaultBackoffStrategy implements RetryPolicy.BackoffStrategy {

        /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
        public final Random f456 = new Random();

        /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
        public final int f454 = 100;

        /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
        public final int f455 = b.j0;

        @Override // com.amazonaws.retry.RetryPolicy.BackoffStrategy
        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final long mo427(int i) {
            if (i <= 0) {
                return 0L;
            }
            return this.f456.nextInt(Math.min(this.f455, (1 << i) * this.f454));
        }
    }
}
