package l;

import java.util.HashMap;

/* compiled from: U9KI */
/* renamed from: l.ܽ֫ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16325 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f50272;

    static {
        HashMap hashMap = new HashMap();
        f50272 = hashMap;
        hashMap.put("KDF/Counter/HMACSHA256", new C1509());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC0262 m38473() {
        InterfaceC20203 interfaceC20203 = (InterfaceC20203) f50272.get("KDF/Counter/HMACSHA256");
        if (interfaceC20203 == null) {
            throw new IllegalArgumentException("Unknown DerivationFunction KDF/Counter/HMACSHA256");
        }
        return (InterfaceC0262) interfaceC20203.create();
    }
}
