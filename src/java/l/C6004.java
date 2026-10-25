package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import bin.mt.plus.R;

/* compiled from: 31K1 */
/* renamed from: l.ۛۤ᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6004 extends BaseAdapter {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f18443;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence[] f18444;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public C6004(CharSequence[] charSequenceArr, boolean[] zArr) {
        this.f18444 = charSequenceArr;
        this.f18443 = zArr;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f18444.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f18444[i];
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        CheckedTextView checkedTextView = (CheckedTextView) view;
        if (checkedTextView == null) {
            checkedTextView = (CheckedTextView) C13540.m32583(viewGroup, R.layout.MT_Protector_res_0x7f0d0137, viewGroup, false);
        }
        checkedTextView.setText(this.f18444[i]);
        boolean isChecked = checkedTextView.isChecked();
        boolean z = this.f18443[i];
        if (isChecked != z) {
            checkedTextView.setChecked(z);
            return checkedTextView;
        }
        checkedTextView.refreshDrawableState();
        return checkedTextView;
    }
}
