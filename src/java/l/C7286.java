package l;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: H5BW */
/* renamed from: l.۟ۛܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7286 implements AdapterView.OnItemSelectedListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9569 f22367;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C7286(C9569 c9569) {
        this.f22367 = c9569;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C9569.m24444(this.f22367, i);
    }
}
