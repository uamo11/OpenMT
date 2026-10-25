package l;

import android.widget.CheckBox;

/* compiled from: 3B3L */
/* renamed from: l.ۖ۠ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2412 implements Runnable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f7687;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f7688;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f7689;

    public /* synthetic */ RunnableC2412(C22372 c22372, CheckBox checkBox, ActivityC16315 activityC16315) {
        this.f7688 = c22372;
        this.f7689 = checkBox;
        this.f7687 = activityC16315;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C22372 c22372 = this.f7688;
        c22372.getClass();
        boolean isChecked = this.f7689.isChecked();
        ActivityC16315 activityC16315 = this.f7687;
        if (!isChecked) {
            activityC16315.m38454(false);
        } else {
            c22372.m50232();
            activityC16315.m38449(false);
        }
    }
}
