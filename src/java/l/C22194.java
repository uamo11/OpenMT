package l;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.channels.Channels;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: M4LF */
/* renamed from: l.᩹ۢ֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22194 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f71991;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C15137 f71992;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final byte[] f71993;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C21489 f71994;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m49849(InputStream inputStream) {
        Charset charset = StandardCharsets.UTF_8;
        int i = C8789.f26773;
        if (charset == null) {
            charset = Charset.defaultCharset();
        }
        return (List) C18434.lines(new BufferedReader(new InputStreamReader(inputStream, charset))).collect(C22976.toList());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ܶۢ֡] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.᩸ۢ֡] */
    static {
        char c = File.separatorChar;
        f71991 = new byte[0];
        System.lineSeparator();
        EnumC20078.LF.getString();
        EnumC20078.CRLF.getString();
        final C0321 c0321 = new C0321();
        f71992 = new ThreadLocal() { // from class: l.ܶۢ֡
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                C0321.this.getClass();
                return new byte[8192];
            }
        };
        f71993 = new byte[8192];
        final C5261 c5261 = new C5261(0);
        f71994 = new ThreadLocal() { // from class: l.᩸ۢ֡
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                C5261.this.getClass();
                return new char[8192];
            }
        };
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m49847(InputStream inputStream, OutputStream outputStream, int i) {
        byte[] bArr = new byte[i];
        C11003.requireNonNull(inputStream, "inputStream");
        C11003.requireNonNull(outputStream, "outputStream");
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49850(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m49854(InputStream inputStream, InputStream inputStream2) {
        if (inputStream == inputStream2) {
            return true;
        }
        return C12316.m29873(Channels.newChannel(inputStream), Channels.newChannel(inputStream2));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49853(InputStream inputStream, Writer writer, Charset charset) {
        int i = C8789.f26773;
        if (charset == null) {
            charset = Charset.defaultCharset();
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        char[] cArr = (char[]) f71994.get();
        Arrays.fill(cArr, (char) 0);
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (-1 == read) {
                return;
            } else {
                writer.write(cArr, 0, read);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49852(InputStream inputStream, OutputStream outputStream) {
        m49847(inputStream, outputStream, 8192);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m49855() {
        byte[] bArr = f71993;
        Arrays.fill(bArr, (byte) 0);
        return bArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49851(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = (byte[]) f71992.get();
        Arrays.fill(bArr, (byte) 0);
        long j2 = 0;
        if (j == 0) {
            return;
        }
        int length = bArr.length;
        int i = (j <= 0 || j >= ((long) length)) ? length : (int) j;
        while (i > 0) {
            int read = inputStream.read(bArr, 0, i);
            if (-1 == read) {
                return;
            }
            byteArrayOutputStream.write(bArr, 0, read);
            j2 += read;
            if (j > 0) {
                i = (int) Math.min(j - j2, length);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m49844(InputStream inputStream, byte[] bArr, int i) {
        if (i == 0) {
            return 0;
        }
        C11003.requireNonNull(inputStream);
        if (i < 0) {
            throw new IllegalArgumentException(C19370.m44628(i, "Length must not be negative: "));
        }
        int i2 = i;
        while (i2 > 0) {
            int read = inputStream.read(bArr, i - i2, i2);
            if (-1 == read) {
                break;
            }
            i2 -= read;
        }
        return i - i2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m49857(InputStream inputStream, byte[] bArr, int i) {
        int m49844 = m49844(inputStream, bArr, i);
        if (m49844 != i) {
            throw new EOFException(C18307.m42646("Length to read: ", i, m49844, " actual: "));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m49845(long j, InputStream inputStream) {
        return m49846(inputStream, j, new C1027());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m49846(InputStream inputStream, long j, Supplier supplier) {
        if (j < 0) {
            throw new IllegalArgumentException(C16014.m37865(j, "Skip count must be non-negative, actual: "));
        }
        long j2 = j;
        while (j2 > 0) {
            long read = inputStream.read((byte[]) supplier.get(), 0, (int) Math.min(j2, r4.length));
            if (read < 0) {
                break;
            }
            j2 -= read;
        }
        return j - j2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m49856(long j, InputStream inputStream) {
        long m49846 = m49846(inputStream, j, new C1027());
        if (m49846 == j) {
            return;
        }
        StringBuilder m31106 = C12803.m31106("Bytes to skip: ", " actual: ", j);
        m31106.append(m49846);
        throw new EOFException(m31106.toString());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m49858(InputStream inputStream) {
        int i = C14616.f44711;
        new C17439();
        C14616 m40772 = C17439.m40772();
        C18145 c18145 = new C18145(new C19373(0), new C7385(7, m40772));
        try {
            m49852(inputStream, c18145);
            byte[] mo16671 = m40772.mo16671();
            c18145.close();
            return mo16671;
        } catch (Throwable th) {
            try {
                c18145.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m49848(InputStream inputStream, Charset charset) {
        C16733 c16733 = new C16733();
        m49853(inputStream, c16733, charset);
        return c16733.toString();
    }
}
