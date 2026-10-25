package l;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: 92WK */
/* renamed from: l.ܰ۬ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13837 extends C20607 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7488 f41278;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13837(AbstractC7488 abstractC7488, Context context) {
        super(context);
        this.f41278 = abstractC7488;
    }

    @Override // l.C20607, l.AbstractC15248
    public final void onTargetFound(View view, C21600 c21600, C1138 c1138) {
        AbstractC7488 abstractC7488 = this.f41278;
        C13132 c13132 = abstractC7488.mRecyclerView;
        if (c13132 == null) {
            return;
        }
        int[] calculateDistanceToFinalSnap = abstractC7488.calculateDistanceToFinalSnap(c13132.getLayoutManager(), view);
        int i = calculateDistanceToFinalSnap[0];
        int i2 = calculateDistanceToFinalSnap[1];
        int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
        if (calculateTimeForDeceleration > 0) {
            c1138.m3874(i, i2, this.mDecelerateInterpolator, calculateTimeForDeceleration);
        }
    }

    @Override // l.C20607
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
