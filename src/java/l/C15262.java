package l;

import java.util.Collection;
import java.util.EnumSet;

/* compiled from: K9I0 */
/* renamed from: l.ܶܰۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15262 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m36277(Collection collection) {
        long j = 0;
        for (Object obj : collection) {
            if (obj instanceof InterfaceC21614) {
                j |= ((InterfaceC21614) obj).getValue();
            } else {
                throw new IllegalArgumentException("Can only be used with EnumWithValue enums.");
            }
        }
        return j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumSet m36278(long j, Class cls) {
        if (!InterfaceC21614.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Can only be used with EnumWithValue enums.");
        }
        EnumSet noneOf = EnumSet.noneOf(cls);
        for (Object obj : (Enum[]) cls.getEnumConstants()) {
            if (m36280(j, (InterfaceC21614) obj)) {
                noneOf.add(obj);
            }
        }
        return noneOf;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m36280(long j, InterfaceC21614 interfaceC21614) {
        return (j & interfaceC21614.getValue()) > 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC21614 m36279(long j, Class cls, EnumC7462 enumC7462) {
        for (InterfaceC21614 interfaceC21614 : (InterfaceC21614[]) cls.getEnumConstants()) {
            if (interfaceC21614.getValue() == j) {
                return interfaceC21614;
            }
        }
        return enumC7462;
    }
}
