package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PAKQ */
/* renamed from: l.ܶۨܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15212 extends BroadcastReceiver {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC3219 f46681;

    public C15212(ServiceC3219 serviceC3219) {
        this.f46681 = serviceC3219;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C6747 c6747;
        C8864 c8864;
        C8091 c8091;
        ServiceC3219 serviceC3219 = this.f46681;
        c6747 = serviceC3219.f10133;
        c6747.m18365(C13096.m31738());
        c8864 = serviceC3219.f10127;
        c8864.invalidate();
        int m31747 = C13096.m31747();
        for (int i = 0; i < 2; i++) {
            c8091 = serviceC3219.f10124;
            View childAt = c8091.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.height = m31747;
            layoutParams.width = m31747;
            childAt.setLayoutParams(layoutParams);
        }
        ServiceC3219.m9888(serviceC3219);
    }
}
