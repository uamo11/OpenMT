package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import org.bouncycastle.crypto.hpke.HPKE;

/* compiled from: H6W9 */
/* renamed from: l.ۨ۠ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11577 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f34516;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f34517;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float f34518;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f34519;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float f34520;

    public C11577(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        this.f34519 = byteBuffer;
        this.f34517 = byteBuffer2;
        this.f34516 = byteBuffer2.capacity() / 2;
        float f = Float.POSITIVE_INFINITY;
        float f2 = Float.NEGATIVE_INFINITY;
        for (int i = 2; i < byteBuffer.capacity(); i += 12) {
            float f3 = byteBuffer.getShort(i) / 256.0f;
            f = Math.min(f, f3);
            f2 = Math.max(f2, f3);
        }
        this.f34520 = f;
        this.f34518 = f2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m28464(C12951 c12951) {
        if (c12951.available() < 8 || c12951.readInt() != 1362318413) {
            throw new IOException("Invalid logo mesh header");
        }
        int readInt = c12951.readInt();
        if (readInt < 1 || readInt > 32) {
            throw new IOException("Invalid logo mesh count");
        }
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            if (c12951.available() < 8) {
                throw new IOException("Truncated logo mesh");
            }
            int readInt2 = c12951.readInt();
            int readInt3 = c12951.readInt();
            long j = (readInt3 * 2) + (readInt2 * 12);
            if (readInt2 < 3 || readInt2 > 60000 || readInt3 < 3 || readInt3 % 3 != 0 || j > c12951.available()) {
                throw new IOException("Invalid logo mesh lengths");
            }
            ByteBuffer m28463 = m28463(readInt2, 12, c12951);
            ByteBuffer m284632 = m28463(readInt3, 2, c12951);
            for (int i2 = 0; i2 < m284632.capacity(); i2 += 2) {
                if ((m284632.getShort(i2) & HPKE.aead_EXPORT_ONLY) >= readInt2) {
                    throw new IOException("Invalid logo mesh index");
                }
            }
            arrayList.add(new C11577(m28463, m284632));
        }
        if (c12951.available() == 0) {
            return arrayList;
        }
        throw new IOException("Trailing logo mesh data");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m28463(int i, int i2, C12951 c12951) {
        ByteBuffer order = ByteBuffer.allocateDirect(i * i2).order(ByteOrder.LITTLE_ENDIAN);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 = (i4 + (c12951.readByte() & 255)) & 255;
                order.put((i5 * i2) + i3, (byte) i4);
            }
        }
        return order;
    }
}
