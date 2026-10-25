package l;

/* compiled from: OBP8 */
/* renamed from: l.ۗۜᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3077 {
    @Deprecated
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m9404(InterfaceC12954 interfaceC12954, Integer num, Object obj) {
        int intValue = num.intValue();
        boolean mo2422 = interfaceC12954.mo2422(intValue);
        Object mo2318 = interfaceC12954.mo2318(intValue, obj);
        if (mo2422) {
            return mo2318;
        }
        return null;
    }

    @Deprecated
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m9406(InterfaceC12954 interfaceC12954, Object obj) {
        if (obj == null) {
            return null;
        }
        int intValue = ((Integer) obj).intValue();
        Object obj2 = interfaceC12954.get(intValue);
        if (obj2 != interfaceC12954.mo2319() || interfaceC12954.mo2422(intValue)) {
            return obj2;
        }
        return null;
    }

    @Deprecated
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Object m9407(InterfaceC12954 interfaceC12954, Object obj) {
        if (obj == null) {
            return null;
        }
        int intValue = ((Integer) obj).intValue();
        if (interfaceC12954.mo2422(intValue)) {
            return interfaceC12954.remove(intValue);
        }
        return null;
    }

    @Deprecated
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m9405(InterfaceC12954 interfaceC12954, Object obj) {
        if (obj == null) {
            return false;
        }
        return interfaceC12954.mo2422(((Integer) obj).intValue());
    }
}
