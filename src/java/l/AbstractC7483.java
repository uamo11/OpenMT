package l;

import java.util.Collection;

/* compiled from: 68XX */
/* renamed from: l.۟۬ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC7483 {
    /* renamed from: ֫ */
    public abstract Collection mo5986();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo20106(InterfaceC3458 interfaceC3458, AbstractC2143 abstractC2143, InterfaceC15243 interfaceC15243);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20105(InterfaceC3458 interfaceC3458, AbstractC2143 abstractC2143, InterfaceC1133 interfaceC1133) {
        for (InterfaceC1133 interfaceC11332 : interfaceC1133.mo3872()) {
            if (interfaceC11332.isClosed()) {
                AbstractC7483 mo7071 = abstractC2143.mo7071(interfaceC11332.name());
                if (mo7071 != null) {
                    mo7071.mo20106(interfaceC3458, abstractC2143, (InterfaceC15243) interfaceC11332);
                } else {
                    m20105(interfaceC3458, abstractC2143, interfaceC11332);
                }
            }
        }
    }
}
