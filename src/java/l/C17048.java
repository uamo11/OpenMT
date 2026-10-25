package l;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: 64LS */
/* renamed from: l.ܿۖ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17048 implements InterfaceC1211 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int[] f52245 = {14, 13, 12, 11, 5, 2, 1};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public SimpleDateFormat f52246;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f52247;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f52248;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f52249;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public SimpleDateFormat f52250;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m40015(SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat == null) {
            return 0;
        }
        String pattern = simpleDateFormat.toPattern();
        for (char c : "SsmHdM".toCharArray()) {
            if (pattern.indexOf(c) != -1) {
                if (c == 'H') {
                    return m40014(11);
                }
                if (c == 'M') {
                    return m40014(2);
                }
                if (c == 'S') {
                    return m40014(14);
                }
                if (c == 'd') {
                    return m40014(5);
                }
                if (c == 'm') {
                    return m40014(12);
                }
                if (c == 's') {
                    return m40014(13);
                }
            }
        }
        return 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m40014(int i) {
        for (int i2 = 0; i2 < 7; i2++) {
            if (i == f52245[i2]) {
                return i2;
            }
        }
        return 0;
    }

    public C17048() {
        m40016("MMM d yyyy", null);
        m40017("MMM d HH:mm", null);
    }

    @Override // l.InterfaceC1211
    /* renamed from: ֫ */
    public final void mo4051(C3328 c3328) {
        c3328.getClass();
        DateFormatSymbols m10179 = C3328.m10179("en");
        m40017(c3328.m10182(), m10179);
        String m10180 = c3328.m10180();
        if (m10180 == null) {
            throw new IllegalArgumentException("defaultFormatString cannot be null");
        }
        m40016(m10180, m10179);
        TimeZone timeZone = TimeZone.getDefault();
        this.f52246.setTimeZone(timeZone);
        SimpleDateFormat simpleDateFormat = this.f52250;
        if (simpleDateFormat != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        this.f52248 = c3328.m10185();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Calendar m40018(String str) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.setTimeZone(this.f52246.getTimeZone());
        SimpleDateFormat simpleDateFormat = this.f52250;
        int[] iArr = f52245;
        if (simpleDateFormat != null) {
            Calendar calendar3 = (Calendar) calendar.clone();
            calendar3.setTimeZone(this.f52246.getTimeZone());
            if (this.f52248) {
                calendar3.add(5, 1);
            }
            String m50967 = C22870.m50967(str, " ", Integer.toString(calendar3.get(1)));
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(this.f52250.toPattern() + " yyyy", this.f52250.getDateFormatSymbols());
            simpleDateFormat2.setLenient(false);
            simpleDateFormat2.setTimeZone(this.f52250.getTimeZone());
            ParsePosition parsePosition = new ParsePosition(0);
            Date parse = simpleDateFormat2.parse(m50967, parsePosition);
            if (parse != null && parsePosition.getIndex() == m50967.length()) {
                calendar2.setTime(parse);
                if (calendar2.after(calendar3)) {
                    calendar2.add(1, -1);
                }
                int i = this.f52249;
                if (i > 0) {
                    int i2 = iArr[i - 1];
                    if (calendar2.get(i2) == 0) {
                        calendar2.clear(i2);
                        return calendar2;
                    }
                }
                return calendar2;
            }
        }
        ParsePosition parsePosition2 = new ParsePosition(0);
        Date parse2 = this.f52246.parse(str, parsePosition2);
        if (parse2 == null || parsePosition2.getIndex() != str.length()) {
            StringBuilder m9834 = C3200.m9834("Timestamp '", str, "' could not be parsed using a server time of ");
            m9834.append(calendar.getTime().toString());
            throw new ParseException(m9834.toString(), parsePosition2.getErrorIndex());
        }
        calendar2.setTime(parse2);
        int i3 = this.f52247;
        if (i3 > 0) {
            int i4 = iArr[i3 - 1];
            if (calendar2.get(i4) == 0) {
                calendar2.clear(i4);
                return calendar2;
            }
        }
        return calendar2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40016(String str, DateFormatSymbols dateFormatSymbols) {
        if (dateFormatSymbols != null) {
            this.f52246 = new SimpleDateFormat(str, dateFormatSymbols);
        } else {
            this.f52246 = new SimpleDateFormat(str);
        }
        this.f52246.setLenient(false);
        this.f52247 = m40015(this.f52246);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m40017(String str, DateFormatSymbols dateFormatSymbols) {
        if (str != null) {
            if (dateFormatSymbols != null) {
                this.f52250 = new SimpleDateFormat(str, dateFormatSymbols);
            } else {
                this.f52250 = new SimpleDateFormat(str);
            }
            this.f52250.setLenient(false);
        } else {
            this.f52250 = null;
        }
        this.f52249 = m40015(this.f52250);
    }
}
