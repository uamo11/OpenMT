package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: T8WR */
/* renamed from: l.ۘۜۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC3775 extends AbstractC3255 implements View.OnClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public TextView f11909;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16157 f11910;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C2364 f11911;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f11912;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public TextView[] f11913;

    public ViewOnClickListenerC3775(AbstractActivityC3346 abstractActivityC3346, AbstractC16157 abstractC16157, View view) {
        super(view);
        TextView[] textViewArr = {(TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a00a3), (TextView) view.findViewById(R.id.button1), (TextView) view.findViewById(R.id.button2), (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a00a6)};
        this.f11913 = textViewArr;
        this.f11912 = abstractActivityC3346;
        this.f11910 = abstractC16157;
        this.f11909 = (TextView) view.findViewById(R.id.text);
        textViewArr[0].setOnClickListener(this);
        textViewArr[1].setOnClickListener(this);
        textViewArr[2].setOnClickListener(this);
        textViewArr[3].setOnClickListener(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11431(C2364 c2364) {
        this.f11911 = c2364;
        String m7681 = c2364.m7681();
        AbstractC16157 abstractC16157 = this.f11910;
        TextView textView = this.f11909;
        abstractC16157.mo38090(textView, m7681);
        int m7679 = c2364.m7679();
        TextView[] textViewArr = this.f11913;
        int length = textViewArr.length;
        for (int i = 0; i < length; i++) {
            TextView textView2 = textViewArr[i];
            if (i < m7679) {
                textView2.setVisibility(0);
                textView2.setText(c2364.m7682(i));
                if (c2364.m7680(i).m37180() != 0) {
                    textView2.setTextColor(C21943.f70257);
                    textView2.setEnabled(true);
                } else {
                    textView2.setTextColor(C21943.f70273);
                    textView2.setEnabled(false);
                }
            } else {
                textView2.setVisibility(8);
            }
        }
        textView.setTextIsSelectable(false);
        C4925.m14309(200L, new RunnableC16460(2, this, c2364));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11430(ViewOnClickListenerC3775 viewOnClickListenerC3775, C2364 c2364) {
        TextView textView = viewOnClickListenerC3775.f11909;
        if (viewOnClickListenerC3775.f11911 != c2364 || textView.isTextSelectable()) {
            return;
        }
        textView.setTextIsSelectable(true);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int m7679 = this.f11911.m7679();
        TextView[] textViewArr = this.f11913;
        int min = Math.min(m7679, textViewArr.length);
        for (int i = 0; i < min; i++) {
            if (view == textViewArr[i]) {
                this.f11911.m7680(i).mo5599(this.f11912);
            }
        }
    }
}
