package l;

import java.io.FilterInputStream;

/* compiled from: L2QA */
/* renamed from: l.ۗۡ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C3123 extends AbstractC10179 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f9755;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f9756;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f9757;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C20177 f9758;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f9759;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f9756 = this.f9759;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        ((FilterInputStream) this).in.reset();
        this.f9759 = this.f9756;
    }

    @Override // l.AbstractC10179, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        long skip;
        long j2 = this.f9755;
        if (j2 >= 0) {
            j = Math.min(j, j2 - m9503());
        }
        skip = super.skip(j);
        this.f9759 += skip;
        return skip;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized long m9503() {
        return this.f9759;
    }

    @Override // l.AbstractC10179
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void mo9504(int i) {
        if (i != -1) {
            this.f9759 += i;
        }
        super.mo9504(i);
    }

    @Deprecated
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m9505() {
        this.f9757 = false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3123(long r2, java.io.InputStream r4) {
        /*
            r1 = this;
            l.ۙۡ֡ r0 = new l.ۙۡ֡
            r0.<init>()
            r0.m46242(r2)
            r1.<init>(r4, r0)
            r2 = 1
            r1.f9757 = r2
            r2 = 0
            r1.f9759 = r2
            long r2 = r0.m46241()
            r1.f9755 = r2
            boolean r2 = r0.m46244()
            r1.f9757 = r2
            l.᩶۫᩷ r2 = r0.m46243()
            r1.f9758 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3123.<init>(long, java.io.InputStream):void");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        if (m9502()) {
            m9503();
            this.f9758.getClass();
            return 0;
        }
        return ((FilterInputStream) this).in.available();
    }

    @Override // l.AbstractC10179, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f9757) {
            super.close();
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m9502() {
        long j = this.f9755;
        return j >= 0 && m9503() >= j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // l.AbstractC10179, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (m9502()) {
            m9503();
            this.f9758.getClass();
            return -1;
        }
        return super.read();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // l.AbstractC10179, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (m9502()) {
            m9503();
            this.f9758.getClass();
            return -1;
        }
        long j = i2;
        long j2 = this.f9755;
        if (j2 >= 0) {
            j = Math.min(j, j2 - m9503());
        }
        return super.read(bArr, i, (int) j);
    }

    public final String toString() {
        return ((FilterInputStream) this).in.toString();
    }
}
