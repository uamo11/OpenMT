package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import bin.mt.plus.R;

/* compiled from: 6AY4 */
/* renamed from: l.᩵᩵᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC19680 implements View.OnClickListener {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63586;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63587;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63588;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63589;

    public /* synthetic */ ViewOnClickListenerC19680(Object obj, Object obj2, Object obj3, int i) {
        this.f63588 = i;
        this.f63589 = obj;
        this.f63587 = obj2;
        this.f63586 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f63588;
        Object obj = this.f63586;
        Object obj2 = this.f63587;
        Object obj3 = this.f63589;
        switch (i) {
            case 0:
                ViewOnClickListenerC19121.m44084((C8817) obj3, (ViewOnClickListenerC19121) obj2, (C19712) obj);
                break;
            case 1:
                C7309 c7309 = (C7309) obj3;
                c7309.m19594();
                C2079.m6836(c7309.f22440, c7309.f22438, (EditText) obj2, (EditText) obj);
                break;
            default:
                C2450 c2450 = (C2450) obj2;
                AbstractDialogInterfaceOnClickListenerC12849 abstractDialogInterfaceOnClickListenerC12849 = (AbstractDialogInterfaceOnClickListenerC12849) obj;
                String path = ((InterfaceC17889) obj3).getPath();
                boolean z = false;
                AbstractC15440 m39866 = C16999.m39866(path, new String[0]);
                AbstractC15440 m398662 = C16999.m39866(C15472.m36561(4, 0, path), new String[0]);
                if (m398662.mo23120()) {
                    try {
                        C17721.m41503(c2450.m7914(), EnumC16309.MODIFY_DIRECTORY_LINKED);
                        AbstractC15440 m36520 = m39866.m36520(".tmp");
                        boolean z2 = m398662.mo23551(m36520) && m39866.mo23551(m398662) && m36520.mo23551(m39866);
                        if (z2) {
                            DialogInterfaceOnClickListenerC10816.m27035(c2450.m7917(), "restore_backup", C4925.m14306(R.string.MT_Protector_res_0x7f1208ba, m398662.getName()), true);
                        }
                        z = z2;
                    } catch (C1637 e) {
                        c2450.m7917().m10223(e, (DialogInterface.OnDismissListener) null);
                        return;
                    }
                } else if (m39866.mo23551(m398662)) {
                    z = true;
                }
                if (z) {
                    int i2 = C14463.f44330;
                    C14463.m34554(m39866.mo23554(), true);
                    C14463.m34554(m398662.mo23554(), true);
                    c2450.m7920(m398662.getName());
                    C15528.m36596();
                    C9068.m23429();
                } else {
                    C21374.m48457(R.string.MT_Protector_res_0x7f120881);
                }
                abstractDialogInterfaceOnClickListenerC12849.m31262();
                break;
        }
    }
}
