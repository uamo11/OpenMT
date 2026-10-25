package l;

import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.Arrays;

/* compiled from: 28V5 */
/* renamed from: l.ۡ۫ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8878 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Paint f27021;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char[] f27022;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Typeface f27023;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float[] f27024;

    public C8878(Typeface typeface) {
        int i;
        i = C2528.f8015;
        float[] fArr = new float[i];
        this.f27024 = fArr;
        this.f27022 = new char[40];
        this.f27023 = typeface;
        Paint paint = new Paint(1);
        this.f27021 = paint;
        paint.setTypeface(typeface);
        paint.setTextSize(15.0f);
        Arrays.fill(fArr, Float.NaN);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m22930(C8878 c8878, char c, char c2) {
        char[] cArr = c8878.f27022;
        int m8036 = C2528.m8036(c);
        int m80362 = C2528.m8036(c2);
        float m22928 = c8878.m22928(m8036);
        float m229282 = c8878.m22928(m80362);
        for (int i = 0; i < 40; i += 2) {
            cArr[i] = c;
            cArr[i + 1] = c2;
        }
        return Math.abs(((m22928 + m229282) * 20.0f) - c8878.f27021.measureText(cArr, 0, 40)) < 1.0f;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private float m22928(int i) {
        char[] cArr;
        float[] fArr = this.f27024;
        float f = fArr[i];
        if (!Float.isNaN(f)) {
            return f;
        }
        cArr = C2528.f8018;
        char c = cArr[i];
        char[] cArr2 = this.f27022;
        cArr2[0] = c;
        float measureText = this.f27021.measureText(cArr2, 0, 1);
        fArr[i] = measureText;
        return measureText;
    }
}
