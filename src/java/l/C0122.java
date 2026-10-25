package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: W5L3 */
/* renamed from: l.֡ۖۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0122 extends BaseAdapter {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5062 f1221;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C0122(C5062 c5062) {
        this.f1221 = c5062;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        boolean z;
        boolean z2;
        C0828 c0828;
        C0828 c08282;
        C0828 c08283;
        List list;
        List list2;
        C0828 c08284;
        C0828 c08285;
        C5062 c5062 = this.f1221;
        z = c5062.f15917;
        if (!z) {
            c08284 = c5062.f15919;
            int min = Math.min(100, c08284.m3093());
            c08285 = c5062.f15919;
            return min + (c08285.m3093() > 10 ? 1 : 0);
        }
        z2 = c5062.f15921;
        if (z2) {
            list = c5062.f15915;
            if (list.isEmpty()) {
                return 2;
            }
            list2 = c5062.f15915;
            return list2.size() + 1;
        }
        c0828 = c5062.f15919;
        if (c0828.m3093() == 0) {
            return 2;
        }
        c08282 = c5062.f15919;
        int min2 = Math.min(100, c08282.m3093()) + 1;
        c08283 = c5062.f15919;
        return min2 + (c08283.m3093() > 10 ? 1 : 0);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ViewOnClickListenerC19174 viewOnClickListenerC19174;
        boolean z;
        boolean z2;
        C0828 c0828;
        C0828 c08282;
        C0828 c08283;
        C0828 c08284;
        C0828 c08285;
        List list;
        List list2;
        List list3;
        C5062 c5062 = this.f1221;
        if (view == null) {
            view = LayoutInflater.from(c5062.getContext()).inflate(R.layout.MT_Protector_res_0x7f0d013e, viewGroup, false);
            viewOnClickListenerC19174 = new ViewOnClickListenerC19174(c5062, view);
            view.setTag(viewOnClickListenerC19174);
        } else {
            viewOnClickListenerC19174 = (ViewOnClickListenerC19174) view.getTag();
        }
        z = c5062.f15921;
        if (z) {
            list = c5062.f15915;
            if (list.isEmpty() && i == 0) {
                String m14327 = C4925.m14327(R.string.MT_Protector_res_0x7f1206ae);
                viewOnClickListenerC19174.f60422 = 4;
                viewOnClickListenerC19174.f60427.setVisibility(4);
                TextView textView = viewOnClickListenerC19174.f60424;
                textView.setText(m14327);
                textView.setTextColor(C21943.f70273);
                return view;
            }
            list2 = c5062.f15915;
            if (i >= list2.size()) {
                viewOnClickListenerC19174.m44254(3);
                return view;
            }
            list3 = c5062.f15915;
            C7569 c7569 = (C7569) list3.get(i);
            viewOnClickListenerC19174.f60422 = 1;
            viewOnClickListenerC19174.f60421 = i;
            viewOnClickListenerC19174.f60428 = c7569;
            viewOnClickListenerC19174.f60427.setVisibility(4);
            String m20289 = c7569.m20289();
            TextView textView2 = viewOnClickListenerC19174.f60424;
            textView2.setText(m20289);
            textView2.setTextColor(C21943.f70275);
            return view;
        }
        z2 = c5062.f15917;
        if (!z2) {
            if (i >= 10) {
                c08285 = c5062.f15919;
                if (i == Math.min(100, c08285.m3093())) {
                    viewOnClickListenerC19174.m44254(5);
                    return view;
                }
            }
            c08284 = c5062.f15919;
            viewOnClickListenerC19174.m44255(i, c08284.m3083(i));
            return view;
        }
        c0828 = c5062.f15919;
        if (c0828.m3093() == 0) {
            if (i == 0) {
                viewOnClickListenerC19174.m44254(2);
                return view;
            }
            String m143272 = C4925.m14327(R.string.MT_Protector_res_0x7f1204aa);
            viewOnClickListenerC19174.f60422 = 4;
            viewOnClickListenerC19174.f60427.setVisibility(4);
            TextView textView3 = viewOnClickListenerC19174.f60424;
            textView3.setText(m143272);
            textView3.setTextColor(C21943.f70273);
            return view;
        }
        if (i == 0) {
            viewOnClickListenerC19174.m44254(2);
            return view;
        }
        int i2 = i - 1;
        if (i2 >= 10) {
            c08283 = c5062.f15919;
            if (i2 == Math.min(100, c08283.m3093())) {
                viewOnClickListenerC19174.m44254(5);
                return view;
            }
        }
        c08282 = c5062.f15919;
        viewOnClickListenerC19174.m44255(i2, c08282.m3083(i2));
        return view;
    }
}
