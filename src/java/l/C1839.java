package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: G90S */
/* renamed from: l.֫۬ۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1839 extends ReplacementSpan {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f6284;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC7196 f6285;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6778 f6288;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f6290;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f6291;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f6292;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f6293;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f6294;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Rect f6287 = new Rect();

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Paint f6289 = new Paint(1);

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final TextPaint f6286 = new TextPaint();

    public C1839(C6778 c6778, ArrayList arrayList, boolean z, boolean z2) {
        this.f6288 = c6778;
        this.f6292 = arrayList;
        this.f6284 = new ArrayList(arrayList.size());
        this.f6293 = z;
        this.f6290 = z2;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        ArrayList arrayList = this.f6284;
        if (arrayList.size() > 0 && fontMetricsInt != null) {
            Iterator it = arrayList.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int height = ((Layout) it.next()).getHeight();
                if (height > i3) {
                    i3 = height;
                }
            }
            this.f6291 = i3;
            int i4 = -((this.f6288.f21048 * 2) + i3);
            fontMetricsInt.ascent = i4;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i4;
            fontMetricsInt.bottom = 0;
        }
        return this.f6294;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        ArrayList arrayList;
        int i7;
        int i8;
        int i9;
        boolean z;
        InterfaceC7196 interfaceC7196;
        int save;
        float f2 = f;
        int m26389 = AbstractC10494.m26389(canvas, charSequence);
        int i10 = this.f6294;
        boolean z2 = this.f6293;
        ArrayList arrayList2 = this.f6284;
        C6778 c6778 = this.f6288;
        if (i10 != m26389) {
            this.f6294 = m26389;
            boolean z3 = paint instanceof TextPaint;
            TextPaint textPaint = this.f6286;
            if (z3) {
                textPaint.set((TextPaint) paint);
            } else {
                textPaint.set(paint);
            }
            textPaint.setFakeBoldText(z2);
            List list = this.f6292;
            int m6116 = m6116(list.size()) - (c6778.f21048 * 2);
            arrayList2.clear();
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                m6112(i11, m6116, (C13545) list.get(i11));
            }
        }
        int i12 = c6778.f21048;
        int size2 = arrayList2.size();
        int m61162 = m6116(size2);
        int i13 = m61162 - (this.f6294 / size2);
        Paint paint2 = this.f6289;
        if (z2) {
            paint2.setColor(c6778.f21049);
            paint2.setStyle(Paint.Style.FILL);
            i6 = i12;
        } else if (this.f6290) {
            int i14 = c6778.f21047;
            if (i14 == 0) {
                i6 = i12;
                i14 = AbstractC7070.m19071(paint2.getColor(), 22);
            } else {
                i6 = i12;
            }
            paint2.setColor(i14);
            paint2.setStyle(Paint.Style.FILL);
        } else {
            i6 = i12;
            paint2.setColor(c6778.f21050);
            paint2.setStyle(Paint.Style.FILL);
        }
        int color = paint2.getColor();
        Rect rect = this.f6287;
        if (color != 0) {
            save = canvas.save();
            i8 = i13;
            try {
                i7 = m61162;
                arrayList = arrayList2;
                rect.set(0, 0, this.f6294, i5 - i3);
                canvas.translate(f2, i3);
                canvas.drawRect(rect, paint2);
            } finally {
            }
        } else {
            arrayList = arrayList2;
            i7 = m61162;
            i8 = i13;
        }
        paint2.set(paint);
        int i15 = c6778.f21045;
        if (i15 == 0) {
            i15 = AbstractC7070.m19071(paint2.getColor(), 75);
        }
        paint2.setColor(i15);
        paint2.setStyle(Paint.Style.FILL);
        int i16 = c6778.f21046;
        if (i16 == -1) {
            i16 = (int) (paint2.getStrokeWidth() + 0.5f);
        }
        boolean z4 = i16 > 0;
        int i17 = i5 - i3;
        int i18 = (i17 - this.f6291) / 4;
        if (z4) {
            i9 = i18;
            C14538[] c14538Arr = (C14538[]) ((Spanned) charSequence).getSpans(i, i2, C14538.class);
            if (c14538Arr != null && c14538Arr.length > 0) {
                C14538 c14538 = c14538Arr[0];
                if ((charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(c14538) == i) {
                    rect.set((int) f2, i3, this.f6294, i3 + i16);
                    canvas.drawRect(rect, paint2);
                    z = true;
                    rect.set((int) f2, i5 - i16, this.f6294, i5);
                    canvas.drawRect(rect, paint2);
                }
            }
            z = false;
            rect.set((int) f2, i5 - i16, this.f6294, i5);
            canvas.drawRect(rect, paint2);
        } else {
            i9 = i18;
            z = false;
        }
        int i19 = z ? i16 : 0;
        int i20 = i17 - i16;
        int i21 = 0;
        int i22 = 0;
        while (i21 < size2) {
            Layout layout = (Layout) arrayList.get(i21);
            save = canvas.save();
            try {
                canvas.translate((i21 * i7) + f2, i3);
                if (z4) {
                    rect.set(0, i19, i16, i20);
                    canvas.drawRect(rect, paint2);
                    if (i21 == size2 - 1) {
                        rect.set((i7 - i16) - i8, i19, i7 - i8, i20);
                        canvas.drawRect(rect, paint2);
                    }
                }
                int i23 = i6;
                int i24 = i19;
                canvas.translate(i23, i23 + i9);
                layout.draw(canvas);
                if (layout.getHeight() > i22) {
                    i22 = layout.getHeight();
                }
                canvas.restoreToCount(save);
                i21++;
                i19 = i24;
                i6 = i23;
                f2 = f;
            } finally {
            }
        }
        if (this.f6291 == i22 || (interfaceC7196 = this.f6285) == null) {
            return;
        }
        C18067 c18067 = (C18067) interfaceC7196;
        TextView textView = c18067.f56284;
        Runnable runnable = c18067.f56283;
        textView.removeCallbacks(runnable);
        textView.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m6112(int i, int i2, C13545 c13545) {
        Layout.Alignment alignment;
        RunnableC5785 runnableC5785 = new RunnableC5785(this, i, i2, c13545);
        Spannable spannable = (Spannable) c13545.f40431;
        int i3 = c13545.f40430;
        if (i3 == 1) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i3 == 2) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        StaticLayout staticLayout = new StaticLayout(spannable, this.f6286, i2, alignment, 1.0f, 0.0f, false);
        C18485.m42974(spannable, staticLayout);
        C0387[] c0387Arr = (C0387[]) spannable.getSpans(0, spannable.length(), C0387.class);
        if (c0387Arr != null && c0387Arr.length > 0) {
            for (C0387 c0387 : c0387Arr) {
                C17321 m1882 = c0387.m1882();
                if (m1882.getCallback() == null) {
                    m1882.m40641(new C11430(runnableC5785));
                }
            }
        }
        this.f6284.add(i, staticLayout);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Layout m6118(int i) {
        ArrayList arrayList = this.f6284;
        int size = arrayList.size();
        int m6116 = i / m6116(size);
        if (m6116 >= size) {
            return null;
        }
        return (Layout) arrayList.get(m6116);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m6115() {
        return m6116(this.f6284.size());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m6116(int i) {
        return (int) (((this.f6294 * 1.0f) / i) + 0.5f);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6117(InterfaceC7196 interfaceC7196) {
        this.f6285 = interfaceC7196;
    }
}
