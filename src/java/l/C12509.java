package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: X74A */
/* renamed from: l.۫ܺۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12509 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f37573;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f37574;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f37575;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f37576;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f37577;

    public C12509(JSONObject jSONObject) {
        List list;
        this.f37577 = jSONObject.getInt("offset", 0);
        this.f37574 = jSONObject.getInt("limit", 0);
        this.f37576 = jSONObject.getInt("totalCount", 0);
        this.f37575 = C23407.m51853(jSONObject, "nextScanOffset", -1L);
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        if (jSONArray == null || jSONArray.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                arrayList.add(C13214.m32049(jSONArray.getJSONObject(i)));
            }
            list = C20195.unmodifiableList(arrayList);
        }
        this.f37573 = list;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12509 m30690(JSONObject jSONObject) {
        return new C12509(jSONObject);
    }
}
