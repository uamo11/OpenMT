package l;

import java.util.Arrays;

/* compiled from: M701 */
/* renamed from: l.ۢۖܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9302 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C9302 f28189 = new C9302(null);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC6479 f28190;

    public C9302(AbstractC6479 abstractC6479) {
        this.f28190 = abstractC6479;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C9302 m23878() {
        return f28189;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9302 m23868(int i, C21834 c21834, boolean z) {
        if (i <= 0) {
            throw new IllegalArgumentException("Non-positive syntax run length");
        }
        C11003.requireNonNull(c21834, "style");
        return new C9302(new C23412(new int[]{i | (z ? Integer.MIN_VALUE : 0)}, new C21834[]{c21834}));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m23880() {
        AbstractC6479 abstractC6479 = this.f28190;
        if (abstractC6479 == null) {
            return 0;
        }
        return abstractC6479.f20006;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m23885() {
        AbstractC6479 abstractC6479 = this.f28190;
        if (abstractC6479 == null) {
            return 0;
        }
        return abstractC6479.f20007;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m23884(int i, int i2) {
        C11003.checkFromToIndex(i, i2, m23880());
        return i < i2 && m23873(this.f28190, i, i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 m23883(int i) {
        C11003.checkIndex(i, m23880());
        AbstractC6479 abstractC6479 = this.f28190;
        while (abstractC6479 instanceof C10713) {
            C10713 c10713 = (C10713) abstractC6479;
            AbstractC6479 abstractC64792 = c10713.f32295;
            int i2 = abstractC64792.f20006;
            if (i < i2) {
                abstractC6479 = abstractC64792;
            } else {
                i -= i2;
                abstractC6479 = c10713.f32294;
            }
        }
        C23412 c23412 = (C23412) abstractC6479;
        int i3 = 0;
        while (true) {
            int i4 = c23412.f75185[i3] & Integer.MAX_VALUE;
            if (i < i4) {
                return c23412.f75184[i3];
            }
            i -= i4;
            i3++;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9302 m23886(int i, int i2) {
        AbstractC6479 abstractC6479;
        AbstractC6479 abstractC64792;
        C11003.checkFromToIndex(i, i2, m23880());
        C9302 c9302 = f28189;
        if (i == i2) {
            return c9302;
        }
        if (i == 0 && i2 == m23880()) {
            return this;
        }
        abstractC6479 = m23870(this.f28190, i2).f66287;
        abstractC64792 = m23870(abstractC6479, i).f66288;
        return abstractC64792 == null ? c9302 : new C9302(abstractC64792);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9302 m23882(C9302 c9302) {
        C11003.requireNonNull(c9302, "suffix");
        AbstractC6479 abstractC6479 = c9302.f28190;
        if (abstractC6479 == null) {
            return this;
        }
        AbstractC6479 abstractC64792 = this.f28190;
        if (abstractC64792 == null) {
            return c9302;
        }
        if (m23880() + c9302.m23880() != ((int) r2)) {
            throw new ArithmeticException();
        }
        AbstractC6479 m23876 = m23876(abstractC64792, abstractC6479);
        return m23876 == null ? f28189 : new C9302(m23876);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9302 m23881(int i, int i2, C9302 c9302) {
        AbstractC6479 abstractC6479;
        AbstractC6479 abstractC64792;
        AbstractC6479 abstractC64793;
        AbstractC6479 abstractC64794 = c9302.f28190;
        C11003.checkFromToIndex(i, i2, m23880());
        if ((m23880() - (i2 - i)) + c9302.m23880() != ((int) r3)) {
            throw new ArithmeticException();
        }
        if (i == i2 && abstractC64794 == null) {
            return this;
        }
        if (i == 0 && i2 == m23880()) {
            return c9302;
        }
        C20591 m23870 = m23870(this.f28190, i2);
        abstractC6479 = m23870.f66287;
        abstractC64792 = m23870(abstractC6479, i).f66287;
        AbstractC6479 m23876 = m23876(abstractC64792, abstractC64794);
        abstractC64793 = m23870.f66288;
        AbstractC6479 m238762 = m23876(m23876, abstractC64793);
        return m238762 == null ? f28189 : new C9302(m238762);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14239 m23887(C9302 c9302) {
        C11003.requireNonNull(c9302, "other");
        AbstractC6479 abstractC6479 = c9302.f28190;
        AbstractC6479 abstractC64792 = this.f28190;
        if (abstractC64792 == abstractC6479) {
            return null;
        }
        int min = Math.min(m23880(), c9302.m23880());
        int m23866 = min != 0 ? m23866(abstractC64792, abstractC6479, min, false) : 0;
        if (m23880() != c9302.m23880()) {
            return new C14239(m23866, Math.max(m23880(), c9302.m23880()));
        }
        if (m23866 == min) {
            return null;
        }
        return new C14239(m23866, min - m23866(abstractC64792, abstractC6479, min - m23866, true));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m23866(AbstractC6479 abstractC6479, AbstractC6479 abstractC64792, int i, boolean z) {
        AbstractC6479 abstractC64793;
        AbstractC6479 abstractC64794;
        AbstractC6479 abstractC64795;
        AbstractC6479 abstractC64796;
        AbstractC6479 abstractC64797;
        AbstractC6479 abstractC64798;
        int i2;
        int i3;
        int i4;
        int i5;
        AbstractC6479 abstractC64799;
        AbstractC6479 abstractC647910;
        AbstractC6479 abstractC647911;
        int i6;
        int i7;
        AbstractC6479 abstractC647912;
        int i8;
        C17062 c17062 = new C17062(abstractC6479, z);
        C17062 c170622 = new C17062(abstractC64792, z);
        int i9 = 0;
        while (i9 < i) {
            abstractC64793 = c17062.f52314;
            abstractC64794 = c170622.f52314;
            if (abstractC64793 == abstractC64794) {
                i6 = c17062.f52309;
                i7 = c170622.f52309;
                if (i6 == i7) {
                    abstractC647912 = c17062.f52314;
                    int i10 = abstractC647912.f20006;
                    i8 = c17062.f52309;
                    i9 += Math.min(i - i9, i10 - i8);
                    if (i9 == i) {
                        return i9;
                    }
                    c17062.m40052();
                    c170622.m40052();
                }
            }
            abstractC64795 = c17062.f52314;
            if (abstractC64795 instanceof C10713) {
                abstractC64799 = c170622.f52314;
                if (abstractC64799 instanceof C10713) {
                    abstractC647910 = c17062.f52314;
                    int i11 = abstractC647910.f20006;
                    abstractC647911 = c170622.f52314;
                    if (i11 >= abstractC647911.f20006) {
                    }
                }
                c17062.m40050();
            }
            abstractC64796 = c170622.f52314;
            if (abstractC64796 instanceof C10713) {
                c170622.m40050();
            } else {
                abstractC64797 = c17062.f52314;
                abstractC64798 = c170622.f52314;
                C21834[] c21834Arr = ((C23412) abstractC64797).f75184;
                i2 = c17062.f52312;
                C21834 c21834 = c21834Arr[i2];
                C21834[] c21834Arr2 = ((C23412) abstractC64798).f75184;
                i3 = c170622.f52312;
                if (!c21834.equals(c21834Arr2[i3])) {
                    break;
                }
                i4 = c17062.f52311;
                i5 = c170622.f52311;
                int min = Math.min(i - i9, Math.min(i4, i5));
                i9 += min;
                c17062.m40051(min);
                c170622.m40051(min);
            }
        }
        return i9;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9302 m23869(AbstractC6479 abstractC6479) {
        return abstractC6479 == null ? f28189 : new C9302(abstractC6479);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23873(AbstractC6479 abstractC6479, int i, int i2) {
        if (abstractC6479.f20004) {
            if (i != 0 || i2 != abstractC6479.f20006) {
                if (abstractC6479 instanceof C10713) {
                    C10713 c10713 = (C10713) abstractC6479;
                    AbstractC6479 abstractC64792 = c10713.f32295;
                    int i3 = abstractC64792.f20006;
                    if ((i >= i3 || !m23873(abstractC64792, i, Math.min(i2, i3))) && (i2 <= i3 || !m23873(c10713.f32294, Math.max(0, i - i3), i2 - i3))) {
                    }
                } else {
                    C23412 c23412 = (C23412) abstractC6479;
                    int i4 = 0;
                    for (int i5 = 0; i5 < c23412.f20007 && i4 < i2; i5++) {
                        i4 += c23412.f75185[i5] & Integer.MAX_VALUE;
                        if (i4 > i) {
                            C21834 c21834 = c23412.f75184[i5];
                            if ((c21834.m49209() >>> 24) == 6 || (c21834.m49211() >>> 24) == 6) {
                                return true;
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20591 m23870(AbstractC6479 abstractC6479, int i) {
        AbstractC6479 abstractC64792;
        AbstractC6479 abstractC64793;
        AbstractC6479 abstractC64794;
        AbstractC6479 abstractC64795;
        if (i == 0) {
            return new C20591(null, abstractC6479);
        }
        if (i == abstractC6479.f20006) {
            return new C20591(abstractC6479, null);
        }
        if (abstractC6479 instanceof C23412) {
            C23412 c23412 = (C23412) abstractC6479;
            return new C20591(m23872(c23412, 0, i), m23872(c23412, i, c23412.f20006));
        }
        C10713 c10713 = (C10713) abstractC6479;
        AbstractC6479 abstractC64796 = c10713.f32295;
        AbstractC6479 abstractC64797 = c10713.f32294;
        int i2 = abstractC64796.f20006;
        if (i == i2) {
            return new C20591(abstractC64796, abstractC64797);
        }
        if (i < i2) {
            C20591 m23870 = m23870(abstractC64796, i);
            abstractC64794 = m23870.f66287;
            abstractC64795 = m23870.f66288;
            return new C20591(abstractC64794, m23879(abstractC64795, abstractC64797));
        }
        C20591 m238702 = m23870(abstractC64797, i - i2);
        abstractC64792 = m238702.f66287;
        AbstractC6479 m23879 = m23879(abstractC64796, abstractC64792);
        abstractC64793 = m238702.f66288;
        return new C20591(m23879, abstractC64793);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23412 m23872(C23412 c23412, int i, int i2) {
        int[] iArr;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr2 = c23412.f75185;
            iArr = c23412.f75185;
            i3 = iArr2[i5];
            if ((i3 & Integer.MAX_VALUE) + i4 > i) {
                break;
            }
            i5++;
            i4 += i3 & Integer.MAX_VALUE;
        }
        int i6 = (i3 & Integer.MAX_VALUE) + i4;
        int i7 = i5;
        while (i6 < i2) {
            i7++;
            i6 += iArr[i7] & Integer.MAX_VALUE;
        }
        int i8 = i7 + 1;
        int[] copyOfRange = Arrays.copyOfRange(iArr, i5, i8);
        C21834[] c21834Arr = (C21834[]) Arrays.copyOfRange(c23412.f75184, i5, i8);
        int i9 = 0;
        while (i9 < copyOfRange.length) {
            int i10 = copyOfRange[i9];
            int i11 = (i10 & Integer.MAX_VALUE) + i4;
            copyOfRange[i9] = (i <= i4 ? Integer.MIN_VALUE & i10 : 0) | (Math.min(i2, i11) - Math.max(i, i4));
            i9++;
            i4 = i11;
        }
        return new C23412(copyOfRange, c21834Arr);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC6479 m23876(AbstractC6479 abstractC6479, AbstractC6479 abstractC64792) {
        int i;
        if (abstractC6479 == null) {
            return abstractC64792;
        }
        if (abstractC64792 == null) {
            return abstractC6479;
        }
        C23412 m23871 = m23871(abstractC6479, false);
        C23412 m238712 = m23871(abstractC64792, true);
        int i2 = (m238712.f75185[0] < 0 || !m23871.f75184[m23871.f20007 - 1].equals(m238712.f75184[0])) ? 0 : 1;
        int i3 = m23871.f20007;
        int i4 = m238712.f20007;
        int i5 = (i3 + i4) - i2;
        if (i2 == 0 && i5 > 128 && i3 >= 64 && i4 >= 64) {
            return m23879(abstractC6479, abstractC64792);
        }
        C23412[] c23412Arr = new C23412[4];
        c23412Arr[0] = m23871;
        c23412Arr[1] = m238712;
        AbstractC6479 m23874 = m23874(abstractC6479, false);
        AbstractC6479 m238742 = m23874(abstractC64792, true);
        int i6 = 2;
        while (i5 < 64 && (m23874 != null || m238742 != null)) {
            if (m23874 != null) {
                C23412 m238713 = m23871(m23874, false);
                System.arraycopy(c23412Arr, 0, c23412Arr, 1, i6);
                c23412Arr[0] = m238713;
                m23874 = m23874(m23874, false);
                i = m238713.f20007;
            } else {
                C23412 m238714 = m23871(m238742, true);
                c23412Arr[i6] = m238714;
                m238742 = m23874(m238742, true);
                i = m238714.f20007;
            }
            i5 += i;
            i6++;
        }
        int i7 = i5 <= 128 ? i5 : i5 / 2;
        int[] iArr = new int[i7];
        C21834[] c21834Arr = new C21834[i7];
        C21834 c21834 = null;
        int[] iArr2 = i5 == i7 ? null : new int[i5 - i7];
        C21834[] c21834Arr2 = i5 == i7 ? null : new C21834[i5 - i7];
        int i8 = -1;
        for (int i9 = 0; i9 < i6; i9++) {
            C23412 c23412 = c23412Arr[i9];
            int i10 = 0;
            while (i10 < c23412.f20007) {
                int i11 = c23412.f75185[i10];
                Object obj = c23412.f75184[i10];
                boolean z = i8 >= 0 && i11 >= 0 && c21834.equals(obj);
                if (!z) {
                    i8++;
                }
                int i12 = i8 < i7 ? i8 : i8 - i7;
                int[] iArr3 = i8 < i7 ? iArr : iArr2;
                C21834[] c21834Arr3 = i8 < i7 ? c21834Arr : c21834Arr2;
                if (z) {
                    int i13 = iArr3[i12];
                    iArr3[i12] = (i13 & Integer.MIN_VALUE) | ((i13 & Integer.MAX_VALUE) + (i11 & Integer.MAX_VALUE));
                } else {
                    iArr3[i12] = i11;
                    c21834Arr3[i12] = obj;
                }
                i10++;
                c21834 = obj;
            }
        }
        AbstractC6479 c234122 = new C23412(iArr, c21834Arr);
        if (iArr2 != null) {
            c234122 = new C10713(c234122, new C23412(iArr2, c21834Arr2));
        }
        return m23879(m23879(m23874, c234122), m238742);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23412 m23871(AbstractC6479 abstractC6479, boolean z) {
        while (abstractC6479 instanceof C10713) {
            C10713 c10713 = (C10713) abstractC6479;
            abstractC6479 = z ? c10713.f32295 : c10713.f32294;
        }
        return (C23412) abstractC6479;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC6479 m23874(AbstractC6479 abstractC6479, boolean z) {
        if (abstractC6479 instanceof C23412) {
            return null;
        }
        C10713 c10713 = (C10713) abstractC6479;
        if (z) {
            return m23879(m23874(c10713.f32295, true), c10713.f32294);
        }
        return m23879(c10713.f32295, m23874(c10713.f32294, false));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static AbstractC6479 m23879(AbstractC6479 abstractC6479, AbstractC6479 abstractC64792) {
        if (abstractC6479 == null) {
            return abstractC64792;
        }
        if (abstractC64792 == null) {
            return abstractC6479;
        }
        int i = abstractC6479.f20005;
        int i2 = abstractC64792.f20005;
        if (i > i2 + 1) {
            C10713 c10713 = (C10713) abstractC6479;
            return m23875(c10713.f32295, m23879(c10713.f32294, abstractC64792));
        }
        if (i2 > i + 1) {
            C10713 c107132 = (C10713) abstractC64792;
            return m23875(m23879(abstractC6479, c107132.f32295), c107132.f32294);
        }
        return new C10713(abstractC6479, abstractC64792);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C10713 m23875(AbstractC6479 abstractC6479, AbstractC6479 abstractC64792) {
        int i = abstractC6479.f20005;
        int i2 = abstractC64792.f20005;
        if (i > i2 + 1) {
            C10713 c10713 = (C10713) abstractC6479;
            AbstractC6479 abstractC64793 = c10713.f32295;
            int i3 = abstractC64793.f20005;
            AbstractC6479 abstractC64794 = c10713.f32294;
            if (i3 >= abstractC64794.f20005) {
                return new C10713(abstractC64793, new C10713(abstractC64794, abstractC64792));
            }
            C10713 c107132 = (C10713) abstractC64794;
            return new C10713(new C10713(abstractC64793, c107132.f32295), new C10713(c107132.f32294, abstractC64792));
        }
        if (i2 > i + 1) {
            C10713 c107133 = (C10713) abstractC64792;
            AbstractC6479 abstractC64795 = c107133.f32294;
            int i4 = abstractC64795.f20005;
            AbstractC6479 abstractC64796 = c107133.f32295;
            if (i4 >= abstractC64796.f20005) {
                return new C10713(new C10713(abstractC6479, abstractC64796), abstractC64795);
            }
            C10713 c107134 = (C10713) abstractC64796;
            return new C10713(new C10713(abstractC6479, c107134.f32295), new C10713(c107134.f32294, abstractC64795));
        }
        return new C10713(abstractC6479, abstractC64792);
    }
}
