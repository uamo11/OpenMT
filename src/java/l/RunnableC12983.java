package l;

import com.tencent.connect.auth.a;

/* compiled from: 51RR */
/* renamed from: l.۬۠ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC12983 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12278 f38892;

    public RunnableC12983(C12278 c12278) {
        this.f38892 = c12278;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9851 c9851;
        C9851 c98512;
        String str;
        a aVar = this.f38892.f36581;
        c9851 = aVar.f875;
        if (c9851 != null) {
            c98512 = aVar.f875;
            str = aVar.f874;
            c98512.loadUrl(str);
        }
    }
}
