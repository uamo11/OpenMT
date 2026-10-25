package l;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* compiled from: Y55F */
/* renamed from: l.᩺᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC23312 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Class[] f74930 = {MenuItem.class};

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Method f74931;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Object f74932;

    public MenuItemOnMenuItemClickListenerC23312(Object obj, String str) {
        this.f74932 = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f74931 = cls.getMethod(str, f74930);
        } catch (Exception e) {
            StringBuilder m9834 = C3200.m9834("Couldn't resolve menu item onClick handler ", str, " in class ");
            m9834.append(cls.getName());
            InflateException inflateException = new InflateException(m9834.toString());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f74931;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f74932;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
