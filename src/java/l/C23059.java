package l;

import android.view.KeyEvent;
import bin.mt.plugin.api.ui.dialog.BaseCancelableDialog;
import bin.mt.plugin.api.ui.dialog.PluginDialog;
import bin.mt.plugin.api.util.Consumer;

/* compiled from: S7OD */
/* renamed from: l.᩺ܳ᩷, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C23059 implements PluginDialog.OnKeyListener {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f74176 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BaseCancelableDialog f74177;

    public C23059(BaseCancelableDialog baseCancelableDialog) {
        this.f74177 = baseCancelableDialog;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.OnKeyListener
    public boolean onKey(PluginDialog pluginDialog, int i, KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        Consumer consumer;
        Consumer consumer2;
        z = this.f74177.cancelable;
        if (!z || keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        z2 = this.f74177.canceled;
        if (!z2) {
            if (System.currentTimeMillis() - this.f74176 < 2000) {
                this.f74177.canceled = true;
                consumer = this.f74177.onCancelListener;
                if (consumer != null) {
                    consumer2 = this.f74177.onCancelListener;
                    consumer2.mo12762accept(this.f74177);
                }
            } else {
                this.f74177.pluginUI.showToast("{press_again_to_cancel}");
                this.f74176 = System.currentTimeMillis();
            }
        }
        return true;
    }
}
