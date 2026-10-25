package l;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.InputStream;

/* compiled from: 58Y6 */
/* renamed from: l.ܳ᩺ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14830 extends AbstractC13087 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Resources f45239;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14830 m35236() {
        return new C14830(Resources.getSystem());
    }

    public C14830(Resources resources) {
        this.f45239 = resources;
    }

    @Override // l.AbstractC13087
    /* renamed from: ֫ */
    public final Drawable mo15264(InputStream inputStream) {
        try {
            C16312 m38391 = C16312.m38391(inputStream);
            float m38410 = m38391.m38410();
            float m38405 = m38391.m38405();
            Resources resources = this.f45239;
            float f = resources.getDisplayMetrics().density;
            Bitmap createBitmap = Bitmap.createBitmap((int) ((m38410 * f) + 0.5f), (int) ((m38405 * f) + 0.5f), Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(f, f);
            m38391.m38401(canvas);
            return new BitmapDrawable(resources, createBitmap);
        } catch (C19136 e) {
            throw new IllegalStateException("Exception decoding SVG", e);
        }
    }
}
