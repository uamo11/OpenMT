package l;

import java.io.FilterInputStream;
import java.io.InputStream;

/* compiled from: B2OJ */
/* renamed from: l.᩶᩻֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20493 extends C21904 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f66065;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            long j = this.f66065;
            if (j >= 0) {
                this.f66065 = j + 1;
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read > 0) {
            long j = this.f66065;
            if (j >= 0) {
                this.f66065 = j + read;
            }
        }
        return read;
    }

    public C20493(InputStream inputStream) {
        super(inputStream);
        this.f66065 = 0L;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m46958() {
        return this.f66065;
    }
}
