package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.google.android.material.motion.MotionUtils;

/* compiled from: WBSX */
/* renamed from: l.ۚ۫ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5350 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Activity m15313(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m15313(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m15315(int i, boolean z) {
        String str;
        switch (i) {
            case 1:
                str = "Android 1.0";
                break;
            case 2:
                str = "Android 1.1";
                break;
            case 3:
                str = "Android 1.5";
                break;
            case 4:
                str = "Android 1.6";
                break;
            case 5:
                str = "Android 2.0";
                break;
            case 6:
                str = "Android 2.0.1";
                break;
            case 7:
                str = "Android 2.1";
                break;
            case 8:
                str = "Android 2.2";
                break;
            case 9:
                str = "Android 2.3";
                break;
            case 10:
                str = "Android 2.3.3";
                break;
            case 11:
                str = "Android 3.0";
                break;
            case 12:
                str = "Android 3.1";
                break;
            case 13:
                str = "Android 3.2";
                break;
            case 14:
                str = "Android 4.0";
                break;
            case 15:
                str = "Android 4.0.3";
                break;
            case 16:
                str = "Android 4.1";
                break;
            case 17:
                str = "Android 4.2";
                break;
            case 18:
                str = "Android 4.3";
                break;
            case 19:
                str = "Android 4.4";
                break;
            case 20:
                str = "Android 4.4W";
                break;
            case 21:
                str = "Android 5.0";
                break;
            case 22:
                str = "Android 5.1";
                break;
            case 23:
                str = "Android 6.0";
                break;
            case 24:
                str = "Android 7.0";
                break;
            case 25:
                str = "Android 7.1";
                break;
            case 26:
                str = "Android 8.0";
                break;
            case 27:
                str = "Android 8.1";
                break;
            case 28:
                str = "Android 9";
                break;
            case 29:
                str = "Android 10";
                break;
            case 30:
                str = "Android 11";
                break;
            case 31:
                str = "Android 12";
                break;
            case 32:
                str = "Android 12L";
                break;
            case 33:
                str = "Android 13";
                break;
            case 34:
                str = "Android 14";
                break;
            case 35:
                str = "Android 15";
                break;
            default:
                if (i <= 35) {
                    str = "Unknown";
                    break;
                } else {
                    StringBuilder sb = new StringBuilder("Android ");
                    sb.append(i - 20);
                    str = sb.toString();
                    break;
                }
        }
        return (z && str.endsWith(".0")) ? C15472.m36561(2, 0, str) : str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m15314(int i) {
        return m15315(i, true) + " (API " + i + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
