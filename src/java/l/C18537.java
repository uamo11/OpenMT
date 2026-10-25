package l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.security.MessageDigest;

/* compiled from: V6TP */
/* renamed from: l.ᩴۙᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18537 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f57449;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final MessageDigest f57450 = C14460.m34534();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharBuffer f57451;

    public C18537(int i) {
        byte[] bArr = new byte[(i * 2) + 36];
        this.f57449 = bArr;
        this.f57451 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asCharBuffer();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m43077(byte[] bArr, int i, int i2, char[] cArr) {
        if (bArr.length != 32 || i2 <= 0 || i < 0 || i > cArr.length - i2) {
            throw new IllegalArgumentException("Invalid load hash batch");
        }
        MessageDigest messageDigest = this.f57450;
        messageDigest.reset();
        int length = bArr.length;
        byte[] bArr2 = this.f57449;
        System.arraycopy(bArr, 0, bArr2, 0, length);
        for (int i3 = 0; i3 < 4; i3++) {
            bArr2[i3 + 32] = (byte) (i2 >>> (i3 * 8));
        }
        int i4 = i2 + i;
        int i5 = 36;
        while (i < i4) {
            int min = Math.min((bArr2.length - i5) / 2, i4 - i);
            CharBuffer charBuffer = this.f57451;
            charBuffer.position(i5 / 2);
            charBuffer.put(cArr, i, min);
            i5 += min * 2;
            i += min;
            if (i5 == bArr2.length) {
                messageDigest.update(bArr2);
                i5 = 0;
            }
        }
        if (i5 != 0) {
            messageDigest.update(bArr2, 0, i5);
        }
        return messageDigest.digest();
    }
}
