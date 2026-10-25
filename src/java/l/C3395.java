package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.p.a;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: S4VX */
/* renamed from: l.ۗᩳۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3395 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m10355(int i) {
        return Character.isWhitespace(i) || i == 65279;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m10356(int i) {
        return (i < 65 || i > 90) ? ((i < 97 || i > 122) && (i & a.g) != 0) ? Character.toLowerCase(Character.toUpperCase(i)) : i : i + 32;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m10359(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m10352(String str, C3059 c3059) {
        String str2;
        JSONValue jSONValue;
        boolean z;
        boolean z2;
        JSONObject object = JSON.object();
        Iterator it = m10354(str).iterator();
        while (it.hasNext()) {
            str2 = (String) it.next();
            jSONValue = c3059.f9609.get(str2);
            str2.getClass();
            z = true;
            z2 = false;
            switch (str2) {
                case "safeToRetry":
                case "changed":
                    if (jSONValue != null && jSONValue.isBoolean()) {
                        z2 = jSONValue.asBoolean();
                    }
                    object.add(str2, z2);
                    break;
                case "failedEditIndex":
                case "actual":
                case "deletedDirectories":
                case "totalBytes":
                case "deletedFiles":
                case "expectedReplacements":
                case "limit":
                case "finalLine":
                case "byteOffset":
                case "endByteOffset":
                case "failedPatchIndex":
                case "conflictingEditIndex":
                case "actualReplacements":
                case "finalColumn":
                case "conflictingPatchIndex":
                case "createdDirectories":
                    if (jSONValue == null || !jSONValue.isNumber()) {
                        jSONValue = JSON.NULL;
                    }
                    object.add(str2, jSONValue);
                    break;
                case "stateKnown":
                    if (jSONValue != null && jSONValue.isBoolean()) {
                        z = jSONValue.asBoolean();
                    }
                    object.add(str2, z);
                    break;
                case "warnings":
                    JSONArray array = JSON.array();
                    if (jSONValue != null && jSONValue.isArray()) {
                        Iterator it2 = jSONValue.asArray().iterator();
                        while (it2.hasNext()) {
                            JSONValue jSONValue2 = (JSONValue) it2.next();
                            if (jSONValue2.isString()) {
                                array.add(jSONValue2.asString());
                            }
                        }
                    }
                    object.add(str2, array);
                    break;
                default:
                    object.add(str2, C0899.m3250(jSONValue));
                    break;
            }
        }
        return C19993.m46097(c3059, object, c3059.f9604);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m10362(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            if (lastIndexOf == 0) {
                lastIndexOf = 2;
            }
            int m46093 = C19993.m46093(lastIndexOf, str);
            int length = m46093 >= 0 ? m46093 : str.length();
            while (true) {
                int i = length - 1;
                if (i <= lastIndexOf) {
                    length = i;
                    break;
                }
                if (str.charAt(i) != '0') {
                    break;
                }
                length = i;
            }
            if (m46093 < 0) {
                return str.substring(0, length);
            }
            if (m46093 != length) {
                return str.substring(0, length) + str.substring(m46093);
            }
        }
        return str;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m10358(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m10357(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        JSONObject add;
        JSONObject object = JSON.object();
        Iterator it = m10354(str).iterator();
        while (it.hasNext()) {
            str2 = (String) it.next();
            str2.getClass();
            switch (str2) {
                case "safeToRetry":
                    str3 = "Whether retrying the same requested mutation is safe.";
                    add = C1648.m5545(ClassTransform.BOOLEAN, str3);
                    object.add(str2, add);
                case "failedEditIndex":
                    str4 = "Zero-based index in the input edits array of the rejected text edit, or null.";
                    add = C1648.m5542("integer", str4);
                    object.add(str2, add);
                case "actual":
                    str4 = "Actual content or item count, or null.";
                    add = C1648.m5542("integer", str4);
                    object.add(str2, add);
                case "deletedDirectories":
                    str4 = "Directories confirmed deleted before a failure, or null.";
                    add = C1648.m5542("integer", str4);
                    object.add(str2, add);
                case "actualTargetVersion":
                    str5 = "Current targetVersion for a version mismatch during reading or writing, or null.";
                    add = C1648.m5542("string", str5);
                    object.add(str2, add);
                case "totalBytes":
                    str4 = "Current file size for a range failure, or null.";
                    add = C1648.m5542("integer", str4);
                    object.add(str2, add);
                case "deletedFiles":
                    str4 = "Files or recognized links confirmed deleted before a failure, or null.";
                    add = C1648.m5542("integer", str4);
                    object.add(str2, add);
                case "deepestCreatedPath":
                    str5 = "Deepest path confirmed created before a failure, or null.";
                    add = C1648.m5542("string", str5);
                    object.add(str2, add);
                case "stateKnown":
                    str3 = "Whether the target final state is known.";
                    add = C1648.m5545(ClassTransform.BOOLEAN, str3);
                    object.add(str2, add);
                case "failureStage":
                    str5 = "Stable mutation stage that failed, or null.";
                    add = C1648.m5542("string", str5);
                    object.add(str2, add);
                case "expectedTargetVersion":
                    str5 = "Requested targetVersion for a version mismatch during reading or writing, or null.";
                    add = C1648.m5542("string", str5);
                    object.add(str2, add);
                case "expectedReplacements":
                    str4 = "Requested selected replacement count when the count check fails; otherwise null.";
                    add = C1648.m5542("integer", str4);
                    object.add(str2, add);
                case "path":
                    str5 = "Normalized absolute path involved in the failure.";
                    add = C1648.m5542("string", str5);
                    object.add(str2, add);
                case "operationMode":
                    str5 = "atomic, best_effort, or non_atomic when a mutation guarantee was selected.";
                    add = C1648.m5542("string", str5);
                    object.add(str2, add);
                case "limit":
                    str4 = "Applicable content or item limit, or null.";
                    add = C1648.m5542("integer", str4);
                    object.add(str2, add);
                case "finalLine":
                    str4 = "Zero-based logical line at end of file for a text position error; null when unavailable.";
                    add = C1648.m5542("integer", str4);
                    object.add(str2, add);
                case "byteOffset":
                    str4 = "Rejected byte offset, or null.";
                    add = C1648.m5542("integer", str4);
                    object.add(str2, add);
                case "targetPath":
                    str5 = "Normalized absolute second path for a two-path operation.";
                    add = C1648.m5542("string", str5);
                    object.add(str2, add);
                case "warnings":
                    add = C7416.m19939("type", "array", "description", "Non-fatal cleanup, metadata, or notification degradation.").add("items", C1648.m5545("string", "One warning message."));
                    object.add(str2, add);
                case "endByteOffset":
                    str4 = "Exclusive rejected byte end, or null.";
                    add = C1648.m5542("integer", str4);
                    object.add(str2, add);
                case "actualHex":
                    str5 = "Current patch bytes in uppercase hex, or null.";
                    add = C1648.m5542("string", str5);
                    object.add(str2, add);
                case "failedPath":
                    str5 = "Exact path whose mutation failed, or null.";
                    add = C1648.m5542("string", str5);
                    object.add(str2, add);
                case "failedPatchIndex":
                    str4 = "Zero-based index in the input patches array of the rejected byte patch, or null.";
                    add = C1648.m5542("integer", str4);
                    object.add(str2, add);
                case "changed":
                    str3 = "Whether the target may already have changed.";
                    add = C1648.m5545(ClassTransform.BOOLEAN, str3);
                    object.add(str2, add);
                case "conflictingEditIndex":
                    str4 = "Zero-based index in the input edits array of the conflicting text edit, or null.";
                    add = C1648.m5542("integer", str4);
                    object.add(str2, add);
                case "actualReplacements":
                    str4 = "Observed selected replacement count when the count check fails; otherwise null.";
                    add = C1648.m5542("integer", str4);
                    object.add(str2, add);
                case "expectedHex":
                    str5 = "Expected patch bytes in uppercase hex, or null.";
                    add = C1648.m5542("string", str5);
                    object.add(str2, add);
                case "finalColumn":
                    str4 = "Zero-based Unicode code-point column at end of file on finalLine. Reading at (finalLine, finalColumn) returns an empty page; null when unavailable.";
                    add = C1648.m5542("integer", str4);
                    object.add(str2, add);
                case "conflictingPatchIndex":
                    str4 = "Zero-based index in the input patches array of the conflicting byte patch, or null.";
                    add = C1648.m5542("integer", str4);
                    object.add(str2, add);
                case "createdDirectories":
                    str4 = "Directory levels confirmed created before a failure, or null.";
                    add = C1648.m5542("integer", str4);
                    object.add(str2, add);
                default:
                    throw new IllegalArgumentException("Unknown diagnostic field: ".concat(str2));
            }
        }
        return C1648.m5540(C1648.m5532(object, "Local file failure context for this tool; unavailable values are null."));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m10354(String str) {
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        List list;
        ArrayList arrayList3;
        i = 0;
        Object[] objArr = {MotionUtils.EASING_TYPE_PATH};
        ArrayList arrayList4 = new ArrayList(1);
        Object obj = objArr[0];
        C11003.requireNonNull(obj);
        arrayList4.add(obj);
        arrayList = new ArrayList(C20195.unmodifiableList(arrayList4));
        switch (str) {
            case "mt_file_create_directory":
                Object[] objArr2 = {"changed", "operationMode", "stateKnown", "warnings", "createdDirectories", "deepestCreatedPath", "failedPath", "failureStage", "safeToRetry"};
                arrayList2 = new ArrayList(9);
                while (i < 9) {
                    Object obj2 = objArr2[i];
                    i = C8954.m23073(obj2, arrayList2, obj2, i, 1);
                }
                list = C20195.unmodifiableList(arrayList2);
                arrayList.addAll(list);
                return arrayList;
            case "mt_file_search":
            case "mt_file_list":
            case "mt_file_stat":
            case "mt_file_search_text":
                list = Collections.EMPTY_LIST;
                arrayList.addAll(list);
                return arrayList;
            case "mt_file_delete_directory":
                Object[] objArr3 = {"changed", "operationMode", "stateKnown", "warnings", "deletedFiles", "deletedDirectories", "failedPath", "failureStage", "safeToRetry"};
                arrayList2 = new ArrayList(9);
                while (i < 9) {
                    Object obj3 = objArr3[i];
                    i = C8954.m23073(obj3, arrayList2, obj3, i, 1);
                }
                list = C20195.unmodifiableList(arrayList2);
                arrayList.addAll(list);
                return arrayList;
            case "mt_file_patch_bytes":
                String[] strArr = {"targetPath", "changed", "operationMode", "stateKnown", "warnings", "expectedTargetVersion", "actualTargetVersion", "failedPatchIndex", "conflictingPatchIndex", "byteOffset", "endByteOffset", "totalBytes", "limit", "actual", "expectedHex", "actualHex"};
                arrayList3 = new ArrayList(16);
                while (i < 16) {
                    String str2 = strArr[i];
                    C11003.requireNonNull(str2);
                    arrayList3.add(str2);
                    i++;
                }
                list = C20195.unmodifiableList(arrayList3);
                arrayList.addAll(list);
                return arrayList;
            case "mt_file_edit_text":
                String[] strArr2 = {"targetPath", "changed", "operationMode", "stateKnown", "warnings", "expectedTargetVersion", "actualTargetVersion", "failedEditIndex", "conflictingEditIndex", "limit", "actual"};
                arrayList3 = new ArrayList(11);
                while (i < 11) {
                    String str3 = strArr2[i];
                    C11003.requireNonNull(str3);
                    arrayList3.add(str3);
                    i++;
                }
                list = C20195.unmodifiableList(arrayList3);
                arrayList.addAll(list);
                return arrayList;
            case "mt_file_write_bytes":
                Object[] objArr4 = {"targetPath", "changed", "operationMode", "stateKnown", "warnings", "expectedTargetVersion", "actualTargetVersion", "limit", "actual"};
                arrayList2 = new ArrayList(9);
                while (i < 9) {
                    Object obj4 = objArr4[i];
                    i = C8954.m23073(obj4, arrayList2, obj4, i, 1);
                }
                list = C20195.unmodifiableList(arrayList2);
                arrayList.addAll(list);
                return arrayList;
            case "mt_file_replace_text":
                Object[] objArr5 = {"changed", "operationMode", "stateKnown", "warnings", "expectedTargetVersion", "actualTargetVersion", "expectedReplacements", "actualReplacements", "limit", "actual"};
                arrayList2 = new ArrayList(10);
                while (i < 10) {
                    Object obj5 = objArr5[i];
                    i = C8954.m23073(obj5, arrayList2, obj5, i, 1);
                }
                list = C20195.unmodifiableList(arrayList2);
                arrayList.addAll(list);
                return arrayList;
            case "mt_file_copy":
                Object[] objArr6 = {"targetPath", "changed", "operationMode", "stateKnown", "warnings"};
                arrayList2 = new ArrayList(5);
                while (i < 5) {
                    Object obj6 = objArr6[i];
                    i = C8954.m23073(obj6, arrayList2, obj6, i, 1);
                }
                list = C20195.unmodifiableList(arrayList2);
                arrayList.addAll(list);
                return arrayList;
            case "mt_file_move":
                Object[] objArr7 = {"targetPath", "changed", "operationMode", "stateKnown", "warnings"};
                arrayList2 = new ArrayList(5);
                while (i < 5) {
                    Object obj7 = objArr7[i];
                    i = C8954.m23073(obj7, arrayList2, obj7, i, 1);
                }
                list = C20195.unmodifiableList(arrayList2);
                arrayList.addAll(list);
                return arrayList;
            case "mt_file_read_text":
                Object[] objArr8 = {"expectedTargetVersion", "actualTargetVersion", "finalLine", "finalColumn"};
                arrayList2 = new ArrayList(4);
                while (i < 4) {
                    Object obj8 = objArr8[i];
                    i = C8954.m23073(obj8, arrayList2, obj8, i, 1);
                }
                list = C20195.unmodifiableList(arrayList2);
                arrayList.addAll(list);
                return arrayList;
            case "mt_file_append_text":
            case "mt_file_truncate_bytes":
            case "mt_file_append_bytes":
                Object[] objArr9 = {"changed", "operationMode", "stateKnown", "warnings", "expectedTargetVersion", "actualTargetVersion", "limit", "actual"};
                arrayList2 = new ArrayList(8);
                while (i < 8) {
                    Object obj9 = objArr9[i];
                    i = C8954.m23073(obj9, arrayList2, obj9, i, 1);
                }
                list = C20195.unmodifiableList(arrayList2);
                arrayList.addAll(list);
                return arrayList;
            case "mt_file_read_bytes":
                Object[] objArr10 = {"expectedTargetVersion", "actualTargetVersion", "byteOffset", "totalBytes"};
                arrayList2 = new ArrayList(4);
                while (i < 4) {
                    Object obj10 = objArr10[i];
                    i = C8954.m23073(obj10, arrayList2, obj10, i, 1);
                }
                list = C20195.unmodifiableList(arrayList2);
                arrayList.addAll(list);
                return arrayList;
            case "mt_file_delete":
                Object[] objArr11 = {"changed", "operationMode", "stateKnown", "warnings"};
                arrayList2 = new ArrayList(4);
                while (i < 4) {
                    Object obj11 = objArr11[i];
                    i = C8954.m23073(obj11, arrayList2, obj11, i, 1);
                }
                list = C20195.unmodifiableList(arrayList2);
                arrayList.addAll(list);
                return arrayList;
            default:
                throw new IllegalArgumentException("Unknown file tool: ".concat(str));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Class m10353(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static byte[] m10360(String str) {
        byte[] bArr = new byte[str.length() + 1];
        System.arraycopy(str.getBytes(C8208.f25221), 0, bArr, 0, str.length());
        return bArr;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m10361(String str) {
        return (str == null || str.trim().isEmpty()) ? false : true;
    }
}
