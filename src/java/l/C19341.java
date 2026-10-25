package l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* compiled from: 38G7 */
/* renamed from: l.᩵۠ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19341 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f60796;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f60797;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f60798;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f60799;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public CharSequence f60800;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final float f60801;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Layout.Alignment f60802;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f60803;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public StaticLayout f60804;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public StaticLayout f60805;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f60806;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f60807;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f60808;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f60809;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f60810;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float f60811;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Paint f60812;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final Paint f60813;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f60814;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float f60815;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final float f60816;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TextPaint f60817;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f60818;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final float f60819;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f60820;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Rect f60821;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Bitmap f60822;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f60823;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f60824;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f60825;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f60826;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f60827;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f60828;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f60829;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f60830;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f60831;

    public C19341(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f60815 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f60811 = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f60819 = round;
        this.f60816 = round;
        this.f60801 = round;
        TextPaint textPaint = new TextPaint();
        this.f60817 = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f60813 = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f60812 = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0398  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m44565(l.C19811 r27, l.C22785 r28, float r29, float r30, float r31, android.graphics.Canvas r32, int r33, int r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19341.m44565(l.᩶֡֫, l.᩺ۚۧ, float, float, float, android.graphics.Canvas, int, int, int, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m44564(Canvas canvas, boolean z) {
        if (!z) {
            this.f60821.getClass();
            this.f60822.getClass();
            canvas.drawBitmap(this.f60822, (Rect) null, this.f60821, this.f60812);
            return;
        }
        StaticLayout staticLayout = this.f60805;
        StaticLayout staticLayout2 = this.f60804;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.f60814, this.f60807);
        if (Color.alpha(this.f60799) > 0) {
            int i = this.f60799;
            Paint paint = this.f60813;
            paint.setColor(i);
            canvas.drawRect(-this.f60830, 0.0f, staticLayout.getWidth() + this.f60830, staticLayout.getHeight(), paint);
        }
        int i2 = this.f60797;
        TextPaint textPaint = this.f60817;
        if (i2 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f60819);
            textPaint.setColor(this.f60796);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else {
            float f = this.f60816;
            if (i2 == 2) {
                float f2 = this.f60801;
                textPaint.setShadowLayer(f, f2, f2, this.f60796);
            } else if (i2 == 3 || i2 == 4) {
                boolean z2 = i2 == 3;
                int i3 = z2 ? -1 : this.f60796;
                int i4 = z2 ? this.f60796 : -1;
                float f3 = f / 2.0f;
                textPaint.setColor(this.f60808);
                textPaint.setStyle(Paint.Style.FILL);
                float f4 = -f3;
                textPaint.setShadowLayer(f, f4, f4, i3);
                staticLayout2.draw(canvas);
                textPaint.setShadowLayer(f, f3, f3, i4);
            }
        }
        textPaint.setColor(this.f60808);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }
}
