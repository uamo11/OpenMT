package l;

import java.io.Serializable;

/* compiled from: H38Z */
/* renamed from: l.֫᩸ܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2097 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC6141 m6971(InterfaceC6141 interfaceC6141) {
        if ((interfaceC6141 instanceof C13901) || (interfaceC6141 instanceof C11786)) {
            return interfaceC6141;
        }
        if (interfaceC6141 instanceof Serializable) {
            return new C11786(interfaceC6141);
        }
        return new C13901(interfaceC6141);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC6141 m6970(Object obj) {
        return new C7552(obj);
    }
}
