package l;

import com.umeng.analytics.pro.am;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: P904 */
/* renamed from: l.ܰۛۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13627 extends AbstractC7483 {
    @Override // l.AbstractC7483
    /* renamed from: ֫ */
    public final void mo20106(InterfaceC3458 interfaceC3458, AbstractC2143 abstractC2143, InterfaceC15243 interfaceC15243) {
        if (interfaceC15243.mo36204()) {
            AbstractC7483.m20105(interfaceC3458, abstractC2143, interfaceC15243.mo36203());
        }
        C17820 builder = interfaceC3458.builder();
        C18981 mo10587 = interfaceC3458.mo10587();
        InterfaceC1592 mo22000 = mo10587.m43812().mo22000(C4118.class);
        C17820.m41747(builder, mo22000 == null ? null : mo22000.mo5310(mo10587, interfaceC3458.mo10583()), interfaceC15243.start(), interfaceC15243.end());
    }

    @Override // l.AbstractC7483
    /* renamed from: ֫ */
    public final Collection mo5986() {
        return Arrays.asList(am.aB, "del");
    }
}
