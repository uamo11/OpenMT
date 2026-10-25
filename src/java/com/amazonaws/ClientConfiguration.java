package com.amazonaws;

import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.util.VersionInfoUtils;

/* loaded from: classes.dex */
public class ClientConfiguration {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f97;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f98;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final String f91 = VersionInfoUtils.m798();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final RetryPolicy f90 = PredefinedRetryPolicies.f450;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f94 = f91;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public RetryPolicy f95 = f90;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Protocol f93 = Protocol.HTTPS;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f96 = 15000;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f92 = 15000;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Protocol m170() {
        return this.f93;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m168(Protocol protocol) {
        this.f93 = protocol;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m171() {
        return this.f94;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m176() {
        return this.f98;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m175() {
        this.f98 = "s3drive rclone s3 browser obsidian";
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final RetryPolicy m172() {
        return this.f95;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m173() {
        return this.f96;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m167() {
        return this.f92;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m174() {
        return this.f97;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m169() {
        this.f97 = "UnsignedPayloadSignerType";
    }
}
