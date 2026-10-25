package l;

import android.app.Activity;
import com.tencent.open.web.security.JniInterface;
import java.lang.ref.WeakReference;

/* compiled from: 51RR */
/* renamed from: l.ۖ۠ۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class RunnableC2401 implements Runnable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8045 f7659;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f7660;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4227 f7661;

    public RunnableC2401(C8045 c8045, String str, InterfaceC4227 interfaceC4227) {
        this.f7659 = c8045;
        this.f7660 = str;
        this.f7661 = interfaceC4227;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        WeakReference weakReference2;
        C7733.m20716(C8045.f24803, C8045.f24802);
        JniInterface.m925();
        C8045 c8045 = this.f7659;
        weakReference = c8045.f24804;
        if (weakReference == null) {
            return;
        }
        weakReference2 = c8045.f24804;
        Activity activity = (Activity) weakReference2.get();
        if (activity != null) {
            activity.runOnUiThread(new RunnableC15805(this, activity));
        }
    }
}
