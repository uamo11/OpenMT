package l;

/* compiled from: Q1R8 */
/* renamed from: l.ۙ᩹ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class RunnableC4937 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10582 f15569;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f15570;

    public RunnableC4937(ActivityC10582 activityC10582, String str) {
        this.f15569 = activityC10582;
        this.f15570 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C12698 c12698;
        C12698 c126982;
        ActivityC10582 activityC10582 = this.f15569;
        if (activityC10582.isFinishing()) {
            return;
        }
        c12698 = activityC10582.f31764;
        C17637 m41100 = c12698.f38219.m41100();
        if (m41100 == null || m41100.m41257() == 0) {
            C4925.m14315(this);
        } else {
            c126982 = activityC10582.f31764;
            c126982.f38219.m8717(this.f15570.toString());
        }
    }
}
