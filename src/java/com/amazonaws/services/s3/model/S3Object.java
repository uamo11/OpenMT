package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import java.io.Closeable;
import java.io.Serializable;
import l.C9045;

/* loaded from: classes.dex */
public class S3Object implements Closeable, Serializable, S3RequesterChargedResult {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient S3ObjectInputStream f651;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f654 = null;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f653 = null;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ObjectMetadata f652 = new ObjectMetadata();

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    /* renamed from: ֫ */
    public final void mo465(boolean z) {
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ObjectMetadata m654() {
        return this.f652;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        S3ObjectInputStream s3ObjectInputStream = this.f651;
        if (s3ObjectInputStream != null) {
            s3ObjectInputStream.close();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final S3ObjectInputStream m650() {
        return this.f651;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m651(S3ObjectInputStream s3ObjectInputStream) {
        this.f651 = s3ObjectInputStream;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m652(String str) {
        this.f653 = str;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m653(String str) {
        this.f654 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("S3Object [key=");
        sb.append(this.f654);
        sb.append(",bucket=");
        String str = this.f653;
        if (str == null) {
            str = "<Unknown>";
        }
        return C9045.m23341(sb, str, "]");
    }
}
