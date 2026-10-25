package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/* compiled from: N5UC */
/* renamed from: l.ۨܽܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C11830 extends ListView {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f35296;

    public C11830(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C11830(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28918(int i) {
        this.f35296 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m28917() {
        return this.f35296;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f35296 > 0) {
            int size = View.MeasureSpec.getSize(i2);
            int i3 = this.f35296;
            if (size > i3) {
                i2 = View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(i2));
            }
        }
        super.onMeasure(i, i2);
    }
}
