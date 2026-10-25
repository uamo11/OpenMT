package l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;

/* compiled from: K5RN */
/* renamed from: l.᩹ܺۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22386 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Path f72537;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Path f72538;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Path f72539;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Path f72540;

    static {
        Path path = new Path();
        f72538 = path;
        path.moveTo(-522.6f, 0.0f);
        path.rCubicTo(48.89972f, 0.0f, 166.02657f, 0.0f, 301.2173f, 0.0f);
        path.rCubicTo(197.58128f, 0.0f, 420.9827f, 0.0f, 420.9827f, 0.0f);
        Path path2 = new Path();
        f72537 = path2;
        path2.moveTo(0.0f, 0.1f);
        path2.lineTo(1.0f, 0.8268492f);
        path2.lineTo(2.0f, 0.1f);
        Path path3 = new Path();
        f72540 = path3;
        path3.moveTo(-197.6f, 0.0f);
        path3.rCubicTo(14.28182f, 0.0f, 85.07782f, 0.0f, 135.54689f, 0.0f);
        path3.rCubicTo(54.26191f, 0.0f, 90.42461f, 0.0f, 168.24332f, 0.0f);
        path3.rCubicTo(144.72154f, 0.0f, 316.40982f, 0.0f, 316.40982f, 0.0f);
        Path path4 = new Path();
        f72539 = path4;
        path4.moveTo(0.0f, 0.1f);
        path4.lineTo(1.0f, 0.5713795f);
        path4.lineTo(2.0f, 0.90995026f);
        path4.lineTo(3.0f, 0.1f);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AnimatorSet m50254(Object obj) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, "translateX", (String) null, f72538);
        ofFloat.setDuration(2000L);
        ofFloat.setInterpolator(C11803.f35205);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(obj, (String) null, "scaleX", f72537);
        ofFloat2.setDuration(2000L);
        ofFloat2.setInterpolator(C6158.f18933);
        ofFloat2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AnimatorSet m50255(Object obj) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, "translateX", (String) null, f72540);
        ofFloat.setDuration(2000L);
        ofFloat.setInterpolator(C13918.f41487);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(obj, (String) null, "scaleX", f72539);
        ofFloat2.setDuration(2000L);
        ofFloat2.setInterpolator(C23091.f74246);
        ofFloat2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }
}
