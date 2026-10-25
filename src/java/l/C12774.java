package l;

import com.google.android.material.motion.MotionUtils;

/* compiled from: 63QR */
/* renamed from: l.۬֨֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12774 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f38381;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC12069 f38382;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C12774 f38378 = new C12774(EnumC12069.ARRAY);

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C12774 f38380 = new C12774(EnumC12069.INNER_TYPE);

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C12774 f38379 = new C12774(EnumC12069.WILDCARD);

    public C12774(EnumC12069 enumC12069) {
        C12171.m29642(enumC12069 == EnumC12069.ARRAY || enumC12069 == EnumC12069.INNER_TYPE || enumC12069 == EnumC12069.WILDCARD);
        this.f38382 = enumC12069;
        this.f38381 = 0;
    }

    public C12774(EnumC12069 enumC12069, int i) {
        C12171.m29642(enumC12069 == EnumC12069.TYPE_ARGUMENT);
        this.f38382 = enumC12069;
        this.f38381 = i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        EnumC12069 enumC12069 = this.f38382;
        sb.append(enumC12069.toString());
        if (enumC12069 == EnumC12069.TYPE_ARGUMENT) {
            str = C3200.m9831(this.f38381, MotionUtils.EASING_TYPE_FORMAT_END, new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START));
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12774)) {
            return false;
        }
        C12774 c12774 = (C12774) obj;
        return this.f38382 == c12774.f38382 && this.f38381 == c12774.f38381;
    }

    public final int hashCode() {
        return (this.f38382.hashCode() * 17) + this.f38381;
    }
}
