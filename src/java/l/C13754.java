package l;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: IB2G */
/* renamed from: l.ܰۤۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13754 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList f41045;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InputMethodManager f41046;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputMethodManager m33058() {
        if (f41046 == null) {
            InputMethodManager inputMethodManager = (InputMethodManager) C4925.m14335().getSystemService("input_method");
            f41046 = inputMethodManager;
            if (inputMethodManager != null) {
                ArrayList arrayList = new ArrayList(3);
                String[] strArr = {"mCurRootView", "mServedView", "mNextServedView"};
                Class<?> cls = f41046.getClass();
                for (int i = 0; i < 3; i++) {
                    try {
                        arrayList.add(cls.getDeclaredField(strArr[i]));
                    } catch (Exception unused) {
                    }
                }
                f41045 = arrayList;
            }
        }
        return f41046;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33059(AbstractActivityC3346 abstractActivityC3346) {
        Activity m15313;
        InputMethodManager m33058;
        if (Build.VERSION.SDK_INT >= 30 || (m15313 = C5350.m15313(abstractActivityC3346)) == null || (m33058 = m33058()) == null) {
            return;
        }
        Iterator it = f41045.iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            try {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                Object obj = field.get(m33058);
                if ((obj instanceof View) && C5350.m15313(((View) obj).getContext()) == m15313) {
                    field.set(m33058, null);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33060(C12392 c12392) {
        InputMethodManager m33058 = m33058();
        if (m33058 == null) {
            return;
        }
        Iterator it = f41045.iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            try {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                Object obj = field.get(m33058);
                if ((obj instanceof View) && ((View) obj) == c12392) {
                    field.set(m33058, null);
                }
            } catch (Exception unused) {
            }
        }
    }
}
