package l;

import android.text.Selection;
import android.text.TextUtils;
import android.view.View;
import bin.mt.plus.R;

/* compiled from: B29A */
/* renamed from: l.᩻۟ܳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC23553 implements View.OnLongClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC12849 f75612;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        String m14330 = C4925.m14330();
        if (!TextUtils.isEmpty(m14330)) {
            InterfaceC7785 m31267 = this.f75612.m31267();
            m31267.replace(0, m31267.length(), m14330);
            Selection.setSelection(m31267, m14330.length());
            return true;
        }
        C21374.m48457(R.string.MT_Protector_res_0x7f120a7f);
        return false;
    }
}
