package com.alipay.sdk.m.r0;

import android.content.Context;
import android.content.SharedPreferences;
import com.alipay.sdk.m.q0.f;
import com.umeng.analytics.pro.am;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class a {
    public String a;
    public SharedPreferences b;
    public SharedPreferences.Editor c = null;
    public Context d;
    public boolean e;

    public a(Context context, String str, String str2, boolean z, boolean z2) {
        this.b = null;
        this.e = z2;
        this.a = str2;
        this.d = context;
        if (context != null) {
            this.b = context.getSharedPreferences(str2, 0);
        }
    }

    public final void a() {
        SharedPreferences sharedPreferences;
        if (this.c != null || (sharedPreferences = this.b) == null) {
            return;
        }
        this.c = sharedPreferences.edit();
    }

    public void b(String str) {
        if (f.b(str) || str.equals(am.aI)) {
            return;
        }
        a();
        SharedPreferences.Editor editor = this.c;
        if (editor != null) {
            editor.remove(str);
        }
    }

    public void a(String str, String str2) {
        if (f.b(str) || str.equals(am.aI)) {
            return;
        }
        a();
        SharedPreferences.Editor editor = this.c;
        if (editor != null) {
            editor.putString(str, str2);
        }
    }

    public boolean b() {
        boolean z;
        Context context;
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editor = this.c;
        if (editor != null) {
            if (!this.e && this.b != null) {
                editor.putLong(am.aI, currentTimeMillis);
            }
            if (!this.c.commit()) {
                z = false;
                if (this.b != null && (context = this.d) != null) {
                    this.b = context.getSharedPreferences(this.a, 0);
                }
                return z;
            }
        }
        z = true;
        if (this.b != null) {
            this.b = context.getSharedPreferences(this.a, 0);
        }
        return z;
    }

    public String a(String str) {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!f.b(string)) {
                return string;
            }
        }
        return "";
    }
}
