package l;

import android.media.MediaDataSource;

/* compiled from: U17E */
/* renamed from: l.᩺ۢۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22907 extends MediaDataSource {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f73842;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23411 f73843;

    public C22907(AbstractC15440 abstractC15440) {
        C23411 m36513 = abstractC15440.m36513("r");
        this.f73843 = m36513;
        this.f73842 = m36513.length();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        int read;
        synchronized (this.f73843) {
            this.f73843.seek(j);
            read = this.f73843.read(bArr, i, i2);
        }
        return read;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f73842;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f73843.close();
    }
}
