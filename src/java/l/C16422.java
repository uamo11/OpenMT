package l;

import android.view.ViewGroup;
import bin.mt.plus.R;

/* compiled from: T12U */
/* renamed from: l.ܽۙ᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16422 extends AbstractC19902 {
    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        int[] iArr;
        C17834 c17834 = (C17834) abstractC3255;
        iArr = DialogInterfaceOnDismissListenerC17128.f52477;
        C9260 m23782 = C9260.m23782(iArr[i]);
        c17834.f54484.setText(m23782.m23785());
        c17834.f54483.setImageDrawable(m23782.m23783().f64252.m28878());
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C17834(C13540.m32583(viewGroup, R.layout.MT_Protector_res_0x7f0d00f0, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        int[] iArr;
        iArr = DialogInterfaceOnDismissListenerC17128.f52477;
        return iArr.length;
    }
}
