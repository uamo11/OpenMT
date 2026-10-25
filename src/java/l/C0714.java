package l;

import android.view.View;
import android.widget.CompoundButton;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: 6ALU */
/* renamed from: l.֡᩺, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0714 {

    /* renamed from: ᩴ᩹ۛ, reason: not valid java name and contains not printable characters */
    public static int f2697;

    /* renamed from: ֫ۡۙ, reason: not valid java name and contains not printable characters */
    public static void m2802(Object obj, boolean z) {
        ((CompoundButton) obj).setChecked(z);
    }

    /* renamed from: ۖܳۛ, reason: not valid java name and contains not printable characters */
    public static C3545 m2803(Object obj, Object obj2) {
        return ((C18090) obj).getEntry((String) obj2);
    }

    /* renamed from: ۗۧۘ, reason: not valid java name and contains not printable characters */
    public static boolean m2804(Object obj) {
        return ((CompoundButton) obj).isChecked();
    }

    /* renamed from: ۗ᩵ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m2805() {
        return true;
    }

    /* renamed from: ۚ᩹ۧ, reason: not valid java name and contains not printable characters */
    public static void m2806(Object obj, int i) {
        ((View) obj).setBackgroundColor(i);
    }

    /* renamed from: ۛۜۚ, reason: not valid java name and contains not printable characters */
    public static boolean m2807(Object obj) {
        return ((InterfaceC17066) obj).mo1526();
    }

    /* renamed from: ۛۜܺ, reason: not valid java name and contains not printable characters */
    public static void m2808(Object obj) {
        C11233.m27799(obj);
    }

    /* renamed from: ۠ܿ۫, reason: not valid java name and contains not printable characters */
    public static Object m2809(Object obj, Object obj2, Object obj3) {
        return ((IdentityHashMap) obj).put(obj2, obj3);
    }

    /* renamed from: ۠᩺ۗ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17664 m2810(Object obj) {
        return C5378.stream((Collection) obj);
    }

    /* renamed from: ۤ᩹᩹, reason: not valid java name and contains not printable characters */
    public static Throwable m2811(Object obj) {
        return ((Throwable) obj).getCause();
    }

    /* renamed from: ܰۖ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m2812(Object obj) {
        return ((ArrayDeque) obj).isEmpty();
    }

    /* renamed from: ᩳ֫᩺, reason: not valid java name and contains not printable characters */
    public static boolean m2813(Object obj) {
        return ((List) obj).isEmpty();
    }

    /* renamed from: ᩷ۜܿ, reason: not valid java name and contains not printable characters */
    public static boolean m2814(Object obj, Object obj2) {
        return ((List) obj).add(obj2);
    }

    /* renamed from: ᩷۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m2815(Object obj, Object obj2) {
        ((Throwable) obj).addSuppressed((Throwable) obj2);
    }

    /* renamed from: ᩸ۜۢ, reason: not valid java name and contains not printable characters */
    public static String m2816(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ᩺ᩴ᩹, reason: not valid java name and contains not printable characters */
    public static int m2817(Object obj) {
        return ((AtomicInteger) obj).get();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C9367 m2801(View view) {
        return new C9367(new C19766(view, null));
    }
}
