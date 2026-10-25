package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: E79L */
/* renamed from: l.۫ۛ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12231 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f36477 = new LinkedHashMap();

    public C12231(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC4470 abstractC4470 = (AbstractC4470) it.next();
            LinkedHashMap linkedHashMap = this.f36477;
            if (linkedHashMap.containsKey(abstractC4470.mo3040())) {
                throw new IllegalArgumentException("Duplicate MCP tool: ".concat(abstractC4470.mo3040()));
            }
            linkedHashMap.put(abstractC4470.mo3040(), abstractC4470);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final JSONArray m29736() {
        JSONArray array = JSON.array();
        for (AbstractC4470 abstractC4470 : this.f36477.values()) {
            abstractC4470.getClass();
            JSONObject add = JSON.object().add("name", abstractC4470.mo3040()).add("title", abstractC4470.mo3037()).add("description", abstractC4470.mo3036()).add("annotations", abstractC4470.mo3033()).add("inputSchema", abstractC4470.mo3038());
            JSONObject mo3039 = abstractC4470.mo3039();
            if (mo3039 != null) {
                add.add("outputSchema", mo3039);
            }
            array.add(add);
        }
        return array;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final JSONObject m29737(JSONObject jSONObject, String str) {
        AbstractC4470 abstractC4470 = (AbstractC4470) this.f36477.get(str);
        if (abstractC4470 == null) {
            throw C3059.m9364("Unknown tool", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        try {
            return C10115.m25400(abstractC4470.mo3035(jSONObject));
        } catch (C3059 e) {
            return C10115.m25397(abstractC4470.mo3034(e));
        }
    }
}
