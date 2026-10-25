package l;

import android.view.View;
import android.widget.AdapterView;
import java.util.function.IntConsumer;

/* compiled from: PAKQ */
/* renamed from: l.᩸ۨܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21564 implements AdapterView.OnItemSelectedListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IntConsumer f69291;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C21564(IntConsumer intConsumer) {
        this.f69291 = intConsumer;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f69291.accept(i);
    }
}
