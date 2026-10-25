package com.amazonaws.services.s3.model;

import java.io.Serializable;
import l.C7166;

/* loaded from: classes.dex */
public class BucketLoggingConfiguration implements Serializable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f545 = null;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f546 = null;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m534(String str) {
        if (str == null) {
            str = "";
        }
        this.f546 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m533(String str) {
        this.f545 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoggingConfiguration enabled=");
        sb.append((this.f545 == null || this.f546 == null) ? false : true);
        String sb2 = sb.toString();
        if (this.f545 == null || this.f546 == null) {
            return sb2;
        }
        StringBuilder m19190 = C7166.m19190(sb2, ", destinationBucketName=");
        m19190.append(this.f545);
        m19190.append(", logFilePrefix=");
        m19190.append(this.f546);
        return m19190.toString();
    }
}
