package l;

import com.google.android.material.motion.MotionUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.zip.ZipException;

/* compiled from: P5EC */
/* renamed from: l.ۖܰۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2568 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Calendar f8122 = Calendar.getInstance();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f8121 = false;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m8115(long j) {
        long time;
        Calendar calendar = f8122;
        synchronized (calendar) {
            calendar.set(1, ((int) ((j >> 25) & 127)) + 1980);
            calendar.set(2, ((int) ((j >> 21) & 15)) - 1);
            calendar.set(5, ((int) (j >> 16)) & 31);
            calendar.set(11, ((int) (j >> 11)) & 31);
            calendar.set(12, ((int) (j >> 5)) & 63);
            calendar.set(13, ((int) (j << 1)) & 62);
            time = calendar.getTime().getTime();
        }
        return time;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m8118(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(1);
        if (i < 1980) {
            return 2162688L;
        }
        return ((calendar.get(2) + 1) << 21) | ((i - 1980) << 25) | (calendar.get(5) << 16) | (calendar.get(11) << 11) | (calendar.get(12) << 5) | (calendar.get(13) >> 1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8116(long j, int i, byte[] bArr) {
        if (i + 8 > bArr.length) {
            throw new EOFException();
        }
        C15972.m37748(j, i, bArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m8114(InputStream inputStream, byte[] bArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C19370.m44628(i, "Length must not be negative: "));
        }
        int i2 = i;
        while (i2 > 0) {
            int read = inputStream.read(bArr, i - i2, i2);
            if (read == -1) {
                break;
            }
            i2 -= read;
        }
        return i - i2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m8119(InputStream inputStream, byte[] bArr, int i) {
        int m8114 = m8114(inputStream, bArr, i);
        if (m8114 != i) {
            throw new EOFException(C18307.m42646("Length to read: ", i, m8114, " actual: "));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m8113(int i) {
        if (i == 1) {
            return 8;
        }
        if (i == 2) {
            return 12;
        }
        if (i == 3) {
            return 16;
        }
        throw new IOException("unable to determine salt length: invalid aes key strength");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8117(IOException iOException, C3545 c3545) {
        ZipException zipException = new ZipException("Error: " + iOException.getMessage() + " (" + c3545.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        zipException.initCause(iOException);
        throw zipException;
    }
}
