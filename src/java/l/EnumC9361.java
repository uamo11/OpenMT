package l;

import bin.mt.plus.R;
import java.util.Calendar;

/* compiled from: L73K */
/* renamed from: l.ۢۙܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum EnumC9361 {
    ANY(0, -1, 0, R.string.MT_Protector_res_0x7f1203cd),
    TODAY(1, 0, 0, R.string.MT_Protector_res_0x7f1203d3),
    YESTERDAY(2, 0, -1, R.string.MT_Protector_res_0x7f1203d4),
    THIS_WEEK(3, 1, 0, R.string.MT_Protector_res_0x7f1203d1),
    LAST_WEEK(4, 1, -1, R.string.MT_Protector_res_0x7f1203cf),
    THIS_MONTH(5, 2, 0, R.string.MT_Protector_res_0x7f1203d0),
    LAST_MONTH(6, 2, -1, R.string.MT_Protector_res_0x7f1203ce),
    THIS_YEAR(7, 3, 0, R.string.MT_Protector_res_0x7f1203d2);


    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final String f28423 = " ";

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f28431;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f28432;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f28433;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f28434;

    EnumC9361(int i, int i2, int i3, int i4) {
        this.f28431 = i;
        this.f28432 = i2;
        this.f28434 = i3;
        this.f28433 = i4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long[] m24184(long j) {
        int i = 2;
        if (this.f28432 == -1) {
            return new long[]{-1, -1};
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i2 = this.f28434;
        if (i2 != 0) {
            int i3 = this.f28432;
            if (i3 == 0) {
                i = 5;
            } else if (i3 == 1) {
                i = 3;
            } else if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException();
                }
                i = 1;
            }
            calendar.add(i, i2);
        }
        return C5189.m14949(this.f28432, calendar.getTimeInMillis());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m24183() {
        return C4925.m14327(this.f28433);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int m24185() {
        return this.f28431;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC9361 m24181(int i) {
        for (EnumC9361 enumC9361 : values()) {
            if (enumC9361 != ANY && enumC9361.f28431 == i) {
                return enumC9361;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24180(long j, long j2) {
        if (j == -1 && j2 == -1) {
            return ANY.m24183();
        }
        if (j == -1) {
            return "< " + C17283.m40572(j2);
        }
        if (j2 == -1) {
            return "≥ " + C17283.m40572(j);
        }
        return C17283.m40572(j) + " - " + C17283.m40572(j2);
    }
}
