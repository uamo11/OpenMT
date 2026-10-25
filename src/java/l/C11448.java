package l;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import java.util.List;

/* compiled from: X59Z */
/* renamed from: l.ۨۘ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C11448 extends BroadcastReceiver {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f34219 = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            C11003.toString(intent);
            return;
        }
        ComponentName m28255 = m28255(context, "android.intent.action.MEDIA_BUTTON");
        if (m28255 != null) {
            intent.setComponent(m28255);
            try {
                C0881.m3232(context, intent);
                return;
            } catch (IllegalStateException e) {
                if (Build.VERSION.SDK_INT < 31 || !C10037.m25209(e)) {
                    throw e;
                }
                C10037.m25208(e).getMessage();
                return;
            }
        }
        ComponentName m282552 = m28255(context, "android.media.browse.MediaBrowserService");
        if (m282552 != null) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            C5803 c5803 = new C5803(applicationContext, intent, goAsync);
            C12045 c12045 = new C12045(applicationContext, m282552, c5803);
            c5803.m16280(c12045);
            c12045.m29415();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ComponentName m28255(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder m9834 = C3200.m9834("Expected 1 service that handles ", str, ", found ");
        m9834.append(queryIntentServices.size());
        throw new IllegalStateException(m9834.toString());
    }
}
