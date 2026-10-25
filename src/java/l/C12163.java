package l;

import java.util.ArrayList;

/* compiled from: TBH1 */
/* renamed from: l.۫ۘܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12163 implements InterfaceC22705 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f36280;

    public C12163(ArrayList arrayList) {
        this.f36280 = arrayList;
    }

    @Override // l.InterfaceC22705
    /* renamed from: ֫ */
    public final void mo22398(C13532 c13532) {
        C20069 mo29535 = c13532.mo29535();
        C21480 m34042 = c13532.m34042();
        int size = mo29535.size();
        for (int i = 0; i < size; i++) {
            ((C16395) this.f36280.get(c13532.m32574(i))).m38601(m34042, mo29535.m41004get(i));
        }
    }
}
