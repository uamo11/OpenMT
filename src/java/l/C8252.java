package l;

import android.media.MediaDataSource;

/* compiled from: W8GL */
/* renamed from: l.۠ܶۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8252 extends MediaDataSource {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23411 f25397;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f25398;

    public C8252(C23411 c23411, boolean z) {
        this.f25397 = c23411;
        this.f25398 = z;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        int mo21175;
        synchronized (this.f25397) {
            this.f25397.seek(j);
            mo21175 = this.f25397.mo21175(i, i2, bArr);
        }
        return mo21175;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f25397.length();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f25398) {
            this.f25397.close();
        }
    }
}
