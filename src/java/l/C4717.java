package l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: B1CI */
/* renamed from: l.ۙܶ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4717 extends ViewOutlineProvider {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13183 f14960;

    public C4717(C13183 c13183) {
        this.f14960 = c13183;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float f;
        C13183 c13183 = this.f14960;
        int width = c13183.getWidth();
        int height = c13183.getHeight();
        f = c13183.f39411;
        outline.setRoundRect(0, 0, width, height, f);
    }
}
