package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 6773 */
/* renamed from: l.ۙܿۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4787 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m13969(C7292 c7292) {
        String str;
        JSONArray array = JSON.array();
        int i = c7292.f22392;
        int i2 = c7292.f22387;
        boolean z = i < i2;
        int i3 = c7292.f22390;
        String str2 = c7292.f22391;
        if (z) {
            str = C18747.m43398("available_apks", "available_apks", "", 0, JSON.object().add("prefix", str2).add("recommendedLimit", i3).add("limitMax", 200), JSON.object().add("offset", i));
            array.add(C10115.m25398(C7416.m19939("workspaceId", "available_apks", "editSessionId", "").add("nextCursor", str).add("limit", i3), "mt_apk_continue", "continue", "Continue available APK files"));
        } else {
            str = null;
        }
        JSONObject add = JSON.object().add("prefix", str2);
        ArrayList arrayList = c7292.f22388;
        JSONArray array2 = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13641 c13641 = (C13641) it.next();
            JSONObject add2 = JSON.object().add(MotionUtils.EASING_TYPE_PATH, c13641.f40675).add("size", c13641.f40680).add("lastModified", c13641.f40674).add("appLabel", c13641.f40672).add("packageName", c13641.f40677).add("versionName", c13641.f40679);
            Long l2 = c13641.f40673;
            array2.add(add2.add("versionCode", l2 == null ? JSON.NULL : JSON.value(l2.longValue())).add("manifestAvailable", c13641.f40676).add("manifestError", c13641.f40678));
        }
        return C19993.m46095(add.add("items", array2).add("pagination", JSON.object().add("hasMore", i < i2).add("nextCursor", str == null ? JSON.NULL : JSON.value(str)).add("returnedCount", arrayList.size()).add("limitMax", 200).add("totalAvailableCount", c7292.f22389)), array);
    }
}
