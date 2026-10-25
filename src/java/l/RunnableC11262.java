package l;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.umeng.analytics.pro.am;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: 51RR */
/* renamed from: l.ۧ᩸ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC11262 implements Runnable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18317 f33754;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f33755;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f33756;

    public RunnableC11262(C18317 c18317, Bundle bundle, boolean z) {
        this.f33754 = c18317;
        this.f33755 = bundle;
        this.f33756 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = "";
        C18317 c18317 = this.f33754;
        List list = c18317.f56953;
        Handler handler = c18317.f56955;
        try {
            Bundle bundle = new Bundle();
            bundle.putString("uin", "1000");
            bundle.putString("platform", "1");
            bundle.putString("os_ver", Build.VERSION.RELEASE);
            bundle.putString("position", "");
            int i = C10367.f31193;
            bundle.putString("network", "unknown");
            bundle.putString(am.N, Locale.getDefault().getLanguage());
            bundle.putString(am.z, C13893.m33303(C22927.m51019()));
            bundle.putString("apn", "");
            bundle.putString("mn", C10556.m26534().m26539());
            bundle.putString(am.M, TimeZone.getDefault().getID());
            bundle.putString("sdk_ver", "3.5.18.lite");
            bundle.putString("qz_ver", C18338.m42744(C22927.m51019(), "com.qzone"));
            bundle.putString("qq_ver", C18338.m42742(C22927.m51019()));
            Context m51019 = C22927.m51019();
            String m51027 = C22927.m51027();
            if (m51019 != null) {
                str = C18338.m42744(m51019, m51027);
            }
            bundle.putString("qua", str);
            bundle.putString("packagename", C22927.m51027());
            bundle.putString("app_ver", C18338.m42744(C22927.m51019(), C22927.m51027()));
            bundle.putAll(this.f33755);
            list.add(new C23066(bundle));
            int size = list.size();
            int m51575 = C23255.m51569(C22927.m51019(), (String) null).m51575("Agent_ReportTimeInterval");
            if (m51575 == 0) {
                m51575 = 10000;
            }
            int m515752 = C23255.m51569(C22927.m51019(), (String) null).m51575("Agent_ReportBatchCount");
            if (m515752 == 0) {
                m515752 = 5;
            }
            C9145.m23520("openSDK_LOG.ReportManager", "-->availableCount, report: report_via | dataSize: " + size + " | maxcount: " + m515752);
            if (!(size >= m515752) && !this.f33756) {
                if (handler.hasMessages(1001)) {
                    return;
                }
                Message obtain = Message.obtain();
                obtain.what = 1001;
                handler.sendMessageDelayed(obtain, m51575);
                return;
            }
            if (C18338.m42739(C22927.m51019())) {
                c18317.f56954.execute(new RunnableC16905(c18317));
            }
            handler.removeMessages(1001);
        } catch (Exception e) {
            C9145.m23514("openSDK_LOG.ReportManager", "--> reporVia, exception in sub thread.", e);
        }
    }
}
