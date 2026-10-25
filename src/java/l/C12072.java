package l;

import android.animation.ArgbEvaluator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: K7JY */
/* renamed from: l.۫֨ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12072 extends AbstractC11367 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9956 f36101;

    public C12072(C9956 c9956) {
        this.f36101 = c9956;
    }

    @Override // l.AbstractC11367
    /* renamed from: ֫ */
    public final void mo27171(int i, float f, int i2) {
        float f2;
        float f3;
        ArgbEvaluator argbEvaluator;
        ArgbEvaluator argbEvaluator2;
        boolean z;
        C9956 c9956 = this.f36101;
        ArrayList arrayList = c9956.f13900;
        Object obj = arrayList.get(i);
        C11233.m27803(obj, "get(...)");
        ImageView imageView = (ImageView) obj;
        float m12966 = c9956.m12966();
        float m129662 = c9956.m12966();
        f2 = c9956.f30067;
        float f4 = 1;
        C5722.m16158((int) C20382.m46695(f4, f, (f2 - f4) * m129662, m12966), imageView);
        C11233.m27805(arrayList, "<this>");
        if (i2 >= 0 && i2 < arrayList.size()) {
            Object obj2 = arrayList.get(i2);
            C11233.m27803(obj2, "get(...)");
            ImageView imageView2 = (ImageView) obj2;
            float m129663 = c9956.m12966();
            float m129664 = c9956.m12966();
            f3 = c9956.f30067;
            C5722.m16158((int) (((f3 - f4) * m129664 * f) + m129663), imageView2);
            Drawable background = imageView.getBackground();
            C11233.m27800((Object) background, "null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
            C2900 c2900 = (C2900) background;
            Drawable background2 = imageView2.getBackground();
            C11233.m27800((Object) background2, "null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable");
            C2900 c29002 = (C2900) background2;
            if (c9956.m25110() != c9956.m12965()) {
                argbEvaluator = c9956.f30063;
                Object evaluate = argbEvaluator.evaluate(f, Integer.valueOf(c9956.m25110()), Integer.valueOf(c9956.m12965()));
                C11233.m27800(evaluate, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) evaluate).intValue();
                argbEvaluator2 = c9956.f30063;
                Object evaluate2 = argbEvaluator2.evaluate(f, Integer.valueOf(c9956.m12965()), Integer.valueOf(c9956.m25110()));
                C11233.m27800(evaluate2, "null cannot be cast to non-null type kotlin.Int");
                c29002.setColor(((Integer) evaluate2).intValue());
                z = c9956.f30064;
                if (z) {
                    InterfaceC21950 m12969 = c9956.m12969();
                    C11233.m27799(m12969);
                    if (i <= ((C20746) m12969).m47382()) {
                        c2900.setColor(c9956.m25110());
                    }
                }
                c2900.setColor(intValue);
            }
        }
        c9956.invalidate();
    }

    @Override // l.AbstractC11367
    /* renamed from: ֫ */
    public final void mo27170(int i) {
        C9956 c9956 = this.f36101;
        if (i >= c9956.f13900.size()) {
            return;
        }
        Object obj = c9956.f13900.get(i);
        C11233.m27803(obj, "get(...)");
        C5722.m16158((int) c9956.m12966(), (View) obj);
        c9956.mo12962(i);
    }

    @Override // l.AbstractC11367
    /* renamed from: ֫ */
    public final int mo27169() {
        return this.f36101.f13900.size();
    }
}
