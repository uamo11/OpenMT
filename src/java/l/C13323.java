package l;

import java.util.IdentityHashMap;

/* compiled from: F6VE */
/* renamed from: l.۬᩵ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13323 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int[] f39875 = new int[0];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3446 f39876;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[][] f39877;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3446 f39878;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[][] f39879;

    public C13323(C3446 c3446, C3446 c34462, int[][] iArr, int[][] iArr2) {
        this.f39878 = c3446;
        this.f39876 = c34462;
        this.f39879 = iArr;
        this.f39877 = iArr2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13323 m32304(C5710 c5710) {
        C5855 m32303;
        int i;
        C5855 m323032;
        int[] iArr;
        if (c5710 == null || (m32303 = m32303(c5710.f17958)) == null || m32303.getClass() != C11355.class) {
            return null;
        }
        C11355 c11355 = (C11355) m32303;
        C5855 c5855 = c11355.f33991;
        C5855[] c5855Arr = c11355.f33989;
        if (c5855Arr == null || (i = c11355.f33990) < 2 || i > c5855Arr.length || c5855 == null || c5855.getClass() != C22643.class || (m323032 = m32303(c5855.f17958)) == null || m323032.getClass() != C5710.class) {
            return null;
        }
        C5710 c57102 = (C5710) m323032;
        C5855 m323033 = m32303(c57102.f17958);
        if (m323033 == null || m323033.getClass() != C15026.class) {
            return null;
        }
        int i2 = c11355.f33990;
        int[][] iArr2 = new int[i2][];
        int[] iArr3 = new int[128];
        for (int i3 = 0; i3 < c11355.f33990; i3++) {
            C5855 c58552 = c11355.f33989[i3];
            if (c58552 == null || c58552.getClass() != C9259.class || c58552.f17958 != c5855 || (iArr = ((C9259) c58552).f7231) == null || iArr.length == 0) {
                return null;
            }
            for (int i4 : iArr) {
                if (i4 < 0 || i4 > 65535) {
                    return null;
                }
            }
            iArr2[i3] = (int[]) iArr.clone();
            int i5 = iArr[0];
            if (i5 < 128) {
                iArr3[i5] = iArr3[i5] + 1;
            }
        }
        int[][] iArr4 = new int[128][];
        for (int i6 = 0; i6 < 128; i6++) {
            int i7 = iArr3[i6];
            iArr4[i6] = i7 == 0 ? f39875 : new int[i7];
            iArr3[i6] = 0;
        }
        for (int i8 = 0; i8 < i2; i8++) {
            int i9 = iArr2[i8][0];
            if (i9 < 128) {
                int[] iArr5 = iArr4[i9];
                int i10 = iArr3[i9];
                iArr3[i9] = i10 + 1;
                iArr5[i10] = i8;
            }
        }
        return new C13323(new C3446(c5710.f17592, c5710.f17593), new C3446(c57102.f17592, c57102.f17593), iArr2, iArr4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5855 m32303(C5855 c5855) {
        C0916 c0916;
        IdentityHashMap identityHashMap = new IdentityHashMap();
        while (c5855 != null) {
            if (c5855.getClass() == C5150.class) {
                C5150 c5150 = (C5150) c5855;
                if (c5150.f16093 || (c0916 = c5150.f16094) == null || c0916.f3504 || c0916.f3502 != 0 || c5150.f16092 != c0916.f3503) {
                    return null;
                }
            } else {
                if (c5855.getClass() != C0916.class) {
                    return c5855;
                }
                C0916 c09162 = (C0916) c5855;
                if (c09162.f3504 || c09162.f3502 != 0) {
                    return null;
                }
            }
            if (identityHashMap.put(c5855, Boolean.TRUE) != null) {
                return null;
            }
            c5855 = c5855.f17958;
        }
        return null;
    }
}
