package l;

import bin.mt.plus.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: N33Q */
/* renamed from: l.ܿۨۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17324 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final SimpleDateFormat f53059 = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final SimpleDateFormat f53060 = new SimpleDateFormat("MM-dd");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m40646(long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis >= 0) {
            long j2 = currentTimeMillis / 1000;
            if (j2 < 60) {
                int i = (int) j2;
                return C4925.m14338().getQuantityString(R.plurals.MT_Protector_res_0x7f11000b, i, Integer.valueOf(i));
            }
            long j3 = j2 / 60;
            if (j3 < 60) {
                int i2 = (int) j3;
                return C4925.m14338().getQuantityString(R.plurals.MT_Protector_res_0x7f11000a, i2, Integer.valueOf(i2));
            }
            long j4 = j3 / 60;
            if (j4 < 24) {
                int i3 = (int) j4;
                return C4925.m14338().getQuantityString(R.plurals.MT_Protector_res_0x7f110009, i3, Integer.valueOf(i3));
            }
            long j5 = j4 / 24;
            if (j5 < 31) {
                int i4 = (int) j5;
                return C4925.m14338().getQuantityString(R.plurals.MT_Protector_res_0x7f110008, i4, Integer.valueOf(i4));
            }
        }
        if (new Date().getYear() != new Date(j).getYear()) {
            return f53059.format(Long.valueOf(j));
        }
        return f53060.format(Long.valueOf(j));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Long m40645(C7605 c7605) {
        Long m20388 = c7605.m20388();
        if (m20388 == null && (m20388 = c7605.m20389()) != null && c7605.m20385("OffsetTimeOriginal") == null) {
            m20388 = Long.valueOf(m20388.longValue() - TimeZone.getDefault().getRawOffset());
        }
        if (m20388 == null && (m20388 = c7605.m20387()) != null && c7605.m20385("OffsetTimeDigitized") == null) {
            m20388 = Long.valueOf(m20388.longValue() - TimeZone.getDefault().getRawOffset());
        }
        return (m20388 == null && (m20388 = c7605.m20386()) != null && c7605.m20385("OffsetTime") == null) ? Long.valueOf(m20388.longValue() - TimeZone.getDefault().getRawOffset()) : m20388;
    }
}
