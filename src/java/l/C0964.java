package l;

import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.HashMap;

/* compiled from: 855Y */
/* renamed from: l.֨۟, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0964 {

    /* renamed from: ᩹֫᩷, reason: not valid java name and contains not printable characters */
    public static int f3626;

    /* renamed from: ֡ۚۧ, reason: not valid java name and contains not printable characters */
    public static String m3396(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۘ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3400(Object obj, Object obj2, boolean z) {
        return ((InterfaceC12344) obj).getBoolean((String) obj2, z);
    }

    /* renamed from: ۘۤ᩵, reason: not valid java name and contains not printable characters */
    public static void m3401(Object obj, boolean z) {
        ((C2978) obj).setChecked(z);
    }

    /* renamed from: ۤۘܺ, reason: not valid java name and contains not printable characters */
    public static void m3402(Object obj) {
        ((AbstractC7548) obj).m20274();
    }

    /* renamed from: ۤ᩺᩵, reason: not valid java name and contains not printable characters */
    public static boolean m3403(Object obj) {
        return TextUtils.isEmpty((CharSequence) obj);
    }

    /* renamed from: ۧ᩺ܳ, reason: not valid java name and contains not printable characters */
    public static void m3404(Object obj, Object obj2) {
        ((View) obj).setTag(obj2);
    }

    /* renamed from: ۨ֫᩸, reason: not valid java name and contains not printable characters */
    public static boolean m3405(Object obj) {
        return ((C15854) obj).m37542();
    }

    /* renamed from: ۨ᩹ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m3406(Object obj) {
        return ((C12951) obj).m31498();
    }

    /* renamed from: ܰ֨ܳ, reason: not valid java name and contains not printable characters */
    public static String m3407(Object obj, Object obj2, Object obj3) {
        return ((InterfaceC12344) obj).getString((String) obj2, (String) obj3);
    }

    /* renamed from: ܶܳܿ, reason: not valid java name and contains not printable characters */
    public static String m3408(Object obj, Object obj2, Object obj3) {
        return ((String) obj).replaceAll((String) obj2, (String) obj3);
    }

    /* renamed from: ܺ᩶۫, reason: not valid java name and contains not printable characters */
    public static View m3409(Object obj, int i) {
        return ((AbstractActivityC3346) obj).m10241(i);
    }

    /* renamed from: ᩳۨ᩺, reason: not valid java name and contains not printable characters */
    public static Object m3410(Object obj, Object obj2) {
        return ((HashMap) obj).get(obj2);
    }

    /* renamed from: ᩳ᩵᩺, reason: not valid java name and contains not printable characters */
    public static String m3411(Object obj) {
        return C18747.m43415((String) obj);
    }

    /* renamed from: ᩶֨ܿ, reason: not valid java name and contains not printable characters */
    public static byte m3412(Object obj, int i) {
        return ((C17793) obj).m41715(i);
    }

    /* renamed from: ᩶۫ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3413() {
        return true;
    }

    /* renamed from: ᩸ۜۚ, reason: not valid java name and contains not printable characters */
    public static void m3414(Object obj, int i, int i2) {
        ((ViewOnClickListenerC21681) obj).m48955(i, i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Interpolator m3399(Path path) {
        return new PathInterpolator(path);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Interpolator m3397(float f, float f2) {
        return new PathInterpolator(f, f2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Interpolator m3398(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }
}
