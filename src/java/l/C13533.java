package l;

import java.io.OutputStream;
import java.io.Writer;
import org.bouncycastle.asn1.BERTags;

/* compiled from: 1AQN */
/* renamed from: l.ܰۖܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13533 extends Writer {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f40386;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public char f40387;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final OutputStream f40388;

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    public C13533(OutputStream outputStream) {
        this.f40388 = outputStream;
    }

    @Override // java.io.Writer
    public final void write(int i) {
        boolean z = this.f40386;
        OutputStream outputStream = this.f40388;
        if (z) {
            this.f40386 = false;
            char c = (char) i;
            int codePoint = Character.isLowSurrogate(c) ? Character.toCodePoint(this.f40387, c) : -1;
            if (codePoint < 0) {
                outputStream.write(63);
            } else {
                outputStream.write((codePoint >> 18) | 240);
                outputStream.write(((codePoint >> 12) & 63) | 128);
                outputStream.write(((codePoint >> 6) & 63) | 128);
                outputStream.write((codePoint & 63) | 128);
                return;
            }
        }
        if (i < 128) {
            outputStream.write((byte) i);
            return;
        }
        if (i < 2048) {
            outputStream.write(((i >> 6) & 31) | 192);
            outputStream.write((i & 63) | 128);
            return;
        }
        if (i >= 55296 && i <= 57343) {
            char c2 = (char) i;
            if (Character.isHighSurrogate(c2)) {
                this.f40387 = c2;
                this.f40386 = true;
                return;
            } else {
                outputStream.write(63);
                return;
            }
        }
        outputStream.write(((i >> 12) & 15) | BERTags.FLAGS);
        outputStream.write(((i >> 6) & 63) | 128);
        outputStream.write((i & 63) | 128);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(char[] r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13533.write(char[], int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m32575(int r10, int r11, java.lang.CharSequence r12) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13533.m32575(int, int, java.lang.CharSequence):void");
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        m32575(i, i2, str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        m32575(0, charSequence.length(), charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        m32575(i, i2 - i, charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        m32575(i, i2 - i, charSequence);
        return this;
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        this.f40388.flush();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z = this.f40386;
        OutputStream outputStream = this.f40388;
        if (z) {
            this.f40386 = false;
            outputStream.write(63);
        }
        outputStream.close();
    }
}
