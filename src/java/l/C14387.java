package l;

import bin.mt.plus.R;
import java.util.List;

/* compiled from: M1KQ */
/* renamed from: l.ܳ۟᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14387 implements InterfaceC21403 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19328 f43349;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f43350;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22933 f43351;

    public C14387(C19328 c19328, C22933 c22933, ActivityC17169 activityC17169) {
        this.f43349 = c19328;
        this.f43351 = c22933;
        this.f43350 = activityC17169;
    }

    @Override // l.InterfaceC21403
    /* renamed from: ֫ */
    public final boolean mo22513() {
        return this.f43351.m51053();
    }

    @Override // l.InterfaceC21403
    /* renamed from: ܽ */
    public final ActivityC17169 mo22516() {
        return this.f43350;
    }

    @Override // l.InterfaceC21403
    /* renamed from: ۧ */
    public final void mo22515(int i) {
        this.f43351.m51045(i);
    }

    @Override // l.InterfaceC21403
    /* renamed from: ֫ */
    public final void mo22512(int i, int i2) {
        List<C23560> list;
        C15798 c15798;
        String str;
        this.f43350.m10218(R.string.MT_Protector_res_0x7f120491, C4925.m14306(R.string.MT_Protector_res_0x7f1200f8, Integer.valueOf(i2), Integer.valueOf(i)), false);
        C19328 c19328 = this.f43349;
        list = c19328.f60758;
        for (C23560 c23560 : list) {
            if (c23560.f75636) {
                str = c23560.f75634;
                c23560.f75635 = str;
                c23560.f75636 = false;
            }
        }
        c19328.f60764 = false;
        c19328.m44547();
        c15798 = c19328.f60765;
        c15798.notifyDataSetChanged();
    }

    @Override // l.InterfaceC21403
    /* renamed from: ۧ */
    public final void mo22514() {
        this.f43351.m51051();
    }
}
