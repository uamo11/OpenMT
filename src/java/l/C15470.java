package l;

import android.view.View;

/* compiled from: VB94 */
/* renamed from: l.ܶ᩷֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15470 extends C4888 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C5885 f47348;

    public C15470(EnumC20411 enumC20411, EnumC22527 enumC22527, C5885 c5885, C23686 c23686) {
        super(enumC20411, enumC22527, c5885.m16488(), c23686);
        this.f47348 = c5885;
    }

    @Override // l.C4888
    /* renamed from: ۜ */
    public final void mo14242() {
        EnumC22527 m14247 = m14247();
        EnumC22527 enumC22527 = EnumC22527.ADDING;
        C5885 c5885 = this.f47348;
        if (m14247 == enumC22527) {
            ComponentCallbacksC9205 m16488 = c5885.m16488();
            View findFocus = m16488.mView.findFocus();
            if (findFocus != null) {
                m16488.setFocusedView(findFocus);
                if (AbstractC5180.m14853(2)) {
                    findFocus.toString();
                    m16488.toString();
                }
            }
            View requireView = m14248().requireView();
            if (requireView.getParent() == null) {
                c5885.m16475();
                requireView.setAlpha(0.0f);
            }
            if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                requireView.setVisibility(4);
            }
            requireView.setAlpha(m16488.getPostOnViewCreatedAlpha());
            return;
        }
        if (m14247() == EnumC22527.REMOVING) {
            ComponentCallbacksC9205 m164882 = c5885.m16488();
            View requireView2 = m164882.requireView();
            if (AbstractC5180.m14853(2)) {
                C11003.toString(requireView2.findFocus());
                requireView2.toString();
                m164882.toString();
            }
            requireView2.clearFocus();
        }
    }

    @Override // l.C4888
    /* renamed from: ۧ */
    public final void mo14243() {
        super.mo14243();
        this.f47348.m16481();
    }
}
