package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: J766 */
/* renamed from: l.᩸ܺۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C21682 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f69552;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f69553;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f69554;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f69555;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f69556;

    public C21682(JSONObject jSONObject) {
        List list;
        String string = jSONObject.getString("itemKind", "");
        C15330.m36361(string);
        this.f69552 = string;
        this.f69556 = jSONObject.getInt("offset", 0);
        this.f69554 = jSONObject.getInt("limit", 0);
        this.f69555 = jSONObject.getInt("totalCount", 0);
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        if (jSONArray == null || jSONArray.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if ("neededLibraries".equals(string)) {
                    arrayList.add(C22387.m50256(jSONObject2));
                } else if ("sections".equals(string) || "segments".equals(string)) {
                    arrayList.add(C3337.m10193(jSONObject2));
                } else if ("imports".equals(string)) {
                    arrayList.add(C5454.m15558(jSONObject2));
                } else if ("symbols".equals(string) || "entries".equals(string)) {
                    arrayList.add(C11804.m28855(jSONObject2));
                } else if ("initArray".equals(string) || "finiArray".equals(string)) {
                    arrayList.add(C1220.m4058(jSONObject2));
                } else {
                    arrayList.add(C20271.m46528(jSONObject2));
                }
            }
            list = C20195.unmodifiableList(arrayList);
        }
        this.f69553 = list;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21682 m48961(JSONObject jSONObject) {
        return new C21682(jSONObject);
    }
}
