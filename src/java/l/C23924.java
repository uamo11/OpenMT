package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* compiled from: I1TX */
/* renamed from: l.᩻᩶ۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23924 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final long f77597 = m52688(256, 257, 0);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m52687(long j) {
        long j2 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS & j;
        long j3 = j >>> 16;
        return j2 == 0 ? (int) (j3 & 511) : (-16777216) | ((int) (j3 & 16777215));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m52688(int i, int i2, int i3) {
        long j = i;
        return ((i2 & (-16777216)) == -16777216 ? ((i2 & 16777215) << 16) | ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS : (i2 & 511) << 16) | (i3 & SecP521R1Field.P16) | ((i & (-16777216)) == -16777216 ? ((j & 16777215) << 40) | 512 : (j & 511) << 40);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m52689(long j) {
        long j2 = 512 & j;
        long j3 = j >>> 40;
        return j2 == 0 ? (int) (j3 & 511) : (-16777216) | ((int) (j3 & 16777215));
    }
}
