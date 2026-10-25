package l;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: J62F */
/* renamed from: l.ܶܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15320 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f46971 = {R.attr.state_checked};

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f46972 = new int[0];

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Rect f46973 = new Rect();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Rect m36348(Drawable drawable) {
        int i;
        int i2;
        int i3;
        int i4;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets m21864 = C8266.m21864(drawable);
            i = m21864.left;
            i2 = m21864.top;
            i3 = m21864.right;
            i4 = m21864.bottom;
            return new Rect(i, i2, i3, i4);
        }
        return C1210.m4050(C8184.m21686(drawable));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36347(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        int[] iArr = f46971;
        int[] iArr2 = f46972;
        if (i != 21 || !"android.graphics.drawable.VectorDrawable".equals(name)) {
            if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
                return;
            }
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(iArr);
            } else {
                drawable.setState(iArr2);
            }
            drawable.setState(state);
            return;
        }
        int[] state2 = drawable.getState();
        if (state2 == null || state2.length == 0) {
            drawable.setState(iArr);
        } else {
            drawable.setState(iArr2);
        }
        drawable.setState(state2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m36346(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
