package l;

/* compiled from: Y6A7 */
/* renamed from: l.᩸۬ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21600 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f69349;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f69350;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f69351;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f69352;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f69353;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f69354;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f69355;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f69356;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f69357;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f69358;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f69359;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f69360;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f69361;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f69362;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48778(int i) {
        if ((this.f69352 & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f69352));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m48777() {
        if (this.f69359) {
            return this.f69361 - this.f69349;
        }
        return this.f69362;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f69350 + ", mData=null, mItemCount=" + this.f69362 + ", mIsMeasuring=" + this.f69356 + ", mPreviousLayoutItemCount=" + this.f69361 + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f69349 + ", mStructureChanged=" + this.f69357 + ", mInPreLayout=" + this.f69359 + ", mRunSimpleAnimations=" + this.f69353 + ", mRunPredictiveAnimations=" + this.f69354 + '}';
    }
}
