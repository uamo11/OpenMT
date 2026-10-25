package com.alipay.sdk.tid;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.alipay.sdk.m.u.c;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.w.b;
import com.alipay.sdk.m.y.d;
import com.alipay.sdk.m.y.g;
import org.json.JSONObject;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class TidHelper {
    public static void a(Context context) {
        if (context == null) {
            return;
        }
        b.c().a(context);
    }

    public static Tid b(Context context) {
        try {
            com.alipay.sdk.m.t.b a = new c().a(a.f(), context);
            if (a != null) {
                JSONObject jSONObject = new JSONObject(a.a());
                com.alipay.sdk.m.x.a a2 = com.alipay.sdk.m.x.a.a(context);
                String optString = jSONObject.optString("tid");
                String string = jSONObject.getString(com.alipay.sdk.m.x.a.j);
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(string)) {
                    a2.a(optString, string);
                }
                return a(context, a2);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static void clearTID(Context context) {
        com.alipay.sdk.m.x.a.a(context).b();
    }

    public static String getIMEI(Context context) {
        a(context);
        return d.b(context).b();
    }

    public static String getIMSI(Context context) {
        a(context);
        return d.b(context).c();
    }

    public static String getVirtualImei(Context context) {
        a(context);
        com.alipay.sdk.m.o.c.a();
        return com.alipay.sdk.m.o.c.f();
    }

    public static String getVirtualImsi(Context context) {
        a(context);
        com.alipay.sdk.m.o.c.a();
        return com.alipay.sdk.m.o.c.g();
    }

    public static Tid loadLocalTid(Context context) {
        com.alipay.sdk.m.x.a a = com.alipay.sdk.m.x.a.a(context);
        if (a.j()) {
            return null;
        }
        return new Tid(a.f(), a.e(), a.g().longValue());
    }

    public static Tid loadTID(Context context) {
        a(context);
        Tid a = a(context, com.alipay.sdk.m.x.a.a(context));
        if (a == null) {
            g.b(com.alipay.sdk.m.n.a.B, "load_tid null");
        }
        return a;
    }

    public static boolean resetTID(Context context) {
        Tid tid;
        g.b(com.alipay.sdk.m.n.a.B, "reset_tid");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new Exception("Must be called on worker thread");
        }
        a(context);
        clearTID(context);
        try {
            tid = b(context);
        } catch (Throwable unused) {
            tid = null;
        }
        return !Tid.isEmpty(tid);
    }

    public static Tid a(Context context, com.alipay.sdk.m.x.a aVar) {
        if (aVar == null || aVar.k()) {
            return null;
        }
        return new Tid(aVar.f(), aVar.e(), aVar.g().longValue());
    }

    public static synchronized String getTIDValue(Context context) {
        String tid;
        synchronized (TidHelper.class) {
            Tid loadOrCreateTID = loadOrCreateTID(context);
            tid = Tid.isEmpty(loadOrCreateTID) ? "" : loadOrCreateTID.getTid();
        }
        return tid;
    }

    public static synchronized Tid loadOrCreateTID(Context context) {
        synchronized (TidHelper.class) {
            g.b(com.alipay.sdk.m.n.a.B, "load_create_tid");
            a(context);
            Tid loadTID = loadTID(context);
            if (Tid.isEmpty(loadTID)) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return null;
                }
                try {
                    loadTID = b(context);
                } catch (Throwable unused) {
                }
            }
            return loadTID;
        }
    }
}
