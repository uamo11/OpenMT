package l;

import java.util.HashMap;

/* compiled from: KB7N */
/* renamed from: l.֡֨ܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0084 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f1018;

    static {
        HashMap hashMap = new HashMap(10);
        f1018 = hashMap;
        hashMap.put("none", EnumC1475.none);
        hashMap.put("xMinYMin", EnumC1475.xMinYMin);
        hashMap.put("xMidYMin", EnumC1475.xMidYMin);
        hashMap.put("xMaxYMin", EnumC1475.xMaxYMin);
        hashMap.put("xMinYMid", EnumC1475.xMinYMid);
        hashMap.put("xMidYMid", EnumC1475.xMidYMid);
        hashMap.put("xMaxYMid", EnumC1475.xMaxYMid);
        hashMap.put("xMinYMax", EnumC1475.xMinYMax);
        hashMap.put("xMidYMax", EnumC1475.xMidYMax);
        hashMap.put("xMaxYMax", EnumC1475.xMaxYMax);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC1475 m1044(String str) {
        return (EnumC1475) f1018.get(str);
    }
}
