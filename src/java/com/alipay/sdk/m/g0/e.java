package com.alipay.sdk.m.g0;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class e {
    public static void a(Context context, String str, String str2, String str3) {
        SharedPreferences.Editor edit;
        if (str3 == null || (edit = context.getSharedPreferences(str, 0).edit()) == null) {
            return;
        }
        edit.putString(str2, str3);
        edit.commit();
    }

    public static void a(Context context, String str, Map map) {
        SharedPreferences.Editor edit;
        if (map == null || (edit = context.getSharedPreferences(str, 0).edit()) == null) {
            return;
        }
        for (String str2 : map.keySet()) {
            edit.putString(str2, (String) map.get(str2));
        }
        edit.commit();
    }

    public static String b(Context context, String str, String str2, String str3) {
        return context.getSharedPreferences(str, 0).getString(str2, str3);
    }
}
