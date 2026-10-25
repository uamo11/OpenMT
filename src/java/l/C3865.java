package l;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import bin.mt.plus.R;

/* compiled from: 28VJ */
/* renamed from: l.ۘۢᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3865 extends LayerDrawable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f12362;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Drawable[] f12363;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3865 m11678(Resources resources, Resources.Theme theme) {
        Drawable m13097 = C4369.m13097(resources, R.drawable.MT_Protector_res_0x7f080237, theme);
        C11003.requireNonNull(m13097);
        Drawable mutate = m13097.mutate();
        Drawable m130972 = C4369.m13097(resources, R.drawable.MT_Protector_res_0x7f08021b, theme);
        C11003.requireNonNull(m130972);
        Drawable mutate2 = m130972.mutate();
        Drawable m130973 = C4369.m13097(resources, R.drawable.MT_Protector_res_0x7f080216, theme);
        C11003.requireNonNull(m130973);
        Drawable mutate3 = m130973.mutate();
        Drawable m130974 = C4369.m13097(resources, R.drawable.MT_Protector_res_0x7f080215, theme);
        C11003.requireNonNull(m130974);
        Drawable[] drawableArr = {mutate, mutate2, mutate3, m130974.mutate()};
        C3865 c3865 = new C3865(drawableArr);
        c3865.f12362 = 0;
        c3865.f12363 = drawableArr;
        c3865.setColorFilter(new PorterDuffColorFilter(C21943.f70287, PorterDuff.Mode.SRC_IN));
        for (int i = 0; i < 4; i++) {
            drawableArr[i].setAlpha(0);
        }
        return c3865;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11679(int i) {
        Drawable[] drawableArr = this.f12363;
        if (this.f12362 != i) {
            this.f12362 = i;
            if (i == -1) {
                for (Drawable drawable : drawableArr) {
                    drawable.setAlpha(0);
                }
            } else {
                int length = drawableArr.length;
                int i2 = 0;
                while (i2 < length) {
                    drawableArr[i2].setAlpha(i2 == i ? 255 : 0);
                    i2++;
                }
            }
            invalidateSelf();
        }
    }
}
