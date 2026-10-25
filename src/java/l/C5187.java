package l;

import bin.mt.plus.R;
import java.util.function.Predicate;

/* compiled from: M1KQ */
/* renamed from: l.ۚۜۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5187 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8009 f16262;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5187(ViewOnClickListenerC8009 viewOnClickListenerC8009, AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346, R.string.MT_Protector_res_0x7f1205ff);
        this.f16262 = viewOnClickListenerC8009;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        C0247 c0247;
        String m31260 = m31260();
        ViewOnClickListenerC8009 viewOnClickListenerC8009 = this.f16262;
        C15063 c15063 = viewOnClickListenerC8009.f24734;
        if (viewOnClickListenerC8009.f24735.m37185(m31260)) {
            c15063.f46000 = true;
        } else {
            c15063.m35631();
        }
        c15063.m35630();
        c0247 = c15063.f45999;
        c0247.notifyDataSetChanged();
        m31262();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ۘ */
    public final void mo7756() {
        C12366 c12366;
        ViewOnClickListenerC8009 viewOnClickListenerC8009 = this.f16262;
        String m37184 = viewOnClickListenerC8009.f24735.m37184();
        C15063 c15063 = viewOnClickListenerC8009.f24734;
        ActivityC17169 activityC17169 = (ActivityC17169) c15063.requireActivity();
        C22933 c22933 = new C22933(activityC17169);
        c22933.m51049(R.string.MT_Protector_res_0x7f12090c);
        c22933.m51040(C4925.m14306(R.string.MT_Protector_res_0x7f120202, 0));
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        C0953 c0953 = new C0953(viewOnClickListenerC8009, c22933, activityC17169);
        c12366 = c15063.f45992;
        C6180.m17088(c12366, m37184, "/", 0L, 4, true, true, false, true, (InterfaceC4469) c0953, (Predicate) null);
    }
}
