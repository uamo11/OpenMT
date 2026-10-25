package l;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.zip.CRC32;

/* compiled from: 964V */
/* renamed from: l.ۢ᩺ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f29951 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final char[] f29952 = "0123456789ABCDEF".toCharArray();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25007(C6807 c6807, C18368 c18368, AbstractActivityC3346 abstractActivityC3346) {
        return (abstractActivityC3346 == null || !(abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed())) && c18368.m42802(c6807);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m25005(C9711 c9711, int i, int i2, C10275 c10275) {
        if (i <= 0) {
            throw new IllegalArgumentException("column must be positive");
        }
        if (i2 < 5 && m25004(c9711.length(), i, i2) > 524288) {
            throw new C17662();
        }
        InterfaceC17066 m38504 = C16360.m38504(c10275);
        switch (i2) {
            case 0:
                C24012 c24012 = new C24012(c9711.length(), i, m38504);
                c9711.m24677(c24012, c9711.length());
                return c24012.finish();
            case 1:
                C14839 c14839 = new C14839(c9711.length(), i, m38504);
                c9711.m24677(c14839, c9711.length());
                return c14839.finish();
            case 2:
                C2140 c2140 = new C2140(c9711.length(), i, m38504);
                c9711.m24677(c2140, c9711.length());
                return c2140.finish();
            case 3:
                C7452 c7452 = new C7452(c9711.length(), m38504);
                c9711.m24677(c7452, c9711.length());
                return c7452.finish();
            case 4:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) Math.min(524288L, m25004(c9711.length(), 1, 4)));
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
                try {
                    c9711.m24677(new C11313(base64OutputStream, m38504), c9711.length());
                    base64OutputStream.close();
                    return byteArrayOutputStream.toString(StandardCharsets.US_ASCII.name());
                } catch (Throwable th) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 5:
                MessageDigest m34532 = C14460.m34532();
                c9711.m24677(new C22974(m38504, m34532), c9711.length());
                return C14460.m34531(m34532.digest()).toUpperCase();
            case 6:
                MessageDigest m34526 = C14460.m34526();
                c9711.m24677(new C22974(m38504, m34526), c9711.length());
                return C14460.m34531(m34526.digest()).toUpperCase();
            case 7:
                CRC32 crc32 = new CRC32();
                c9711.m24677(new C13801(m38504, crc32), c9711.length());
                return String.format("%08X", Long.valueOf(crc32.getValue()));
            default:
                throw new IllegalArgumentException(C19370.m44628(i2, "which = "));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m25004(int i, int i2, int i3) {
        long j;
        long j2;
        if (i < 0 || i2 <= 0) {
            throw new IllegalArgumentException("Invalid copy range");
        }
        long j3 = i == 0 ? 0L : (i - 1) / i2;
        if (i3 == 0) {
            j = i * 3;
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    j2 = i * 9;
                } else {
                    if (i3 == 3) {
                        return i;
                    }
                    if (i3 != 4) {
                        throw new IllegalArgumentException(C19370.m44628(i3, "which = "));
                    }
                    j3 = 2;
                    long j4 = ((i + 2) / 3) * 4;
                    j2 = (j4 / 76) + j4;
                }
                return j2 + j3;
            }
            j = i * 4;
        }
        return j + j3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25006(StringBuilder sb) {
        if (sb.length() != 0) {
            sb.setCharAt(sb.length() - 1, '\n');
        }
    }
}
