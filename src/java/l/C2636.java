package l;

/* compiled from: Y74I */
/* renamed from: l.ۖܺܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2636 implements CharSequence {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public char[] f8324 = new char[64];

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f8325;

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f8325;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i >= 0 && i < this.f8325) {
            return this.f8324[i];
        }
        StringBuilder m32308 = C13325.m32308(i, "index = ", ", length = ");
        m32308.append(this.f8325);
        throw new IndexOutOfBoundsException(m32308.toString());
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i >= 0 && i2 <= this.f8325 && i <= i2) {
            return new String(this.f8324, i, i2 - i);
        }
        StringBuilder m46682 = C20361.m46682("start = ", i, ", end = ", ", length = ", i2);
        m46682.append(this.f8325);
        throw new IndexOutOfBoundsException(m46682.toString());
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f8324, 0, this.f8325);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8293(int i, int i2, int i3, String str) {
        char m12148;
        int i4 = i2 - i;
        char[] cArr = this.f8324;
        if (cArr.length < i4) {
            int length = cArr.length;
            while (length < i4) {
                length *= 2;
            }
            this.f8324 = new char[length];
        }
        for (int i5 = 0; i5 < i4; i5++) {
            char[] cArr2 = this.f8324;
            m12148 = C4047.m12148(str.charAt(i + i5), i3);
            cArr2[i5] = m12148;
        }
        this.f8325 = i4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8294(int i, int i2, String str) {
        int i3 = i2 - i;
        int i4 = i3 + 2;
        char[] cArr = this.f8324;
        if (cArr.length < i4) {
            int length = cArr.length;
            while (length < i4) {
                length *= 2;
            }
            this.f8324 = new char[length];
        }
        char[] cArr2 = this.f8324;
        cArr2[0] = 'L';
        str.getChars(i, i2, cArr2, 1);
        this.f8324[i3 + 1] = ';';
        this.f8325 = i4;
    }
}
