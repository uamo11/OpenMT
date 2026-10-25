package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: D5S8 */
@Deprecated
/* renamed from: l.᩵ۢ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19375 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f62717 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f62718;

    public C19375(HashMap hashMap) {
        this.f62718 = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC22901 enumC22901 = (EnumC22901) entry.getValue();
            List list = (List) this.f62717.get(enumC22901);
            if (list == null) {
                list = new ArrayList();
                this.f62717.put(enumC22901, list);
            }
            list.add((C0323) entry.getKey());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44637(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901, Object obj) {
        HashMap hashMap = this.f62717;
        m44636((List) hashMap.get(enumC22901), interfaceC23586, enumC22901, obj);
        m44636((List) hashMap.get(EnumC22901.ON_ANY), interfaceC23586, enumC22901, obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44636(List list, InterfaceC23586 interfaceC23586, EnumC22901 enumC22901, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0323 c0323 = (C0323) list.get(size);
                Method method = c0323.f1706;
                try {
                    int i = c0323.f1705;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, interfaceC23586);
                    } else if (i == 2) {
                        method.invoke(obj, interfaceC23586, enumC22901);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
