package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: 28WH */
/* renamed from: l.᩺۫ᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22995 implements InterfaceC0397 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7473 f74036;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f74037;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12392 f74038;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12392 f74039;

    public C22995(C7473 c7473, boolean z) {
        C12392 c12392;
        C12392 c123922;
        C12392 c123923;
        C12392 c123924;
        this.f74036 = c7473;
        this.f74037 = z;
        if (z) {
            c123923 = c7473.f23032;
            this.f74039 = c123923;
            c123924 = c7473.f23051;
            this.f74038 = c123924;
            return;
        }
        c12392 = c7473.f23051;
        this.f74039 = c12392;
        c123922 = c7473.f23032;
        this.f74038 = c123922;
    }

    @Override // l.InterfaceC0397
    /* renamed from: ֫ */
    public final void mo1091(ArrayList arrayList) {
        List list;
        List<InterfaceC0467> list2;
        boolean z;
        C12392 c12392 = this.f74039;
        c12392.m30318(arrayList);
        if (this.f74038.m30441()) {
            return;
        }
        C7473 c7473 = this.f74036;
        list = c7473.f23019;
        if (list == null) {
            return;
        }
        int[] m30369 = c12392.m30369();
        list2 = c7473.f23019;
        for (InterfaceC0467 interfaceC0467 : list2) {
            boolean z2 = this.f74037;
            int mo15478 = interfaceC0467.mo15478(z2);
            int mo15483 = interfaceC0467.mo15483(z2);
            int i = m30369[0];
            if (mo15478 < m30369[1] && i < mo15483) {
                z = c7473.f23045;
                arrayList.add(new C21645(R.string.MT_Protector_res_0x7f120934, z ? z2 ? R.drawable.MT_Protector_res_0x7f0801d1 : R.drawable.MT_Protector_res_0x7f0801d4 : z2 ? R.drawable.MT_Protector_res_0x7f0801d3 : R.drawable.MT_Protector_res_0x7f0801d2, new InterfaceC13041() { // from class: l.ۨ۫ᩳ
                    @Override // l.InterfaceC13041
                    public final void accept(Object obj) {
                        List<InterfaceC0467> list3;
                        C22995 c22995 = C22995.this;
                        C7473 c74732 = c22995.f74036;
                        C12392 c123922 = c22995.f74039;
                        boolean z3 = c22995.f74037;
                        C12392 c123923 = c22995.f74038;
                        if (c123923.m30441()) {
                            return;
                        }
                        int[] m303692 = c123922.m30369();
                        C15859 c15859 = new C15859();
                        C15859 c158592 = new C15859();
                        list3 = c74732.f23019;
                        for (InterfaceC0467 interfaceC04672 : list3) {
                            int mo154782 = interfaceC04672.mo15478(z3);
                            int mo154832 = interfaceC04672.mo15483(z3);
                            int i2 = m303692[0];
                            if (mo154782 < m303692[1] && i2 < mo154832) {
                                boolean z4 = !z3;
                                int mo154783 = interfaceC04672.mo15478(z4);
                                int mo154833 = interfaceC04672.mo15483(z4);
                                if (interfaceC04672.mo2066(z3) == interfaceC04672.mo2070(z3) && mo154832 == c123922.m30436().length() && mo154783 > 0) {
                                    mo154783--;
                                }
                                if (interfaceC04672.mo2066(z4) == interfaceC04672.mo2070(z4) && mo154833 == c123923.m30436().length() && mo154782 > 0) {
                                    mo154782--;
                                }
                                c15859.add(mo154782);
                                c15859.add(mo154832);
                                c158592.add(mo154783);
                                c158592.add(mo154833);
                            }
                        }
                        if (c15859.isEmpty()) {
                            return;
                        }
                        c15859.mo3547((InterfaceC4571) null);
                        c158592.mo3547((InterfaceC4571) null);
                        c123923.m30436().replace(c158592.getInt(0), c158592.getInt(c158592.size() - 1), c123922.m30436().mo26557(c15859.getInt(0), c15859.getInt(c15859.size() - 1)));
                        c74732.m20022(c123922.m30444(), c123922.m30448(), z3);
                        c123923.requestFocus();
                    }
                }));
                return;
            }
        }
    }
}
