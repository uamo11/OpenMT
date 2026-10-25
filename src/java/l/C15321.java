package l;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 357K */
/* renamed from: l.ܶܺ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C15321 extends AbstractC5445 {

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final String f46974 = StandardCharsets.ISO_8859_1.name();

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public BufferedReader f46977;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public BufferedWriter f46978;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f46983;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f46976 = true;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f46975 = new ArrayList();

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f46982 = false;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f46979 = null;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f46981 = f46974;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C0505 f46980 = new C0505(this);

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m36352() {
        super.mo13881();
        this.f46977 = new C0114(new InputStreamReader(this.f16948, this.f46981));
        this.f46978 = new BufferedWriter(new OutputStreamWriter(this.f16950, this.f46981));
        if (this.f16947 > 0) {
            int soTimeout = this.f16949.getSoTimeout();
            this.f16949.setSoTimeout(this.f16947);
            try {
                try {
                    m36353();
                    if (C11250.m27833(this.f46983)) {
                        m36353();
                    }
                    return;
                } catch (SocketTimeoutException e) {
                    throw new IOException("Timed out waiting for initial connect reply", e);
                }
            } finally {
                this.f16949.setSoTimeout(soTimeout);
            }
        }
        m36353();
        if (C11250.m27833(this.f46983)) {
            m36353();
        }
    }

    @Override // l.AbstractC5445
    /* renamed from: ۡ */
    public void mo13861() {
        super.mo13861();
        this.f46977 = null;
        this.f46978 = null;
        this.f46982 = false;
        this.f46979 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m36349(InetAddress inetAddress, int i) {
        String hostAddress = inetAddress.getHostAddress();
        int indexOf = hostAddress.indexOf(37);
        if (indexOf > 0) {
            hostAddress = hostAddress.substring(0, indexOf);
        }
        StringBuilder sb = new StringBuilder("|");
        if (inetAddress instanceof Inet4Address) {
            sb.append("1");
        } else if (inetAddress instanceof Inet6Address) {
            sb.append("2");
        }
        sb.append("|");
        sb.append(hostAddress);
        sb.append("|");
        sb.append(i);
        sb.append("|");
        return m36350(EnumC13205.EPRT, sb.toString());
    }

    @Override // l.AbstractC5445
    /* renamed from: ۠ */
    public final C0505 mo15537() {
        return this.f46980;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m36353() {
        this.f46982 = true;
        ArrayList arrayList = this.f46975;
        arrayList.clear();
        String readLine = this.f46977.readLine();
        if (readLine == null) {
            throw new C12500("Connection closed without indication.");
        }
        int length = readLine.length();
        if (length < 3) {
            throw new C2623("Truncated server reply: ".concat(readLine));
        }
        try {
            this.f46983 = Integer.parseInt(readLine.substring(0, 3));
            arrayList.add(readLine);
            boolean z = this.f46976;
            if (length > 3) {
                char charAt = readLine.charAt(3);
                if (charAt == '-') {
                    while (true) {
                        String readLine2 = this.f46977.readLine();
                        if (readLine2 == null) {
                            throw new C12500("Connection closed without indication.");
                        }
                        arrayList.add(readLine2);
                        if (readLine2.length() > 3 && readLine2.charAt(3) != '-' && Character.isDigit(readLine2.charAt(0))) {
                            break;
                        }
                    }
                } else if (z && charAt != ' ') {
                    throw new C2623(C4860.m14172("Invalid server reply: '", readLine, "'"));
                }
            } else if (z) {
                throw new C2623(C4860.m14172("Truncated server reply: '", readLine, "'"));
            }
            m36351();
            m15530();
            int i = this.f46983;
            if (i != 421) {
                return i;
            }
            throw new C12500("FTP response 421 received.  Server closed connection.");
        } catch (NumberFormatException unused) {
            throw new C2623("Could not parse response code.\nServer Reply: ".concat(readLine));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m36355() {
        return this.f46983;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m36351() {
        if (!this.f46982) {
            return this.f46979;
        }
        this.f46982 = false;
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f46975.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "\r\n");
            }
        }
        String sb2 = sb.toString();
        this.f46979 = sb2;
        return sb2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m36356(InetAddress inetAddress, int i) {
        StringBuilder sb = new StringBuilder(24);
        sb.append(inetAddress.getHostAddress().replace('.', ','));
        sb.append(',');
        sb.append(i >>> 8);
        sb.append(',');
        sb.append(i & 255);
        return m36350(EnumC13205.PORT, sb.toString());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m36350(EnumC13205 enumC13205, String str) {
        return mo26243(enumC13205.m32040(), str);
    }

    /* renamed from: ܽ */
    public int mo26243(String str, String str2) {
        if (this.f46978 != null) {
            StringBuilder sb = new StringBuilder(str);
            if (str2 != null) {
                sb.append(' ');
                sb.append(str2);
            }
            sb.append("\r\n");
            try {
                this.f46978.write(sb.toString());
                this.f46978.flush();
                m15536();
                return m36353();
            } catch (SocketException e) {
                if (!m15539()) {
                    throw new C12500("Connection unexpectedly closed.");
                }
                throw e;
            }
        }
        throw new IOException("Connection is not open");
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m36354(String str) {
        this.f46981 = str;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m36357(String str) {
        return m36350(EnumC13205.SIZE, str);
    }
}
