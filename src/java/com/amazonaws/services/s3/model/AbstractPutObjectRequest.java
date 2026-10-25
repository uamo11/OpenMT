package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class AbstractPutObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public File f523;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CannedAccessControlList f524;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f525;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ObjectMetadata f526;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public SSEAwsKeyManagementParams f527;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f528;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient InputStream f529;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ObjectTagging f530;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f531;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f532;

    public AbstractPutObjectRequest(File file, String str, String str2) {
        this.f531 = str;
        this.f528 = str2;
        this.f523 = file;
    }

    public AbstractPutObjectRequest(String str, String str2, InputStream inputStream, ObjectMetadata objectMetadata) {
        this.f531 = str;
        this.f528 = str2;
        this.f529 = inputStream;
        this.f526 = objectMetadata;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m518() {
        return this.f531;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m504() {
        return this.f528;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m514() {
        return this.f532;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m511(String str) {
        this.f532 = str;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo517(String str) {
        this.f532 = str;
        return this;
    }

    /* renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public final File m513() {
        return this.f523;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ObjectMetadata m519() {
        return this.f526;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m499(ObjectMetadata objectMetadata) {
        this.f526 = objectMetadata;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo508(ObjectMetadata objectMetadata) {
        this.f526 = objectMetadata;
        return this;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CannedAccessControlList m516() {
        return this.f524;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m498(CannedAccessControlList cannedAccessControlList) {
        this.f524 = cannedAccessControlList;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo507(CannedAccessControlList cannedAccessControlList) {
        this.f524 = cannedAccessControlList;
        return this;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InputStream m512() {
        return this.f529;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo497(InputStream inputStream) {
        this.f529 = inputStream;
        return this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m502(String str) {
        this.f525 = str;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m506() {
        return this.f525;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo515(String str) {
        this.f525 = str;
        return this;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ObjectTagging m503() {
        return this.f530;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m500(ObjectTagging objectTagging) {
        this.f530 = objectTagging;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final SSEAwsKeyManagementParams m505() {
        return this.f527;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m501(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        this.f527 = sSEAwsKeyManagementParams;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractPutObjectRequest mo510(SSEAwsKeyManagementParams sSEAwsKeyManagementParams) {
        this.f527 = sSEAwsKeyManagementParams;
        return this;
    }

    @Override // com.amazonaws.AmazonWebServiceRequest
    /* renamed from: clone */
    public AbstractPutObjectRequest mo162clone() {
        return (AbstractPutObjectRequest) super.mo162clone();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractPutObjectRequest m509(PutObjectRequest putObjectRequest) {
        m160(putObjectRequest);
        ObjectMetadata objectMetadata = this.f526;
        putObjectRequest.mo507(this.f524);
        putObjectRequest.mo497(this.f529);
        putObjectRequest.mo508(objectMetadata == null ? null : objectMetadata.m639clone());
        putObjectRequest.mo515(this.f525);
        putObjectRequest.mo517(this.f532);
        putObjectRequest.mo510(this.f527);
        return putObjectRequest;
    }
}
