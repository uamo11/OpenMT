package l;

import java.util.ArrayList;

/* compiled from: N4OR */
/* renamed from: l.ۗۙ֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3000 extends AbstractC10056 {
    @Override // l.AbstractC10056
    /* renamed from: ֫ */
    public final void mo1313(C10720 c10720, C12172 c12172) {
        ArrayList arrayList = this.f30234;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            EnumC14993 enumC14993 = this.f30233;
            if (i < size) {
                c10720.m26899(enumC14993.f45741);
                AbstractC5116 m21243 = C7938.m21243(this.f30232, enumC14993);
                arrayList.set(i, m21243);
                m21243.m14657(c10720, i, c12172);
                i++;
            } else {
                c12172.m29649(enumC14993, arrayList);
                return;
            }
        }
    }
}
