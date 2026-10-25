package l;

/* compiled from: 6B9F */
/* renamed from: l.۬ۡܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13012 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17246 f38952;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21064 f38953;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f38954;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C21064[] f38955;

    public C13012(C17246 c17246, int i) {
        if (c17246 == null) {
            throw new NullPointerException("blocks == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("firstLabel < 0");
        }
        this.f38952 = c17246;
        this.f38954 = i;
        this.f38955 = null;
        this.f38953 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17246 m31591() {
        return this.f38952;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m31593() {
        return this.f38954;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21064 m31592(int i) {
        if (this.f38953 == null) {
            C17246 c17246 = this.f38952;
            int m38023 = c17246.m38023();
            C21064[] c21064Arr = new C21064[m38023];
            C21064 c21064 = new C21064(10);
            int size = c17246.size();
            for (int i2 = 0; i2 < size; i2++) {
                C16540 m41002get = c17246.m41002get(i2);
                int mo2269 = m41002get.mo2269();
                C21064 m38911 = m41002get.m38911();
                int size2 = m38911.size();
                if (size2 == 0) {
                    c21064.add(mo2269);
                } else {
                    for (int i3 = 0; i3 < size2; i3++) {
                        int i4 = m38911.get(i3);
                        C21064 c210642 = c21064Arr[i4];
                        if (c210642 == null) {
                            c210642 = new C21064(10);
                            c21064Arr[i4] = c210642;
                        }
                        c210642.add(mo2269);
                    }
                }
            }
            for (int i5 = 0; i5 < m38023; i5++) {
                C21064 c210643 = c21064Arr[i5];
                if (c210643 != null) {
                    c210643.m47914();
                    c210643.mo20349();
                }
            }
            c21064.m47914();
            c21064.mo20349();
            int i6 = this.f38954;
            if (c21064Arr[i6] == null) {
                c21064Arr[i6] = C21064.f67936;
            }
            this.f38955 = c21064Arr;
            this.f38953 = c21064;
        }
        C21064 c210644 = this.f38955[i];
        if (c210644 != null) {
            return c210644;
        }
        throw new RuntimeException("no such block: ".concat(C14712.m35006(i)));
    }
}
