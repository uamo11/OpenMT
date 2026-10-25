package l;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: 19KT */
/* renamed from: l.ܳۛۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14332 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f43223;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f43224;

    static {
        HashMap hashMap = new HashMap();
        f43224 = hashMap;
        HashMap hashMap2 = new HashMap();
        f43223 = hashMap2;
        hashMap2.put(C13315.class, new C12340());
        hashMap2.put(C20853.class, new C11635());
        hashMap2.put(C1814.class, new C22923());
        C13750 c13750 = new C13750();
        hashMap2.put(C17279.class, c13750);
        hashMap.put(C17279.class, c13750);
        C7401 c7401 = new C7401();
        hashMap2.put(C14456.class, c7401);
        hashMap.put(C14456.class, c7401);
        hashMap.put(C9519.class, new C1633());
        hashMap2.put(C23340.class, new C10806());
        hashMap2.put(C3939.class, new C16449());
        hashMap.put(C8813.class, new C17861());
        hashMap2.put(C17375.class, new C5285());
        C1051 c1051 = new C1051();
        hashMap2.put(C6572.class, c1051);
        hashMap.put(C6572.class, c1051);
        hashMap2.put(C1724.class, new C8107());
        hashMap2.put(C22412.class, new C15161());
        hashMap2.put(C23629.class, new C21513());
        hashMap2.put(C6696.class, new C22218());
        hashMap2.put(C15867.class, new C20102());
        hashMap2.put(C2463.class, new C4579());
        hashMap2.put(C3874.class, new C3168());
        hashMap2.put(C20684.class, new C13045());
        hashMap.put(C9395.class, new C10224());
        hashMap.put(C23505.class, new C5990());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC19397 m34205(InterfaceC8689 interfaceC8689) {
        Class<?> cls = interfaceC8689.getClass();
        InterfaceC19397 interfaceC19397 = (InterfaceC19397) f43224.get(cls);
        if (interfaceC19397 != null) {
            return interfaceC19397;
        }
        throw new IllegalArgumentException("FileInformationClass not supported - " + cls);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC18691 m34204() {
        InterfaceC18691 interfaceC18691 = (InterfaceC18691) f43223.get(C2463.class);
        if (interfaceC18691 != null) {
            return interfaceC18691;
        }
        throw new IllegalArgumentException("FileInformationClass not supported - " + C2463.class);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Iterator m34203(byte[] bArr, InterfaceC18691 interfaceC18691) {
        return new C17155(bArr, interfaceC18691);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34206(C9395 c9395, C0097 c0097) {
        c0097.m26075((byte) 0);
        c0097.m26077(7, new byte[]{0, 0, 0, 0, 0, 0, 0});
        c0097.m26093(0L);
        c0097.m26088(c9395.m24228() * 2);
        byte[] bytes = c9395.m24227().getBytes(C8208.f25225);
        c0097.m26077(bytes.length, bytes);
    }
}
