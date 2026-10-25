package l;

import android.widget.TextView;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;

/* compiled from: 95DO */
/* renamed from: l.֡ᩴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0588 implements Runnable {

    /* renamed from: ܳۤ֫, reason: not valid java name and contains not printable characters */
    public static int f2309;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnLongClickListenerC5528 f2310;

    public /* synthetic */ RunnableC0588(ViewOnLongClickListenerC5528 viewOnLongClickListenerC5528) {
        this.f2310 = viewOnLongClickListenerC5528;
    }

    /* renamed from: ۙ۬ۚ, reason: not valid java name and contains not printable characters */
    public static ActivityC0737 m2429(Object obj) {
        return ((ComponentCallbacksC9205) obj).requireActivity();
    }

    /* renamed from: ۚ֫۟, reason: not valid java name and contains not printable characters */
    public static void m2430(Object obj, Object obj2) {
        C11233.m27805(obj, (String) obj2);
    }

    /* renamed from: ۠ۤۗ, reason: not valid java name and contains not printable characters */
    public static String m2431(Object obj) {
        return ((C2946) obj).m8969();
    }

    /* renamed from: ۠᩵ܳ, reason: not valid java name and contains not printable characters */
    public static int m2432(Object obj) {
        return ((C12392) obj).m30542();
    }

    /* renamed from: ۤۤۡ, reason: not valid java name and contains not printable characters */
    public static C0492 m2433(Object obj, Object obj2) {
        return C5432.m15520((String) obj, (String[]) obj2);
    }

    /* renamed from: ۧ᩷ۜ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13049 m2434(Object obj, Object obj2, Object obj3) {
        return ((InterfaceC13049) obj).putString((String) obj2, (String) obj3);
    }

    /* renamed from: ۧ᩷ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2435(Object obj, Object obj2) {
        return C11003.equals(obj, obj2);
    }

    /* renamed from: ۫ۘ᩺, reason: not valid java name and contains not printable characters */
    public static String m2436(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۬ܽ۬, reason: not valid java name and contains not printable characters */
    public static C23881 m2437(Object obj) {
        return ((C18237) obj).m42496();
    }

    /* renamed from: ܳ᩶ۢ, reason: not valid java name and contains not printable characters */
    public static DialogInterfaceC0206 m2438(Object obj) {
        return ((C19258) obj).m44438();
    }

    /* renamed from: ܺܰ֡, reason: not valid java name and contains not printable characters */
    public static JSONArray m2439() {
        return JSON.array();
    }

    /* renamed from: ܽۖ۫, reason: not valid java name and contains not printable characters */
    public static C21374 m2440(Object obj) {
        return C21374.m48459((CharSequence) obj);
    }

    /* renamed from: ᩳۛۧ, reason: not valid java name and contains not printable characters */
    public static int m2441() {
        return -63168048;
    }

    /* renamed from: ᩴۧۨ, reason: not valid java name and contains not printable characters */
    public static CharSequence m2442(Object obj) {
        return ((TextView) obj).getText();
    }

    /* renamed from: ᩺ۚۗ, reason: not valid java name and contains not printable characters */
    public static String m2443(Object obj, Object obj2, Object obj3) {
        return ((String) obj).replace((CharSequence) obj2, (CharSequence) obj3);
    }

    /* renamed from: ᩺ܰۚ, reason: not valid java name and contains not printable characters */
    public static void m2444(Object obj, Object obj2) {
        ((C16560) obj).m39053((String) obj2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2310.m15671();
    }
}
