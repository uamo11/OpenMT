package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: 14V2 */
/* renamed from: l.᩹᩶ܽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22517 extends BaseAdapter {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC20401 f72866;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C22517(ActivityC20401 activityC20401) {
        this.f72866 = activityC20401;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List list;
        list = this.f72866.f65838;
        return list.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        List list;
        ActivityC20401 activityC20401 = this.f72866;
        if (view == null) {
            view = activityC20401.getLayoutInflater().inflate(R.layout.MT_Protector_res_0x7f0d0152, viewGroup, false);
            C18342.m42765(view);
            textView = (TextView) view.findViewById(R.id.textView1);
            view.setTag(textView);
        } else {
            textView = (TextView) view.getTag();
        }
        list = activityC20401.f65838;
        textView.setText(((C19866) list.get(i)).m45696());
        return view;
    }
}
