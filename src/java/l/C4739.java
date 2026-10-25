package l;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: C650 */
/* renamed from: l.ۙܺ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C4739 extends C15321 implements InterfaceC1211 {

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15026 = 0;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f15027 = Pattern.compile("(\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}),(\\d{1,3}),(\\d{1,3})");

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public String f15028;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f15029;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f15030;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f15031;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f15032;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C17754 f15033;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C22378 f15034;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f15035;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C3328 f15036;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f15037;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f15038;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public HashMap f15039;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C2828 f15040 = C2828.ofMillis(-1);

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC6150 f15041;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f15042;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m13878(String str) {
        return C11250.m27829(m36350(EnumC13205.DELE, str));
    }

    public C4739() {
        new Random();
        this.f15037 = true;
        this.f15033 = new C17754();
        C2828 c2828 = C2828.ZERO;
        C2828.ofSeconds(1L);
        this.f15034 = new C22378(this);
        this.f15035 = Boolean.getBoolean("org.apache.commons.net.ftp.ipAddressFromPasvResponse");
        m13853();
    }

    @Override // l.AbstractC5445
    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public void mo13881() {
        super.m36352();
        m13853();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Socket m13866(EnumC13205 enumC13205, String str) {
        return mo13874(enumC13205.m32040(), str);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Socket mo13874(String str, String str2) {
        Socket socket;
        int i = this.f15038;
        if (i == 0 || i == 2) {
            boolean z = m15541() instanceof Inet6Address;
            long millis = this.f15040.toMillis();
            int min = (int) (millis > 0 ? Math.min(millis, 2147483647L) : Math.max(millis, -2147483648L));
            if (this.f15038 != 0) {
                ArrayList arrayList = this.f46975;
                if (z && m36350(EnumC13205.EPSV, (String) null) == 229) {
                    m13863((String) arrayList.get(0));
                } else if (!z && m36350(EnumC13205.PASV, (String) null) == 227) {
                    m13862((String) arrayList.get(0));
                }
                Socket createSocket = this.f16951.createSocket();
                if (this.f15030 == 13) {
                    createSocket = new C8267(createSocket);
                }
                if (min >= 0) {
                    createSocket.setSoTimeout(min);
                }
                createSocket.connect(new InetSocketAddress(this.f15031, this.f15042), this.f16947);
                long j = this.f15032;
                if (j > 0 && !m13867(j)) {
                    createSocket.close();
                    return null;
                }
                if (!C11250.m27833(mo26243(str, str2))) {
                    createSocket.close();
                    return null;
                }
                socket = createSocket;
                if (this.f15037) {
                }
                return socket;
            }
            ServerSocket createServerSocket = this.f16952.createServerSocket(0, 1, m15538());
            try {
                if (z) {
                    if (!C11250.m27829(m36349(m15538(), createServerSocket.getLocalPort()))) {
                        createServerSocket.close();
                        return null;
                    }
                } else if (!C11250.m27829(m36356(m15538(), createServerSocket.getLocalPort()))) {
                    createServerSocket.close();
                    return null;
                }
                long j2 = this.f15032;
                if (j2 <= 0 || m13867(j2)) {
                    if (C11250.m27833(mo26243(str, str2))) {
                        if (min >= 0) {
                            createServerSocket.setSoTimeout(min);
                        }
                        socket = createServerSocket.accept();
                        if (this.f15030 == 13) {
                            socket = new C8267(socket);
                        }
                        if (min >= 0) {
                            socket.setSoTimeout(min);
                        }
                        createServerSocket.close();
                        if (this.f15037 || m15534(socket)) {
                            return socket;
                        }
                        InetAddress inetAddress = socket.getInetAddress();
                        String hostAddress = inetAddress != null ? inetAddress.getHostAddress() : null;
                        InetAddress inetAddress2 = this.f16949.getInetAddress();
                        String hostAddress2 = inetAddress2 != null ? inetAddress2.getHostAddress() : null;
                        C22194.m49850(socket);
                        throw new IOException(C19462.m44858("Host attempting data connection ", hostAddress, " is not same as server ", hostAddress2));
                    }
                    if (createServerSocket != null) {
                        createServerSocket.close();
                        return null;
                    }
                } else if (createServerSocket != null) {
                    createServerSocket.close();
                    return null;
                }
            } catch (Throwable th) {
                if (createServerSocket != null) {
                    try {
                        createServerSocket.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return null;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m13863(String str) {
        String trim = str.substring(str.indexOf(40) + 1, str.indexOf(41)).trim();
        char charAt = trim.charAt(0);
        char charAt2 = trim.charAt(1);
        char charAt3 = trim.charAt(2);
        char m19937 = C7416.m19937(1, trim);
        if (charAt != charAt2 || charAt2 != charAt3 || charAt3 != m19937) {
            throw new C2623("Could not parse extended passive host information.\nServer Reply: ".concat(trim));
        }
        try {
            int parseInt = Integer.parseInt(trim.substring(3, trim.length() - 1));
            this.f15031 = m15541().getHostAddress();
            this.f15042 = parseInt;
        } catch (NumberFormatException unused) {
            throw new C2623("Could not parse extended passive host information.\nServer Reply: ".concat(trim));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m13857(String str, String str2) {
        return C11250.m27829(m36350(EnumC13205.MFMT, str2 + ' ' + str));
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m13882(String str) {
        return C11250.m27829(m36350(EnumC13205.MKD, str));
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m13862(String str) {
        Matcher matcher = f15027.matcher(str);
        if (!matcher.find()) {
            throw new C2623(C20094.m46315("Could not parse passive host information.\nServer Reply: ", str));
        }
        String hostAddress = "0,0,0,0".equals(matcher.group(1)) ? this.f16949.getInetAddress().getHostAddress() : matcher.group(1).replace(',', '.');
        try {
            int parseInt = Integer.parseInt(matcher.group(3)) | (Integer.parseInt(matcher.group(2)) << 8);
            if (this.f15035) {
                C22378 c22378 = this.f15034;
                if (c22378 != null) {
                    try {
                        String m50242 = c22378.m50242(hostAddress);
                        if (!hostAddress.equals(m50242)) {
                            m15530();
                            hostAddress = m50242;
                        }
                    } catch (UnknownHostException unused) {
                        throw new C2623(C20094.m46315("Could not parse passive host information.\nServer Reply: ", str));
                    }
                }
            } else {
                Socket socket = this.f16949;
                hostAddress = socket == null ? null : socket.getInetAddress().getHostAddress();
            }
            this.f15031 = hostAddress;
            this.f15042 = parseInt;
        } catch (NumberFormatException unused2) {
            throw new C2623(C20094.m46315("Could not parse passive port information.\nServer Reply: ", str));
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m13864() {
        return C11250.m27829(m36350(EnumC13205.NOOP, (String) null));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m13856(String str) {
        return C11250.m27829(m36350(EnumC13205.RMD, str));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m13879(String str, String str2) {
        int m36350 = m36350(EnumC13205.RNFR, str);
        if (m36350 < 300 || m36350 >= 400) {
            return false;
        }
        return C11250.m27829(m36350(EnumC13205.RNTO, str2));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m13877() {
        return C11250.m27829(m36353());
    }

    @Override // l.InterfaceC1211
    /* renamed from: ֫ */
    public final void mo4051(C3328 c3328) {
        this.f15036 = c3328;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C10384[] m13876() {
        String property;
        if (this.f15041 == null) {
            C3328 c3328 = this.f15036;
            C17754 c17754 = this.f15033;
            if (c3328 == null || c3328.m10184().isEmpty()) {
                String property2 = System.getProperty("org.apache.commons.net.ftp.systemType");
                if (property2 == null) {
                    if (this.f15028 == null) {
                        if (C11250.m27829(m36350(EnumC13205.SYST, (String) null))) {
                            this.f15028 = ((String) C18566.m43105(this.f46975, 1)).substring(4);
                        } else {
                            String property3 = System.getProperty("org.apache.commons.net.ftp.systemType.default");
                            if (property3 == null) {
                                throw new IOException("Unable to determine system type - response: " + m36351());
                            }
                            this.f15028 = property3;
                        }
                    }
                    property2 = this.f15028;
                    Properties properties = C20262.f65499;
                    if (properties != null && (property = properties.getProperty(property2)) != null) {
                        property2 = property;
                    }
                }
                if (this.f15036 != null) {
                    this.f15041 = c17754.m41581(new C3328(property2, this.f15036));
                } else {
                    this.f15041 = c17754.m41580(property2);
                }
            } else {
                this.f15041 = c17754.m41581(this.f15036);
                this.f15036.getClass();
            }
        }
        InterfaceC6150 interfaceC6150 = this.f15041;
        Socket m13866 = m13866(EnumC13205.LIST, (String) null);
        C23083 c23083 = new C23083(interfaceC6150, this.f15036);
        if (m13866 != null) {
            try {
                c23083.m51246(m13866.getInputStream(), this.f46981);
                C22194.m49850(m13866);
                m13877();
            } catch (Throwable th) {
                C22194.m49850(m13866);
                throw th;
            }
        }
        return c23083.m51247();
    }

    @Override // l.C15321, l.AbstractC5445
    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public void mo13861() {
        super.mo13861();
        m13853();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13854() {
        this.f15038 = 2;
        this.f15031 = null;
        this.f15042 = -1;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m13884(String str) {
        return C11250.m27829(m36350(EnumC13205.SITE, str));
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m13880() {
        if (!C11250.m27829(m36350(EnumC13205.TYPE, "AEILNTCFRPSBCZ".substring(2, 3)))) {
            return false;
        }
        this.f15029 = 2;
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m13868(String str, String str2) {
        m36350(EnumC13205.USER, str);
        if (C11250.m27829(this.f46983)) {
            return true;
        }
        int i = this.f46983;
        if (i < 300 || i >= 400) {
            return false;
        }
        return C11250.m27829(m36350(EnumC13205.PASS, str2));
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int m13859() {
        return this.f15038;
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C2828 m13871() {
        return this.f15040;
    }

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m13870() {
        return this.f15031;
    }

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m13865() {
        return this.f15042;
    }

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long m13860() {
        return this.f15032;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m13858(EnumC13205 enumC13205) {
        String substring;
        String str;
        String name = enumC13205.name();
        if (this.f15039 == null) {
            int m36350 = m36350(EnumC13205.FEAT, (String) null);
            if (m36350 == 530) {
                return false;
            }
            boolean m27829 = C11250.m27829(m36350);
            this.f15039 = new HashMap();
            if (!m27829) {
                return false;
            }
            Iterator it = this.f46975.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith(" ")) {
                    int indexOf = str2.indexOf(32, 1);
                    if (indexOf > 0) {
                        substring = str2.substring(1, indexOf);
                        str = str2.substring(indexOf + 1);
                    } else {
                        substring = str2.substring(1);
                        str = "";
                    }
                    ((Set) C13843.computeIfAbsent(this.f15039, substring.toUpperCase(Locale.ENGLISH), new C21673(0))).add(str);
                }
            }
        }
        return this.f15039.containsKey(name.toUpperCase(Locale.ENGLISH));
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m13853() {
        this.f15038 = 0;
        this.f15031 = null;
        this.f15042 = -1;
        this.f15029 = 0;
        this.f15030 = 10;
        this.f15032 = 0L;
        this.f15028 = null;
        this.f15041 = null;
        this.f15039 = null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C10384[] m13873() {
        Socket m13866 = m13866(EnumC13205.MLSD, (String) null);
        C23083 c23083 = new C23083(C14225.m33883(), this.f15036);
        if (m13866 != null) {
            try {
                c23083.m51246(m13866.getInputStream(), this.f46981);
            } finally {
                C22194.m49850(m13866);
                m13877();
            }
        }
        return c23083.m51247();
    }

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m13869() {
        return this.f15037;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m13867(long j) {
        this.f15032 = 0L;
        int m36350 = m36350(EnumC13205.REST, Long.toString(j));
        return m36350 >= 300 && m36350 < 400;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C0820 m13875(String str) {
        InputStream inputStream;
        Socket mo13874 = mo13874(EnumC13205.RETR.m32040(), str);
        if (mo13874 == null) {
            return null;
        }
        if (this.f15029 == 0) {
            inputStream = new C5054(new BufferedInputStream(mo13874.getInputStream()));
        } else {
            inputStream = mo13874.getInputStream();
        }
        return new C0820(mo13874, inputStream);
    }

    @Deprecated
    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m13883() {
        this.f15040 = C2828.ofMillis(60000);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13855(long j) {
        if (j >= 0) {
            this.f15032 = j;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public OutputStream mo13872(String str) {
        OutputStream outputStream;
        Socket mo13874 = mo13874(EnumC13205.STOR.m32040(), str);
        if (mo13874 == null) {
            return null;
        }
        if (this.f15029 == 0) {
            outputStream = new C14931(new BufferedOutputStream(mo13874.getOutputStream()));
        } else {
            outputStream = mo13874.getOutputStream();
        }
        return new C7876(mo13874, outputStream);
    }
}
