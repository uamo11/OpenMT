package l;

/* compiled from: 2BF0 */
/* renamed from: l.ۛܽܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6183 extends C17535 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C6183 f18986 = new C6183(0);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6183 m17104(C6183 c6183, C6183 c61832) {
        if (c6183 == f18986) {
            return c61832;
        }
        int size = c6183.size();
        int size2 = c61832.size();
        C6183 c61833 = new C6183(size + size2);
        for (int i = 0; i < size; i++) {
            c61833.m40981(i, (C10417) c6183.m40978(i));
        }
        for (int i2 = 0; i2 < size2; i2++) {
            c61833.m40981(size + i2, (C10417) c61832.m40978(i2));
        }
        return c61833;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17105(int i, int i2, int i3) {
        m40981(i, new C10417(i2, i3));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m17106(int i) {
        int size = size();
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C10417 c10417 = (C10417) m40978(i4);
            int m26258 = c10417.m26258();
            if (m26258 <= i && m26258 > i2) {
                int m26257 = c10417.m26257();
                if (m26258 == i) {
                    return m26257;
                }
                i3 = m26257;
                i2 = m26258;
            }
        }
        return i3;
    }
}
