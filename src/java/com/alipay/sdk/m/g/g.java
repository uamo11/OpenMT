package com.alipay.sdk.m.g;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.TreeMap;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class g implements i, j {
    public static Object a(Field field, Object obj) {
        if (field == null || obj == null || "this$0".equals(field.getName())) {
            return null;
        }
        boolean isAccessible = field.isAccessible();
        field.setAccessible(true);
        Object obj2 = field.get(obj);
        if (obj2 == null) {
            return null;
        }
        field.setAccessible(isAccessible);
        return f.b(obj2);
    }

    @Override // com.alipay.sdk.m.g.j
    public Object a(Object obj) {
        TreeMap treeMap = new TreeMap();
        Class<?> cls = obj.getClass();
        while (true) {
            Field[] declaredFields = cls.getDeclaredFields();
            if (cls.equals(Object.class)) {
                return treeMap;
            }
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    Object a = a(field, obj);
                    if (a != null) {
                        treeMap.put(field.getName(), a);
                    }
                }
            }
            cls = cls.getSuperclass();
        }
    }

    @Override // com.alipay.sdk.m.g.i
    public Object a(Object obj, Type type) {
        if (!obj.getClass().equals(org.json.alipay.b.class)) {
            return null;
        }
        org.json.alipay.b bVar = (org.json.alipay.b) obj;
        Class cls = (Class) type;
        Object newInstance = cls.newInstance();
        while (!cls.equals(Object.class)) {
            Field[] declaredFields = cls.getDeclaredFields();
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    String name = field.getName();
                    Type genericType = field.getGenericType();
                    if (bVar.b(name)) {
                        field.setAccessible(true);
                        field.set(newInstance, e.a(bVar.a(name), genericType));
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return newInstance;
    }

    @Override // com.alipay.sdk.m.g.i, com.alipay.sdk.m.g.j
    public boolean a(Class cls) {
        return true;
    }
}
