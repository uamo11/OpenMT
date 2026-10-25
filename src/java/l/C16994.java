package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: 3786 */
/* renamed from: l.ܿ֡ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16994 {
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8236 m39835(C15996 c15996) {
        if (EnumC4003.GET.equals(c15996.m37807())) {
            return C2884.m8817(m39830());
        }
        return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector_res_0x7f120824, new Object[0]));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8236 m39834(C15996 c15996) {
        JSONObject jSONObject;
        if (!EnumC4003.POST.equals(c15996.m37807())) {
            return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector_res_0x7f120824, new Object[0]));
        }
        try {
            jSONObject = C6411.m17736(c15996);
        } catch (IOException | RuntimeException | C15290 unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f12082b, new Object[0]));
        }
        if (m39831(jSONObject, "showSystemHiddenFiles")) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120827, "showSystemHiddenFiles"));
        }
        if (m39831(jSONObject, "showManuallyHiddenFiles")) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120827, "showManuallyHiddenFiles"));
        }
        try {
            JSONValue jSONValue = jSONObject.get("showSystemHiddenFiles");
            if (jSONValue == null || !jSONValue.isBoolean()) {
                throw C6411.m17739((RuntimeException) new IllegalArgumentException("boolean required"));
            }
            boolean asBoolean = jSONValue.asBoolean();
            JSONValue jSONValue2 = jSONObject.get("showManuallyHiddenFiles");
            if (jSONValue2 == null || !jSONValue2.isBoolean()) {
                throw C6411.m17739((RuntimeException) new IllegalArgumentException("boolean required"));
            }
            boolean asBoolean2 = jSONValue2.asBoolean();
            if (C17315.m40631() != asBoolean) {
                C17315.m40628(asBoolean);
            }
            if (C17315.m40629() != asBoolean2) {
                C17315.m40625(asBoolean2);
            }
            return C2884.m8817(m39830());
        } catch (RuntimeException unused2) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f12082b, new Object[0]));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m39832(C15996 c15996) {
        JSONObject jSONObject;
        if (!EnumC4003.POST.equals(c15996.m37807())) {
            return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector_res_0x7f120824, new Object[0]));
        }
        try {
            jSONObject = C6411.m17736(c15996);
        } catch (IOException | RuntimeException | C15290 unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f12082b, new Object[0]));
        }
        if (m39831(jSONObject, "paths")) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120827, "paths"));
        }
        try {
            C17315.m40624(m39829(jSONObject.get("paths")));
            return C2884.m8817(m39830());
        } catch (RuntimeException unused2) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f12082b, new Object[0]));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8236 m39833(C15996 c15996) {
        JSONObject jSONObject;
        if (!EnumC4003.POST.equals(c15996.m37807())) {
            return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector_res_0x7f120824, new Object[0]));
        }
        try {
            jSONObject = C6411.m17736(c15996);
        } catch (IOException | RuntimeException | C15290 unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f12082b, new Object[0]));
        }
        if (m39831(jSONObject, TextBundle.TEXT_ENTRY)) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120827, TextBundle.TEXT_ENTRY));
        }
        try {
            JSONValue jSONValue = jSONObject.get(TextBundle.TEXT_ENTRY);
            if (jSONValue == null || !jSONValue.isString()) {
                throw C6411.m17739((RuntimeException) new IllegalArgumentException("string required"));
            }
            C17315.m40634(jSONValue.asString());
            return C2884.m8817(m39830());
        } catch (RuntimeException unused2) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f12082b, new Object[0]));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m39830() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("showSystemHiddenFiles", Boolean.valueOf(C17315.m40631()));
        linkedHashMap.put("showManuallyHiddenFiles", Boolean.valueOf(C17315.m40629()));
        linkedHashMap.put("manuallyHiddenFilesText", C17315.m40621());
        return linkedHashMap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m39831(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return jSONValue == null || jSONValue.isNull();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m39829(JSONValue jSONValue) {
        if (jSONValue == null || !jSONValue.isArray()) {
            throw C6411.m17739((RuntimeException) new IllegalArgumentException("array required"));
        }
        JSONArray asArray = jSONValue.asArray();
        ArrayList arrayList = new ArrayList(asArray.size());
        for (int i = 0; i < asArray.size(); i++) {
            JSONValue jSONValue2 = asArray.get(i);
            if (jSONValue2 == null || !jSONValue2.isString()) {
                throw C6411.m17739((RuntimeException) new IllegalArgumentException("path string required"));
            }
            String asString = jSONValue2.asString();
            if (asString.isEmpty() || !asString.startsWith("/")) {
                throw C6411.m17739((RuntimeException) new IllegalArgumentException("absolute path required"));
            }
            arrayList.add(asString);
        }
        return arrayList;
    }
}
