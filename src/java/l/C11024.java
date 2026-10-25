package l;

/* compiled from: 9AXU */
/* renamed from: l.ۧ۬᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11024 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String m27354(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String m27355(InterfaceC11791 interfaceC11791) {
        Object m43235;
        if (interfaceC11791 instanceof C10819) {
            return interfaceC11791.toString();
        }
        try {
            m43235 = interfaceC11791 + '@' + m27354((Object) interfaceC11791);
        } catch (Throwable th) {
            m43235 = C18642.m43235(th);
        }
        if (C3825.m11584(m43235) != null) {
            m43235 = interfaceC11791.getClass().getName() + '@' + m27354((Object) interfaceC11791);
        }
        return (String) m43235;
    }
}
