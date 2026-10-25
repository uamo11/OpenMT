package l;

import java.io.IOException;
import java.io.Reader;

/* compiled from: U6QB */
/* renamed from: l.ۘۙᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3720 extends Reader {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Reader f11755;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f11756;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f11757;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f11758;

    public C3720(Reader reader) {
        C11003.requireNonNull(reader);
        this.f11755 = reader;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m11311() {
        return this.f11758;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m11312() {
        return this.f11756;
    }

    @Override // java.io.Reader
    public final int read() {
        int read;
        if (this.f11755 == null) {
            throw new IOException("Line normalizer is closed");
        }
        if (this.f11757) {
            return -1;
        }
        while (true) {
            read = this.f11755.read();
            if (read == -1) {
                if (this.f11758 == 0) {
                    this.f11758 = this.f11756 ? 2 : 1;
                }
                this.f11756 = false;
                this.f11757 = true;
                return -1;
            }
            if (this.f11756) {
                this.f11756 = false;
                if (this.f11758 == 0) {
                    this.f11758 = read == 10 ? 3 : 2;
                }
                if (read != 10) {
                    if (read == 13) {
                        return 10;
                    }
                }
            } else if (read == 13) {
                this.f11756 = true;
                return 10;
            }
        }
        return read;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0090, code lost:
    
        if (r1 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0093, code lost:
    
        return r1;
     */
    @Override // java.io.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(char[] r11, int r12, int r13) {
        /*
            r10 = this;
            java.io.Reader r0 = r10.f11755
            if (r0 == 0) goto L94
            l.C13409.m32419(r11, r12, r13)
            r0 = 0
            if (r13 != 0) goto Lb
            return r0
        Lb:
            boolean r1 = r10.f11757
            r2 = -1
            if (r1 == 0) goto L12
            goto L92
        L12:
            r1 = 0
        L13:
            if (r1 >= r13) goto L90
            java.io.Reader r3 = r10.f11755
            int r4 = r12 + r1
            int r5 = r13 - r1
            int r3 = r3.read(r11, r4, r5)
            r6 = 2
            r7 = 1
            if (r3 != r2) goto L35
            int r11 = r10.f11758
            if (r11 != 0) goto L2f
            boolean r11 = r10.f11756
            if (r11 == 0) goto L2c
            goto L2d
        L2c:
            r6 = 1
        L2d:
            r10.f11758 = r6
        L2f:
            r10.f11756 = r0
            r10.f11757 = r7
            goto L90
        L35:
            if (r3 <= 0) goto L88
            if (r3 > r5) goto L88
            int r3 = r3 + r4
        L3a:
            if (r4 >= r3) goto L13
            boolean r5 = r10.f11756
            r6 = 13
            r8 = 10
            if (r5 == 0) goto L65
            int r5 = r4 + 1
            char r4 = r11[r4]
            r10.f11756 = r0
            int r9 = r10.f11758
            if (r9 != 0) goto L55
            if (r4 != r8) goto L52
            r9 = 3
            goto L53
        L52:
            r9 = 2
        L53:
            r10.f11758 = r9
        L55:
            if (r4 != r8) goto L59
        L57:
            r4 = r5
            goto L3a
        L59:
            int r9 = r1 + 1
            int r1 = r1 + r12
            if (r4 != r6) goto L5f
            goto L60
        L5f:
            r8 = r4
        L60:
            r11[r1] = r8
            r4 = r5
            r1 = r9
            goto L3a
        L65:
            r5 = r4
        L66:
            if (r5 >= r3) goto L6f
            char r9 = r11[r5]
            if (r9 == r6) goto L6f
            int r5 = r5 + 1
            goto L66
        L6f:
            int r6 = r5 - r4
            if (r6 == 0) goto L7b
            int r9 = r12 + r1
            if (r9 == r4) goto L7a
            java.lang.System.arraycopy(r11, r4, r11, r9, r6)
        L7a:
            int r1 = r1 + r6
        L7b:
            if (r5 >= r3) goto L57
            int r5 = r5 + 1
            int r4 = r1 + 1
            int r1 = r1 + r12
            r11[r1] = r8
            r10.f11756 = r7
            r1 = r4
            goto L57
        L88:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "Text normalizer input made invalid progress"
            r11.<init>(r12)
            throw r11
        L90:
            if (r1 != 0) goto L93
        L92:
            return r2
        L93:
            return r1
        L94:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "Line normalizer is closed"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3720.read(char[], int, int):int");
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Reader reader = this.f11755;
        this.f11755 = null;
        if (reader != null) {
            reader.close();
        }
    }
}
