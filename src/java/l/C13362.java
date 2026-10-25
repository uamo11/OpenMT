package l;

import java.util.Arrays;

/* compiled from: W8PF */
/* renamed from: l.۬᩷ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13362 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10541 m32373(C17714 c17714) {
        c17714.m41478(1);
        int m41491 = c17714.m41491();
        long m41485 = c17714.m41485() + m41491;
        int i = m41491 / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long m41487 = c17714.m41487();
            if (m41487 == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = m41487;
            jArr2[i2] = c17714.m41487();
            c17714.m41478(2);
            i2++;
        }
        c17714.m41478((int) (m41485 - c17714.m41485()));
        return new C10541(jArr, jArr2);
    }
}
