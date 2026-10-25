package l;

import java.util.HashMap;

/* compiled from: R7EK */
/* renamed from: l.ᩳۤۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17987 {

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final HashMap f56100 = new HashMap(9);

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final HashMap f56094 = new HashMap(9);

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final HashMap f56098 = new HashMap(10);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final HashMap f56097 = new HashMap(10);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f56093 = new HashMap(10);

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final HashMap f56096 = new HashMap(20);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f56095 = new HashMap(20);

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final HashMap f56099 = new HashMap(20);

    static {
        String str;
        String str2;
        Integer num;
        String str3;
        Integer num2;
        String str4;
        boolean z;
        int i;
        int i2;
        String str5;
        for (EnumC10932 enumC10932 : EnumC10932.values()) {
            HashMap hashMap = f56096;
            str4 = enumC10932.f32951;
            hashMap.put(str4, enumC10932);
            z = enumC10932.f32953;
            if (z) {
                HashMap hashMap2 = f56095;
                str5 = enumC10932.f32951;
                hashMap2.put(str5, enumC10932);
            }
            HashMap hashMap3 = f56099;
            i = enumC10932.f32949;
            if (!hashMap3.containsKey(Integer.valueOf(i))) {
                i2 = enumC10932.f32949;
                hashMap3.put(Integer.valueOf(i2), enumC10932);
            }
        }
        for (EnumC16575 enumC16575 : EnumC16575.values()) {
            HashMap hashMap4 = f56100;
            str3 = enumC16575.f50967;
            hashMap4.put(str3, enumC16575);
            HashMap hashMap5 = f56094;
            num2 = enumC16575.f50968;
            hashMap5.put(num2, enumC16575);
        }
        for (EnumC1759 enumC1759 : EnumC1759.values()) {
            HashMap hashMap6 = f56098;
            str2 = enumC1759.f6107;
            hashMap6.put(str2, enumC1759);
            HashMap hashMap7 = f56097;
            num = enumC1759.f6108;
            hashMap7.put(num, enumC1759);
        }
        for (EnumC7464 enumC7464 : EnumC7464.values()) {
            HashMap hashMap8 = f56093;
            str = enumC7464.f22985;
            hashMap8.put(Character.valueOf(str.charAt(0)), enumC7464);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC10932 m42030(int i) {
        EnumC10932 enumC10932 = (EnumC10932) f56099.get(Integer.valueOf(i));
        return enumC10932 == null ? EnumC10932.f32931 : enumC10932;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static EnumC10932 m42035(String str) {
        return (EnumC10932) f56096.get(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC10932 m42031(String str) {
        return (EnumC10932) f56095.get(str);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static EnumC16575 m42034(String str) {
        return (EnumC16575) f56100.get(str);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static EnumC16575 m42033(int i) {
        return (EnumC16575) f56094.get(Integer.valueOf(i));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static EnumC1759 m42032(String str) {
        return (EnumC1759) f56098.get(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC1759 m42028(int i) {
        return (EnumC1759) f56097.get(Integer.valueOf(i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m42027(String str) {
        Integer num;
        EnumC1759 enumC1759 = (EnumC1759) f56098.get(str);
        if (enumC1759 == null) {
            return -1;
        }
        num = enumC1759.f6108;
        return num.intValue();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC7464 m42029(char c) {
        EnumC7464 enumC7464 = (EnumC7464) f56093.get(Character.valueOf(c));
        return enumC7464 == null ? EnumC7464.AE_UNKNOWN : enumC7464;
    }
}
