package l;

import java.io.EOFException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: 658Z */
/* renamed from: l.ᩳ᩺ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18366 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f57059 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m42797(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m42796(InputStream inputStream) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = inputStream.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return m42797(arrayDeque, i);
                }
                i2 += read;
                i += read;
            }
            min = C13426.m32450(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return m42797(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    static {
        new C16954();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42795(InputStream inputStream, byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(C18307.m42645(i2, "len (", ") cannot be negative"));
        }
        C4025.m12104(i, i + i2, bArr.length);
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                break;
            } else {
                i3 += read;
            }
        }
        if (i3 != i2) {
            throw new EOFException(C19373.m44634("reached end of stream after reading ", i3, " bytes; ", " bytes expected", i2));
        }
    }
}
