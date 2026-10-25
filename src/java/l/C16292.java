package l;

/* compiled from: U6VY */
/* renamed from: l.ܽ֡ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16292 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C8760 f50087;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f50088;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f50089;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f50090;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f50091;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f50092;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f50093;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f50094;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f50095;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f50096;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f50097;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f50098;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795 f50099;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f50100;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f50101;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f50102;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f50103;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f50104;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean f50105;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795 f50106;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f50107;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f50108;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f50109;

    public C16292(C8760 c8760, Object obj, Object obj2, boolean z, boolean z2, int i, int i2, int i3) {
        int m39980;
        char c;
        boolean z3;
        boolean z4;
        this.f50087 = c8760;
        this.f50101 = obj;
        this.f50092 = obj2;
        this.f50098 = z;
        this.f50100 = z2;
        this.f50090 = i;
        this.f50108 = i2;
        this.f50091 = i3;
        boolean z5 = obj instanceof int[];
        int i4 = 2;
        boolean z6 = z5 && ((int[]) obj).length == 2;
        this.f50093 = z6;
        int i5 = -1;
        this.f50102 = z6 ? ((int[]) obj)[0] : -1;
        this.f50096 = z6 ? ((int[]) obj)[1] : -1;
        this.f50106 = obj instanceof InterfaceC10795 ? (InterfaceC10795) obj : null;
        this.f50099 = obj2 instanceof InterfaceC10795 ? (InterfaceC10795) obj2 : null;
        this.f50103 = m38312(obj);
        this.f50088 = m38312(obj2);
        if (z5) {
            int[] iArr = (int[]) obj;
            m39980 = iArr.length == 1 ? iArr[0] : -1;
        } else {
            C5855 c5855 = C14403.f44164;
            m39980 = C17019.m39980((InterfaceC10795) obj);
        }
        this.f50109 = m39980;
        if (obj2 instanceof int[]) {
            int[] iArr2 = (int[]) obj2;
            if (iArr2.length == 1) {
                i5 = iArr2[0];
            }
        } else {
            C5855 c58552 = C14403.f44164;
            i5 = C17019.m39980((InterfaceC10795) obj2);
        }
        this.f50094 = i5;
        this.f50105 = c8760 != null && c8760.f26704 && !z && c8760.f26705 < 0 && m39980 >= 0 && m39980 < 128 && i5 >= 0 && i5 < 128 && m39980 != i5;
        if (c8760 == null) {
            c = 0;
            i4 = 0;
        } else {
            EnumC1497 enumC1497 = c8760.f26708;
            boolean z7 = c8760.f26704;
            if (!z7 || z) {
                int i6 = c8760.f26705;
                if (i6 >= 0 || z) {
                    if (i6 >= 0 || !z || !z6 || z7 || enumC1497 != EnumC1497.POSSESSIVE || i5 < 0) {
                        i4 = (i6 >= 0 && c8760.f26702 && z6 && i5 >= 0 && (enumC1497 == EnumC1497.GREEDY || enumC1497 == EnumC1497.LAZY)) ? 3 : 4;
                    } else {
                        i4 = 6;
                    }
                } else if (m39980 >= 0 && i5 >= 0) {
                    int i7 = C10649.f32042[enumC1497.ordinal()];
                    if (i7 == 1) {
                        i4 = (m39980 != i5 || c8760.f26707 >= 1024) ? 5 : 9;
                    } else if (i7 == 2) {
                        i4 = 7;
                    } else {
                        if (i7 != 3) {
                            throw new IllegalArgumentException("Invalid exact literal quantifier type");
                        }
                        i4 = 8;
                    }
                }
                c = 0;
            } else {
                c = 0;
                i4 = 1;
            }
        }
        this.f50095 = i4;
        long j = 0;
        long j2 = 0;
        for (int i8 = 0; i8 < 128; i8++) {
            if (m38315(i8, obj) || (i3 == 0 && m38315(i8, obj2))) {
                if (i8 < 64) {
                    j |= 1 << i8;
                } else {
                    j2 |= 1 << i8;
                }
            }
        }
        this.f50097 = j;
        this.f50089 = j2;
        if (z5) {
            int[] iArr3 = (int[]) obj;
            z3 = i3 != 0 || iArr3.length <= 1;
            for (int i9 = 1; i9 < iArr3.length; i9++) {
                if (iArr3[i9] == iArr3[c]) {
                    z3 = false;
                }
            }
        } else {
            z3 = true;
        }
        this.f50104 = z3;
        int i10 = 56320;
        while (true) {
            if (i10 > 57343) {
                z4 = true;
                break;
            } else {
                if (m38315(i10, obj2)) {
                    z4 = false;
                    break;
                }
                i10++;
            }
        }
        this.f50107 = z4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m38318(int i) {
        if (i < 128) {
            return ((i < 64 ? this.f50097 : this.f50089) & (1 << i)) != 0;
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m38312(Object obj) {
        if (!(obj instanceof int[]) || ((int[]) obj).length == 1) {
            int i = -1;
            for (int i2 = 0; i2 < 128; i2++) {
                if (m38315(i2, obj)) {
                    if (i < 0) {
                        i = i2;
                    }
                }
            }
            return i;
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38315(int i, Object obj) {
        return obj instanceof int[] ? ((int[]) obj)[0] == i : ((InterfaceC10795) obj).mo2465(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0126, code lost:
    
        if (m38314(r1, 23, r17) != false) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C16292 m38317(int[] r17, java.lang.Object[] r18, int r19) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16292.m38317(int[], java.lang.Object[], int):l.ܽ֡ܽ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m38313(int[] iArr, Object[] objArr, int i) {
        int i2;
        if (m38316(i, iArr)) {
            int i3 = iArr[i + 2];
            Object obj = (i3 < 0 || i3 >= objArr.length) ? null : objArr[i3];
            int i4 = iArr[i];
            if (i4 == 1) {
                if (obj instanceof InterfaceC10795) {
                    return obj;
                }
            } else if (i4 == 3 && (obj instanceof int[])) {
                int[] iArr2 = (int[]) obj;
                if (iArr2.length != 0) {
                    int length = iArr2.length;
                    while (i2 < length) {
                        int i5 = iArr2[i2];
                        i2 = (i5 >= 0 && i5 <= 65535) ? i2 + 1 : 0;
                    }
                    return iArr2.clone();
                }
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38314(int i, int i2, int[] iArr) {
        return m38316(i, iArr) && iArr[i] == i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38316(int i, int[] iArr) {
        return i >= 0 && i % 8 == 0 && i <= iArr.length + (-8);
    }
}
