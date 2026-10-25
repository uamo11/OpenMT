package l;

/* compiled from: T8FC */
/* renamed from: l.۟᩷֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7708 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m20625(int i, int i2, String str, byte[] bArr) {
        int i3;
        if (str.length() == i2 && i >= 0 && (i3 = i2 + i) <= bArr.length) {
            int i4 = 0;
            while (true) {
                int i5 = i + i4;
                int i6 = i5 + 3;
                if (i6 < i3) {
                    char charAt = str.charAt(i4);
                    char charAt2 = str.charAt(i4 + 1);
                    char charAt3 = str.charAt(i4 + 2);
                    char charAt4 = str.charAt(i4 + 3);
                    if (charAt > 127 || charAt2 > 127 || charAt3 > 127 || charAt4 > 127 || ((byte) charAt) != bArr[i5] || ((byte) charAt2) != bArr[i5 + 1] || ((byte) charAt3) != bArr[i5 + 2] || ((byte) charAt4) != bArr[i6]) {
                        break;
                    }
                    i4 += 4;
                } else {
                    while (true) {
                        int i7 = i + i4;
                        if (i7 >= i3) {
                            return true;
                        }
                        char charAt5 = str.charAt(i4);
                        if (charAt5 > 127 || ((byte) charAt5) != bArr[i7]) {
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
        return false;
    }
}
