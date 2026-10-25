package l;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import java.io.DataInputStream;

/* compiled from: 05NO */
/* renamed from: l.֡֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0050 {

    /* renamed from: ֫ۤܳ, reason: not valid java name and contains not printable characters */
    public static int f910;

    /* renamed from: ֨᩶۬, reason: not valid java name and contains not printable characters */
    public static void m930(Object obj, Object obj2) {
        ((C8918) obj).m23012((String) obj2);
    }

    /* renamed from: ۜᩴۗ, reason: not valid java name and contains not printable characters */
    public static void m934(Object obj, Object obj2) {
        ((C1109) obj).m3815((AbstractC7479) obj2);
    }

    /* renamed from: ۠ܽ᩻, reason: not valid java name and contains not printable characters */
    public static String m935(int i) {
        return String.valueOf(i);
    }

    /* renamed from: ۢۤܶ, reason: not valid java name and contains not printable characters */
    public static void m936() {
        C15528.m36596();
    }

    /* renamed from: ۧ᩸֡, reason: not valid java name and contains not printable characters */
    public static void m937(Object obj, int i, Object obj2) {
        ((C13309) obj).m32289(i, obj2);
    }

    /* renamed from: ۫ۢᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m938(Object obj, Object obj2) {
        return ((String) obj).contains((CharSequence) obj2);
    }

    /* renamed from: ܳۛ֡, reason: not valid java name and contains not printable characters */
    public static int m939(Object obj) {
        return ((DataInputStream) obj).readInt();
    }

    /* renamed from: ܺ۬ۚ, reason: not valid java name and contains not printable characters */
    public static int m940() {
        return 711912257;
    }

    /* renamed from: ᩳۜ۟, reason: not valid java name and contains not printable characters */
    public static String m941(Object obj) {
        return C15799.m37398((AbstractC15440) obj);
    }

    /* renamed from: ᩴܽܽ, reason: not valid java name and contains not printable characters */
    public static int m942(Object obj) {
        return ((Integer) obj).intValue();
    }

    /* renamed from: ᩹ۖۗ, reason: not valid java name and contains not printable characters */
    public static MenuItem m943(Object obj, boolean z) {
        return ((MenuItem) obj).setVisible(z);
    }

    /* renamed from: ᩹ۘ۠, reason: not valid java name and contains not printable characters */
    public static void m944(Object obj, int i) {
        ((C8918) obj).m23018(i);
    }

    /* renamed from: ᩹᩻ܽ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m945(Object obj, int i) {
        return ((StringBuilder) obj).append(i);
    }

    /* renamed from: ᩻֫ۧ, reason: not valid java name and contains not printable characters */
    public static String m946(Object obj, int i) {
        return ((Context) obj).getString(i);
    }

    /* renamed from: ᩻ۗۖ, reason: not valid java name and contains not printable characters */
    public static String m947(Object obj) {
        return obj.toString();
    }

    /* renamed from: ᩻ۛ۠, reason: not valid java name and contains not printable characters */
    public static String m948(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m933(View view) {
        try {
            view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m931(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return C19370.m44628(i, "?");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m932() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        stackTraceElement.getFileName();
        stackTraceElement.getLineNumber();
    }
}
