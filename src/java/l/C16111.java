package l;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* compiled from: L72M */
/* renamed from: l.ܺᩴ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16111 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m38016(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C16111.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
