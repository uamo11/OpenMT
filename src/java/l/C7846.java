package l;

import java.util.HashMap;

/* compiled from: KB7N */
/* renamed from: l.۠֨ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7846 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f24333;

    static {
        HashMap hashMap = new HashMap(13);
        f24333 = hashMap;
        hashMap.put("normal", 400);
        hashMap.put("bold", 700);
        C12354.m29971(1, hashMap, "bolder", -1, "lighter");
        C12354.m29971(100, hashMap, "100", 200, "200");
        hashMap.put("300", 300);
        hashMap.put("400", 400);
        C12354.m29971(500, hashMap, "500", 600, "600");
        C15942.m37720(hashMap, "700", 700, 800, "800");
        hashMap.put("900", Integer.valueOf(EnumC3478.f11019));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Integer m21029(String str) {
        return (Integer) f24333.get(str);
    }
}
