package l;

import android.view.View;
import android.widget.AdapterView;
import java.io.Serializable;

/* compiled from: I69B */
/* renamed from: l.ܽܶۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16722 implements AdapterView.OnItemSelectedListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18134 f51353;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C16722(C18134 c18134) {
        this.f51353 = c18134;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i >= 0) {
            C18134 c18134 = this.f51353;
            String charSequence = c18134.m44953()[i].toString();
            if (charSequence.equals(c18134.getValue())) {
                return;
            }
            c18134.m6893((Serializable) charSequence);
            c18134.m44957(charSequence);
        }
    }
}
