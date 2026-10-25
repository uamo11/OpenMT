package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: 08W3 */
/* renamed from: l.ۛۜۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5891 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11536 f18088;

    public C5891(ActivityC11536 activityC11536) {
        this.f18088 = activityC11536;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        List list;
        list = this.f18088.f34443;
        ((ViewOnClickListenerC3775) abstractC3255).m11431((C2364) list.get(i));
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractC16157 abstractC16157;
        ActivityC11536 activityC11536 = this.f18088;
        View inflate = LayoutInflater.from(activityC11536).inflate(R.layout.MT_Protector_res_0x7f0d0140, viewGroup, false);
        abstractC16157 = activityC11536.f34444;
        return new ViewOnClickListenerC3775(activityC11536, abstractC16157, inflate);
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        List list;
        list = this.f18088.f34443;
        return list.size();
    }
}
