package l;

import com.alipay.sdk.m.u0.b;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: G7AI */
/* renamed from: l.ᩳᩳۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18214 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14587 f56606;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashSet f56607;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18878 f56608;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f56609;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13232 f56610;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C23942 f56611;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23528 f56612;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C11138 f56613;

    public C18214(C18878 c18878, C23528 c23528, String str, C13232 c13232, HashSet hashSet, C11138 c11138) {
        this.f56608 = c18878;
        this.f56606 = c18878.f59510;
        this.f56612 = c23528;
        this.f56609 = str;
        this.f56610 = c13232;
        this.f56607 = hashSet;
        this.f56613 = c11138;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42437(InterfaceC7099 interfaceC7099, InterfaceC21211 interfaceC21211) {
        boolean m23329;
        C0532 m23320;
        C11159 m23306;
        String str;
        String str2;
        String str3;
        C9748 c9748;
        C11159 c11159;
        C11159 m233062;
        String m8426 = C2692.m8426(interfaceC7099);
        m23329 = C9042.m23329(interfaceC21211);
        C9748 c97482 = null;
        HashSet hashSet = this.f56607;
        C18878 c18878 = this.f56608;
        String str4 = this.f56609;
        if (m23329) {
            m233062 = C9042.m23306(c18878, interfaceC21211.getValue(0), null, null, m8426, 0, 0, hashSet, null, null);
            String str5 = m233062.f33491;
            String str6 = m233062.f33502;
            if (!"resource_table_file_path".equals(str4)) {
                C9748 m42435 = "file_path".equals(str6) ? m42435(str5, "file_path", null) : null;
                if (m42435 == null && m233062.f33504) {
                    m42435 = m42435(str5, "styledText", null);
                }
                c97482 = m42435;
                if (c97482 == null) {
                    c97482 = m42435(str5, b.d, null);
                }
            } else if ("file_path".equals(str6)) {
                c97482 = m42435(str5, "file_path", null);
            }
            return m42436(m233062, c97482);
        }
        ArrayList arrayList = new ArrayList();
        int mo29409 = interfaceC21211.mo29409();
        C11159 c111592 = r5;
        String str7 = "file_path";
        String str8 = "resource_table_file_path";
        String str9 = str4;
        String str10 = "styledText";
        String str11 = b.d;
        C11159 c111593 = new C11159(null, null, m8426, "item_list", false, false, null, null, null, null, null, arrayList, false, mo29409, null);
        for (InterfaceC1454 interfaceC1454 : interfaceC21211.values()) {
            m23320 = C9042.m23320(this.f56606, interfaceC7099, interfaceC1454.mo5006());
            m23306 = C9042.m23306(c18878, interfaceC1454, m23320.f2194, m23320.f2195, m8426, 0, 0, hashSet, null, null);
            String str12 = m23306.f33491;
            String str13 = m23306.f33502;
            String str14 = str8;
            String str15 = str9;
            if (!str14.equals(str15)) {
                str = str7;
                C9748 m424352 = str.equals(str13) ? m42435(str12, str, m23306) : null;
                if (m424352 == null && m23306.f33504) {
                    str2 = str10;
                    m424352 = m42435(str12, str2, m23306);
                } else {
                    str2 = str10;
                }
                if (m424352 == null) {
                    str3 = str11;
                    c9748 = m42435(str12, str3, m23306);
                } else {
                    str3 = str11;
                    c9748 = m424352;
                }
                c11159 = c111592;
            } else {
                str = str7;
                c9748 = str.equals(str13) ? m42435(str12, str, m23306) : null;
                c11159 = c111592;
                str2 = str10;
                str3 = str11;
            }
            if (m42436(c11159, c9748)) {
                return true;
            }
            c111592 = c11159;
            str9 = str15;
            str8 = str14;
            str7 = str;
            str10 = str2;
            str11 = str3;
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C9748 m42435(String str, String str2, C11159 c11159) {
        C1965 m27623;
        if (str == null || str.isEmpty() || (m27623 = this.f56613.m27623(str, "resource_table_value")) == null) {
            return null;
        }
        return new C9748(str, m27623, str2, c11159);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m42436(C11159 c11159, C9748 c9748) {
        String str;
        C1965 c1965;
        int i;
        if (c9748 == null) {
            return false;
        }
        String str2 = c9748.f29512;
        C1965 c19652 = c9748.f29511;
        int i2 = c19652.f6591;
        String str3 = c9748.f29513;
        C23528 c23528 = this.f56612;
        if (!c23528.f75549 || (i = c23528.f75546) <= 0 || i2 < 0) {
            str = null;
        } else {
            int min = Math.min(i, 300);
            str = C8163.m21635(C8163.m21642(i2, -Math.max(0, min / 3), str3), str3.length(), min, str3).replace('\n', ' ');
        }
        C16802 m39536 = C16802.m39536(c11159, c9748.f29510, str2, str);
        if (c23528.f75541) {
            c19652.m6475();
            c1965 = c19652;
        } else {
            c1965 = null;
        }
        this.f56611 = new C23942("resource", this.f56609, str2, c1965, null, this.f56610, m39536, null, null, null);
        return true;
    }
}
