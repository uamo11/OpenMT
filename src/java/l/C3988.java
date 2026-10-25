package l;

import com.alipay.sdk.m.p.a;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: 14GL */
/* renamed from: l.ۘܰ᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3988 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Pattern f12638 = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Pattern f12639 = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Pattern f12640 = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final Pattern f12641 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f12642;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f12643;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f12644;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f12645;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f12646;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f12647;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f12648;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f12649;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f12650;

    public C3988(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f12647 = str;
        this.f12649 = str2;
        this.f12644 = j;
        this.f12642 = str3;
        this.f12645 = str4;
        this.f12643 = z;
        this.f12648 = z2;
        this.f12646 = z3;
        this.f12650 = z4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m12035() {
        return this.f12647;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m12036() {
        return this.f12649;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m12033(int i, String str) {
        int m12032 = m12032(str, 0, i, false);
        Pattern pattern = f12641;
        Matcher matcher = pattern.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (m12032 < i) {
            int m120322 = m12032(str, m12032 + 1, i, true);
            matcher.region(m12032, m120322);
            if (i3 == -1 && matcher.usePattern(pattern).matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                int parseInt2 = Integer.parseInt(matcher.group(2));
                i7 = Integer.parseInt(matcher.group(3));
                i6 = parseInt2;
                i3 = parseInt;
            } else if (i4 == -1 && matcher.usePattern(f12640).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            } else {
                if (i5 == -1) {
                    Pattern pattern2 = f12639;
                    if (matcher.usePattern(pattern2).matches()) {
                        i5 = pattern2.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i2 == -1 && matcher.usePattern(f12638).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            }
            m12032 = m12032(str, m120322 + 1, i, false);
        }
        if (i2 >= 70 && i2 <= 99) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 <= 69) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            throw new IllegalArgumentException();
        }
        if (i5 == -1) {
            throw new IllegalArgumentException();
        }
        if (i4 < 1 || i4 > 31) {
            throw new IllegalArgumentException();
        }
        if (i3 < 0 || i3 > 23) {
            throw new IllegalArgumentException();
        }
        if (i6 < 0 || i6 > 59) {
            throw new IllegalArgumentException();
        }
        if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(C20032.f64892);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i5 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m12032(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x01d7, code lost:
    
        if (l.C20032.m46187(r0) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00fe, code lost:
    
        if (r15 <= 0) goto L48;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List m12034(l.C11749 r28, l.C10338 r29) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3988.m12034(l.ۨܰ᩵, l.ۤܰ᩵):java.util.List");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12647);
        sb.append(a.h);
        sb.append(this.f12649);
        if (this.f12650) {
            long j = this.f12644;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C5033.m14544(new Date(j)));
            }
        }
        if (!this.f12646) {
            sb.append("; domain=");
            sb.append(this.f12642);
        }
        sb.append("; path=");
        sb.append(this.f12645);
        if (this.f12643) {
            sb.append("; secure");
        }
        if (this.f12648) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3988)) {
            return false;
        }
        C3988 c3988 = (C3988) obj;
        return c3988.f12647.equals(this.f12647) && c3988.f12649.equals(this.f12649) && c3988.f12642.equals(this.f12642) && c3988.f12645.equals(this.f12645) && c3988.f12644 == this.f12644 && c3988.f12643 == this.f12643 && c3988.f12648 == this.f12648 && c3988.f12650 == this.f12650 && c3988.f12646 == this.f12646;
    }

    public final int hashCode() {
        int m27349 = C11010.m27349(C11010.m27349(C11010.m27349(C11010.m27349(527, 31, this.f12647), 31, this.f12649), 31, this.f12642), 31, this.f12645);
        long j = this.f12644;
        return ((((((((m27349 + ((int) (j ^ (j >>> 32)))) * 31) + (!this.f12643 ? 1 : 0)) * 31) + (!this.f12648 ? 1 : 0)) * 31) + (!this.f12650 ? 1 : 0)) * 31) + (!this.f12646 ? 1 : 0);
    }
}
