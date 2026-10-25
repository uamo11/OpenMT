package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: 68KO */
/* renamed from: l.۠֡֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7815 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public short[] f24148;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f24149;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public double f24150;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f24151;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public short[] f24152;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f24153;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f24154;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f24155;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f24156;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f24157;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f24158;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f24159;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final float f24160;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f24161;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final short[] f24162;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f24163;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public short[] f24164;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f24165;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final float f24166;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f24167;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f24168;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float f24169;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f24170;

    public C7815(float f, int i, float f2, int i2, int i3) {
        this.f24159 = i;
        this.f24158 = i2;
        this.f24169 = f;
        this.f24166 = f2;
        this.f24160 = i / i3;
        this.f24156 = i / 400;
        int i4 = i / 65;
        this.f24154 = i4;
        int i5 = i4 * 2;
        this.f24167 = i5;
        this.f24162 = new short[i5];
        this.f24164 = new short[i5 * i2];
        this.f24152 = new short[i5 * i2];
        this.f24148 = new short[i5 * i2];
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m20891() {
        return this.f24163 * this.f24158 * 2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20890(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f24158;
        int i2 = remaining / i;
        short[] m20885 = m20885(this.f24164, this.f24163, i2);
        this.f24164 = m20885;
        shortBuffer.get(m20885, this.f24163 * i, ((i2 * i) * 2) / 2);
        this.f24163 += i2;
        m20886();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20888(ShortBuffer shortBuffer) {
        C22632.m50634(this.f24165 >= 0);
        int remaining = shortBuffer.remaining();
        int i = this.f24158;
        int min = Math.min(remaining / i, this.f24165);
        shortBuffer.put(this.f24152, 0, min * i);
        int i2 = this.f24165 - min;
        this.f24165 = i2;
        short[] sArr = this.f24152;
        System.arraycopy(sArr, min * i, sArr, 0, i2 * i);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m20892() {
        int i = this.f24163;
        float f = this.f24169;
        float f2 = this.f24166;
        double d = f / f2;
        int i2 = this.f24165 + ((int) (((((((i - r5) / d) + this.f24168) + this.f24150) + this.f24153) / (this.f24160 * f2)) + 0.5d));
        this.f24150 = 0.0d;
        short[] sArr = this.f24164;
        int i3 = this.f24167 * 2;
        this.f24164 = m20885(sArr, i, i3 + i);
        int i4 = 0;
        while (true) {
            int i5 = this.f24158;
            if (i4 >= i3 * i5) {
                break;
            }
            this.f24164[(i5 * i) + i4] = 0;
            i4++;
        }
        this.f24163 = i3 + this.f24163;
        m20886();
        if (this.f24165 > i2) {
            this.f24165 = Math.max(i2, 0);
        }
        this.f24163 = 0;
        this.f24168 = 0;
        this.f24153 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20887() {
        this.f24163 = 0;
        this.f24165 = 0;
        this.f24153 = 0;
        this.f24151 = 0;
        this.f24161 = 0;
        this.f24168 = 0;
        this.f24155 = 0;
        this.f24149 = 0;
        this.f24157 = 0;
        this.f24170 = 0;
        this.f24150 = 0.0d;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m20889() {
        C22632.m50634(this.f24165 >= 0);
        return this.f24165 * this.f24158 * 2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private short[] m20885(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f24158;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20883(short[] sArr, int i, int i2) {
        short[] m20885 = m20885(this.f24152, this.f24165, i2);
        this.f24152 = m20885;
        int i3 = this.f24158;
        System.arraycopy(sArr, i * i3, m20885, this.f24165 * i3, i3 * i2);
        this.f24165 += i2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m20884(short[] sArr, int i, int i2) {
        int i3 = this.f24167 / i2;
        int i4 = this.f24158;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[C23202.m51496(i7, i5, i6, i9)];
            }
            this.f24162[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m20881(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f24158;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.f24157 = i6 / i7;
        this.f24170 = i8 / i5;
        return i7;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m20886() {
        int i;
        int i2;
        int m20881;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j;
        long j2;
        int i10 = this.f24165;
        float f = this.f24169;
        float f2 = this.f24166;
        double d = f / f2;
        float f3 = this.f24160 * f2;
        int i11 = this.f24159;
        int i12 = 1;
        int i13 = this.f24158;
        int i14 = 0;
        if (d > 1.0000100135803223d || d < 0.9999899864196777d) {
            int i15 = this.f24163;
            int i16 = this.f24167;
            if (i15 >= i16) {
                int i17 = 0;
                while (true) {
                    int i18 = this.f24168;
                    if (i18 > 0) {
                        int min = Math.min(i16, i18);
                        m20883(this.f24164, i17, min);
                        this.f24168 -= min;
                        i17 += min;
                        i2 = i10;
                        i = i11;
                    } else {
                        short[] sArr = this.f24164;
                        int i19 = i11 > 4000 ? i11 / OpenAuthTask.SYS_ERR : 1;
                        int i20 = this.f24154;
                        int i21 = this.f24156;
                        if (i13 == i12 && i19 == i12) {
                            m20881 = m20881(sArr, i17, i21, i20);
                            i2 = i10;
                            i = i11;
                        } else {
                            m20884(sArr, i17, i19);
                            i = i11;
                            i2 = i10;
                            short[] sArr2 = this.f24162;
                            m20881 = m20881(sArr2, i14, i21 / i19, i20 / i19);
                            if (i19 != 1) {
                                int i22 = m20881 * i19;
                                int i23 = i19 * 4;
                                int i24 = i22 - i23;
                                int i25 = i22 + i23;
                                if (i24 >= i21) {
                                    i21 = i24;
                                }
                                if (i25 <= i20) {
                                    i20 = i25;
                                }
                                if (i13 == 1) {
                                    m20881 = m20881(sArr, i17, i21, i20);
                                } else {
                                    m20884(sArr, i17, 1);
                                    m20881 = m20881(sArr2, i14, i21, i20);
                                }
                            }
                        }
                        int i26 = this.f24157;
                        int i27 = this.f24170;
                        if (i26 == 0 || (i3 = this.f24155) == 0 || i27 > i26 * 3 || i26 * 2 <= this.f24149 * 3) {
                            i3 = m20881;
                        }
                        this.f24149 = i26;
                        this.f24155 = m20881;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f24164;
                            if (d >= 2.0d) {
                                double d2 = (i3 / (d - 1.0d)) + this.f24150;
                                i5 = (int) Math.round(d2);
                                this.f24150 = d2 - i5;
                            } else {
                                double d3 = (((2.0d - d) * i3) / (d - 1.0d)) + this.f24150;
                                int round = (int) Math.round(d3);
                                this.f24168 = round;
                                this.f24150 = d3 - round;
                                i5 = i3;
                            }
                            short[] m20885 = m20885(this.f24152, this.f24165, i5);
                            this.f24152 = m20885;
                            int i28 = i17;
                            m20882(i5, this.f24158, m20885, this.f24165, sArr3, i28, sArr3, i17 + i3);
                            this.f24165 += i5;
                            i17 = i3 + i5 + i28;
                        } else {
                            int i29 = i17;
                            short[] sArr4 = this.f24164;
                            if (d < 0.5d) {
                                double d4 = ((i3 * d) / (1.0d - d)) + this.f24150;
                                i4 = (int) Math.round(d4);
                                this.f24150 = d4 - i4;
                            } else {
                                double d5 = ((((2.0d * d) - 1.0d) * i3) / (1.0d - d)) + this.f24150;
                                int round2 = (int) Math.round(d5);
                                this.f24168 = round2;
                                this.f24150 = d5 - round2;
                                i4 = i3;
                            }
                            int i30 = i3 + i4;
                            short[] m208852 = m20885(this.f24152, this.f24165, i30);
                            this.f24152 = m208852;
                            System.arraycopy(sArr4, i29 * i13, m208852, this.f24165 * i13, i3 * i13);
                            m20882(i4, this.f24158, this.f24152, this.f24165 + i3, sArr4, i29 + i3, sArr4, i29);
                            this.f24165 += i30;
                            i17 = i29 + i4;
                        }
                    }
                    if (i17 + i16 > i15) {
                        break;
                    }
                    i12 = 1;
                    i14 = 0;
                    i11 = i;
                    i10 = i2;
                }
                int i31 = this.f24163 - i17;
                short[] sArr5 = this.f24164;
                System.arraycopy(sArr5, i17 * i13, sArr5, 0, i31 * i13);
                this.f24163 = i31;
                if (f3 != 1.0f || this.f24165 == (i6 = i2)) {
                }
                int i32 = i;
                long j3 = (long) (i32 / f3);
                long j4 = i32;
                while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                    j3 /= 2;
                    j4 /= 2;
                }
                int i33 = this.f24165 - i6;
                short[] m208853 = m20885(this.f24148, this.f24153, i33);
                this.f24148 = m208853;
                System.arraycopy(this.f24152, i6 * i13, m208853, this.f24153 * i13, i33 * i13);
                this.f24165 = i6;
                this.f24153 += i33;
                int i34 = 0;
                while (true) {
                    i7 = this.f24153;
                    i8 = i7 - 1;
                    if (i34 >= i8) {
                        break;
                    }
                    while (true) {
                        i9 = this.f24151 + 1;
                        j = i9;
                        long j5 = j * j3;
                        j2 = this.f24161;
                        if (j5 <= j2 * j4) {
                            break;
                        }
                        this.f24152 = m20885(this.f24152, this.f24165, 1);
                        int i35 = 0;
                        while (i35 < i13) {
                            short[] sArr6 = this.f24152;
                            int i36 = (this.f24165 * i13) + i35;
                            short[] sArr7 = this.f24148;
                            int i37 = (i34 * i13) + i35;
                            short s = sArr7[i37];
                            short s2 = sArr7[i37 + i13];
                            int i38 = i35;
                            long j6 = (r11 + 1) * j3;
                            long j7 = j6 - (this.f24161 * j4);
                            long j8 = j6 - (this.f24151 * j3);
                            sArr6[i36] = (short) ((((j8 - j7) * s2) + (s * j7)) / j8);
                            i35 = i38 + 1;
                            j4 = j4;
                        }
                        this.f24161++;
                        this.f24165++;
                        j4 = j4;
                    }
                    long j9 = j4;
                    this.f24151 = i9;
                    if (j == j9) {
                        this.f24151 = 0;
                        C22632.m50634(j2 == j3);
                        this.f24161 = 0;
                    }
                    i34++;
                    j4 = j9;
                }
                if (i8 == 0) {
                    return;
                }
                short[] sArr8 = this.f24148;
                System.arraycopy(sArr8, i8 * i13, sArr8, 0, (i7 - i8) * i13);
                this.f24153 -= i8;
                return;
            }
        } else {
            m20883(this.f24164, 0, this.f24163);
            this.f24163 = 0;
        }
        i2 = i10;
        i = i11;
        if (f3 != 1.0f) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20882(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }
}
