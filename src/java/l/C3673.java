package l;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: 63JU */
/* renamed from: l.ۘۗۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3673 extends C20607 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18490 f11606;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3673(C18490 c18490, Context context) {
        super(context);
        this.f11606 = c18490;
    }

    @Override // l.C20607, l.AbstractC15248
    public final void onTargetFound(View view, C21600 c21600, C1138 c1138) {
        C18490 c18490 = this.f11606;
        int[] calculateDistanceToFinalSnap = c18490.calculateDistanceToFinalSnap(c18490.mRecyclerView.getLayoutManager(), view);
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

    @Override // l.C20607
    public final int calculateTimeForScrolling(int i) {
        return Math.min(100, super.calculateTimeForScrolling(i));
    }
}
