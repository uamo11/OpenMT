package l;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: D5S8 */
@Deprecated
/* renamed from: l.ۚۢ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5263 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C5263 f16468 = new C5263();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f16469 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f16470 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m15178(Class cls) {
        HashMap hashMap = this.f16470;
        Boolean bool = (Boolean) hashMap.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (((InterfaceC8064) method.getAnnotation(InterfaceC8064.class)) != null) {
                    m15175(cls, declaredMethods);
                    return true;
                }
            }
            hashMap.put(cls, Boolean.FALSE);
            return false;
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19375 m15177(Class cls) {
        C19375 c19375 = (C19375) this.f16469.get(cls);
        return c19375 != null ? c19375 : m15175(cls, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15176(HashMap hashMap, C0323 c0323, EnumC22901 enumC22901, Class cls) {
        EnumC22901 enumC229012 = (EnumC22901) hashMap.get(c0323);
        if (enumC229012 == null || enumC22901 == enumC229012) {
            if (enumC229012 == null) {
                hashMap.put(c0323, enumC22901);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0323.f1706.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC229012 + ", new value " + enumC22901);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C19375 m15175(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(m15177(superclass).f62718);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : m15177(cls2).f62718.entrySet()) {
                m15176(hashMap, (C0323) entry.getKey(), (EnumC22901) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC8064 interfaceC8064 = (InterfaceC8064) method.getAnnotation(InterfaceC8064.class);
            if (interfaceC8064 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC23586.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC22901 value = interfaceC8064.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC22901.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC22901.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m15176(hashMap, new C0323(method, i), value, cls);
                z = true;
            }
        }
        C19375 c19375 = new C19375(hashMap);
        this.f16469.put(cls, c19375);
        this.f16470.put(cls, Boolean.valueOf(z));
        return c19375;
    }
}
