package l;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: 51V0 */
/* renamed from: l.֫ۗۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1554 extends AbstractC1129 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC22404 f5472;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2260 f5473;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C16696 f5474;

    public C1554(C9316 c9316, C16696 c16696, InterfaceC22404 interfaceC22404) {
        C3671 c3671;
        this.f5474 = c16696;
        this.f5472 = interfaceC22404;
        c3671 = c9316.f28267;
        this.f5473 = c3671.m11184(interfaceC22404.getType());
    }

    @Override // l.InterfaceC22404
    public final String getType() {
        return (String) this.f5474.m39233().mo4329(this.f5472.getType());
    }

    @Override // l.InterfaceC22404
    public final Set getElements() {
        ArrayList arrayList = new ArrayList(C21908.m49311(this.f5472.getElements(), this.f5474.m39234()));
        for (int i = 0; i < arrayList.size(); i++) {
            InterfaceC9272 interfaceC9272 = (InterfaceC9272) arrayList.get(i);
            String m7470 = this.f5473.m7470(interfaceC9272.getName());
            if (m7470 != null) {
                arrayList.set(i, new C7240(m7470, interfaceC9272.getValue()));
            }
        }
        return C9316.m23972(arrayList);
    }
}
