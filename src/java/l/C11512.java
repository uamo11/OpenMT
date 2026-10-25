package l;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: T8YQ */
/* renamed from: l.ۨۛۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11512 extends AbstractC7483 {
    @Override // l.AbstractC7483
    /* renamed from: ֫ */
    public final void mo20106(InterfaceC3458 interfaceC3458, AbstractC2143 abstractC2143, InterfaceC15243 interfaceC15243) {
        if (interfaceC15243.mo36204()) {
            InterfaceC1133 mo36203 = interfaceC15243.mo36203();
            boolean equals = "ol".equals(mo36203.name());
            boolean equals2 = "ul".equals(mo36203.name());
            if (equals || equals2) {
                C18981 mo10587 = interfaceC3458.mo10587();
                InterfaceC14040 mo10583 = interfaceC3458.mo10583();
                InterfaceC1592 mo22000 = mo10587.m43812().mo22000(C19249.class);
                int i = 0;
                InterfaceC1133 interfaceC1133 = mo36203;
                while (true) {
                    interfaceC1133 = interfaceC1133.mo3871();
                    if (interfaceC1133 == null) {
                        break;
                    } else if ("ul".equals(interfaceC1133.name()) || "ol".equals(interfaceC1133.name())) {
                        i++;
                    }
                }
                int i2 = 1;
                for (InterfaceC1133 interfaceC11332 : mo36203.mo3872()) {
                    AbstractC7483.m20105(interfaceC3458, abstractC2143, interfaceC11332);
                    final int[] iArr = {0};
                    if (equals) {
                        AbstractC4415.f14124.m29086(interfaceC3458.mo10583(), new InterfaceC19938() { // from class: l.ۛۛۘ
                            @Override // l.InterfaceC19938
                            /* renamed from: ֫ */
                            public final int mo3236() {
                                return iArr[0];
                            }
                        });
                    }
                    if (mo22000 != null && "li".equals(interfaceC11332.name())) {
                        if (equals) {
                            AbstractC4415.f14122.m29086(mo10583, EnumC22054.ORDERED);
                            C11925 c11925 = AbstractC4415.f14120;
                            iArr[0] = i2;
                            c11925.m29086(mo10583, Integer.valueOf(i2));
                            i2++;
                        } else {
                            AbstractC4415.f14122.m29086(mo10583, EnumC22054.BULLET);
                            AbstractC4415.f14117.m29086(mo10583, Integer.valueOf(i));
                        }
                        C17820.m41747(interfaceC3458.builder(), mo22000.mo5310(mo10587, mo10583), interfaceC11332.start(), interfaceC11332.end());
                    }
                }
            }
        }
    }

    @Override // l.AbstractC7483
    /* renamed from: ֫ */
    public final Collection mo5986() {
        return Arrays.asList("ol", "ul");
    }
}
