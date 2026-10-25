package l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: 515Z */
/* renamed from: l.᩶ۡۡ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C20065 extends C2072 {
    /* renamed from: ֫ */
    public void mo7683(TextView textView, boolean z) {
    }

    public C20065(Context context) {
        super(R.layout.MT_Protector_res_0x7f0d01e6, context, new ArrayList());
    }

    public C20065(Context context, List list) {
        super(R.layout.MT_Protector_res_0x7f0d01e6, context, list);
    }

    @Override // l.C2072, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getView(i, view, viewGroup);
        mo38390(textView, i, false);
        return textView;
    }

    @Override // l.C2072, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getDropDownView(i, view, viewGroup);
        textView.setTextColor(C21943.f70275);
        mo38390(textView, i, true);
        return textView;
    }

    /* renamed from: ֫ */
    public void mo38390(TextView textView, int i, boolean z) {
        mo7683(textView, z);
    }

    public C20065(Context context, Object[] objArr) {
        super(R.layout.MT_Protector_res_0x7f0d01e6, context, Arrays.asList(objArr));
    }
}
