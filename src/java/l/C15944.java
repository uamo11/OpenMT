package l;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: H21F */
/* renamed from: l.ܺ۬, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C15944 extends C8890 {
    @Override // l.C8890
    /* renamed from: ֫ */
    public final Typeface mo22964(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f27051, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f27054.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.C8890
    /* renamed from: ֫ */
    public final Method mo22965(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
