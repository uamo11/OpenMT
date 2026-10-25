package l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: M45G */
/* renamed from: l.ۙ֫ܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4341 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12807 m13040(String str) {
        if (str != null && !C3016.m9242((CharSequence) str)) {
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (matcher.matches()) {
                String group = matcher.group(1);
                Integer valueOf = group == null ? null : Integer.valueOf(Integer.parseInt(group));
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    String group2 = matcher.group(2);
                    Integer valueOf2 = group2 == null ? null : Integer.valueOf(Integer.parseInt(group2));
                    if (valueOf2 != null) {
                        int intValue2 = valueOf2.intValue();
                        String group3 = matcher.group(3);
                        Integer valueOf3 = group3 == null ? null : Integer.valueOf(Integer.parseInt(group3));
                        if (valueOf3 != null) {
                            int intValue3 = valueOf3.intValue();
                            String group4 = matcher.group(4) != null ? matcher.group(4) : "";
                            C11233.m27803(group4, "description");
                            return new C12807(group4, intValue, intValue2, intValue3, 0);
                        }
                    }
                }
            }
        }
        return null;
    }
}
