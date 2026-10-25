package l;

/* compiled from: N673 */
/* renamed from: l.ܶۤᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C15173 {
    public C0357[] a;
    public C0357 b = null;
    public C8119 c;
    public C8119 d;
    public int e;
    public int f;
    public int g;
    public final int h;

    public C15173(C0357[] c0357Arr, int i, int i2, int i3) {
        this.a = c0357Arr;
        this.h = i;
        this.e = i2;
        this.f = i2;
        this.g = i3;
    }

    public final C0357 a() {
        C0357[] c0357Arr;
        int length;
        int i;
        C8119 c8119;
        C0357 c0357 = this.b;
        if (c0357 != null) {
            c0357 = c0357.d;
        }
        while (c0357 == null) {
            if (this.f >= this.g || (c0357Arr = this.a) == null || (length = c0357Arr.length) <= (i = this.e) || i < 0) {
                this.b = null;
                return null;
            }
            C0357 k = ConcurrentMapC10942.k(c0357Arr, i);
            if (k == null || k.a >= 0) {
                c0357 = k;
            } else if (k instanceof C2475) {
                this.a = ((C2475) k).e;
                C8119 c81192 = this.d;
                if (c81192 == null) {
                    c81192 = new C8119();
                } else {
                    this.d = c81192.d;
                }
                c81192.c = c0357Arr;
                c81192.a = length;
                c81192.b = i;
                c81192.d = this.c;
                this.c = c81192;
                c0357 = null;
            } else {
                c0357 = k instanceof C21525 ? ((C21525) k).f : null;
            }
            if (this.c != null) {
                while (true) {
                    c8119 = this.c;
                    if (c8119 == null) {
                        break;
                    }
                    int i2 = this.e;
                    int i3 = c8119.a;
                    int i4 = i2 + i3;
                    this.e = i4;
                    if (i4 < length) {
                        break;
                    }
                    this.e = c8119.b;
                    this.a = c8119.c;
                    c8119.c = null;
                    C8119 c81193 = c8119.d;
                    c8119.d = this.d;
                    this.c = c81193;
                    this.d = c8119;
                    length = i3;
                }
                if (c8119 == null) {
                    int i5 = this.e + this.h;
                    this.e = i5;
                    if (i5 >= length) {
                        int i6 = this.f + 1;
                        this.f = i6;
                        this.e = i6;
                    }
                }
            } else {
                int i7 = i + this.h;
                this.e = i7;
                if (i7 >= length) {
                    int i8 = this.f + 1;
                    this.f = i8;
                    this.e = i8;
                }
            }
        }
        this.b = c0357;
        return c0357;
    }
}
