package com.amazonaws.services.s3.model;

import java.util.Date;

/* loaded from: classes.dex */
public class S3ObjectSummary {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f657;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f658;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f659;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f660;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Owner f661;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Date f662;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f663;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m662(String str) {
        this.f657 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m659() {
        return this.f660;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m667(String str) {
        this.f660 = str;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m665(String str) {
        this.f658 = str;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m666() {
        return this.f659;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m660(long j) {
        this.f659 = j;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Date m664() {
        return this.f662;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m663(Date date) {
        this.f662 = date;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m661(Owner owner) {
        this.f661 = owner;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m668(String str) {
        this.f663 = str;
    }

    public final String toString() {
        return "S3ObjectSummary{bucketName='" + this.f657 + "', key='" + this.f660 + "', eTag='" + this.f658 + "', size=" + this.f659 + ", lastModified=" + this.f662 + ", storageClass='" + this.f663 + "', owner=" + this.f661 + '}';
    }
}
