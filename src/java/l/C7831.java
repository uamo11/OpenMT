package l;

import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: C5P7 */
/* renamed from: l.۠֡᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7831 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC14886 f24234;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7831(ActivityC14886 activityC14886, ActivityC14886 activityC148862) {
        super(activityC148862, -1);
        this.f24234 = activityC14886;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        TextView[] textViewArr;
        String str;
        String m31260 = m31260();
        boolean isEmpty = m31260.isEmpty();
        ActivityC14886 activityC14886 = this.f24234;
        if (isEmpty) {
            m31260 = activityC14886.getString(R.string.MT_Protector_res_0x7f120090);
        }
        activityC14886.f45435 = m31260;
        textViewArr = activityC14886.f45437;
        for (TextView textView : textViewArr) {
            textView.setText(m31260);
        }
        InterfaceC13049 edit = ApplicationC20075.f65008.edit();
        str = activityC14886.f45435;
        edit.putString("font_viewer_displayed_text", str).apply();
        m31262();
    }
}
