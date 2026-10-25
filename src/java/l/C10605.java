package l;

import java.util.Arrays;

/* compiled from: 365A */
/* renamed from: l.ۤ᩺ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10605 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f31825;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 10; i++) {
            bArr[i + 48] = (byte) i;
        }
        for (int i2 = 0; i2 < 26; i2++) {
            byte b = (byte) (i2 + 10);
            bArr[i2 + 65] = b;
            bArr[i2 + 97] = b;
        }
        f31825 = bArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m26624(char c) {
        if (c < 128) {
            return f31825[c];
        }
        return -1;
    }
}
