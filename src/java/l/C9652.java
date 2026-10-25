package l;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* compiled from: KAZL */
/* renamed from: l.ۢܳᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9652 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m24593(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            throw new C20941("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            StringBuilder m32308 = C13325.m32308(i, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ");
            m32308.append(byteBuffer.remaining());
            throw new C20941(m32308.toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(C19370.m44628(i, "size: "));
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m24594(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new C20941("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder m32308 = C13325.m32308(i, "Underflow while reading length-prefixed value. Length: ", ", available: ");
        m32308.append(byteBuffer.remaining());
        throw new C20941(m32308.toString());
    }
}
