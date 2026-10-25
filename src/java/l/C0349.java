package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.EOFException;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: U2R9 */
/* renamed from: l.֡ۤۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0349 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1793(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                C5368.m15342(autoCloseable);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m1795(InputStream inputStream, int i) {
        try {
            if (i <= 0) {
                i = 32;
            }
            C0521 c0521 = new C0521(i);
            C22194.m49852(inputStream, c0521);
            byte[] bArr = c0521.f2176;
            int length = bArr.length;
            int i2 = c0521.f2177;
            if (length == i2) {
                if (inputStream != null) {
                    inputStream.close();
                }
                return bArr;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i2);
            if (inputStream != null) {
                inputStream.close();
            }
            return copyOf;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m1794(long j, InputStream inputStream) {
        byte[] bArr = new byte[UMErrorCode.E_UM_BE_DEFLATE_FAILED];
        C22194.m49857(inputStream, bArr, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        C0521 c0521 = new C0521(C15972.m37744(52, bArr) + 208);
        c0521.write(bArr, 0, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        int min = (int) (Math.min(r2 + 4, j) - UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        byte[] bArr2 = new byte[4096];
        while (min > 0) {
            int read = inputStream.read(bArr2, 0, Math.min(4096, min));
            if (read == -1) {
                throw new EOFException();
            }
            c0521.write(bArr2, 0, read);
            min -= read;
        }
        int m37744 = C15972.m37744(c0521.f2177 - 4, c0521.f2176) * 12;
        while (m37744 > 0) {
            int read2 = inputStream.read(bArr2, 0, Math.min(4096, m37744));
            if (read2 == -1) {
                throw new EOFException();
            }
            c0521.write(bArr2, 0, read2);
            m37744 -= read2;
        }
        byte[] bArr3 = c0521.f2176;
        int length = bArr3.length;
        int i = c0521.f2177;
        if (length == i) {
            return bArr3;
        }
        C9876.m24968(bArr3.length, 0, i);
        byte[] bArr4 = i == 0 ? C5659.f17466 : new byte[i];
        System.arraycopy(bArr3, 0, bArr4, 0, i);
        return bArr4;
    }
}
