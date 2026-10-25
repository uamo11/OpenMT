package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Arrays;

/* compiled from: 770B */
/* renamed from: l.ۨۖܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11419 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C10545[] f34127 = new C10545[0];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10545[] f34128;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23097 f34129;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f34130;

    public C11419(C23097 c23097, int i, C10545[] c10545Arr) {
        C11003.requireNonNull(c23097, "program");
        this.f34129 = c23097;
        C11003.requireNonNull(c10545Arr, "indexes");
        this.f34128 = c10545Arr;
        if (i < 0 || c10545Arr.length > 16) {
            throw new IllegalArgumentException("Invalid syntax window checkpoint cache");
        }
        long j = 0;
        long j2 = 0;
        for (C10545 c10545 : c10545Arr) {
            C11003.requireNonNull(c10545, "index");
            if (c10545.m26515() != c23097 || c10545.m26496() != i || c10545.m26520() == 0) {
                throw new IllegalArgumentException("Checkpoint cache index identity differs");
            }
            j += c10545.m26485();
            j2 += c10545.m26510();
            if (j > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS || j2 > 262144) {
                throw new IllegalArgumentException("Checkpoint cache exceeds state budget");
            }
        }
        this.f34130 = i;
        if (c10545Arr.length != 0) {
            C10545 c105452 = c10545Arr[0];
        } else {
            C10545.m26476(c23097, i, false);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C11419 m28188(C23097 c23097, int i) {
        return new C11419(c23097, i, f34127);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10545 m28191(C23097 c23097, int i) {
        C11003.requireNonNull(c23097, "expectedProgram");
        C10545 c10545 = null;
        C23097 c230972 = this.f34129;
        if (c230972 != c23097) {
            return null;
        }
        C11003.checkFromToIndex(i, i, this.f34130);
        int i2 = -1;
        int i3 = -1;
        for (C10545 c105452 : this.f34128) {
            int m26488 = c105452.m26488(c230972, i);
            if (m26488 >= 0) {
                int m26531 = c105452.m26531(m26488);
                int m26518 = c105452.m26518(m26488);
                if (m26531 > i2 || (m26531 == i2 && m26518 > i3)) {
                    c10545 = c105452;
                    i3 = m26518;
                    i2 = m26531;
                }
            }
        }
        return c10545;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11419 m28193(C10545 c10545) {
        int i;
        C10545[] c10545Arr;
        long j;
        C10545 c105452 = c10545;
        C23097 m26515 = c10545.m26515();
        C23097 c23097 = this.f34129;
        if (m26515 == c23097) {
            int m26496 = c10545.m26496();
            int i2 = this.f34130;
            if (m26496 == i2) {
                if (c10545.m26520() != 0) {
                    C10545[] c10545Arr2 = this.f34128;
                    int i3 = 0;
                    if (c10545Arr2.length <= 0 || c10545Arr2[0] != c105452) {
                        int i4 = 0;
                        while (true) {
                            int i5 = 1;
                            if (i4 < c10545Arr2.length) {
                                C10545 c105453 = c10545Arr2[i4];
                                if (c105453 == c105452 || (m28187(c105453, c105452) && m28187(c105452, c105453))) {
                                    break;
                                }
                                i4++;
                            } else {
                                for (int i6 = 0; i6 < c10545.m26520(); i6++) {
                                    if (c105452.m26521(i6).m45899() == EnumC21338.COMPLETE) {
                                        int m26531 = c105452.m26531(i6);
                                        int m26518 = c105452.m26518(i6);
                                        int length = c10545Arr2.length;
                                        while (i < length) {
                                            C10545 c105454 = c10545Arr2[i];
                                            int m26488 = c105454.m26488(c105454.m26515(), m26531);
                                            i = (m26488 < 0 || c105454.m26531(m26488) != m26531 || c105454.m26518(m26488) < m26518) ? i + 1 : 0;
                                        }
                                        int m26485 = c10545.m26485();
                                        int m26510 = c10545.m26510();
                                        if (m26485 > 1024 || m26510 > 262144) {
                                            throw new IllegalArgumentException("Checkpoint cache update exceeds state budget");
                                        }
                                        int min = Math.min(16, c10545Arr2.length + 1);
                                        C10545[] c10545Arr3 = new C10545[min];
                                        long j2 = m26485;
                                        long j3 = m26510;
                                        c10545Arr3[0] = c105452;
                                        int length2 = c10545Arr2.length;
                                        while (i3 < length2) {
                                            C10545 c105455 = c10545Arr2[i3];
                                            if (m28187(c105452, c105455) || i5 == min) {
                                                c10545Arr = c10545Arr2;
                                                j = j2;
                                            } else {
                                                c10545Arr = c10545Arr2;
                                                long m264852 = c105455.m26485() + j2;
                                                j = j2;
                                                long m265102 = c105455.m26510() + j3;
                                                if (m264852 <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS && m265102 <= 262144) {
                                                    c10545Arr3[i5] = c105455;
                                                    i5++;
                                                    j3 = m265102;
                                                    j2 = m264852;
                                                    i3++;
                                                    c105452 = c10545;
                                                    c10545Arr2 = c10545Arr;
                                                }
                                            }
                                            j2 = j;
                                            i3++;
                                            c105452 = c10545;
                                            c10545Arr2 = c10545Arr;
                                        }
                                        if (i5 != min) {
                                            c10545Arr3 = (C10545[]) Arrays.copyOf(c10545Arr3, i5);
                                        }
                                        return new C11419(c23097, i2, c10545Arr3);
                                    }
                                }
                            }
                        }
                        if (i4 != 0) {
                            C10545[] c10545Arr4 = (C10545[]) c10545Arr2.clone();
                            C10545 c105456 = c10545Arr4[i4];
                            System.arraycopy(c10545Arr4, 0, c10545Arr4, 1, i4);
                            c10545Arr4[0] = c105456;
                            return new C11419(c23097, i2, c10545Arr4);
                        }
                    }
                }
                return this;
            }
        }
        throw new IllegalArgumentException("Checkpoint cache update identity differs");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11419 m28192(C10545 c10545) {
        C11003.requireNonNull(c10545, "used");
        C23097 m26515 = c10545.m26515();
        C23097 c23097 = this.f34129;
        if (m26515 == c23097) {
            int m26496 = c10545.m26496();
            int i = this.f34130;
            if (m26496 == i) {
                int i2 = 0;
                while (true) {
                    C10545[] c10545Arr = this.f34128;
                    if (i2 < c10545Arr.length) {
                        if (c10545Arr[i2] == c10545) {
                            if (i2 == 0) {
                                return this;
                            }
                            C10545[] c10545Arr2 = (C10545[]) c10545Arr.clone();
                            C10545 c105452 = c10545Arr2[i2];
                            System.arraycopy(c10545Arr2, 0, c10545Arr2, 1, i2);
                            c10545Arr2[0] = c105452;
                            return new C11419(c23097, i, c10545Arr2);
                        }
                        i2++;
                    } else {
                        throw new IllegalArgumentException("Touched checkpoint is not cached");
                    }
                }
            }
        }
        throw new IllegalArgumentException("Touched checkpoint identity differs");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m28187(C10545 c10545, C10545 c105452) {
        for (int i = 0; i < c105452.m26520(); i++) {
            if (c105452.m26521(i).m45899() == EnumC21338.COMPLETE) {
                int m26531 = c105452.m26531(i);
                int m26518 = c105452.m26518(i);
                int m26488 = c10545.m26488(c10545.m26515(), m26531);
                if (m26488 < 0 || c10545.m26531(m26488) != m26531 || c10545.m26518(m26488) < m26518) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10545 m28190(int i) {
        return this.f34128[i];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23097 m28194() {
        return this.f34129;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m28195() {
        return this.f34130;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m28189() {
        return this.f34128.length;
    }
}
