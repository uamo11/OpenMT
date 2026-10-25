package l;

import java.io.DataInput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: 970R */
/* renamed from: l.ۧᩳܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC11164 {
    /* renamed from: ֫ */
    public abstract int mo21889(int i, int i2);

    /* renamed from: ֫ */
    public abstract long mo21890();

    /* renamed from: ֫ */
    public abstract void mo21891(int i, int i2, InterfaceC21705 interfaceC21705);

    /* renamed from: ֫ */
    public abstract void mo21892(DataOutputStream dataOutputStream, int i);

    /* renamed from: ֫ */
    public abstract boolean mo21894(int i);

    /* renamed from: ֫ */
    public abstract boolean mo21895(AbstractC11164 abstractC11164);

    /* renamed from: ۧ */
    public abstract int mo21896(int i);

    /* renamed from: ۧ */
    public abstract long mo21897();

    /* renamed from: ܽ */
    public abstract int mo21898();

    /* renamed from: ܽ */
    public abstract int mo21899(int i);

    /* renamed from: ֫ */
    public void mo21893(final byte[] bArr, final int i, int i2, final byte b, final int i3) {
        mo21891(i, i2, new InterfaceC21705() { // from class: l.֫ᩳܳ
            @Override // l.InterfaceC21705
            /* renamed from: ֫ */
            public final void mo4084(int i4, int i5) {
                bArr[(i3 + i5) - i] = b;
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC11164 m27686(int i, int[] iArr) {
        if (i <= 0 || i > iArr.length) {
            throw new IllegalArgumentException("Empty start index");
        }
        int i2 = iArr[0];
        long j = i == 1 ? 1L : iArr[1] - i2;
        int i3 = (j <= 0 || j > 2147483647L) ? -1 : (int) j;
        boolean z = i3 > 0;
        int i4 = 1;
        while (i4 < i) {
            int i5 = iArr[i4];
            if (i5 <= i2) {
                throw new IllegalArgumentException("Start index must be strictly sorted");
            }
            z &= ((long) i5) - ((long) i2) == ((long) i3);
            i4++;
            i2 = i5;
        }
        if (z && i >= 3) {
            return m27688(iArr[0], i3, i);
        }
        long j2 = iArr[i - 1] - iArr[0];
        long j3 = j2 + 1;
        long j4 = (j2 + 64) >>> 6;
        long j5 = 8 * j4;
        if (i > 64 && j3 <= 2147483647L && j5 < i * 4) {
            long[] jArr = new long[(int) j4];
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = iArr[i6] - iArr[0];
                int i8 = i7 >>> 6;
                jArr[i8] = jArr[i8] | (1 << (i7 & 63));
            }
            return new C8299(iArr[0], i, jArr);
        }
        return new C13942(Arrays.copyOf(iArr, i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16807 m27688(int i, int i2, int i3) {
        if (i3 > 0 && i2 > 0) {
            if ((i2 * (i3 - 1)) + i <= 2147483647L) {
                return new C16807(i, i2, i3);
            }
        }
        throw new IllegalArgumentException("Invalid stride index");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27689(int i, int i2, int i3, InterfaceC21705 interfaceC21705) {
        long j = (i - i3) + 1;
        mo21891(j <= -2147483648L ? Integer.MIN_VALUE : (int) j, i2, interfaceC21705);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC11164 m27687(DataInput dataInput, int i, C17307 c17307) {
        IOException m40912;
        IOException m409122;
        IOException m409123;
        IOException m409124;
        IOException m409125;
        IOException m409126;
        int readUnsignedByte = dataInput.readUnsignedByte();
        int i2 = 0;
        try {
            if (readUnsignedByte == 1) {
                int readInt = dataInput.readInt();
                if (readInt <= 0 || readInt > 65536) {
                    m409125 = C17513.m40912("Invalid sparse start count");
                    throw m409125;
                }
                c17307.m40619((readInt * 4) + 48);
                int[] iArr = new int[readInt];
                int i3 = Integer.MIN_VALUE;
                while (i2 < readInt) {
                    long readInt2 = i + dataInput.readInt();
                    int i4 = (int) readInt2;
                    if (readInt2 != i4) {
                        throw new ArithmeticException();
                    }
                    if (i2 != 0 && i4 <= i3) {
                        m409126 = C17513.m40912("Sparse starts are not sorted");
                        throw m409126;
                    }
                    iArr[i2] = i4;
                    i2++;
                    i3 = i4;
                }
                return new C13942(iArr);
            }
            if (readUnsignedByte != 2) {
                if (readUnsignedByte != 3) {
                    m409122 = C17513.m40912("Unknown start index tag " + readUnsignedByte);
                    throw m409122;
                }
                long readInt3 = i + dataInput.readInt();
                int i5 = (int) readInt3;
                if (readInt3 != i5) {
                    throw new ArithmeticException();
                }
                int readInt4 = dataInput.readInt();
                int readInt5 = dataInput.readInt();
                c17307.m40619(48L);
                return m27688(i5, readInt4, readInt5);
            }
            long readInt6 = i + dataInput.readInt();
            int i6 = (int) readInt6;
            long j = i6;
            if (readInt6 != j) {
                throw new ArithmeticException();
            }
            int readInt7 = dataInput.readInt();
            int readInt8 = dataInput.readInt();
            if (readInt7 <= 0 || readInt7 > 2048 || readInt8 <= 0 || readInt8 > 65536) {
                m409123 = C17513.m40912("Invalid bitmap start index");
                throw m409123;
            }
            long j2 = readInt7;
            c17307.m40619((8 * j2) + 64);
            long[] jArr = new long[readInt7];
            int i7 = 0;
            for (int i8 = 0; i8 < readInt7; i8++) {
                long readLong = dataInput.readLong();
                jArr[i8] = readLong;
                i7 += Long.bitCount(readLong);
            }
            if (i7 == readInt8 && jArr[0] != 0 && jArr[readInt7 - 1] != 0 && (j + (j2 << 6)) - 1 <= 2147483647L) {
                return new C8299(i6, readInt8, jArr);
            }
            m409124 = C17513.m40912("Non-canonical bitmap start index");
            throw m409124;
        } catch (ArithmeticException | IllegalArgumentException unused) {
            m40912 = C17513.m40912("Invalid start index payload");
            throw m40912;
        }
    }
}
