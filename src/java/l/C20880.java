package l;

import android.text.GetChars;

/* compiled from: 56O8 */
/* renamed from: l.᩷۫ᩳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20880 implements InterfaceC23008, GetChars {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7744 f67569;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f67570;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f67571;

    public C20880(C7744 c7744, int i, int i2) {
        if (i2 < 0 || i < 0 || i > c7744.length() - i2) {
            throw new IndexOutOfBoundsException("Invalid deletion preview range");
        }
        this.f67569 = c7744;
        this.f67571 = i;
        this.f67570 = i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f67569.length() - this.f67570;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= length()) {
            throw new IndexOutOfBoundsException("Invalid preview index");
        }
        if (i >= this.f67571) {
            i += this.f67570;
        }
        return this.f67569.charAt(i);
    }

    @Override // l.InterfaceC23008
    public final int indexOf(char c, int i, int i2) {
        int max = Math.max(0, i);
        int min = Math.min(length(), i2);
        if (max >= min) {
            return -1;
        }
        C7744 c7744 = this.f67569;
        int i3 = this.f67571;
        if (max < i3) {
            int indexOf = c7744.indexOf(c, max, Math.min(i3, min));
            if (indexOf >= 0) {
                return indexOf;
            }
            max = i3;
        }
        if (max >= min) {
            return -1;
        }
        int i4 = this.f67570;
        int indexOf2 = c7744.indexOf(c, max + i4, min + i4);
        if (indexOf2 < 0) {
            return -1;
        }
        return indexOf2 - i4;
    }

    @Override // l.InterfaceC23008
    public final int lastIndexOf(char c, int i, int i2) {
        int max = Math.max(0, i);
        int min = Math.min(length(), i2);
        if (max >= min) {
            return -1;
        }
        C7744 c7744 = this.f67569;
        int i3 = this.f67571;
        if (min > i3) {
            int max2 = Math.max(i3, max);
            int i4 = this.f67570;
            int lastIndexOf = c7744.lastIndexOf('\n', max2 + i4, min + i4);
            if (lastIndexOf >= 0) {
                return lastIndexOf - i4;
            }
            min = i3;
        }
        if (max < min) {
            return c7744.lastIndexOf('\n', max, min);
        }
        return -1;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        if (i >= 0 && i2 >= i && i2 <= length()) {
            if (i3 < 0 || i3 > cArr.length - (i2 - i)) {
                throw new IndexOutOfBoundsException("Invalid preview destination");
            }
            int min = Math.min(i2, this.f67571);
            C7744 c7744 = this.f67569;
            if (i < min) {
                c7744.getChars(i, min, cArr, i3);
                i3 += min - i;
                i = min;
            }
            if (i < i2) {
                int i4 = this.f67570;
                c7744.getChars(i + i4, i2 + i4, cArr, i3);
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException("Invalid preview range");
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0 || i2 < i || i2 > length()) {
            throw new IndexOutOfBoundsException("Invalid preview range");
        }
        char[] cArr = new char[i2 - i];
        getChars(i, i2, cArr, 0);
        return new String(cArr);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int length = length();
        if (length < 0 || length > length()) {
            throw new IndexOutOfBoundsException("Invalid preview range");
        }
        char[] cArr = new char[length];
        getChars(0, length, cArr, 0);
        return new String(cArr);
    }
}
