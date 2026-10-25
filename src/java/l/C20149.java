package l;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: H4NK */
/* renamed from: l.᩶ۨۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C20149 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f65249 = false;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Method f65250 = null;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean f65251 = true;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean f65252;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Field f65253;

    /* renamed from: ֫ */
    public void mo28565(View view, float f) {
        if (f65251) {
            try {
                C22265.m49987(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f65251 = false;
            }
        }
        view.setAlpha(f);
    }

    /* renamed from: ֫ */
    public float mo28564(View view) {
        if (f65251) {
            try {
                return C22265.m49986(view);
            } catch (NoSuchMethodError unused) {
                f65251 = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: ֫ */
    public void mo16873(View view, int i) {
        if (!f65252) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f65253 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f65252 = true;
        }
        Field field = f65253;
        if (field != null) {
            try {
                f65253.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: ֫ */
    public void mo28566(View view, int i, int i2, int i3, int i4) {
        if (!f65249) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f65250 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f65249 = true;
        }
        Method method = f65250;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
