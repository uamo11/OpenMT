package l;

import com.tencent.connect.auth.a;

/* compiled from: 51RR */
/* renamed from: l.ۨ۠ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC11573 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f34511;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ a f34512;

    public RunnableC11573(a aVar, String str) {
        this.f34512 = aVar;
        this.f34511 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        C10162 c10162;
        String str3;
        StringBuilder sb = new StringBuilder("-->timeoutUrl: ");
        String str4 = this.f34511;
        sb.append(str4);
        sb.append(" | mRetryUrl: ");
        a aVar = this.f34512;
        str = aVar.f874;
        sb.append(str);
        C9145.m23520("openSDK_LOG.AuthDialog", sb.toString());
        str2 = aVar.f874;
        if (str4.equals(str2)) {
            c10162 = aVar.f885;
            str3 = aVar.f874;
            c10162.mo3454(new C19750(9002, "请求页面超时，请稍后重试！", str3));
            aVar.dismiss();
        }
    }
}
