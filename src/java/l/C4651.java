package l;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import java.util.List;

/* compiled from: 28WH */
/* renamed from: l.ۙ۫ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4651 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f14750;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f14751;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f14752;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7473 f14753;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Paint f14754;

    public C4651(C7473 c7473) {
        this.f14753 = c7473;
        Paint paint = new Paint();
        this.f14754 = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        paint.setPathEffect(new DashPathEffect(new float[]{C11266.m27878(5.0f), C11266.m27878(2.5f)}, 0.0f));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m13619(C12392 c12392, C12392 c123922, boolean z) {
        List list;
        int m20043;
        int m200432;
        C7473 c7473 = this.f14753;
        list = c7473.f23019;
        int i = 0;
        if (list == null || !C7473.m20037(c7473)) {
            return false;
        }
        C20736 c20736 = c12392.f37258.f9998;
        int m30408 = ((int) (c12392.m30408() / c12392.f37245.m24484())) + m13618(c12392);
        if (m30408 >= 0) {
            i = m30408 >= c20736.size() ? c20736.size() - 1 : m30408;
        }
        C11747 c11747 = c20736.get(i);
        m20043 = C7473.m20043(z, c11747.f35062, c12392.m30436().length(), c123922.m30436().length(), list);
        m200432 = C7473.m20043(z, c11747.f35063 + 1, c12392.m30436().length(), c123922.m30436().length(), list);
        int m9790 = c123922.f37258.m9790(m20043);
        int m97902 = m20043 == m200432 ? m9790 : c123922.f37258.m9790(m200432);
        this.f14750 = i;
        this.f14752 = m9790;
        this.f14751 = m97902;
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m13618(C12392 c12392) {
        boolean z;
        int ceil = (int) Math.ceil((c12392.m30542() / c12392.f37245.m24484()) + 1.0f);
        z = this.f14753.f23045;
        return (int) (ceil * (z ? 0.4f : 0.33f));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m13620(C12392 c12392) {
        return m13618(c12392) * c12392.f37245.m24484();
    }
}
