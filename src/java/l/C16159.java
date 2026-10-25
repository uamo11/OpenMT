package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: Q8UX */
/* renamed from: l.ܺ᩶ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16159 extends BroadcastReceiver {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC4166 f49780;

    public C16159(ServiceC4166 serviceC4166) {
        this.f49780 = serviceC4166;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean m12605;
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            C6988 m48041 = C21100.m48041();
            m12605 = this.f49780.m12605(m48041);
            if (m12605) {
                m48041.m18910();
            }
        }
    }
}
