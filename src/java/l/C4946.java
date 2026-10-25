package l;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: A92H */
/* renamed from: l.ۙ᩹᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4946 implements AdapterView.OnItemSelectedListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13412 f15582;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String[] f15583;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C4946(C13412 c13412, String[] strArr) {
        this.f15582 = c13412;
        this.f15583 = strArr;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        View view2;
        View view3;
        boolean equals = this.f15583[i].equals("exec-script");
        C13412 c13412 = this.f15582;
        if (equals) {
            view3 = c13412.f40094;
            view3.setVisibility(0);
        } else {
            view2 = c13412.f40094;
            view2.setVisibility(8);
        }
    }
}
