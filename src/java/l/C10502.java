package l;

/* compiled from: H6VP */
/* renamed from: l.ۤ᩵ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10502 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f31500 = new int[128];

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f31501;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f31502;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795[] f31503;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f31504;

    public C10502(InterfaceC10795[] interfaceC10795Arr, int[] iArr, int i, int i2) {
        this.f31503 = interfaceC10795Arr;
        this.f31504 = iArr;
        this.f31502 = i;
        this.f31501 = i2;
        for (int i3 = 0; i3 < this.f31500.length; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= interfaceC10795Arr.length) {
                    break;
                }
                if (interfaceC10795Arr[i4].mo2465(i3)) {
                    this.f31500[i3] = iArr[i4];
                    break;
                }
                i4++;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10502 m26403(C12910 c12910) {
        int i;
        C5855 c5855;
        C5855 c58552;
        C5855 c58553;
        int i2;
        C5855 c58554;
        C0916 c0916;
        C5855 c58555;
        C5855 c58556;
        C0916 c09162;
        int i3;
        if (c12910 == null) {
            return null;
        }
        int i4 = c12910.f38736;
        int i5 = c12910.f38735;
        if (c12910.getClass() != C12910.class || (i = c12910.f38738) < 0 || c12910.f38739 < i || c12910.f38740 < -1 || i5 < 0 || i4 < 0 || i5 == i4 || (c5855 = c12910.f17958) == null || c5855.getClass() != C15026.class || (c58552 = c12910.f38737) == null || c58552.getClass() != C5150.class) {
            return null;
        }
        C5150 c5150 = (C5150) c12910.f38737;
        boolean z = c5150.f16093;
        int i6 = c5150.f16092;
        if (!z || i6 != i5 || (c58553 = c5150.f17958) == null || c58553.getClass() != C11355.class) {
            return null;
        }
        C11355 c11355 = (C11355) c5150.f17958;
        C5855[] c5855Arr = c11355.f33989;
        C5855 c58557 = c11355.f33991;
        if (c5855Arr == null || (i2 = c11355.f33990) < 1 || i2 > c5855Arr.length || c58557 == null || c58557.getClass() != C22643.class || (c58554 = c58557.f17958) == null || c58554.getClass() != C0916.class || c5150.f16094 != (c0916 = (C0916) c58557.f17958) || !c0916.f3504 || c0916.f3502 != 0 || c0916.f3503 != i6 || c0916.f17958 != c12910) {
            return null;
        }
        int i7 = c11355.f33990;
        InterfaceC10795[] interfaceC10795Arr = new InterfaceC10795[i7];
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < c11355.f33990; i8++) {
            C5855 c58558 = c11355.f33989[i8];
            if (c58558 == null) {
                return null;
            }
            if (c58558.getClass() != C5150.class && c58558.getClass() != C12765.class) {
                return null;
            }
            C5150 c51502 = (C5150) c58558;
            int i9 = c51502.f16092;
            if (!c51502.f16093 || i9 < 0 || i9 == i5 || i9 == i4 || (c58555 = c51502.f17958) == null || c58555.getClass() != C19822.class) {
                return null;
            }
            C23494 c23494 = (C23494) c51502.f17958;
            if (c23494.f75432 == null || (c58556 = c23494.f17958) == null || c58556.getClass() != C0916.class || c51502.f16094 != (c09162 = (C0916) c23494.f17958) || !c09162.f3504 || c09162.f3503 != i9 || (i3 = c09162.f3502) <= 0 || (i3 & 1) != 0 || c09162.f17958 != c58557) {
                return null;
            }
            interfaceC10795Arr[i8] = c23494.f75432;
            iArr[i8] = i3;
        }
        return new C10502(interfaceC10795Arr, iArr, c12910.f38738, c12910.f38739);
    }
}
