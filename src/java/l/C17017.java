package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: QB4F */
/* renamed from: l.ܿ֨ܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17017 implements AdapterView.OnItemSelectedListener {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17723 f52179;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20546 f52180;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f52181;

    public C17017(AbstractC20546 abstractC20546, AtomicBoolean atomicBoolean, C17723 c17723) {
        this.f52180 = abstractC20546;
        this.f52181 = atomicBoolean;
        this.f52179 = c17723;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Spinner spinner;
        EditText editText;
        EditText editText2;
        EditText editText3;
        AbstractC20546 abstractC20546 = this.f52180;
        spinner = abstractC20546.f66190;
        int count = spinner.getAdapter().getCount() - 1;
        C17723 c17723 = this.f52179;
        AtomicBoolean atomicBoolean = this.f52181;
        if (i != count) {
            if (atomicBoolean.compareAndSet(true, false)) {
                editText3 = abstractC20546.f66192;
                editText3.setEnabled(false);
                c17723.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (atomicBoolean.compareAndSet(false, true)) {
            editText2 = abstractC20546.f66192;
            editText2.setEnabled(true);
            c17723.notifyDataSetChanged();
        }
        editText = abstractC20546.f66192;
        editText.requestFocus();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        this.f52181.set(false);
        this.f52179.notifyDataSetChanged();
    }
}
