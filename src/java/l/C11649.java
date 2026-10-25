package l;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: 31K1 */
/* renamed from: l.ۨۤ᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11649 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f34740;

    public C11649(ActivityC17169 activityC17169) {
        this.f34740 = activityC17169;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ArrayList arrayList;
        TextView textView;
        int i2;
        TextView textView2;
        View view;
        ImageView imageView;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        C16557 c16557;
        ImageView imageView2;
        TextView textView6;
        TextView textView7;
        TextView textView8;
        View view2;
        ViewOnClickListenerC17875 viewOnClickListenerC17875 = (ViewOnClickListenerC17875) abstractC3255;
        ActivityC17169 activityC17169 = this.f34740;
        arrayList = activityC17169.f52616;
        AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(i);
        Drawable m34238 = abstractC14346.m34238();
        textView = viewOnClickListenerC17875.f54591;
        textView.setText(abstractC14346.mo14422());
        i2 = activityC17169.f52618;
        if (i2 == i) {
            textView8 = viewOnClickListenerC17875.f54591;
            textView8.setTextColor(C21943.f70257);
            view2 = viewOnClickListenerC17875.f54596;
            view2.setBackgroundColor(C21943.f70257 & 553648127);
            m34238.setColorFilter(C21943.f70257, PorterDuff.Mode.SRC_IN);
        } else {
            textView2 = viewOnClickListenerC17875.f54591;
            textView2.setTextColor(C21943.f70275);
            view = viewOnClickListenerC17875.f54596;
            view.setBackgroundColor(0);
            m34238.setColorFilter(C21943.f70284, PorterDuff.Mode.SRC_IN);
        }
        imageView = viewOnClickListenerC17875.f54595;
        imageView.setImageDrawable(m34238);
        String mo14419 = abstractC14346.mo14419();
        if (mo14419 == null) {
            textView6 = viewOnClickListenerC17875.f54591;
            textView6.setTextSize(17.0f);
            textView7 = viewOnClickListenerC17875.f54592;
            textView7.setVisibility(8);
        } else {
            textView3 = viewOnClickListenerC17875.f54591;
            textView3.setTextSize(15.0f);
            textView4 = viewOnClickListenerC17875.f54592;
            textView4.setVisibility(0);
            textView5 = viewOnClickListenerC17875.f54592;
            textView5.setText(mo14419);
        }
        if (abstractC14346.m34230()) {
            viewOnClickListenerC17875.itemView.setBackgroundColor(C21943.f70303);
        } else {
            viewOnClickListenerC17875.itemView.setBackgroundColor(0);
        }
        c16557 = activityC17169.f52599;
        imageView2 = viewOnClickListenerC17875.f54597;
        c16557.m38949(imageView2, ActivityC17169.m40323(activityC17169, abstractC14346));
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ActivityC17169 activityC17169 = this.f34740;
        return new ViewOnClickListenerC17875(activityC17169, LayoutInflater.from(activityC17169).inflate(R.layout.MT_Protector_res_0x7f0d0119, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        ArrayList arrayList;
        arrayList = this.f34740.f52616;
        return arrayList.size();
    }
}
