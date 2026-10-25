package l;

import android.graphics.Color;
import com.alipay.sdk.m.y.l;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: 096Y */
/* renamed from: l.ۡۜܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8720 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f26547;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f26548;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f26549;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f26550;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f26541 = new AtomicInteger((int) (System.currentTimeMillis() / 1000));

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C11459 f26544 = C11459.m28259(2, "parseColor\\((\\d+|_|AUTO),(\\d+|_|AUTO),([A-Z]+)(?:,(.+))?\\)");

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C12164 f26546 = C11459.m28259(2, "(?<![a-f0-9])[a-f0-9]{3,8}(?![a-z0-9])").matcher((CharSequence) "");

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C12164 f26545 = C11459.m28260("-?\\d+").matcher((CharSequence) "");

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C12164 f26543 = C11459.m28260("-?\\d+(\\.\\d+)?%?").matcher((CharSequence) "");

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final BigDecimal f26542 = BigDecimal.valueOf(255L);

    public C8720(int i, int i2, int i3, int i4) {
        this.f26549 = i;
        this.f26547 = i2;
        this.f26550 = i3;
        this.f26548 = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8720)) {
            return false;
        }
        C8720 c8720 = (C8720) obj;
        return this.f26549 == c8720.f26549 && this.f26547 == c8720.f26547 && this.f26550 == c8720.f26550 && this.f26548 == c8720.f26548;
    }

    public final int hashCode() {
        return (((((this.f26549 * 31) + this.f26547) * 31) + this.f26550) * 31) + this.f26548;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f26549), Integer.valueOf(this.f26547), Integer.valueOf(this.f26550), Integer.valueOf(this.f26548)};
        String[] split = "foregroundValueGroup;backgroundValueGroup;mode;baseStyleId".length() == 0 ? new String[0] : "foregroundValueGroup;backgroundValueGroup;mode;baseStyleId".split(l.b);
        StringBuilder sb = new StringBuilder("ColorParser[");
        for (int i = 0; i < split.length; i++) {
            sb.append(split[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != split.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m22535() {
        return this.f26547;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m22537() {
        return this.f26550;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m22538() {
        return this.f26548;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m22539() {
        return this.f26549;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8720 m22528(String str) {
        C12164 matcher = f26544.matcher((CharSequence) str);
        if (!matcher.matches()) {
            throw new RuntimeException(C20094.m46315("Parse failed: ", str));
        }
        String group = matcher.group(1);
        C11003.requireNonNull(group);
        int i = -2;
        int parseInt = group.equals("_") ? -1 : group.equalsIgnoreCase("auto") ? -2 : Integer.parseInt(group);
        int i2 = 2;
        String group2 = matcher.group(2);
        C11003.requireNonNull(group2);
        if (group2.equals("_")) {
            i = -1;
        } else if (!group2.equalsIgnoreCase("auto")) {
            i = Integer.parseInt(group2);
        }
        if (parseInt < 0 && i < 0) {
            throw new RuntimeException(C20094.m46315("Illegal arguments: ", str));
        }
        String group3 = matcher.group(3);
        C11003.requireNonNull(group3);
        String upperCase = group3.toUpperCase();
        upperCase.getClass();
        switch (upperCase) {
            case "HEX":
                i2 = 0;
                break;
            case "HSL":
                break;
            case "HSV":
                i2 = 3;
                break;
            case "RGB":
                i2 = 1;
                break;
            case "ARGB":
                i2 = 10;
                break;
            case "HEXA":
                i2 = 8;
                break;
            case "HSLA":
                i2 = 5;
                break;
            case "HSVA":
                i2 = 6;
                break;
            case "RGBA":
                i2 = 4;
                break;
            case "RGBF":
                i2 = 11;
                break;
            case "RGBX":
                i2 = 9;
                break;
            case "XRGB":
                i2 = 7;
                break;
            case "ARGBF":
                i2 = 12;
                break;
            case "RGBAF":
                i2 = 13;
                break;
            default:
                throw new RuntimeException(C20094.m46315("Illegal arguments: ", str));
        }
        return new C8720(parseInt, i, i2, C4900.m14261(matcher.group(4)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 m22536(C21834 c21834, C21834 c218342, C12164 c12164, C2453 c2453) {
        RuntimeException runtimeException;
        try {
            return m22532(c21834, c218342, c12164, c2453);
        } catch (C9426 e) {
            runtimeException = e.f28602;
            throw runtimeException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[Catch: Exception -> 0x00e6, TryCatch #0 {Exception -> 0x00e6, blocks: (B:3:0x0008, B:5:0x0012, B:9:0x0024, B:12:0x002c, B:16:0x003e, B:29:0x005f, B:30:0x0066, B:34:0x007c, B:37:0x0088, B:46:0x00a6, B:49:0x00ae, B:52:0x00c1, B:54:0x00d6, B:59:0x0047), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[Catch: Exception -> 0x00e6, TryCatch #0 {Exception -> 0x00e6, blocks: (B:3:0x0008, B:5:0x0012, B:9:0x0024, B:12:0x002c, B:16:0x003e, B:29:0x005f, B:30:0x0066, B:34:0x007c, B:37:0x0088, B:46:0x00a6, B:49:0x00ae, B:52:0x00c1, B:54:0x00d6, B:59:0x0047), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1 A[Catch: Exception -> 0x00e6, TryCatch #0 {Exception -> 0x00e6, blocks: (B:3:0x0008, B:5:0x0012, B:9:0x0024, B:12:0x002c, B:16:0x003e, B:29:0x005f, B:30:0x0066, B:34:0x007c, B:37:0x0088, B:46:0x00a6, B:49:0x00ae, B:52:0x00c1, B:54:0x00d6, B:59:0x0047), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d6 A[Catch: Exception -> 0x00e6, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e6, blocks: (B:3:0x0008, B:5:0x0012, B:9:0x0024, B:12:0x002c, B:16:0x003e, B:29:0x005f, B:30:0x0066, B:34:0x007c, B:37:0x0088, B:46:0x00a6, B:49:0x00ae, B:52:0x00c1, B:54:0x00d6, B:59:0x0047), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0051  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C21834 m22532(l.C21834 r25, l.C21834 r26, l.C12164 r27, l.C2453 r28) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8720.m22532(l.᩸᩷ܿ, l.᩸᩷ܿ, l.۫ۘܽ, l.ۖۢܿ):l.᩸᩷ܿ");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m22525(int i, int i2, String str) {
        int i3;
        boolean z = true;
        int i4 = 0;
        switch (i) {
            case 0:
                String format = (i2 & (-16777216)) == -16777216 ? String.format("%06X", Integer.valueOf(i2 & 16777215)) : String.format("%08X", Integer.valueOf(i2));
                C12164 c12164 = f26546;
                synchronized (c12164) {
                    c12164.m29615reset((CharSequence) str);
                    if (!c12164.find()) {
                        return null;
                    }
                    return str.substring(0, c12164.start()) + format + str.substring(c12164.end());
                }
            case 1:
                C12164 c121642 = f26545;
                synchronized (c121642) {
                    StringBuilder sb = new StringBuilder();
                    c121642.m29615reset((CharSequence) str);
                    if (c121642.find()) {
                        sb.append((CharSequence) str, 0, c121642.start());
                        sb.append(Color.red(i2));
                        int end = c121642.end();
                        if (c121642.find()) {
                            sb.append((CharSequence) str, end, c121642.start());
                            sb.append(Color.green(i2));
                            int end2 = c121642.end();
                            if (c121642.find()) {
                                sb.append((CharSequence) str, end2, c121642.start());
                                sb.append(Color.blue(i2));
                                sb.append((CharSequence) str, c121642.end(), str.length());
                                return sb.toString();
                            }
                        }
                    }
                    return null;
                }
            case 2:
                float[] fArr = new float[3];
                C7191.m19272(i2, fArr);
                C12164 c121643 = f26543;
                synchronized (c121643) {
                    StringBuilder sb2 = new StringBuilder();
                    c121643.m29615reset((CharSequence) str);
                    if (c121643.find()) {
                        sb2.append((CharSequence) str, 0, c121643.start());
                        sb2.append(m22526(c121643.group(), fArr[0]));
                        int end3 = c121643.end();
                        if (c121643.find()) {
                            sb2.append((CharSequence) str, end3, c121643.start());
                            sb2.append(m22526(c121643.group(), fArr[1]));
                            int end4 = c121643.end();
                            if (c121643.find()) {
                                sb2.append((CharSequence) str, end4, c121643.start());
                                sb2.append(m22526(c121643.group(), fArr[2]));
                                sb2.append((CharSequence) str, c121643.end(), str.length());
                                return sb2.toString();
                            }
                        }
                    }
                    return null;
                }
            case 3:
                float[] fArr2 = new float[3];
                C7466.m20004(i2, fArr2);
                C12164 c121644 = f26543;
                synchronized (c121644) {
                    StringBuilder sb3 = new StringBuilder();
                    c121644.m29615reset((CharSequence) str);
                    if (c121644.find()) {
                        sb3.append((CharSequence) str, 0, c121644.start());
                        sb3.append(m22526(c121644.group(), fArr2[0]));
                        int end5 = c121644.end();
                        if (c121644.find()) {
                            sb3.append((CharSequence) str, end5, c121644.start());
                            sb3.append(m22526(c121644.group(), fArr2[1]));
                            int end6 = c121644.end();
                            if (c121644.find()) {
                                sb3.append((CharSequence) str, end6, c121644.start());
                                sb3.append(m22526(c121644.group(), fArr2[2]));
                                sb3.append((CharSequence) str, c121644.end(), str.length());
                                return sb3.toString();
                            }
                        }
                    }
                    return null;
                }
            case 4:
                StringBuilder sb4 = new StringBuilder();
                C12164 c121645 = f26545;
                synchronized (c121645) {
                    c121645.m29615reset((CharSequence) str);
                    if (c121645.find()) {
                        sb4.append((CharSequence) str, 0, c121645.start());
                        sb4.append(Color.red(i2));
                        int end7 = c121645.end();
                        if (c121645.find()) {
                            sb4.append((CharSequence) str, end7, c121645.start());
                            sb4.append(Color.green(i2));
                            end7 = c121645.end();
                            if (c121645.find()) {
                                sb4.append((CharSequence) str, end7, c121645.start());
                                sb4.append(Color.blue(i2));
                                i3 = c121645.end();
                            }
                        }
                        i4 = end7;
                    }
                    z = false;
                    i3 = i4;
                }
                if (z) {
                    C12164 c121646 = f26543;
                    synchronized (c121646) {
                        c121646.m29615reset((CharSequence) str);
                        if (!c121646.find(i3)) {
                            return null;
                        }
                        sb4.append((CharSequence) str, i3, c121646.start());
                        sb4.append(m22533(Color.alpha(i2), c121646.group()));
                        sb4.append((CharSequence) str, c121646.end(), str.length());
                        return sb4.toString();
                    }
                }
                return null;
            case 5:
                float[] fArr3 = new float[3];
                C7191.m19272(i2, fArr3);
                C12164 c121647 = f26543;
                synchronized (c121647) {
                    StringBuilder sb5 = new StringBuilder();
                    c121647.m29615reset((CharSequence) str);
                    if (c121647.find()) {
                        sb5.append((CharSequence) str, 0, c121647.start());
                        sb5.append(m22526(c121647.group(), fArr3[0]));
                        int end8 = c121647.end();
                        if (c121647.find()) {
                            sb5.append((CharSequence) str, end8, c121647.start());
                            sb5.append(m22526(c121647.group(), fArr3[1]));
                            int end9 = c121647.end();
                            if (c121647.find()) {
                                sb5.append((CharSequence) str, end9, c121647.start());
                                sb5.append(m22526(c121647.group(), fArr3[2]));
                                int end10 = c121647.end();
                                if (c121647.find()) {
                                    sb5.append((CharSequence) str, end10, c121647.start());
                                    sb5.append(m22533(Color.alpha(i2), c121647.group()));
                                    sb5.append((CharSequence) str, c121647.end(), str.length());
                                    return sb5.toString();
                                }
                            }
                        }
                    }
                    return null;
                }
            case 6:
                float[] fArr4 = new float[3];
                C7466.m20004(i2, fArr4);
                C12164 c121648 = f26543;
                synchronized (c121648) {
                    StringBuilder sb6 = new StringBuilder();
                    c121648.m29615reset((CharSequence) str);
                    if (c121648.find()) {
                        sb6.append((CharSequence) str, 0, c121648.start());
                        sb6.append(m22526(c121648.group(), fArr4[0]));
                        int end11 = c121648.end();
                        if (c121648.find()) {
                            sb6.append((CharSequence) str, end11, c121648.start());
                            sb6.append(m22526(c121648.group(), fArr4[1]));
                            int end12 = c121648.end();
                            if (c121648.find()) {
                                sb6.append((CharSequence) str, end12, c121648.start());
                                sb6.append(m22526(c121648.group(), fArr4[2]));
                                int end13 = c121648.end();
                                if (c121648.find()) {
                                    sb6.append((CharSequence) str, end13, c121648.start());
                                    sb6.append(m22533(Color.alpha(i2), c121648.group()));
                                    sb6.append((CharSequence) str, c121648.end(), str.length());
                                    return sb6.toString();
                                }
                            }
                        }
                    }
                    return null;
                }
            case 7:
                C12164 c121649 = f26545;
                synchronized (c121649) {
                    StringBuilder sb7 = new StringBuilder();
                    c121649.m29615reset((CharSequence) str);
                    if (c121649.find()) {
                        sb7.append((CharSequence) str, 0, c121649.start());
                        sb7.append(Color.alpha(i2));
                        int end14 = c121649.end();
                        if (c121649.find()) {
                            sb7.append((CharSequence) str, end14, c121649.start());
                            sb7.append(Color.red(i2));
                            int end15 = c121649.end();
                            if (c121649.find()) {
                                sb7.append((CharSequence) str, end15, c121649.start());
                                sb7.append(Color.green(i2));
                                int end16 = c121649.end();
                                if (c121649.find()) {
                                    sb7.append((CharSequence) str, end16, c121649.start());
                                    sb7.append(Color.blue(i2));
                                    sb7.append((CharSequence) str, c121649.end(), str.length());
                                    return sb7.toString();
                                }
                            }
                        }
                    }
                    return null;
                }
            case 8:
                String format2 = (i2 & (-16777216)) == -16777216 ? String.format("%06X", Integer.valueOf(i2 & 16777215)) : String.format("%06X%02X", Integer.valueOf(i2 & 16777215), Integer.valueOf(i2 >>> 24));
                C12164 c1216410 = f26546;
                synchronized (c1216410) {
                    c1216410.m29615reset((CharSequence) str);
                    if (!c1216410.find()) {
                        return null;
                    }
                    return str.substring(0, c1216410.start()) + format2 + str.substring(c1216410.end());
                }
            case 9:
                C12164 c1216411 = f26545;
                synchronized (c1216411) {
                    StringBuilder sb8 = new StringBuilder();
                    c1216411.m29615reset((CharSequence) str);
                    if (c1216411.find()) {
                        sb8.append((CharSequence) str, 0, c1216411.start());
                        sb8.append(Color.red(i2));
                        int end17 = c1216411.end();
                        if (c1216411.find()) {
                            sb8.append((CharSequence) str, end17, c1216411.start());
                            sb8.append(Color.green(i2));
                            int end18 = c1216411.end();
                            if (c1216411.find()) {
                                sb8.append((CharSequence) str, end18, c1216411.start());
                                sb8.append(Color.blue(i2));
                                int end19 = c1216411.end();
                                if (c1216411.find()) {
                                    sb8.append((CharSequence) str, end19, c1216411.start());
                                    sb8.append(Color.alpha(i2));
                                    sb8.append((CharSequence) str, c1216411.end(), str.length());
                                    return sb8.toString();
                                }
                            }
                        }
                    }
                    return null;
                }
            case 10:
                StringBuilder sb9 = new StringBuilder();
                C12164 c1216412 = f26543;
                synchronized (c1216412) {
                    c1216412.m29615reset((CharSequence) str);
                    if (!c1216412.find()) {
                        return null;
                    }
                    sb9.append((CharSequence) str, 0, c1216412.start());
                    sb9.append(m22533(Color.alpha(i2), c1216412.group()));
                    int end20 = c1216412.end();
                    C12164 c1216413 = f26545;
                    synchronized (c1216413) {
                        c1216413.m29615reset((CharSequence) str);
                        if (c1216413.find(end20)) {
                            sb9.append((CharSequence) str, end20, c1216413.start());
                            sb9.append(Color.red(i2));
                            int end21 = c1216413.end();
                            if (c1216413.find()) {
                                sb9.append((CharSequence) str, end21, c1216413.start());
                                sb9.append(Color.green(i2));
                                int end22 = c1216413.end();
                                if (c1216413.find()) {
                                    sb9.append((CharSequence) str, end22, c1216413.start());
                                    sb9.append(Color.blue(i2));
                                    sb9.append((CharSequence) str, c1216413.end(), str.length());
                                    return sb9.toString();
                                }
                            }
                        }
                        return null;
                    }
                }
            case 11:
                return m22527(str, Color.red(i2), Color.green(i2), Color.blue(i2));
            case 12:
                return m22527(str, Color.alpha(i2), Color.red(i2), Color.green(i2), Color.blue(i2));
            case 13:
                return m22527(str, Color.red(i2), Color.green(i2), Color.blue(i2), Color.alpha(i2));
            default:
                return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m22527(String str, int... iArr) {
        C12164 c12164 = f26543;
        synchronized (c12164) {
            StringBuilder sb = new StringBuilder();
            c12164.m29615reset((CharSequence) str);
            int i = 0;
            for (int i2 : iArr) {
                if (!c12164.find()) {
                    return null;
                }
                sb.append((CharSequence) str, i, c12164.start());
                sb.append(m22533(i2, c12164.group()));
                i = c12164.end();
            }
            sb.append((CharSequence) str, i, str.length());
            return sb.toString();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m22533(int i, String str) {
        boolean endsWith = str.endsWith("%");
        long j = i;
        if (endsWith) {
            j *= 100;
        }
        BigDecimal divide = BigDecimal.valueOf(j).divide(f26542, endsWith ? 2 : 3, RoundingMode.CEILING);
        String plainString = (divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros()).toPlainString();
        return endsWith ? C16014.m37867(plainString, "%") : plainString;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m22531(int i, String str) {
        return m22523(str, i, (C2453) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m22523(String str, int i, C2453 c2453) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        int i2;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        int i3 = -1;
        switch (i) {
            case 0:
                C12164 c12164 = f26546;
                synchronized (c12164) {
                    c12164.m29615reset((CharSequence) str);
                    boolean find = c12164.find();
                    m22529(c12164, find, c2453);
                    r14 = find ? c12164.group() : null;
                }
                if (r14 == null || r14.length() == 5 || r14.length() == 7) {
                    return 1447446;
                }
                return C9896.m25001(r14);
            case 1:
                C12164 c121642 = f26545;
                synchronized (c121642) {
                    c121642.m29615reset((CharSequence) str);
                    boolean find2 = c121642.find();
                    m22529(c121642, find2, c2453);
                    if (find2) {
                        str2 = c121642.group();
                        boolean find3 = c121642.find();
                        m22529(c121642, find3, c2453);
                        if (find3) {
                            str3 = c121642.group();
                            boolean find4 = c121642.find();
                            m22529(c121642, find4, c2453);
                            if (find4) {
                                r14 = c121642.group();
                            }
                        } else {
                            str3 = null;
                        }
                    } else {
                        str2 = null;
                        str3 = null;
                    }
                }
                if (r14 == null || str2.length() > 3 || str3.length() > 3 || r14.length() > 3) {
                    return 1447446;
                }
                int parseInt = Integer.parseInt(str2);
                int parseInt2 = Integer.parseInt(str3);
                int parseInt3 = Integer.parseInt(r14);
                if (parseInt < 0 || parseInt > 255 || parseInt2 < 0 || parseInt2 > 255 || parseInt3 < 0 || parseInt3 > 255) {
                    return 1447446;
                }
                return Color.rgb(parseInt, parseInt2, parseInt3);
            case 2:
                C12164 c121643 = f26543;
                synchronized (c121643) {
                    c121643.m29615reset((CharSequence) str);
                    boolean find5 = c121643.find();
                    m22529(c121643, find5, c2453);
                    if (find5) {
                        str4 = c121643.group();
                        boolean find6 = c121643.find();
                        m22529(c121643, find6, c2453);
                        if (find6) {
                            str5 = c121643.group();
                            boolean find7 = c121643.find();
                            m22529(c121643, find7, c2453);
                            if (find7) {
                                r14 = c121643.group();
                            }
                        } else {
                            str5 = null;
                        }
                    } else {
                        str4 = null;
                        str5 = null;
                    }
                }
                if (r14 == null) {
                    return 1447446;
                }
                float m22530 = m22530(str4);
                float m225302 = m22530(str5);
                float m225303 = m22530(r14);
                if (m22530 == 360.0f) {
                    m22530 = 0.0f;
                }
                if (m22530 < 0.0f || m22530 > 360.0f || m225302 < 0.0f || m225302 > 1.0f || m225303 < 0.0f || m225303 > 1.0f) {
                    return 1447446;
                }
                return C7191.m19269(new float[]{m22530, m225302, m225303});
            case 3:
                C12164 c121644 = f26543;
                synchronized (c121644) {
                    c121644.m29615reset((CharSequence) str);
                    boolean find8 = c121644.find();
                    m22529(c121644, find8, c2453);
                    if (find8) {
                        str6 = c121644.group();
                        boolean find9 = c121644.find();
                        m22529(c121644, find9, c2453);
                        if (find9) {
                            str7 = c121644.group();
                            boolean find10 = c121644.find();
                            m22529(c121644, find10, c2453);
                            if (find10) {
                                r14 = c121644.group();
                            }
                        } else {
                            str7 = null;
                        }
                    } else {
                        str6 = null;
                        str7 = null;
                    }
                }
                if (r14 == null) {
                    return 1447446;
                }
                float m225304 = m22530(str6);
                float m225305 = m22530(str7);
                float m225306 = m22530(r14);
                if (m225304 == 360.0f) {
                    m225304 = 0.0f;
                }
                if (m225304 < 0.0f || m225304 > 360.0f || m225305 < 0.0f || m225305 > 1.0f || m225306 < 0.0f || m225306 > 1.0f) {
                    return 1447446;
                }
                return Color.HSVToColor(new float[]{m225304, m225305, m225306});
            case 4:
                C12164 c121645 = f26545;
                synchronized (c121645) {
                    c121645.m29615reset((CharSequence) str);
                    boolean find11 = c121645.find();
                    m22529(c121645, find11, c2453);
                    if (find11) {
                        str8 = c121645.group();
                        boolean find12 = c121645.find();
                        m22529(c121645, find12, c2453);
                        if (find12) {
                            str9 = c121645.group();
                            boolean find13 = c121645.find();
                            m22529(c121645, find13, c2453);
                            if (find13) {
                                str10 = c121645.group();
                                i2 = c121645.end();
                            } else {
                                str10 = null;
                                i2 = -1;
                            }
                        }
                    } else {
                        str8 = null;
                    }
                    str9 = null;
                    str10 = null;
                    i2 = -1;
                }
                if (str10 != null) {
                    C12164 c121646 = f26543;
                    synchronized (c121646) {
                        c121646.m29615reset((CharSequence) str);
                        boolean find14 = c121646.find(i2);
                        m22529(c121646, find14, c2453);
                        r14 = find14 ? c121646.group() : null;
                    }
                }
                if (r14 == null || str8.length() > 3 || str9.length() > 3 || str10.length() > 3) {
                    return 1447446;
                }
                int parseInt4 = Integer.parseInt(str8);
                int parseInt5 = Integer.parseInt(str9);
                int parseInt6 = Integer.parseInt(str10);
                float m225307 = m22530(r14);
                if (parseInt4 < 0 || parseInt4 > 255 || parseInt5 < 0 || parseInt5 > 255 || parseInt6 < 0 || parseInt6 > 255 || m225307 < 0.0f || m225307 > 1.0f) {
                    return 1447446;
                }
                return Color.argb((int) (m225307 * 255.0f), parseInt4, parseInt5, parseInt6);
            case 5:
                C12164 c121647 = f26543;
                synchronized (c121647) {
                    c121647.m29615reset((CharSequence) str);
                    boolean find15 = c121647.find();
                    m22529(c121647, find15, c2453);
                    if (find15) {
                        str11 = c121647.group();
                        boolean find16 = c121647.find();
                        m22529(c121647, find16, c2453);
                        if (find16) {
                            str12 = c121647.group();
                            boolean find17 = c121647.find();
                            m22529(c121647, find17, c2453);
                            if (find17) {
                                str13 = c121647.group();
                                boolean find18 = c121647.find();
                                m22529(c121647, find18, c2453);
                                if (find18) {
                                    r14 = c121647.group();
                                }
                            } else {
                                str13 = null;
                            }
                        }
                    } else {
                        str11 = null;
                    }
                    str12 = null;
                    str13 = null;
                }
                if (r14 == null) {
                    return 1447446;
                }
                float m225308 = m22530(str11);
                float m225309 = m22530(str12);
                float m2253010 = m22530(str13);
                float m2253011 = m22530(r14);
                if (m225308 == 360.0f) {
                    m225308 = 0.0f;
                }
                if (m225308 < 0.0f || m225308 > 360.0f || m225309 < 0.0f || m225309 > 1.0f || m2253010 < 0.0f || m2253010 > 1.0f || m2253011 < 0.0f || m2253011 > 1.0f) {
                    return 1447446;
                }
                return (C7191.m19269(new float[]{m225308, m225309, m2253010}) & 16777215) | ((((int) (m2253011 * 255.0f)) & 255) << 24);
            case 6:
                C12164 c121648 = f26543;
                synchronized (c121648) {
                    c121648.m29615reset((CharSequence) str);
                    boolean find19 = c121648.find();
                    m22529(c121648, find19, c2453);
                    if (find19) {
                        str14 = c121648.group();
                        boolean find20 = c121648.find();
                        m22529(c121648, find20, c2453);
                        if (find20) {
                            str15 = c121648.group();
                            boolean find21 = c121648.find();
                            m22529(c121648, find21, c2453);
                            if (find21) {
                                str16 = c121648.group();
                                boolean find22 = c121648.find();
                                m22529(c121648, find22, c2453);
                                if (find22) {
                                    r14 = c121648.group();
                                }
                            } else {
                                str16 = null;
                            }
                        }
                    } else {
                        str14 = null;
                    }
                    str15 = null;
                    str16 = null;
                }
                if (r14 == null) {
                    return 1447446;
                }
                float m2253012 = m22530(str14);
                float m2253013 = m22530(str15);
                float m2253014 = m22530(str16);
                float m2253015 = m22530(r14);
                if (m2253012 == 360.0f) {
                    m2253012 = 0.0f;
                }
                if (m2253012 < 0.0f || m2253012 > 360.0f || m2253013 < 0.0f || m2253013 > 1.0f || m2253014 < 0.0f || m2253014 > 1.0f || m2253015 < 0.0f || m2253015 > 1.0f) {
                    return 1447446;
                }
                return Color.HSVToColor(((int) (m2253015 * 255.0f)) & 255, new float[]{m2253012, m2253013, m2253014});
            case 7:
                C12164 c121649 = f26545;
                synchronized (c121649) {
                    c121649.m29615reset((CharSequence) str);
                    boolean find23 = c121649.find();
                    m22529(c121649, find23, c2453);
                    if (find23) {
                        str17 = c121649.group();
                        boolean find24 = c121649.find();
                        m22529(c121649, find24, c2453);
                        if (find24) {
                            str18 = c121649.group();
                            boolean find25 = c121649.find();
                            m22529(c121649, find25, c2453);
                            if (find25) {
                                str19 = c121649.group();
                                boolean find26 = c121649.find();
                                m22529(c121649, find26, c2453);
                                if (find26) {
                                    r14 = c121649.group();
                                }
                            } else {
                                str19 = null;
                            }
                        }
                    } else {
                        str17 = null;
                    }
                    str18 = null;
                    str19 = null;
                }
                if (r14 == null || str17.length() > 3 || str18.length() > 3 || str19.length() > 3 || r14.length() > 3) {
                    return 1447446;
                }
                int parseInt7 = Integer.parseInt(str17);
                int parseInt8 = Integer.parseInt(str18);
                int parseInt9 = Integer.parseInt(str19);
                int parseInt10 = Integer.parseInt(r14);
                if (parseInt7 < 0 || parseInt7 > 255 || parseInt8 < 0 || parseInt8 > 255 || parseInt9 < 0 || parseInt9 > 255 || parseInt10 < 0 || parseInt10 > 255) {
                    return 1447446;
                }
                return Color.argb(parseInt7, parseInt8, parseInt9, parseInt10);
            case 8:
                C12164 c1216410 = f26546;
                synchronized (c1216410) {
                    c1216410.m29615reset((CharSequence) str);
                    boolean find27 = c1216410.find();
                    m22529(c1216410, find27, c2453);
                    r14 = find27 ? c1216410.group() : null;
                }
                if (r14 == null || r14.length() == 5 || r14.length() == 7) {
                    return 1447446;
                }
                char[] charArray = r14.toCharArray();
                int length = r14.length();
                if (length == 3) {
                    return C9896.m24989(charArray[2]) | (C9896.m24989(charArray[0]) << 20) | (-16777216) | (C9896.m24989(charArray[0]) << 16) | (C9896.m24989(charArray[1]) << 12) | (C9896.m24989(charArray[1]) << 8) | (C9896.m24989(charArray[2]) << 4);
                }
                if (length == 4) {
                    return C9896.m24989(charArray[2]) | (C9896.m24989(charArray[3]) << 28) | (C9896.m24989(charArray[3]) << 24) | (C9896.m24989(charArray[0]) << 20) | (C9896.m24989(charArray[0]) << 16) | (C9896.m24989(charArray[1]) << 12) | (C9896.m24989(charArray[1]) << 8) | (C9896.m24989(charArray[2]) << 4);
                }
                if (length == 6) {
                    return C9896.m24989(charArray[5]) | (C9896.m24989(charArray[0]) << 20) | (-16777216) | (C9896.m24989(charArray[1]) << 16) | (C9896.m24989(charArray[2]) << 12) | (C9896.m24989(charArray[3]) << 8) | (C9896.m24989(charArray[4]) << 4);
                }
                if (length == 8) {
                    return C9896.m24989(charArray[5]) | (C9896.m24989(charArray[6]) << 28) | (C9896.m24989(charArray[7]) << 24) | (C9896.m24989(charArray[0]) << 20) | (C9896.m24989(charArray[1]) << 16) | (C9896.m24989(charArray[2]) << 12) | (C9896.m24989(charArray[3]) << 8) | (C9896.m24989(charArray[4]) << 4);
                }
                throw new RuntimeException("Hex color format error: " + ((Object) charArray));
            case 9:
                C12164 c1216411 = f26545;
                synchronized (c1216411) {
                    c1216411.m29615reset((CharSequence) str);
                    boolean find28 = c1216411.find();
                    m22529(c1216411, find28, c2453);
                    if (find28) {
                        str20 = c1216411.group();
                        boolean find29 = c1216411.find();
                        m22529(c1216411, find29, c2453);
                        if (find29) {
                            str21 = c1216411.group();
                            boolean find30 = c1216411.find();
                            m22529(c1216411, find30, c2453);
                            if (find30) {
                                str22 = c1216411.group();
                                boolean find31 = c1216411.find();
                                m22529(c1216411, find31, c2453);
                                if (find31) {
                                    r14 = c1216411.group();
                                }
                            } else {
                                str22 = null;
                            }
                        }
                    } else {
                        str20 = null;
                    }
                    str21 = null;
                    str22 = null;
                }
                if (r14 == null || r14.length() > 3 || str20.length() > 3 || str21.length() > 3 || str22.length() > 3) {
                    return 1447446;
                }
                int parseInt11 = Integer.parseInt(r14);
                int parseInt12 = Integer.parseInt(str20);
                int parseInt13 = Integer.parseInt(str21);
                int parseInt14 = Integer.parseInt(str22);
                if (parseInt11 < 0 || parseInt11 > 255 || parseInt12 < 0 || parseInt12 > 255 || parseInt13 < 0 || parseInt13 > 255 || parseInt14 < 0 || parseInt14 > 255) {
                    return 1447446;
                }
                return Color.argb(parseInt11, parseInt12, parseInt13, parseInt14);
            case 10:
                C12164 c1216412 = f26543;
                synchronized (c1216412) {
                    c1216412.m29615reset((CharSequence) str);
                    boolean find32 = c1216412.find();
                    m22529(c1216412, find32, c2453);
                    if (find32) {
                        str23 = c1216412.group();
                        i3 = c1216412.end();
                    } else {
                        str23 = null;
                    }
                }
                if (str23 != null) {
                    C12164 c1216413 = f26545;
                    synchronized (c1216413) {
                        c1216413.m29615reset((CharSequence) str);
                        boolean find33 = c1216413.find(i3);
                        m22529(c1216413, find33, c2453);
                        if (find33) {
                            String group = c1216413.group();
                            boolean find34 = c1216413.find();
                            m22529(c1216413, find34, c2453);
                            if (find34) {
                                str25 = c1216413.group();
                                boolean find35 = c1216413.find();
                                m22529(c1216413, find35, c2453);
                                r14 = group;
                                str26 = find35 ? c1216413.group() : null;
                            } else {
                                str25 = null;
                                r14 = group;
                                str26 = null;
                            }
                        } else {
                            str26 = null;
                            str25 = null;
                        }
                    }
                    String str27 = r14;
                    r14 = str26;
                    str24 = str27;
                } else {
                    str24 = null;
                    str25 = null;
                }
                if (r14 == null || str24.length() > 3 || str25.length() > 3 || r14.length() > 3) {
                    return 1447446;
                }
                float m2253016 = m22530(str23);
                int parseInt15 = Integer.parseInt(str24);
                int parseInt16 = Integer.parseInt(str25);
                int parseInt17 = Integer.parseInt(r14);
                if (m2253016 < 0.0f || m2253016 > 1.0f || parseInt15 < 0 || parseInt15 > 255 || parseInt16 < 0 || parseInt16 > 255 || parseInt17 < 0 || parseInt17 > 255) {
                    return 1447446;
                }
                return Color.argb((int) (m2253016 * 255.0f), parseInt15, parseInt16, parseInt17);
            case 11:
            case 12:
            case 13:
                return m22524(str, i, (InterfaceC20715) c2453);
            default:
                return 1447446;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m22524(String str, int i, InterfaceC20715 interfaceC20715) {
        int i2;
        float f;
        int i3;
        int i4 = i == 11 ? 3 : 4;
        float[] fArr = new float[i4];
        C12164 c12164 = f26543;
        synchronized (c12164) {
            c12164.m29615reset((CharSequence) str);
            while (i2 < i4) {
                boolean find = c12164.find();
                m22529(c12164, find, interfaceC20715);
                if (!find) {
                    return 1447446;
                }
                float m22530 = m22530(c12164.group());
                fArr[i2] = m22530;
                i2 = (m22530 >= 0.0f && m22530 <= 1.0f) ? i2 + 1 : 0;
                return 1447446;
            }
            int i5 = i == 12 ? 1 : 0;
            if (i == 12) {
                f = fArr[0];
            } else if (i == 13) {
                f = fArr[3];
            } else {
                i3 = 255;
                return Color.argb(i3, (int) (fArr[i5] * 255.0f), (int) (fArr[i5 + 1] * 255.0f), (int) (fArr[i5 + 2] * 255.0f));
            }
            i3 = (int) (f * 255.0f);
            return Color.argb(i3, (int) (fArr[i5] * 255.0f), (int) (fArr[i5 + 1] * 255.0f), (int) (fArr[i5 + 2] * 255.0f));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22529(C12164 c12164, boolean z, InterfaceC20715 interfaceC20715) {
        if (interfaceC20715 != null) {
            try {
                C3158.m9611(((C2453) interfaceC20715).f7840, c12164);
            } catch (RuntimeException e) {
                throw new C9426(e);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static float m22530(String str) {
        boolean z = false;
        if (str.endsWith("%")) {
            str = C15472.m36561(1, 0, str);
            z = true;
        }
        float parseFloat = Float.parseFloat(str);
        return z ? parseFloat / 100.0f : parseFloat;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m22526(String str, float f) {
        boolean endsWith = str.endsWith("%");
        if (endsWith) {
            f *= 100.0f;
        }
        BigDecimal scale = new BigDecimal(Float.toString(f)).setScale(endsWith ? 2 : 3, RoundingMode.HALF_UP);
        String plainString = (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
        return endsWith ? C16014.m37867(plainString, "%") : plainString;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m22534() {
        return Integer.toString(f26541.getAndIncrement(), 36);
    }
}
