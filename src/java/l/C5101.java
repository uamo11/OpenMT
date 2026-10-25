package l;

import java.io.Closeable;

/* compiled from: R6VA */
/* renamed from: l.ۚۘۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5101 implements Closeable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Closeable f16001;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        Closeable closeable = this.f16001;
        if (closeable == null) {
            return;
        }
        this.f16001 = null;
        closeable.close();
    }

    public C5101(Closeable closeable) {
        this.f16001 = closeable;
    }
}
