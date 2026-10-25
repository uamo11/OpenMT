package l;

/* compiled from: I7DP */
/* renamed from: l.᩻ۗۚ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23424 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f75225 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final char[] f75226 = "0123456789ABCDEF".toCharArray();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51890(int i, long j) {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            stringBuffer.append(f75226[((int) (j >> (i * 4))) & 15]);
        }
        String stringBuffer2 = stringBuffer.toString();
        if (stringBuffer2.isEmpty()) {
            stringBuffer2 = "0";
        }
        return "0x".concat(stringBuffer2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51889(int i) {
        int i2 = 8;
        while (i2 > 0 && (i >> ((i2 - 1) * 4)) == 0) {
            i2--;
        }
        return m51890(i2, i);
    }
}
