package l;

import java.lang.reflect.Method;

/* compiled from: RANP */
/* renamed from: l.֨᩸᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1396 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5630 f5033;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C5630 f5034 = new C5630(null, null, null);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m4888(AbstractC2808 abstractC2808) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        C5630 c5630 = f5033;
        C5630 c56302 = f5034;
        if (c5630 == null) {
            try {
                C5630 c56303 = new C5630(Class.class.getDeclaredMethod("getModule", null), abstractC2808.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), abstractC2808.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f5033 = c56303;
                c5630 = c56303;
            } catch (Exception unused) {
                f5033 = c56302;
                c5630 = c56302;
            }
        }
        if (c5630 == c56302 || (method = c5630.f17401) == null || (invoke = method.invoke(abstractC2808.getClass(), null)) == null || (method2 = c5630.f17400) == null || (invoke2 = method2.invoke(invoke, null)) == null) {
            return null;
        }
        Method method3 = c5630.f17402;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
