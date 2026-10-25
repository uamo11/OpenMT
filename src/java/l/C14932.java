package l;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;

/* compiled from: Z7SD */
/* renamed from: l.ܶۖ֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C14932 extends AbstractCallableC14226 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2903 f45516;

    @Override // l.AbstractCallableC14226, java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        call();
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractCallableC14226 m35379(C2903 c2903) {
        AbstractCallableC14226 abstractCallableC14226 = (AbstractCallableC14226) c2903.m8837(AbstractCallableC14226.class);
        if (abstractCallableC14226 != null) {
            return abstractCallableC14226;
        }
        C14932 c14932 = new C14932();
        c14932.f45516 = c2903;
        C11781.m28823(c2903);
        c14932.f45516.m8839(AbstractCallableC14226.class, c14932);
        return c14932;
    }

    @Override // l.AbstractCallableC14226, java.util.concurrent.Callable
    public Boolean call() {
        throw new IllegalStateException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35380(Set set) {
        InterfaceC5808 interfaceC5808 = (InterfaceC5808) this.f45516.m8837(InterfaceC5808.class);
        if (interfaceC5808 != null) {
            Iterator it = interfaceC5808.m16298().iterator();
            if (it.hasNext()) {
                InterfaceC10042 interfaceC10042 = (InterfaceC10042) it.next();
                List list = C5378.stream(interfaceC10042.m25212().entrySet()).map(new C8264(5)).toList();
                try {
                    InterfaceC23399 interfaceC23399 = (InterfaceC23399) interfaceC10042.m25213();
                    interfaceC23399.init();
                    throw null;
                } catch (RuntimeException e) {
                    throw new C16908(e);
                }
            }
        }
        LinkedHashSet<C2609> linkedHashSet = new LinkedHashSet(set);
        ServiceLoader m4525 = C1302.m4494(this.f45516).m4525();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = m4525.iterator();
        while (it2.hasNext()) {
            InterfaceC23399 interfaceC233992 = (InterfaceC23399) it2.next();
            interfaceC233992.getClass();
            for (C2609 c2609 : linkedHashSet) {
                if ("doclint-not-available".equals(c2609.f8240)) {
                    linkedHashSet.remove(c2609);
                    linkedHashSet2.remove(interfaceC233992);
                    try {
                        C2609 c26092 = c2609.f8241;
                        interfaceC233992.init();
                        throw null;
                    } catch (RuntimeException e2) {
                        throw new C16908(e2);
                    }
                }
            }
        }
        for (C2609 c26093 : linkedHashSet) {
            C22364 m50099 = C22364.m50099(this.f45516);
            String str = (String) c26093.f8240;
            C12281 c12281 = C6241.f19132;
            m50099.m7276(new C12281("compiler", "plugin.not.found", str));
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            try {
                ((InterfaceC23399) it3.next()).init();
                throw null;
            } catch (RuntimeException e3) {
                throw new C16908(e3);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35381(C2609 c2609) {
        if (c2609.isEmpty()) {
            return;
        }
        try {
            AbstractC0821 m3067 = AbstractC0821.m3067();
            m3067.init();
            throw null;
        } catch (IllegalStateException unused) {
            C22364.m50099(this.f45516).m7275(C14001.f42347);
        }
    }
}
