package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* compiled from: 81ID */
/* renamed from: l.ۨ۬᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11730 extends BaseAdapter {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f34988;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public DateFormat f34989 = DateFormat.getDateTimeInstance();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1832 f34990;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C11730(C1832 c1832, ActivityC17169 activityC17169) {
        this.f34990 = c1832;
        this.f34988 = activityC17169;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List list;
        list = this.f34990.f6273;
        return ((ArrayList) list).size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        List list;
        if (view == null) {
            view = LayoutInflater.from(this.f34988).inflate(R.layout.MT_Protector_res_0x7f0d0148, viewGroup, false);
        }
        ViewGroup viewGroup2 = (ViewGroup) view;
        TextView textView = (TextView) viewGroup2.getChildAt(0);
        TextView textView2 = (TextView) viewGroup2.getChildAt(1);
        list = this.f34990.f6273;
        C22313 c22313 = (C22313) ((ArrayList) list).get(i);
        textView.setText(c22313.f72330);
        textView2.setText(this.f34989.format(new Date(c22313.f72327)));
        return view;
    }
}
