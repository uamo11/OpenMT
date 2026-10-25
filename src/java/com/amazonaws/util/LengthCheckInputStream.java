package com.amazonaws.util;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkFilterInputStream;
import com.google.android.material.motion.MotionUtils;
import java.io.InputStream;

/* loaded from: classes.dex */
public class LengthCheckInputStream extends SdkFilterInputStream {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f837;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f838;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f839;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f840;

    public LengthCheckInputStream(InputStream inputStream, long j, boolean z) {
        super(inputStream);
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        this.f840 = j;
        this.f838 = z;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read >= 0) {
            this.f839++;
        }
        m783(read == -1);
        return read;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        this.f839 += read >= 0 ? read : 0L;
        m783(read == -1);
        return read;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        super.mark(i);
        this.f837 = this.f839;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        super.reset();
        if (markSupported()) {
            this.f839 = this.f837;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m783(boolean z) {
        long j = this.f840;
        if (z) {
            if (this.f839 == j) {
                return;
            }
            throw new AmazonClientException("Data read (" + this.f839 + ") has a different length than the expected (" + j + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        if (this.f839 <= j) {
            return;
        }
        throw new AmazonClientException("More data read (" + this.f839 + ") than expected (" + j + MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = super.skip(j);
        if (this.f838 && skip > 0) {
            this.f839 += skip;
            m783(false);
        }
        return skip;
    }
}
