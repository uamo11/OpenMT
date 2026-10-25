package l;

import java.nio.ByteBuffer;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: Y3NK */
/* renamed from: l.۫֨ۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12071 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC19833 f36100;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m29445(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m29453(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m29454(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m29452(byte[] bArr) {
        return f36100.mo12950(0, bArr, 0, bArr.length) == 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m29449(int i, int i2, byte[] bArr) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return m29453(b, bArr[i]);
        }
        if (i3 == 2) {
            return m29454(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m29450(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new C2899(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + Blake2xsDigest.MAX_NUMBER_BLOCKS));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m29448(int i, int i2, String str, byte[] bArr) {
        return f36100.mo12949(i, i2, str, bArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m29451(ByteBuffer byteBuffer, int i, int i2) {
        AbstractC19833 abstractC19833 = f36100;
        abstractC19833.getClass();
        if (byteBuffer.hasArray()) {
            return abstractC19833.mo12951(byteBuffer.arrayOffset() + i, i2, byteBuffer.array());
        }
        if (byteBuffer.isDirect()) {
            return abstractC19833.mo12952(byteBuffer, i, i2);
        }
        return AbstractC19833.m45602(byteBuffer, i, i2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m29455(int i, int i2, byte[] bArr) {
        return f36100.mo12951(i, i2, bArr);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m29456(int i, int i2, byte[] bArr) {
        return f36100.mo12950(0, bArr, i, i2) == 0;
    }

    static {
        f36100 = (C21244.m48250() && C21244.m48247() && !C0241.m1501()) ? new C12776() : new C4310();
    }
}
