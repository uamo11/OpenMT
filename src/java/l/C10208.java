package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: M5T2 */
/* renamed from: l.ۤۢۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10208 implements InterfaceC1629 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bitmap f30665;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19883 f30666;

    public C10208(C19883 c19883, Drawable drawable) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        this.f30666 = c19883;
        i = RunnableC5974.f18332;
        i2 = RunnableC5974.f18332;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect copyBounds = drawable.copyBounds();
        i3 = RunnableC5974.f18337;
        i4 = RunnableC5974.f18337;
        i5 = RunnableC5974.f18332;
        i6 = RunnableC5974.f18332;
        drawable.setBounds(i3, i4, i5, i6);
        drawable.draw(canvas);
        drawable.setBounds(copyBounds);
        this.f30665 = createBitmap;
    }

    @Override // l.InterfaceC1629
    public final Object get() {
        int i;
        int i2;
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        Paint paint5;
        Paint paint6;
        i = RunnableC5974.f18332;
        i2 = RunnableC5974.f18332;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        paint = RunnableC5974.f18338;
        synchronized (paint) {
            Bitmap m28877 = this.f30666.f64250.m28877();
            paint2 = RunnableC5974.f18338;
            canvas.drawBitmap(m28877, 0.0f, 0.0f, paint2);
            if (C21943.m49431() && C18321.m42699(this.f30665)) {
                paint4 = RunnableC5974.f18338;
                paint4.setColorFilter(RunnableC5974.f18340);
                Bitmap bitmap = this.f30665;
                paint5 = RunnableC5974.f18338;
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint5);
                paint6 = RunnableC5974.f18338;
                paint6.setColorFilter(null);
            } else {
                Bitmap bitmap2 = this.f30665;
                paint3 = RunnableC5974.f18338;
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint3);
            }
        }
        return createBitmap;
    }
}
