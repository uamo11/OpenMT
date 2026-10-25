package com.alipay.sdk.m.g;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class e {
    public static List a;

    static {
        ArrayList arrayList = new ArrayList();
        a = arrayList;
        arrayList.add(new l());
        a.add(new d());
        a.add(new c());
        a.add(new h());
        a.add(new k());
        a.add(new b());
        a.add(new a());
        a.add(new g());
    }

    public static final Object a(Object obj, Type type) {
        Object a2;
        for (i iVar : a) {
            if (iVar.a(com.alipay.sdk.m.h.a.a(type)) && (a2 = iVar.a(obj, type)) != null) {
                return a2;
            }
        }
        return null;
    }

    public static final Object a(String str, Type type) {
        Object bVar;
        if (str == null || str.length() == 0) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("[") && trim.endsWith("]")) {
            bVar = new org.json.alipay.a(trim);
        } else {
            if (!trim.startsWith("{") || !trim.endsWith(com.alipay.sdk.m.y.l.d)) {
                return a((Object) trim, type);
            }
            bVar = new org.json.alipay.b(trim);
        }
        return a(bVar, type);
    }
}
