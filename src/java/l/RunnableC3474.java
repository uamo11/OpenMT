package l;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import java.io.InputStream;

/* compiled from: Q63C */
/* renamed from: l.ۗ᩷, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC3474 implements Runnable {

    /* renamed from: ᩸᩺ᩳ, reason: not valid java name and contains not printable characters */
    public static int f10992;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10530 f10993;

    /* renamed from: ۖۧۙ, reason: not valid java name and contains not printable characters */
    public static Class m10618(Object obj) {
        return obj.getClass();
    }

    /* renamed from: ۘ᩷۠, reason: not valid java name and contains not printable characters */
    public static Looper m10619() {
        return Looper.myLooper();
    }

    /* renamed from: ۜ֨ۤ, reason: not valid java name and contains not printable characters */
    public static C15206 m10620(Object obj) {
        return C15206.m35970((InputStream) obj);
    }

    /* renamed from: ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m10621(Object obj, int i) {
        C0287.m1630((TextInputLayout) obj, i);
    }

    /* renamed from: ۢ֫ܺ, reason: not valid java name and contains not printable characters */
    public static Context m10622(Object obj) {
        return ((View) obj).getContext();
    }

    /* renamed from: ۢۚܺ, reason: not valid java name and contains not printable characters */
    public static void m10623(Object obj, int i, Object obj2, int i2, int i3) {
        System.arraycopy(obj, i, obj2, i2, i3);
    }

    /* renamed from: ۧۧ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m10624(Object obj, int i) {
        return ((C19277) obj).m44460(i);
    }

    /* renamed from: ۧܽۗ, reason: not valid java name and contains not printable characters */
    public static void m10625(Object obj, Object obj2) {
        ((C9762) obj).setNavigationOnClickListener((View.OnClickListener) obj2);
    }

    /* renamed from: ۨۖۜ, reason: not valid java name and contains not printable characters */
    public static boolean m10626(Object obj) {
        return ((AbstractC15440) obj).mo23552();
    }

    /* renamed from: ۬᩹ܶ, reason: not valid java name and contains not printable characters */
    public static String m10627() {
        return C23196.m51459();
    }

    /* renamed from: ܶۤᩴ, reason: not valid java name and contains not printable characters */
    public static String m10628(Object obj, Object obj2) {
        return ((Intent) obj).getStringExtra((String) obj2);
    }

    /* renamed from: ܶᩳۤ, reason: not valid java name and contains not printable characters */
    public static void m10629(Object obj) {
        ((C8918) obj).close();
    }

    /* renamed from: ܺۛܰ, reason: not valid java name and contains not printable characters */
    public static boolean m10630() {
        return true;
    }

    /* renamed from: ܽܺܿ, reason: not valid java name and contains not printable characters */
    public static String m10631(Object obj, int i) {
        return C1575.m5392((C23881) obj, i);
    }

    /* renamed from: ᩴۖ۬, reason: not valid java name and contains not printable characters */
    public static int m10632(Object obj) {
        return Integer.parseInt((String) obj);
    }

    /* renamed from: ᩷ۖ۠, reason: not valid java name and contains not printable characters */
    public static String m10633(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    public RunnableC3474(C10530 c10530) {
        this.f10993 = c10530;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C10530 c10530 = this.f10993;
        c10530.m26438();
        c10530.f31576 = c10530.f31589.animate().translationY(-c10530.f31589.getHeight()).setListener(c10530.f31565);
    }
}
