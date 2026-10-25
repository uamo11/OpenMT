package l;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: R1V9 */
/* renamed from: l.᩵ۗۡ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19194 implements InterfaceC8898 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC7397 f60447;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0142 f60448;

    public C19194(C0142 c0142, InterfaceC7397 interfaceC7397) {
        this.f60448 = c0142;
        this.f60447 = interfaceC7397;
    }

    @Override // l.InterfaceC8898
    /* renamed from: ֫ */
    public final void mo1225(C2966 c2966) {
        Set set;
        Set set2;
        C5082 c5082;
        Set set3;
        Set set4;
        Set set5;
        InterfaceC7397 interfaceC7397 = this.f60447;
        if (interfaceC7397 == null || interfaceC7397.mo12795(c2966.m45794().replace('/', '.'))) {
            String m20585 = C7695.m20585(c2966);
            if (m20585 == null) {
                throw new IllegalStateException();
            }
            String m1222 = C0142.m1222(m20585);
            C0142 c0142 = this.f60448;
            set = c0142.f1267;
            if (((HashSet) set).contains(m1222)) {
                return;
            }
            set2 = c0142.f1269;
            if (((TreeSet) set2).contains(m1222)) {
                return;
            }
            c5082 = c0142.f1266;
            if (c5082.m14635(m1222)) {
                set5 = c0142.f1269;
                ((TreeSet) set5).add(m1222);
                return;
            }
            while (!m1222.isEmpty()) {
                set3 = c0142.f1267;
                if (((HashSet) set3).contains(m1222)) {
                    return;
                }
                set4 = c0142.f1267;
                ((HashSet) set4).add(m1222);
                m1222 = C0142.m1222(m1222);
            }
        }
    }
}
