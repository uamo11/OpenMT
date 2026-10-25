package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: N673 */
/* renamed from: l.ܳ᩸ᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14800 implements Iterator, Closeable {
    public final C19741 a;
    public C16211 b;

    public C14800(InterfaceC20758 interfaceC20758, EnumC10880... enumC10880Arr) {
        C19741 c19741 = new C19741(Arrays.asList(enumC10880Arr), Integer.MAX_VALUE);
        this.a = c19741;
        if (c19741.e) {
            throw new IllegalStateException("Closed");
        }
        C16211 e = c19741.e(interfaceC20758, false);
        this.b = e;
        IOException iOException = e.d;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void b() {
        if (this.b == null) {
            C16211 d = this.a.d();
            while (d != null) {
                IOException iOException = d.d;
                if (iOException != null) {
                    throw new UncheckedIOException(iOException);
                }
                if (d.a != EnumC4218.END_DIRECTORY) {
                    this.b = d;
                    return;
                }
                d = this.a.d();
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a.e) {
            throw new IllegalStateException();
        }
        b();
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a.e) {
            throw new IllegalStateException();
        }
        b();
        C16211 c16211 = this.b;
        if (c16211 == null) {
            throw new NoSuchElementException();
        }
        this.b = null;
        return c16211;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
