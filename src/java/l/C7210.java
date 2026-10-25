package l;

import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: D7B1 */
/* renamed from: l.۟ۗ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7210 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11026 f22065;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f22066 = new ArrayList();

    public C7210(C11026 c11026) {
        this.f22065 = c11026;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ((ViewOnClickListenerC1853) abstractC3255).m6162((C20864) this.f22066.get(i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19296(List list) {
        ArrayList arrayList = this.f22066;
        arrayList.clear();
        arrayList.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19295() {
        this.f22066.clear();
        notifyDataSetChanged();
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC1853(this.f22065, C13540.m32583(viewGroup, R.layout.MT_Protector_res_0x7f0d0144, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f22066.size();
    }
}
