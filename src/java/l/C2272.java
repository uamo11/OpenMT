package l;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.widget.TextView;
import java.io.InputStream;
import java.util.Iterator;

/* compiled from: N5JQ */
/* renamed from: l.ۖۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2272 implements TextView.OnEditorActionListener {

    /* renamed from: ۚܶۖ, reason: not valid java name and contains not printable characters */
    public static boolean f7362;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22028 f7363;

    /* renamed from: ֨᩻ۧ, reason: not valid java name and contains not printable characters */
    public static String m7500(Object obj) {
        return ((AbstractC16891) obj).m39741();
    }

    /* renamed from: ۖۙ᩵, reason: not valid java name and contains not printable characters */
    public static int m7501(int i, int i2) {
        return Math.min(i, i2);
    }

    /* renamed from: ۗܰܺ, reason: not valid java name and contains not printable characters */
    public static boolean m7502(Object obj, Object obj2) {
        return ((C17087) obj).mo40098((C17087) obj2);
    }

    /* renamed from: ۙܰۚ, reason: not valid java name and contains not printable characters */
    public static boolean m7503() {
        return false;
    }

    /* renamed from: ۙܶ᩵, reason: not valid java name and contains not printable characters */
    public static boolean m7504(Object obj) {
        return ((C3545) obj).isDirectory();
    }

    /* renamed from: ۜۨۧ, reason: not valid java name and contains not printable characters */
    public static void m7505(Object obj) {
        ((Activity) obj).finish();
    }

    /* renamed from: ۠ۢ᩸, reason: not valid java name and contains not printable characters */
    public static int m7506(Object obj) {
        return ((C5896) obj).m16535();
    }

    /* renamed from: ۠ܶܿ, reason: not valid java name and contains not printable characters */
    public static String m7507(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۠ܿܿ, reason: not valid java name and contains not printable characters */
    public static void m7508(Object obj, Object obj2, Object obj3) {
        ((AbstractC0302) obj).m1668((InterfaceC23586) obj2, (InterfaceC1008) obj3);
    }

    /* renamed from: ۧܰ᩹, reason: not valid java name and contains not printable characters */
    public static Object m7509(Object obj, Object obj2) {
        return ((Context) obj).getSystemService((String) obj2);
    }

    /* renamed from: ۫۬ۙ, reason: not valid java name and contains not printable characters */
    public static C17793 m7510(Object obj, Object obj2) {
        return ((C17793) obj).m41705((C17793) obj2);
    }

    /* renamed from: ܶ᩺ۛ, reason: not valid java name and contains not printable characters */
    public static C18237 m7511(int i) {
        return C18237.m42480(i);
    }

    /* renamed from: ܿ۫ܽ, reason: not valid java name and contains not printable characters */
    public static void m7512(Object obj) {
        ((InputStream) obj).close();
    }

    /* renamed from: ᩴۛۚ, reason: not valid java name and contains not printable characters */
    public static Object m7513(Object obj) {
        return ((Iterator) obj).next();
    }

    /* renamed from: ᩷۬ܺ, reason: not valid java name and contains not printable characters */
    public static void m7514(Object obj, Object obj2, Object obj3) {
        C19568.m45009((C16560) obj, (InterfaceC17889) obj2, (InterfaceC18862) obj3);
    }

    /* renamed from: ᩷ܳ۫, reason: not valid java name and contains not printable characters */
    public static void m7515(Object obj, Object obj2) {
        ((AbstractActivityC3346) obj).m10227((C9762) obj2);
    }

    public C2272(C22028 c22028) {
        this.f7363 = c22028;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f7363.m49569();
        return true;
    }
}
