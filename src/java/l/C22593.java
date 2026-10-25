package l;

import java.util.HashMap;

/* compiled from: I7D8 */
/* renamed from: l.᩹᩺ۚ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22593 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f73024 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f73025 = new HashMap(301);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final HashMap f73026 = new HashMap(301);

    static {
        Integer num;
        String str;
        String str2;
        String str3;
        for (EnumC15536 enumC15536 : EnumC15536.values()) {
            HashMap hashMap = f73025;
            num = enumC15536.f47842;
            hashMap.put(num, enumC15536);
            HashMap hashMap2 = f73026;
            str = enumC15536.f47844;
            hashMap2.put(str, enumC15536);
            str2 = enumC15536.f47845;
            if (str2 != null) {
                str3 = enumC15536.f47845;
                hashMap2.put(str3, enumC15536);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC15536 m50570(String str) {
        return (EnumC15536) f73026.get(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC15536 m50569(Integer num) {
        return (EnumC15536) f73025.get(num);
    }
}
