package l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: G7AW */
/* renamed from: l.۠۫ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8178 extends BaseAdapter {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final LayoutInflater f25176;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f25177;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f25178;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C8178(AbstractActivityC3346 abstractActivityC3346) {
        this.f25177 = abstractActivityC3346;
        this.f25176 = LayoutInflater.from(abstractActivityC3346);
        m21665();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21665() {
        this.f25178 = ServiceC1618.m5491();
        notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return !this.f25178.isEmpty();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.f25178.isEmpty()) {
            return 1;
        }
        return this.f25178.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (this.f25178.isEmpty()) {
            return null;
        }
        return this.f25178.get(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return !this.f25178.isEmpty();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21664() {
        return this.f25178.isEmpty();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16826 m21663(int i) {
        return (C16826) this.f25178.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        String m40572;
        if (view == null) {
            view = this.f25176.inflate(R.layout.MT_Protector_res_0x7f0d0169, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a03d6);
        TextView textView2 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a0144);
        if (this.f25178.isEmpty()) {
            textView.setText(R.string.MT_Protector_res_0x7f120839);
            textView2.setVisibility(8);
            return view;
        }
        C16826 c16826 = (C16826) this.f25178.get(i);
        String m39568 = c16826.m39568();
        boolean isEmpty = TextUtils.isEmpty(m39568);
        AbstractActivityC3346 abstractActivityC3346 = this.f25177;
        if (isEmpty) {
            m39568 = abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f12084a);
        }
        textView.setText(m39568);
        String string = abstractActivityC3346.getString(c16826.m39573() ? R.string.MT_Protector_res_0x7f12083f : R.string.MT_Protector_res_0x7f120840);
        long m39572 = c16826.m39572();
        if (m39572 <= 0) {
            m40572 = abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f120842);
        } else {
            m40572 = C17283.m40572(m39572);
        }
        textView2.setText(abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f12083b, string, m40572));
        textView2.setVisibility(0);
        return view;
    }
}
