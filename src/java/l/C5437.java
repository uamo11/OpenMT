package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: 4646 */
/* renamed from: l.ۚܶܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5437 extends BaseAdapter {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8259 f16938;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C5437(ActivityC8259 activityC8259) {
        this.f16938 = activityC8259;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C1203 c1203;
        C1203 c12032;
        ActivityC8259 activityC8259 = this.f16938;
        c1203 = activityC8259.f25415;
        boolean z = c1203.f4345;
        c12032 = activityC8259.f25415;
        return z ? c12032.f4342 : c12032.f4340.f46672.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        C1203 c1203;
        C1203 c12032;
        C1203 c12033;
        C1203 c12034;
        ActivityC8259 activityC8259 = this.f16938;
        if (view == null) {
            view = activityC8259.getLayoutInflater().inflate(R.layout.MT_Protector_res_0x7f0d0147, viewGroup, false);
            textView = (TextView) view.findViewById(R.id.textView1);
            view.setTag(textView);
        } else {
            textView = (TextView) view.getTag();
        }
        c1203 = activityC8259.f25415;
        if (c1203.f4345) {
            c12033 = activityC8259.f25415;
            C13260 c13260 = c12033.f4340.f46672;
            c12034 = activityC8259.f25415;
            textView.setText(c13260.m47858(c12034.f4344[i]));
            return view;
        }
        c12032 = activityC8259.f25415;
        textView.setText(c12032.f4340.f46672.m47858(i));
        return view;
    }
}
