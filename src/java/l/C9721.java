package l;

import com.google.android.material.motion.MotionUtils;

/* compiled from: L64G */
/* renamed from: l.ۢܿ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C9721 extends C7624 {
    @Override // l.C7624, java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder(", expected ");
        int i = this.f23571;
        sb.append(i);
        String sb2 = sb.toString();
        if (i == 0) {
            sb2 = "";
        }
        if (this.f44795 == null) {
            return C4860.m14172("UnwantedTokenException(found=null", sb2, MotionUtils.EASING_TYPE_FORMAT_END);
        }
        return "UnwantedTokenException(found=" + this.f44795.getText() + sb2 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
