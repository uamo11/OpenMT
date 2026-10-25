package l;

import android.text.TextUtils;

/* compiled from: T7AP */
/* renamed from: l.ۘۚۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3735 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String f11801;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 f11802;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int f11803;

    static {
        m11351();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m11349() {
        return f11802;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m11350() {
        return f11803;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m11346() {
        return f11801;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m11351() {
        String string = ApplicationC20075.f65008.getString("rwmip", null);
        if (TextUtils.isEmpty(string)) {
            f11802 = C16293.f50120;
        } else {
            AbstractC15440 m39866 = C16999.m39866(string, new String[0]);
            if (!m39866.mo23113()) {
                m39866 = C16293.f50120;
            }
            f11802 = m39866;
        }
        int i = ApplicationC20075.f65008.getInt("rwmp", 8081);
        f11803 = C21311.m48347(i) ? i : 8081;
        String string2 = ApplicationC20075.f65008.getString("rwmpc", "");
        String trim = string2 == null ? "" : string2.trim();
        f11801 = m11348(trim) ? trim : "";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11347(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            f11802 = C16293.f50120;
        } else {
            AbstractC15440 m39866 = C16999.m39866(str, new String[0]);
            if (!m39866.mo23113()) {
                m39866 = C16293.f50120;
            }
            f11802 = m39866;
        }
        Integer m48346 = C21311.m48346(str2);
        if (m48346 != null) {
            f11803 = m48346.intValue();
        }
        String trim = str3 == null ? "" : str3.trim();
        if (m11348(trim)) {
            f11801 = trim;
        }
        ApplicationC20075.f65008.edit().putString("rwmip", f11802.mo23554()).mo25853(f11803, "rwmp").putString("rwmpc", f11801).apply();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m11348(String str) {
        int i;
        String trim = str == null ? "" : str.trim();
        if (TextUtils.isEmpty(trim)) {
            return true;
        }
        if (trim.length() == 6) {
            while (i < trim.length()) {
                char charAt = trim.charAt(i);
                i = (charAt >= '0' && charAt <= '9') ? i + 1 : 0;
            }
            return true;
        }
        return false;
    }
}
