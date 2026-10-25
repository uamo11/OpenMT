package com.alipay.sdk.m.u;

import android.content.Context;
import com.alipay.sdk.m.s.b;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class f extends com.alipay.sdk.m.t.e {
    @Override // com.alipay.sdk.m.t.e
    public String a(com.alipay.sdk.m.w.a aVar, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // com.alipay.sdk.m.t.e
    public Map a(boolean z, String str) {
        return new HashMap();
    }

    @Override // com.alipay.sdk.m.t.e
    public JSONObject a() {
        return null;
    }

    @Override // com.alipay.sdk.m.t.e
    public boolean c() {
        return false;
    }

    @Override // com.alipay.sdk.m.t.e
    public com.alipay.sdk.m.t.b a(com.alipay.sdk.m.w.a aVar, Context context, String str) {
        com.alipay.sdk.m.y.g.d(com.alipay.sdk.m.n.a.B, "mdap post");
        byte[] a = com.alipay.sdk.m.p.b.a(str.getBytes(Charset.forName(com.alipay.sdk.m.w.a.D)));
        HashMap hashMap = new HashMap();
        hashMap.put("utdId", com.alipay.sdk.m.w.b.c().d());
        hashMap.put("logHeader", "RAW");
        hashMap.put("bizCode", com.alipay.sdk.m.y.g.b);
        hashMap.put("productId", "alipaysdk_android");
        hashMap.put("Content-Encoding", "Gzip");
        hashMap.put("productVersion", "15.8.40");
        b.C0025b a2 = com.alipay.sdk.m.s.b.a(context, new b.a(com.alipay.sdk.m.n.a.f, hashMap, a));
        com.alipay.sdk.m.y.g.d(com.alipay.sdk.m.n.a.B, "mdap got " + a2);
        if (a2 == null) {
            throw new RuntimeException("Response is null");
        }
        boolean a3 = com.alipay.sdk.m.t.e.a(a2);
        try {
            byte[] bArr = a2.c;
            if (a3) {
                bArr = com.alipay.sdk.m.p.b.b(bArr);
            }
            return new com.alipay.sdk.m.t.b("", new String(bArr, Charset.forName(com.alipay.sdk.m.w.a.D)));
        } catch (Exception e) {
            com.alipay.sdk.m.y.g.a(e);
            return null;
        }
    }
}
