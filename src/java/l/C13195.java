package l;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import bin.mt.plus.R;

/* compiled from: R4LW */
/* renamed from: l.۬ܶܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13195 extends AbstractViewOnLongClickListenerC14606 {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractViewOnClickListenerC12490 f39457;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ImageView f39458;

    public C13195(AbstractActivityC3346 abstractActivityC3346, View view) {
        super(abstractActivityC3346, view);
        ImageView imageView = (ImageView) view.findViewById(R.id.MT_Protector_res_0x7f0a0277);
        this.f39458 = imageView;
        imageView.setImageResource(R.drawable.MT_Protector_res_0x7f08011d);
    }

    @Override // l.AbstractViewOnLongClickListenerC14606
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo32019(Resources.Theme theme) {
        C19890.m45741(this.itemView);
        this.f44703.setTextColor(C21943.f70273);
        this.f39458.setImageResource(R.drawable.MT_Protector_res_0x7f08011d);
    }
}
