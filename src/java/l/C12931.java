package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: C4QU */
/* renamed from: l.۬ۛܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12931 extends BaseAdapter {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14507 f38798;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C12931(C14507 c14507) {
        this.f38798 = c14507;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List list;
        list = this.f38798.f44484;
        return ((ArrayList) list).size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        List list;
        list = this.f38798.f44484;
        return ((ArrayList) list).get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        TextView textView2;
        List list;
        AbstractActivityC3346 abstractActivityC3346;
        C14507 c14507 = this.f38798;
        if (view == null) {
            abstractActivityC3346 = c14507.f44483;
            view = abstractActivityC3346.getLayoutInflater().inflate(R.layout.MT_Protector_res_0x7f0d0143, viewGroup, false);
            textView = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a0631);
            textView2 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a0533);
            view.setTag(textView);
            textView.setTag(textView2);
        } else {
            textView = (TextView) view.getTag();
            textView2 = (TextView) textView.getTag();
        }
        list = c14507.f44484;
        C23680 c23680 = (C23680) ((ArrayList) list).get(i);
        textView.setText(c23680.f76709);
        textView2.setText(c23680.f76708);
        return view;
    }
}
