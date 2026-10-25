package l;

import android.app.Activity;
import android.content.Intent;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* compiled from: 95QI */
/* renamed from: l.֫᩺, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C2126 {

    /* renamed from: ֫ܰۨ, reason: not valid java name and contains not printable characters */
    public static boolean f7087;

    /* renamed from: ֫᩻ۗ, reason: not valid java name and contains not printable characters */
    public static void m7031(Object obj, Object obj2) {
        C11233.m27803(obj, (String) obj2);
    }

    /* renamed from: ۗ᩷᩻, reason: not valid java name and contains not printable characters */
    public static int m7032(Object obj) {
        return ((List) obj).size();
    }

    /* renamed from: ۘ֡ܳ, reason: not valid java name and contains not printable characters */
    public static String m7033(Object obj) {
        return ((C19099) obj).m44019();
    }

    /* renamed from: ۙܽܰ, reason: not valid java name and contains not printable characters */
    public static Intent m7034(Object obj) {
        return ((Activity) obj).getIntent();
    }

    /* renamed from: ۛܳ۬, reason: not valid java name and contains not printable characters */
    public static C3059 m7035(Object obj) {
        return C15799.m37279((Exception) obj);
    }

    /* renamed from: ۤᩴܿ, reason: not valid java name and contains not printable characters */
    public static String m7036(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۫ۧۗ, reason: not valid java name and contains not printable characters */
    public static Iterator m7037(Object obj) {
        return ((AbstractC18605) obj).iterator();
    }

    /* renamed from: ۬ܳܶ, reason: not valid java name and contains not printable characters */
    public static String m7038(Object obj) {
        return ((String) obj).trim();
    }

    /* renamed from: ܰۖܳ, reason: not valid java name and contains not printable characters */
    public static void m7039(Object obj, Object obj2) {
        ((View) obj).setOnClickListener((View.OnClickListener) obj2);
    }

    /* renamed from: ܳۚۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7040() {
        return false;
    }

    /* renamed from: ܶܺ֫, reason: not valid java name and contains not printable characters */
    public static int m7041(Object obj) {
        return ((MenuItem) obj).getItemId();
    }

    /* renamed from: ܶ᩷۬, reason: not valid java name and contains not printable characters */
    public static void m7042(Object obj, Object obj2) {
        ((ViewGroup) obj).addView((View) obj2);
    }

    /* renamed from: ᩶ܺۚ, reason: not valid java name and contains not printable characters */
    public static AbstractC16891 m7043(Object obj) {
        return ((C16560) obj).m39044();
    }

    /* renamed from: ᩸֡۟, reason: not valid java name and contains not printable characters */
    public static boolean m7044(Object obj) {
        return ((C22933) obj).m51053();
    }

    /* renamed from: ᩸ۢۛ, reason: not valid java name and contains not printable characters */
    public static C17793 m7045(long j) {
        return C17793.m41682(j);
    }

    /* renamed from: ᩸ܶܺ, reason: not valid java name and contains not printable characters */
    public static MenuItem m7046(Object obj, boolean z) {
        return ((MenuItem) obj).setChecked(z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7029(View view, String[] strArr, InterfaceC18022 interfaceC18022) {
        if (interfaceC18022 == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC11299(interfaceC18022));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String[] m7030(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3746 m7028(View view, C3746 c3746) {
        ContentInfo m11375 = c3746.m11375();
        ContentInfo performReceiveContent = view.performReceiveContent(m11375);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == m11375 ? c3746 : new C3746(new C8685(performReceiveContent));
    }
}
