package l;

import android.view.ViewGroup;
import bin.mt.plus.R;

/* compiled from: 657B */
/* renamed from: l.֨ۙ᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0900 extends AbstractC19902 {
    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        int[] iArr;
        C7956 c7956 = (C7956) abstractC3255;
        iArr = DialogInterfaceOnDismissListenerC15010.f45772;
        switch (iArr[i]) {
            case 0:
                c7956.f24596.setText(C4925.m14327(R.string.MT_Protector_res_0x7f1205c2).concat(" ->"));
                c7956.f24595.setImageResource(R.drawable.MT_Protector_res_0x7f0801e3);
                break;
            case 1:
                c7956.f24596.setText(C4925.m14327(R.string.MT_Protector_res_0x7f1205ec).concat(" ->"));
                c7956.f24595.setImageResource(R.drawable.MT_Protector_res_0x7f0801e5);
                break;
            case 2:
                c7956.m21264(R.string.MT_Protector_res_0x7f120a88, R.drawable.MT_Protector_res_0x7f0801e8);
                break;
            case 3:
                c7956.m21264(R.string.MT_Protector_res_0x7f1205f9, R.drawable.MT_Protector_res_0x7f080231);
                break;
            case 4:
                c7956.m21264(R.string.MT_Protector_res_0x7f1205ca, R.drawable.MT_Protector_res_0x7f0801e6);
                break;
            case 5:
                c7956.m21264(R.string.MT_Protector_res_0x7f1205be, R.drawable.MT_Protector_res_0x7f080254);
                break;
            case 6:
                c7956.m21264(R.string.MT_Protector_res_0x7f1205f2, R.drawable.MT_Protector_res_0x7f080227);
                break;
            case 7:
                c7956.m21264(R.string.MT_Protector_res_0x7f120606, R.drawable.MT_Protector_res_0x7f08023e);
                break;
            case 8:
                c7956.m21264(R.string.MT_Protector_res_0x7f1205f0, R.drawable.MT_Protector_res_0x7f080223);
                break;
            case 9:
                c7956.m21264(R.string.MT_Protector_res_0x7f1205ae, R.drawable.MT_Protector_res_0x7f0801cf);
                break;
        }
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C7956(C13540.m32583(viewGroup, R.layout.MT_Protector_res_0x7f0d0136, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        int[] iArr;
        iArr = DialogInterfaceOnDismissListenerC15010.f45772;
        return iArr.length;
    }
}
