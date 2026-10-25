package l;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* compiled from: J5NH */
/* renamed from: l.ۗܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3327 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Field f10411;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f10411 = field;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m10178(AbsListView absListView) {
        Field field = f10411;
        if (field == null) {
            return false;
        }
        try {
            return field.getBoolean(absListView);
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10177(AbsListView absListView, boolean z) {
        Field field = f10411;
        if (field != null) {
            try {
                field.set(absListView, Boolean.valueOf(z));
            } catch (IllegalAccessException unused) {
            }
        }
    }
}
