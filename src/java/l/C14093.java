package l;

import android.text.GetChars;

/* compiled from: 06R7 */
/* renamed from: l.ܰ᩸ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14093 implements CharSequence, GetChars {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7744 f42558;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f42559;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C23287 f42560;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f42561;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public char[] f42562;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C21172 f42563;

    public C14093(C7744 c7744) {
        this.f42558 = c7744;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        int i;
        C7744 c7744 = this.f42558;
        c7744.m20761();
        i = c7744.f23958;
        return i;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < this.f42559 || i >= this.f42561) {
            m33699(i);
        }
        return this.f42562[i - this.f42559];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char[] m33702(int i) {
        if (i < this.f42559 || i >= this.f42561) {
            m33699(i);
        }
        return this.f42562;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m33701() {
        return this.f42559;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m33700() {
        return this.f42561;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m33699(int i) {
        int i2;
        int i3;
        C12704 c12704;
        C12704 c127042;
        C7744 c7744 = this.f42558;
        c7744.m20761();
        if (i >= 0) {
            i2 = c7744.f23958;
            if (i < i2) {
                c7744.m20756();
                int i4 = this.f42561;
                int min = i == i4 ? Math.min(512, i4 - this.f42559) : 0;
                if (min != 0) {
                    i = this.f42561 - min;
                } else if (i < this.f42559) {
                    i = Math.max(0, i - 512);
                }
                if (min != 0) {
                    char[] cArr = this.f42562;
                    System.arraycopy(cArr, (this.f42561 - this.f42559) - min, cArr, 0, min);
                }
                this.f42561 = 0;
                this.f42559 = 0;
                if (this.f42560 == null) {
                    c127042 = c7744.f23966;
                    C23287 c23287 = new C23287(c127042.m32420().f35930, 2048);
                    this.f42560 = c23287;
                    this.f42562 = c23287.m51607();
                }
                int i5 = min + i;
                i3 = c7744.f23958;
                int min2 = Math.min(2048, i3 - i) + i;
                C21172 c21172 = this.f42563;
                if (c21172 == null) {
                    c12704 = c7744.f23966;
                    this.f42563 = c12704.mo27940(i5);
                } else if (c21172.position() != i5) {
                    this.f42563.m48112(i5);
                }
                while (i5 < min2) {
                    c7744.m20756();
                    int min3 = Math.min(1024, min2 - i5);
                    this.f42563.m48113(this.f42562, i5 - i, min3);
                    i5 += min3;
                }
                this.f42559 = i;
                this.f42561 = min2;
                return;
            }
        }
        throw new IndexOutOfBoundsException("Invalid character index");
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        int i4;
        C7744 c7744 = this.f42558;
        c7744.m20761();
        i4 = c7744.f23958;
        C11999.m29337(i, i2, i4);
        C13409.m32419(cArr, i3, i2 - i);
        while (i < i2) {
            c7744.m20756();
            if (i < this.f42559 || i >= this.f42561) {
                m33699(i);
            }
            int min = Math.min(i2, this.f42561) - i;
            System.arraycopy(this.f42562, i - this.f42559, cArr, i3, min);
            i += min;
            i3 += min;
        }
    }

    @Override // java.lang.CharSequence
    public final String subSequence(int i, int i2) {
        int i3;
        C7744 c7744 = this.f42558;
        c7744.m20761();
        i3 = c7744.f23958;
        C11999.m29337(i, i2, i3);
        c7744.m20756();
        if (i == i2) {
            return "";
        }
        int i4 = this.f42559;
        if (i >= i4 && i2 <= this.f42561) {
            return new String(this.f42562, i - i4, i2 - i);
        }
        char[] cArr = new char[i2 - i];
        getChars(i, i2, cArr, 0);
        return new String(cArr);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i;
        i = this.f42558.f23958;
        return subSequence(0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33698(C14093 c14093) {
        c14093.f42561 = 0;
        c14093.f42559 = 0;
        c14093.f42562 = null;
        try {
            C21172 c21172 = c14093.f42563;
            if (c21172 != null) {
                c21172.close();
            }
        } finally {
            c14093.f42563 = null;
            C23287 c23287 = c14093.f42560;
            if (c23287 != null) {
                c23287.close();
                c14093.f42560 = null;
            }
        }
    }
}
