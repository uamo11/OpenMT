package l;

import android.media.Rating;

/* compiled from: 757I */
/* renamed from: l.ᩳ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17732 {
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m41536(Rating rating) {
        return rating.getRatingStyle();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m41540(Rating rating) {
        return rating.isRated();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m41541(Rating rating) {
        return rating.hasHeart();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m41538(Rating rating) {
        return rating.isThumbUp();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static float m41539(Rating rating) {
        return rating.getStarRating();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m41531(Rating rating) {
        return rating.getPercentRating();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Rating m41535(boolean z) {
        return Rating.newHeartRating(z);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Rating m41537(boolean z) {
        return Rating.newThumbRating(z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Rating m41534(int i, float f) {
        return Rating.newStarRating(i, f);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Rating m41532(float f) {
        return Rating.newPercentageRating(f);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Rating m41533(int i) {
        return Rating.newUnratedRating(i);
    }
}
