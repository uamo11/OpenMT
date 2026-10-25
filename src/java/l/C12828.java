package l;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/* compiled from: FAPP */
/* renamed from: l.۬ۖܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12828 extends Reader {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f38518;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f38519;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f38520;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f38521;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public char[] f38522;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InputStreamReader f38523;

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    public C12828(InputStreamReader inputStreamReader) {
        super(inputStreamReader);
        this.f38521 = -1;
        this.f38520 = 0;
        this.f38523 = inputStreamReader;
        this.f38522 = new char[8192];
        this.f38519 = 0;
        this.f38518 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31203() {
        if (this.f38523 == null) {
            throw new IOException("Stream closed");
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m31204() {
        int read;
        int i = this.f38521;
        int i2 = 0;
        if (i > -1) {
            int i3 = this.f38518 - i;
            int i4 = this.f38520;
            if (i3 >= i4) {
                this.f38521 = -2;
                this.f38520 = 0;
            } else {
                char[] cArr = this.f38522;
                if (i4 <= cArr.length) {
                    System.arraycopy(cArr, i, cArr, 0, i3);
                    this.f38521 = 0;
                } else {
                    int length = cArr.length * 2;
                    if (length <= i4) {
                        i4 = length;
                    }
                    char[] cArr2 = new char[i4];
                    System.arraycopy(cArr, i, cArr2, 0, i3);
                    this.f38522 = cArr2;
                    this.f38521 = 0;
                }
                this.f38519 = i3;
                this.f38518 = i3;
                i2 = i3;
            }
        }
        do {
            InputStreamReader inputStreamReader = this.f38523;
            char[] cArr3 = this.f38522;
            read = inputStreamReader.read(cArr3, i2, cArr3.length - i2);
        } while (read == 0);
        if (read > 0) {
            this.f38519 = read + i2;
            this.f38518 = i2;
        }
    }

    @Override // java.io.Reader
    public final int read() {
        m31203();
        if (this.f38518 >= this.f38519) {
            m31204();
            if (this.f38518 >= this.f38519) {
                return -1;
            }
        }
        char[] cArr = this.f38522;
        int i = this.f38518;
        this.f38518 = i + 1;
        return cArr[i];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m31202(char[] cArr, int i, int i2) {
        if (this.f38518 >= this.f38519) {
            if (i2 >= this.f38522.length && this.f38521 <= -1) {
                return this.f38523.read(cArr, i, i2);
            }
            m31204();
        }
        int i3 = this.f38518;
        int i4 = this.f38519;
        if (i3 >= i4) {
            return -1;
        }
        int min = Math.min(i2, i4 - i3);
        System.arraycopy(this.f38522, this.f38518, cArr, i, min);
        this.f38518 += min;
        return min;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        int i3;
        m31203();
        if (i < 0 || i > cArr.length || i2 < 0 || (i3 = i + i2) > cArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int m31202 = m31202(cArr, i, i2);
        if (m31202 <= 0) {
            return m31202;
        }
        while (m31202 < i2 && this.f38523.ready()) {
            int m312022 = m31202(cArr, i + m31202, i2 - m31202);
            if (m312022 <= 0) {
                break;
            }
            m31202 += m312022;
        }
        return m31202;
    }

    @Override // java.io.Reader
    public final long skip(long j) {
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("skip value is negative");
        }
        m31203();
        long j3 = j;
        while (j3 > 0) {
            if (this.f38518 >= this.f38519) {
                m31204();
            }
            int i = this.f38518;
            int i2 = this.f38519;
            if (i >= i2) {
                break;
            }
            long j4 = i2 - i;
            if (j3 <= j4) {
                this.f38518 = (int) (i + j3);
                break;
            }
            j3 -= j4;
            this.f38518 = i2;
        }
        j2 = j3;
        return j - j2;
    }

    @Override // java.io.Reader
    public final boolean ready() {
        m31203();
        return this.f38518 < this.f38519 || this.f38523.ready();
    }

    @Override // java.io.Reader
    public final void mark(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Read-ahead limit < 0");
        }
        m31203();
        this.f38520 = i;
        this.f38521 = this.f38518;
    }

    @Override // java.io.Reader
    public final void reset() {
        m31203();
        int i = this.f38521;
        if (i < 0) {
            throw new IOException(this.f38521 == -2 ? "Mark invalid" : "Stream not marked");
        }
        this.f38518 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStreamReader inputStreamReader = this.f38523;
        if (inputStreamReader == null) {
            return;
        }
        try {
            inputStreamReader.close();
        } finally {
            this.f38523 = null;
            this.f38522 = null;
        }
    }
}
