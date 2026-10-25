package l;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.net.URL;

/* compiled from: 51RR */
/* renamed from: l.ܰ᩸ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14082 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C14082 f42535;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile WeakReference f42536;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized C14082 m33692() {
        C14082 c14082;
        synchronized (C14082.class) {
            if (f42535 == null) {
                C14082 c140822 = new C14082();
                c140822.f42536 = null;
                f42535 = c140822;
            }
            c14082 = f42535;
        }
        return c14082;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m33693(Context context, String str) {
        if (this.f42536 == null || this.f42536.get() == null) {
            this.f42536 = new WeakReference(context.getSharedPreferences("ServerPrefs", 0));
        }
        try {
            String host = new URL(str).getHost();
            if (host == null) {
                C9145.m23516("openSDK_LOG.ServerSetting", "Get host error. url=".concat(str));
                return str;
            }
            String string = ((SharedPreferences) this.f42536.get()).getString(host, null);
            if (string != null && !host.equals(string)) {
                String replace = str.replace(host, string);
                C9145.m23520("openSDK_LOG.ServerSetting", "return environment url : " + replace);
                return replace;
            }
            C9145.m23520("openSDK_LOG.ServerSetting", "host=" + host + ", envHost=" + string);
            return str;
        } catch (Exception e) {
            StringBuilder m9834 = C3200.m9834("getEnvUrl url=", str, "error.: ");
            m9834.append(e.getMessage());
            C9145.m23516("openSDK_LOG.ServerSetting", m9834.toString());
            return str;
        }
    }
}
