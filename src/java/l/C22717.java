package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: E5K2 */
/* renamed from: l.᩺ۗۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22717 extends AbstractC10494 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50753(C5637 c5637) {
        ArrayList arrayList;
        int intValue;
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC1591 first = c5637.f17411.getFirst(); first != null; first = first.m5439()) {
            if (first.f5638 == EnumC7690.ASSIGN) {
                C21802 c21802 = (C21802) first;
                if (c21802.f42444.f25745 == EnumC1340.LOCAL) {
                    AbstractC8396 abstractC8396 = c21802.f42445;
                    if (abstractC8396.f25745 == EnumC1340.CONSTANT) {
                        Object obj = ((C11987) abstractC8396).f35889;
                        if ((obj instanceof Number) && !(obj instanceof Long) && !(obj instanceof Double) && ((intValue = ((Number) obj).intValue()) == 0 || intValue == 1)) {
                            arrayList2.add(c21802);
                        }
                    }
                }
            }
        }
        boolean z = false;
        if (arrayList2.size() != 0 && (arrayList = c5637.f17414) != null) {
            Iterator it = arrayList2.iterator();
            z = false;
            while (it.hasNext()) {
                C21802 c218022 = (C21802) it.next();
                C18274 c18274 = (C18274) c218022.f42444;
                Iterator it2 = arrayList.iterator();
                boolean z2 = true;
                while (it2.hasNext()) {
                    Iterator it3 = ((C13334) it2.next()).f39897.iterator();
                    while (it3.hasNext()) {
                        AbstractC8396[] mo15838 = ((C21802) it3.next()).f42445.mo15838();
                        for (int i = 0; i < mo15838.length; i++) {
                            if (mo15838[i] == c18274) {
                                if (z2) {
                                    z2 = false;
                                } else {
                                    C18274 c182742 = new C18274(-1);
                                    c5637.f17415.add(c182742);
                                    c5637.f17411.m38666(c218022, C17819.m41744(c182742, c218022.f42445.clone()));
                                    mo15838[i] = c182742;
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return z;
    }
}
