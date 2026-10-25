package l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: 313O */
/* renamed from: l.ۖ۠ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC2411 extends AbstractC3255 implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f7683;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3822 f7684;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C8761 f7685;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ImageView f7686;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC2411(C3822 c3822, View view) {
        super(view);
        this.f7684 = c3822;
        this.f7683 = (TextView) view.findViewById(R.id.textView1);
        this.f7686 = (ImageView) view.findViewById(R.id.MT_Protector_res_0x7f0a0288);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC15815 interfaceC15815;
        C5732 c5732;
        DialogInterfaceC0206 dialogInterfaceC0206;
        C3822 c3822 = this.f7684;
        interfaceC15815 = c3822.f12241;
        c5732 = c3822.f12236;
        C8761 c8761 = this.f7685;
        interfaceC15815.mo5716(c5732, c8761.f26709, c8761.f26710);
        dialogInterfaceC0206 = c3822.f12238;
        dialogInterfaceC0206.dismiss();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        InterfaceC15815 interfaceC15815;
        C5732 c5732;
        C3822 c3822 = this.f7684;
        interfaceC15815 = c3822.f12241;
        c5732 = c3822.f12236;
        C8761 c8761 = this.f7685;
        interfaceC15815.mo5715(view, c5732, c8761.f26709, c8761.f26710);
        return true;
    }
}
