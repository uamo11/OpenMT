package l;

import android.content.SharedPreferences;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/* compiled from: J622 */
/* renamed from: l.ۨ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C11340 {

    /* renamed from: ᩺᩷ۚ, reason: not valid java name and contains not printable characters */
    public static int f33930;

    /* renamed from: ֡ᩴ۠, reason: not valid java name and contains not printable characters */
    public static C17793 m28014(Object obj, Object obj2) {
        return ((C17793) obj).m41725((C17793) obj2);
    }

    /* renamed from: ֨ۡ᩶, reason: not valid java name and contains not printable characters */
    public static String m28015(Object obj, int i, int i2) {
        return ((String) obj).substring(i, i2);
    }

    /* renamed from: ۖ֨ܿ, reason: not valid java name and contains not printable characters */
    public static void m28018(Object obj, int i) {
        ((C9327) obj).m24005(i);
    }

    /* renamed from: ۖۜ۬, reason: not valid java name and contains not printable characters */
    public static boolean m28019(Object obj, Object obj2) {
        return ((Bundle) obj).getBoolean((String) obj2);
    }

    /* renamed from: ۗᩴۗ, reason: not valid java name and contains not printable characters */
    public static void m28020(Object obj) {
        ((Thread) obj).start();
    }

    /* renamed from: ۘۜᩴ, reason: not valid java name and contains not printable characters */
    public static char m28021(int i, Object obj) {
        return C7416.m19937(i, (String) obj);
    }

    /* renamed from: ۘܰۖ, reason: not valid java name and contains not printable characters */
    public static C23721 m28022(Object obj) {
        return ((InterfaceC7785) obj).mo1601();
    }

    /* renamed from: ۙۨܶ, reason: not valid java name and contains not printable characters */
    public static String m28023(Object obj) {
        return ((AbstractC15440) obj).getName();
    }

    /* renamed from: ۟֡ۚ, reason: not valid java name and contains not printable characters */
    public static long m28024(long j, long j2) {
        return C18177.m42370(j, j2);
    }

    /* renamed from: ۟᩹ܽ, reason: not valid java name and contains not printable characters */
    public static String m28025(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۢ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static int m28026(Object obj) {
        return ((View) obj).getHeight();
    }

    /* renamed from: ۢ᩻᩻, reason: not valid java name and contains not printable characters */
    public static C19099 m28027(Object obj) {
        C19099 c19099;
        c19099 = ((ActivityC12581) obj).f37929;
        return c19099;
    }

    /* renamed from: ۬ۜۤ, reason: not valid java name and contains not printable characters */
    public static View m28028(Object obj, int i) {
        return ((View) obj).findViewById(i);
    }

    /* renamed from: ᩶ۙᩴ, reason: not valid java name and contains not printable characters */
    public static String m28029(Object obj, Object obj2, Object obj3) {
        return ((SharedPreferences) obj).getString((String) obj2, (String) obj3);
    }

    /* renamed from: ᩸ܺ᩶, reason: not valid java name and contains not printable characters */
    public static InterfaceC7785 m28030(Object obj) {
        return ((C12392) obj).m30436();
    }

    /* renamed from: ᩻ۘ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m28031() {
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28017(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Uri m28016(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }
}
