package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: 47JB */
/* renamed from: l.ܶܺܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15332 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3339 f46991;

    public C15332(ActivityC3339 activityC3339) {
        this.f46991 = activityC3339;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        List list;
        ViewOnClickListenerC4750 viewOnClickListenerC4750 = (ViewOnClickListenerC4750) abstractC3255;
        viewOnClickListenerC4750.f15064.setVisibility(0);
        TextView textView = viewOnClickListenerC4750.f15062;
        list = this.f46991.f10555;
        textView.setText(((C12511) list.get(i)).m30693());
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC3339 activityC3339 = this.f46991;
        return new ViewOnClickListenerC4750(activityC3339, LayoutInflater.from(activityC3339).inflate(R.layout.MT_Protector_res_0x7f0d014c, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        List list;
        list = this.f46991.f10555;
        return list.size();
    }
}
