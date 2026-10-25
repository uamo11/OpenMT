package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: 31IJ */
/* renamed from: l.۠᩸, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C8434 extends View {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f25831;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public View f25832;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f25833;

    public C8434(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25833 = -1;
        this.f25832 = null;
        this.f25831 = 4;
        m22114(attributeSet);
    }

    public C8434(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25833 = -1;
        this.f25832 = null;
        this.f25831 = 4;
        m22114(attributeSet);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22114(AttributeSet attributeSet) {
        super.setVisibility(this.f25831);
        this.f25833 = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C21840.f69984);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f25833 = obtainStyledAttributes.getResourceId(index, this.f25833);
                } else if (index == 1) {
                    this.f25831 = obtainStyledAttributes.getInt(index, this.f25831);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View m22115() {
        return this.f25832;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (height / 2.0f)) - rect.bottom, paint);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22116(C17606 c17606) {
        if (this.f25833 == -1 && !isInEditMode()) {
            setVisibility(this.f25831);
        }
        View findViewById = c17606.findViewById(this.f25833);
        this.f25832 = findViewById;
        if (findViewById != null) {
            ((C16900) findViewById.getLayoutParams()).f51916 = true;
            this.f25832.setVisibility(0);
            setVisibility(0);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22117() {
        if (this.f25832 == null) {
            return;
        }
        C16900 c16900 = (C16900) getLayoutParams();
        C16900 c169002 = (C16900) this.f25832.getLayoutParams();
        c169002.f51902.m35768(0);
        C15094 c15094 = c16900.f51902;
        EnumC8040 enumC8040 = c15094.f46124[0];
        EnumC8040 enumC80402 = EnumC8040.FIXED;
        if (enumC8040 != enumC80402) {
            c15094.m35770(c169002.f51902.m35753());
        }
        C15094 c150942 = c16900.f51902;
        if (c150942.f46124[1] != enumC80402) {
            c150942.m35733(c169002.f51902.m35732());
        }
        c169002.f51902.m35768(8);
    }
}
