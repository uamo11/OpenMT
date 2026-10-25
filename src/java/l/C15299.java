package l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: V1C0 */
/* renamed from: l.ܶܶ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15299 extends ViewOutlineProvider {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22356 f46938;

    public C15299(C22356 c22356) {
        this.f46938 = c22356;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float f;
        C22356 c22356 = this.f46938;
        int width = c22356.getWidth();
        int height = c22356.getHeight();
        float min = Math.min(width, height);
        f = c22356.f72427;
        outline.setRoundRect(0, 0, width, height, (min * f) / 2.0f);
    }
}
