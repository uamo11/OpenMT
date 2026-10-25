package l;

import com.google.android.material.motion.MotionUtils;
import java.util.regex.Pattern;

/* compiled from: 4BJX */
/* renamed from: l.ܳ᩹ۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14810 extends AbstractC21162 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Pattern f45205;

    public C14810(Pattern pattern) {
        this.f45205 = pattern;
    }

    @Override // l.AbstractC21162
    /* renamed from: ֫ */
    public final boolean mo2753(C19814 c19814, C19814 c198142) {
        return this.f45205.matcher(c198142.m45568()).find();
    }

    public final String toString() {
        return ":matchesWholeText(" + this.f45205 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
