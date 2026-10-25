package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes.dex */
public class AbortMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f520;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f521;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f522;

    public AbortMultipartUploadRequest(String str, String str2, String str3) {
        this.f522 = str;
        this.f521 = str2;
        this.f520 = str3;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m496() {
        return this.f522;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m495() {
        return this.f521;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m494() {
        return this.f520;
    }
}
