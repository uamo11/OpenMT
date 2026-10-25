package l;

import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.q;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: T3M6 */
/* renamed from: l.ܳۖ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14225 extends AbstractC11795 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C14225 f42899 = new C14225();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f42900;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int[] f42901;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int[][] f42902;

    static {
        HashMap hashMap = new HashMap();
        f42900 = hashMap;
        hashMap.put("file", 0);
        hashMap.put("cdir", 1);
        hashMap.put("pdir", 1);
        hashMap.put("dir", 1);
        f42901 = new int[]{0, 1, 2};
        f42902 = new int[][]{new int[0], new int[]{2}, new int[]{1}, new int[]{2, 1}, new int[]{0}, new int[]{0, 2}, new int[]{0, 1}, new int[]{0, 1, 2}};
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14225 m33883() {
        return f42899;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // l.InterfaceC6150
    /* renamed from: ֫ */
    public final C10384 mo11134(String str) {
        char c;
        SimpleDateFormat simpleDateFormat;
        boolean z;
        if (str.startsWith(" ")) {
            if (str.length() > 1) {
                C10384 c10384 = new C10384();
                c10384.m26198(str);
                c10384.m26194(str.substring(1));
                return c10384;
            }
        } else {
            String[] split = str.split(" ", 2);
            if (split.length == 2 && !split[1].isEmpty()) {
                String str2 = split[0];
                if (str2.endsWith(l.b)) {
                    C10384 c103842 = new C10384();
                    c103842.m26198(str);
                    c103842.m26194(split[1]);
                    String[] split2 = str2.split(l.b);
                    boolean contains = split[0].toLowerCase(Locale.ENGLISH).contains("unix.mode=");
                    for (String str3 : split2) {
                        String[] split3 = str3.split("=", -1);
                        if (split3.length == 2) {
                            String str4 = split3[0];
                            Locale locale = Locale.ENGLISH;
                            String lowerCase = str4.toLowerCase(locale);
                            String str5 = split3[1];
                            if (!str5.isEmpty()) {
                                String lowerCase2 = str5.toLowerCase(locale);
                                lowerCase.getClass();
                                switch (lowerCase.hashCode()) {
                                    case -1068795718:
                                        if (lowerCase.equals("modify")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3530752:
                                        if (lowerCase.equals("sizd")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3530753:
                                        if (lowerCase.equals("size")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3575610:
                                        if (lowerCase.equals("type")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                switch (c) {
                                    case 0:
                                        if (str5.contains(".")) {
                                            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
                                            z = true;
                                        } else {
                                            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
                                            z = false;
                                        }
                                        TimeZone timeZone = C3261.getTimeZone("GMT");
                                        simpleDateFormat.setTimeZone(timeZone);
                                        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
                                        ParsePosition parsePosition = new ParsePosition(0);
                                        simpleDateFormat.setLenient(false);
                                        Date parse = simpleDateFormat.parse(str5, parsePosition);
                                        if (parsePosition.getIndex() != str5.length()) {
                                            gregorianCalendar = null;
                                        } else {
                                            gregorianCalendar.setTime(parse);
                                            if (!z) {
                                                gregorianCalendar.clear(14);
                                            }
                                        }
                                        if (gregorianCalendar == null) {
                                            return null;
                                        }
                                        c103842.m26185(gregorianCalendar);
                                        break;
                                    case 1:
                                    case 2:
                                        c103842.m26183(Long.parseLong(str5));
                                        break;
                                    case 3:
                                        Integer num = (Integer) f42900.get(lowerCase2);
                                        if (num == null) {
                                            c103842.m26181(3);
                                            break;
                                        } else {
                                            c103842.m26181(num.intValue());
                                            break;
                                        }
                                    default:
                                        if (lowerCase.startsWith("unix.")) {
                                            String lowerCase3 = lowerCase.substring(5).toLowerCase(locale);
                                            lowerCase3.getClass();
                                            switch (lowerCase3) {
                                                case "mode":
                                                    int length = str5.length() - 3;
                                                    int i = 0;
                                                    for (int i2 = 3; i < i2; i2 = 3) {
                                                        int charAt = str5.charAt(length + i) - '0';
                                                        if (charAt >= 0 && charAt <= 7) {
                                                            for (int i3 : f42902[charAt]) {
                                                                c103842.m26182(f42901[i], i3, true);
                                                            }
                                                        }
                                                        i++;
                                                    }
                                                    break;
                                                case "group":
                                                    c103842.m26184(str5);
                                                    break;
                                                case "owner":
                                                    c103842.m26196(str5);
                                                    break;
                                            }
                                        } else if (!contains && "perm".equals(lowerCase)) {
                                            for (char c2 : lowerCase2.toCharArray()) {
                                                if (c2 == 'a') {
                                                    c103842.m26182(0, 1, true);
                                                } else if (c2 == 'p') {
                                                    c103842.m26182(0, 1, true);
                                                } else if (c2 == 'r') {
                                                    c103842.m26182(0, 0, true);
                                                } else if (c2 == 'w') {
                                                    c103842.m26182(0, 1, true);
                                                } else if (c2 == 'l') {
                                                    c103842.m26182(0, 2, true);
                                                } else if (c2 != 'm') {
                                                    switch (c2) {
                                                        case q.f /* 99 */:
                                                            c103842.m26182(0, 1, true);
                                                            break;
                                                        case 'd':
                                                            c103842.m26182(0, 1, true);
                                                            break;
                                                        case 'e':
                                                            c103842.m26182(0, 0, true);
                                                            break;
                                                    }
                                                } else {
                                                    c103842.m26182(0, 1, true);
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        }
                    }
                    return c103842;
                }
            }
        }
        return null;
    }
}
