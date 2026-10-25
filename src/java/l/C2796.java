package l;

import com.google.android.material.motion.MotionUtils;

/* compiled from: 4BJX */
/* renamed from: l.ۖ᩸ۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2796 extends AbstractC21162 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f8727;

    public final String toString() {
        return C4860.m14172(":containsData(", this.f8727, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C2796(String str) {
        this.f8727 = C23340.m51750(str);
    }

    @Override // l.AbstractC21162
    /* renamed from: ֫ */
    public final boolean mo2753(C19814 c19814, C19814 c198142) {
        return C23340.m51750(c198142.m45577()).contains(this.f8727);
    }
}
