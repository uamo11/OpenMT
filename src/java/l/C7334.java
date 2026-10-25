package l;

import java.util.ArrayList;

/* compiled from: G1B3 */
/* renamed from: l.۟۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7334 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21446 f22535;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f22537 = new ArrayList();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C22856 f22536 = new C22856();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19691(C21446 c21446) {
        ArrayList arrayList = this.f22537;
        arrayList.clear();
        int size = c21446.f18169.size();
        for (int i = 0; i < size; i++) {
            C15094 c15094 = (C15094) c21446.f18169.get(i);
            EnumC8040[] enumC8040Arr = c15094.f46124;
            EnumC8040 enumC8040 = enumC8040Arr[0];
            EnumC8040 enumC80402 = EnumC8040.MATCH_CONSTRAINT;
            if (enumC8040 == enumC80402 || enumC8040Arr[1] == enumC80402) {
                arrayList.add(c15094);
            }
        }
        c21446.f69049.m39336();
    }

    public C7334(C21446 c21446) {
        this.f22535 = c21446;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19689(C21446 c21446, int i, int i2) {
        int m35769 = c21446.m35769();
        int m35767 = c21446.m35767();
        c21446.m35725(0);
        c21446.m35755(0);
        c21446.m35770(i);
        c21446.m35733(i2);
        c21446.m35725(m35769);
        c21446.m35755(m35767);
        this.f22535.mo16610();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01bf A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m19692(l.C21446 r18, int r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7334.m19692(l.᩸۠, int, int, int, int, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m19690(InterfaceC13683 interfaceC13683, C15094 c15094, int i) {
        EnumC8040[] enumC8040Arr = c15094.f46124;
        int[] iArr = c15094.f46119;
        EnumC8040 enumC8040 = enumC8040Arr[0];
        C22856 c22856 = this.f22536;
        c22856.f73745 = enumC8040;
        c22856.f73753 = enumC8040Arr[1];
        c22856.f73748 = c15094.m35753();
        c22856.f73747 = c15094.m35732();
        c22856.f73754 = false;
        c22856.f73750 = i;
        EnumC8040 enumC80402 = c22856.f73745;
        EnumC8040 enumC80403 = EnumC8040.MATCH_CONSTRAINT;
        boolean z = enumC80402 == enumC80403;
        boolean z2 = c22856.f73753 == enumC80403;
        boolean z3 = z && c15094.f46108 > 0.0f;
        boolean z4 = z2 && c15094.f46108 > 0.0f;
        if (z3 && iArr[0] == 4) {
            c22856.f73745 = EnumC8040.FIXED;
        }
        if (z4 && iArr[1] == 4) {
            c22856.f73753 = EnumC8040.FIXED;
        }
        interfaceC13683.mo32930(c15094, c22856);
        c15094.m35770(c22856.f73746);
        c15094.m35733(c22856.f73749);
        c15094.m35721(c22856.f73751);
        c15094.m35752(c22856.f73752);
        c22856.f73750 = 0;
        return c22856.f73754;
    }
}
