package l;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;

/* compiled from: 7B6P */
/* renamed from: l.۟ۜܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7307 implements Closeable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InputStream f22428;

    public final synchronized int readInt() {
        return m19583(0) | m19583(8) | m19583(16) | m19583(24);
    }

    public final synchronized short readShort() {
        return (short) (m19583(0) | m19583(8));
    }

    public final synchronized void skipBytes(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int i2 = 0;
        while (i2 < i) {
            int skip = (int) this.f22428.skip(i - i2);
            if (skip <= 0) {
                break;
            } else {
                i2 += skip;
            }
        }
        if (i2 != i) {
            throw new EOFException();
        }
    }

    /* renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public final synchronized int m19584() {
        return m19583(0) | m19583(8);
    }

    public C7307(InputStream inputStream) {
        this.f22428 = inputStream;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m19583(int i) {
        int read = this.f22428.read();
        if (read != -1) {
            return (read & 255) << i;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f22428.close();
    }
}
