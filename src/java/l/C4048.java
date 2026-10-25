package l;

/* compiled from: U6N4 */
/* renamed from: l.ۘܺܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4048 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13035 f12857;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f12858;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7785 f12859;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13035 f12860;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f12861;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23097 f12862;

    public C4048(InterfaceC7785 interfaceC7785, C23097 c23097, int i, int i2, C13035 c13035, C13035 c130352) {
        this.f12859 = interfaceC7785;
        this.f12862 = c23097;
        this.f12858 = i;
        this.f12861 = i2;
        this.f12860 = c13035;
        this.f12857 = c130352;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m12169(Object obj, C23097 c23097, int i, int i2) {
        return this.f12859 == obj && this.f12862 == c23097 && this.f12858 == i && this.f12861 == i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4048 m12167(C13035 c13035) {
        C13035 c130352;
        int i = c13035.f39036;
        int i2 = c13035.f39035;
        C13035 c130353 = this.f12860;
        int i3 = c130353.f39035;
        C9302 c9302 = c130353.f39034;
        int i4 = c130353.f39036;
        if (i > i3 || i4 > i2) {
            c130352 = c13035;
        } else {
            int max = Math.max(Math.min(i4, i), i2 - 65536);
            int min = (int) Math.min(Math.max(c130353.f39035, i2), max + 65536);
            C9302 m23878 = C9302.m23878();
            int i5 = c13035.f39036;
            if (max < i5) {
                m23878 = c9302.m23886(max - i4, i5 - i4);
            }
            C9302 m23882 = m23878.m23882(c13035.f39034);
            if (min > i2) {
                m23882 = m23882.m23882(c9302.m23886(i2 - i4, min - i4));
            }
            c130352 = new C13035(max, m23882);
        }
        return new C4048(this.f12859, this.f12862, this.f12858, this.f12861, c130352, c13035);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4048 m12166(C7185 c7185) {
        if (c7185 != null && c7185.m19250()) {
            C13035 c13035 = this.f12860;
            int i = c13035.f39036;
            int i2 = c13035.f39036;
            int max = Math.max(i, c7185.m19245());
            int min = Math.min(c13035.f39035, c7185.m19241());
            if (max < min) {
                C16356 c16356 = new C16356();
                C9302 m19248 = c7185.m19248();
                int m19245 = max - c7185.m19245();
                m19248.getClass();
                C17768 c17768 = new C17768();
                c17768.m41620(m19248);
                c17768.m41621(m19245);
                do {
                    int max2 = Math.max(max, c17768.m41622() + c7185.m19245());
                    int min2 = Math.min(min, c17768.m41619() + c7185.m19245());
                    C21834 m41624 = c17768.m41624();
                    c16356.m38503(min2 - max2, new C21834(null, m41624.m49210(), 0, m41624.m49212(), 0, 0), false);
                    if (min2 == min) {
                        break;
                    }
                } while (c17768.m41625());
                return new C4048(this.f12859, this.f12862, this.f12858, this.f12861, new C13035(i2, c13035.f39034.m23881(max - i2, min - i2, c16356.m38502())), this.f12857);
            }
        }
        return this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4048 m12168(InterfaceC20445 interfaceC20445, C23097 c23097, int i, int i2, int i3, int i4, int i5, C21834 c21834) {
        C9302 m23868;
        if (!m12169(interfaceC20445, c23097, i - 1, (i2 - i5) + i4) || i3 < 0 || i4 < 0 || i5 < 0 || i3 + i4 > this.f12861) {
            return null;
        }
        int i6 = i3 + i4;
        int i7 = i5 - i4;
        C13035 c13035 = this.f12860;
        int i8 = c13035.f39036;
        C9302 c9302 = c13035.f39034;
        if (i3 < i8 && i6 <= i8) {
            i8 += i7;
        } else if (i3 < c13035.f39035) {
            int max = Math.max(0, i3 - i8);
            int min = Math.min(c9302.m23880(), i6 - i8);
            C21834 m23883 = i3 > i8 ? c9302.m23883(max - 1) : c21834;
            if (i5 == 0) {
                m23868 = C9302.m23878();
            } else {
                m23868 = C9302.m23868(i5, new C21834(null, m23883.m49210(), 0, m23883.m49212(), 0, 0), false);
            }
            c9302 = c9302.m23881(max, Math.max(max, min), m23868);
            i8 = Math.min(i8, i3);
            if (c9302.m23880() == 0) {
                return null;
            }
            if (c9302.m23880() > 65536) {
                c9302 = c9302.m23886(0, 65536);
            }
        }
        return new C4048(this.f12859, this.f12862, i, i2, new C13035(i8, c9302), null);
    }
}
