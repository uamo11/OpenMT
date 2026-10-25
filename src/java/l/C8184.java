package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: 65YF */
/* renamed from: l.۠۬, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8184 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Method f25182;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f25183;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Method f25184;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f25185;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21674(Drawable drawable, float f, float f2) {
        C5362.m15317(drawable, f, f2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21675(Drawable drawable, int i, int i2, int i3, int i4) {
        C5362.m15319(drawable, i, i2, i3, i4);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m21683(Drawable drawable, int i) {
        C5362.m15318(drawable, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21676(Drawable drawable, ColorStateList colorStateList) {
        C5362.m15320(drawable, colorStateList);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21679(Drawable drawable, PorterDuff.Mode mode) {
        C5362.m15323(drawable, mode);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21677(Drawable drawable, Resources.Theme theme) {
        C5362.m15321(drawable, theme);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21680(Drawable drawable) {
        return C5362.m15324(drawable);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static ColorFilter m21685(Drawable drawable) {
        return C5362.m15325(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m21682(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            m21682(((InsetDrawable) drawable).getDrawable());
            return;
        }
        if (drawable instanceof InterfaceC12417) {
            m21682(((InterfaceC12417) drawable).mo26058());
            return;
        }
        if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
            return;
        }
        int childCount = drawableContainerState.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Drawable child = drawableContainerState.getChild(i);
            if (child != null) {
                m21682(child);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21678(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C5362.m15322(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static Drawable m21684(Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof InterfaceC13122)) ? new C6067(drawable) : drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Drawable m21686(Drawable drawable) {
        return drawable instanceof InterfaceC12417 ? ((InterfaceC12417) drawable).mo26058() : drawable;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21681(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1128.m3844(drawable, i);
        }
        if (!f25185) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f25184 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f25185 = true;
        }
        Method method = f25184;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i));
                return true;
            } catch (Exception unused2) {
                f25184 = null;
            }
        }
        return false;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m21687(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1128.m3843(drawable);
        }
        if (!f25183) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                f25182 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f25183 = true;
        }
        Method method = f25182;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, null)).intValue();
        } catch (Exception unused2) {
            f25182 = null;
            return 0;
        }
    }
}
