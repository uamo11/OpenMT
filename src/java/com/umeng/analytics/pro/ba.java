package com.umeng.analytics.pro;

import java.lang.reflect.InvocationTargetException;

/* compiled from: X45I */
/* loaded from: classes.dex */
public class ba {
    public static az a(Class cls, int i) {
        try {
            return (az) cls.getMethod("findByValue", Integer.TYPE).invoke(null, Integer.valueOf(i));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
