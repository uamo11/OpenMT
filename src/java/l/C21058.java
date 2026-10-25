package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: R6XW */
/* renamed from: l.᩷ᩴۜ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21058 extends AbstractC4470 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f67924;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f67925;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23795 f67926;

    @Override // l.AbstractC4470
    /* renamed from: ۧ */
    public final String mo3036() {
        return "List an allowed local directory as a compact entry list. path accepts an absolute path or a Home-relative path; only this tool accepts path=\"\" as current Home. Pass cursor=\"\" initially, limit=200 unless another page size is needed, and no more than 1000. The listing includes hidden entries, uses absolute data.directoryPath as its fixed base, and recursively traverses readable directories depth-first without following recognized links. Later pages may reuse directory metadata for up to 30 seconds; start with an empty cursor for a fresh listing. This is not a filesystem snapshot. Copy nextActions[0].arguments unchanged for later pages.";
    }

    @Override // l.AbstractC4470
    /* renamed from: ܳ */
    public final String mo3037() {
        return "List Local Files";
    }

    @Override // l.AbstractC4470
    /* renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_list";
    }

    public C21058(C23795 c23795) {
        this.f67926 = c23795;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* renamed from: ܽ */
    public final JSONObject mo3038() {
        if (this.f67924 == null) {
            this.f67924 = m47905();
        }
        return this.f67924;
    }

    @Override // l.AbstractC4470
    /* renamed from: ܿ */
    public final JSONObject mo3039() {
        if (this.f67925 == null) {
            this.f67925 = C1648.m5535("Result for mt_file_list.", C1648.m5532(JSON.object().add("directoryPath", C1648.m5545("string", "Normalized absolute directory used as the base for every listed path.")).add("listing", C1648.m5541("One entry per array element, formatted as type size modifiedAt relativePath. Split only at the first three ASCII spaces; preserve the remaining raw relativePath without trimming, unquoting, or splitting on newlines. Types: f=file, d=directory, l=link, o=other. Size is bytes for known regular files, otherwise -; modifiedAt is an ISO-8601 timestamp or -. Empty array for no entries.")).add("pagination", C18736.m43390(JSON.object().add("hasMore", C1648.m5545(ClassTransform.BOOLEAN, "Whether another page remains for this directory traversal.")), "string", "Opaque cursor copied unchanged; empty string on the last page.", "nextCursor", "File list pagination.")), "One local directory listing page."), C3395.m10357("mt_file_list"), C1648.m5538("Contains one directly executable mt_file_list continuation when hasMore=true; otherwise empty.", C1648.m5533(m47905(), "mt_file_list", "continue")));
        }
        return this.f67925;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C3395.m10352("mt_file_list", c3059);
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        C5807.m16297(jSONObject, new C6946(), "Invalid mt_file_list argument", MotionUtils.EASING_TYPE_PATH, "recursive", "cursor", "limit");
        String m47902 = m47902(jSONObject, MotionUtils.EASING_TYPE_PATH);
        JSONValue jSONValue = jSONObject.get("recursive");
        if (jSONValue == null || !jSONValue.isBoolean()) {
            throw m47904(jSONValue, "Invalid recursive", "recursive");
        }
        boolean asBoolean = jSONValue.asBoolean();
        String m479022 = m47902(jSONObject, "cursor");
        JSONValue jSONValue2 = jSONObject.get("limit");
        if (jSONValue2 == null || !jSONValue2.isNumber()) {
            throw m47904(jSONValue2, "Invalid limit", "limit");
        }
        try {
            int m3253 = C0899.m3253(jSONValue2);
            if (m3253 >= 1 && m3253 <= 1000) {
                C18151 m52475 = this.f67926.m52475(m47902, m3253, m479022, asBoolean);
                String str = m52475.f56444;
                String str2 = m52475.f56448;
                boolean z = m52475.f56445;
                JSONObject add = JSON.object().add("hasMore", z).add("nextCursor", str2);
                JSONArray array = JSON.array();
                Iterator it = m52475.f56449.iterator();
                while (it.hasNext()) {
                    array.add((String) it.next());
                }
                JSONObject add2 = JSON.object().add("directoryPath", str).add("listing", array).add("pagination", add);
                JSONArray array2 = JSON.array();
                if (z) {
                    array2.add(C10115.m25398(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("recursive", m52475.f56446).add("cursor", str2).add("limit", m52475.f56447), "mt_file_list", "continue", "Continue this exact local directory traversal."));
                }
                return new C12936(C19993.m46095(add2, array2));
            }
            throw m47904(jSONValue2, "limit must be between 1 and 1000", "limit");
        } catch (ArithmeticException | NumberFormatException unused) {
            throw m47904(jSONValue2, "Invalid limit", "limit");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m47902(JSONObject jSONObject, String str) {
        String concat = "Invalid ".concat(str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m47904(jSONValue, concat, str);
        }
        return jSONValue.asString();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m47904(JSONValue jSONValue, String str, String str2) {
        return C3059.m9364(str, str2, jSONValue, JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "").add("recursive", false).add("cursor", "").add("limit", 200));
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static JSONObject m47905() {
        return C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Absolute or Home-relative directory. Pass \"\" (empty string) for the current Home directory.")).add("recursive", C1648.m5545(ClassTransform.BOOLEAN, "Whether to traverse readable subdirectories depth-first without following recognized links.")).add("cursor", C1648.m5545("string", "Pass \"\" (empty string) initially; later copy the server-provided cursor unchanged.")), "integer", "Page size from 1 to 1000; recommended value is 200 and must remain unchanged for a cursor.", "limit", "Arguments for mt_file_list.");
    }
}
