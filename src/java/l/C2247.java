package l;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Calendar;

/* compiled from: C5LF */
/* renamed from: l.ۖۖᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2247 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Serializable f7318;

    public C2247(String str, int i) {
        String replace = str.replace(" ", "").replace("_", "");
        if (replace.startsWith("-")) {
            try {
                replace = Integer.toHexString(Integer.parseInt(replace, i));
                i = 16;
            } catch (NumberFormatException unused) {
            }
        }
        this.f7318 = new BigInteger(replace, i);
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.io.Serializable, long[]] */
    public C2247() {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(10, -24);
        this.f7318 = new long[]{currentTimeMillis - 600000, currentTimeMillis - 3600000, timeInMillis, calendar.getTimeInMillis(), currentTimeMillis - 604800000, currentTimeMillis - 2592000000L};
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String m7446() {
        BigInteger bigInteger = (BigInteger) this.f7318;
        if (bigInteger.intValue() < 0) {
            return bigInteger.toString(10) + ", " + bigInteger.intValue() + " (32bit)";
        }
        return bigInteger.toString(10);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m7444(long j) {
        long[] jArr = (long[]) this.f7318;
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j > jArr[i]) {
                return i;
            }
        }
        return length;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String m7445() {
        return m7442(4, ((BigInteger) this.f7318).toString(2), "0b");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m7442(int i, String str, String str2) {
        int i2;
        if (str.length() > 0 && str.charAt(0) == '-') {
            str2 = "-".concat(str2);
            str = str.substring(1);
        }
        StringBuilder sb = new StringBuilder(str2);
        if (str.length() % i != 0) {
            i2 = i - (str.length() % i);
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append('0');
            }
        } else {
            i2 = 0;
        }
        for (char c : str.toCharArray()) {
            if (i2 > 0 && i2 % i == 0) {
                sb.append('_');
            }
            sb.append(c);
            i2++;
        }
        return sb.toString();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String m7448() {
        return m7442(8, ((BigInteger) this.f7318).toString(16).toUpperCase(), "0x");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String m7447() {
        return m7442(4, ((BigInteger) this.f7318).toString(8), "0_");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m7443() {
        return ((BigInteger) this.f7318).intValue();
    }
}
