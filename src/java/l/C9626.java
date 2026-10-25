package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: Q69A */
/* renamed from: l.ۢܰۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C9626 extends ViewGroup.LayoutParams {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f29176;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f29177;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f29178;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f29179;

    public C9626() {
        super(-1, -1);
        this.f29179 = 0.0f;
    }

    public C9626(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29179 = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0452.f1967);
        this.f29176 = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
