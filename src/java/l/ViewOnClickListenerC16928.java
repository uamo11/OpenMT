package l;

import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: O8UQ */
/* renamed from: l.ܽ᩹ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC16928 extends AbstractC3255 implements View.OnClickListener {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18340 f51991;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f51992;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Animatable f51993;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TextView f51994;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39772(int i) {
        C18340 c18340 = this.f51991;
        String str = ((C11197) c18340.get(i)).f33614;
        TextView textView = this.f51994;
        textView.setText(str);
        int mo16336 = c18340.mo16336();
        ImageView imageView = this.f51992;
        Animatable animatable = this.f51993;
        if (i == mo16336) {
            textView.setTextColor(C21943.f70257);
            imageView.setVisibility(0);
            if (C21100.f68044.m1662() == Boolean.TRUE) {
                if (animatable.isRunning()) {
                    return;
                }
                animatable.start();
                return;
            } else {
                if (animatable.isRunning()) {
                    animatable.stop();
                    return;
                }
                return;
            }
        }
        textView.setTextColor(C21943.f70275);
        imageView.setVisibility(8);
        if (animatable.isRunning()) {
            animatable.stop();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC16928(C18340 c18340, View view) {
        super(view);
        this.f51991 = c18340;
        this.f51994 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a03d6);
        ImageView imageView = (ImageView) view.findViewById(R.id.MT_Protector_res_0x7f0a043c);
        this.f51992 = imageView;
        this.f51993 = (Animatable) imageView.getDrawable();
        view.setOnClickListener(this);
        C19890.m45744(view);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C6988 c6988;
        C6988 c69882;
        int bindingAdapterPosition = getBindingAdapterPosition();
        C18340 c18340 = this.f51991;
        int mo16336 = c18340.mo16336();
        if (bindingAdapterPosition != mo16336) {
            c69882 = c18340.f56997;
            if (c69882.m18914(bindingAdapterPosition)) {
                this.f51992.setVisibility(0);
                AbstractC19902 bindingAdapter = getBindingAdapter();
                C11003.requireNonNull(bindingAdapter);
                bindingAdapter.notifyItemChanged(mo16336);
                return;
            }
            return;
        }
        c6988 = c18340.f56997;
        c6988.m18916();
    }
}
