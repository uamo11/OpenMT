package l;

import java.util.Iterator;
import java.util.List;

/* compiled from: I8ZW */
/* renamed from: l.ۤ۬ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10306 implements InterfaceC4661 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23005 f31039;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC3458 f31040;

    public C10306(C23005 c23005, InterfaceC3458 interfaceC3458) {
        this.f31039 = c23005;
        this.f31040 = interfaceC3458;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26061(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC8189 interfaceC8189 = (InterfaceC8189) it.next();
            if (interfaceC8189.isClosed()) {
                String name = interfaceC8189.name();
                AbstractC2143 abstractC2143 = this.f31039;
                AbstractC7483 mo7071 = abstractC2143.mo7071(name);
                if (mo7071 != null) {
                    mo7071.mo20106(this.f31040, abstractC2143, interfaceC8189);
                }
            }
        }
    }
}
