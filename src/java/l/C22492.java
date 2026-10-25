package l;

import android.text.TextUtils;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.RadialViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: 07BV */
/* renamed from: l.᩹᩵ۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22492 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10645 f72816;

    public C22492(C2884 c2884, C10645 c10645) {
        this.f72816 = c10645;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C8236 m50449(C15996 c15996) {
        String str;
        List list;
        EnumC1180 enumC1180;
        String m14306;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z;
        boolean z2;
        String str9;
        EnumC4003 m37807 = c15996.m37807();
        boolean equals = EnumC4003.POST.equals(m37807);
        C10645 c10645 = this.f72816;
        if (equals) {
            try {
                C21787 m50445 = m50445(c15996);
                str = m50445.f69788;
                String m43782 = C18965.m43782(str);
                if (TextUtils.isEmpty(m43782)) {
                    enumC1180 = EnumC1180.BAD_REQUEST;
                    m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120827, "targetPath");
                } else {
                    list = m50445.f69787;
                    if (list == null || list.isEmpty()) {
                        enumC1180 = EnumC1180.BAD_REQUEST;
                        m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120827, "entries");
                    } else {
                        try {
                            LinkedHashMap m26736 = c10645.m26736(c10645.m26731(m43782, list));
                            if (m26736 != null) {
                                return C2884.m8817(m26736);
                            }
                            enumC1180 = EnumC1180.INTERNAL_ERROR;
                            m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f12082f, new Object[0]);
                        } catch (RuntimeException e) {
                            EnumC1180 enumC11802 = EnumC1180.CONFLICT;
                            String message = e.getMessage();
                            if (TextUtils.isEmpty(message)) {
                                message = C4925.m14327(R.string.MT_Protector_res_0x7f12082e);
                            }
                            return C2884.m8818(enumC11802, message);
                        }
                    }
                }
            } catch (IOException | C15290 | C23344 unused) {
                return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f12082b, new Object[0]));
            }
        } else if (EnumC4003.GET.equals(m37807)) {
            String m40234 = C17140.m40234(c15996, "taskId");
            if (TextUtils.isEmpty(m40234)) {
                enumC1180 = EnumC1180.BAD_REQUEST;
                m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120827, "taskId");
            } else {
                LinkedHashMap m267362 = c10645.m26736(m40234);
                if (m267362 != null) {
                    return C2884.m8817(m267362);
                }
                enumC1180 = EnumC1180.NOT_FOUND;
                m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f12082f, new Object[0]);
            }
        } else if (EnumC4003.PUT.equals(m37807)) {
            try {
                C15435 m50444 = m50444(c15996);
                str2 = m50444.f47253;
                if (TextUtils.isEmpty(str2)) {
                    enumC1180 = EnumC1180.BAD_REQUEST;
                    m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120827, "taskId");
                } else {
                    str3 = m50444.f47252;
                    if (TextUtils.isEmpty(str3)) {
                        enumC1180 = EnumC1180.BAD_REQUEST;
                        m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120827, "conflictId");
                    } else {
                        str4 = m50444.f47250;
                        if (TextUtils.equals(str4, "replace") || TextUtils.equals(str4, RadialViewGroup.SKIP_TAG) || TextUtils.equals(str4, "keep_both")) {
                            str5 = m50444.f47253;
                            if (c10645.m26736(str5) == null) {
                                enumC1180 = EnumC1180.NOT_FOUND;
                                m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f12082f, new Object[0]);
                            } else {
                                str6 = m50444.f47253;
                                str7 = m50444.f47252;
                                str8 = m50444.f47250;
                                z = m50444.f47251;
                                z2 = m50444.f47254;
                                this.f72816.m26735(str6, str7, str8, z, z2);
                                str9 = m50444.f47253;
                                LinkedHashMap m267363 = c10645.m26736(str9);
                                if (m267363 != null) {
                                    return C2884.m8817(m267363);
                                }
                                enumC1180 = EnumC1180.NOT_FOUND;
                                m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f12082f, new Object[0]);
                            }
                        } else {
                            enumC1180 = EnumC1180.BAD_REQUEST;
                            m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120826, "action");
                        }
                    }
                }
            } catch (IOException | C15290 | C23344 unused2) {
                enumC1180 = EnumC1180.BAD_REQUEST;
                m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f12082b, new Object[0]);
            }
        } else if (EnumC4003.DELETE.equals(m37807)) {
            String m402342 = C17140.m40234(c15996, "taskId");
            if (TextUtils.isEmpty(m402342)) {
                enumC1180 = EnumC1180.BAD_REQUEST;
                m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120827, "taskId");
            } else if (c10645.m26738(m402342)) {
                LinkedHashMap m267364 = c10645.m26736(m402342);
                if (m267364 != null) {
                    return C2884.m8817(m267364);
                }
                enumC1180 = EnumC1180.NOT_FOUND;
                m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f12082f, new Object[0]);
            } else {
                enumC1180 = EnumC1180.NOT_FOUND;
                m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f12082f, new Object[0]);
            }
        } else {
            enumC1180 = EnumC1180.METHOD_NOT_ALLOWED;
            m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120824, new Object[0]);
        }
        return C2884.m8818(enumC1180, m14306);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8236 m50450(C15996 c15996) {
        EnumC1180 enumC1180;
        String m14306;
        if (!EnumC4003.POST.equals(c15996.m37807())) {
            enumC1180 = EnumC1180.METHOD_NOT_ALLOWED;
            m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120824, new Object[0]);
        } else {
            String m40234 = C17140.m40234(c15996, "taskId");
            if (TextUtils.isEmpty(m40234)) {
                enumC1180 = EnumC1180.BAD_REQUEST;
                m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120827, "taskId");
            } else {
                try {
                    LinkedHashMap m26737 = this.f72816.m26737(m40234);
                    return m26737 == null ? C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector_res_0x7f12082f, new Object[0])) : C2884.m8817(m26737);
                } catch (IOException e) {
                    return m50443(m40234, e);
                }
            }
        }
        return C2884.m8818(enumC1180, m14306);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m50446(C15996 c15996) {
        EnumC1180 enumC1180;
        String m14306;
        if (EnumC4003.POST.equals(c15996.m37807())) {
            String m40234 = C17140.m40234(c15996, "taskId");
            if (TextUtils.isEmpty(m40234)) {
                enumC1180 = EnumC1180.BAD_REQUEST;
                m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120827, "taskId");
            } else {
                String m50442 = m50442(C17140.m40234(c15996, MotionUtils.EASING_TYPE_PATH));
                if (TextUtils.isEmpty(m50442)) {
                    enumC1180 = EnumC1180.BAD_REQUEST;
                    m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f12073e, new Object[0]);
                } else {
                    LinkedHashMap m26733 = this.f72816.m26733(m40234, m50442);
                    if (m26733 != null) {
                        return C2884.m8817(m26733);
                    }
                    enumC1180 = EnumC1180.NOT_FOUND;
                    m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f12082f, new Object[0]);
                }
            }
        } else {
            enumC1180 = EnumC1180.METHOD_NOT_ALLOWED;
            m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120824, new Object[0]);
        }
        return C2884.m8818(enumC1180, m14306);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8236 m50448(C15996 c15996) {
        C8236 m8818;
        EnumC1180 enumC1180;
        String m14306;
        if (EnumC4003.POST.equals(c15996.m37807())) {
            String m40234 = C17140.m40234(c15996, "taskId");
            if (TextUtils.isEmpty(m40234)) {
                enumC1180 = EnumC1180.BAD_REQUEST;
                m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120827, "taskId");
            } else {
                String m50442 = m50442(C17140.m40234(c15996, MotionUtils.EASING_TYPE_PATH));
                if (TextUtils.isEmpty(m50442)) {
                    enumC1180 = EnumC1180.BAD_REQUEST;
                    m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f12073e, new Object[0]);
                } else {
                    String m402342 = C17140.m40234(c15996, "armToken");
                    if (TextUtils.isEmpty(m402342)) {
                        enumC1180 = EnumC1180.BAD_REQUEST;
                        m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120827, "armToken");
                    } else {
                        try {
                            try {
                                LinkedHashMap m26734 = this.f72816.m26734(m40234, m50442, m402342, C17140.m40236(c15996), c15996.m37810());
                                if (m26734 == null) {
                                    C8236 m88182 = C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector_res_0x7f12082f, new Object[0]));
                                    m88182.m21803();
                                    return m88182;
                                }
                                C8236 m8817 = C2884.m8817(m26734);
                                m8817.m21803();
                                return m8817;
                            } catch (IOException e) {
                                m8818 = m50443(m40234, e);
                            } catch (C6264 e2) {
                                m8818 = C2884.m8818(EnumC1180.BAD_REQUEST, e2.getMessage());
                            }
                        } catch (C10791 e3) {
                            m8818 = C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(e3.f32453, e3.f32452));
                        }
                    }
                }
            }
        } else {
            enumC1180 = EnumC1180.METHOD_NOT_ALLOWED;
            m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120824, new Object[0]);
        }
        m8818 = C2884.m8818(enumC1180, m14306);
        m8818.m21803();
        return m8818;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8236 m50447(C15996 c15996) {
        EnumC1180 enumC1180;
        String m14306;
        if (!EnumC4003.POST.equals(c15996.m37807())) {
            enumC1180 = EnumC1180.METHOD_NOT_ALLOWED;
            m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120824, new Object[0]);
        } else {
            String m40234 = C17140.m40234(c15996, "taskId");
            if (TextUtils.isEmpty(m40234)) {
                enumC1180 = EnumC1180.BAD_REQUEST;
                m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120827, "taskId");
            } else {
                LinkedHashMap m26732 = this.f72816.m26732(m40234);
                if (m26732 == null) {
                    enumC1180 = EnumC1180.NOT_FOUND;
                    m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f12082f, new Object[0]);
                } else {
                    return C2884.m8817(m26732);
                }
            }
        }
        return C2884.m8818(enumC1180, m14306);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C21787 m50445(C15996 c15996) {
        ArrayList arrayList;
        JSONObject m17736 = C6411.m17736(c15996);
        C21787 c21787 = new C21787();
        c21787.f69788 = C6411.m17742(m17736, "targetPath");
        try {
            JSONArray jSONArray = m17736.getJSONArray("entries");
            if (jSONArray == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(jSONArray.size());
                for (int i = 0; i < jSONArray.size(); i++) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        C14024 c14024 = new C14024();
                        c14024.f42405 = C6411.m17742(jSONObject, MotionUtils.EASING_TYPE_PATH);
                        c14024.f42408 = C6411.m17742(jSONObject, "type");
                        c14024.f42406 = C6411.m17741(jSONObject, "size");
                        c14024.f42407 = C6411.m17741(jSONObject, "time");
                        c14024.f42409 = C6411.m17740(jSONObject, "topLevel");
                        arrayList2.add(c14024);
                    } catch (RuntimeException e) {
                        throw C6411.m17739(e);
                    }
                }
                arrayList = arrayList2;
            }
            c21787.f69787 = arrayList;
            return c21787;
        } catch (RuntimeException e2) {
            throw C6411.m17739(e2);
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C15435 m50444(C15996 c15996) {
        JSONObject m17736 = C6411.m17736(c15996);
        C15435 c15435 = new C15435();
        c15435.f47253 = C6411.m17742(m17736, "taskId");
        c15435.f47252 = C6411.m17742(m17736, "conflictId");
        c15435.f47250 = C6411.m17742(m17736, "action");
        c15435.f47251 = C6411.m17740(m17736, "applyAll");
        c15435.f47254 = C6411.m17740(m17736, "moveToRecycleBin");
        return c15435;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m50442(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String replace = str.replace('\\', '/');
        while (replace.startsWith("./")) {
            replace = replace.substring(2);
        }
        while (replace.startsWith("/")) {
            replace = replace.substring(1);
        }
        while (true) {
            if (!replace.endsWith("/") || replace.length() <= 1) {
                break;
            }
            replace = C15472.m36561(1, 0, replace);
        }
        if (TextUtils.isEmpty(replace) || ".".equals(replace)) {
            return "";
        }
        for (String str2 : replace.split("/")) {
            if (TextUtils.isEmpty(str2) || ".".equals(str2) || "..".equals(str2)) {
                return "";
            }
        }
        return replace;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C8236 m50443(String str, IOException iOException) {
        LinkedHashMap m26736 = this.f72816.m26736(str);
        if (m26736 != null && Boolean.TRUE.equals(m26736.get("done"))) {
            return C2884.m8817(m26736);
        }
        EnumC1180 enumC1180 = EnumC1180.CONFLICT;
        String message = iOException.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = C4925.m14327(R.string.MT_Protector_res_0x7f12082e);
        }
        return C2884.m8818(enumC1180, message);
    }
}
