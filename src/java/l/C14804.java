package l;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* compiled from: W5UQ */
/* renamed from: l.ܳ᩹, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14804 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f45197 = new ThreadLocal();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f45198 = new ThreadLocal();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35212(C18333 c18333, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal = f45197;
        Matrix matrix = (Matrix) threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        m35211(c18333, view, matrix);
        ThreadLocal threadLocal2 = f45198;
        RectF rectF = (RectF) threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35211(C18333 c18333, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != c18333) {
            m35211(c18333, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
