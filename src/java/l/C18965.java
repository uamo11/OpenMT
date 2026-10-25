package l;

import android.text.TextUtils;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: L7BP */
/* renamed from: l.ᩴ᩵ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18965 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8381 f59819;

    public C18965(C2884 c2884, C8381 c8381) {
        this.f59819 = c8381;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m43786(C15996 c15996) {
        EnumC1180 enumC1180;
        String m14306;
        EnumC4003 m37807 = c15996.m37807();
        boolean equals = EnumC4003.POST.equals(m37807);
        C8381 c8381 = this.f59819;
        if (!equals) {
            if (EnumC4003.GET.equals(m37807)) {
                String m40234 = C17140.m40234(c15996, "taskId");
                if (TextUtils.isEmpty(m40234)) {
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120827, "taskId"));
                }
                LinkedHashMap m21988 = c8381.m21988(m40234);
                return m21988 == null ? C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector_res_0x7f12082f, new Object[0])) : C2884.m8817(m21988);
            }
            if (!EnumC4003.PUT.equals(m37807)) {
                if (!EnumC4003.DELETE.equals(m37807)) {
                    return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector_res_0x7f120824, new Object[0]));
                }
                String m402342 = C17140.m40234(c15996, "taskId");
                if (TextUtils.isEmpty(m402342)) {
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120827, "taskId"));
                }
                if (!c8381.m21989(m402342)) {
                    return C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector_res_0x7f12082f, new Object[0]));
                }
                LinkedHashMap m219882 = c8381.m21988(m402342);
                return m219882 == null ? C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector_res_0x7f12082f, new Object[0])) : C2884.m8817(m219882);
            }
            try {
                C2737 m43783 = m43783(c15996);
                if (TextUtils.isEmpty(m43783.f8527)) {
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120827, "taskId"));
                }
                if (TextUtils.isEmpty(m43783.f8526)) {
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120827, "conflictId"));
                }
                if (C18891.m43612(m43783.f8524) == -1) {
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120826, "action"));
                }
                if (c8381.m21988(m43783.f8527) == null) {
                    return C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector_res_0x7f12082f, new Object[0]));
                }
                if (!this.f59819.m21987(m43783.f8527, m43783.f8526, m43783.f8524, m43783.f8525, m43783.f8528)) {
                    return C2884.m8818(EnumC1180.CONFLICT, C4925.m14306(R.string.MT_Protector_res_0x7f12081d, new Object[0]));
                }
                LinkedHashMap m219883 = c8381.m21988(m43783.f8527);
                return m219883 == null ? C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector_res_0x7f12082f, new Object[0])) : C2884.m8817(m219883);
            } catch (IOException | C15290 | C23344 unused) {
                return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f12082b, new Object[0]));
            }
        }
        try {
            C4148 m43785 = m43785(c15996);
            List list = m43785.f13548;
            if (list == null || list.isEmpty()) {
                return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120827, "paths"));
            }
            if (!"copy".equals(m43785.f13549) && !"move".equals(m43785.f13549) && !"delete".equals(m43785.f13549)) {
                return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120826, "type"));
            }
            if (!"delete".equals(m43785.f13549) && TextUtils.isEmpty(m43785.f13551)) {
                return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120827, "targetPath"));
            }
            String str = "";
            if (!"delete".equals(m43785.f13549)) {
                String str2 = m43785.f13552;
                List list2 = m43785.f13548;
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    String str3 = "";
                    while (true) {
                        if (it.hasNext()) {
                            String m43780 = m43780(m43784((String) it.next()));
                            if (TextUtils.isEmpty(str3)) {
                                str3 = m43780;
                            } else if (!str3.equals(m43780)) {
                                break;
                            }
                        } else {
                            String m43782 = m43782(str2);
                            if (TextUtils.isEmpty(m43782)) {
                                str = str3;
                            } else if (m43782.equals(str3)) {
                                str = m43782;
                            }
                        }
                    }
                }
            }
            if (!"delete".equals(m43785.f13549) && TextUtils.isEmpty(str)) {
                return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120826, "sourcePath"));
            }
            ArrayList arrayList = new ArrayList(m43785.f13548.size());
            Iterator it2 = m43785.f13548.iterator();
            while (it2.hasNext()) {
                try {
                    InterfaceC17889 m33351 = C2499.f7958.m33351((String) it2.next());
                    if (!"delete".equals(m43785.f13549) && !str.equals(m43782(((C15688) m33351).getParent()))) {
                        return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f12082a, new Object[0]));
                    }
                    arrayList.add(m33351);
                } catch (IOException unused2) {
                    enumC1180 = EnumC1180.NOT_FOUND;
                    m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120822, new Object[0]);
                    return C2884.m8818(enumC1180, m14306);
                }
            }
            if ("delete".equals(m43785.f13549)) {
                if (m43785.f13547) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        InterfaceC17889 interfaceC17889 = (InterfaceC17889) it3.next();
                        if (!m43781(interfaceC17889.mo24433())) {
                            return C2884.m8818(EnumC1180.CONFLICT, C4925.m14306(R.string.MT_Protector_res_0x7f120642, interfaceC17889.getName()));
                        }
                    }
                }
                String m21981 = c8381.m21981(m43785.f13549);
                int i = C15104.f46193;
                C0994 c0994 = new C0994(C4074.class);
                c0994.m3477("ARG_PATHS", (String[]) m43785.f13548.toArray(new String[0]));
                c0994.m3474("deleteFrom", C4925.m14327(R.string.MT_Protector_res_0x7f12084e));
                c0994.m3475("recycle", m43785.f13547);
                c0994.m3475("speedMode", false);
                c0994.m3470(m43785.f13548.size(), "minTotal");
                c0994.m3474("remoteTaskId", m21981);
                c8381.m21982(c0994.m3482(), m21981);
                LinkedHashMap m219884 = c8381.m21988(m21981);
                return m219884 == null ? C2884.m8818(EnumC1180.INTERNAL_ERROR, C4925.m14306(R.string.MT_Protector_res_0x7f12082f, new Object[0])) : C2884.m8817(m219884);
            }
            String m437822 = m43782(m43785.f13551);
            if ("copy".equals(m43785.f13549) && str.equals(m437822)) {
                if (arrayList.size() != 1) {
                    return C2884.m8818(EnumC1180.CONFLICT, C4925.m14327(R.string.MT_Protector_res_0x7f120aa9));
                }
                if (TextUtils.isEmpty(m43785.f13550)) {
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120827, "replacedName"));
                }
                if (m43785.f13550.contains("/") || m43785.f13550.contains("\\")) {
                    return C2884.m8818(EnumC1180.CONFLICT, C4925.m14327(R.string.MT_Protector_res_0x7f1203ae));
                }
                if (C16999.m39866(C9523.m24393(m437822, m43785.f13550), new String[0]).mo23120()) {
                    return C2884.m8818(EnumC1180.CONFLICT, C4925.m14327(R.string.MT_Protector_res_0x7f1203a1));
                }
            }
            if ("move".equals(m43785.f13549)) {
                if (str.equals(m437822)) {
                    return C2884.m8818(EnumC1180.CONFLICT, C4925.m14327(R.string.MT_Protector_res_0x7f120aaa));
                }
                AbstractC15440 m39866 = C16999.m39866(m437822, new String[0]);
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    InterfaceC17889 interfaceC178892 = (InterfaceC17889) it4.next();
                    if (interfaceC178892.isDirectory() && m39866.m36504(interfaceC178892.mo24433())) {
                        return C2884.m8818(EnumC1180.CONFLICT, C4925.m14306(R.string.MT_Protector_res_0x7f120617, interfaceC178892.getName()));
                    }
                }
            }
            String m219812 = c8381.m21981(m43785.f13549);
            Class cls = "copy".equals(m43785.f13549) ? C9013.class : C19597.class;
            int i2 = C15104.f46193;
            C0994 c09942 = new C0994(cls);
            c09942.m3477("ARG_PATHS", (String[]) m43785.f13548.toArray(new String[0]));
            c09942.m3474("sourcePath", str);
            c09942.m3474("targetPath", m437822);
            c09942.m3474("remoteTaskId", m219812);
            if (!TextUtils.isEmpty(m43785.f13550)) {
                c09942.m3474("replacedName", m43785.f13550);
            }
            c8381.m21982(c09942.m3482(), m219812);
            LinkedHashMap m219885 = c8381.m21988(m219812);
            return m219885 == null ? C2884.m8818(EnumC1180.INTERNAL_ERROR, C4925.m14306(R.string.MT_Protector_res_0x7f12082f, new Object[0])) : C2884.m8817(m219885);
        } catch (IOException | C15290 | C23344 unused3) {
            enumC1180 = EnumC1180.BAD_REQUEST;
            m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f12082b, new Object[0]);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C4148 m43785(C15996 c15996) {
        JSONObject m17736 = C6411.m17736(c15996);
        C4148 c4148 = new C4148();
        c4148.f13548 = Collections.EMPTY_LIST;
        c4148.f13549 = C6411.m17742(m17736, "type");
        c4148.f13552 = C6411.m17742(m17736, "sourcePath");
        c4148.f13551 = C6411.m17742(m17736, "targetPath");
        c4148.f13550 = C6411.m17742(m17736, "replacedName");
        c4148.f13547 = C6411.m17740(m17736, "moveToRecycleBin");
        c4148.f13548 = C6411.m17738(m17736);
        return c4148;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C2737 m43783(C15996 c15996) {
        JSONObject m17736 = C6411.m17736(c15996);
        C2737 c2737 = new C2737();
        c2737.f8527 = C6411.m17742(m17736, "taskId");
        c2737.f8526 = C6411.m17742(m17736, "conflictId");
        c2737.f8524 = C6411.m17742(m17736, "action");
        c2737.f8525 = C6411.m17740(m17736, "applyAll");
        c2737.f8528 = C6411.m17740(m17736, "moveToRecycleBin");
        return c2737;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m43781(AbstractC15440 abstractC15440) {
        return abstractC15440 != null && C21939.m49417() && abstractC15440.mo29016();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m43784(String str) {
        return TextUtils.isEmpty(str) ? "" : m43782(AbstractC16891.m39731(str));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m43782(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String m39731 = AbstractC16891.m39731(str);
        if ("/".equals(m39731)) {
            return "/";
        }
        while (m39731.length() > 1 && m39731.endsWith("/")) {
            m39731 = C15472.m36561(1, 0, m39731);
        }
        return m39731;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43780(String str) {
        int lastIndexOf;
        return (TextUtils.isEmpty(str) || "/".equals(str) || (lastIndexOf = str.lastIndexOf(47)) <= 0) ? "/" : str.substring(0, lastIndexOf);
    }
}
