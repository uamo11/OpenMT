package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.m.m.b;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.o;
import com.umeng.analytics.pro.d;
import java.util.Iterator;
import l.ConcurrentMapC10942;
import org.json.JSONObject;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class AlipayResultActivity extends Activity {
    public static final ConcurrentMapC10942 a = new ConcurrentMapC10942();

    /* compiled from: N673 */
    public interface a {
        void a(int i, String str, String str2);
    }

    public final void a(String str, Bundle bundle) {
        a aVar = (a) a.remove(str);
        if (aVar == null) {
            return;
        }
        try {
            aVar.a(bundle.getInt("endCode"), bundle.getString(o.b), bundle.getString(o.c));
        } finally {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Throwable th;
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            try {
                String stringExtra = intent.getStringExtra(d.aw);
                Bundle bundleExtra = intent.getBundleExtra(o.c);
                String stringExtra2 = intent.getStringExtra("scene");
                com.alipay.sdk.m.w.a a2 = a.C0028a.a(stringExtra);
                if (a2 == null) {
                    finish();
                    return;
                }
                com.alipay.sdk.m.m.a.a(a2, b.f77909l, "BSPSession", stringExtra + "|" + SystemClock.elapsedRealtime());
                if (TextUtils.equals("mqpSchemePay", stringExtra2)) {
                    a(stringExtra, bundleExtra);
                    return;
                }
                if ((TextUtils.isEmpty(stringExtra) || bundleExtra == null) && intent.getData() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(Base64.decode(intent.getData().getQuery(), 2), com.alipay.sdk.m.w.a.D));
                        JSONObject jSONObject2 = jSONObject.getJSONObject(o.c);
                        stringExtra = jSONObject.getString(d.aw);
                        com.alipay.sdk.m.m.a.a(a2, b.f77909l, "BSPUriSession", stringExtra);
                        Bundle bundle2 = new Bundle();
                        try {
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                bundle2.putString(next, jSONObject2.getString(next));
                            }
                            bundleExtra = bundle2;
                        } catch (Throwable th2) {
                            th = th2;
                            bundleExtra = bundle2;
                            com.alipay.sdk.m.m.a.a(a2, b.f77909l, "BSPResEx", th);
                            com.alipay.sdk.m.m.a.a(a2, b.f77909l, b.s0, th);
                            if (TextUtils.isEmpty(stringExtra)) {
                            }
                            com.alipay.sdk.m.m.a.b(this, a2, "", a2.d);
                            finish();
                            return;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                if (!TextUtils.isEmpty(stringExtra) || bundleExtra == null) {
                    com.alipay.sdk.m.m.a.b(this, a2, "", a2.d);
                    finish();
                    return;
                }
                try {
                    com.alipay.sdk.m.m.a.a(a2, b.f77909l, b.V, "" + SystemClock.elapsedRealtime());
                    com.alipay.sdk.m.m.a.a(a2, b.f77909l, b.W, bundleExtra.getInt("endCode", -1) + "|" + bundleExtra.getString(o.b, "-"));
                    OpenAuthTask.a(stringExtra, OpenAuthTask.OK, "OK", bundleExtra);
                    com.alipay.sdk.m.m.a.b(this, a2, "", a2.d);
                    finish();
                } catch (Throwable th4) {
                    com.alipay.sdk.m.m.a.b(this, a2, "", a2.d);
                    finish();
                    throw th4;
                }
            } catch (Throwable th5) {
                com.alipay.sdk.m.m.a.a((com.alipay.sdk.m.w.a) null, b.f77909l, "BSPSerError", th5);
                com.alipay.sdk.m.m.a.a((com.alipay.sdk.m.w.a) null, b.f77909l, b.r0, th5);
                finish();
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
