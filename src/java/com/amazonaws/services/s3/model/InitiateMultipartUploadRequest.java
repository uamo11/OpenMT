package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes.dex */
public class InitiateMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f606;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CannedAccessControlList f607;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ObjectTagging f608;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public SSEAwsKeyManagementParams f609;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ObjectMetadata f610;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f611;

    public InitiateMultipartUploadRequest(String str, String str2) {
        this.f611 = str;
        this.f606 = str2;
    }

    public InitiateMultipartUploadRequest(String str, String str2, ObjectMetadata objectMetadata) {
        this.f611 = str;
        this.f606 = str2;
        this.f610 = objectMetadata;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m586() {
        return this.f611;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m584() {
        return this.f606;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CannedAccessControlList m585() {
        return this.f607;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m580(CannedAccessControlList cannedAccessControlList) {
        this.f607 = cannedAccessControlList;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final SSEAwsKeyManagementParams m583() {
        return this.f609;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m582(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        this.f609 = sSEAwsKeyManagementParams;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ObjectTagging m587() {
        return this.f608;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m581(ObjectTagging objectTagging) {
        this.f608 = objectTagging;
    }
}
