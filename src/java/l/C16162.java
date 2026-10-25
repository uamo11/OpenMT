package l;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;

/* compiled from: G1TQ */
/* renamed from: l.ܺ᩶ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16162 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float[] f49783;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Typeface f49784;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f49785;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1539 f49786;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f49787;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float f49788;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f49789;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float f49790;

    public C16162(float f, Typeface typeface) {
        C1539 c1539 = new C1539();
        this.f49786 = c1539;
        this.f49783 = new float[127];
        this.f49790 = f;
        this.f49784 = typeface;
        c1539.setTypeface(typeface);
        c1539.setAntiAlias(true);
        c1539.setTextSize(f);
        int ceil = (int) Math.ceil(c1539.getFontSpacing());
        this.f49787 = ceil;
        int ceil2 = (int) Math.ceil(c1539.ascent());
        this.f49785 = ceil2;
        this.f49789 = ceil + ceil2;
        this.f49788 = c1539.measureText("X");
        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i < this.f49783.length; i++) {
            sb.setCharAt(0, (char) i);
            this.f49783[i] = this.f49786.measureText(sb, 0, 1);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38096(C17637 c17637, Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        int i13;
        int i14;
        boolean z2;
        int[] iArr;
        int[] iArr2;
        int i15;
        int i16;
        boolean z3;
        int i17;
        int i18;
        int i19;
        int i20;
        char[] cArr;
        int i21;
        int i22;
        C16162 c16162 = this;
        C17637 c176372 = c17637;
        int i23 = i2;
        int i24 = i3;
        boolean m41256 = c17637.m41256();
        int i25 = i + c176372.f53918;
        int i26 = c176372.f53892;
        int m41257 = c17637.m41257();
        int m41260 = c17637.m41260();
        boolean m41255 = c17637.m41255();
        C2115 m41261 = c17637.m41261();
        C16931 c16931 = c176372.f53920;
        int[] iArr3 = c16931.f52002;
        int[] iArr4 = c16931.f52002;
        int m41262 = c17637.m41262();
        if (m41256) {
            canvas.drawColor(iArr3[256], PorterDuff.Mode.SRC);
        }
        float f = c16162.f49789;
        int i27 = i;
        while (i27 < i25) {
            float f2 = f + c16162.f49787;
            int i28 = (i27 == m41260 && m41255) ? m41257 : -1;
            if (i27 < i23 || i27 > i24) {
                i6 = -1;
                i7 = -1;
            } else {
                int i29 = i27 == i23 ? i4 : -1;
                i6 = i27 == i24 ? i5 : c176372.f53892;
                i7 = i29;
            }
            C19049 m7003 = m41261.m7003(m41261.m7010(i27));
            char[] cArr2 = m7003.f59996;
            long j = 0;
            int i30 = -1;
            int i31 = 0;
            float f3 = 0.0f;
            boolean z4 = false;
            int i32 = i27;
            int m43903 = m7003.m43903();
            boolean z5 = false;
            boolean z6 = false;
            int i33 = 0;
            int i34 = 0;
            while (i34 < i26) {
                C2115 c2115 = m41261;
                char c = cArr2[i33];
                boolean isHighSurrogate = Character.isHighSurrogate(c);
                if (isHighSurrogate) {
                    i8 = i25;
                    i9 = 2;
                } else {
                    i8 = i25;
                    i9 = 1;
                }
                if (isHighSurrogate) {
                    i10 = m41260;
                    i11 = Character.toCodePoint(c, cArr2[i33 + 1]);
                } else {
                    i10 = m41260;
                    i11 = c;
                }
                int m18920 = C6991.m18920(i11);
                int i35 = i26;
                boolean z7 = i28 == i34 || (m18920 == 2 && i28 == i34 + 1);
                if (i34 < i7 || i34 > i6) {
                    i12 = i28;
                    z = false;
                } else {
                    i12 = i28;
                    z = true;
                }
                long m43908 = m7003.m43908(i34);
                C19049 c19049 = m7003;
                float[] fArr = c16162.f49783;
                int i36 = i6;
                float measureText = i11 < fArr.length ? fArr[i11] : c16162.f49786.measureText(cArr2, i33, i9);
                boolean z8 = ((double) Math.abs((measureText / c16162.f49788) - ((float) m18920))) > 0.01d;
                if (m43908 == j && z7 == z5 && z == z6 && !z8 && !z4) {
                    i20 = m43903;
                    i13 = i7;
                    iArr = iArr4;
                    iArr2 = iArr3;
                    i17 = i9;
                    cArr = cArr2;
                    i21 = i34;
                    i22 = i30;
                    z8 = z4;
                    i16 = i10;
                    i18 = i8;
                    i14 = i12;
                    i15 = m18920;
                    i19 = i33;
                } else {
                    if (i34 == 0) {
                        i20 = m43903;
                        i13 = i7;
                        iArr = iArr4;
                        iArr2 = iArr3;
                        i15 = m18920;
                        z3 = z7;
                        i17 = i9;
                        cArr = cArr2;
                        i21 = i34;
                        i16 = i10;
                        i18 = i8;
                        i14 = i12;
                        z2 = z;
                        i19 = i33;
                    } else {
                        int i37 = i34 - i30;
                        int i38 = i33 - i31;
                        i13 = i7;
                        i14 = i12;
                        z2 = z;
                        iArr = iArr4;
                        iArr2 = iArr3;
                        i15 = m18920;
                        i16 = i10;
                        z3 = z7;
                        i17 = i9;
                        i18 = i8;
                        i19 = i33;
                        i20 = m43903;
                        cArr = cArr2;
                        i21 = i34;
                        m38095(canvas, cArr2, iArr3, f2, i30, i37, i31, i38, f3, z5 ? iArr4[258] : 0, z6 ? iArr4[259] : 0, m41262, j, m41256);
                    }
                    f3 = 0.0f;
                    i22 = i21;
                    z5 = z3;
                    i31 = i19;
                    z6 = z2;
                    j = m43908;
                }
                f3 += measureText;
                i34 = i21 + i15;
                i33 = i19 + i17;
                int i39 = i20;
                while (i33 < i39) {
                    char c2 = cArr[i33];
                    boolean isHighSurrogate2 = Character.isHighSurrogate(c2);
                    int i40 = c2;
                    if (isHighSurrogate2) {
                        i40 = Character.toCodePoint(c2, cArr[i33 + 1]);
                    }
                    if (C6991.m18920(i40) <= 0) {
                        i33 += Character.isHighSurrogate(cArr[i33]) ? 2 : 1;
                    }
                }
                c16162 = this;
                i30 = i22;
                m43903 = i39;
                m41261 = c2115;
                m41260 = i16;
                i26 = i35;
                i25 = i18;
                m7003 = c19049;
                i6 = i36;
                z4 = z8;
                i7 = i13;
                i28 = i14;
                iArr4 = iArr;
                iArr3 = iArr2;
                cArr2 = cArr;
            }
            int[] iArr5 = iArr4;
            int[] iArr6 = iArr3;
            C2115 c21152 = m41261;
            int i41 = m41260;
            int i42 = i26;
            int i43 = i25;
            m38095(canvas, cArr2, iArr6, f2, i30, i42 - i30, i31, i33 - i31, f3, z5 ? iArr5[258] : 0, z6 ? iArr5[259] : 0, m41262, j, m41256);
            i27 = i32 + 1;
            c16162 = this;
            c176372 = c17637;
            i23 = i2;
            i24 = i3;
            f = f2;
            m41261 = c21152;
            m41260 = i41;
            i26 = i42;
            i25 = i43;
            iArr4 = iArr5;
            iArr3 = iArr6;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38095(Canvas canvas, char[] cArr, int[] iArr, float f, int i, int i2, int i3, int i4, float f2, int i5, int i6, int i7, long j, boolean z) {
        int i8;
        float f3;
        float f4;
        boolean z2;
        int i9;
        C1539 c1539;
        int i10;
        int i11;
        boolean z3;
        float f5;
        C1539 c15392;
        int i12;
        int i13;
        int min;
        int min2;
        int min3;
        float f6;
        int m52689 = C23924.m52689(j);
        int i14 = (int) (j & 2047);
        int m52687 = C23924.m52687(j);
        boolean z4 = (i14 & 9) != 0;
        boolean z5 = (i14 & 4) != 0;
        boolean z6 = (i14 & 2) != 0;
        boolean z7 = (i14 & 64) != 0;
        boolean z8 = (i14 & 256) != 0;
        if ((m52689 & (-16777216)) != -16777216) {
            if (z4 && m52689 >= 0 && m52689 < 8) {
                m52689 += 8;
            }
            m52689 = iArr[m52689];
        }
        if ((m52687 & (-16777216)) != -16777216) {
            m52687 = iArr[m52687];
        }
        if (z ^ ((i14 & 16) != 0)) {
            i8 = m52687;
        } else {
            i8 = m52689;
            m52689 = m52687;
        }
        float f7 = this.f49788;
        float f8 = i * f7;
        float f9 = i2;
        float f10 = (f9 * f7) + f8;
        float f11 = f2 / f7;
        int i15 = i8;
        boolean z9 = z6;
        boolean z10 = z7;
        if (Math.abs(f11 - f9) > 0.01d) {
            canvas.save();
            canvas.scale(f9 / f11, 1.0f);
            float f12 = f11 / f9;
            f3 = f8 * f12;
            f4 = f10 * f12;
            z2 = true;
        } else {
            f3 = f8;
            f4 = f10;
            z2 = false;
        }
        int i16 = iArr[257];
        int i17 = this.f49785;
        int i18 = this.f49789;
        C1539 c15393 = this.f49786;
        if (m52689 != i16) {
            c15393.setColor(m52689);
            c1539 = c15393;
            i10 = i18;
            i11 = i17;
            i9 = i15;
            z3 = z2;
            f5 = f4;
            canvas.drawRect(f3, (f - i18) + i17, f4, f, c1539);
        } else {
            i9 = i15;
            c1539 = c15393;
            i10 = i18;
            i11 = i17;
            z3 = z2;
            f5 = f4;
        }
        if (i6 != 0) {
            C1539 c15394 = c1539;
            c15394.setColor(i6);
            canvas.drawRect(f3, f - (i10 - i11), f5 + 1.0f, f, c15394);
        }
        if (i5 != 0) {
            C1539 c15395 = c1539;
            c15395.setColor(i5);
            float f13 = i10 - i11;
            if (i7 == 1) {
                f13 = (float) (f13 / 4.0d);
                i12 = i10;
            } else if (i7 == 2) {
                i12 = i10;
                f6 = (float) (f5 - (((f5 - f3) * 3.0f) / 4.0d));
                f13 = f13;
                c15392 = c15395;
                canvas.drawRect(f3, f - f13, f6, f, c15395);
            } else {
                i12 = i10;
            }
            f6 = f5;
            c15392 = c15395;
            canvas.drawRect(f3, f - f13, f6, f, c15395);
        } else {
            int i19 = i10;
            c15392 = c1539;
            i12 = i19;
        }
        if ((i14 & 32) == 0) {
            if (i5 != 0) {
                i13 = iArr[256];
            } else if (i6 != 0) {
                i13 = iArr[257];
            } else if (z8) {
                int i20 = (i9 >> 16) & 255;
                int i21 = (i9 >> 8) & 255;
                int i22 = i9 & 255;
                if (C11288.f33814) {
                    min = (i20 * 2) / 3;
                    min2 = (i21 * 2) / 3;
                    min3 = (i22 * 2) / 3;
                } else {
                    min = Math.min(255, (i20 * 4) / 3);
                    min2 = Math.min(255, (i21 * 4) / 3);
                    min3 = Math.min(255, (i22 * 4) / 3);
                }
                i13 = ((min << 16) - 16777216) + (min2 << 8) + min3;
            } else {
                i13 = i9;
            }
            c15392.setFakeBoldText(z4);
            c15392.setUnderlineText(z5);
            c15392.setTextSkewX(z9 ? -0.35f : 0.0f);
            c15392.setStrikeThruText(z10);
            c15392.setColor(i13);
            canvas.drawText(cArr, i3, i4, f3, f - i12, c15392);
        }
        if (z3) {
            canvas.restore();
        }
    }
}
