package l;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: OB0Y */
/* renamed from: l.۟ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7376 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20306 f22645;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TextView f22646;

    public C7376(TextView textView) {
        this.f22646 = textView;
        this.f22645 = new C20306(textView);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19826(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f22646.getContext().obtainStyledAttributes(attributeSet, C3390.f10706, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            m19830(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19830(boolean z) {
        this.f22645.m46550(z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19828() {
        return this.f22645.m46548();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputFilter[] m19829(InputFilter[] inputFilterArr) {
        return this.f22645.m46549(inputFilterArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19827(boolean z) {
        this.f22645.m46547(z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TransformationMethod m19825(TransformationMethod transformationMethod) {
        return this.f22645.m46546(transformationMethod);
    }
}
