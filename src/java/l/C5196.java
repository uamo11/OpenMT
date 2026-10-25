package l;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bin.mt.plugin.api.ui.PluginFrameLayout;
import bin.mt.plugin.api.ui.PluginView;

/* compiled from: L7NC */
/* renamed from: l.ۚۜ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5196 extends C11546 implements PluginFrameLayout {
    @Override // l.C11546
    /* renamed from: ֫ */
    public final void mo13241(PluginView pluginView) {
        C7312 c7312 = (C7312) pluginView;
        this.f34470.add(pluginView);
        ViewGroup.LayoutParams layoutParams = c7312.f22448.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            c7312.f22448.setLayoutParams(new FrameLayout.LayoutParams(layoutParams2.width, layoutParams2.height, layoutParams2.gravity));
        }
        ((FrameLayout) this.f22448).addView(c7312.f22448);
    }
}
