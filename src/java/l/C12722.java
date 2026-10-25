package l;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: Y184 */
/* renamed from: l.۫᩺ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12722 implements AdapterView.OnItemSelectedListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10606 f38275;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C12722(C10606 c10606) {
        this.f38275 = c10606;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f38275.m26625(i);
    }
}
