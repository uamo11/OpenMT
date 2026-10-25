package l;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* compiled from: 422Y */
/* renamed from: l.ۖܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC2580 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public BroadcastReceiver f8165;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C5402 f8166;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract IntentFilter mo8179();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract void mo8180();

    public AbstractC2580(LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402) {
        this.f8166 = layoutInflaterFactory2C5402;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m8181() {
        m8178();
        IntentFilter mo8179 = mo8179();
        if (mo8179.countActions() == 0) {
            return;
        }
        if (this.f8165 == null) {
            this.f8165 = new C15984(this);
        }
        this.f8166.f16822.registerReceiver(this.f8165, mo8179);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8178() {
        BroadcastReceiver broadcastReceiver = this.f8165;
        if (broadcastReceiver != null) {
            try {
                this.f8166.f16822.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.f8165 = null;
        }
    }
}
