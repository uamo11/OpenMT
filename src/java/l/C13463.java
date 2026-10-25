package l;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import java.io.Closeable;

/* compiled from: Q8FL */
/* renamed from: l.ܰ֡ۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13463 implements Closeable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f40193;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final MediaDataSource f40194;

    public C13463(MediaDataSource mediaDataSource) {
        this.f40194 = mediaDataSource;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32483(MediaMetadataRetriever mediaMetadataRetriever) {
        mediaMetadataRetriever.setDataSource(this.f40194);
        MediaDataSource mediaDataSource = this.f40194;
        if (mediaDataSource instanceof C6282) {
            ((C6282) mediaDataSource).m17327();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f40193) {
            return;
        }
        this.f40193 = true;
        this.f40194.close();
    }
}
