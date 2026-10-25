package l;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import bin.mt.plus.R;

/* compiled from: I69B */
/* renamed from: l.ᩳܶۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C18134 extends C19546 {

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public final AdapterView.OnItemSelectedListener f56414;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public final ArrayAdapter f56415;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public Spinner f56416;

    public C18134(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector_res_0x7f0401b3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18134(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f56414 = new C16722(this);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f56415 = arrayAdapter;
        arrayAdapter.clear();
        if (m44958() != null) {
            for (CharSequence charSequence : m44958()) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // l.AbstractC11079, l.C2095
    /* renamed from: ۛ */
    public final void mo6908() {
        this.f56416.performClick();
    }

    @Override // l.C2095
    /* renamed from: ۬ */
    public final void mo6922() {
        super.mo6922();
        ArrayAdapter arrayAdapter = this.f56415;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // l.C2095
    /* renamed from: ֫ */
    public final void mo2792(C21167 c21167) {
        int i;
        Spinner spinner = (Spinner) c21167.itemView.findViewById(R.id.spinner);
        this.f56416 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f56415);
        this.f56416.setOnItemSelectedListener(this.f56414);
        Spinner spinner2 = this.f56416;
        String value = getValue();
        CharSequence[] m44953 = m44953();
        if (value != null && m44953 != null) {
            i = m44953.length;
            do {
                i--;
                if (i >= 0) {
                }
            } while (!TextUtils.equals(m44953[i].toString(), value));
            spinner2.setSelection(i);
            super.mo2792(c21167);
        }
        i = -1;
        spinner2.setSelection(i);
        super.mo2792(c21167);
    }
}
