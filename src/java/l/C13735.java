package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: 31PG */
/* renamed from: l.ܰۢۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13735 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7365 f41012;

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
    }

    public C13735(ActivityC7365 activityC7365) {
        this.f41012 = activityC7365;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C12346 c12346;
        c12346 = this.f41012.f22616;
        c12346.m29958(true);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C1926.m6344();
        boolean m37767 = C15972.m37767();
        ActivityC7365 activityC7365 = this.f41012;
        if (m37767) {
            List list = Collections.EMPTY_LIST;
            activityC7365.f22617 = list;
            activityC7365.f22625 = list;
        } else {
            List m40798 = C17448.m40798();
            ArrayList m40795 = C17448.m40795();
            activityC7365.f22617 = C20195.unmodifiableList(m40798);
            activityC7365.f22625 = C20195.unmodifiableList(m40795);
            new RunnableC19361(activityC7365);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if ((exc instanceof C1637) || (exc instanceof C19401)) {
            C21374.m48459((CharSequence) exc.getMessage());
        } else {
            C21374.m48459((CharSequence) exc.toString());
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        C15831 c15831;
        C12346 c12346;
        TextView textView6;
        TextView textView7;
        ActivityC7365 activityC7365 = this.f41012;
        textView = activityC7365.f22621;
        textView.setVisibility(0);
        if (C15972.m37751()) {
            textView6 = activityC7365.f22621;
            textView6.setText(R.string.MT_Protector_res_0x7f12051d);
            textView7 = activityC7365.f22621;
            textView7.setOnClickListener(new View.OnClickListener() { // from class: l.᩺ۢۢ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ActivityC7365.m19801(C13735.this.f41012);
                }
            });
            activityC7365.m10241(R.id.MT_Protector_res_0x7f0a0205).setVisibility(8);
        } else if (C15972.m37767()) {
            textView4 = activityC7365.f22621;
            textView4.setText(R.string.MT_Protector_res_0x7f1200ba);
            textView5 = activityC7365.f22621;
            textView5.setOnClickListener(null);
            activityC7365.m10241(R.id.MT_Protector_res_0x7f0a0205).setVisibility(8);
        } else {
            textView2 = activityC7365.f22621;
            textView2.setText(R.string.MT_Protector_res_0x7f1200c7);
            textView3 = activityC7365.f22621;
            textView3.setOnClickListener(null);
            activityC7365.m10241(R.id.MT_Protector_res_0x7f0a0205).setVisibility(0);
        }
        c15831 = activityC7365.f22624;
        c15831.notifyDataSetChanged();
        c12346 = activityC7365.f22616;
        c12346.m29958(false);
    }
}
