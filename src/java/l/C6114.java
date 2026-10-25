package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: 56ZH */
/* renamed from: l.ۛܳۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6114 extends AbstractC4470 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f18734;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f18735;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19793 f18736;

    @Override // l.AbstractC4470
    /* renamed from: ۧ */
    public final String mo3036() {
        return "List saved non-temporary APK workspaces that can be reopened. Pass data.items[].path to mt_apk_workspace_open.path with temporary=false. sourcePath is the recorded absolute source path and may no longer exist; do not pass sourcePath to mt_apk_workspace_open. Results are sorted by lastAccessedAt descending. Corrupt or unavailable saved workspaces are skipped and counted in data.unavailableCount.";
    }

    @Override // l.AbstractC4470
    /* renamed from: ܳ */
    public final String mo3037() {
        return "List APK Workspaces";
    }

    @Override // l.AbstractC4470
    /* renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_workspace_list";
    }

    public C6114(C19793 c19793) {
        this.f18736 = c19793;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f18734;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject m12038 = C3993.m12038("{}");
        this.f18734 = m12038;
        return m12038;
    }

    @Override // l.AbstractC4470
    /* renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f18735;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject m5535 = C1648.m5535("Result for mt_apk_workspace_list. data.items[] contains saved non-temporary APK workspaces; pass items[i].path to mt_apk_workspace_open.path with temporary=false. sourcePath is informational and may no longer exist; nextActions is always empty.", C18736.m43390(JSON.object().add("items", C7416.m19939("type", "array", "description", "Saved non-temporary APK workspaces sorted by lastAccessedAt descending.").add("items", C1648.m5532(JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id used by MT MCP tools after opening.")).add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Workspace URI beginning with mt://workspace/ to pass directly to mt_apk_workspace_open.path with temporary=false.")).add("sourcePath", C1648.m5542("string", "Absolute source APK path recorded when the workspace was created. It is informational, may no longer exist, and must not be passed to mt_apk_workspace_open; pass path instead.")).add("sourceExists", C1648.m5545(ClassTransform.BOOLEAN, "Whether sourcePath currently points to an ordinary file.")).add("temporary", C1648.m5545(ClassTransform.BOOLEAN, "Always false because this tool excludes temporary workspaces.")).add("apkFileName", C1648.m5542("string", "Source APK file name when available.")).add("appLabel", C1648.m5542("string", "Resolved or raw application label when available.")).add("packageName", C1648.m5542("string", "Manifest package name when available.")).add("versionName", C1648.m5542("string", "Manifest versionName when available.")).add("versionCode", C1648.m5542("integer", "Manifest versionCode when available.")).add("createdAt", C1648.m5545("integer", "Workspace creation time as epoch milliseconds.")).add("lastAccessedAt", C1648.m5545("integer", "Last recorded workspace access time as epoch milliseconds.")).add("manifestAvailable", C1648.m5545(ClassTransform.BOOLEAN, "Whether AndroidManifest.xml was parsed successfully.")).add("manifestError", C1648.m5542("string", "Manifest parse error, or null.")), "Existing non-temporary APK workspace."))).add("returnedCount", C1648.m5545("integer", "Number of non-temporary workspaces returned.")), "integer", "Number of saved workspaces skipped because their data was unavailable or corrupt.", "unavailableCount", "Successful mt_apk_workspace_list data."), C1648.m5540(C12464.m30621()), C1648.m5534("No follow-up action is required; use data.items[].path directly with mt_apk_workspace_open."));
        this.f18735 = m5535;
        return m5535;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C19993.m46096(c3059);
    }

    /* JADX WARN: Finally extract failed */
    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        Iterator it = jSONObject.names().iterator();
        if (!it.hasNext()) {
            try {
                C11326 m45524 = this.f18736.m45524();
                int i = C8869.f27007;
                return new C12936(C10348.m26148(m45524));
            } catch (Throwable th) {
                int i2 = C8869.f27007;
                throw th;
            }
        }
        String str = (String) it.next();
        throw C3059.m9364("Invalid list_workspaces argument", str, jSONObject.get(str), JSON.array(), JSON.object());
    }
}
