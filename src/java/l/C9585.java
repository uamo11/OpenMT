package l;

/* compiled from: C6PQ */
/* renamed from: l.ۢ۫ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9585 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f29082;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f29083;

    public C9585(int i, int[] iArr) {
        this.f29083 = i;
        this.f29082 = iArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9585 m24502(C21631 c21631) {
        if (c21631 != C4665.f14830) {
            return null;
        }
        AbstractC23041 m24504 = m24504(c21631.f69445[1]);
        if (!(m24504 instanceof C18375)) {
            return null;
        }
        C18375 c18375 = (C18375) m24504;
        int[] iArr = new int[c21631.f69445.length];
        for (int i = 0; i < c18375.m51210(); i++) {
            AbstractC23041 m245042 = m24504(c18375.m51211(i).f38806);
            if (m245042.m51210() == 1) {
                AbstractC12938 m51211 = m245042.m51211(0);
                if (m51211 instanceof C8706) {
                    C8706 c8706 = (C8706) m51211;
                    int i2 = c8706.f26507;
                    AbstractC23041 m245043 = m24504(c8706.f26506);
                    if (i2 == 70) {
                        if (m245043.m51210() == 1) {
                            AbstractC12938 m512112 = m245043.m51211(0);
                            if (m512112 instanceof C16963) {
                                C16963 c16963 = (C16963) m512112;
                                if (c16963.f52045 != 95) {
                                    continue;
                                } else {
                                    AbstractC23041 m245044 = m24504(c16963.f38806);
                                    if (m245044.m51210() == 1) {
                                        AbstractC12938 m512113 = m245044.m51211(0);
                                        if (m512113 instanceof C8706) {
                                            C8706 c87062 = (C8706) m512113;
                                            if (c87062.f26507 != 1) {
                                                continue;
                                            } else {
                                                m245043 = m24504(c87062.f26506);
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    if (m245043 != c18375.f77840) {
                        continue;
                    } else {
                        if (iArr[i2] != 0) {
                            return null;
                        }
                        iArr[i2] = i + 1;
                    }
                } else {
                    continue;
                }
            }
        }
        return new C9585(c18375.f21787, iArr);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC23041 m24504(AbstractC23041 abstractC23041) {
        while (!(abstractC23041 instanceof C14846) && abstractC23041.m51210() == 1 && (abstractC23041.m51211(0) instanceof C9909)) {
            abstractC23041 = abstractC23041.m51211(0).f38806;
        }
        return abstractC23041;
    }
}
