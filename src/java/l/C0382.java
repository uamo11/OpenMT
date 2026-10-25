package l;

import android.app.Application;
import android.content.res.Resources;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: X960 */
/* renamed from: l.֡ۨ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0382 {

    /* renamed from: ܽܶۖ, reason: not valid java name and contains not printable characters */
    public static boolean f1805;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float[] f1809 = new float[20];

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long[] f1808 = new long[20];

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f1810 = 0.0f;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f1807 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f1806 = 0;

    /* renamed from: ֫ᩴۗ, reason: not valid java name and contains not printable characters */
    public static long m1834(long j, long j2) {
        return Math.min(j, j2);
    }

    /* renamed from: ۖ᩷ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m1835(Object obj, Object obj2) {
        return ((Set) obj).add(obj2);
    }

    /* renamed from: ۙ᩺ܶ, reason: not valid java name and contains not printable characters */
    public static Set m1836(Object obj) {
        return ((InterfaceC15620) obj).mo27438();
    }

    /* renamed from: ۜܿ᩵, reason: not valid java name and contains not printable characters */
    public static Iterator m1837(Object obj) {
        return ((Set) obj).iterator();
    }

    /* renamed from: ۟ᩳ۬, reason: not valid java name and contains not printable characters */
    public static Object m1838(Object obj, char c, Object obj2) {
        return ((InterfaceC12963) obj).mo13246(c, obj2);
    }

    /* renamed from: ۠֫᩶, reason: not valid java name and contains not printable characters */
    public static int m1839(Object obj, int i) {
        return C21238.m48210((Resources.Theme) obj, i);
    }

    /* renamed from: ۡܺ֡, reason: not valid java name and contains not printable characters */
    public static String m1840(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۧۘܺ, reason: not valid java name and contains not printable characters */
    public static Set m1841(Object obj) {
        return ((IdentityHashMap) obj).keySet();
    }

    /* renamed from: ۫۠ܿ, reason: not valid java name and contains not printable characters */
    public static Application m1842() {
        return C4925.m14335();
    }

    /* renamed from: ۬ܿܶ, reason: not valid java name and contains not printable characters */
    public static void m1843(Object obj, Object obj2) {
        ((C10567) obj).append((CharSequence) obj2);
    }

    /* renamed from: ܳܽ᩶, reason: not valid java name and contains not printable characters */
    public static String m1844(Object obj, int i) {
        return ((String) obj).substring(i);
    }

    /* renamed from: ܺ֡ۚ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m1845(Object obj, Object obj2) {
        return C16999.m39866((String) obj, (String[]) obj2);
    }

    /* renamed from: ᩴ᩺᩵, reason: not valid java name and contains not printable characters */
    public static void m1846(int i, int i2, Object obj) {
        C15972.m37746(i, i2, (byte[]) obj);
    }

    /* renamed from: ᩸ۧۧ, reason: not valid java name and contains not printable characters */
    public static int m1847(Object obj) {
        return ((ArrayList) obj).size();
    }

    /* renamed from: ᩹᩹ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1848() {
        return false;
    }

    /* renamed from: ᩺۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m1849(Object obj, int i) {
        ((C19258) obj).m44433(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1852(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        int i = this.f1807;
        long[] jArr = this.f1808;
        if (i != 0 && eventTime - jArr[this.f1806] > 40) {
            this.f1807 = 0;
            this.f1810 = 0.0f;
        }
        int i2 = (this.f1806 + 1) % 20;
        this.f1806 = i2;
        int i3 = this.f1807;
        if (i3 != 20) {
            this.f1807 = i3 + 1;
        }
        this.f1809[i2] = motionEvent.getAxisValue(26);
        jArr[this.f1806] = eventTime;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m1850(int i) {
        if (i != 26) {
            return 0.0f;
        }
        return this.f1810;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1851() {
        long j;
        int i = this.f1807;
        float f = 0.0f;
        if (i >= 2) {
            int i2 = this.f1806;
            int i3 = ((i2 + 20) - (i - 1)) % 20;
            long[] jArr = this.f1808;
            long j2 = jArr[i2];
            while (true) {
                j = jArr[i3];
                if (j2 - j <= 100) {
                    break;
                }
                this.f1807--;
                i3 = (i3 + 1) % 20;
            }
            int i4 = this.f1807;
            if (i4 >= 2) {
                float[] fArr = this.f1809;
                if (i4 == 2) {
                    int i5 = (i3 + 1) % 20;
                    if (j != jArr[i5]) {
                        f = fArr[i5] / (r3 - j);
                    }
                } else {
                    int i6 = 0;
                    int i7 = 0;
                    float f2 = 0.0f;
                    while (true) {
                        if (i6 >= this.f1807 - 1) {
                            break;
                        }
                        int i8 = i6 + i3;
                        long j3 = jArr[i8 % 20];
                        int i9 = (i8 + 1) % 20;
                        if (jArr[i9] != j3) {
                            i7++;
                            float sqrt = (f2 < f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f2) * 2.0f));
                            float f3 = fArr[i9] / (jArr[i9] - j3);
                            f2 += Math.abs(f3) * (f3 - sqrt);
                            if (i7 == 1) {
                                f2 *= 0.5f;
                            }
                        }
                        i6++;
                        f = 0.0f;
                    }
                    f = (f2 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f2) * 2.0f));
                }
            }
        }
        float f4 = f * 1000;
        this.f1810 = f4;
        if (f4 < (-Math.abs(Float.MAX_VALUE))) {
            this.f1810 = -Math.abs(Float.MAX_VALUE);
        } else if (this.f1810 > Math.abs(Float.MAX_VALUE)) {
            this.f1810 = Math.abs(Float.MAX_VALUE);
        }
    }
}
