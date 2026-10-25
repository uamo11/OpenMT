package l;

/* compiled from: T70E */
/* renamed from: l.۟ܺܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7575 implements InterfaceC23008 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CharSequence f23433;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1540 f23434;

    @Override // l.InterfaceC23008
    public final int lastIndexOf(char c, int i, int i2) {
        int i3;
        int max = Math.max(0, i);
        i3 = this.f23434.f5433;
        int min = Math.min(i3, i2);
        while (min > max) {
            min--;
            if (charAt(min) == '\n') {
                return min;
            }
        }
        return -1;
    }

    public C7575(C1540 c1540, CharSequence charSequence) {
        this.f23434 = c1540;
        this.f23433 = charSequence;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        int i;
        i = this.f23434.f5433;
        return i;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        char charAt = this.f23433.charAt(i);
        C1540.m5258(this.f23434, i, i + 1);
        return charAt;
    }

    @Override // l.InterfaceC23008
    public final int indexOf(char c, int i, int i2) {
        int i3;
        int max = Math.max(0, i);
        C1540 c1540 = this.f23434;
        i3 = c1540.f5433;
        int min = Math.min(i3, i2);
        int i4 = -1;
        if (max >= min) {
            return -1;
        }
        CharSequence charSequence = this.f23433;
        if (charSequence instanceof InterfaceC23008) {
            int indexOf = ((InterfaceC23008) charSequence).indexOf(c, max, min);
            if (indexOf < -1 || (indexOf >= 0 && (indexOf < max || indexOf >= min))) {
                throw new IllegalStateException("Searchable syntax text returned an invalid index");
            }
            i4 = indexOf;
        } else {
            int i5 = max;
            while (true) {
                if (i5 >= min) {
                    break;
                }
                if (charSequence.charAt(i5) == c) {
                    i4 = i5;
                    break;
                }
                i5++;
            }
        }
        if (i4 >= 0) {
            min = i4 + 1;
        }
        C1540.m5258(c1540, max, min);
        return i4;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C13130(i, i2, this);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i;
        int i2;
        CharSequence charSequence = this.f23433;
        boolean z = charSequence instanceof String;
        C1540 c1540 = this.f23434;
        if (z) {
            String str = (String) charSequence;
            i2 = c1540.f5433;
            C1540.m5258(c1540, 0, i2);
            return str;
        }
        i = c1540.f5433;
        return new C13130(0, i, this).toString();
    }
}
