package l;

import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: 07BN */
/* renamed from: l.ᩳ᩵ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18259 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m42595(C15996 c15996) {
        String str;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        AbstractC15440 m39866;
        Boolean bool2;
        boolean z;
        Boolean bool3;
        String str10;
        String str11;
        int i = 0;
        if (!EnumC4003.POST.equals(c15996.m37807())) {
            return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector_res_0x7f120824, new Object[0]));
        }
        try {
            C16847 m42594 = m42594(c15996);
            str = m42594.f51710;
            if (str != null) {
                str2 = m42594.f51710;
                if (!str2.isEmpty()) {
                    str3 = m42594.f51709;
                    if (str3 != null) {
                        str4 = m42594.f51709;
                        if (!str4.isEmpty()) {
                            bool = m42594.f51708;
                            if (bool == null) {
                                return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120827, "isDirectory"));
                            }
                            str5 = m42594.f51709;
                            if (!str5.contains("\\")) {
                                str6 = m42594.f51709;
                                if (!"/".equals(str6)) {
                                    str7 = m42594.f51710;
                                    String m39731 = AbstractC16891.m39731(str7);
                                    try {
                                        C17721.m41503(m39731, EnumC16309.MODIFY_DIRECTORY_LINKED);
                                        str8 = m42594.f51709;
                                        if (str8.startsWith("/")) {
                                            str11 = m42594.f51709;
                                            m39866 = C16999.m39866(str11, new String[0]);
                                        } else {
                                            str9 = m42594.f51709;
                                            m39866 = C16999.m39866(m39731, str9);
                                        }
                                        if (m39866.mo23120()) {
                                            return C2884.m8818(EnumC1180.CONFLICT, C4925.m14327(m39866.mo23113() ? R.string.MT_Protector_res_0x7f1203fc : R.string.MT_Protector_res_0x7f1203a1));
                                        }
                                        bool2 = m42594.f51708;
                                        if (bool2.booleanValue()) {
                                            z = m39866.mo23546();
                                        } else {
                                            AbstractC15440 m36536 = m39866.m36536();
                                            z = (m36536 == null || m36536.mo23120() || m36536.mo23546()) && m39866.mo23545();
                                        }
                                        if (z) {
                                            RunnableC9940 runnableC9940 = new RunnableC9940(i, m39866);
                                            if (C10975.m27285()) {
                                                runnableC9940.run();
                                            } else {
                                                C4925.m14315(runnableC9940);
                                            }
                                            HashMap hashMap = new HashMap();
                                            hashMap.put("item", C21082.m47981(new C9555(m39866)));
                                            hashMap.put("parentPath", m39866.getParent());
                                            return C2884.m8817(hashMap);
                                        }
                                        RunnableC15608 runnableC15608 = new RunnableC15608(0);
                                        if (C10975.m27285()) {
                                            C15528.m36596();
                                        } else {
                                            C4925.m14315(runnableC15608);
                                        }
                                        EnumC1180 enumC1180 = EnumC1180.INTERNAL_ERROR;
                                        bool3 = m42594.f51708;
                                        int i2 = bool3.booleanValue() ? R.string.MT_Protector_res_0x7f120821 : R.string.MT_Protector_res_0x7f120820;
                                        str10 = m42594.f51709;
                                        return C2884.m8818(enumC1180, C4925.m14306(i2, str10));
                                    } catch (C1637 e) {
                                        return C2884.m8818(EnumC1180.CONFLICT, e.getMessage());
                                    }
                                }
                            }
                            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14327(R.string.MT_Protector_res_0x7f1203ae));
                        }
                    }
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120827, "name"));
                }
            }
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120827, "targetPath"));
        } catch (IOException | RuntimeException | C15290 unused) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f12082b, new Object[0]));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C16847 m42594(C15996 c15996) {
        JSONObject m17736 = C6411.m17736(c15996);
        C16847 c16847 = new C16847();
        c16847.f51710 = C6411.m17742(m17736, "targetPath");
        c16847.f51709 = C6411.m17742(m17736, "name");
        c16847.f51708 = (m17736.get("isDirectory") == null || m17736.get("isDirectory").isNull()) ? null : Boolean.valueOf(C6411.m17740(m17736, "isDirectory"));
        return c16847;
    }
}
