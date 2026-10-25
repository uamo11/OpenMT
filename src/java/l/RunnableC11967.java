package l;

import java.util.HashMap;

/* compiled from: 51RR */
/* renamed from: l.ۨ᩸ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC11967 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f35834;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f35835;

    public RunnableC11967(C23255 c23255, HashMap hashMap) {
        this.f35835 = c23255;
        this.f35834 = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23255 c23255 = this.f35835;
        try {
            InterfaceC4722 m46492 = C20245.m46489().m46492(this.f35834, "https://cgi.connect.qq.com/qqconnectopen/openapi/policy_conf");
            String a = m46492.a();
            C9145.m23518("openSDK_LOG.OpenConfig", "update: get config statusCode " + m46492.d());
            C23255.m51572(c23255, C18338.m42748(a));
        } catch (Exception e) {
            C9145.m23514("openSDK_LOG.OpenConfig", "get config error ", e);
        }
        c23255.f74699 = 0;
    }
}
