package l;

import com.alipay.sdk.m.y.l;
import java.util.Comparator;

/* compiled from: R78M */
/* renamed from: l.ᩳ᩺᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18373 {
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m42807(String str) {
        if (str.startsWith("L") && str.endsWith(l.b)) {
            return str;
        }
        return "L" + str.replace('.', '/') + l.b;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m42806(String str) {
        return (str.startsWith("L") && str.endsWith(l.b)) ? str.substring(1, str.length() - 1).replace('/', '.') : str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m42804(String str) {
        if ("classes.dex".equals(str)) {
            return 1;
        }
        if (str != null && str.indexOf(47) < 0 && str.startsWith("classes") && str.endsWith(".dex")) {
            String m36561 = C15472.m36561(4, 7, str);
            if (!m36561.isEmpty() && m36561.charAt(0) != '0') {
                try {
                    int parseInt = Integer.parseInt(m36561);
                    if (parseInt >= 2) {
                        return parseInt;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Comparator m42805() {
        return C15254.thenComparing(C8200.comparingInt(new C2145()), new C14970());
    }
}
