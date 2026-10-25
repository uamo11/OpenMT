package l;

import android.graphics.Bitmap;

/* compiled from: B75R */
/* renamed from: l.۠ۚۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7965 implements AutoCloseable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Bitmap f24606;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21270(Bitmap bitmap) {
        if (this.f24606 != null) {
            throw new IllegalStateException("MPEG-TS preview bitmap is already owned");
        }
        this.f24606 = bitmap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21271() {
        return this.f24606 != null;
    }

    public final Bitmap take() {
        Bitmap bitmap = this.f24606;
        C11003.requireNonNull(bitmap);
        this.f24606 = null;
        return bitmap;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Bitmap bitmap = this.f24606;
        this.f24606 = null;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }
}
