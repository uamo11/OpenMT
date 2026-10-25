package l;

import com.google.android.material.badge.BadgeDrawable;

/* compiled from: N673 */
/* renamed from: l.ۘۙᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3721 implements InterfaceC14303 {
    public static final String[] d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};
    public static final C3721 e = new C3721("+HH:MM:ss", "Z");
    public static final C3721 f = new C3721("+HH:MM:ss", "0");
    public final String a;
    public final int b;
    public final int c;

    public C3721(String str, String str2) {
        C11003.requireNonNull(str, "pattern");
        C11003.requireNonNull(str2, "noOffsetText");
        for (int i = 0; i < 22; i++) {
            if (d[i].equals(str)) {
                this.b = i;
                this.c = i % 11;
                this.a = str2;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
    }

    @Override // l.InterfaceC14303
    public final boolean l(C10071 c10071, StringBuilder sb) {
        Long a = c10071.a(EnumC18496.OFFSET_SECONDS);
        boolean z = false;
        if (a == null) {
            return false;
        }
        int y = AbstractC22791.y(a.longValue());
        String str = this.a;
        if (y == 0) {
            sb.append(str);
            return true;
        }
        int abs = Math.abs((y / 3600) % 100);
        int abs2 = Math.abs((y / 60) % 60);
        int abs3 = Math.abs(y % 60);
        int length = sb.length();
        sb.append(y < 0 ? "-" : BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        if (this.b < 11 || abs >= 10) {
            a(false, abs, sb);
        } else {
            sb.append((char) (abs + 48));
        }
        int i = this.c;
        if ((i >= 3 && i <= 8) || ((i >= 9 && abs3 > 0) || (i >= 1 && abs2 > 0))) {
            a(i > 0 && i % 2 == 0, abs2, sb);
            abs += abs2;
            if (i == 7 || i == 8 || (i >= 5 && abs3 > 0)) {
                if (i > 0 && i % 2 == 0) {
                    z = true;
                }
                a(z, abs3, sb);
                abs += abs3;
            }
        }
        if (abs == 0) {
            sb.setLength(length);
            sb.append(str);
        }
        return true;
    }

    public static void a(boolean z, int i, StringBuilder sb) {
        sb.append(z ? ":" : "");
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // l.InterfaceC14303
    public final int m(C3015 c3015, CharSequence charSequence, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int length = charSequence.length();
        int length2 = this.a.length();
        if (length2 == 0) {
            if (i == length) {
                return c3015.f(EnumC18496.OFFSET_SECONDS, 0L, i, i);
            }
        } else {
            if (i == length) {
                return ~i;
            }
            if (c3015.g(charSequence, i, this.a, 0, length2)) {
                return c3015.f(EnumC18496.OFFSET_SECONDS, 0L, i, i + length2);
            }
        }
        char charAt = charSequence.charAt(i);
        if (charAt == '+' || charAt == '-') {
            int i6 = charAt == '-' ? -1 : 1;
            int i7 = this.c;
            boolean z = i7 > 0 && i7 % 2 == 0;
            int i8 = this.b;
            boolean z2 = i8 < 11;
            int[] iArr = new int[4];
            iArr[0] = i + 1;
            if (!c3015.c) {
                if (z2) {
                    if (z || (i8 == 0 && length > (i5 = i + 3) && charSequence.charAt(i5) == ':')) {
                        i8 = 10;
                        z = true;
                    } else {
                        i8 = 9;
                    }
                } else if (z || (i8 == 11 && length > (i4 = i + 3) && (charSequence.charAt(i + 2) == ':' || charSequence.charAt(i4) == ':'))) {
                    i8 = 21;
                    z = true;
                } else {
                    i8 = 20;
                }
            }
            switch (i8) {
                case 0:
                case 11:
                    c = 0;
                    c(charSequence, z2, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    c = 0;
                    c(charSequence, z2, iArr);
                    d(charSequence, z, false, iArr);
                    break;
                case 3:
                case 4:
                case 15:
                    c = 0;
                    c(charSequence, z2, iArr);
                    d(charSequence, z, true, iArr);
                    break;
                case 5:
                case 6:
                case 17:
                    c = 0;
                    c(charSequence, z2, iArr);
                    d(charSequence, z, true, iArr);
                    b(charSequence, z, 3, iArr);
                    break;
                case 7:
                case 8:
                case 19:
                    c(charSequence, z2, iArr);
                    d(charSequence, z, true, iArr);
                    if (!b(charSequence, z, 3, iArr)) {
                        c = 0;
                        iArr[0] = ~iArr[0];
                        break;
                    }
                    c = 0;
                    break;
                case 9:
                case 10:
                case 21:
                    c(charSequence, z2, iArr);
                    if (b(charSequence, z, 2, iArr)) {
                        b(charSequence, z, 3, iArr);
                    }
                    c = 0;
                    break;
                case 12:
                    e(charSequence, 1, 4, iArr);
                    c = 0;
                    break;
                case 14:
                    e(charSequence, 3, 4, iArr);
                    c = 0;
                    break;
                case 16:
                    e(charSequence, 3, 6, iArr);
                    c = 0;
                    break;
                case 18:
                    e(charSequence, 5, 6, iArr);
                    c = 0;
                    break;
                case 20:
                    e(charSequence, 1, 6, iArr);
                    c = 0;
                    break;
                default:
                    c = 0;
                    break;
            }
            int i9 = iArr[c];
            if (i9 > 0) {
                int i10 = iArr[1];
                if (i10 > 23 || (i2 = iArr[2]) > 59 || (i3 = iArr[3]) > 59) {
                    throw new C16232("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                }
                return c3015.f(EnumC18496.OFFSET_SECONDS, ((i2 * 60) + (i10 * 3600) + i3) * i6, i, i9);
            }
        }
        return length2 == 0 ? c3015.f(EnumC18496.OFFSET_SECONDS, 0L, i, i) : ~i;
    }

    public static void c(CharSequence charSequence, boolean z, int[] iArr) {
        if (z) {
            if (b(charSequence, false, 1, iArr)) {
                return;
            }
            iArr[0] = ~iArr[0];
            return;
        }
        e(charSequence, 1, 2, iArr);
    }

    public static void d(CharSequence charSequence, boolean z, boolean z2, int[] iArr) {
        if (b(charSequence, z, 2, iArr) || !z2) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    public static boolean b(CharSequence charSequence, boolean z, int i, int[] iArr) {
        int i2 = iArr[0];
        if (i2 < 0) {
            return true;
        }
        if (z && i != 1) {
            int i3 = i2 + 1;
            if (i3 <= charSequence.length() && charSequence.charAt(i2) == ':') {
                i2 = i3;
            }
            return false;
        }
        int i4 = i2 + 2;
        if (i4 <= charSequence.length()) {
            int i5 = i2 + 1;
            char charAt = charSequence.charAt(i2);
            char charAt2 = charSequence.charAt(i5);
            if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
                int i6 = (charAt2 - '0') + ((charAt - '0') * 10);
                if (i6 >= 0 && i6 <= 59) {
                    iArr[i] = i6;
                    iArr[0] = i4;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r12[0] = ~r12[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.CharSequence r9, int r10, int r11, int[] r12) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3721.e(java.lang.CharSequence, int, int, int[]):void");
    }

    public final String toString() {
        String replace = this.a.replace("'", "''");
        return "Offset(" + d[this.b] + ",'" + replace + "')";
    }
}
