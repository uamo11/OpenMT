package l;

import android.app.Dialog;

/* compiled from: 51RR */
/* renamed from: l.֡ܶۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class RunnableC0488 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Dialog f2101;

    public RunnableC0488(Dialog dialog) {
        this.f2101 = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f2101.dismiss();
        } catch (Exception e) {
            C9145.m23514("openSDK_LOG.DialogUtils", "dismiss dialog exception", e);
        }
    }
}
