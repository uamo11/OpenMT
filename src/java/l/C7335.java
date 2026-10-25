package l;

import com.umeng.analytics.pro.am;
import java.util.List;

/* compiled from: I67E */
/* renamed from: l.۟۠֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7335 extends C11069 {
    @Override // l.C11069, l.AbstractC8246
    /* renamed from: ܿ */
    public final void mo12088() {
    }

    @Override // l.C11069, l.AbstractC8246
    /* renamed from: ֫ */
    public final boolean mo1618(C3438 c3438) {
        int mo19046 = ((InterfaceC8835) this.f33245).mo19046();
        c3438.getClass();
        c3438.write(".array-data ", 0, 12);
        c3438.m10510(((InterfaceC8835) this.f33245).mo19046());
        c3438.write(10);
        c3438.m10512();
        List<Number> mo19045 = ((InterfaceC8835) this.f33245).mo19045();
        String str = mo19046 != 1 ? mo19046 != 2 ? "" : am.aB : am.aI;
        boolean z = this.f33244.f4289.f72438;
        for (Number number : mo19045) {
            C4718.m13817(c3438, number.longValue());
            c3438.write(str, 0, str.length());
            if (z) {
                if (mo19046 == 8) {
                    C11069.m27456(c3438, number.longValue());
                } else if (mo19046 == 4) {
                    int intValue = number.intValue();
                    if (!m27459(c3438, intValue)) {
                        C11069.m27458(c3438, intValue);
                    }
                }
            }
            c3438.write("\n", 0, 1);
        }
        c3438.m10508();
        c3438.write(".end array-data", 0, 15);
        return true;
    }
}
