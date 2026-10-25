package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.Iterator;
import org.simpleframework.xml.core.AnnotationHandler;

/* compiled from: 2B5C */
/* renamed from: l.ۘܳ֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C3993 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f12656;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f12657;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m12038(String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject add = JSON.object().add("type", "object").add("additionalProperties", false).add("properties", jSONObject);
        JSONArray array = JSON.array();
        Iterator it = jSONObject.names().iterator();
        while (it.hasNext()) {
            array.add((String) it.next());
        }
        return add.add(AnnotationHandler.REQUIRED, array);
    }
}
