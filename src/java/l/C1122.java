package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* compiled from: G7AW */
/* renamed from: l.֨۫ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1122 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        boolean z2;
        String action = intent.getAction();
        if (!"bin.mt.remote.RemoteServerService.ACTION_FAILED_TO_START".equals(action)) {
            if (!"bin.mt.plus.FTP_SERVER_FAILED_TO_START".equals(action)) {
                z = C21584.f69321;
                if (z && "bin.mt.remote.RemoteServerService.ACTION_STOPPED".equals(action)) {
                    C21584.f69321 = false;
                    C4925.m14316(new RunnableC5356(0), 500L);
                } else {
                    z2 = C21584.f69319;
                    if (z2 && "bin.mt.plus.FTP_SERVER_STOPPED".equals(action)) {
                        C21584.f69319 = false;
                        C4925.m14316(new RunnableC15608(1), 500L);
                    }
                }
            } else {
                String stringExtra = intent.getStringExtra("msg");
                if (!TextUtils.isEmpty(stringExtra)) {
                    C21374.m48459((CharSequence) stringExtra);
                }
                C21584.f69319 = false;
            }
        } else {
            String stringExtra2 = intent.getStringExtra("msg");
            if (!TextUtils.isEmpty(stringExtra2)) {
                C21374.m48459((CharSequence) stringExtra2);
            }
            C21584.f69321 = false;
        }
        C21584.m48767();
    }
}
