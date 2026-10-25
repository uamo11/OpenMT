package l;

import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: K963 */
/* renamed from: l.ۜܿۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6901 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18685(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static BigDecimal m18686(String str) {
        m18685(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static BigInteger m18687(String str) {
        m18685(str);
        return new BigInteger(str);
    }
}
