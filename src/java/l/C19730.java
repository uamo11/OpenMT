package l;

import com.google.android.material.motion.MotionUtils;

/* compiled from: 4BJX */
/* renamed from: l.᩵᩸ۚ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19730 extends AbstractC21162 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f63752;

    public final String toString() {
        return C4860.m14172(":containsWholeOwnText(", this.f63752, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C19730(String str) {
        this.f63752 = str;
    }

    @Override // l.AbstractC21162
    /* renamed from: ֫ */
    public final boolean mo2753(C19814 c19814, C19814 c198142) {
        return c198142.m45566().contains(this.f63752);
    }
}
