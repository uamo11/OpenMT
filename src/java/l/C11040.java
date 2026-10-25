package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: G16V */
/* renamed from: l.ۧܰܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11040 extends BaseAdapter {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16683 f33183;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C11040(ActivityC16683 activityC16683) {
        this.f33183 = activityC16683;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List list;
        list = this.f33183.f51210;
        return list.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        List list;
        ActivityC16683 activityC16683 = this.f33183;
        if (view == null) {
            view = activityC16683.getLayoutInflater().inflate(R.layout.MT_Protector_res_0x7f0d0152, viewGroup, false);
            C18342.m42765(view);
            textView = (TextView) view.findViewById(R.id.textView1);
            view.setTag(textView);
        } else {
            textView = (TextView) view.getTag();
        }
        list = activityC16683.f51210;
        textView.setText((CharSequence) list.get(i));
        return view;
    }
}
