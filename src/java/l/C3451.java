package l;

import java.util.Locale;

/* compiled from: 6AY4 */
/* renamed from: l.ۗ᩵᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3451 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String m10553(String str) {
        int i = ViewOnClickListenerC19121.f60235;
        int m9241 = C3016.m9241(str);
        if (m9241 == -1) {
            return ".";
        }
        String substring = str.substring(m9241 + 1);
        C11233.m27803(substring, "substring(...)");
        String lowerCase = substring.toLowerCase(Locale.ROOT);
        C11233.m27803(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
