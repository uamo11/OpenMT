package l;

import java.lang.reflect.Field;

/* compiled from: M4HM */
/* renamed from: l.֫᩶ۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2048 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15452 m6722(AbstractC15452 abstractC15452) {
        while (abstractC15452 != null && !(abstractC15452 instanceof C21804)) {
            abstractC15452 = abstractC15452.f47311;
        }
        return abstractC15452;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m6725(AbstractC15452 abstractC15452) {
        ((C21804) abstractC15452).m49150();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6724(C21804 c21804) {
        try {
            Field declaredField = C21804.class.getDeclaredField("᩵֫");
            declaredField.setAccessible(true);
            C6987 c6987 = ((C6281) declaredField.get(c21804)).f19440;
            Field declaredField2 = C6987.class.getDeclaredField("ۢ");
            declaredField2.setAccessible(true);
            C21804 c218042 = (C21804) declaredField2.get(c6987);
            Field declaredField3 = C6987.class.getDeclaredField("᩵");
            declaredField3.setAccessible(true);
            C21804 c218043 = (C21804) declaredField3.get(c6987);
            if (c218042 == c21804) {
                declaredField2.set(c6987, null);
                if (c218043 == c21804) {
                    declaredField3.set(c6987, null);
                    return;
                }
                return;
            }
            while (c218042 != null) {
                AbstractC15452 abstractC15452 = c218042.f47311;
                if (abstractC15452 == c21804) {
                    c218042.f47311 = c21804.f47311;
                    if (c218043 == c21804) {
                        declaredField3.set(c6987, c218042);
                        return;
                    }
                    return;
                }
                c218042 = (C21804) abstractC15452;
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6723(AbstractC15452 abstractC15452, C11472 c11472) {
        C21804 c21804 = (C21804) abstractC15452;
        try {
            Field declaredField = C21804.class.getDeclaredField("᩵֫");
            declaredField.setAccessible(true);
            c11472.m28286(((C6281) declaredField.get(c21804)).f19440);
            m6724(c21804);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }
}
