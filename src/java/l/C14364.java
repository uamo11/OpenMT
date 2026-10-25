package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* compiled from: K5R1 */
/* renamed from: l.ܳۜᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14364 extends AbstractC12889 {

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6604 f43304;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14364(ActivityC6604 activityC6604, ActivityC6604 activityC66042) {
        super(R.layout.MT_Protector_res_0x7f0d0088, activityC66042, "arsc_search_resource");
        this.f43304 = activityC6604;
    }

    @Override // l.AbstractC12889
    /* renamed from: ֫ */
    public final void mo17649(String str, String str2, boolean z) {
        ActivityC6604 activityC6604 = this.f43304;
        activityC6604.f20336.f75581 = str2;
        if (z) {
            String lowerCase = str.toLowerCase();
            Iterator it = activityC6604.f20336.f75578.mo21936().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C8322) it.next()).mo12850().iterator();
                while (it2.hasNext()) {
                    Iterator it3 = ((C20317) it2.next()).mo2872().iterator();
                    while (it3.hasNext()) {
                        for (C18906 c18906 : ((C2678) it3.next()).mo18746()) {
                            Iterator it4 = c18906.values().iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    C4794 c4794 = (C4794) it4.next();
                                    if (c4794.mo5009() && c4794.mo5008().getValue().toLowerCase().contains(lowerCase)) {
                                        activityC6604.f20336.f75573.add(new C5193(c18906, c4794));
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        int parseLong = (int) Long.parseLong(str);
        Iterator it5 = activityC6604.f20336.f75578.mo21936().iterator();
        while (it5.hasNext()) {
            for (C20317 c20317 : ((C8322) it5.next()).mo12850()) {
                boolean equals = c20317.getTypeName().equals("style");
                Iterator it6 = c20317.mo2872().iterator();
                while (it6.hasNext()) {
                    for (C18906 c189062 : ((C2678) it6.next()).mo18746()) {
                        boolean mo29412 = c189062.mo29412();
                        if (equals && mo29412 && c189062.getParent() == parseLong) {
                            C5193 c5193 = new C5193(c189062, null);
                            c5193.f16277 = activityC6604.getString(R.string.MT_Protector_res_0x7f1200ef) + ": " + String.format("%08X", Integer.valueOf(parseLong));
                            activityC6604.f20336.f75573.add(c5193);
                        }
                        Iterator it7 = c189062.values().iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                C4794 c47942 = (C4794) it7.next();
                                int mo5004 = c47942.mo5004();
                                Iterator it8 = it7;
                                if ((mo5004 == 2 || mo5004 == 1 || mo5004 == 8 || mo5004 == 7 || (mo5004 >= 16 && mo5004 <= 31)) && c47942.getValue() == parseLong) {
                                    activityC6604.f20336.f75573.add(new C5193(c189062, c47942));
                                    break;
                                }
                                if (mo29412 && c47942.mo5006() == parseLong) {
                                    C5193 c51932 = new C5193(c189062, null);
                                    c51932.f16277 = activityC6604.getString(R.string.arsc_value_id) + ": " + String.format("%08X", Integer.valueOf(parseLong));
                                    activityC6604.f20336.f75573.add(c51932);
                                    break;
                                }
                                it7 = it8;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // l.AbstractC12889
    /* renamed from: ֫ */
    public final void mo17648() {
        ActivityC6604 activityC6604 = this.f43304;
        activityC6604.setTitle(activityC6604.f20336.f75581);
        activityC6604.m18107(EnumC4487.SEARCH_VALUE);
    }
}
