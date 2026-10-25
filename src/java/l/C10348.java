package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: E6ZH */
/* renamed from: l.ۤܳۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10348 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m26148(C11326 c11326) {
        JSONObject object = JSON.object();
        ArrayList arrayList = c11326.f33895;
        JSONArray array = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2153 c2153 = (C2153) it.next();
            JSONObject add = JSON.object().add("workspaceId", c2153.f7129).add(MotionUtils.EASING_TYPE_PATH, "mt://workspace/" + c2153.f7129).add("sourcePath", c2153.f7133).add("sourceExists", c2153.f7124).add("temporary", false).add("apkFileName", c2153.f7123).add("appLabel", c2153.f7127).add("packageName", c2153.f7134).add("versionName", c2153.f7125);
            Long l2 = c2153.f7126;
            array.add(add.add("versionCode", l2 == null ? JSON.NULL : JSON.value(l2.longValue())).add("createdAt", c2153.f7130).add("lastAccessedAt", c2153.f7132).add("manifestAvailable", c2153.f7131).add("manifestError", c2153.f7128));
        }
        return C19993.m46095(object.add("items", array).add("returnedCount", arrayList.size()).add("unavailableCount", c11326.f33896), JSON.array());
    }
}
