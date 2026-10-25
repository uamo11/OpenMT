package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.material.badge.BadgeDrawable;

/* compiled from: 1AG9 */
/* renamed from: l.ۢ۫ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C9584 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final C19161 f29047;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final String[] f29048;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String[] f29049;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f29050;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f29051;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float[] f29052;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float f29053;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f29054;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC23694 f29055;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f29056;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f29057;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C1539 f29058;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f29059;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f29060;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f29061;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f29062;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f29063;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float[] f29064;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C2528 f29065;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f29066;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f29067;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float f29068;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f29069;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f29070;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final char[] f29071;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f29072;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12474 f29073;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Rect f29074;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f29075;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f29076;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f29077;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f29078;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f29079;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C18756 f29080;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f29081;

    static {
        String[] strArr = new String[128];
        for (char c = 0; c < 128; c = (char) (c + 1)) {
            strArr[c] = String.valueOf(c);
        }
        f29048 = strArr;
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[0] = "NUL";
        strArr2[1] = "SOH";
        strArr2[2] = "STX";
        strArr2[3] = "ETX";
        strArr2[4] = "EOT";
        strArr2[5] = "ENQ";
        strArr2[6] = "ACK";
        strArr2[7] = "BEL";
        strArr2[8] = "BS";
        strArr2[11] = "VT";
        strArr2[12] = "FF";
        strArr2[14] = "SO";
        strArr2[15] = "SI";
        strArr2[16] = "DLE";
        strArr2[17] = "DC1";
        strArr2[18] = "DC2";
        strArr2[19] = "DC3";
        strArr2[20] = "DC4";
        strArr2[21] = "NAK";
        strArr2[22] = "SYN";
        strArr2[23] = "ETB";
        strArr2[24] = "CAN";
        strArr2[25] = "EM";
        strArr2[26] = "SUB";
        strArr2[27] = "ESC";
        strArr2[28] = "FS";
        strArr2[29] = "GS";
        strArr2[30] = "RS";
        strArr2[31] = "US";
        strArr2[127] = "DEL";
        f29049 = strArr2;
        char[] cArr = {129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 173, 8192, 8193, 8194, 8195, 8196, 8197, 8198, 8199, 8200, 8201, 8202, 8203, 8204, 8205, 8206, 8207, 8232, 8233, 8234, 8235, 8236, 8237, 8238, 8239, 8287, 8288, 8289, 8290, 8291, 8292, 8294, 8295, 8296, 8297, 8298, 8299, 8300, 8301, 8302, 8303, 65279};
        String[] strArr3 = {"HOP", "BPH", "NBH", "IND", "NEL", "SSA", "ESA", "HTS", "HTJ", "VTS", "PLD", "PLU", "RI", "SS2", "SS3", "DCS", "PU1", "PU2", "STS", "CCH", "MW", "SPA", "EPA", "SOS", "SGCI", "SCI", "CSI", "ST", "OSC", "PM", "APC", "NBSP", "SHY", "NQSP", "MQSP", "ENSP", "EMSP", "3/MSP", "4/MSP", "6/MSP", "FSP", "PSP", "THSP", "HSP", "ZWSP", "ZWNJ", "ZWJ", "LRM", "RLM", "LSEP", "PSEP", "LRE", "RLE", "PDF", "LRO", "RLO", "NNBSP", "MMSP", "WJ", "f()", "x", ",", BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "LRI", "RLI", "FSI", "PDI", "ISS", "ASS", "IAFS", "AAFS", "NADS", "NODS", "ZWNBSP"};
        C19161 c19161 = new C19161(74);
        for (int i = 0; i < 74; i++) {
            c19161.mo13246(cArr[i], strArr3[i]);
        }
        f29047 = c19161;
    }

    public C9584(Context context) {
        this.f29078 = 1.0f;
        this.f29080 = new C18756();
        this.f29073 = C10358.m26166(new C21214());
        this.f29081 = false;
        this.f29059 = false;
        this.f29050 = false;
        this.f29066 = 4;
        this.f29079 = false;
        this.f29076 = true;
        this.f29075 = false;
        this.f29064 = new float[128];
        this.f29052 = new float[128];
        this.f29074 = new Rect();
        this.f29071 = new char[256];
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f29068 = displayMetrics.density;
        this.f29053 = displayMetrics.scaledDensity;
        C1539 c1539 = new C1539(0);
        this.f29058 = c1539;
        c1539.setTextAlign(Paint.Align.LEFT);
        c1539.setStyle(Paint.Style.FILL);
        c1539.setTypeface(Typeface.DEFAULT);
        m24483();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9584 m24488() {
        return new C9584(this);
    }

    public C9584(C9584 c9584) {
        this.f29078 = 1.0f;
        this.f29080 = new C18756();
        this.f29073 = C10358.m26166(new C21214());
        this.f29081 = false;
        this.f29059 = false;
        this.f29050 = false;
        this.f29066 = 4;
        this.f29079 = false;
        this.f29076 = true;
        this.f29075 = false;
        float[] fArr = new float[128];
        this.f29064 = fArr;
        float[] fArr2 = new float[128];
        this.f29052 = fArr2;
        this.f29074 = new Rect();
        this.f29071 = new char[256];
        this.f29068 = c9584.f29068;
        this.f29053 = c9584.f29053;
        this.f29058 = new C1539(c9584.f29058);
        this.f29063 = c9584.f29063;
        this.f29061 = c9584.f29061;
        this.f29070 = c9584.f29070;
        this.f29062 = c9584.f29062;
        this.f29078 = c9584.f29078;
        this.f29069 = c9584.f29069;
        this.f29060 = c9584.f29060;
        this.f29072 = c9584.f29072;
        this.f29077 = c9584.f29077;
        this.f29056 = c9584.f29056;
        this.f29067 = c9584.f29067;
        this.f29081 = c9584.f29081;
        this.f29059 = c9584.f29059;
        this.f29050 = c9584.f29050;
        this.f29066 = c9584.f29066;
        this.f29051 = c9584.f29051;
        this.f29057 = c9584.f29057;
        this.f29079 = c9584.f29079;
        this.f29076 = c9584.f29076;
        this.f29054 = c9584.f29054;
        System.arraycopy(c9584.f29064, 0, fArr, 0, 128);
        System.arraycopy(c9584.f29052, 0, fArr2, 0, 128);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float m24496() {
        return this.f29062;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float m24484() {
        return this.f29069;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float m24501() {
        return this.f29060;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m24500() {
        return this.f29078;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo24477(float f) {
        if (f < 0.8f || f > 2.0f) {
            throw new IllegalArgumentException("Line spacing must be between 0.8 and 2.0");
        }
        this.f29078 = f;
        m24466(this.f29058.getFontMetrics());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24466(Paint.FontMetrics fontMetrics) {
        float fontSpacing = this.f29058.getFontSpacing() * this.f29078;
        this.f29069 = fontSpacing;
        Math.ceil(fontSpacing);
        float f = fontMetrics.ascent;
        this.f29060 = ((this.f29069 - (fontMetrics.descent - f)) / 2.0f) + (-f);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float m24495() {
        return this.f29061;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m24491() {
        return this.f29070;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m24493() {
        return this.f29072;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float m24486() {
        return this.f29056;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m24492() {
        return this.f29063;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24489(int i) {
        this.f29063 = i;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m24482() {
        return this.f29081;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24479(boolean z) {
        this.f29081 = z;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m24498() {
        return this.f29050;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24490(boolean z) {
        this.f29050 = z;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m24485() {
        return this.f29066;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24478(int i) {
        this.f29066 = i;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m24499() {
        return this.f29079;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m24494(boolean z) {
        this.f29079 = z;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m24470() {
        return this.f29076;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m24497(boolean z) {
        this.f29076 = z;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m24481() {
        float[] fArr;
        float[] fArr2;
        C1539 c1539 = this.f29058;
        Paint.FontMetrics fontMetrics = c1539.getFontMetrics();
        float f = fontMetrics.bottom - fontMetrics.top;
        this.f29061 = f;
        this.f29070 = (int) Math.ceil(f);
        this.f29054 = (int) Math.ceil(this.f29061 / 25.0f);
        this.f29072 = c1539.measureText("我");
        this.f29077 = c1539.measureText("�");
        this.f29062 = -fontMetrics.top;
        m24466(fontMetrics);
        float measureText = c1539.measureText("n");
        float measureText2 = c1539.measureText(" ");
        if (measureText2 < measureText) {
            measureText2 = C20382.m46695(measureText, measureText2, 0.62f, measureText2);
        }
        this.f29056 = (float) Math.ceil(measureText2);
        this.f29067 = (float) Math.ceil(measureText2 / 2.0f);
        int i = 0;
        int i2 = 0;
        while (true) {
            fArr = this.f29052;
            fArr2 = this.f29064;
            if (i2 >= 128) {
                break;
            }
            String str = f29048[i2];
            String str2 = f29049[i2];
            if (str.equals(str2)) {
                float measureText3 = c1539.measureText(str);
                fArr[i2] = measureText3;
                fArr2[i2] = measureText3;
            } else {
                fArr2[i2] = c1539.measureText(str);
                fArr[i2] = c1539.measureText(str2) + (this.f29054 * 2);
            }
            i2++;
        }
        float f2 = this.f29056;
        fArr2[0] = f2 / 50.0f;
        fArr2[32] = f2;
        fArr2[10] = f2;
        fArr2[13] = f2;
        fArr[32] = f2;
        fArr[10] = f2;
        fArr[13] = f2;
        this.f29059 = fArr2[105] == fArr2[119] && fArr2[46] == fArr2[109];
        int measureText4 = (int) (c1539.measureText("Z") + 1.0f);
        int i3 = (int) (this.f29061 + 1.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measureText4, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-1);
        c1539.setColor(-16777216);
        canvas.drawText("Z", 0.0f, this.f29062, c1539);
        int[] iArr = new int[i3];
        createBitmap.getPixels(iArr, 0, 1, measureText4 / 2, 0, 1, i3);
        createBitmap.recycle();
        this.f29051 = 0.0f;
        this.f29057 = this.f29061;
        while (true) {
            if (i >= i3) {
                break;
            }
            if (iArr[i] != -1) {
                this.f29051 = i;
                break;
            }
            i++;
        }
        int i4 = i3 - 1;
        while (true) {
            if (i4 < 0) {
                break;
            }
            if (iArr[i4] != -1) {
                this.f29057 = i4;
                break;
            }
            i4--;
        }
        this.f29080.m43428();
        this.f29073.clear();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m24487(CharSequence charSequence, int i, int i2, float f) {
        return m24469(charSequence, i, i2, f, Float.POSITIVE_INFINITY);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m24475(CharSequence charSequence, int i, int i2, float f, float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid maximum text width");
        }
        return m24469(charSequence, i, i2, f, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x024f, code lost:
    
        r11 = r11;
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0102, code lost:
    
        if (r8 == r9) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0145, code lost:
    
        if (r9 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0177, code lost:
    
        r7 = r9.floatValue() + (r21.f29054 * 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016c, code lost:
    
        r9 = java.lang.Float.valueOf(r12.measureText(r7));
        r13.m43429(r7, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0157, code lost:
    
        if (r9 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x016a, code lost:
    
        if (r9 == null) goto L97;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x0116. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float m24469(java.lang.CharSequence r22, int r23, int r24, float r25, float r26) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9584.m24469(java.lang.CharSequence, int, int, float, float):float");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6761 m24476(CharSequence charSequence, int i, int i2, float f, C18159 c18159) {
        if (i < 0 || i2 < i || i2 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        return new C6761(this, charSequence, i, i2, f, c18159);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private float m24468(char c) {
        C12474 c12474 = this.f29073;
        float m30634 = c12474.m30634(c);
        if (m30634 != -1.0f) {
            return m30634;
        }
        float measureText = this.f29058.measureText(String.valueOf(c));
        c12474.mo8401(measureText, c);
        return measureText;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m24471(char c) {
        return (this.f29079 ? this.f29052 : this.f29064)[c];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float[] m24480() {
        return this.f29079 ? this.f29052 : this.f29064;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m24474(CharSequence charSequence, int i, int i2, float f) {
        boolean z = this.f29079;
        float[] fArr = this.f29064;
        float[] fArr2 = z ? this.f29052 : fArr;
        boolean z2 = this.f29076;
        int i3 = i2 - i;
        C18756 c18756 = this.f29080;
        if (i3 == 1) {
            char charAt = charSequence.charAt(i);
            byte m30591 = C12425.m30591(charAt);
            C1539 c1539 = this.f29058;
            C19161 c19161 = f29047;
            switch (m30591) {
                case 0:
                    return this.f29072;
                case 1:
                    return this.f29056;
                case 2:
                    return m24469(charSequence, i, i2, f, Float.POSITIVE_INFINITY);
                case 3:
                case 4:
                    return fArr2[charAt];
                case 5:
                    return this.f29077;
                case 6:
                    return fArr[0];
                case 7:
                    return m24468(charAt);
                case 8:
                    if (z2) {
                        String str = (String) c19161.mo13249(charAt);
                        Float m43427 = c18756.m43427(str);
                        if (m43427 == null) {
                            m43427 = Float.valueOf(c1539.measureText(str));
                            c18756.m43429(str, m43427);
                        }
                        return m43427.floatValue() + (this.f29054 * 2);
                    }
                    break;
                case 9:
                    if (!z2) {
                        return fArr[0];
                    }
                    String str2 = (String) c19161.mo13249(charAt);
                    Float m434272 = c18756.m43427(str2);
                    if (m434272 == null) {
                        m434272 = Float.valueOf(c1539.measureText(str2));
                        c18756.m43429(str2, m434272);
                    }
                    return m434272.floatValue() + (this.f29054 * 2);
                case 10:
                    if (!z2) {
                        return this.f29056;
                    }
                    String str3 = (String) c19161.mo13249(charAt);
                    Float m434273 = c18756.m43427(str3);
                    if (m434273 == null) {
                        m434273 = Float.valueOf(c1539.measureText(str3));
                        c18756.m43429(str3, m434273);
                    }
                    return m434273.floatValue() + (this.f29054 * 2);
            }
            if (C13835.m33198(charAt)) {
                if (i > 0 && C13835.m33198(charSequence.charAt(i - 1))) {
                    if (C13835.m33195(charAt)) {
                        return m24468(charAt);
                    }
                    return this.f29067;
                }
            } else if (charAt != 8205) {
                return m24468(charAt);
            }
            return 0.0f;
        }
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        Float m434274 = c18756.m43427(charSequence2);
        if (m434274 == null) {
            m434274 = Float.valueOf(m24469(charSequence2, 0, charSequence2.length(), 0.0f, Float.POSITIVE_INFINITY));
            c18756.m43429(charSequence2, m434274);
        }
        return m434274.floatValue();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m24473(Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, int i4, float f3, Paint paint, int i5, boolean z, C13740 c13740) {
        InterfaceC23694 interfaceC23694 = this.f29055;
        this.f29055 = c13740;
        try {
            return m24472(canvas, charSequence, i, i2, f, f2, i3, i4, f3, paint, i5, z);
        } finally {
            this.f29055 = interfaceC23694;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24464(final Canvas canvas, final CharSequence charSequence, final int i, final int i2, final float f, final float f2, final Paint paint) {
        if (this.f29055 == null) {
            canvas.drawText(charSequence, i, i2, f, f2, paint);
            return;
        }
        boolean z = charSequence instanceof String;
        Rect rect = this.f29074;
        if (z) {
            paint.getTextBounds((String) charSequence, i, i2, rect);
        } else if (Build.VERSION.SDK_INT >= 29) {
            paint.getTextBounds(charSequence, i, i2, rect);
        } else {
            int i3 = i2 - i;
            char[] cArr = new char[i3];
            TextUtils.getChars(charSequence, i, i2, cArr, 0);
            paint.getTextBounds(cArr, 0, i3, rect);
        }
        m24462(canvas, f, f2, paint, new Runnable() { // from class: l.ᩳ۫ۡ
            @Override // java.lang.Runnable
            public final void run() {
                canvas.drawText(charSequence, i, i2, f, f2, paint);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24465(final Canvas canvas, final char[] cArr, final int i, final float f, final float f2, final Paint paint) {
        if (this.f29055 == null) {
            canvas.drawText(cArr, 0, i, f, f2, paint);
        } else {
            paint.getTextBounds(cArr, 0, i, this.f29074);
            m24462(canvas, f, f2, paint, new Runnable() { // from class: l.ܽ۫ۡ
                @Override // java.lang.Runnable
                public final void run() {
                    canvas.drawText(cArr, 0, i, f, f2, paint);
                }
            });
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24462(Canvas canvas, float f, float f2, Paint paint, Runnable runnable) {
        if (this.f29074.isEmpty()) {
            runnable.run();
        } else if (this.f29055.mo27305(canvas, paint, f + r0.left, f2 + r0.top, f + r0.right, f2 + r0.bottom, runnable)) {
            this.f29055 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24463(final Canvas canvas, final Paint paint, final float f, final float f2, final float f3, final float f4) {
        InterfaceC23694 interfaceC23694 = this.f29055;
        if (interfaceC23694 == null) {
            canvas.drawRect(f, f2, f3, f4, paint);
        } else if (interfaceC23694.mo27305(canvas, paint, f, f2, f3, f4, new Runnable() { // from class: l.ܿ۫ۡ
            @Override // java.lang.Runnable
            public final void run() {
                canvas.drawRect(f, f2, f3, f4, paint);
            }
        })) {
            this.f29055 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x04c9, code lost:
    
        r9 = r46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0596, code lost:
    
        r10 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0708, code lost:
    
        r15 = r54;
        r7 = r10;
        r1 = r12;
        r2 = r35;
        r10 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x09d6, code lost:
    
        r3 = r7;
        r0 = r26;
        r26 = r27;
        r27 = r28;
        r6 = r30;
        r4 = r32;
        r5 = r33;
        r7 = r34;
        r42 = r10;
        r10 = r9;
        r9 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0534, code lost:
    
        if (r2 != false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x053d, code lost:
    
        if ((r34[r29] + r28) < r51) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x053f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0540, code lost:
    
        r28 = r28 + r34[r29];
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0546, code lost:
    
        if (r2 == false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x054b, code lost:
    
        if (r28 <= r52) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x054d, code lost:
    
        r10 = r45;
        r15 = r54;
        r35 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0555, code lost:
    
        r35 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0807, code lost:
    
        r35 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0a7e, code lost:
    
        r12 = r0;
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x05b1, code lost:
    
        r10 = r17[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x05b3, code lost:
    
        if (r2 != false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x05ba, code lost:
    
        if ((r28 + r10) < r51) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05bc, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x05c2, code lost:
    
        if (r10 <= r31) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x05c4, code lost:
    
        if (r15 == false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x05c6, code lost:
    
        r2 = r16[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x05cd, code lost:
    
        if (r2.length() <= 1) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x05cf, code lost:
    
        r7 = r44.f29054;
        r6 = r7;
        r29 = r28 + r6;
        m24464(r45, r2, 0, r2.length(), r29, r25, r54);
        r0 = r25 - r44.f29062;
        r7 = r7 * 3;
        r2 = r7;
        r6 = (int) java.lang.Math.ceil((r44.f29051 + r0) - r2);
        r5 = (int) java.lang.Math.ceil((r0 + r44.f29057) + r2);
        r37 = r28 + r10;
        r3 = r6 + r7;
        r3 = r28;
        r55 = r10;
        m24463(r45, r54, r3, r6, r37, r3);
        r6 = r6 + r7;
        m24463(r45, r54, r3, r3, r29, r6);
        r35 = r37 - r6;
        m24463(r45, r54, r35, r3, r37, r6);
        r6 = r5 - r7;
        r3 = r28;
        m24463(r45, r54, r3, r6, r37, r5);
        r7 = r5 - r7;
        m24463(r45, r54, r3, r6, r29, r7);
        m24463(r45, r54, r35, r6, r37, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x065a, code lost:
    
        r10 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x06f3, code lost:
    
        r0 = r55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x06f5, code lost:
    
        r28 = r28 + r0;
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x06f9, code lost:
    
        if (r15 == false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x06fe, code lost:
    
        if (r28 <= r52) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0700, code lost:
    
        r10 = r45;
        r35 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0706, code lost:
    
        r35 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x065e, code lost:
    
        r55 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0660, code lost:
    
        if (r0 <= 0) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0662, code lost:
    
        r3[r29] = r0;
        r1 = l.C2528.f8017;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0668, code lost:
    
        if ('a' > r0) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x066c, code lost:
    
        if (r0 <= 'z') goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x067e, code lost:
    
        r1 = java.lang.Math.min(r3.length, r48 - r12);
        r2 = 1;
        r10 = r55;
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0689, code lost:
    
        if (r2 >= r1) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x068b, code lost:
    
        r0 = r9.charAt(r12 + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0693, code lost:
    
        if ('a' > r0) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0697, code lost:
    
        if (r0 <= 'z') goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x069a, code lost:
    
        r6 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x06b2, code lost:
    
        if (r6.m8040(r7, r0) == false) goto L550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x06b4, code lost:
    
        r3[r2] = r0;
        r10 = r10 + r17[r0];
        r2 = r2 + 1;
        r7 = r0;
        r47 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x06c5, code lost:
    
        if (l.C13835.m33197(r0) == false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x06c7, code lost:
    
        r3[r2] = r0;
        r7 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x06d7, code lost:
    
        r47 = r10;
        r10 = r6;
        m24465(r45, r3, r7, r28, r25, r54);
        r12 = r12 + (r7 - 1);
        r0 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x06cf, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x069f, code lost:
    
        if ('A' > r0) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x06a3, code lost:
    
        if (r0 <= 'Z') goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x06a7, code lost:
    
        if ('0' > r0) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x06ab, code lost:
    
        if (r0 > '9') goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x06bf, code lost:
    
        r6 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x06cd, code lost:
    
        r6 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0670, code lost:
    
        if ('A' > r0) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0674, code lost:
    
        if (r0 <= 'Z') goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0678, code lost:
    
        if ('0' > r0) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x067c, code lost:
    
        if (r0 > '9') goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x06d1, code lost:
    
        r6 = r47;
        r10 = r55;
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x06ef, code lost:
    
        r55 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x05bf, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014f, code lost:
    
        r9 = r10;
        r5 = r12;
        r10 = r45;
     */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0111  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float m24472(android.graphics.Canvas r45, java.lang.CharSequence r46, int r47, int r48, float r49, float r50, int r51, int r52, float r53, android.graphics.Paint r54, int r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 2924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9584.m24472(android.graphics.Canvas, java.lang.CharSequence, int, int, float, float, int, int, float, android.graphics.Paint, int, boolean):float");
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m24483() {
        C2528 c2528 = this.f29065;
        C1539 c1539 = this.f29058;
        if (c2528 == null || !c2528.f8022.equals(c1539.getTypeface())) {
            this.f29065 = C2528.m8037(c1539.getTypeface());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m24461(int i, int i2) {
        float alpha = Color.alpha(i2) / 255.0f;
        float f = 1.0f - alpha;
        return Color.rgb((int) ((Color.red(i2) * alpha) + (Color.red(i) * f)), (int) ((Color.green(i2) * alpha) + (Color.green(i) * f)), (int) ((Color.blue(i2) * alpha) + (Color.blue(i) * f)));
    }
}
