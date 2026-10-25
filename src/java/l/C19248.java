package l;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: 21CQ */
/* renamed from: l.᩵ۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19248 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC20513 f60586;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public View f60588;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C3725[] f60589;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC20513[] f60591;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int[] f60594;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public double[] f60595;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f60596;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public HashMap f60597;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public double[] f60599;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String[] f60600;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public HashMap f60602;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f60606;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public HashMap f60608;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f60601 = -1;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C5841 f60598 = new C5841();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C5841 f60609 = new C5841();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C18542 f60607 = new C18542();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C18542 f60592 = new C18542();

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f60604 = Float.NaN;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f60585 = 0.0f;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f60593 = 1.0f;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float[] f60605 = new float[4];

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f60603 = new ArrayList();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float[] f60590 = new float[1];

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f60587 = new ArrayList();

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f60584 = -1;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44403(int i) {
    }

    public C19248(View view) {
        this.f60588 = view;
        this.f60606 = view.getId();
        view.getLayoutParams();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m44411() {
        return this.f60609.f17915;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m44414() {
        return this.f60609.f17911;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44405(int i, float[] fArr) {
        int i2 = i;
        float f = 1.0f;
        float f2 = 1.0f / (i2 - 1);
        HashMap hashMap = this.f60602;
        AbstractC19123 abstractC19123 = hashMap == null ? null : (AbstractC19123) hashMap.get("translationX");
        HashMap hashMap2 = this.f60602;
        AbstractC19123 abstractC191232 = hashMap2 == null ? null : (AbstractC19123) hashMap2.get("translationY");
        HashMap hashMap3 = this.f60597;
        AbstractC14307 abstractC14307 = hashMap3 == null ? null : (AbstractC14307) hashMap3.get("translationX");
        HashMap hashMap4 = this.f60597;
        AbstractC14307 abstractC143072 = hashMap4 != null ? (AbstractC14307) hashMap4.get("translationY") : null;
        int i3 = 0;
        while (i3 < i2) {
            float f3 = i3 * f2;
            float f4 = this.f60593;
            float f5 = 0.0f;
            if (f4 != f) {
                float f6 = this.f60585;
                if (f3 < f6) {
                    f3 = 0.0f;
                }
                if (f3 > f6 && f3 < 1.0d) {
                    f3 = (f3 - f6) * f4;
                }
            }
            double d = f3;
            C5841 c5841 = this.f60598;
            C8518 c8518 = c5841.f17913;
            Iterator it = this.f60603.iterator();
            float f7 = Float.NaN;
            while (it.hasNext()) {
                C5841 c58412 = (C5841) it.next();
                float f8 = f2;
                C8518 c85182 = c58412.f17913;
                if (c85182 != null) {
                    float f9 = c58412.f17924;
                    if (f9 < f3) {
                        f5 = f9;
                        c8518 = c85182;
                    } else if (Float.isNaN(f7)) {
                        f7 = c58412.f17924;
                    }
                }
                f2 = f8;
            }
            float f10 = f2;
            if (c8518 != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                d = (((float) c8518.mo22211((f3 - f5) / r16)) * (f7 - f5)) + f5;
            }
            this.f60591[0].mo7169(d, this.f60595);
            AbstractC20513 abstractC20513 = this.f60586;
            if (abstractC20513 != null) {
                double[] dArr = this.f60595;
                if (dArr.length > 0) {
                    abstractC20513.mo7169(d, dArr);
                }
            }
            int i4 = i3 * 2;
            c5841.m16364(this.f60594, this.f60595, fArr, i4);
            if (abstractC14307 != null) {
                fArr[i4] = abstractC14307.m34132(f3) + fArr[i4];
            } else if (abstractC19123 != null) {
                fArr[i4] = abstractC19123.m44146(f3) + fArr[i4];
            }
            if (abstractC143072 != null) {
                int i5 = i4 + 1;
                fArr[i5] = abstractC143072.m34132(f3) + fArr[i5];
            } else if (abstractC191232 != null) {
                int i6 = i4 + 1;
                fArr[i6] = abstractC191232.m44146(f3) + fArr[i6];
            }
            i3++;
            f = 1.0f;
            i2 = i;
            f2 = f10;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m44399(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] mo7171 = this.f60591[0].mo7171();
        if (iArr != null) {
            Iterator it = this.f60603.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = ((C5841) it.next()).f17912;
                i++;
            }
        }
        int i2 = 0;
        for (double d : mo7171) {
            this.f60591[0].mo7169(d, this.f60595);
            this.f60598.m16364(this.f60594, this.f60595, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44402(float f, float[] fArr) {
        this.f60591[0].mo7169(m44397(f, (float[]) null), this.f60595);
        int[] iArr = this.f60594;
        double[] dArr = this.f60595;
        C5841 c5841 = this.f60598;
        float f2 = c5841.f17915;
        float f3 = c5841.f17911;
        float f4 = c5841.f17920;
        float f5 = c5841.f17923;
        for (int i = 0; i < iArr.length; i++) {
            float f6 = (float) dArr[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f2 = f6;
            } else if (i2 == 2) {
                f3 = f6;
            } else if (i2 == 3) {
                f4 = f6;
            } else if (i2 == 4) {
                f5 = f6;
            }
        }
        float f7 = f4 + f2;
        float f8 = f5 + f3;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        float f9 = f2 + 0.0f;
        float f10 = f3 + 0.0f;
        float f11 = f7 + 0.0f;
        float f12 = f8 + 0.0f;
        fArr[0] = f9;
        fArr[1] = f10;
        fArr[2] = f11;
        fArr[3] = f10;
        fArr[4] = f11;
        fArr[5] = f12;
        fArr[6] = f9;
        fArr[7] = f12;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44407(ArrayList arrayList) {
        this.f60587.addAll(arrayList);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44408(AbstractC4990 abstractC4990) {
        this.f60587.add(abstractC4990);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44412(int i) {
        this.f60584 = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0304  */
    /* JADX WARN: Type inference failed for: r13v20, types: [l.ܳۚ] */
    /* JADX WARN: Type inference failed for: r13v21, types: [l.ܳۚ] */
    /* JADX WARN: Type inference failed for: r13v22, types: [l.ܳۚ] */
    /* JADX WARN: Type inference failed for: r13v23, types: [l.ܳۚ] */
    /* JADX WARN: Type inference failed for: r13v24, types: [l.ۛ֡, l.ܳۚ] */
    /* JADX WARN: Type inference failed for: r13v25, types: [l.ܳۚ] */
    /* JADX WARN: Type inference failed for: r13v26, types: [l.ܳۚ] */
    /* JADX WARN: Type inference failed for: r13v27, types: [l.ܳۚ] */
    /* JADX WARN: Type inference failed for: r13v28, types: [l.ܳۚ] */
    /* JADX WARN: Type inference failed for: r13v29, types: [l.ܳۚ] */
    /* JADX WARN: Type inference failed for: r13v30, types: [l.ܳۚ] */
    /* JADX WARN: Type inference failed for: r13v31, types: [l.ܳۚ] */
    /* JADX WARN: Type inference failed for: r13v32, types: [l.ܳۚ] */
    /* JADX WARN: Type inference failed for: r3v120, types: [l.᩵֨] */
    /* JADX WARN: Type inference failed for: r3v121, types: [l.᩵֨] */
    /* JADX WARN: Type inference failed for: r3v122, types: [l.᩵֨] */
    /* JADX WARN: Type inference failed for: r3v123, types: [l.᩵֨] */
    /* JADX WARN: Type inference failed for: r3v124, types: [l.᩵֨, l.᩻֨] */
    /* JADX WARN: Type inference failed for: r3v125, types: [l.᩵֨] */
    /* JADX WARN: Type inference failed for: r3v126, types: [l.᩵֨] */
    /* JADX WARN: Type inference failed for: r3v127, types: [l.᩵֨] */
    /* JADX WARN: Type inference failed for: r3v128, types: [l.᩵֨] */
    /* JADX WARN: Type inference failed for: r3v129, types: [l.᩵֨] */
    /* JADX WARN: Type inference failed for: r3v130, types: [l.᩵֨] */
    /* JADX WARN: Type inference failed for: r3v131, types: [l.᩵֨] */
    /* JADX WARN: Type inference failed for: r3v132, types: [l.᩵֨] */
    /* JADX WARN: Type inference failed for: r3v133, types: [l.᩵֨] */
    /* JADX WARN: Type inference failed for: r3v134, types: [l.᩵֨] */
    /* JADX WARN: Type inference failed for: r3v142, types: [l.ۧ֨, l.᩵֨] */
    /* JADX WARN: Type inference failed for: r3v52, types: [l.ۛ֨] */
    /* JADX WARN: Type inference failed for: r3v53, types: [l.ۛ֨] */
    /* JADX WARN: Type inference failed for: r3v54, types: [l.ۛ֨] */
    /* JADX WARN: Type inference failed for: r3v55, types: [l.ۛ֨] */
    /* JADX WARN: Type inference failed for: r3v56, types: [l.ۛ֨, l.ܶ֨] */
    /* JADX WARN: Type inference failed for: r3v57, types: [l.ۛ֨] */
    /* JADX WARN: Type inference failed for: r3v58, types: [l.ۛ֨] */
    /* JADX WARN: Type inference failed for: r3v59, types: [l.ۛ֨] */
    /* JADX WARN: Type inference failed for: r3v60, types: [l.ۛ֨] */
    /* JADX WARN: Type inference failed for: r3v61, types: [l.ۛ֨] */
    /* JADX WARN: Type inference failed for: r3v63, types: [l.ۛ֨] */
    /* JADX WARN: Type inference failed for: r3v71, types: [l.ۚ֨, l.ۛ֨] */
    /* JADX WARN: Type inference failed for: r4v59, types: [l.ۗ֡, l.ܳۚ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m44404(int r34, int r35, long r36) {
        /*
            Method dump skipped, instructions count: 4012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19248.m44404(int, int, long):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        C5841 c5841 = this.f60598;
        sb.append(c5841.f17915);
        sb.append(" y: ");
        sb.append(c5841.f17911);
        sb.append(" end: x: ");
        C5841 c58412 = this.f60609;
        sb.append(c58412.f17915);
        sb.append(" y: ");
        sb.append(c58412.f17911);
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m44396(C5841 c5841) {
        float x = (int) this.f60588.getX();
        float y = (int) this.f60588.getY();
        float width = this.f60588.getWidth();
        float height = this.f60588.getHeight();
        c5841.f17915 = x;
        c5841.f17911 = y;
        c5841.f17920 = width;
        c5841.f17923 = height;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44406(View view) {
        C5841 c5841 = this.f60598;
        c5841.f17924 = 0.0f;
        c5841.f17917 = 0.0f;
        float x = view.getX();
        float y = view.getY();
        float width = view.getWidth();
        float height = view.getHeight();
        c5841.f17915 = x;
        c5841.f17911 = y;
        c5841.f17920 = width;
        c5841.f17923 = height;
        this.f60607.m43084(view);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44413(C15094 c15094, C4201 c4201) {
        C5841 c5841 = this.f60598;
        c5841.f17924 = 0.0f;
        c5841.f17917 = 0.0f;
        m44396(c5841);
        float m35774 = c15094.m35774();
        float m35775 = c15094.m35775();
        float m35753 = c15094.m35753();
        float m35732 = c15094.m35732();
        c5841.f17915 = m35774;
        c5841.f17911 = m35775;
        c5841.f17920 = m35753;
        c5841.f17923 = m35732;
        C21135 m12684 = c4201.m12684(this.f60606);
        c5841.m16363(m12684);
        this.f60604 = m12684.f68163.f27677;
        this.f60607.m43085(c15094, c4201, this.f60606);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44409(C15094 c15094, C4201 c4201) {
        C5841 c5841 = this.f60609;
        c5841.f17924 = 1.0f;
        c5841.f17917 = 1.0f;
        m44396(c5841);
        float m35774 = c15094.m35774();
        float m35775 = c15094.m35775();
        float m35753 = c15094.m35753();
        float m35732 = c15094.m35732();
        c5841.f17915 = m35774;
        c5841.f17911 = m35775;
        c5841.f17920 = m35753;
        c5841.f17923 = m35732;
        c5841.m16363(c4201.m12684(this.f60606));
        this.f60592.m43085(c15094, c4201, this.f60606);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private float m44397(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.f60593;
            if (f3 != 1.0d) {
                float f4 = this.f60585;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = (f - f4) * f3;
                }
            }
        }
        C8518 c8518 = this.f60598.f17913;
        Iterator it = this.f60603.iterator();
        float f5 = Float.NaN;
        while (it.hasNext()) {
            C5841 c5841 = (C5841) it.next();
            C8518 c85182 = c5841.f17913;
            if (c85182 != null) {
                float f6 = c5841.f17924;
                if (f6 < f) {
                    c8518 = c85182;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = c5841.f17924;
                }
            }
        }
        if (c8518 != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) c8518.mo22211(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) c8518.mo22212(d);
            }
        }
        return f;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m44410(float f, long j, View view, C14867 c14867) {
        boolean z;
        C7833 c7833;
        float f2;
        C5841 c5841;
        float m44397 = m44397(f, (float[]) null);
        HashMap hashMap = this.f60602;
        if (hashMap != null) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((AbstractC19123) it.next()).mo5144(m44397, view);
            }
        }
        HashMap hashMap2 = this.f60608;
        if (hashMap2 != null) {
            c7833 = null;
            z = false;
            for (AbstractC5717 abstractC5717 : hashMap2.values()) {
                if (abstractC5717 instanceof C7833) {
                    c7833 = (C7833) abstractC5717;
                } else {
                    z |= abstractC5717.mo1019(m44397, j, view, c14867);
                }
            }
        } else {
            z = false;
            c7833 = null;
        }
        AbstractC20513[] abstractC20513Arr = this.f60591;
        C5841 c58412 = this.f60598;
        if (abstractC20513Arr != null) {
            double d = m44397;
            abstractC20513Arr[0].mo7169(d, this.f60595);
            this.f60591[0].mo7173(d, this.f60599);
            AbstractC20513 abstractC20513 = this.f60586;
            if (abstractC20513 != null) {
                double[] dArr = this.f60595;
                if (dArr.length > 0) {
                    abstractC20513.mo7169(d, dArr);
                    this.f60586.mo7173(d, this.f60599);
                }
            }
            int[] iArr = this.f60594;
            double[] dArr2 = this.f60595;
            double[] dArr3 = this.f60599;
            float f3 = c58412.f17915;
            float f4 = c58412.f17911;
            float f5 = c58412.f17920;
            float f6 = c58412.f17923;
            if (iArr.length != 0) {
                f2 = f3;
                if (c58412.f17914.length <= iArr[iArr.length - 1]) {
                    int i = iArr[iArr.length - 1] + 1;
                    c58412.f17914 = new double[i];
                    c58412.f17916 = new double[i];
                }
            } else {
                f2 = f3;
            }
            Arrays.fill(c58412.f17914, Double.NaN);
            for (int i2 = 0; i2 < iArr.length; i2++) {
                double[] dArr4 = c58412.f17914;
                int i3 = iArr[i2];
                dArr4[i3] = dArr2[i2];
                c58412.f17916[i3] = dArr3[i2];
            }
            int i4 = 0;
            float f7 = Float.NaN;
            float f8 = 0.0f;
            float f9 = 0.0f;
            float f10 = 0.0f;
            float f11 = f4;
            float f12 = f5;
            float f13 = f6;
            float f14 = 0.0f;
            while (true) {
                double[] dArr5 = c58412.f17914;
                if (i4 >= dArr5.length) {
                    break;
                }
                if (!Double.isNaN(dArr5[i4])) {
                    float f15 = (float) (Double.isNaN(c58412.f17914[i4]) ? 0.0d : c58412.f17914[i4] + 0.0d);
                    float f16 = (float) c58412.f17916[i4];
                    if (i4 == 1) {
                        f8 = f16;
                        f2 = f15;
                    } else if (i4 == 2) {
                        f10 = f16;
                        f11 = f15;
                    } else if (i4 == 3) {
                        f9 = f16;
                        f12 = f15;
                    } else if (i4 == 4) {
                        f14 = f16;
                        f13 = f15;
                    } else if (i4 == 5) {
                        f7 = f15;
                    }
                }
                i4++;
            }
            if (Float.isNaN(f7)) {
                if (!Float.isNaN(Float.NaN)) {
                    view.setRotation(Float.NaN);
                }
                c5841 = c58412;
            } else {
                c5841 = c58412;
                view.setRotation((float) (Math.toDegrees(Math.atan2((f14 / 2.0f) + f10, (f9 / 2.0f) + f8)) + f7 + (Float.isNaN(Float.NaN) ? 0.0f : Float.NaN)));
            }
            float f17 = f2 + 0.5f;
            int i5 = (int) f17;
            float f18 = f11 + 0.5f;
            int i6 = (int) f18;
            int i7 = (int) (f17 + f12);
            int i8 = (int) (f18 + f13);
            int i9 = i7 - i5;
            int i10 = i8 - i6;
            if (i9 != view.getMeasuredWidth() || i10 != view.getMeasuredHeight()) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
            }
            view.layout(i5, i6, i7, i8);
            HashMap hashMap3 = this.f60602;
            if (hashMap3 != null) {
                for (AbstractC19123 abstractC19123 : hashMap3.values()) {
                    if (abstractC19123 instanceof C17711) {
                        double[] dArr6 = this.f60599;
                        view.setRotation(((C17711) abstractC19123).m44146(m44397) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                    }
                }
            }
            if (c7833 != null) {
                double[] dArr7 = this.f60599;
                view.setRotation(c7833.m16150(m44397, j, view, c14867) + ((float) Math.toDegrees(Math.atan2(dArr7[1], dArr7[0]))));
                z = c7833.f17634 | z;
            }
            int i11 = 1;
            while (true) {
                AbstractC20513[] abstractC20513Arr2 = this.f60591;
                if (i11 >= abstractC20513Arr2.length) {
                    break;
                }
                AbstractC20513 abstractC205132 = abstractC20513Arr2[i11];
                float[] fArr = this.f60605;
                abstractC205132.mo7170(d, fArr);
                ((C13888) c5841.f17922.get(this.f60600[i11 - 1])).m33293(view, fArr);
                i11++;
            }
            C18542 c18542 = this.f60607;
            if (c18542.f57462 == 0) {
                if (m44397 <= 0.0f) {
                    view.setVisibility(c18542.f57469);
                } else {
                    C18542 c185422 = this.f60592;
                    if (m44397 >= 1.0f) {
                        view.setVisibility(c185422.f57469);
                    } else if (c185422.f57469 != c18542.f57469) {
                        view.setVisibility(0);
                    }
                }
            }
            if (this.f60589 != null) {
                int i12 = 0;
                while (true) {
                    C3725[] c3725Arr = this.f60589;
                    if (i12 >= c3725Arr.length) {
                        break;
                    }
                    c3725Arr[i12].m11327(m44397, view);
                    i12++;
                }
            }
        } else {
            float f19 = c58412.f17915;
            C5841 c58413 = this.f60609;
            float m46695 = C20382.m46695(c58413.f17915, f19, m44397, f19);
            float f20 = c58412.f17911;
            float m466952 = C20382.m46695(c58413.f17911, f20, m44397, f20);
            float f21 = c58412.f17920;
            float f22 = c58413.f17920;
            float m466953 = C20382.m46695(f22, f21, m44397, f21);
            float f23 = c58412.f17923;
            float f24 = c58413.f17923;
            float f25 = m46695 + 0.5f;
            int i13 = (int) f25;
            float f26 = m466952 + 0.5f;
            int i14 = (int) f26;
            int i15 = (int) (f25 + m466953);
            int m466954 = (int) (f26 + C20382.m46695(f24, f23, m44397, f23));
            int i16 = i15 - i13;
            int i17 = m466954 - i14;
            if (f22 != f21 || f24 != f23) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(i17, 1073741824));
            }
            view.layout(i13, i14, i15, m466954);
        }
        HashMap hashMap4 = this.f60597;
        if (hashMap4 != null) {
            for (AbstractC14307 abstractC14307 : hashMap4.values()) {
                if (abstractC14307 instanceof C9930) {
                    double[] dArr8 = this.f60599;
                    view.setRotation(((C9930) abstractC14307).m34132(m44397) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    abstractC14307.mo5474(m44397, view);
                }
            }
        }
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44400(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.f60590;
        float m44397 = m44397(f, fArr2);
        AbstractC20513[] abstractC20513Arr = this.f60591;
        C5841 c5841 = this.f60598;
        int i = 0;
        if (abstractC20513Arr != null) {
            double d = m44397;
            abstractC20513Arr[0].mo7173(d, this.f60599);
            this.f60591[0].mo7169(d, this.f60595);
            float f4 = fArr2[0];
            while (true) {
                dArr = this.f60599;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * f4;
                i++;
            }
            AbstractC20513 abstractC20513 = this.f60586;
            if (abstractC20513 != null) {
                double[] dArr2 = this.f60595;
                if (dArr2.length > 0) {
                    abstractC20513.mo7169(d, dArr2);
                    this.f60586.mo7173(d, this.f60599);
                    int[] iArr = this.f60594;
                    double[] dArr3 = this.f60599;
                    double[] dArr4 = this.f60595;
                    c5841.getClass();
                    C5841.m16360(f2, f3, fArr, iArr, dArr3, dArr4);
                    return;
                }
                return;
            }
            int[] iArr2 = this.f60594;
            double[] dArr5 = this.f60595;
            c5841.getClass();
            C5841.m16360(f2, f3, fArr, iArr2, dArr, dArr5);
            return;
        }
        C5841 c58412 = this.f60609;
        float f5 = c58412.f17915 - c5841.f17915;
        float f6 = c58412.f17911 - c5841.f17911;
        float f7 = c58412.f17920 - c5841.f17920;
        float f8 = (c58412.f17923 - c5841.f17923) + f6;
        fArr[0] = ((f7 + f5) * f2) + ((1.0f - f2) * f5);
        fArr[1] = (f8 * f3) + ((1.0f - f3) * f6);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44401(float f, int i, int i2, float f2, float f3, float[] fArr) {
        float[] fArr2 = this.f60590;
        float m44397 = m44397(f, fArr2);
        HashMap hashMap = this.f60602;
        AbstractC19123 abstractC19123 = hashMap == null ? null : (AbstractC19123) hashMap.get("translationX");
        HashMap hashMap2 = this.f60602;
        AbstractC19123 abstractC191232 = hashMap2 == null ? null : (AbstractC19123) hashMap2.get("translationY");
        HashMap hashMap3 = this.f60602;
        AbstractC19123 abstractC191233 = hashMap3 == null ? null : (AbstractC19123) hashMap3.get("rotation");
        HashMap hashMap4 = this.f60602;
        AbstractC19123 abstractC191234 = hashMap4 == null ? null : (AbstractC19123) hashMap4.get("scaleX");
        HashMap hashMap5 = this.f60602;
        AbstractC19123 abstractC191235 = hashMap5 == null ? null : (AbstractC19123) hashMap5.get("scaleY");
        HashMap hashMap6 = this.f60597;
        AbstractC14307 abstractC14307 = hashMap6 == null ? null : (AbstractC14307) hashMap6.get("translationX");
        HashMap hashMap7 = this.f60597;
        AbstractC14307 abstractC143072 = hashMap7 == null ? null : (AbstractC14307) hashMap7.get("translationY");
        HashMap hashMap8 = this.f60597;
        AbstractC14307 abstractC143073 = hashMap8 == null ? null : (AbstractC14307) hashMap8.get("rotation");
        HashMap hashMap9 = this.f60597;
        AbstractC14307 abstractC143074 = hashMap9 == null ? null : (AbstractC14307) hashMap9.get("scaleX");
        HashMap hashMap10 = this.f60597;
        AbstractC14307 abstractC143075 = hashMap10 != null ? (AbstractC14307) hashMap10.get("scaleY") : null;
        C19102 c19102 = new C19102();
        c19102.m44024();
        c19102.m44028(abstractC191233, m44397);
        c19102.m44031(abstractC19123, abstractC191232, m44397);
        c19102.m44029(abstractC191234, abstractC191235, m44397);
        c19102.m44026(abstractC143073, m44397);
        c19102.m44030(abstractC14307, abstractC143072, m44397);
        c19102.m44027(abstractC143074, abstractC143075, m44397);
        AbstractC20513 abstractC20513 = this.f60586;
        C5841 c5841 = this.f60598;
        if (abstractC20513 != null) {
            double[] dArr = this.f60595;
            if (dArr.length > 0) {
                double d = m44397;
                abstractC20513.mo7169(d, dArr);
                this.f60586.mo7173(d, this.f60599);
                int[] iArr = this.f60594;
                double[] dArr2 = this.f60599;
                double[] dArr3 = this.f60595;
                c5841.getClass();
                C5841.m16360(f2, f3, fArr, iArr, dArr2, dArr3);
            }
            c19102.m44025(f2, f3, i, i2, fArr);
            return;
        }
        if (this.f60591 != null) {
            double m443972 = m44397(m44397, fArr2);
            this.f60591[0].mo7173(m443972, this.f60599);
            this.f60591[0].mo7169(m443972, this.f60595);
            float f4 = fArr2[0];
            int i3 = 0;
            while (true) {
                double[] dArr4 = this.f60599;
                if (i3 < dArr4.length) {
                    dArr4[i3] = dArr4[i3] * f4;
                    i3++;
                } else {
                    int[] iArr2 = this.f60594;
                    double[] dArr5 = this.f60595;
                    c5841.getClass();
                    C5841.m16360(f2, f3, fArr, iArr2, dArr4, dArr5);
                    c19102.m44025(f2, f3, i, i2, fArr);
                    return;
                }
            }
        } else {
            C5841 c58412 = this.f60609;
            float f5 = c58412.f17915 - c5841.f17915;
            AbstractC14307 abstractC143076 = abstractC143075;
            float f6 = c58412.f17911 - c5841.f17911;
            float f7 = c58412.f17920 - c5841.f17920;
            float f8 = (c58412.f17923 - c5841.f17923) + f6;
            fArr[0] = ((f7 + f5) * f2) + ((1.0f - f2) * f5);
            fArr[1] = (f8 * f3) + ((1.0f - f3) * f6);
            c19102.m44024();
            c19102.m44028(abstractC191233, m44397);
            c19102.m44031(abstractC19123, abstractC191232, m44397);
            c19102.m44029(abstractC191234, abstractC191235, m44397);
            c19102.m44026(abstractC143073, m44397);
            c19102.m44030(abstractC14307, abstractC143072, m44397);
            c19102.m44027(abstractC143074, abstractC143076, m44397);
            c19102.m44025(f2, f3, i, i2, fArr);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m44398() {
        int i = this.f60598.f17921;
        Iterator it = this.f60603.iterator();
        while (it.hasNext()) {
            i = Math.max(i, ((C5841) it.next()).f17921);
        }
        return Math.max(i, this.f60609.f17921);
    }
}
