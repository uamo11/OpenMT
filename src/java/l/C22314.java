package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;

/* compiled from: J6WT */
/* renamed from: l.᩹۬᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22314 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3264 f72331;

    @Override // l.AbstractC19902
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public C22314(C3264 c3264) {
        this.f72331 = c3264;
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractActivityC3346 abstractActivityC3346;
        C3264 c3264 = this.f72331;
        abstractActivityC3346 = c3264.f10236;
        LayoutInflater from = LayoutInflater.from(abstractActivityC3346);
        if (i == 0) {
            return new C21609(from.inflate(R.layout.MT_Protector_res_0x7f0d00d2, viewGroup, false));
        }
        return new C4675(c3264, from.inflate(R.layout.MT_Protector_res_0x7f0d0160, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        C19379 c19379;
        C3264 c3264 = this.f72331;
        if (i == 0) {
            C3264.m9983(c3264, abstractC3255.itemView);
            return;
        }
        c19379 = c3264.f10243;
        C18673 c18673 = (C18673) c19379.f62726.get(i - 1);
        C4675 c4675 = (C4675) abstractC3255;
        c4675.f14859.setText(c18673.f59008);
        c4675.f14858.setText(c18673.f59011);
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        C19379 c19379;
        c19379 = this.f72331.f10243;
        return c19379.f62726.size() + 1;
    }
}
