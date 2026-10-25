package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* loaded from: classes.dex */
public class ListObjectsRequest extends AmazonWebServiceRequest {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f616;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f617;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f618;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Integer f619;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f620;

    public ListObjectsRequest(String str, String str2, String str3, String str4, Integer num) {
        this.f620 = str;
        this.f618 = str2;
        this.f616 = str3;
        this.f617 = str4;
        this.f619 = num;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m599() {
        return this.f620;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m600() {
        return this.f618;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m597() {
        return this.f616;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m598() {
        return this.f617;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Integer m596() {
        return this.f619;
    }
}
