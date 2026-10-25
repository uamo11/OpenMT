package l;

import bin.mt.json.JSONObject;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.d;

/* compiled from: 47OP */
/* renamed from: l.ܶܳܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15293 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11146 f46925;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11146 f46926;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f46927;

    public C15293() {
        this("", new C4816(""), null);
    }

    public C15293(String str, C11146 c11146, C11146 c111462) {
        this.f46927 = str;
        c11146 = c11146.m27662() == 31 ? new C4816(d.O) : c11146;
        this.f46926 = c11146;
        this.f46925 = c111462;
        c11146.f33466 = this;
        if (c111462 != null) {
            c111462.f33466 = this;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11146 m36304() {
        return this.f46926;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11146 m36303() {
        return this.f46925;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36302() {
        C11146 c11146;
        return this.f46926.m27659(false) && ((c11146 = this.f46925) == null || c11146.m27659(true));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m36306() {
        return this.f46927;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final JSONObject m36305() {
        JSONObject jSONObject = new JSONObject();
        C11146 c11146 = this.f46926;
        jSONObject.put(am.av, c11146.m27662());
        jSONObject.put("b", this.f46927);
        int m27662 = c11146.m27662();
        if (m27662 == 0) {
            jSONObject.put(am.aF, c11146.mo14039());
        } else if (m27662 == 27) {
            jSONObject.put("f", c11146.mo27664());
        } else if (m27662 == 34) {
            jSONObject.put(am.aG, c11146.mo27664());
        }
        C11146 c111462 = this.f46925;
        if (c111462 != null) {
            jSONObject.put("d", c111462.m27662());
            int m276622 = c111462.m27662();
            if (m276622 == 0) {
                jSONObject.put("e", c111462.mo14039());
            } else {
                if (m276622 == 27) {
                    jSONObject.put("g", c111462.mo27664());
                    return jSONObject;
                }
                if (m276622 == 34) {
                    jSONObject.put(am.aC, c111462.mo27664());
                    return jSONObject;
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15293 m36301(JSONObject jSONObject) {
        C11146 c4816;
        int i = jSONObject.getInt(am.av);
        String string = jSONObject.getString("b");
        C11146 c11146 = null;
        if (i == 0) {
            c4816 = new C4816(jSONObject.getString(am.aF));
        } else if (i == 27) {
            c4816 = new C22455(jSONObject.getJSONObject("f"));
        } else if (i == 34) {
            c4816 = new C11872(jSONObject.getJSONObject(am.aG), null);
        } else {
            c4816 = new C11146(i);
        }
        if (jSONObject.contains("d")) {
            int i2 = jSONObject.getInt("d");
            if (i2 == 0) {
                c11146 = new C4816(jSONObject.getString("e"));
            } else if (i2 == 27) {
                c11146 = new C22455(jSONObject.getJSONObject("g"));
            } else if (i2 == 34) {
                c11146 = new C11872(jSONObject.getJSONObject(am.aC), null);
            } else {
                c11146 = new C11146(i2);
            }
        }
        return new C15293(string, c4816, c11146);
    }
}
