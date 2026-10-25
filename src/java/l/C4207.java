package l;

import com.google.android.material.motion.MotionUtils;

/* compiled from: 4BJX */
/* renamed from: l.ۘ᩸ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4207 extends AbstractC21162 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f13675;

    public final String toString() {
        return C4860.m14172(":containsOwn(", this.f13675, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C4207(String str) {
        StringBuilder m47000 = C20519.m47000();
        C20519.m47002(str, m47000, false);
        this.f13675 = C23340.m51750(C20519.m46998(m47000));
    }

    @Override // l.AbstractC21162
    /* renamed from: ֫ */
    public final boolean mo2753(C19814 c19814, C19814 c198142) {
        return C23340.m51750(c198142.m45586()).contains(this.f13675);
    }
}
