package l;

import bin.mt.plus.R;

/* compiled from: K5R1 */
/* renamed from: l.֫ۜᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1665 extends AbstractC17370 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6604 f5835;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1665(ActivityC6604 activityC6604, ActivityC6604 activityC66042, boolean z) {
        super(activityC66042, z);
        this.f5835 = activityC6604;
    }

    @Override // l.AbstractC17370
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo5652(C18076 c18076, String str) {
        int[] iArr = C12040.f36026;
        ActivityC6604 activityC6604 = this.f5835;
        int i = iArr[activityC6604.f20336.m52000().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            activityC6604.f20336.getClass();
            C23537 c23537 = activityC6604.f20336;
            c23537.f75580 = true;
            if (c23537.f75571.length < c23537.f75566.mo29409()) {
                C23537 c235372 = activityC6604.f20336;
                c235372.f75571 = new int[c235372.f75566.mo29409()];
            }
            activityC6604.f20336.f75564 = 0;
            for (int i2 = 0; i2 < activityC6604.f20336.f75566.mo29409(); i2++) {
                C4794 value = activityC6604.f20336.f75566.getValue(i2);
                String m43982 = C19096.m43982(activityC6604.f20336.f75567, value.mo5004(), value.getValue(), null);
                if (m43982 != null && c18076.m42137(m43982)) {
                    C23537 c235373 = activityC6604.f20336;
                    int[] iArr2 = c235373.f75571;
                    int i3 = c235373.f75564;
                    c235373.f75564 = i3 + 1;
                    iArr2[i3] = i2;
                } else if (c18076.m42137(activityC6604.f20336.f75569.m30772(value.mo5006()))) {
                    C23537 c235374 = activityC6604.f20336;
                    int[] iArr3 = c235374.f75571;
                    int i4 = c235374.f75564;
                    c235374.f75564 = i4 + 1;
                    iArr3[i4] = i2;
                }
            }
        } else if (i == 4) {
            C23537 c235375 = activityC6604.f20336;
            c235375.f75583 = str;
            c235375.f75588 = true;
            if (c235375.f75582.length < c235375.f75567.size()) {
                C23537 c235376 = activityC6604.f20336;
                c235376.f75582 = new int[c235376.f75567.size()];
            }
            C23537 c235377 = activityC6604.f20336;
            c235377.f75584 = 0;
            int size = c235377.f75567.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (c18076.m42137(activityC6604.f20336.f75567.m47858(i5))) {
                    C23537 c235378 = activityC6604.f20336;
                    int[] iArr4 = c235378.f75582;
                    int i6 = c235378.f75584;
                    c235378.f75584 = i6 + 1;
                    iArr4[i6] = i5;
                }
            }
        } else if (i == 5) {
            C23537 c235379 = activityC6604.f20336;
            c235379.f75583 = str;
            c235379.f75588 = true;
            if (c235379.f75582.length < c235379.f75579.size()) {
                C23537 c2353710 = activityC6604.f20336;
                c2353710.f75582 = new int[c2353710.f75579.size()];
            }
            activityC6604.f20336.f75584 = 0;
            for (int i7 = 0; i7 < activityC6604.f20336.f75579.size(); i7++) {
                C18906 c18906 = (C18906) activityC6604.f20336.f75579.get(i7);
                if (c18076.m42137(c18906.mo29406())) {
                    C23537 c2353711 = activityC6604.f20336;
                    int[] iArr5 = c2353711.f75582;
                    int i8 = c2353711.f75584;
                    c2353711.f75584 = i8 + 1;
                    iArr5[i8] = i7;
                } else if (c18076.m42137(String.format("%04X", Integer.valueOf(c18906.mo47883())))) {
                    C23537 c2353712 = activityC6604.f20336;
                    int[] iArr6 = c2353712.f75582;
                    int i9 = c2353712.f75584;
                    c2353712.f75584 = i9 + 1;
                    iArr6[i9] = i7;
                } else if (!activityC6604.f20336.f75574.getTypeName().equals("id")) {
                    if (c18906.mo29412() && activityC6604.f20336.f75574.getTypeName().equals("style") && c18906.getParent() != 0 && c18076.m42137(activityC6604.f20336.f75569.m30772(c18906.getParent()))) {
                        C23537 c2353713 = activityC6604.f20336;
                        int[] iArr7 = c2353713.f75582;
                        int i10 = c2353713.f75584;
                        c2353713.f75584 = i10 + 1;
                        iArr7[i10] = i7;
                    } else {
                        int i11 = 0;
                        while (true) {
                            if (i11 < c18906.mo29409()) {
                                C4794 value2 = c18906.getValue(i11);
                                String m439822 = C19096.m43982(activityC6604.f20336.f75567, value2.mo5004(), value2.getValue(), null);
                                if (m439822 != null && c18076.m42137(m439822)) {
                                    C23537 c2353714 = activityC6604.f20336;
                                    int[] iArr8 = c2353714.f75582;
                                    int i12 = c2353714.f75584;
                                    c2353714.f75584 = i12 + 1;
                                    iArr8[i12] = i7;
                                    break;
                                }
                                i11++;
                            }
                        }
                    }
                }
            }
        }
        activityC6604.setTitle(activityC6604.getString(R.string.MT_Protector_res_0x7f1203de, str));
        activityC6604.f20339.notifyDataSetChanged();
    }

    @Override // l.AbstractC17370
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo5651() {
        int[] iArr = C12040.f36026;
        ActivityC6604 activityC6604 = this.f5835;
        int i = iArr[activityC6604.f20336.m52000().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            C23537 c23537 = activityC6604.f20336;
            c23537.f75580 = false;
            activityC6604.setTitle(c23537.f75566.mo29406());
        } else if (i == 4) {
            activityC6604.f20336.f75588 = false;
            activityC6604.m10241(R.string.MT_Protector_res_0x7f120a00);
        } else if (i == 5) {
            C23537 c235372 = activityC6604.f20336;
            c235372.f75588 = false;
            activityC6604.setTitle(c235372.f75568.mo18744());
        }
        activityC6604.f20339.notifyDataSetChanged();
    }
}
