package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.o;
import com.tencent.connect.common.AssistActivity;
import com.umeng.analytics.pro.d;

/* compiled from: 51RR */
/* renamed from: l.ܳܶۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14599 extends BroadcastReceiver {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AssistActivity f44687;

    public C14599(AssistActivity assistActivity) {
        this.f44687 = assistActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        String str2;
        String str3 = "#";
        Intent intent2 = new Intent();
        String stringExtra = intent.getStringExtra("key_action");
        AssistActivity assistActivity = this.f44687;
        if (stringExtra != null && !stringExtra.isEmpty()) {
            str2 = assistActivity.f892;
            C9145.m23518(str2, "QQStayReceiver action: ".concat(stringExtra));
            intent2.putExtra("key_action", stringExtra);
        } else {
            intent2.putExtra("key_action", "action_share");
        }
        try {
            Uri uri = (Uri) intent.getParcelableExtra("uriData");
            String uri2 = uri.toString();
            if (!uri2.contains("#")) {
                str3 = "?";
            }
            for (String str4 : uri2.substring(uri2.indexOf(str3) + 1).split(a.p)) {
                String[] split = str4.split("=");
                intent2.putExtra(split[0], split[1]);
            }
            intent2.setData(uri);
        } catch (Exception e) {
            str = assistActivity.f892;
            C9145.m23518(str, "QQStayReceiver parse uri error : " + e.getMessage());
            intent2.putExtra(o.c, d.O);
            intent2.putExtra("response", "parse error.");
        }
        assistActivity.setResult(-1, intent2);
    }
}
