package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: Y184 */
/* renamed from: l.ۗ᩺ܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3550 extends BaseAdapter {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6372 f11284;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C3550(ActivityC6372 activityC6372) {
        this.f11284 = activityC6372;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C9195 c9195;
        c9195 = this.f11284.f19708;
        return c9195.f27871.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        C9195 c9195;
        ActivityC6372 activityC6372 = this.f11284;
        if (view == null) {
            view = activityC6372.getLayoutInflater().inflate(R.layout.MT_Protector_res_0x7f0d0152, viewGroup, false);
            C18342.m42765(view);
            textView = (TextView) view.findViewById(R.id.textView1);
            view.setTag(textView);
        } else {
            textView = (TextView) view.getTag();
        }
        c9195 = activityC6372.f19708;
        textView.setText(((C21190) c9195.f27871.get(i)).m48140());
        return view;
    }
}
