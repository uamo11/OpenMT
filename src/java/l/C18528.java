package l;

import bin.mt.json.JSONObject;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: P6YZ */
/* renamed from: l.ᩴۙۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18528 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f57403 = new LinkedHashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C14293 f57404;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f57405;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12344 f57406;

    public C18528(InterfaceC12344 interfaceC12344) {
        this.f57404 = C14293.f43078;
        this.f57406 = interfaceC12344;
        String string = interfaceC12344.getString("smdh", null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                this.f57404 = C14293.m34076(jSONObject.getString("headers", ""), jSONObject.getBoolean("crossOrigin", false));
            } catch (RuntimeException unused) {
                this.f57405 = true;
            }
        }
        String string2 = interfaceC12344.getString("smhc", null);
        if (string2 == null) {
            return;
        }
        try {
            Iterator it = new JSONObject(string2).iterator();
            while (it.hasNext()) {
                JSONObject.Member member = (JSONObject.Member) it.next();
                try {
                    JSONObject asObject = member.getValue().asObject();
                    C14293 m34076 = C14293.m34076(asObject.getString("headers", ""), asObject.getBoolean("crossOrigin", false));
                    this.f57405 = (this.f57403.put(member.getName(), m34076) != null) | this.f57405;
                } catch (RuntimeException unused2) {
                    this.f57405 = true;
                }
            }
        } catch (RuntimeException unused3) {
            this.f57405 = true;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14293 m43049(String str) {
        C14293 c14293 = (C14293) this.f57403.get(str);
        return c14293 == null ? this.f57404 : c14293;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m43048(String str) {
        return this.f57403.containsKey(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43047(String str, C14293 c14293, boolean z) {
        LinkedHashMap linkedHashMap = this.f57403;
        if (z) {
            linkedHashMap.put(str, c14293);
        } else {
            linkedHashMap.remove(str);
            this.f57404 = c14293;
        }
        m43045();
        m43044();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43046() {
        if (m43045() || this.f57405) {
            m43044();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m43045() {
        return this.f57403.keySet().retainAll(new HashSet(Arrays.asList(this.f57406.mo18255("smur", new String[0]))));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m43044() {
        this.f57405 = false;
        InterfaceC13049 edit = this.f57406.edit();
        LinkedHashMap linkedHashMap = this.f57403;
        if (linkedHashMap.isEmpty()) {
            edit.remove("smhc");
        } else {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                C14293 c14293 = (C14293) entry.getValue();
                jSONObject.put(str, new JSONObject().put("headers", c14293.m34078()).put("crossOrigin", c14293.m34077()));
            }
            edit.putString("smhc", jSONObject.toString());
        }
        if (this.f57404.m34079().isEmpty() && !this.f57404.m34077()) {
            edit.remove("smdh");
        } else {
            C14293 c142932 = this.f57404;
            edit.putString("smdh", new JSONObject().put("headers", c142932.m34078()).put("crossOrigin", c142932.m34077()).toString());
        }
        edit.apply();
    }
}
