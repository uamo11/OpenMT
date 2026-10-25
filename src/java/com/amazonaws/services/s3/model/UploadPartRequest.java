package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;

/* loaded from: classes.dex */
public class UploadPartRequest extends AmazonWebServiceRequest implements Serializable {
    public static final long serialVersionUID = 1;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f672;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public File f673;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f674;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f675;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f676;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient InputStream f677;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f678;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f679;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f680;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m684() {
        return this.f678;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m674(int i) {
        this.f678 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m677(InputStream inputStream) {
        this.f677 = inputStream;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InputStream m679() {
        return this.f677;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m690() {
        return this.f679;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m678(String str) {
        this.f679 = str;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m691() {
        return this.f675;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m683(String str) {
        this.f675 = str;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m686() {
        return this.f680;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m688(String str) {
        this.f680 = str;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m681() {
        return this.f674;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m687(int i) {
        this.f674 = i;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long m680() {
        return this.f676;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m682(long j) {
        this.f676 = j;
    }

    /* renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public final File m685() {
        return this.f673;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m676(File file) {
        this.f673 = file;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long m689() {
        return this.f672;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m675(long j) {
        this.f672 = j;
    }
}
