package l;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* compiled from: BB1T */
/* renamed from: l.۬ܿ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13249 implements TransformationMethod {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TransformationMethod f39677;

    public C13249(TransformationMethod transformationMethod) {
        this.f39677 = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f39677;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C6921.m18717().m18718() != 1) {
            return charSequence;
        }
        C6921 m18717 = C6921.m18717();
        m18717.getClass();
        return m18717.m18719(0, charSequence.length(), charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f39677;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TransformationMethod m32157() {
        return this.f39677;
    }
}
