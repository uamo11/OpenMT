package l;

import bin.mt.plugin.api.ui.dialog.LoadingDialog;
import bin.mt.plugin.api.ui.dialog.PluginDialog;
import java.lang.ref.WeakReference;

/* compiled from: 55FS */
/* renamed from: l.۟ܳ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class RunnableC7537 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final WeakReference f23289;

    public RunnableC7537(LoadingDialog loadingDialog) {
        this.f23289 = new WeakReference(loadingDialog);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        PluginDialog pluginDialog;
        LoadingDialog loadingDialog = (LoadingDialog) this.f23289.get();
        if (loadingDialog != null) {
            z = loadingDialog.delayShow;
            if (z) {
                loadingDialog.delayShow = false;
                pluginDialog = loadingDialog.dialog;
                pluginDialog.show();
            }
        }
    }
}
