package l;

import android.graphics.Rect;
import android.view.View;

/* compiled from: RB93 */
/* renamed from: l.֡ܳ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class RunnableC0465 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Rect f2033;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f2034;

    public RunnableC0465(AbstractC16176 abstractC16176, View view, Rect rect) {
        this.f2034 = view;
        this.f2033 = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC16176.m38113(this.f2033, this.f2034);
    }
}
