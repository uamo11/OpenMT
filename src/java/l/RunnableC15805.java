package l;

import android.app.Activity;
import com.tencent.connect.auth.a;
import com.tencent.open.TDialog;
import com.tencent.open.web.security.JniInterface;

/* compiled from: 51RR */
/* renamed from: l.ܺ۠ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class RunnableC15805 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f48763;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC2401 f48764;

    public RunnableC15805(RunnableC2401 runnableC2401, Activity activity) {
        this.f48764 = runnableC2401;
        this.f48763 = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String m52446;
        C21451 c21451;
        C21451 c214512;
        RunnableC2401 runnableC2401 = this.f48764;
        InterfaceC4227 interfaceC4227 = runnableC2401.f7661;
        C8045 c8045 = runnableC2401.f7659;
        boolean z = JniInterface.f907;
        Activity activity = this.f48763;
        if (z) {
            String str = runnableC2401.f7660;
            c214512 = c8045.f76946;
            a aVar = new a(activity, str, interfaceC4227, c214512);
            if (activity.isFinishing()) {
                return;
            }
            aVar.show();
            return;
        }
        C9145.m23519("openSDK_LOG.AuthAgent", "OpenUi, secure so load failed, goto download QQ.");
        m52446 = c8045.m52446();
        c21451 = c8045.f76946;
        TDialog tDialog = new TDialog(activity, m52446, interfaceC4227, c21451);
        if (activity.isFinishing()) {
            return;
        }
        tDialog.show();
    }
}
