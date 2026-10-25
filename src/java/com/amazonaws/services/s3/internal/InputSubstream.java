package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.SdkFilterInputStream;

/* loaded from: classes.dex */
public final class InputSubstream extends SdkFilterInputStream {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f480;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f481;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f482;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f483;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f484;

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f482 = this.f484;
        super.mark(i);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        this.f484 = this.f482;
        super.reset();
    }

    public InputSubstream(RepeatableFileInputStream repeatableFileInputStream, long j, long j2) {
        super(repeatableFileInputStream);
        this.f482 = 0L;
        this.f484 = 0L;
        this.f481 = j2;
        this.f480 = j;
        this.f483 = true;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        return read == -1 ? read : bArr[0];
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j;
        long j2;
        while (true) {
            j = this.f484;
            j2 = this.f480;
            if (j >= j2) {
                break;
            }
            this.f484 += skip(j2 - j);
        }
        long j3 = (this.f481 + j2) - j;
        if (j3 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i, (int) Math.min(i2, j3));
        this.f484 += read;
        return read;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f483) {
            super.close();
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        long j = this.f484;
        long j2 = this.f481;
        long j3 = this.f480;
        if (j >= j3) {
            j2 = (j2 + j3) - j;
        }
        return (int) Math.min(j2, super.available());
    }
}
