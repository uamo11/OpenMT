package l;

import java.util.HashMap;
import java.util.Map;

/* compiled from: X202 */
/* renamed from: l.ۡ᩻ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9214 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f27904 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23656(String str, String str2, InterfaceC9920 interfaceC9920) {
        HashMap hashMap = f27904;
        Map map = (Map) hashMap.get(str);
        if (map == null) {
            map = new HashMap();
            hashMap.put(str, map);
        }
        map.put(str2, interfaceC9920);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC1661 m23655(C2450 c2450) {
        InterfaceC9920 interfaceC9920;
        AbstractC16891 m7922 = c2450.m7922();
        AbstractC16891 m39044 = c2450.m7919().m39044();
        Map map = (Map) f27904.get(m7922.mo6007());
        if (map != null && (interfaceC9920 = (InterfaceC9920) map.get(m39044.mo6007())) != null) {
            return interfaceC9920.create();
        }
        return C22081.m49676();
    }
}
