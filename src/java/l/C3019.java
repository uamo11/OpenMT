package l;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: L1CU */
/* renamed from: l.ۗۚ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C3019 {

    /* renamed from: ܶۛᩴ, reason: not valid java name and contains not printable characters */
    public static int f9544;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10075 f9548;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f9546 = Float.NaN;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f9547 = -1;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f9545 = -1;

    /* renamed from: ۖܽܳ, reason: not valid java name and contains not printable characters */
    public static int m9249(Object obj) {
        return ((InterfaceC1779) obj).mo1790();
    }

    /* renamed from: ۙ۟ܺ, reason: not valid java name and contains not printable characters */
    public static String m9250(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۜۜۙ, reason: not valid java name and contains not printable characters */
    public static void m9251(Object obj) {
        ((OutputStream) obj).close();
    }

    /* renamed from: ۟ۡ֨, reason: not valid java name and contains not printable characters */
    public static void m9252(Object obj, Object obj2) {
        ((C19258) obj).m44424((CharSequence) obj2);
    }

    /* renamed from: ۟ᩴܰ, reason: not valid java name and contains not printable characters */
    public static void m9253(Object obj) {
        C19926.m45878((String) obj);
    }

    /* renamed from: ۤۧۜ, reason: not valid java name and contains not printable characters */
    public static Bundle m9254(Object obj) {
        return ((ComponentCallbacksC9205) obj).requireArguments();
    }

    /* renamed from: ۤۧ᩺, reason: not valid java name and contains not printable characters */
    public static int m9255() {
        return 971925145;
    }

    /* renamed from: ۧ۫᩺, reason: not valid java name and contains not printable characters */
    public static boolean m9256(Object obj) {
        return ((ArrayList) obj).isEmpty();
    }

    /* renamed from: ܶۚ᩻, reason: not valid java name and contains not printable characters */
    public static Object m9257(Object obj) {
        return C11003.requireNonNull(obj);
    }

    /* renamed from: ܺۨۜ, reason: not valid java name and contains not printable characters */
    public static boolean m9258(Object obj) {
        return ((C17222) obj).m40526();
    }

    /* renamed from: ܽ۠᩵, reason: not valid java name and contains not printable characters */
    public static View m9259(Object obj, int i) {
        return ((AbstractActivityC3346) obj).m10216(i);
    }

    /* renamed from: ܿᩳۤ, reason: not valid java name and contains not printable characters */
    public static void m9260(Object obj, Object obj2) {
        ((AbstractC7548) obj).m20266((AbstractActivityC3346) obj2);
    }

    /* renamed from: ᩳۖܶ, reason: not valid java name and contains not printable characters */
    public static void m9261(Object obj, Object obj2) {
        ViewOnClickListenerC8597.m22324((SpannableStringBuilder) obj, (String) obj2);
    }

    /* renamed from: ᩴۧ᩺, reason: not valid java name and contains not printable characters */
    public static long m9262() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: ᩶ܳ۠, reason: not valid java name and contains not printable characters */
    public static Object m9263(Object obj, int i) {
        return ((ArrayList) obj).get(i);
    }

    /* renamed from: ᩹ۖ᩻, reason: not valid java name and contains not printable characters */
    public static C14949 m9264(Object obj) {
        C14949 c14949;
        c14949 = ((ActivityC22006) obj).f70539;
        return c14949;
    }

    public C3019(C10075 c10075) {
        this.f9548 = c10075;
    }
}
