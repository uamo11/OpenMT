package l;

import java.util.Iterator;

/* compiled from: R450 */
/* renamed from: l.᩺᩵֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C23189 extends C5551 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51435(C6319 c6319, AbstractC14016 abstractC14016, InterfaceC19663 interfaceC19663, C10643 c10643, C4809 c4809) {
        AbstractC7667 abstractC7667;
        InterfaceC19663 interfaceC196632;
        C10643 c106432;
        Iterator it = this.f53596.iterator();
        while (it.hasNext()) {
            AbstractC7667 abstractC76672 = (AbstractC7667) it.next();
            C12171.m29642(abstractC76672 instanceof C18957);
            C18957 c18957 = (C18957) abstractC76672;
            abstractC7667 = c18957.f59794;
            if (abstractC7667 == abstractC14016) {
                interfaceC196632 = c18957.f59793;
                if (interfaceC196632 == interfaceC19663) {
                    c106432 = c18957.f59790;
                    if (c106432.f32020 == c10643.f32020) {
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
        m41026(new C18957(c6319, abstractC14016, null, interfaceC19663, c10643, c4809));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m51436() {
        return this.f53596.m43518();
    }
}
