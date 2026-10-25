package l;

import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.LinkedHashMap;

/* compiled from: S77A */
/* renamed from: l.ۢ᩵ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9793 {
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8236 m24828(C15996 c15996) {
        if (EnumC4003.GET.equals(c15996.m37807())) {
            String m40234 = C17140.m40234(c15996, MotionUtils.EASING_TYPE_PATH);
            if (m40234 != null && !m40234.isEmpty()) {
                return C2884.m8817(m24825(AbstractC16891.m39731(m40234)));
            }
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f12073e, new Object[0]));
        }
        return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector_res_0x7f120824, new Object[0]));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m24827(C15996 c15996) {
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
        if (m24826(jSONObject, MotionUtils.EASING_TYPE_PATH)) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120827, MotionUtils.EASING_TYPE_PATH));
        }
        if (m24826(jSONObject, "enabled")) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120827, "enabled"));
        }
        try {
            JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
            if (jSONValue == null || !jSONValue.isString()) {
                throw C6411.m17739((RuntimeException) new IllegalArgumentException("string required"));
            }
            String asString = jSONValue.asString();
            if (asString.isEmpty()) {
                return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f12073e, new Object[0]));
            }
            String m39731 = AbstractC16891.m39731(asString);
            JSONValue jSONValue2 = jSONObject.get("enabled");
            if (jSONValue2 == null || !jSONValue2.isBoolean()) {
                throw C6411.m17739((RuntimeException) new IllegalArgumentException("boolean required"));
            }
            if (!jSONValue2.asBoolean()) {
                C19890.f64282.remove("local:" + m39731);
                C19890.m45745();
                return C2884.m8817(m24825(m39731));
            }
            if (m24826(jSONObject, e.s)) {
                return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120827, e.s));
            }
            if (m24826(jSONObject, "reverse")) {
                return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120827, "reverse"));
            }
            try {
                JSONValue jSONValue3 = jSONObject.get(e.s);
                if (jSONValue3 == null || !jSONValue3.isString()) {
                    throw C6411.m17739((RuntimeException) new IllegalArgumentException("string required"));
                }
                String asString2 = jSONValue3.asString();
                JSONValue jSONValue4 = jSONObject.get("reverse");
                if (jSONValue4 == null || !jSONValue4.isBoolean()) {
                    throw C6411.m17739((RuntimeException) new IllegalArgumentException("boolean required"));
                }
                try {
                    C19890.f64282.put(C20094.m46315("local:", m39731), Integer.valueOf(C7489.m20113(C16141.m38053(asString2), jSONValue4.asBoolean())));
                    C19890.m45745();
                    return C2884.m8817(m24825(m39731));
                } catch (RuntimeException unused2) {
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120826, e.s));
                }
            } catch (RuntimeException unused3) {
                return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f12082b, new Object[0]));
            }
        } catch (RuntimeException unused4) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f12082b, new Object[0]));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m24825(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(MotionUtils.EASING_TYPE_PATH, str);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C9087 m38052 = C16141.m38052(str);
        linkedHashMap2.put("enabled", Boolean.valueOf(m38052 != null));
        if (m38052 == null) {
            m38052 = new C9087(0, false);
        }
        int i = m38052.f27538;
        String str2 = "name";
        if (i != 0) {
            if (i == 1) {
                str2 = "date";
            } else if (i == 2) {
                str2 = "size";
            } else if (i == 3) {
                str2 = "type";
            }
        }
        linkedHashMap2.put(e.s, str2);
        linkedHashMap2.put("reverse", Boolean.valueOf(m38052.f27539));
        linkedHashMap.put("folder", linkedHashMap2);
        return linkedHashMap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24826(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return jSONValue == null || jSONValue.isNull();
    }
}
