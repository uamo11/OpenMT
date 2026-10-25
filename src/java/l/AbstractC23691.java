package l;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;

/* compiled from: T90P */
/* renamed from: l.᩻۫ۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC23691 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Map f76727;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52237(String str) {
        return f76727.containsKey(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m52236(String str, int[] iArr) {
        String str2 = (String) f76727.get(str);
        if (str2 == null) {
            return 0;
        }
        int length = str2.length();
        if (length == 1) {
            iArr[0] = str2.charAt(0);
            return length;
        }
        iArr[0] = str2.charAt(0);
        iArr[1] = str2.charAt(1);
        return length;
    }

    static {
        Map map;
        try {
            Field declaredField = C9931.class.getDeclaredField("֫");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(null);
        } catch (Throwable unused) {
            map = Collections.EMPTY_MAP;
        }
        f76727 = map;
    }
}
