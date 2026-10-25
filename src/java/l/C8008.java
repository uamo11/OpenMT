package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: A91T */
/* renamed from: l.۠ۜۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8008 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC15062 f24733;

    public C8008(ActivityC15062 activityC15062) {
        this.f24733 = activityC15062;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        List list;
        list = this.f24733.f45986;
        ((ViewOnClickListenerC3775) abstractC3255).m11431((C2364) list.get(i));
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractC16157 abstractC16157;
        ActivityC15062 activityC15062 = this.f24733;
        View inflate = LayoutInflater.from(activityC15062).inflate(R.layout.MT_Protector_res_0x7f0d0140, viewGroup, false);
        abstractC16157 = activityC15062.f45988;
        return new ViewOnClickListenerC3775(activityC15062, abstractC16157, inflate);
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        List list;
        list = this.f24733.f45986;
        return list.size();
    }
}
