package l;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.material.internal.ManufacturerUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* compiled from: 253O */
/* renamed from: l.ۗᩴܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3424 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String f10802 = Build.MANUFACTURER.toLowerCase();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static double m10397() {
        try {
            String m10395 = m10395("ro.build.version.emui");
            return Double.parseDouble(m10395.substring(m10395.indexOf("_") + 1));
        } catch (Exception unused) {
            return 4.0d;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m10395(String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ".concat(str)).getInputStream()), 1024);
        } catch (IOException unused) {
            bufferedReader = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
            }
            return readLine;
        } catch (IOException unused3) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused4) {
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m10402() {
        return !TextUtils.isEmpty(m10395("ro.miui.ui.version.name"));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m10400() {
        String m10395 = m10395("ro.build.display.id");
        if (TextUtils.isEmpty(m10395)) {
            return false;
        }
        return m10395.contains("flyme") || m10395.toLowerCase().contains("flyme");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m10398() {
        return f10802.contains("huawei");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m10396() {
        String str = f10802;
        return str.contains("qiku") || str.contains("360");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m10401() {
        return f10802.contains("oppo");
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m10403() {
        return f10802.contains("vivo");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m10399() {
        return f10802.contains(ManufacturerUtils.SAMSUNG);
    }
}
