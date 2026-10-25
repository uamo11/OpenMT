package com.umeng.commonsdk.vchannel;

import android.content.Context;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.Map;
import l.C16014;
import l.C7166;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: 4BMI */
/* loaded from: classes.dex */
public class b {
    public String b;
    public String a = "_$unknown";
    public long c = 0;
    public long d = 0;
    public String e = a.j;
    public Map f = null;

    public String a() {
        return this.a;
    }

    public void a(String str) {
        this.a = str;
    }

    public long b() {
        return this.c;
    }

    public void a(long j) {
        this.c = j;
    }

    public Map c() {
        return this.f;
    }

    public void a(Map map) {
        this.f = map;
    }

    public b(Context context) {
        this.b = UMGlobalContext.getInstance(context).getProcessName(context);
    }

    public String toString() {
        String sb;
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append("id:" + this.a + ",");
        sb2.append("pn:" + this.b + ",");
        sb2.append("ts:" + this.c + ",");
        Map map = this.f;
        if (map != null && map.size() > 0) {
            for (String str : this.f.keySet()) {
                Object obj = this.f.get(str);
                if (obj == null) {
                    sb = C16014.m37867(str, ": null,");
                } else {
                    StringBuilder m19190 = C7166.m19190(str, ": ");
                    m19190.append(obj.toString());
                    m19190.append(",");
                    sb = m19190.toString();
                }
                sb2.append(sb);
            }
        }
        sb2.append("ds:" + this.d + "]");
        return sb2.toString();
    }

    public JSONObject d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.a);
            jSONObject.put("pn", this.b);
            jSONObject.put("ds", this.d);
            jSONObject.put("ts", this.c);
            Map map = this.f;
            if (map != null && map.size() > 0) {
                for (String str : this.f.keySet()) {
                    jSONObject.put(str, this.f.get(str));
                }
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(this.e, jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("ekv", jSONArray2);
            return jSONObject3;
        } catch (Throwable unused) {
            return null;
        }
    }
}
