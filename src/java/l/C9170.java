package l;

import android.content.ComponentCallbacks2;

/* compiled from: Y6P1 */
/* renamed from: l.ۡ᩹ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9170 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC7379 f27774;

    public C9170(AbstractC7379 abstractC7379) {
        this.f27774 = abstractC7379;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC7379 m23580() {
        return this.f27774;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9170 m23579(InterfaceC23586 interfaceC23586) {
        return new C9170(interfaceC23586.getLifecycle());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9170 m23578(C12392 c12392) {
        InterfaceC23586 m17065 = C6152.m17065(c12392);
        if (m17065 == null) {
            ComponentCallbacks2 m15313 = C5350.m15313(c12392.getContext());
            if (m15313 instanceof InterfaceC23586) {
                m17065 = (InterfaceC23586) m15313;
            }
        }
        return new C9170(m17065 == null ? null : m17065.getLifecycle());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m23581() {
        AbstractC7379 abstractC7379 = this.f27774;
        return abstractC7379 == null || abstractC7379.mo19832() != EnumC13728.DESTROYED;
    }
}
