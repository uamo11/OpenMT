package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

/* compiled from: O69P */
/* renamed from: l.ۘ᩶֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4160 extends AbstractC5116 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C9099[] f13568;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21799 f13569;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C13889 f13570;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f13571;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f13572;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC2043[] f13573;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f13574;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C2749[] f13575;

    public C4160(C3454 c3454, int i, int i2, int i3, AbstractC2043[] abstractC2043Arr, C2749[] c2749Arr, C9099[] c9099Arr) {
        super(c3454);
        this.f13572 = i;
        this.f13574 = i2;
        this.f13571 = i3;
        this.f13569 = null;
        this.f13573 = abstractC2043Arr;
        this.f13575 = c2749Arr;
        this.f13568 = c9099Arr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4160 m12579(C3454 c3454, int i, ArrayList arrayList) {
        AbstractC2043[] abstractC2043Arr;
        if (arrayList.size() > 0) {
            AbstractC2043[] abstractC2043Arr2 = new AbstractC2043[arrayList.size()];
            arrayList.toArray(abstractC2043Arr2);
            abstractC2043Arr = abstractC2043Arr2;
        } else {
            abstractC2043Arr = null;
        }
        return (C4160) c3454.f10952.m25237(new C4160(c3454, i, 1, 0, abstractC2043Arr, null, null));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4160 m12581(C3454 c3454) {
        int i;
        C2749[] c2749Arr;
        C9099 c9099;
        C13582 c13582 = this.f13570.f41402.f70680.f38655;
        if (c13582 == null) {
            i = 0;
        } else {
            int i2 = 0;
            for (C22755 c22755 : c13582.f40520) {
                i2 += c22755.m50836();
            }
            i = i2;
        }
        if ((this.f13570.f41403 & EnumC7233.STATIC.getValue()) == 0) {
            i++;
        }
        this.f13574 = i;
        ArrayList arrayList = new ArrayList(3);
        C2749[] c2749Arr2 = this.f13575;
        C9099[] c9099Arr = null;
        if (c2749Arr2 == null) {
            c2749Arr = null;
        } else {
            C2749[] c2749Arr3 = new C2749[c2749Arr2.length];
            int i3 = 0;
            while (true) {
                C2749[] c2749Arr4 = this.f13575;
                if (i3 >= c2749Arr4.length) {
                    break;
                }
                C2749 c2749 = c2749Arr4[i3];
                C9099 c90992 = c2749.f8553;
                C16153[] c16153Arr = c90992.f27575;
                if (c16153Arr == null) {
                    c9099 = null;
                } else {
                    C16153[] c16153Arr2 = new C16153[c16153Arr.length];
                    int i4 = 0;
                    while (true) {
                        C16153[] c16153Arr3 = c90992.f27575;
                        if (i4 >= c16153Arr3.length) {
                            break;
                        }
                        C16153 c16153 = c16153Arr3[i4];
                        c16153Arr2[i4] = new C16153(C22755.m50831(c16153.f49753.m50835(), c3454), c16153.m38080());
                        i4++;
                    }
                    c9099 = new C9099(c16153Arr2, c90992.m23473());
                }
                arrayList.add(c9099);
                c2749Arr3[i3] = new C2749(c2749.m8500(), c2749.m8501(), c9099);
                i3++;
            }
            c2749Arr = c2749Arr3;
        }
        if (arrayList.size() > 0) {
            c9099Arr = new C9099[arrayList.size()];
            arrayList.toArray(c9099Arr);
        }
        C9099[] c9099Arr2 = c9099Arr;
        int i5 = this.f13572;
        int i6 = this.f13574;
        int i7 = this.f13571;
        AbstractC2043[] abstractC2043Arr = this.f13573;
        for (AbstractC2043 abstractC2043 : abstractC2043Arr) {
            switch (C9805.f29641[abstractC2043.mo2742().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    AbstractC16859 abstractC16859 = (AbstractC16859) abstractC2043;
                    int i8 = C9805.f29642[abstractC2043.f6840.f77584.ordinal()];
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                if (i8 != 4) {
                                    break;
                                } else {
                                    abstractC16859.m39630(C11467.m28270(((C11467) abstractC16859.m39631()).m28273(), c3454));
                                    break;
                                }
                            } else {
                                abstractC16859.m39630(C22755.m50831(((C22755) abstractC16859.m39631()).m50835(), c3454));
                                break;
                            }
                        } else {
                            abstractC16859.m39630(((C22050) abstractC16859.m39631()).m49613(c3454));
                            break;
                        }
                    } else {
                        abstractC16859.m39630(((C18522) abstractC16859.m39631()).m43042(c3454));
                        break;
                    }
            }
        }
        return (C4160) c3454.f10952.m25237(new C4160(c3454, i5, i6, i7, abstractC2043Arr, c2749Arr, c9099Arr2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        java.lang.System.err.println("Unknown opcode  address: " + l.C7746.m20771(r4));
     */
    @Override // l.AbstractC5116
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo10109(l.C10720 r11, l.C12172 r12) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4160.mo10109(l.ۧۗ֡, l.۫ۙ֡):void");
    }

    @Override // l.AbstractC5116
    /* renamed from: ֫ */
    public final String mo10106() {
        if (this.f13570 == null) {
            return C13540.m32584(new StringBuilder("code_item @0x"), this.f16030);
        }
        return "code_item @0x" + Integer.toHexString(this.f16030) + " (" + this.f13570.f41402.m49614() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // java.lang.Comparable
    /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C4160 c4160) {
        C13889 c13889 = this.f13570;
        if (c13889 == null) {
            return c4160.f13570 == null ? 0 : -1;
        }
        C13889 c138892 = c4160.f13570;
        if (c138892 == null) {
            return 1;
        }
        return c13889.f41402.compareTo(c138892.f41402);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12582(C13889 c13889) {
        this.f13570 = c13889;
    }

    public final C13889 getParent() {
        return this.f13570;
    }

    @Override // l.AbstractC5116
    /* renamed from: ֫ */
    public final int mo10104(int i) {
        int i2 = 0;
        for (AbstractC2043 abstractC2043 : this.f13573) {
            i2 += abstractC2043.mo6715(i2);
        }
        int m51496 = C23202.m51496(i2, 2, 16, i);
        C2749[] c2749Arr = this.f13575;
        if (c2749Arr != null && c2749Arr.length > 0) {
            int length = (c2749Arr.length * 8) + ((m51496 + 3) & (-4));
            m51496 = C11166.m27697(this.f13568.length) + length;
            for (C9099 c9099 : this.f13568) {
                m51496 = C9099.m23470(m51496, length, c9099);
            }
        }
        return m51496;
    }

    @Override // l.AbstractC5116
    /* renamed from: ֫ */
    public final void mo10108(C1547 c1547) {
        int i = 0;
        for (AbstractC2043 abstractC2043 : this.f13573) {
            i += abstractC2043.mo6715(i);
        }
        c1547.m5304(this.f13572);
        c1547.m5304(this.f13574);
        c1547.m5304(this.f13571);
        C2749[] c2749Arr = this.f13575;
        if (c2749Arr == null) {
            c1547.m5304(0);
        } else {
            c1547.m5304(c2749Arr.length);
        }
        C21799 c21799 = this.f13569;
        if (c21799 == null) {
            c1547.m5302(0);
        } else {
            c1547.m5302(c21799.f16030);
        }
        c1547.m5302(i);
        int i2 = 0;
        for (AbstractC2043 abstractC20432 : this.f13573) {
            i2 = abstractC20432.m6716(c1547, i2);
        }
        C2749[] c2749Arr2 = this.f13575;
        if (c2749Arr2 == null || c2749Arr2.length <= 0) {
            return;
        }
        if (i2 % 2 != 0) {
            c1547.m5304(0);
        }
        for (C2749 c2749 : this.f13575) {
            C2749.m8499(c2749, c1547);
        }
        c1547.m5301(this.f13568.length);
        for (C9099 c9099 : this.f13568) {
            C9099.m23472(c9099, c1547);
        }
    }
}
