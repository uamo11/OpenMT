package l;

import com.google.android.material.motion.MotionUtils;

/* compiled from: 4BJX */
/* renamed from: l.ᩴ᩸ۚ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19024 extends AbstractC21162 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f59935;

    public final String toString() {
        return C4860.m14172(":contains(", this.f59935, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C19024(String str) {
        StringBuilder m47000 = C20519.m47000();
        C20519.m47002(str, m47000, false);
        this.f59935 = C23340.m51750(C20519.m46998(m47000));
    }

    @Override // l.AbstractC21162
    /* renamed from: ֫ */
    public final boolean mo2753(C19814 c19814, C19814 c198142) {
        return C23340.m51750(c198142.m45576()).contains(this.f59935);
    }
}
