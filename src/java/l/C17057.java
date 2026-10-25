package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Q75G */
/* renamed from: l.ܿۖۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17057 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13919 f52258;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C4043 f52259;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f52260;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f52261;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f52262;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List f52263;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f52264;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f52265;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C16351 f52266;

    public C17057(JSONObject jSONObject) {
        List list;
        List list2;
        List list3;
        List list4;
        this.f52260 = jSONObject.getString("arch", "");
        this.f52262 = jSONObject.getInt("bits", 0);
        this.f52259 = C4043.m12141(jSONObject.getJSONObject("mapping"));
        this.f52266 = C16351.m38496(jSONObject.getJSONObject("function"));
        JSONArray jSONArray = jSONObject.getJSONArray("blocks");
        if (jSONArray == null || jSONArray.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                arrayList.add(C7570.m20294(jSONArray.getJSONObject(i)));
            }
            list = C20195.unmodifiableList(arrayList);
        }
        this.f52264 = list;
        JSONArray jSONArray2 = jSONObject.getJSONArray("edges");
        if (jSONArray2 == null || jSONArray2.isEmpty()) {
            list2 = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(jSONArray2.size());
            for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                arrayList2.add(C1535.m5247(jSONArray2.getJSONObject(i2)));
            }
            list2 = C20195.unmodifiableList(arrayList2);
        }
        this.f52263 = list2;
        JSONArray jSONArray3 = jSONObject.getJSONArray("externalFlows");
        if (jSONArray3 == null || jSONArray3.isEmpty()) {
            list3 = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(jSONArray3.size());
            for (int i3 = 0; i3 < jSONArray3.size(); i3++) {
                arrayList3.add(C10708.m26888(jSONArray3.getJSONObject(i3)));
            }
            list3 = C20195.unmodifiableList(arrayList3);
        }
        this.f52261 = list3;
        JSONArray jSONArray4 = jSONObject.getJSONArray("unresolvedFlows");
        if (jSONArray4 == null || jSONArray4.isEmpty()) {
            list4 = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList4 = new ArrayList(jSONArray4.size());
            for (int i4 = 0; i4 < jSONArray4.size(); i4++) {
                arrayList4.add(C17763.m41614(jSONArray4.getJSONObject(i4)));
            }
            list4 = C20195.unmodifiableList(arrayList4);
        }
        this.f52265 = list4;
        this.f52258 = C13919.m33331(jSONObject.getJSONObject("analysisSummary"));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17057 m40030(JSONObject jSONObject) {
        return new C17057(jSONObject);
    }
}
