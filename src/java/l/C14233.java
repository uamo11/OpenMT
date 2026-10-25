package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: T8W7 */
/* renamed from: l.ܳۖۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14233 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9296 f42909;

    public C14233(ActivityC9296 activityC9296) {
        this.f42909 = activityC9296;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        List list;
        ViewOnClickListenerC20585 viewOnClickListenerC20585 = (ViewOnClickListenerC20585) abstractC3255;
        viewOnClickListenerC20585.f66271.setVisibility(0);
        TextView textView = viewOnClickListenerC20585.f66269;
        list = this.f42909.f28177;
        textView.setText(((C7569) ((ArrayList) list).get(i)).m20289());
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC9296 activityC9296 = this.f42909;
        return new ViewOnClickListenerC20585(activityC9296, LayoutInflater.from(activityC9296).inflate(R.layout.MT_Protector_res_0x7f0d0154, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        List list;
        list = this.f42909.f28177;
        return ((ArrayList) list).size();
    }
}
