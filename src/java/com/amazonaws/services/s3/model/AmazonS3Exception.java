package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonServiceException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AmazonS3Exception extends AmazonServiceException implements Serializable {
    public static final long serialVersionUID = 7573680383273658477L;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f536;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public HashMap f537;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m525(String str) {
        this.f536 = str;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Map m524() {
        return this.f537;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m523(HashMap hashMap) {
        this.f537 = hashMap;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + ", S3 Extended Request ID: " + this.f536;
    }
}
