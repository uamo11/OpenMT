package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;

/* compiled from: 6AJN */
/* renamed from: l.ۘᩴܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4131 implements CharSequence, Closeable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InputStreamReader f13093;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f13094;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f13095;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final char[] f13096 = new char[943718];

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f13097 = true;

    public C4131(InputStreamReader inputStreamReader) {
        this.f13093 = inputStreamReader;
        m12407();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m12410(C11459 c11459, InterfaceC17066 interfaceC17066, boolean z) {
        C12164 matcher = c11459.matcher((CharSequence) this);
        m12409(interfaceC17066, z);
        if (length() < 524288) {
            boolean find = matcher.find();
            m12408(matcher, find, interfaceC17066, z);
            return find;
        }
        for (int i = 0; i < 5120; i++) {
            boolean m29602 = matcher.m29602(i);
            m12408(matcher, m29602, interfaceC17066, z);
            if (m29602) {
                return true;
            }
        }
        while (true) {
            boolean m296022 = matcher.m29602(5120);
            m12408(matcher, m296022, interfaceC17066, z);
            if (m296022) {
                return true;
            }
            int i2 = this.f13095;
            int i3 = this.f13094;
            if (i2 - i3 > 524288) {
                this.f13094 = i3 + 1;
            } else {
                if (!this.f13097 || interfaceC17066.mo1526()) {
                    break;
                }
                m12407();
                int i4 = this.f13095;
                int i5 = this.f13094;
                if (i4 - i5 <= 524288) {
                    break;
                }
                this.f13094 = i5 + 1;
            }
        }
        if (interfaceC17066.mo1526()) {
            m12409(interfaceC17066, z);
            return false;
        }
        boolean find2 = matcher.find(5121);
        m12408(matcher, find2, interfaceC17066, z);
        return find2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12408(C12164 c12164, boolean z, InterfaceC17066 interfaceC17066, boolean z2) {
        m12409(interfaceC17066, z2);
        if (!z2 || z) {
            return;
        }
        if (c12164.m29603() || c12164.m29613()) {
            throw new IOException("Regex matching did not complete.");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12409(InterfaceC17066 interfaceC17066, boolean z) {
        if (z && interfaceC17066.mo1526()) {
            throw new InterruptedIOException("Content search canceled.");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m12407() {
        if (!this.f13097) {
            return;
        }
        int i = this.f13095;
        int i2 = this.f13094;
        int i3 = i - i2;
        char[] cArr = this.f13096;
        if (i3 > 0) {
            System.arraycopy(cArr, i2, cArr, 0, i3);
        }
        this.f13094 = 0;
        this.f13095 = i3;
        while (true) {
            int length = cArr.length;
            int i4 = this.f13095;
            int i5 = length - i4;
            if (i5 == 0) {
                return;
            }
            InputStreamReader inputStreamReader = this.f13093;
            int read = inputStreamReader.read(cArr, i4, i5);
            if (read == -1) {
                inputStreamReader.close();
                this.f13097 = false;
                return;
            }
            this.f13095 += read;
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return Math.min(this.f13095 - this.f13094, 524288);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= length()) {
            throw new IndexOutOfBoundsException();
        }
        return this.f13096[i + this.f13094];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0 || i2 < i || i2 > length()) {
            throw new IndexOutOfBoundsException();
        }
        return new String(this.f13096, this.f13094 + i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f13096, this.f13094, length());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f13097) {
            this.f13093.close();
            this.f13097 = false;
        }
    }
}
