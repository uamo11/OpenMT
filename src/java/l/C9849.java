package l;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* compiled from: Z728 */
/* renamed from: l.ۢ᩸֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9849 extends BufferedOutputStream {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f29811;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f29811 = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        String str = C3603.f11424;
        throw th;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24920(OutputStream outputStream) {
        C22632.m50634(this.f29811);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f29811 = false;
    }
}
