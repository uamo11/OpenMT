package l;

import com.alipay.sdk.m.w.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.bouncycastle.i18n.LocalizedMessage;

/* compiled from: R5PD */
/* renamed from: l.᩶۟᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20032 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Pattern f64883;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f64884;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Charset f64885;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C11816 f64886;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Method f64887;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C11816 f64888;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Charset f64889;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C11816 f64890;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC2393 f64891;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final TimeZone f64892;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C11816 f64893;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final AbstractC0275 f64894;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Comparator f64895;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String[] f64896 = new String[0];

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Charset f64897;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C11816 f64898;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Charset f64899;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Charset f64900;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m46166(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46184(InterfaceC1274 interfaceC1274, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long nanoTime = System.nanoTime();
        long mo20331 = interfaceC1274.mo4333().mo20333() ? interfaceC1274.mo4333().mo20331() - nanoTime : Long.MAX_VALUE;
        interfaceC1274.mo4333().mo20326(Math.min(mo20331, timeUnit.toNanos(i)) + nanoTime);
        try {
            C12521 c12521 = new C12521();
            while (interfaceC1274.mo4334(c12521, 8192L) != -1) {
                c12521.m30706();
            }
            if (mo20331 == C13132.FOREVER_NS) {
                interfaceC1274.mo4333().mo20325();
                return true;
            }
            interfaceC1274.mo4333().mo20326(nanoTime + mo20331);
            return true;
        } catch (InterruptedIOException unused) {
            if (mo20331 == C13132.FOREVER_NS) {
                interfaceC1274.mo4333().mo20325();
                return false;
            }
            interfaceC1274.mo4333().mo20326(nanoTime + mo20331);
            return false;
        } catch (Throwable th) {
            if (mo20331 == C13132.FOREVER_NS) {
                interfaceC1274.mo4333().mo20325();
            } else {
                interfaceC1274.mo4333().mo20326(nanoTime + mo20331);
            }
            throw th;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f64884 = bArr;
        C12521 c12521 = new C12521();
        c12521.write(bArr, 0, 0);
        Method method = null;
        f64894 = AbstractC0275.m1609(null, 0, c12521);
        f64891 = AbstractC2393.m7755((C13864) null, bArr);
        f64898 = C11816.m28898("efbbbf");
        f64888 = C11816.m28898("feff");
        f64890 = C11816.m28898("fffe");
        f64893 = C11816.m28898("0000ffff");
        f64886 = C11816.m28898("ffff0000");
        f64897 = Charset.forName(a.D);
        Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        f64900 = Charset.forName("UTF-16BE");
        f64899 = Charset.forName("UTF-16LE");
        f64889 = Charset.forName("UTF-32BE");
        f64885 = Charset.forName("UTF-32LE");
        f64892 = C3261.getTimeZone("GMT");
        f64895 = new C21443();
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f64887 = method;
        f64883 = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46180(Throwable th, IOException iOException) {
        Method method = f64887;
        if (method != null) {
            try {
                method.invoke(th, iOException);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46183(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46179(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46181(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m46182(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                if (!"bio == null".equals(e2.getMessage())) {
                    throw e2;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m46175(List list) {
        return C20195.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m46176(Object... objArr) {
        return C20195.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ThreadFactory m46177(String str, boolean z) {
        return new ThreadFactoryC22148(str, z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String[] m46185(Comparator comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m46188(Comparator comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m46172(C11749 c11749, boolean z) {
        String m28773;
        if (c11749.m28773().contains(":")) {
            m28773 = "[" + c11749.m28773() + "]";
        } else {
            m28773 = c11749.m28773();
        }
        if (!z && c11749.m28771() == C11749.m28762(c11749.m28767())) {
            return m28773;
        }
        StringBuilder m19190 = C7166.m19190(m28773, ":");
        m19190.append(c11749.m28771());
        return m19190.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46182(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m46186(int i, int i2, String str) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m46189(int i, int i2, String str) {
        while (true) {
            i2--;
            if (i2 < i) {
                return i;
            }
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2 + 1;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m46169(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m46168(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m46171(String str) {
        int i = -1;
        int i2 = 0;
        if (!str.contains(":")) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                while (i2 < lowerCase.length()) {
                    char charAt = lowerCase.charAt(i2);
                    if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                        return null;
                    }
                    i2++;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress m46173 = (str.startsWith("[") && str.endsWith("]")) ? m46173(1, str.length() - 1, str) : m46173(0, str.length(), str);
        if (m46173 == null) {
            return null;
        }
        byte[] address = m46173.getAddress();
        if (address.length != 16) {
            throw new AssertionError(C4860.m14172("Invalid IPv6 address: '", str, "'"));
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < address.length) {
            int i5 = i3;
            while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        C12521 c12521 = new C12521();
        while (i2 < address.length) {
            if (i2 == i) {
                c12521.m30720writeByte(58);
                i2 += i4;
                if (i2 == 16) {
                    c12521.m30720writeByte(58);
                }
            } else {
                if (i2 > 0) {
                    c12521.m30720writeByte(58);
                }
                c12521.m30712(((address[i2] & 255) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return c12521.m30714();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m46187(String str) {
        return f64883.matcher(str).matches();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Charset m46174(InterfaceC6171 interfaceC6171, Charset charset) {
        if (interfaceC6171.mo12311(f64898)) {
            interfaceC6171.skip(r0.mo2336());
            return f64897;
        }
        if (interfaceC6171.mo12311(f64888)) {
            interfaceC6171.skip(r0.mo2336());
            return f64900;
        }
        if (interfaceC6171.mo12311(f64890)) {
            interfaceC6171.skip(r0.mo2336());
            return f64899;
        }
        if (interfaceC6171.mo12311(f64893)) {
            interfaceC6171.skip(r0.mo2336());
            return f64889;
        }
        if (!interfaceC6171.mo12311(f64886)) {
            return charset;
        }
        interfaceC6171.skip(r0.mo2336());
        return f64885;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m46167(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout too large.");
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout too small.");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AssertionError m46170(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0097  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.InetAddress m46173(int r13, int r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20032.m46173(int, int, java.lang.String):java.net.InetAddress");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10338 m46178(ArrayList arrayList) {
        C12454 c12454 = new C12454();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7150 c7150 = (C7150) it.next();
            AbstractC8037.f24775.mo21353(c12454, c7150.f21948.mo2335(), c7150.f21949.mo2335());
        }
        return c12454.m30612();
    }
}
