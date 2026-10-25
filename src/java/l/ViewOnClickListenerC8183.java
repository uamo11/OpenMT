package l;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import bin.mt.plus.R;

/* compiled from: Y6Y9 */
/* renamed from: l.۠۫᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC8183 implements View.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25181;

    public /* synthetic */ ViewOnClickListenerC8183(int i) {
        this.f25181 = i;
    }

    public /* synthetic */ ViewOnClickListenerC8183(Context context) {
        this.f25181 = 2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f25181) {
            case 0:
                if (!ServiceC19288.m44489()) {
                    Application m14335 = C4925.m14335();
                    C0881.m3232(m14335, new Intent(m14335, (Class<?>) ServiceC19288.class));
                    break;
                } else {
                    Application m143352 = C4925.m14335();
                    m143352.stopService(new Intent(m143352, (Class<?>) ServiceC19288.class));
                    break;
                }
            case 1:
                int i = C23807.f77034;
                break;
            default:
                C21374.m48462(R.string.MT_Protector_res_0x7f1202c5, 0).m48468();
                break;
        }
    }
}
