package l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: H5MU */
/* renamed from: l.ܳܶܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractViewOnLongClickListenerC14606 extends AbstractC3255 implements View.OnLongClickListener, View.OnTouchListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final TextView f44700;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f44701;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final View f44702;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final TextView f44703;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10402 f44704;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f44705;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ImageView f44706;

    public boolean onLongClick(View view) {
        return false;
    }

    /* renamed from: ֫ */
    public boolean mo29330() {
        return this instanceof C18841;
    }

    public AbstractViewOnLongClickListenerC14606(AbstractActivityC3346 abstractActivityC3346, View view) {
        super(view);
        this.f44701 = C21943.f70295;
        this.f44705 = abstractActivityC3346;
        C19890.m45741(view);
        view.setOnLongClickListener(this);
        this.f44702 = view.findViewById(R.id.MT_Protector_res_0x7f0a0445);
        this.f44704 = (C10402) view.findViewById(R.id.icon);
        this.f44703 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a03d6);
        this.f44700 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a03b2);
        ImageView imageView = (ImageView) view.findViewById(R.id.drag);
        this.f44706 = imageView;
        if (imageView != null) {
            imageView.setOnTouchListener(this);
            imageView.setFocusable(true);
            imageView.setClickable(true);
            Drawable m3234 = C0881.m3234(abstractActivityC3346, R.drawable.MT_Protector_res_0x7f0801ee);
            C11003.requireNonNull(m3234);
            Drawable mutate = m3234.mutate();
            mutate.setAlpha(119);
            imageView.setImageDrawable(mutate);
        }
    }

    /* renamed from: ֫ */
    public void mo32019(Resources.Theme theme) {
        C19890.m45741(this.itemView);
        this.f44703.setTextColor(C21943.f70275);
        TextView textView = this.f44700;
        if (textView != null) {
            textView.setTextColor(C21943.f70273);
        }
        ImageView imageView = this.f44706;
        if (imageView != null) {
            Drawable m3234 = C0881.m3234(this.f44705, R.drawable.MT_Protector_res_0x7f0801ee);
            C11003.requireNonNull(m3234);
            Drawable mutate = m3234.mutate();
            mutate.setAlpha(119);
            imageView.setImageDrawable(mutate);
        }
    }

    /* renamed from: ֫ */
    public boolean mo29331(AbstractC3255 abstractC3255) {
        throw new RuntimeException("Don't support");
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view != this.f44706 || motionEvent.getActionMasked() != 0 || view.getVisibility() != 0) {
            return false;
        }
        AbstractC19902 bindingAdapter = getBindingAdapter();
        if (!(bindingAdapter instanceof C3318)) {
            return false;
        }
        ((C3318) bindingAdapter).m10152(this);
        return true;
    }
}
