package com.alipay.sdk.m.m;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.m.y.g;
import com.alipay.sdk.m.y.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class a {

    /* compiled from: N673 */
    /* renamed from: com.alipay.sdk.m.m.a$a, reason: collision with other inner class name */
    public class RunnableC0014a implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ com.alipay.sdk.m.w.a b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public RunnableC0014a(Context context, com.alipay.sdk.m.w.a aVar, String str, String str2) {
            this.a = context;
            this.b = aVar;
            this.c = str;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b.a(this.a, this.b.n.d(this.c), this.d);
            } catch (Throwable th) {
                g.a(th);
            }
        }
    }

    /* compiled from: N673 */
    public final class b {
        public static final String a = "RecordPref";
        public static final String b = "alipay_cashier_statistic_record";

        public static synchronized String a(Context context, String str, String str2) {
            synchronized (b.class) {
                g.b(a, "stat append " + str2 + " , " + str);
                if (context != null && !TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(str2)) {
                        str2 = UUID.randomUUID().toString();
                    }
                    C0015a a2 = a(context);
                    if (a2.a.size() > 20) {
                        a2.a.clear();
                    }
                    a2.a.put(str2, str);
                    a(context, a2);
                    return str2;
                }
                return null;
            }
        }

        /* compiled from: N673 */
        /* renamed from: com.alipay.sdk.m.m.a$b$a, reason: collision with other inner class name */
        public final class C0015a {
            public final LinkedHashMap a = new LinkedHashMap();

            public C0015a() {
            }

            public String a() {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry entry : this.a.entrySet()) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(entry.getKey()).put(entry.getValue());
                        jSONArray.put(jSONArray2);
                    }
                    return jSONArray.toString();
                } catch (Throwable th) {
                    g.a(th);
                    return new JSONArray().toString();
                }
            }

            public C0015a(String str) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                        this.a.put(jSONArray2.getString(0), jSONArray2.getString(1));
                    }
                } catch (Throwable th) {
                    g.a(th);
                }
            }
        }

        public static synchronized String b(Context context) {
            synchronized (b.class) {
                g.b(a, "stat peek");
                if (context == null) {
                    return null;
                }
                C0015a a2 = a(context);
                if (a2.a.isEmpty()) {
                    return null;
                }
                try {
                    return (String) ((Map.Entry) a2.a.entrySet().iterator().next()).getValue();
                } catch (Throwable th) {
                    g.a(th);
                    return null;
                }
            }
        }

        public static synchronized int a(Context context, String str) {
            synchronized (b.class) {
                g.b(a, "stat remove " + str);
                if (context != null && !TextUtils.isEmpty(str)) {
                    C0015a a2 = a(context);
                    if (a2.a.isEmpty()) {
                        return 0;
                    }
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : a2.a.entrySet()) {
                            if (str.equals(entry.getValue())) {
                                arrayList.add((String) entry.getKey());
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            a2.a.remove((String) it.next());
                        }
                        a(context, a2);
                        return arrayList.size();
                    } catch (Throwable th) {
                        g.a(th);
                        int size = a2.a.size();
                        a(context, new C0015a());
                        return size;
                    }
                }
                return 0;
            }
        }

        public static synchronized C0015a a(Context context) {
            synchronized (b.class) {
                try {
                    String a2 = m.a(null, context, b, null);
                    if (TextUtils.isEmpty(a2)) {
                        return new C0015a();
                    }
                    return new C0015a(a2);
                } catch (Throwable th) {
                    g.a(th);
                    return new C0015a();
                }
            }
        }

        public static synchronized void a(Context context, C0015a c0015a) {
            synchronized (b.class) {
                if (c0015a == null) {
                    try {
                        c0015a = new C0015a();
                    } finally {
                    }
                }
                m.b(null, context, b, c0015a.a());
            }
        }
    }

    /* compiled from: N673 */
    public final class c {

        /* compiled from: N673 */
        /* renamed from: com.alipay.sdk.m.m.a$c$a, reason: collision with other inner class name */
        public class RunnableC0016a implements Runnable {
            public final /* synthetic */ String a;
            public final /* synthetic */ Context b;

            public RunnableC0016a(String str, Context context) {
                this.a = str;
                this.b = context;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(this.a) || c.b(this.b, this.a)) {
                    for (int i = 0; i < 4; i++) {
                        String b = b.b(this.b);
                        if (TextUtils.isEmpty(b) || !c.b(this.b, b)) {
                            return;
                        }
                    }
                }
            }
        }

        public static synchronized void a(Context context, com.alipay.sdk.m.m.b bVar, String str, String str2) {
            synchronized (c.class) {
                if (context == null || bVar == null || str == null) {
                    return;
                }
                a(context, bVar.d(str), str2);
            }
        }

        public static synchronized void a(Context context) {
            synchronized (c.class) {
                a(context, null, null);
            }
        }

        public static synchronized void a(Context context, String str, String str2) {
            synchronized (c.class) {
                if (context == null) {
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    b.a(context, str, str2);
                }
                new Thread(new RunnableC0016a(str, context)).start();
            }
        }

        public static synchronized boolean b(Context context, String str) {
            synchronized (c.class) {
                g.b(com.alipay.sdk.m.n.a.B, "stat sub " + str);
                try {
                    if ((com.alipay.sdk.m.o.b.i().g() ? new com.alipay.sdk.m.u.e() : new com.alipay.sdk.m.u.f()).a((com.alipay.sdk.m.w.a) null, context, str) == null) {
                        return false;
                    }
                    b.a(context, str);
                    return true;
                } catch (Throwable th) {
                    g.a(th);
                    return false;
                }
            }
        }
    }

    /* compiled from: N673 */
    public final class d {
        public static final String a = "alipay_cashier_ap_seq_v";

        public static synchronized long a(Context context) {
            long a2;
            synchronized (d.class) {
                a2 = e.a(context, a);
            }
            return a2;
        }
    }

    /* compiled from: N673 */
    public final class e {
        /* JADX WARN: Can't wrap try/catch for region: R(9:3|4|5|(5:7|8|9|10|11)|17|8|9|10|11) */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static synchronized long a(android.content.Context r6, java.lang.String r7) {
            /*
                java.lang.Class<com.alipay.sdk.m.m.a$e> r0 = com.alipay.sdk.m.m.a.e.class
                monitor-enter(r0)
                r1 = 0
                java.lang.String r2 = com.alipay.sdk.m.y.m.a(r1, r6, r7, r1)     // Catch: java.lang.Throwable -> L13
                boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L13
                if (r3 != 0) goto L13
                long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r2 = 0
            L15:
                r4 = 1
                long r2 = r2 + r4
                java.lang.String r4 = java.lang.Long.toString(r2)     // Catch: java.lang.Throwable -> L1f
                com.alipay.sdk.m.y.m.b(r1, r6, r7, r4)     // Catch: java.lang.Throwable -> L1f
            L1f:
                monitor-exit(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.m.a.e.a(android.content.Context, java.lang.String):long");
        }
    }

    /* compiled from: N673 */
    public final class f {
        public static final String a = "alipay_cashier_statistic_v";

        public static synchronized long a(Context context) {
            long a2;
            synchronized (f.class) {
                a2 = e.a(context, a);
            }
            return a2;
        }
    }

    public static synchronized void a(Context context, com.alipay.sdk.m.w.a aVar, String str, String str2) {
        synchronized (a.class) {
            if (context == null || aVar == null) {
                return;
            }
            g.b(com.alipay.sdk.m.n.a.B, "StatisticManager stash start");
            if (com.alipay.sdk.m.o.b.i().g(null)) {
                com.alipay.sdk.m.q.a.a(new RunnableC0014a(context, aVar, str, str2));
            } else {
                try {
                    b.a(context, aVar.n.d(str), str2);
                } catch (Throwable th) {
                    g.a(th);
                }
            }
            g.b(com.alipay.sdk.m.n.a.B, "StatisticManager stash finish");
        }
    }

    public static synchronized void b(Context context, com.alipay.sdk.m.w.a aVar, String str, String str2) {
        synchronized (a.class) {
            if (context == null || aVar == null) {
                return;
            }
            c.a(context, aVar.n, str, str2);
        }
    }

    public static void b(com.alipay.sdk.m.w.a aVar, String str, String str2, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.n.c(str, str2, str3);
    }

    public static synchronized void a(Context context) {
        synchronized (a.class) {
            c.a(context);
        }
    }

    public static void a(com.alipay.sdk.m.w.a aVar, String str, Throwable th) {
        if (aVar == null || th == null) {
            return;
        }
        aVar.n.a(str, th.getClass().getSimpleName(), th);
    }

    public static void a(com.alipay.sdk.m.w.a aVar, String str, String str2, Throwable th, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.n.a(str, str2, th, str3);
    }

    public static void a(com.alipay.sdk.m.w.a aVar, String str, String str2, Throwable th) {
        if (aVar == null) {
            return;
        }
        aVar.n.a(str, str2, th);
    }

    public static void a(com.alipay.sdk.m.w.a aVar, String str, String str2, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.n.a(str, str2, str3);
    }

    public static void a(com.alipay.sdk.m.w.a aVar, String str, String str2) {
        if (aVar == null) {
            return;
        }
        aVar.n.a(str, str2);
    }
}
