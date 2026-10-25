package l;

import java.util.HashMap;

/* compiled from: 99JQ */
/* renamed from: l.ܰ۟ۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13667 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f40748;

    static {
        HashMap hashMap = new HashMap();
        f40748 = hashMap;
        hashMap.put("DES/ECB/NoPadding", new C12257());
        hashMap.put("RC4", new C5907());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC19314 m32835() {
        InterfaceC20203 interfaceC20203 = (InterfaceC20203) f40748.get("RC4");
        if (interfaceC20203 == null) {
            throw new IllegalArgumentException("Unknown Cipher RC4");
        }
        return (InterfaceC19314) interfaceC20203.create();
    }
}
