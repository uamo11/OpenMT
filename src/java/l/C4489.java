package l;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: S9Y7 */
/* renamed from: l.ۙۜ᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4489 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AtomicReference f14285 = new AtomicReference();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static volatile InterfaceC3078 f14286;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC3078 m13237() {
        if (f14286 == null) {
            synchronized (C4489.class) {
                if (f14286 == null) {
                    InterfaceC20012 interfaceC20012 = (InterfaceC20012) f14285.get();
                    InterfaceC3078 m46150 = interfaceC20012 != null ? interfaceC20012.m46150() : null;
                    if (m46150 == null) {
                        m46150 = new C8100();
                    }
                    f14286 = m46150;
                }
            }
        }
        return f14286;
    }
}
