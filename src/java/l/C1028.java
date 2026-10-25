package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: L5HA */
/* renamed from: l.֨ۢ֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C1028 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f3757;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f3758;

    public C1028(View view, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C12317.f36871, i, 0);
        this.f3757 = obtainStyledAttributes.getBoolean(0, false);
        this.f3758 = obtainStyledAttributes.getInt(1, -1);
        obtainStyledAttributes.recycle();
    }

    public C1028() {
        this.f3757 = false;
        this.f3758 = -1;
    }
}
