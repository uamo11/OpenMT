package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes.dex */
public class GetObjectMetadataRequest extends AmazonWebServiceRequest implements Serializable {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f591;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f592;

    public GetObjectMetadataRequest(String str, String str2) {
        this.f592 = str;
        this.f591 = str2;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m567() {
        return this.f592;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m566() {
        return this.f591;
    }
}
