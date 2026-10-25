package l;

/* compiled from: D445 */
/* renamed from: l.᩹ۡ۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum EnumC22180 {
    SIMPLE,
    BY_FILE,
    BY_TODO;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC22180 m49823(String str) {
        EnumC22180 enumC22180;
        EnumC22180 enumC221802;
        if (str == null) {
            enumC221802 = C4541.f14425;
            return enumC221802;
        }
        if (str.equals("simple")) {
            return SIMPLE;
        }
        if (str.equals("byfile")) {
            return BY_FILE;
        }
        if (str.equals("bytodo")) {
            return BY_TODO;
        }
        enumC22180 = C4541.f14425;
        return enumC22180;
    }
}
