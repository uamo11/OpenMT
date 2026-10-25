package l;

import bin.mt.plugin.api.util.ResultCallback;

/* compiled from: 61L9 */
/* renamed from: l.۠᩷ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8429 extends C13802 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC1748 f25821;

    public C8429(ActivityC1748 activityC1748) {
        this.f25821 = activityC1748;
    }

    @Override // l.C13802
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo22095(ResultCallback resultCallback) {
        C13658 c13658;
        ActivityC1748 activityC1748 = this.f25821;
        c13658 = activityC1748.f6067;
        if (c13658.f40731.booleanValue()) {
            super.mo22095(resultCallback);
        } else {
            ActivityC1748.m5839(activityC1748, true, false, resultCallback);
        }
    }

    @Override // l.C13802
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean mo22097() {
        C13658 c13658;
        C7473 c7473;
        ActivityC1748 activityC1748 = this.f25821;
        c13658 = activityC1748.f6067;
        if (c13658.f40731.booleanValue()) {
            return false;
        }
        c7473 = activityC1748.f6064;
        return c7473.m20096().m30297();
    }

    @Override // l.C13802
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String mo22096() {
        C13658 c13658;
        C13658 c136582;
        C13658 c136583;
        ActivityC1748 activityC1748 = this.f25821;
        c13658 = activityC1748.f6067;
        if (c13658.f40727 != null) {
            return null;
        }
        c136582 = activityC1748.f6067;
        if (c136582.f40732 == null) {
            return null;
        }
        c136583 = activityC1748.f6067;
        return c136583.f40732.mo23554();
    }

    @Override // l.C13802
    /* renamed from: ۧ */
    public final String mo8403() {
        C13658 c13658;
        C13658 c136582;
        C13658 c136583;
        C13658 c136584;
        ActivityC1748 activityC1748 = this.f25821;
        c13658 = activityC1748.f6067;
        if (c13658.f40727 != null) {
            c136584 = activityC1748.f6067;
            return c136584.f40727;
        }
        c136582 = activityC1748.f6067;
        if (c136582.f40732 == null) {
            return "";
        }
        c136583 = activityC1748.f6067;
        return c136583.f40732.getName();
    }
}
