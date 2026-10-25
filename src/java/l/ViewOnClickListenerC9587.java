package l;

import android.view.View;
import bin.mt.plus.R;

/* compiled from: EDB */
/* renamed from: l.ۢ۫ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC9587 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Long l2 = (Long) view.getTag(R.id.MT_Protector_res_0x7f0a052c);
        if (l2 != null) {
            String m51020 = C22927.m51020(l2.longValue());
            C4925.m14317(m51020, C4925.m14327(R.string.MT_Protector_res_0x7f120a61) + ": " + m51020);
        }
    }
}
