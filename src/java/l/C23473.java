package l;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: 28VT */
/* renamed from: l.᩻ۙܽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23473 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22062 f75320;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Set f75321 = Collections.newSetFromMap(new WeakHashMap());

    public C23473(ActivityC22062 activityC22062) {
        this.f75320 = activityC22062;
    }

    @Override // l.AbstractC19902
    public final int getItemViewType(int i) {
        List list;
        if (i == 0) {
            return 0;
        }
        int i2 = i - 1;
        list = this.f75320.f70702;
        int max = Math.max(1, list.size());
        return (i2 >= max && i2 - max == 0) ? 1 : 2;
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        TextView textView;
        ActivityC22062 activityC22062 = this.f75320;
        if (i == 0 || i == 1) {
            return new ViewOnClickListenerC20652(activityC22062, LayoutInflater.from(activityC22062).inflate(R.layout.MT_Protector_res_0x7f0d015f, viewGroup, false), i == 0);
        }
        ViewOnClickListenerC21357 viewOnClickListenerC21357 = new ViewOnClickListenerC21357(activityC22062, LayoutInflater.from(activityC22062).inflate(R.layout.MT_Protector_res_0x7f0d015e, viewGroup, false));
        Set set = this.f75321;
        textView = viewOnClickListenerC21357.f68801;
        set.add(textView);
        return viewOnClickListenerC21357;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        List list;
        List list2;
        List list3;
        int size;
        List list4;
        ImageView imageView;
        Drawable drawable;
        TextView textView;
        String str;
        TextView textView2;
        String str2;
        TextView textView3;
        List list5;
        List list6;
        List list7;
        ImageView imageView2;
        Drawable drawable2;
        TextView textView4;
        String str3;
        TextView textView5;
        String str4;
        TextView textView6;
        ImageView imageView3;
        Drawable drawable3;
        TextView textView7;
        TextView textView8;
        ImageView imageView4;
        Drawable drawable4;
        TextView textView9;
        TextView textView10;
        if (abstractC3255 instanceof ViewOnClickListenerC21357) {
            ViewOnClickListenerC21357 viewOnClickListenerC21357 = (ViewOnClickListenerC21357) abstractC3255;
            int i2 = i - 1;
            ActivityC22062 activityC22062 = this.f75320;
            list = activityC22062.f70702;
            if (!list.isEmpty()) {
                list2 = activityC22062.f70702;
                if (i2 < list2.size()) {
                    list4 = activityC22062.f70702;
                    AbstractC13262 abstractC13262 = (AbstractC13262) list4.get(i2);
                    imageView = viewOnClickListenerC21357.f68802;
                    drawable = activityC22062.f70696;
                    imageView.setImageDrawable(drawable);
                    textView = viewOnClickListenerC21357.f68801;
                    textView.setText(abstractC13262.mo10324());
                    str = activityC22062.f70704;
                    if (str != null) {
                        String mo14004 = abstractC13262.mo14004();
                        str2 = activityC22062.f70704;
                        if (mo14004.equals(str2)) {
                            textView3 = viewOnClickListenerC21357.f68801;
                            textView3.setTextColor(C21943.f70291);
                            activityC22062.f70704 = null;
                            viewOnClickListenerC21357.itemView.setClickable(true);
                            viewOnClickListenerC21357.itemView.setLongClickable(true);
                            return;
                        }
                    }
                    textView2 = viewOnClickListenerC21357.f68801;
                    textView2.setTextColor(C21943.f70275);
                    viewOnClickListenerC21357.itemView.setClickable(true);
                    viewOnClickListenerC21357.itemView.setLongClickable(true);
                    return;
                }
                list3 = activityC22062.f70702;
                size = i2 - (list3.size() + 1);
            } else {
                if (i2 == 0) {
                    imageView4 = viewOnClickListenerC21357.f68802;
                    drawable4 = activityC22062.f70696;
                    imageView4.setImageDrawable(drawable4);
                    textView9 = viewOnClickListenerC21357.f68801;
                    textView9.setText(R.string.MT_Protector_res_0x7f1206eb);
                    textView10 = viewOnClickListenerC21357.f68801;
                    textView10.setTextColor(C21943.f70273);
                    viewOnClickListenerC21357.itemView.setClickable(false);
                    viewOnClickListenerC21357.itemView.setLongClickable(false);
                    return;
                }
                size = i - 3;
            }
            list5 = activityC22062.f70699;
            if (list5.isEmpty()) {
                if (size == 0) {
                    imageView3 = viewOnClickListenerC21357.f68802;
                    drawable3 = activityC22062.f70703;
                    imageView3.setImageDrawable(drawable3);
                    textView7 = viewOnClickListenerC21357.f68801;
                    textView7.setText(R.string.MT_Protector_res_0x7f1206eb);
                    textView8 = viewOnClickListenerC21357.f68801;
                    textView8.setTextColor(C21943.f70273);
                    viewOnClickListenerC21357.itemView.setClickable(false);
                    viewOnClickListenerC21357.itemView.setLongClickable(false);
                    return;
                }
                return;
            }
            list6 = activityC22062.f70699;
            if (size < list6.size()) {
                list7 = activityC22062.f70699;
                AbstractC15440 abstractC15440 = (AbstractC15440) list7.get(size);
                imageView2 = viewOnClickListenerC21357.f68802;
                drawable2 = activityC22062.f70703;
                imageView2.setImageDrawable(drawable2);
                textView4 = viewOnClickListenerC21357.f68801;
                textView4.setText(abstractC15440.getName());
                str3 = activityC22062.f70695;
                if (str3 != null) {
                    String name = abstractC15440.getName();
                    str4 = activityC22062.f70695;
                    if (name.equals(str4)) {
                        textView6 = viewOnClickListenerC21357.f68801;
                        textView6.setTextColor(C21943.f70291);
                        activityC22062.f70695 = null;
                        viewOnClickListenerC21357.itemView.setClickable(true);
                        viewOnClickListenerC21357.itemView.setLongClickable(true);
                    }
                }
                textView5 = viewOnClickListenerC21357.f68801;
                textView5.setTextColor(C21943.f70275);
                viewOnClickListenerC21357.itemView.setClickable(true);
                viewOnClickListenerC21357.itemView.setLongClickable(true);
            }
        }
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        List list;
        List list2;
        ActivityC22062 activityC22062 = this.f75320;
        list = activityC22062.f70702;
        int max = Math.max(1, list.size()) + 2;
        list2 = activityC22062.f70699;
        return Math.max(1, list2.size()) + max;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51927() {
        for (TextView textView : this.f75321) {
            if (textView.getCurrentTextColor() == C21943.f70291) {
                textView.setTextColor(C21943.f70275);
            }
        }
    }
}
