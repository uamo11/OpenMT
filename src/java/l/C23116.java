package l;

/* compiled from: FBEZ */
/* renamed from: l.᩺ܽܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23116 extends C17535 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C23116 f74357 = new C23116(0);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23116 m51305(C23116 c23116, C23116 c231162) {
        if (c23116 == f74357) {
            return c231162;
        }
        int size = c23116.size();
        int size2 = c231162.size();
        C23116 c231163 = new C23116(size + size2);
        for (int i = 0; i < size; i++) {
            c231163.m40981(i, (C11828) c23116.m40978(i));
        }
        for (int i2 = 0; i2 < size2; i2++) {
            c231163.m40981(size + i2, (C11828) c231162.m40978(i2));
        }
        c231163.mo20349();
        return c231163;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C23116 m51306(C23116 c23116, C23116 c231162) {
        C11828 c11828;
        int size = c23116.size();
        C23116 c231163 = new C23116(size);
        for (int i = 0; i < size; i++) {
            C11828 c118282 = (C11828) c23116.m40978(i);
            int size2 = c231162.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    c11828 = null;
                    break;
                }
                c11828 = (C11828) c231162.m40978(i2);
                if (c11828.m28915(c118282)) {
                    break;
                }
                i2++;
            }
            if (c11828 != null) {
                c118282 = c118282.m28912(C11828.m28911(c11828));
            }
            c231163.m40981(i, c118282);
        }
        c231163.mo20349();
        return c231163;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51307(int i, int i2, int i3, C13217 c13217, C13217 c132172, C13217 c132173, int i4) {
        m40981(i, new C11828(i2, i3, c13217, c132172, c132173, i4));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11828 m51308(int i, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            C11828 c11828 = (C11828) m40978(i3);
            if (c11828.m28914(i, i2)) {
                return c11828;
            }
        }
        return null;
    }
}
