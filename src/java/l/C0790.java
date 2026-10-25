package l;

import java.util.HashMap;

/* compiled from: KB7N */
/* renamed from: l.֨֨ܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0790 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f2904;

    static {
        HashMap hashMap = new HashMap(9);
        f2904 = hashMap;
        EnumC7265 enumC7265 = EnumC7265.pt;
        hashMap.put("xx-small", new C0769(0.694f, enumC7265));
        hashMap.put("x-small", new C0769(0.833f, enumC7265));
        hashMap.put("small", new C0769(10.0f, enumC7265));
        hashMap.put("medium", new C0769(12.0f, enumC7265));
        hashMap.put("large", new C0769(14.4f, enumC7265));
        hashMap.put("x-large", new C0769(17.3f, enumC7265));
        hashMap.put("xx-large", new C0769(20.7f, enumC7265));
        EnumC7265 enumC72652 = EnumC7265.percent;
        hashMap.put("smaller", new C0769(83.33f, enumC72652));
        hashMap.put("larger", new C0769(120.0f, enumC72652));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0769 m2994(String str) {
        return (C0769) f2904.get(str);
    }
}
