package l;

import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;

/* compiled from: R7AS */
/* renamed from: l.ۜᩴۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6949 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23176 f21424;

    public C6949(C2884 c2884, C23176 c23176, C11183 c11183) {
        this.f21424 = c23176;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8236 m18773(C15996 c15996) {
        if (!EnumC4003.GET.equals(c15996.m37807())) {
            return m18770(c15996, EnumC1180.METHOD_NOT_ALLOWED, R.string.MT_Protector_res_0x7f120824, new Object[0]);
        }
        return C2884.m8817(this.f21424.m51394());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m18771(C15996 c15996) {
        String m40231;
        if (!EnumC4003.POST.equals(c15996.m37807())) {
            return m18770(c15996, EnumC1180.METHOD_NOT_ALLOWED, R.string.MT_Protector_res_0x7f120824, new Object[0]);
        }
        C23176 c23176 = this.f21424;
        C10477 m51403 = c23176.m51403(c15996);
        if (m51403 != null) {
            return m18770(c15996, EnumC1180.UNAUTHORIZED, m51403.f31440, m51403.f31438);
        }
        if (!C17140.m40235(c15996) && (m40231 = C17140.m40231(c15996, "content-length")) != null) {
            String trim = m40231.trim();
            if (!trim.isEmpty()) {
                int i = 0;
                while (true) {
                    if (i < trim.length()) {
                        char charAt = trim.charAt(i);
                        if (charAt < '0' || charAt > '9') {
                            break;
                        }
                        i++;
                    } else {
                        try {
                            if (Long.parseLong(trim) <= 8192) {
                                try {
                                    C10477 m51391 = c23176.m51391(c15996, C17140.m40239(c15996));
                                    Object[] objArr = m51391.f31438;
                                    int i2 = m51391.f31440;
                                    String str = m51391.f31437;
                                    if (!m51391.f31439) {
                                        if (str.isEmpty()) {
                                            return C2884.m8818(EnumC1180.UNAUTHORIZED, C4925.m14306(i2, objArr));
                                        }
                                        return AbstractC4708.m13784(EnumC1180.UNAUTHORIZED, "application/json", new JSONObject().add(d.O, C4925.m14306(i2, objArr)).add("code", str).toString());
                                    }
                                    return C2884.m8817(Collections.singletonMap("deviceId", m51391.f31436));
                                } catch (IOException | C15290 unused) {
                                    c23176.m51401(c15996);
                                    return m18770(c15996, EnumC1180.BAD_REQUEST, R.string.MT_Protector_res_0x7f120813, new Object[0]);
                                }
                            }
                        } catch (NumberFormatException unused2) {
                        }
                    }
                }
            }
        }
        c23176.m51401(c15996);
        return m18770(c15996, EnumC1180.BAD_REQUEST, R.string.MT_Protector_res_0x7f120813, new Object[0]);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C8236 m18770(C15996 c15996, EnumC1180 enumC1180, int i, Object... objArr) {
        C8236 m8818 = C2884.m8818(enumC1180, C4925.m14306(i, objArr));
        if (C17140.m40237(c15996)) {
            m8818.m21803();
        }
        return m8818;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8236 m18776(C15996 c15996, C15414 c15414) {
        if (!EnumC4003.GET.equals(c15996.m37807())) {
            return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector_res_0x7f120824, new Object[0]));
        }
        return C2884.m8817(this.f21424.m51388(c15414));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8236 m18775(C15996 c15996, C15414 c15414) {
        if (!EnumC4003.DELETE.equals(c15996.m37807())) {
            return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector_res_0x7f120824, new Object[0]));
        }
        String m40234 = C17140.m40234(c15996, "deviceId");
        if (m40234 == null || m40234.isEmpty()) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120827, "deviceId"));
        }
        return C2884.m8817(Collections.singletonMap("deleted", Boolean.valueOf(this.f21424.m51397(c15414, m40234))));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8236 m18774(C15996 c15996, C15414 c15414) {
        EnumC1180 enumC1180;
        String m14306;
        if (!EnumC4003.POST.equals(c15996.m37807())) {
            enumC1180 = EnumC1180.METHOD_NOT_ALLOWED;
            m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120824, new Object[0]);
        } else {
            try {
                LinkedHashMap m51389 = this.f21424.m51389(c15414, C17140.m40239(c15996));
                if (m51389 == null) {
                    enumC1180 = EnumC1180.BAD_REQUEST;
                    m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f12080e, new Object[0]);
                } else {
                    return C2884.m8817(m51389);
                }
            } catch (IOException | C15290 unused) {
                enumC1180 = EnumC1180.BAD_REQUEST;
                m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f12080e, new Object[0]);
            }
        }
        return C2884.m8818(enumC1180, m14306);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m18772(C15996 c15996, C15414 c15414) {
        EnumC1180 enumC1180;
        String m14306;
        if (!EnumC4003.POST.equals(c15996.m37807())) {
            enumC1180 = EnumC1180.METHOD_NOT_ALLOWED;
            m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120824, new Object[0]);
        } else {
            try {
                LinkedHashMap m51390 = this.f21424.m51390(c15414, C11183.m27733(C17140.m40239(c15996)));
                if (m51390 == null) {
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f12080c, new Object[0]));
                }
                return C2884.m8817(m51390);
            } catch (IOException | C15290 | C22743 unused) {
                enumC1180 = EnumC1180.BAD_REQUEST;
                m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f12080c, new Object[0]);
            }
        }
        return C2884.m8818(enumC1180, m14306);
    }
}
