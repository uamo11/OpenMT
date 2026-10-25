package l;

import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: 4AWI */
/* renamed from: l.۟ܿܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7617 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23761 f23561;

    public C7617(C23761 c23761) {
        this.f23561 = c23761;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        String m14306;
        boolean z;
        ViewOnClickListenerC14588 viewOnClickListenerC14588 = (ViewOnClickListenerC14588) abstractC3255;
        viewOnClickListenerC14588.f44670.setVisibility(0);
        C23761 c23761 = this.f23561;
        C15293 c15293 = (C15293) ((ArrayList) c23761.m52425()).get(i);
        viewOnClickListenerC14588.f44667.setText(c15293.m36306());
        TextView textView = viewOnClickListenerC14588.f44669;
        C11146 c11146 = c15293.f46926;
        C11146 c111462 = c15293.f46925;
        if (c111462 == null) {
            m14306 = c11146.mo27660();
        } else {
            m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120a5f, c11146.mo27660(), c111462.mo27660());
        }
        textView.setText(m14306);
        z = c23761.f76917.f2073;
        if (z) {
            viewOnClickListenerC14588.itemView.setBackgroundColor(c23761.f76920.get(i) ? C21943.f70286 : 0);
        } else if (viewOnClickListenerC14588.itemView.getBackground() instanceof ColorDrawable) {
            C19890.m45741(viewOnClickListenerC14588.itemView);
        }
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C23761 c23761 = this.f23561;
        return new ViewOnClickListenerC14588(c23761, LayoutInflater.from(c23761.f76917).inflate(R.layout.MT_Protector_res_0x7f0d016c, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return ((ArrayList) this.f23561.m52425()).size();
    }
}
