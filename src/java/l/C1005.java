package l;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: N5WL */
/* renamed from: l.֨ۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1005 implements AdapterView.OnItemClickListener {

    /* renamed from: ܶᩴ᩶, reason: not valid java name and contains not printable characters */
    public static boolean f3721;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21467 f3722;

    /* renamed from: ֫֨۫, reason: not valid java name and contains not printable characters */
    public static C19099 m3494(Object obj) {
        C19099 c19099;
        c19099 = ((ActivityC12581) obj).f37929;
        return c19099;
    }

    /* renamed from: ۘۛۖ, reason: not valid java name and contains not printable characters */
    public static long m3495(long j, long j2) {
        return C18177.m42370(j, j2);
    }

    /* renamed from: ۛۚ۫, reason: not valid java name and contains not printable characters */
    public static String m3496(Object obj) {
        return ((AbstractC15440) obj).getName();
    }

    /* renamed from: ۜۧ۟, reason: not valid java name and contains not printable characters */
    public static InterfaceC7785 m3497(Object obj) {
        return ((C12392) obj).m30436();
    }

    /* renamed from: ۠ۡۜ, reason: not valid java name and contains not printable characters */
    public static int m3498(Object obj) {
        return ((View) obj).getHeight();
    }

    /* renamed from: ۤۘᩳ, reason: not valid java name and contains not printable characters */
    public static void m3499(Object obj) {
        ((Thread) obj).start();
    }

    /* renamed from: ۤ۠᩷, reason: not valid java name and contains not printable characters */
    public static char m3500(int i, Object obj) {
        return C7416.m19937(i, (String) obj);
    }

    /* renamed from: ۤܶ֫, reason: not valid java name and contains not printable characters */
    public static boolean m3501() {
        return true;
    }

    /* renamed from: ۤܿۢ, reason: not valid java name and contains not printable characters */
    public static String m3502(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۧ᩹ۡ, reason: not valid java name and contains not printable characters */
    public static C23721 m3503(Object obj) {
        return ((InterfaceC7785) obj).mo1601();
    }

    /* renamed from: ܰܽۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3504(Object obj, Object obj2) {
        return ((Bundle) obj).getBoolean((String) obj2);
    }

    /* renamed from: ᩵ܿܽ, reason: not valid java name and contains not printable characters */
    public static C17793 m3505(Object obj, Object obj2) {
        return ((C17793) obj).m41725((C17793) obj2);
    }

    /* renamed from: ᩷᩵ܿ, reason: not valid java name and contains not printable characters */
    public static String m3506(Object obj, Object obj2, Object obj3) {
        return ((SharedPreferences) obj).getString((String) obj2, (String) obj3);
    }

    /* renamed from: ᩸֫ۗ, reason: not valid java name and contains not printable characters */
    public static View m3507(Object obj, int i) {
        return ((View) obj).findViewById(i);
    }

    /* renamed from: ᩸֫᩶, reason: not valid java name and contains not printable characters */
    public static void m3508(Object obj, int i) {
        ((C9327) obj).m24005(i);
    }

    /* renamed from: ᩻ۨܳ, reason: not valid java name and contains not printable characters */
    public static String m3509(Object obj, int i, int i2) {
        return ((String) obj).substring(i, i2);
    }

    public C1005(C21467 c21467) {
        this.f3722 = c21467;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C21467 c21467 = this.f3722;
        c21467.f69092.setSelection(i);
        if (c21467.f69092.getOnItemClickListener() != null) {
            c21467.f69092.performItemClick(view, i, c21467.f69088.getItemId(i));
        }
        c21467.dismiss();
    }
}
