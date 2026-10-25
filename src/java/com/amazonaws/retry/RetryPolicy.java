package com.amazonaws.retry;

import com.amazonaws.AmazonClientException;

/* loaded from: classes.dex */
public final class RetryPolicy {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BackoffStrategy f457;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f458;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final RetryCondition f459;

    public interface BackoffStrategy {

        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public static final BackoffStrategy f460 = new BackoffStrategy() { // from class: com.amazonaws.retry.RetryPolicy.BackoffStrategy.1
            @Override // com.amazonaws.retry.RetryPolicy.BackoffStrategy
            /* renamed from: ֫ */
            public final long mo427(int i) {
                return 0L;
            }
        };

        /* renamed from: ֫ */
        long mo427(int i);
    }

    public interface RetryCondition {

        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public static final RetryCondition f461 = new RetryCondition() { // from class: com.amazonaws.retry.RetryPolicy.RetryCondition.1
            @Override // com.amazonaws.retry.RetryPolicy.RetryCondition
            /* renamed from: ֫ */
            public final boolean mo428(AmazonClientException amazonClientException, int i) {
                return false;
            }
        };

        /* renamed from: ֫ */
        boolean mo428(AmazonClientException amazonClientException, int i);
    }

    public RetryPolicy(RetryCondition retryCondition, BackoffStrategy backoffStrategy, int i, boolean z) {
        retryCondition = retryCondition == null ? PredefinedRetryPolicies.f452 : retryCondition;
        backoffStrategy = backoffStrategy == null ? PredefinedRetryPolicies.f451 : backoffStrategy;
        if (i < 0) {
            throw new IllegalArgumentException("Please provide a non-negative value for maxErrorRetry.");
        }
        this.f459 = retryCondition;
        this.f457 = backoffStrategy;
        this.f458 = i;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final RetryCondition m431() {
        return this.f459;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BackoffStrategy m429() {
        return this.f457;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m430() {
        return this.f458;
    }
}
