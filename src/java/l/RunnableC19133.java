package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: 19AV */
/* renamed from: l.᩵֨ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19133 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Main m36593 = C15528.m36593();
        if (m36593 != null) {
            C19258 buildDialog = m36593.buildDialog();
            buildDialog.m44433(R.string.MT_Protector_res_0x7f120491);
            buildDialog.m44416(R.string.MT_Protector_res_0x7f12094a);
            buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
            buildDialog.m44434(R.string.MT_Protector_res_0x7f120a99, new DialogInterfaceOnClickListenerC0081(0, m36593));
            buildDialog.m44437("Shizuku", (DialogInterface.OnClickListener) null);
            DialogInterfaceC0206 m44438 = buildDialog.m44438();
            C8960.m23095(m44438);
            m44438.m1448().setOnClickListener(new ViewOnClickListenerC5021(0, m36593));
        }
    }
}
