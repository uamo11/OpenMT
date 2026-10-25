package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.d;
import java.util.List;

/* compiled from: K7HV */
/* renamed from: l.֡᩻ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0746 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC4980 f2795;

    public C0746(ActivityC4980 activityC4980) {
        this.f2795 = activityC4980;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        List list;
        String str;
        ViewOnClickListenerC20503 viewOnClickListenerC20503 = (ViewOnClickListenerC20503) abstractC3255;
        ActivityC4980 activityC4980 = this.f2795;
        list = activityC4980.f15688;
        C1452 c1452 = (C1452) list.get(i);
        TextView textView = viewOnClickListenerC20503.f66079;
        str = c1452.f5187;
        textView.setText(str);
        int m20112 = C7489.m20112(c1452.m4994());
        boolean m20122 = C7489.m20122(c1452.m4994());
        String string = m20112 != 0 ? m20112 != 1 ? m20112 != 2 ? m20112 != 3 ? d.O : activityC4980.getString(R.string.MT_Protector_res_0x7f1209b9) : activityC4980.getString(R.string.MT_Protector_res_0x7f1209b8) : activityC4980.getString(R.string.MT_Protector_res_0x7f1209b6) : activityC4980.getString(R.string.MT_Protector_res_0x7f1209b7);
        if (m20122) {
            StringBuilder m19190 = C7166.m19190(string, " (");
            m19190.append(activityC4980.getString(R.string.MT_Protector_res_0x7f1209ba));
            m19190.append(MotionUtils.EASING_TYPE_FORMAT_END);
            string = m19190.toString();
        }
        viewOnClickListenerC20503.f66080.setText(string);
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC4980 activityC4980 = this.f2795;
        return new ViewOnClickListenerC20503(activityC4980, LayoutInflater.from(activityC4980).inflate(R.layout.MT_Protector_res_0x7f0d014e, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        List list;
        list = this.f2795.f15688;
        return list.size();
    }
}
