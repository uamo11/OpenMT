package l;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: Y8WD */
/* renamed from: l.۬ۙۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12881 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final float[] f38660 = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f38661;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f38662;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f38663;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f38664;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f38665;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f38666;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f38667;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f38668;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f38669;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f38670;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float[] f38671;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f38672;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3004 m31313(Context context) {
        C21182 c21182 = new C21182(context.getResources().getDisplayMetrics().density);
        C3004 c3004 = new C3004();
        c3004.m9167(c21182.m48131(8));
        c3004.m9159(c21182.m48131(24));
        c3004.m9163(c21182.m48131(4));
        c3004.m9166(c21182.m48131(1));
        c3004.m9170(c21182.m48131(1));
        c3004.m9169(c21182.m48131(4));
        return c3004;
    }

    public C12881(C3004 c3004) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float[] fArr;
        int i8;
        int i9;
        int i10;
        z = c3004.f9459;
        this.f38664 = z;
        i = c3004.f9456;
        this.f38661 = i;
        i2 = c3004.f9460;
        this.f38665 = i2;
        i3 = c3004.f9463;
        this.f38668 = i3;
        i4 = c3004.f9464;
        this.f38669 = i4;
        i5 = c3004.f9461;
        this.f38666 = i5;
        i6 = c3004.f9457;
        this.f38662 = i6;
        i7 = c3004.f9467;
        this.f38672 = i7;
        fArr = c3004.f9466;
        this.f38671 = fArr;
        i8 = c3004.f9458;
        this.f38663 = i8;
        i9 = c3004.f9462;
        this.f38667 = i9;
        i10 = c3004.f9465;
        this.f38670 = i10;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31317(TextPaint textPaint) {
        if (this.f38664) {
            textPaint.setUnderlineText(true);
        }
        textPaint.setColor(textPaint.linkColor);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31320(Paint paint) {
        if (this.f38664) {
            paint.setUnderlineText(true);
        }
        if (paint instanceof TextPaint) {
            paint.setColor(((TextPaint) paint).linkColor);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m31314() {
        return this.f38661;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m31319() {
        int i = this.f38665;
        return i == 0 ? (int) ((this.f38661 * 0.25f) + 0.5f) : i;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m31322(Paint paint) {
        paint.setColor(paint.getColor());
        int i = this.f38668;
        if (i != 0) {
            paint.setStrokeWidth(i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m31315(int i) {
        int min = Math.min(this.f38661, i) / 2;
        int i2 = this.f38669;
        return (i2 == 0 || i2 > min) ? min : i2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m31321() {
        return this.f38670;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m31323() {
        return this.f38666;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31318(TextPaint textPaint, int i) {
        textPaint.setFakeBoldText(true);
        float[] fArr = this.f38671;
        if (fArr == null) {
            fArr = f38660;
        }
        if (fArr.length >= i) {
            textPaint.setTextSize(textPaint.getTextSize() * fArr[i - 1]);
            return;
        }
        Locale locale = Locale.US;
        throw new IllegalStateException("Supplied heading level: " + i + " is invalid, where configured heading sizes are: `" + Arrays.toString(fArr) + "`");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31316(Paint paint) {
        int i = this.f38672;
        if (i == 0) {
            i = AbstractC7070.m19071(paint.getColor(), 75);
        }
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        int i2 = this.f38662;
        if (i2 >= 0) {
            paint.setStrokeWidth(i2);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m31324(Paint paint) {
        int i = this.f38663;
        if (i == 0) {
            i = AbstractC7070.m19071(paint.getColor(), 25);
        }
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        int i2 = this.f38667;
        if (i2 >= 0) {
            paint.setStrokeWidth(i2);
        }
    }
}
