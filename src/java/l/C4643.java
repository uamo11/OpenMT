package l;

import android.view.View;

/* compiled from: D8GL */
/* renamed from: l.ۙ۫ۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4643 extends AbstractC0525 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10227 f14729;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4643(ActivityC10227 activityC10227) {
        super(true);
        this.f14729 = activityC10227;
    }

    @Override // l.AbstractC0525
    /* renamed from: ۧ */
    public final void mo1201() {
        View view;
        ActivityC10227 activityC10227 = this.f14729;
        view = activityC10227.f30758;
        if (view.getVisibility() == 0) {
            ActivityC10227.m25753(activityC10227);
        } else {
            activityC10227.finish();
        }
    }
}
