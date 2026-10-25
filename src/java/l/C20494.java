package l;

/* compiled from: E23G */
/* renamed from: l.᩶᩻֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C20494 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C3432 f66066 = new C3432();

    /* renamed from: ֫ */
    public ComponentCallbacksC9205 mo41848(String str) {
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46959(ClassLoader classLoader, String str) {
        try {
            return ComponentCallbacksC9205.class.isAssignableFrom(m46960(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Class m46961(ClassLoader classLoader, String str) {
        try {
            return m46960(classLoader, str);
        } catch (ClassCastException e) {
            throw new C24021(C4860.m14172("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C24021(C4860.m14172("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Class m46960(ClassLoader classLoader, String str) {
        C3432 c3432 = f66066;
        C3432 c34322 = (C3432) c3432.getOrDefault(classLoader, null);
        if (c34322 == null) {
            c34322 = new C3432();
            c3432.put(classLoader, c34322);
        }
        Class cls = (Class) c34322.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c34322.put(str, cls2);
        return cls2;
    }
}
