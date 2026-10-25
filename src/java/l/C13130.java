package l;

/* compiled from: Z71W */
/* renamed from: l.۬۬ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13130 implements InterfaceC23008 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CharSequence f39275;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f39276;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f39277;

    public C13130(int i, int i2, CharSequence charSequence) {
        int length = charSequence.length();
        if (i < 0 || i2 > length || i > i2) {
            StringBuilder m46682 = C20361.m46682("start = ", i, ", end = ", ", length = ", i2);
            m46682.append(length);
            throw new IndexOutOfBoundsException(m46682.toString());
        }
        if (charSequence instanceof C13130) {
            C13130 c13130 = (C13130) charSequence;
            this.f39275 = c13130.f39275;
            this.f39277 = c13130.f39277 + i;
        } else {
            this.f39275 = charSequence;
            this.f39277 = i;
        }
        this.f39276 = i2 - i;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f39276;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f39276;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C18307.m42646("index = ", i, i2, ", length = "));
        }
        return this.f39275.charAt(this.f39277 + i);
    }

    @Override // l.InterfaceC23008
    public final int indexOf(char c, int i, int i2) {
        int i3 = this.f39276;
        if (i < 0 || i2 > i3 || i > i2) {
            StringBuilder m46682 = C20361.m46682("start = ", i, ", end = ", ", length = ", i2);
            m46682.append(i3);
            throw new IndexOutOfBoundsException(m46682.toString());
        }
        if (i == i2) {
            return -1;
        }
        CharSequence charSequence = this.f39275;
        boolean z = charSequence instanceof InterfaceC23008;
        int i4 = this.f39277;
        if (!z) {
            while (i < i2) {
                if (charSequence.charAt(i4 + i) == c) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i5 = i + i4;
        int i6 = i2 + i4;
        int indexOf = ((InterfaceC23008) charSequence).indexOf(c, i5, i6);
        if (indexOf < -1 || (indexOf >= 0 && (indexOf < i5 || indexOf >= i6))) {
            throw new IllegalStateException("Searchable character sequence returned an invalid index");
        }
        if (indexOf < 0) {
            return -1;
        }
        return indexOf - i4;
    }

    @Override // l.InterfaceC23008
    public final int lastIndexOf(char c, int i, int i2) {
        int i3 = this.f39276;
        if (i < 0 || i2 > i3 || i > i2) {
            StringBuilder m46682 = C20361.m46682("start = ", i, ", end = ", ", length = ", i2);
            m46682.append(i3);
            throw new IndexOutOfBoundsException(m46682.toString());
        }
        if (i != i2) {
            CharSequence charSequence = this.f39275;
            boolean z = charSequence instanceof InterfaceC23008;
            int i4 = this.f39277;
            if (!z) {
                do {
                    i2--;
                    if (i2 >= i) {
                    }
                } while (charSequence.charAt(i4 + i2) != '\n');
                return i2;
            }
            int i5 = i + i4;
            int i6 = i2 + i4;
            int lastIndexOf = ((InterfaceC23008) charSequence).lastIndexOf('\n', i5, i6);
            if (lastIndexOf < -1 || (lastIndexOf >= 0 && (lastIndexOf < i5 || lastIndexOf >= i6))) {
                throw new IllegalStateException("Searchable character sequence returned an invalid index");
            }
            if (lastIndexOf >= 0) {
                return lastIndexOf - i4;
            }
        }
        return -1;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3 = this.f39276;
        if (i < 0 || i2 > i3 || i > i2) {
            StringBuilder m46682 = C20361.m46682("start = ", i, ", end = ", ", length = ", i2);
            m46682.append(i3);
            throw new IndexOutOfBoundsException(m46682.toString());
        }
        if (i == 0 && i2 == i3) {
            return this;
        }
        int i4 = this.f39277;
        return new C13130(i + i4, i4 + i2, this.f39275);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.f39276;
        if (i == 0) {
            return "";
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = this.f39275.charAt(this.f39277 + i2);
        }
        return new String(cArr);
    }
}
