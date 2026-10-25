package com.alipay.sdk.m.l;

import com.alipay.sdk.m.y.l;
import l.C9045;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class b {
    public static volatile boolean a;
    public static volatile String b;

    public static void a(String str) {
        b = str;
    }

    public static String b() {
        c a2 = c.a(c.DOUBLE_REQUEST.c());
        return a(a2.c(), a2.b(), "");
    }

    public static boolean c() {
        return a;
    }

    public static String d() {
        return b;
    }

    public static String e() {
        c a2 = c.a(c.PARAMS_ERROR.c());
        return a(a2.c(), a2.b(), "");
    }

    public static void a(boolean z) {
        a = z;
    }

    public static String a() {
        c a2 = c.a(c.CANCELED.c());
        return a(a2.c(), a2.b(), "");
    }

    public static String a(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder("resultStatus={");
        sb.append(i);
        sb.append("};memo={");
        sb.append(str);
        sb.append("};result={");
        return C9045.m23341(sb, str2, l.d);
    }
}
