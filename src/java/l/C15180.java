package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: O607 */
/* renamed from: l.ܶۧ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C15180 extends ViewGroup.MarginLayoutParams {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f46371;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f46372;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f46373;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f46374;

    public C15180(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46371 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13064.f39103);
        this.f46371 = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }
}
