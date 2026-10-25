package l;

import java.lang.reflect.Method;
import java.util.List;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: 51RR */
/* renamed from: l.۫ܶۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C12483 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30638(String str, List list, C13188 c13188) {
        Method method;
        String str2;
        Object invoke;
        Class<?> returnType;
        Method[] declaredMethods = getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = declaredMethods[i];
            if (method.getName().equals(str) && method.getParameterTypes().length == list.size()) {
                break;
            } else {
                i++;
            }
        }
        if (method == null) {
            c13188.mo23576();
            return;
        }
        try {
            int size = list.size();
            if (size != 0) {
                invoke = size != 1 ? size != 2 ? size != 3 ? size != 4 ? size != 5 ? method.invoke(this, list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5)) : method.invoke(this, list.get(0), list.get(1), list.get(2), list.get(3), list.get(4)) : method.invoke(this, list.get(0), list.get(1), list.get(2), list.get(3)) : method.invoke(this, list.get(0), list.get(1), list.get(2)) : method.invoke(this, list.get(0), list.get(1)) : method.invoke(this, list.get(0));
                str2 = null;
            } else {
                str2 = null;
                invoke = method.invoke(this, null);
            }
            returnType = method.getReturnType();
            C9145.m23513("openSDK_LOG.JsBridge", "-->call, result: " + invoke + " | ReturnType: " + returnType.getName());
        } catch (Exception e) {
            e = e;
        }
        try {
            if (!ClassTransform.VOID.equals(returnType.getName()) && returnType != Void.class) {
                if (this instanceof C7049) {
                    if (invoke != null) {
                        str2 = invoke.toString();
                    }
                    c13188.mo23575(str2);
                    return;
                }
                return;
            }
            c13188.mo23574();
        } catch (Exception e2) {
            e = e2;
            C9145.m23514("openSDK_LOG.JsBridge", "-->handler call mehtod ex. targetMethod: " + method, e);
            c13188.mo23576();
        }
    }
}
