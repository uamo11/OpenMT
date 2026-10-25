package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: U8WA */
/* renamed from: l.᩵ۤᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19408 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44725(boolean z, List list, InterfaceC23008 interfaceC23008) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0467 interfaceC0467 = (InterfaceC0467) it.next();
            int mo15478 = interfaceC0467.mo15478(z);
            int mo15483 = interfaceC0467.mo15483(z);
            if (mo15478 != mo15483 || mo15478 != interfaceC23008.length()) {
                int lastIndexOf = interfaceC23008.lastIndexOf('\n', 0, mo15478) + 1;
                if (lastIndexOf != mo15478) {
                    interfaceC0467.mo15481(lastIndexOf, z);
                    m44726(z, interfaceC0467, mo15478 - lastIndexOf);
                }
                if (interfaceC0467.mo2066(z) != interfaceC0467.mo2070(z)) {
                    int indexOf = interfaceC23008.indexOf('\n', mo15483 - 1, interfaceC23008.length());
                    lastIndexOf = indexOf == -1 ? interfaceC23008.length() : indexOf + 1;
                }
                if (mo15483 != lastIndexOf) {
                    interfaceC0467.mo15488(lastIndexOf, z);
                }
            }
        }
        Iterator it2 = list.iterator();
        InterfaceC0467 interfaceC04672 = null;
        while (it2.hasNext()) {
            InterfaceC0467 interfaceC04673 = (InterfaceC0467) it2.next();
            if (interfaceC04672 != null && interfaceC04672.mo15483(z) >= interfaceC04673.mo15478(z)) {
                int i = 0;
                while (i < 2) {
                    boolean z2 = i == 0;
                    int mo154782 = interfaceC04672.mo15478(z2);
                    int mo154783 = interfaceC04673.mo15478(z2);
                    if (mo154782 < mo154783) {
                        interfaceC04673.mo15481(mo154782, z2);
                        m44726(z2, interfaceC04673, mo154783 - mo154782);
                    }
                    int mo154832 = interfaceC04672.mo15483(z2);
                    int mo154833 = interfaceC04673.mo15483(z2);
                    if (mo154832 < mo154833) {
                        interfaceC04672.mo15488(mo154833, z2);
                    }
                    int mo2070 = interfaceC04672.mo2070(z2);
                    int mo20702 = interfaceC04673.mo2070(z2);
                    if (mo2070 < mo20702) {
                        interfaceC04672.mo2061(mo20702, z2);
                    }
                    i++;
                }
                List mo2067 = interfaceC04672.mo2067();
                List mo20672 = interfaceC04673.mo2067();
                if (mo20672 != null) {
                    if (mo2067 == null) {
                        mo2067 = new ArrayList();
                    }
                    mo2067.addAll(mo20672);
                }
                interfaceC04672.mo2062(mo2067);
                it2.remove();
            } else {
                interfaceC04672 = interfaceC04673;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44726(boolean z, InterfaceC0467 interfaceC0467, int i) {
        List<InterfaceC18813> mo2067 = interfaceC0467.mo2067();
        if (mo2067 != null) {
            for (InterfaceC18813 interfaceC18813 : mo2067) {
                if (z) {
                    interfaceC18813.mo15486(interfaceC18813.mo15487() + i);
                    interfaceC18813.mo15484(interfaceC18813.mo15477() + i);
                } else {
                    interfaceC18813.mo15482(interfaceC18813.mo15485() + i);
                    interfaceC18813.mo15480(interfaceC18813.mo15489() + i);
                }
            }
        }
    }
}
