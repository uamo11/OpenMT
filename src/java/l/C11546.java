package l;

import android.view.ViewGroup;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;
import java.util.ArrayList;

/* compiled from: J7R9 */
/* renamed from: l.ۨۜ᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C11546 extends C7312 implements PluginViewGroup {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f34470;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ConcurrentMapC10942 f34471;

    public C11546(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        super(pluginUI, pluginViewGroup);
        this.f34470 = new ArrayList();
    }

    /* renamed from: ֫ */
    public void mo13241(PluginView pluginView) {
        this.f34470.add(pluginView);
        ((ViewGroup) this.f22448).addView(((C7312) pluginView).f22448);
    }

    @Override // l.C7312
    /* renamed from: ֫ */
    public final PluginView mo19596(String str) {
        ConcurrentMapC10942 concurrentMapC10942 = this.f34471;
        if (concurrentMapC10942 != null) {
            return (PluginView) C17997.computeIfAbsent(concurrentMapC10942, str, new C5901(0, this));
        }
        return m28424(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public PluginView m28424(String str) {
        if (str.equals(getId())) {
            return this;
        }
        ArrayList arrayList = this.f34470;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            PluginView findViewById = ((PluginView) arrayList.get(i)).findViewById(str);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28425() {
        this.f34471 = new ConcurrentMapC10942();
    }

    @Override // bin.mt.plugin.api.ui.PluginViewGroup
    public final int getChildCount() {
        return this.f34470.size();
    }

    @Override // bin.mt.plugin.api.ui.PluginViewGroup
    public final PluginView getChildAt(int i) {
        return (PluginView) this.f34470.get(i);
    }
}
