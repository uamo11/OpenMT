package l;

import com.google.android.material.datepicker.UtcDates;
import java.util.TimeZone;

/* compiled from: I87D */
/* renamed from: l.᩹᩻ۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22611 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final TimeZone f73058 = C3261.getTimeZone(UtcDates.UTC);

    /* JADX WARN: Removed duplicated region for block: B:55:0x00ea A[Catch: IllegalArgumentException -> 0x01d7, IllegalArgumentException | IndexOutOfBoundsException -> 0x01d9, TRY_LEAVE, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x01d9, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0036, B:13:0x003c, B:18:0x0054, B:20:0x0064, B:21:0x0066, B:23:0x0072, B:24:0x0075, B:26:0x007b, B:30:0x0085, B:35:0x0095, B:37:0x009d, B:38:0x00a1, B:40:0x00a7, B:44:0x00b4, B:48:0x00bf, B:53:0x00e4, B:55:0x00ea, B:59:0x019e, B:65:0x00fe, B:66:0x0119, B:67:0x011a, B:70:0x0137, B:72:0x0144, B:75:0x014d, B:77:0x016c, B:80:0x017b, B:81:0x019d, B:82:0x0126, B:83:0x01cf, B:84:0x01d6, B:85:0x00cf, B:86:0x00d2, B:89:0x00bb), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cf A[Catch: IllegalArgumentException -> 0x01d7, IllegalArgumentException | IndexOutOfBoundsException -> 0x01d9, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x01d9, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0036, B:13:0x003c, B:18:0x0054, B:20:0x0064, B:21:0x0066, B:23:0x0072, B:24:0x0075, B:26:0x007b, B:30:0x0085, B:35:0x0095, B:37:0x009d, B:38:0x00a1, B:40:0x00a7, B:44:0x00b4, B:48:0x00bf, B:53:0x00e4, B:55:0x00ea, B:59:0x019e, B:65:0x00fe, B:66:0x0119, B:67:0x011a, B:70:0x0137, B:72:0x0144, B:75:0x014d, B:77:0x016c, B:80:0x017b, B:81:0x019d, B:82:0x0126, B:83:0x01cf, B:84:0x01d6, B:85:0x00cf, B:86:0x00d2, B:89:0x00bb), top: B:2:0x0004 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date m50596(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22611.m50596(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m50597(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m50595(int i, int i2, String str) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - digit2;
            i4 = i5;
        }
        return -i3;
    }
}
