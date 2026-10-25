package l;

import bin.mt.plugin.api.ui.PluginCompoundButton;

/* compiled from: K7RF */
/* renamed from: l.᩶ۜ᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20013 implements PluginCompoundButton.OnCheckedChangeListener {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4490 f64826;

    public C20013(C4490 c4490) {
        this.f64826 = c4490;
    }

    @Override // bin.mt.plugin.api.ui.PluginCompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(PluginCompoundButton pluginCompoundButton, boolean z) {
        C22129 c22129;
        C22129 c221292;
        if (z) {
            C4490 c4490 = this.f64826;
            c22129 = c4490.f14289;
            if (c22129 != null) {
                c221292 = c4490.f14289;
                c221292.setChecked(false);
            }
            c4490.m13240((C22129) pluginCompoundButton);
        }
    }
}
