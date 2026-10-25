package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: J7J5 */
/* renamed from: l.۠ۘ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7936 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19932 f24561;

    public C7936(ActivityC19932 activityC19932) {
        this.f24561 = activityC19932;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        List list;
        ViewOnClickListenerC22048 viewOnClickListenerC22048 = (ViewOnClickListenerC22048) abstractC3255;
        viewOnClickListenerC22048.f70670.setVisibility(0);
        TextView textView = viewOnClickListenerC22048.f70669;
        list = this.f24561.f64531;
        textView.setText(((C2292) list.get(i)).f11359);
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC19932 activityC19932 = this.f24561;
        return new ViewOnClickListenerC22048(activityC19932, LayoutInflater.from(activityC19932).inflate(R.layout.MT_Protector_res_0x7f0d014c, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        List list;
        list = this.f24561.f64531;
        return list.size();
    }
}
