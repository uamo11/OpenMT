package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.o;

/* compiled from: QAWL */
/* renamed from: l.ᩴ᩶ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18985 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int m43818(String str) {
        C11233.m27805(str, ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR);
        if (!str.startsWith("#")) {
            throw new IllegalArgumentException("Invalid color value ".concat(str).toString());
        }
        int length = str.length();
        if (length == 4) {
            String substring = str.substring(1);
            C11233.m27803(substring, "substring(...)");
            int m15859 = C5579.m15859(substring);
            return ((m15859 & 15) * 17) | (((m15859 >> 8) & 15) * 1114112) | (((m15859 >> 4) & 15) * o.a.k) | (-16777216);
        }
        if (length == 5) {
            String substring2 = str.substring(1);
            C11233.m27803(substring2, "substring(...)");
            int m158592 = C5579.m15859(substring2);
            return ((m158592 & 15) * 17) | (((m158592 >> 12) & 15) * 285212672) | (((m158592 >> 8) & 15) * 1114112) | (((m158592 >> 4) & 15) * o.a.k) | (-16777216);
        }
        if (length == 7) {
            String substring3 = str.substring(1);
            C11233.m27803(substring3, "substring(...)");
            return C5579.m15859(substring3) | (-16777216);
        }
        if (length != 9) {
            return -16777216;
        }
        String substring4 = str.substring(1);
        C11233.m27803(substring4, "substring(...)");
        return C5579.m15859(substring4);
    }
}
