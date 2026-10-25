package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.Date;

/* loaded from: classes.dex */
public class Bucket implements Serializable {
    public static final long serialVersionUID = -8646831898339939580L;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f540 = null;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Owner f538 = null;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Date f539 = null;

    public final String toString() {
        return "S3Bucket [name=" + this.f540 + ", creationDate=" + this.f539 + ", owner=" + this.f538 + "]";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m526(Owner owner) {
        this.f538 = owner;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m528(Date date) {
        this.f539 = date;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m527(String str) {
        this.f540 = str;
    }
}
