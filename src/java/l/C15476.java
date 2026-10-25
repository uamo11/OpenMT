package l;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: E5ZZ */
/* renamed from: l.ܶ᩷ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15476 extends ViewOutlineProvider {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21828 f47353;

    public C15476(C21828 c21828) {
        this.f47353 = c21828;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        RectF rectF;
        int i = C21828.f69924;
        Rect rect = new Rect();
        rectF = this.f47353.f69926;
        rectF.roundOut(rect);
        outline.setRoundRect(rect, rect.width() / 2.0f);
    }
}
