package l;

import java.util.Arrays;

/* compiled from: Z6QT */
/* renamed from: l.ۗ֨ܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2909 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f9269;

    static {
        int[] iArr = new int[1024];
        int i = 0;
        for (int i2 = 65536; i2 <= 1114111; i2++) {
            int upperCase = Character.toUpperCase(i2);
            if (upperCase != i2 || Character.toLowerCase(upperCase) != i2) {
                if (i == iArr.length) {
                    iArr = Arrays.copyOf(iArr, i * 2);
                }
                iArr[i] = i2;
                i++;
            }
        }
        f9269 = Arrays.copyOf(iArr, i);
    }
}
