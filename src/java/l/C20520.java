package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: L6KZ */
/* renamed from: l.᩷֡ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20520 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m47006(String str, boolean z) {
        JSONObject add = JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", z ? "Normalized absolute source ZIP path." : "Normalized absolute output ZIP path."));
        if (z) {
            add.add("completedFiles", C1648.m5545("integer", "Number of files successfully extracted.")).add("createdDirectories", C1648.m5545("integer", "Number of directories created by this call."));
        } else {
            add.add("size", C1648.m5545("integer", "Final ZIP file size in bytes.")).add("changed", C1648.m5545(ClassTransform.BOOLEAN, "Whether the output file changed."));
        }
        add.add("warnings", C1648.m5541("Non-fatal metadata, cleanup, or notification issues."));
        JSONObject add2 = JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5542("string", "Normalized archive path, when available.")).add("entryPaths", C1648.m5541("ZIP paths involved in the failure.")).add("operationIndexes", C7416.m19939("type", "array", "description", "Zero-based indexes in operations, sources, or entries for this tool; empty for a whole-call failure.").add("items", C1648.m5545("integer", "Zero-based request item index."))).add("changed", C1648.m5545(ClassTransform.BOOLEAN, "Whether destination changes occurred or may have occurred.")).add("stateKnown", C1648.m5545(ClassTransform.BOOLEAN, "Whether the destination state after failure is known.")).add("operationMode", C1648.m5542("string", "Write guarantee: atomic replaces a target in one step; best_effort may leave a changed target after failure; non_atomic may leave completed files and directories from the batch. Null when not applicable. Always inspect changed and stateKnown before retrying.")).add("warnings", C1648.m5541("Non-fatal issues observed before the failure."));
        if (z) {
            add2.add("destinationPath", C1648.m5542("string", "Destination involved in the failure: normalized absolute path when resolved, otherwise original input; null when unavailable.")).add("completedFiles", C1648.m5545("integer", "Files successfully written before stopping.")).add("createdDirectories", C1648.m5545("integer", "Directories created before stopping."));
        } else {
            add2.add("sourcePath", C1648.m5542("string", "Absolute local source path that failed, possibly a child of a directory mapping; null when unavailable or unrelated to a source."));
        }
        return C1648.m5535(C4860.m14172("Result for ", str, "."), C1648.m5532(add, "ZIP operation result."), C1648.m5540(C1648.m5532(add2, "ZIP write failure details.")), C1648.m5534("No automatic follow-up action; correct the request or inspect the reported state before retrying."));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m47007(C3059 c3059, boolean z) {
        JSONObject jSONObject = c3059.f9609;
        JSONObject object = JSON.object();
        JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
        if (jSONValue == null) {
            jSONValue = JSON.NULL;
        }
        JSONObject add = object.add(MotionUtils.EASING_TYPE_PATH, jSONValue);
        JSONArray jSONArray = jSONObject.getJSONArray("entryPaths");
        JSONObject add2 = add.add("entryPaths", jSONArray == null ? JSON.array() : new JSONArray(jSONArray));
        JSONArray jSONArray2 = jSONObject.getJSONArray("operationIndexes");
        JSONObject add3 = add2.add("operationIndexes", jSONArray2 == null ? JSON.array() : new JSONArray(jSONArray2)).add("changed", jSONObject.getBoolean("changed", false)).add("stateKnown", jSONObject.getBoolean("stateKnown", true));
        JSONValue jSONValue2 = jSONObject.get("operationMode");
        if (jSONValue2 == null) {
            jSONValue2 = JSON.NULL;
        }
        JSONObject add4 = add3.add("operationMode", jSONValue2);
        JSONArray jSONArray3 = jSONObject.getJSONArray("warnings");
        JSONObject add5 = add4.add("warnings", jSONArray3 == null ? JSON.array() : new JSONArray(jSONArray3));
        if (z) {
            JSONValue jSONValue3 = jSONObject.get("destinationPath");
            if (jSONValue3 == null) {
                jSONValue3 = JSON.NULL;
            }
            add5.add("destinationPath", jSONValue3).add("completedFiles", jSONObject.getLong("completedFiles", 0L)).add("createdDirectories", jSONObject.getLong("createdDirectories", 0L));
        } else {
            JSONValue jSONValue4 = jSONObject.get("sourcePath");
            if (jSONValue4 == null) {
                jSONValue4 = JSON.NULL;
            }
            add5.add("sourcePath", jSONValue4);
        }
        return C19993.m46097(c3059, add5, c3059.f9604);
    }
}
