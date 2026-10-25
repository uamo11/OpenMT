package l;

import java.io.Writer;

/* compiled from: 3AVF */
/* renamed from: l.ۜۧܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6725 extends Writer {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final char[] f20870;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final byte[] f20876;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final byte[] f20877;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f20878;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public char[] f20879;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f20880;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f20874 = new ThreadLocal();

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final int[] f20873 = {9, 99, EnumC3478.f11008, 9999, EnumC3478.f11018, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final char[] f20872 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final char[] f20875 = {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9'};

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final char[] f20869 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final char[] f20871 = new char[93];

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Writer append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    static {
        byte[] bArr = new byte[161];
        f20877 = bArr;
        byte[] bArr2 = new byte[161];
        f20876 = bArr2;
        bArr[0] = 4;
        bArr[1] = 4;
        bArr[2] = 4;
        bArr[3] = 4;
        bArr[4] = 4;
        bArr[5] = 4;
        bArr[6] = 4;
        bArr[7] = 4;
        bArr[8] = 1;
        bArr[9] = 1;
        bArr[10] = 1;
        bArr[11] = 4;
        bArr[12] = 1;
        bArr[13] = 1;
        bArr[34] = 1;
        bArr[92] = 1;
        bArr2[0] = 4;
        bArr2[1] = 4;
        bArr2[2] = 4;
        bArr2[3] = 4;
        bArr2[4] = 4;
        bArr2[5] = 4;
        bArr2[6] = 4;
        bArr2[7] = 4;
        bArr2[8] = 1;
        bArr2[9] = 1;
        bArr2[10] = 1;
        bArr2[11] = 4;
        bArr2[12] = 1;
        bArr2[13] = 1;
        bArr2[92] = 1;
        bArr2[39] = 1;
        for (int i = 14; i <= 31; i++) {
            f20877[i] = 4;
            f20876[i] = 4;
        }
        for (int i2 = 127; i2 < 160; i2++) {
            f20877[i2] = 4;
            f20876[i2] = 4;
        }
        char[] cArr = f20871;
        cArr[0] = '0';
        cArr[1] = '1';
        cArr[2] = '2';
        cArr[3] = '3';
        cArr[4] = '4';
        cArr[5] = '5';
        cArr[6] = '6';
        cArr[7] = '7';
        cArr[8] = 'b';
        cArr[9] = 't';
        cArr[10] = 'n';
        cArr[11] = 'v';
        cArr[12] = 'f';
        cArr[13] = 'r';
        cArr[34] = '\"';
        cArr[39] = '\'';
        cArr[47] = '/';
        cArr[92] = '\\';
        f20870 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public C6725(int i, EnumC20837[] enumC20837Arr) {
        ThreadLocal threadLocal = f20874;
        char[] cArr = (char[]) threadLocal.get();
        this.f20879 = cArr;
        if (cArr != null) {
            threadLocal.set(null);
        }
        if (this.f20879 == null) {
            this.f20879 = new char[1024];
        }
        for (EnumC20837 enumC20837 : enumC20837Arr) {
            i |= enumC20837.f67472;
        }
        this.f20878 = i;
    }

    @Override // java.io.Writer
    public final void write(int i) {
        int i2 = this.f20880 + 1;
        if (i2 > this.f20879.length) {
            m18300(i2);
        }
        this.f20879[this.f20880] = (char) i;
        this.f20880 = i2;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        int i3;
        if (i < 0 || i > cArr.length || i2 < 0 || (i3 = i + i2) > cArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        int i4 = this.f20880 + i2;
        if (i4 > this.f20879.length) {
            m18300(i4);
        }
        System.arraycopy(cArr, i, this.f20879, this.f20880, i2);
        this.f20880 = i4;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18300(int i) {
        char[] cArr = this.f20879;
        int m52580 = C23868.m52580(cArr.length, 3, 2, 1);
        if (m52580 >= i) {
            i = m52580;
        }
        char[] cArr2 = new char[i];
        System.arraycopy(cArr, 0, cArr2, 0, this.f20880);
        this.f20879 = cArr2;
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        int i3 = this.f20880 + i2;
        if (i3 > this.f20879.length) {
            m18300(i3);
        }
        str.getChars(i, i2 + i, this.f20879, this.f20880);
        this.f20880 = i3;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final void append(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "null" : charSequence.toString();
        write(charSequence2, 0, charSequence2.length());
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        write(charSequence2, 0, charSequence2.length());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        write(charSequence2, 0, charSequence2.length());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c) {
        write(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c) {
        write(c);
        return this;
    }

    public final String toString() {
        return new String(this.f20879, 0, this.f20880);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        char[] cArr = this.f20879;
        if (cArr.length <= 8192) {
            f20874.set(cArr);
        }
        this.f20879 = null;
    }

    @Override // java.io.Writer
    public final void write(String str) {
        if (str == null) {
            m18296();
        } else {
            write(str, 0, str.length());
        }
    }

    public final void writeInt(int i) {
        if (i == Integer.MIN_VALUE) {
            write("-2147483648");
            return;
        }
        int i2 = 0;
        while ((i < 0 ? -i : i) > f20873[i2]) {
            i2++;
        }
        int i3 = i2 + 1;
        if (i < 0) {
            i3 = i2 + 2;
        }
        int i4 = this.f20880 + i3;
        if (i4 > this.f20879.length) {
            m18300(i4);
        }
        m18295(i, i4, this.f20879);
        this.f20880 = i4;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18301(long j) {
        if (j == Long.MIN_VALUE) {
            write("-9223372036854775808");
            return;
        }
        long j2 = j < 0 ? -j : j;
        int i = 1;
        long j3 = 10;
        while (true) {
            if (i >= 19) {
                i = 0;
                break;
            } else {
                if (j2 < j3) {
                    break;
                }
                j3 *= 10;
                i++;
            }
        }
        int i2 = i != 0 ? i : 19;
        if (j < 0) {
            i2++;
        }
        int i3 = this.f20880 + i2;
        if (i3 > this.f20879.length) {
            m18300(i3);
        }
        m18295(j, i3, this.f20879);
        this.f20880 = i3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18296() {
        write("null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r5 == (-1)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        r5 = r7;
        r6 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0094, code lost:
    
        if (r5 == (-1)) goto L56;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m18298(java.lang.String r13, char r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6725.m18298(java.lang.String, char, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18297(String str) {
        if ((EnumC20837.UseSingleQuotes.f67472 & this.f20878) != 0) {
            m18302(str);
        } else {
            m18298(str, (char) 0, true);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18302(String str) {
        int i = 0;
        if (str == null) {
            int i2 = this.f20880 + 4;
            if (i2 > this.f20879.length) {
                m18300(i2);
            }
            "null".getChars(0, 4, this.f20879, this.f20880);
            this.f20880 = i2;
            return;
        }
        int length = str.length();
        int i3 = this.f20880 + length + 2;
        if (i3 > this.f20879.length) {
            m18300(i3);
        }
        int i4 = this.f20880;
        int i5 = i4 + 1;
        int i6 = i5 + length;
        char[] cArr = this.f20879;
        cArr[i4] = '\'';
        str.getChars(0, length, cArr, i5);
        this.f20880 = i3;
        char c = 0;
        int i7 = -1;
        for (int i8 = i5; i8 < i6; i8++) {
            char c2 = this.f20879[i8];
            if (c2 <= '\r' || c2 == '\\' || c2 == '\'' || (c2 == '/' && (EnumC20837.WriteSlashAsSpecial.f67472 & this.f20878) != 0)) {
                i++;
                i7 = i8;
                c = c2;
            }
        }
        int i9 = i3 + i;
        if (i9 > this.f20879.length) {
            m18300(i9);
        }
        this.f20880 = i9;
        char[] cArr2 = f20871;
        if (i == 1) {
            char[] cArr3 = this.f20879;
            int i10 = i7 + 1;
            System.arraycopy(cArr3, i10, cArr3, i7 + 2, (i6 - i7) - 1);
            char[] cArr4 = this.f20879;
            cArr4[i7] = '\\';
            cArr4[i10] = cArr2[c];
        } else if (i > 1) {
            char[] cArr5 = this.f20879;
            int i11 = i7 + 1;
            System.arraycopy(cArr5, i11, cArr5, i7 + 2, (i6 - i7) - 1);
            char[] cArr6 = this.f20879;
            cArr6[i7] = '\\';
            cArr6[i11] = cArr2[c];
            int i12 = i6 + 1;
            while (true) {
                i7--;
                if (i7 < i5) {
                    break;
                }
                char[] cArr7 = this.f20879;
                char c3 = cArr7[i7];
                if (c3 <= '\r' || c3 == '\\' || c3 == '\'' || (c3 == '/' && (EnumC20837.WriteSlashAsSpecial.f67472 & this.f20878) != 0)) {
                    int i13 = i7 + 1;
                    System.arraycopy(cArr7, i13, cArr7, i7 + 2, (i12 - i7) - 1);
                    char[] cArr8 = this.f20879;
                    cArr8[i7] = '\\';
                    cArr8[i13] = cArr2[c3];
                    i12++;
                }
            }
        }
        this.f20879[this.f20880 - 1] = '\'';
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18299(String str, boolean z) {
        int i;
        int i2 = EnumC20837.UseSingleQuotes.f67472;
        int i3 = this.f20878;
        int i4 = i2 & i3;
        int i5 = 0;
        char c = '\\';
        char[] cArr = f20871;
        if (i4 != 0) {
            if ((EnumC20837.QuoteFieldNames.f67472 & i3) != 0) {
                m18302(str);
                write(58);
                return;
            }
            int length = str.length();
            int i6 = this.f20880 + length + 1;
            if (i6 > this.f20879.length) {
                m18300(i6);
            }
            char c2 = '\'';
            if (length == 0) {
                int i7 = this.f20880 + 3;
                if (i7 > this.f20879.length) {
                    m18300(i7);
                }
                char[] cArr2 = this.f20879;
                int i8 = this.f20880;
                int i9 = i8 + 1;
                this.f20880 = i9;
                cArr2[i8] = '\'';
                int i10 = i8 + 2;
                this.f20880 = i10;
                cArr2[i9] = '\'';
                this.f20880 = i8 + 3;
                cArr2[i10] = ':';
                return;
            }
            int i11 = this.f20880;
            int i12 = i11 + length;
            str.getChars(0, length, this.f20879, i11);
            this.f20880 = i6;
            boolean z2 = false;
            int i13 = i11;
            while (i13 < i12) {
                char[] cArr3 = this.f20879;
                char c3 = cArr3[i13];
                byte[] bArr = f20876;
                if (c3 < bArr.length && bArr[c3] != 0) {
                    if (!z2) {
                        i6 += 3;
                        if (i6 > cArr3.length) {
                            m18300(i6);
                        }
                        this.f20880 = i6;
                        char[] cArr4 = this.f20879;
                        int i14 = i13 + 1;
                        System.arraycopy(cArr4, i14, cArr4, i13 + 3, (i12 - i13) - 1);
                        char[] cArr5 = this.f20879;
                        System.arraycopy(cArr5, 0, cArr5, 1, i13);
                        char[] cArr6 = this.f20879;
                        cArr6[i11] = c2;
                        cArr6[i14] = c;
                        i13 += 2;
                        cArr6[i13] = cArr[c3];
                        i12 += 2;
                        cArr6[this.f20880 - 2] = c2;
                        z2 = true;
                    } else {
                        i6++;
                        if (i6 > cArr3.length) {
                            m18300(i6);
                        }
                        this.f20880 = i6;
                        char[] cArr7 = this.f20879;
                        i = i13 + 1;
                        System.arraycopy(cArr7, i, cArr7, i13 + 2, i12 - i13);
                        char[] cArr8 = this.f20879;
                        cArr8[i13] = '\\';
                        cArr8[i] = cArr[c3];
                        i12++;
                        i13 = i + 1;
                        c = '\\';
                        c2 = '\'';
                    }
                }
                i = i13;
                i13 = i + 1;
                c = '\\';
                c2 = '\'';
            }
            this.f20879[i6 - 1] = ':';
            return;
        }
        if ((i3 & EnumC20837.QuoteFieldNames.f67472) != 0) {
            m18298(str, ':', z);
            return;
        }
        int length2 = str.length();
        int i15 = this.f20880 + length2 + 1;
        if (i15 > this.f20879.length) {
            m18300(i15);
        }
        if (length2 == 0) {
            int i16 = this.f20880 + 3;
            if (i16 > this.f20879.length) {
                m18300(i16);
            }
            char[] cArr9 = this.f20879;
            int i17 = this.f20880;
            int i18 = i17 + 1;
            this.f20880 = i18;
            cArr9[i17] = '\"';
            int i19 = i17 + 2;
            this.f20880 = i19;
            cArr9[i18] = '\"';
            this.f20880 = i17 + 3;
            cArr9[i19] = ':';
            return;
        }
        int i20 = this.f20880;
        int i21 = i20 + length2;
        str.getChars(0, length2, this.f20879, i20);
        this.f20880 = i15;
        boolean z3 = false;
        int i22 = i20;
        while (i22 < i21) {
            char[] cArr10 = this.f20879;
            char c4 = cArr10[i22];
            byte[] bArr2 = f20877;
            if (c4 < bArr2.length && bArr2[c4] != 0) {
                if (!z3) {
                    i15 += 3;
                    if (i15 > cArr10.length) {
                        m18300(i15);
                    }
                    this.f20880 = i15;
                    char[] cArr11 = this.f20879;
                    int i23 = i22 + 1;
                    System.arraycopy(cArr11, i23, cArr11, i22 + 3, (i21 - i22) - 1);
                    char[] cArr12 = this.f20879;
                    System.arraycopy(cArr12, i5, cArr12, 1, i22);
                    char[] cArr13 = this.f20879;
                    cArr13[i20] = '\"';
                    cArr13[i23] = '\\';
                    i22 += 2;
                    cArr13[i22] = cArr[c4];
                    i21 += 2;
                    cArr13[this.f20880 - 2] = '\"';
                    z3 = true;
                } else {
                    i15++;
                    if (i15 > cArr10.length) {
                        m18300(i15);
                    }
                    this.f20880 = i15;
                    char[] cArr14 = this.f20879;
                    int i24 = i22 + 1;
                    System.arraycopy(cArr14, i24, cArr14, i22 + 2, i21 - i22);
                    char[] cArr15 = this.f20879;
                    cArr15[i22] = '\\';
                    cArr15[i24] = cArr[c4];
                    i21++;
                    i22 = i24;
                }
            }
            i22++;
            i5 = 0;
        }
        this.f20879[this.f20880 - 1] = ':';
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18295(long j, int i, char[] cArr) {
        char c;
        char[] cArr2;
        char[] cArr3;
        if (j < 0) {
            j = -j;
            c = '-';
        } else {
            c = 0;
        }
        while (true) {
            cArr2 = f20875;
            cArr3 = f20869;
            if (j <= 2147483647L) {
                break;
            }
            long j2 = j / 100;
            int i2 = (int) (j - (((j2 << 6) + (j2 << 5)) + (j2 << 2)));
            cArr[i - 1] = cArr3[i2];
            i -= 2;
            cArr[i] = cArr2[i2];
            j = j2;
        }
        int i3 = (int) j;
        while (i3 >= 65536) {
            int i4 = i3 / 100;
            int i5 = i3 - (((i4 << 6) + (i4 << 5)) + (i4 << 2));
            cArr[i - 1] = cArr3[i5];
            i -= 2;
            cArr[i] = cArr2[i5];
            i3 = i4;
        }
        while (true) {
            int i6 = (52429 * i3) >>> 19;
            int i7 = i - 1;
            cArr[i7] = f20872[i3 - ((i6 << 3) + (i6 << 1))];
            if (i6 == 0) {
                break;
            }
            i3 = i6;
            i = i7;
        }
        if (c != 0) {
            cArr[i - 2] = c;
        }
    }
}
