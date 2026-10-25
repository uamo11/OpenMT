package l;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: 75NJ */
/* renamed from: l.ۤۚᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10091 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f30381;

    public C10091(ActivityC16315 activityC16315) {
        this.f30381 = activityC16315;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ArrayList arrayList;
        TextView textView;
        int i2;
        TextView textView2;
        View view;
        ImageView imageView;
        String str;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        C16557 c16557;
        ImageView imageView2;
        TextView textView6;
        TextView textView7;
        TextView textView8;
        View view2;
        ViewOnClickListenerC10672 viewOnClickListenerC10672 = (ViewOnClickListenerC10672) abstractC3255;
        ActivityC16315 activityC16315 = this.f30381;
        arrayList = activityC16315.f50241;
        C22372 c22372 = (C22372) arrayList.get(i);
        Drawable m5422 = c22372.m5422();
        String m50238 = c22372.m50238();
        if (c22372.mo5419()) {
            SpannableString spannableString = new SpannableString(m50238);
            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 17);
            m50238 = spannableString;
        }
        textView = viewOnClickListenerC10672.f32093;
        textView.setText(m50238);
        i2 = activityC16315.f50246;
        if (i2 == i) {
            textView8 = viewOnClickListenerC10672.f32093;
            textView8.setTextColor(C21943.f70257);
            view2 = viewOnClickListenerC10672.f32098;
            view2.setBackgroundColor(C21943.f70257 & 553648127);
            m5422.setColorFilter(C21943.f70257, PorterDuff.Mode.SRC_IN);
        } else {
            textView2 = viewOnClickListenerC10672.f32093;
            textView2.setTextColor(C21943.f70275);
            view = viewOnClickListenerC10672.f32098;
            view.setBackgroundColor(0);
            m5422.setColorFilter(C21943.f70284, PorterDuff.Mode.SRC_IN);
        }
        imageView = viewOnClickListenerC10672.f32097;
        imageView.setImageDrawable(m5422);
        try {
            str = C6554.m18061(150, c22372.m5420().f15019.mo23554());
        } catch (Exception unused) {
            str = null;
        }
        if (str == null) {
            textView6 = viewOnClickListenerC10672.f32093;
            textView6.setTextSize(17.0f);
            textView7 = viewOnClickListenerC10672.f32094;
            textView7.setVisibility(8);
        } else {
            textView3 = viewOnClickListenerC10672.f32093;
            textView3.setTextSize(15.0f);
            textView4 = viewOnClickListenerC10672.f32094;
            textView4.setVisibility(0);
            textView5 = viewOnClickListenerC10672.f32094;
            textView5.setText(str);
        }
        if (c22372.m5413()) {
            viewOnClickListenerC10672.itemView.setBackgroundColor(C21943.f70303);
        } else {
            viewOnClickListenerC10672.itemView.setBackgroundColor(0);
        }
        c16557 = activityC16315.f50244;
        imageView2 = viewOnClickListenerC10672.f32099;
        c16557.m38949(imageView2, true);
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC16315 activityC16315 = this.f30381;
        return new ViewOnClickListenerC10672(activityC16315, LayoutInflater.from(activityC16315).inflate(R.layout.MT_Protector_res_0x7f0d0119, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        ArrayList arrayList;
        arrayList = this.f30381.f50241;
        return arrayList.size();
    }
}
