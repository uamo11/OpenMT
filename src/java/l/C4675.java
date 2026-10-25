package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: J6WT */
/* renamed from: l.ۙ۬᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4675 extends AbstractC3255 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TextView f14858;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TextView f14859;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3264 f14860;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4675(C3264 c3264, View view) {
        super(view);
        this.f14860 = c3264;
        this.f14859 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        this.f14858 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a013d);
        C19890.m45741(view);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.᩶۬᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C19379 c19379;
                C19379 c193792;
                C4675 c4675 = C4675.this;
                C3264 c32642 = c4675.f14860;
                int bindingAdapterPosition = c4675.getBindingAdapterPosition();
                if (bindingAdapterPosition > 0) {
                    c19379 = c32642.f10243;
                    if (bindingAdapterPosition <= c19379.f62726.size()) {
                        c193792 = c32642.f10243;
                        C3264.m9997(c32642, ((C18673) c193792.f62726.get(bindingAdapterPosition - 1)).f59011);
                    }
                }
            }
        });
    }
}
