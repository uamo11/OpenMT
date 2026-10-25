package l;

import java.util.HashMap;

/* compiled from: H8X1 */
/* renamed from: l.۟᩶ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7691 implements InterfaceC14040 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f23759 = new HashMap(3);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m20580(C11925 c11925) {
        Boolean bool = Boolean.FALSE;
        Object obj = this.f23759.get(c11925);
        return obj != null ? obj : bool;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m20578(C11925 c11925) {
        return this.f23759.get(c11925);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20579(C11925 c11925, Object obj) {
        HashMap hashMap = this.f23759;
        if (obj == null) {
            hashMap.remove(c11925);
        } else {
            hashMap.put(c11925, obj);
        }
    }
}
