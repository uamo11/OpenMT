package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* compiled from: 56LP */
/* renamed from: l.ܶۛۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15040 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7986 m35581(long j, int i, int i2, int i3, long j2) {
        for (int i4 = 1; i4 <= 32768; i4 *= 2) {
            long m13563 = (C4623.m13563(i, i2, i4) * i3) + j;
            if (C4623.m13562(i, i4) <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX && C4623.m13562(i2, i4) <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX && m13563 <= j2) {
                return new C7986(i4, m13563);
            }
        }
        throw new C1095("Animation workspace exceeds allocation limit");
    }
}
