package l;

import java.util.Map;

/* compiled from: Q886 */
/* renamed from: l.ܽܳۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16694 extends AbstractC8333 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC21013 f51232;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC8333 f51233;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC8333 f51234;

    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            c23525.m51981();
            return;
        }
        c23525.m51987();
        for (Map.Entry entry : map.entrySet()) {
            c23525.m51976(String.valueOf(entry.getKey()));
            this.f51234.mo2845(c23525, entry.getValue());
        }
        c23525.m51986();
    }

    public C16694(C18106 c18106, AbstractC8333 abstractC8333, AbstractC8333 abstractC83332, InterfaceC21013 interfaceC21013) {
        this.f51233 = abstractC8333;
        this.f51234 = abstractC83332;
        this.f51232 = interfaceC21013;
    }

    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        EnumC14352 m40398 = c17175.m40398();
        if (m40398 == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        Map map = (Map) this.f51232.mo12796();
        if (m40398 != EnumC14352.BEGIN_ARRAY) {
            c17175.m40402();
            while (c17175.m40404()) {
                AbstractC23149.f74411.mo41849(c17175);
                Object mo2844 = this.f51233.mo2844(c17175);
                if (map.put(mo2844, this.f51234.mo2844(c17175)) != null) {
                    throw new C14682(C5368.m15337(mo2844, "duplicate key: "));
                }
            }
            c17175.m40410();
            return map;
        }
        c17175.m40391();
        while (c17175.m40404()) {
            c17175.m40391();
            Object mo28442 = this.f51233.mo2844(c17175);
            if (map.put(mo28442, this.f51234.mo2844(c17175)) != null) {
                throw new C14682(C5368.m15337(mo28442, "duplicate key: "));
            }
            c17175.m40400();
        }
        c17175.m40400();
        return map;
    }
}
