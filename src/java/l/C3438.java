package l;

import java.io.Writer;

/* compiled from: Z4ZE */
/* renamed from: l.ۗ᩵ۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C3438 extends Writer {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final String f10862 = System.getProperty("line.separator");

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Writer f10863;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final char[] f10866 = new char[24];

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f10864 = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f10865 = true;

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        append(charSequence, i, i2);
        return this;
    }

    public C3438(Writer writer) {
        this.f10863 = writer;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo10514() {
        for (int i = 0; i < this.f10864; i++) {
            this.f10863.write(32);
        }
    }

    @Override // java.io.Writer
    public final void write(int i) {
        Writer writer = this.f10863;
        if (i == 10) {
            writer.write(f10862);
            this.f10865 = true;
        } else {
            if (this.f10865) {
                mo10514();
            }
            this.f10865 = false;
            writer.write(i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m10507(char[] cArr, int i, int i2) {
        if (this.f10865 && i2 > 0) {
            mo10514();
            this.f10865 = false;
        }
        this.f10863.write(cArr, i, i2);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            if (cArr[i] == '\n') {
                m10507(cArr, i4, i - i4);
                this.f10863.write(f10862);
                this.f10865 = true;
                i4 = i + 1;
                i = i4;
            } else {
                i++;
            }
        }
        m10507(cArr, i4, i - i4);
    }

    @Override // java.io.Writer
    public final void write(String str) {
        write(str, 0, str.length());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo10509(EnumC0841 enumC0841) {
        write(enumC0841.f3315);
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            i = str.indexOf(10, i4);
            Writer writer = this.f10863;
            if (i == -1 || i >= i3) {
                int i5 = i3 - i4;
                if (this.f10865 && i5 > 0) {
                    mo10514();
                    this.f10865 = false;
                }
                writer.write(str, i4, i5);
                return;
            }
            int i6 = i - i4;
            if (this.f10865 && i6 > 0) {
                mo10514();
                this.f10865 = false;
            }
            writer.write(str, i4, i6);
            writer.write(f10862);
            this.f10865 = true;
            i4 = i + 1;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        write(charSequence.toString());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        write(charSequence.subSequence(i, i2).toString());
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

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        this.f10863.flush();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10863.close();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m10512() {
        int i = this.f10864 + 4;
        this.f10864 = i;
        if (i < 0) {
            this.f10864 = 0;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10508() {
        int i = this.f10864 - 4;
        this.f10864 = i;
        if (i < 0) {
            this.f10864 = 0;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo10511(long j) {
        char[] cArr;
        int i;
        int i2 = 23;
        do {
            int i3 = (int) (15 & j);
            cArr = this.f10866;
            if (i3 < 10) {
                i = i2 - 1;
                cArr[i2] = (char) (i3 + 48);
            } else {
                i = i2 - 1;
                cArr[i2] = (char) (i3 + 87);
            }
            i2 = i;
            j >>>= 4;
        } while (j != 0);
        int i4 = i2 + 1;
        m10507(cArr, i4, 24 - i4);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m10513(int i) {
        if (i >= 0) {
            m10510(i);
            return;
        }
        long j = i & 4294967295L;
        int i2 = 23;
        if (j < 0) {
            j *= -1;
            write(45);
        }
        while (true) {
            int i3 = i2 - 1;
            char[] cArr = this.f10866;
            cArr[i2] = (char) ((j % 10) + 48);
            j /= 10;
            if (j == 0) {
                m10507(cArr, i2, 24 - i2);
                return;
            }
            i2 = i3;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10510(int i) {
        int i2 = 15;
        if (i < 0) {
            i *= -1;
            write(45);
        }
        while (true) {
            int i3 = i2 - 1;
            char[] cArr = this.f10866;
            cArr[i2] = (char) ((i % 10) + 48);
            i /= 10;
            if (i == 0) {
                m10507(cArr, i2, 16 - i2);
                return;
            }
            i2 = i3;
        }
    }
}
