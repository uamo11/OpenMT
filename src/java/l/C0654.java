package l;

import java.io.Writer;

/* compiled from: G5WC */
/* renamed from: l.֡᩷֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0654 extends Writer {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public StringBuilder f2505 = new StringBuilder(128);

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m2674();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m2674();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m2674();
            } else {
                this.f2505.append(c);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m2674() {
        StringBuilder sb = this.f2505;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }
}
