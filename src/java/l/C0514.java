package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: V75L */
/* renamed from: l.֡ܺۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0514 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f2160;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f2161;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f2162;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List f2163;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f2164;

    public C0514(JSONObject jSONObject) {
        List list;
        this.f2160 = jSONObject.getString("arch", "");
        this.f2161 = jSONObject.getInt("bits", 0);
        C23407.m51853(jSONObject, "address", 0L);
        JSONArray jSONArray = jSONObject.getJSONArray("instructions");
        if (jSONArray == null || jSONArray.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                arrayList.add(new C19566(jSONArray.getJSONObject(i)));
            }
            list = C20195.unmodifiableList(arrayList);
        }
        this.f2163 = list;
        this.f2162 = jSONObject.getInt("bytesConsumed", 0);
        this.f2164 = jSONObject.getBoolean("incompleteInstructionAtEnd", false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0514 m2225(JSONObject jSONObject) {
        return new C0514(jSONObject);
    }
}
