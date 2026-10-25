package l;

import android.graphics.Color;

/* compiled from: G55Z */
/* renamed from: l.۟ۗ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7191 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f22029 = new ThreadLocal();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m19274(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i3, m19268(Color.red(i), alpha2, Color.red(i2), alpha, i3), m19268(Color.green(i), alpha2, Color.green(i2), alpha, i3), m19268(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m19268(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static double m19263(int i, int i2) {
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException(C13540.m32584(new StringBuilder("background can not be translucent: #"), i2));
        }
        if (Color.alpha(i) < 255) {
            i = m19274(i, i2);
        }
        double m19262 = m19262(i) + 0.05d;
        double m192622 = m19262(i2) + 0.05d;
        return Math.max(m19262, m192622) / Math.min(m19262, m192622);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m19266(int i, float f, int i2) {
        int i3 = 255;
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException(C13540.m32584(new StringBuilder("background can not be translucent: #"), i2));
        }
        double d = f;
        if (m19263(m19276(i, 255), i2) < d) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
            int i6 = (i4 + i3) / 2;
            if (m19263(m19276(i, i6), i2) < d) {
                i4 = i6;
            } else {
                i3 = i6;
            }
        }
        return i3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19271(int i, int i2, int i3, float[] fArr) {
        float f;
        float abs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float max = Math.max(f2, Math.max(f3, f4));
        float min = Math.min(f2, Math.min(f3, f4));
        float f5 = max - min;
        float f6 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            f = max == f2 ? ((f3 - f4) / f5) % 6.0f : max == f3 ? ((f4 - f2) / f5) + 2.0f : ((f2 - f3) / f5) + 4.0f;
            abs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = f7 < 0.0f ? 0.0f : Math.min(f7, 360.0f);
        fArr[1] = abs < 0.0f ? 0.0f : Math.min(abs, 1.0f);
        fArr[2] = f6 >= 0.0f ? Math.min(f6, 1.0f) : 0.0f;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19272(int i, float[] fArr) {
        m19271(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m19269(float[] fArr) {
        int round;
        int round2;
        int i = 0;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float abs = (1.0f - Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f) / 60) {
            case 0:
                i = Math.round((abs + f4) * 255.0f);
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                break;
            case 1:
                i = Math.round((abs2 + f4) * 255.0f);
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                break;
            case 2:
                i = Math.round(f4 * 255.0f);
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round((abs2 + f4) * 255.0f);
                break;
            case 3:
                i = Math.round(f4 * 255.0f);
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round((abs + f4) * 255.0f);
                break;
            case 4:
                i = Math.round((abs2 + f4) * 255.0f);
                round = Math.round(f4 * 255.0f);
                round2 = Math.round((abs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                i = Math.round((abs + f4) * 255.0f);
                round = Math.round(f4 * 255.0f);
                round2 = Math.round((abs2 + f4) * 255.0f);
                break;
            default:
                round2 = 0;
                round = 0;
                break;
        }
        return Color.rgb(m19273(i), m19273(round), m19273(round2));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m19276(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19270(int i, int i2, int i3, double[] dArr) {
        m19275(i, i2, i3, dArr);
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double m19261 = m19261(d / 95.047d);
        double m192612 = m19261(d2 / 100.0d);
        double m192613 = m19261(d3 / 108.883d);
        dArr[0] = Math.max(0.0d, (116.0d * m192612) - 16.0d);
        dArr[1] = (m19261 - m192612) * 500.0d;
        dArr[2] = (m192612 - m192613) * 200.0d;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m19275(int i, int i2, int i3, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = i / 255.0d;
        double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = i2 / 255.0d;
        double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = i3 / 255.0d;
        double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        dArr[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m19265(double d, double d2, double d3) {
        double m12787 = C4248.m12787(d3, -0.4986d, ((-1.5372d) * d2) + (3.2406d * d), 100.0d);
        double m127872 = C4248.m12787(d3, 0.0415d, (1.8758d * d2) + ((-0.9689d) * d), 100.0d);
        double m127873 = C4248.m12787(d3, 1.057d, ((-0.204d) * d2) + (0.0557d * d), 100.0d);
        return Color.rgb(m19273((int) Math.round((m12787 > 0.0031308d ? (Math.pow(m12787, 0.4166666666666667d) * 1.055d) - 0.055d : m12787 * 12.92d) * 255.0d)), m19273((int) Math.round((m127872 > 0.0031308d ? (Math.pow(m127872, 0.4166666666666667d) * 1.055d) - 0.055d : m127872 * 12.92d) * 255.0d)), m19273((int) Math.round((m127873 > 0.0031308d ? (Math.pow(m127873, 0.4166666666666667d) * 1.055d) - 0.055d : m127873 * 12.92d) * 255.0d)));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m19273(int i) {
        if (i < 0) {
            return 0;
        }
        return Math.min(i, 255);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static double m19261(double d) {
        if (d > 0.008856d) {
            return Math.pow(d, 0.3333333333333333d);
        }
        return C4248.m12787(d, 903.3d, 16.0d, 116.0d);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m19267(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static double m19262(int i) {
        ThreadLocal threadLocal = f22029;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        m19275(Color.red(i), Color.green(i), Color.blue(i), dArr);
        return dArr[1] / 100.0d;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m19264(double d, double d2) {
        ThreadLocal threadLocal = f22029;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        double d3 = (d / 500.0d) + 0.9137931034482759d;
        double d4 = 0.9137931034482759d - (d2 / 200.0d);
        double pow = Math.pow(d3, 3.0d);
        if (pow <= 0.008856d) {
            pow = ((d3 * 116.0d) - 16.0d) / 903.3d;
        }
        double pow2 = Math.pow(0.9137931034482759d, 3.0d);
        double pow3 = Math.pow(d4, 3.0d);
        if (pow3 <= 0.008856d) {
            pow3 = ((d4 * 116.0d) - 16.0d) / 903.3d;
        }
        double d5 = pow * 95.047d;
        dArr[0] = d5;
        double d6 = pow2 * 100.0d;
        dArr[1] = d6;
        double d7 = pow3 * 108.883d;
        dArr[2] = d7;
        return m19265(d5, d6, d7);
    }
}
