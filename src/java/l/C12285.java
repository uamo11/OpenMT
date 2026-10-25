package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: M5NX */
/* renamed from: l.۫۠ܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12285 extends AbstractViewOnLongClickListenerC14606 {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C5935 f36596;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C12990 f36597;

    public C12285(Main main, View view, C5935 c5935) {
        super(main, view);
        this.f36596 = c5935;
    }

    @Override // l.AbstractViewOnLongClickListenerC14606, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C12990 c12990;
        C9340 m132;
        C5935 c5935 = this.f36596;
        if (c5935.f37526.m10155() || (c12990 = this.f36597) == null || (m132 = c5935.f34527.m132()) == null || !m132.m24079(c12990.mo25527())) {
            return false;
        }
        AbstractActivityC3346 abstractActivityC3346 = this.f44705;
        View view2 = this.f44702;
        C21282 c21282 = new C21282(abstractActivityC3346, view2, 8388611);
        C7716.m20669(view2);
        c21282.m48306();
        c21282.m48304().add(0, R.string.MT_Protector_res_0x7f120189, 0, R.string.MT_Protector_res_0x7f120189).setIcon(R.drawable.MT_Protector_res_0x7f0801dd);
        c21282.m48302(new C9092(this));
        c21282.m48305();
        return true;
    }
}
