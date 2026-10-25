package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: N933 */
/* renamed from: l.ۗ᩷ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3483 extends Drawable {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Paint f11032 = new Paint();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f11033;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    public C3483(int i) {
        this.f11033 = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        Rect bounds = getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        int width = bounds.width();
        int i7 = this.f11033;
        int i8 = width / i7;
        int height = bounds.height() / i7;
        boolean z = false;
        for (int i9 = 0; i9 <= height; i9++) {
            int i10 = 0;
            boolean z2 = z;
            while (i10 <= i8) {
                int i11 = (i10 * i7) + i3;
                int i12 = (i9 * i7) + i4;
                int min = Math.min(i5, i11 + i7);
                int min2 = Math.min(i6, i12 + i7);
                if (z2) {
                    i = height;
                    i2 = -1;
                } else {
                    i = height;
                    i2 = -3421237;
                }
                int i13 = i3;
                Paint paint = this.f11032;
                paint.setColor(i2);
                canvas.drawRect(i11, i12, min, min2, paint);
                z2 = !z2;
                i10++;
                i3 = i13;
                height = i;
            }
            z = !z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw new UnsupportedOperationException("Alpha is not supported by this drawable.");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("ColorFilter is not supported by this drawable.");
    }
}
