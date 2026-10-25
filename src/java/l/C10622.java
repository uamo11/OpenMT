package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: 88W8 */
/* renamed from: l.ۤ᩻ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10622 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6388 f31903;

    public C10622(ActivityC6388 activityC6388) {
        this.f31903 = activityC6388;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        List list;
        list = this.f31903.f19758;
        ((ViewOnClickListenerC3775) abstractC3255).m11431((C2364) list.get(i));
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractC16157 abstractC16157;
        ActivityC6388 activityC6388 = this.f31903;
        View inflate = LayoutInflater.from(activityC6388).inflate(R.layout.MT_Protector_res_0x7f0d0140, viewGroup, false);
        abstractC16157 = activityC6388.f19760;
        return new ViewOnClickListenerC3775(activityC6388, abstractC16157, inflate);
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        List list;
        list = this.f31903.f19758;
        return list.size();
    }
}
