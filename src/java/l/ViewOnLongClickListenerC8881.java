package l;

import android.view.View;
import bin.mt.plus.R;

/* compiled from: EDB */
/* renamed from: l.ۡ۫ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnLongClickListenerC8881 implements View.OnLongClickListener {
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Long l2 = (Long) view.getTag(R.id.MT_Protector_res_0x7f0a052c);
        if (l2 == null) {
            return true;
        }
        String valueOf = String.valueOf(l2);
        C4925.m14317(valueOf, C4925.m14327(R.string.MT_Protector_res_0x7f120a61) + ": " + valueOf);
        return true;
    }
}
