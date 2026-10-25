package l;

import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;

/* compiled from: 27BS */
/* renamed from: l.ܺܳܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15996 implements InterfaceC2592 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4708 f49347;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f49348 = new ArrayList();

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f49349;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f49350;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f49351;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final OutputStream f49352;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f49353;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f49354;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f49355;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C18820 f49356;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f49357;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14585 f49358;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f49359;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f49360;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f49361;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C9648 f49362;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public HashMap f49363;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public EnumC4003 f49364;

    public C15996(AbstractC4708 abstractC4708, C9648 c9648, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.f49347 = abstractC4708;
        this.f49362 = c9648;
        this.f49356 = new C18820(inputStream, 8192);
        this.f49352 = outputStream;
        this.f49357 = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.f49359 = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa A[Catch: IOException -> 0x015a, TRY_ENTER, TryCatch #0 {IOException -> 0x015a, blocks: (B:3:0x0002, B:7:0x0009, B:9:0x0014, B:11:0x001d, B:13:0x0026, B:15:0x002f, B:19:0x0044, B:21:0x004f, B:22:0x0061, B:25:0x006f, B:28:0x0078, B:29:0x008d, B:30:0x008e, B:33:0x0096, B:35:0x00a0, B:38:0x00aa, B:40:0x00bc, B:42:0x00ca, B:43:0x00d5, B:45:0x00e7, B:49:0x00ee, B:50:0x00f7, B:51:0x00f8, B:53:0x00fe, B:59:0x0105, B:60:0x010e, B:57:0x010f, B:63:0x0118, B:64:0x011f, B:66:0x0120, B:67:0x0127, B:69:0x0128, B:71:0x0130, B:74:0x0137, B:75:0x0140, B:76:0x0141, B:81:0x0055, B:82:0x005c, B:84:0x005d, B:87:0x0148, B:88:0x014f, B:89:0x0150, B:90:0x0159), top: B:2:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120 A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m37790(java.io.BufferedReader r9, java.util.HashMap r10, java.util.HashMap r11, java.util.HashMap r12) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15996.m37790(java.io.BufferedReader, java.util.HashMap, java.util.HashMap, java.util.HashMap):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37796(HashMap hashMap) {
        String str = (String) hashMap.get("transfer-encoding");
        if (str != null && !str.trim().isEmpty()) {
            throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Transfer-Encoding is not supported.");
        }
        String str2 = (String) hashMap.get("content-length");
        if (str2 == null) {
            return;
        }
        if (str2.isEmpty()) {
            throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Invalid Content-Length.");
        }
        for (int i = 0; i < str2.length(); i++) {
            char charAt = str2.charAt(i);
            if (charAt < '0' || charAt > '9') {
                throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Invalid Content-Length.");
            }
        }
        try {
            Long.parseLong(str2);
        } catch (NumberFormatException e) {
            throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Invalid Content-Length.", e);
        }
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m37799() {
        String str = (String) this.f49359.get("expect");
        if (str == null || str.trim().isEmpty()) {
            return;
        }
        String[] split = str.split(",");
        int length = split.length;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (i >= length) {
                z = z2;
                break;
            }
            String trim = split[i].trim();
            if (!trim.isEmpty()) {
                if (!"100-continue".equalsIgnoreCase(trim)) {
                    break;
                } else {
                    z2 = true;
                }
            }
            i++;
        }
        if (!z) {
            throw new C15290(EnumC1180.EXPECTATION_FAILED, "EXPECTATION FAILED: Unsupported Expect header.");
        }
        if (!"HTTP/1.1".equals(this.f49354)) {
            throw new C15290(EnumC1180.EXPECTATION_FAILED, "EXPECTATION FAILED: Expect header requires HTTP/1.1.");
        }
        if (this.f49349 > 0) {
            byte[] bytes = C9045.m23341(new StringBuilder(), this.f49354, " 100 Continue\r\n\r\n").getBytes(Charset.forName("US-ASCII"));
            OutputStream outputStream = this.f49352;
            outputStream.write(bytes);
            outputStream.flush();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37792(C18114 c18114, ByteBuffer byteBuffer, HashMap hashMap, HashMap hashMap2) {
        int[] m37793;
        byte b;
        Pattern pattern;
        Pattern pattern2;
        Pattern pattern3;
        try {
            m37793 = m37793(byteBuffer, c18114.m42231().getBytes(Charset.forName("US-ASCII")));
        } catch (C15290 e) {
            throw e;
        } catch (Exception e2) {
            e = e2;
        }
        try {
            if (m37793.length < 2) {
                throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but contains less than two boundary strings.");
            }
            int i = 1024;
            byte[] bArr = new byte[1024];
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = 1;
                if (i3 >= m37793.length - 1) {
                    return;
                }
                byteBuffer.position(m37793[i3]);
                int remaining = byteBuffer.remaining() < i ? byteBuffer.remaining() : 1024;
                byteBuffer.get(bArr, i2, remaining);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, i2, remaining), Charset.forName(c18114.m42236())), remaining);
                String readLine = bufferedReader.readLine();
                if (readLine == null || !readLine.contains(c18114.m42231())) {
                    break;
                }
                String str = null;
                String str2 = null;
                String str3 = null;
                int i6 = 2;
                for (String readLine2 = bufferedReader.readLine(); readLine2 != null && readLine2.trim().length() > 0; readLine2 = bufferedReader.readLine()) {
                    pattern = AbstractC4708.f14947;
                    Matcher matcher = pattern.matcher(readLine2);
                    if (matcher.matches()) {
                        int i7 = i4;
                        String group = matcher.group(2);
                        pattern3 = AbstractC4708.f14945;
                        Matcher matcher2 = pattern3.matcher(group);
                        i4 = i7;
                        while (matcher2.find()) {
                            String group2 = matcher2.group(i5);
                            String str4 = str3;
                            if ("name".equalsIgnoreCase(group2)) {
                                str = matcher2.group(2);
                            } else if ("filename".equalsIgnoreCase(group2)) {
                                str3 = matcher2.group(2);
                                if (!str3.isEmpty()) {
                                    if (i4 > 0) {
                                        str = str + String.valueOf(i4);
                                        i4++;
                                    } else {
                                        i4++;
                                    }
                                }
                                i5 = 1;
                            }
                            str3 = str4;
                            i5 = 1;
                        }
                    }
                    pattern2 = AbstractC4708.f14943;
                    Matcher matcher3 = pattern2.matcher(readLine2);
                    if (matcher3.matches()) {
                        str2 = matcher3.group(2).trim();
                    }
                    i6++;
                    i5 = 1;
                }
                int i8 = i4;
                int i9 = 0;
                while (true) {
                    int i10 = i6 - 1;
                    if (i6 <= 0) {
                        break;
                    }
                    do {
                        b = bArr[i9];
                        i9++;
                    } while (b != 10);
                    i6 = i10;
                }
                if (i9 >= remaining - 4) {
                    throw new C15290(EnumC1180.INTERNAL_ERROR, "Multipart header size exceeds MAX_HEADER_SIZE.");
                }
                int i11 = m37793[i3] + i9;
                i3++;
                int i12 = m37793[i3] - 4;
                byteBuffer.position(i11);
                List list = (List) hashMap.get(str);
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(str, list);
                }
                if (str2 == null) {
                    byte[] bArr2 = new byte[i12 - i11];
                    byteBuffer.get(bArr2);
                    list.add(new String(bArr2, c18114.m42236()));
                } else {
                    String m37789 = m37789(byteBuffer, i11, i12 - i11, str3);
                    if (hashMap2.containsKey(str)) {
                        int i13 = 2;
                        while (true) {
                            if (!hashMap2.containsKey(str + i13)) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        hashMap2.put(str + i13, m37789);
                    } else {
                        hashMap2.put(str, m37789);
                    }
                    list.add(str3);
                }
                i = 1024;
                i4 = i8;
                i2 = 0;
            }
            throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.");
        } catch (C15290 e3) {
        } catch (Exception e4) {
            e = e4;
            throw new C15290(EnumC1180.INTERNAL_ERROR, e.toString());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37791(String str, Map map) {
        String trim;
        String str2;
        if (str == null) {
            this.f49353 = "";
            return;
        }
        this.f49353 = str;
        StringTokenizer stringTokenizer = new StringTokenizer(str, a.p);
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(61);
            if (indexOf >= 0) {
                try {
                    trim = AbstractC4708.m13788(nextToken.substring(0, indexOf)).trim();
                    try {
                        str2 = AbstractC4708.m13788(nextToken.substring(indexOf + 1));
                    } catch (IllegalArgumentException e) {
                        throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e);
                    }
                } catch (IllegalArgumentException e2) {
                    throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e2);
                }
            } else {
                try {
                    trim = AbstractC4708.m13788(nextToken).trim();
                    str2 = "";
                } catch (IllegalArgumentException e3) {
                    throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e3);
                }
            }
            List list = (List) map.get(trim);
            if (list == null) {
                list = new ArrayList();
                map.put(trim, list);
            }
            list.add(str2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37800() {
        AbstractC4708 abstractC4708 = this.f49347;
        C9648 c9648 = this.f49362;
        C18820 c18820 = this.f49356;
        OutputStream outputStream = this.f49352;
        try {
            try {
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z = false;
                        this.f49361 = 0;
                        this.f49350 = 0;
                        this.f49354 = "HTTP/1.1";
                        m37794();
                        c18820.mark(8192);
                        try {
                            int read = c18820.read(bArr, 0, 8192);
                            if (read == -1) {
                                AbstractC4708.m13790(c18820);
                                AbstractC4708.m13790(outputStream);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            while (read > 0) {
                                int i = this.f49350 + read;
                                this.f49350 = i;
                                int m37788 = m37788(i, bArr);
                                this.f49361 = m37788;
                                if (m37788 > 0) {
                                    break;
                                }
                                int i2 = this.f49350;
                                read = c18820.read(bArr, i2, 8192 - i2);
                            }
                            int i3 = this.f49361;
                            if (i3 == 0) {
                                throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Header section too large.");
                            }
                            if (i3 < this.f49350) {
                                c18820.reset();
                                c18820.skip(this.f49361);
                            }
                            this.f49363 = new HashMap();
                            HashMap hashMap = this.f49359;
                            if (hashMap == null) {
                                this.f49359 = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f49350)));
                            HashMap hashMap2 = new HashMap();
                            this.f49353 = null;
                            this.f49348.clear();
                            m37790(bufferedReader, hashMap2, this.f49363, this.f49359);
                            m37796(this.f49359);
                            this.f49349 = m37795();
                            EnumC4003 m12056 = EnumC4003.m12056((String) hashMap2.get(e.s));
                            this.f49364 = m12056;
                            if (m12056 == null) {
                                throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Syntax error. HTTP verb " + ((String) hashMap2.get(e.s)) + " unhandled.");
                            }
                            this.f49351 = (String) hashMap2.get("uri");
                            m37799();
                            c18820.m43484();
                            String str = this.f49357;
                            if (str != null) {
                                this.f49359.put("remote-addr", str);
                                this.f49359.put("http-client-ip", str);
                            }
                            this.f49358 = new C14585(this.f49359);
                            String str2 = (String) this.f49359.get("connection");
                            boolean equals = "HTTP/1.1".equals(this.f49354);
                            boolean z2 = equals && (str2 == null || !str2.matches("(?i).*close.*"));
                            C8236 mo13796 = abstractC4708.mo13796(this);
                            if (mo13796 == null) {
                                throw new C15290(EnumC1180.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                            }
                            if (m37787()) {
                                mo13796.m21803();
                            }
                            String str3 = (String) this.f49359.get("accept-encoding");
                            this.f49358.m34835(mo13796);
                            mo13796.m21808(m37798());
                            mo13796.m21806(this.f49364);
                            mo13796.m21807(equals);
                            if (equals && abstractC4708.mo13797(mo13796) && m37797(str3)) {
                                z = true;
                            }
                            mo13796.m21809(z);
                            mo13796.m21811(z2);
                            mo13796.m21804(outputStream);
                            if (!z2 || mo13796.m21812()) {
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            m37794();
                            AbstractC4708.m13790(mo13796);
                            c9648.m24582();
                        } catch (SSLException e) {
                            throw e;
                        } catch (IOException unused) {
                            AbstractC4708.m13790(c18820);
                            AbstractC4708.m13790(outputStream);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (C15290 e2) {
                        C8236 m13784 = AbstractC4708.m13784(e2.m36300(), "text/plain", e2.getMessage());
                        m13784.m21808(m37798());
                        m13784.m21803();
                        m13784.m21804(outputStream);
                        AbstractC4708.m13790(outputStream);
                    }
                } catch (SocketTimeoutException e3) {
                    throw e3;
                } catch (SSLException e4) {
                    C8236 m137842 = AbstractC4708.m13784(EnumC1180.INTERNAL_ERROR, "text/plain", "SSL PROTOCOL FAILURE: " + e4.getMessage());
                    m137842.m21808(m37798());
                    m137842.m21804(outputStream);
                    AbstractC4708.m13790(outputStream);
                }
            } catch (SocketException e5) {
                throw e5;
            } catch (IOException e6) {
                C8236 m137843 = AbstractC4708.m13784(EnumC1180.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e6.getMessage());
                m137843.m21808(m37798());
                m137843.m21804(outputStream);
                AbstractC4708.m13790(outputStream);
            }
        } finally {
            m37794();
            AbstractC4708.m13790((Object) null);
            c9648.m24582();
        }
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private String m37798() {
        return "HTTP/1.0".equals(this.f49354) ? "HTTP/1.0" : "HTTP/1.1";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m37788(int i, byte[] bArr) {
        int i2;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i) {
                return 0;
            }
            byte b = bArr[i3];
            if (b == 13 && bArr[i4] == 10 && (i2 = i3 + 3) < i && bArr[i3 + 2] == 13 && bArr[i2] == 10) {
                return i3 + 4;
            }
            if (b == 10 && bArr[i4] == 10) {
                return i3 + 2;
            }
            i3 = i4;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m37793(ByteBuffer byteBuffer, byte[] bArr) {
        int length;
        int length2;
        if (bArr.length == 0 || byteBuffer.limit() < bArr.length + 2) {
            return new int[0];
        }
        ArrayList arrayList = new ArrayList();
        int limit = byteBuffer.limit();
        int i = 0;
        while (i <= limit - bArr.length) {
            boolean z = i == 2 && byteBuffer.get(0) == 45 && byteBuffer.get(1) == 45;
            boolean z2 = i >= 4 && byteBuffer.get(i + (-4)) == 13 && byteBuffer.get(i + (-3)) == 10 && byteBuffer.get(i + (-2)) == 45 && byteBuffer.get(i + (-1)) == 45;
            if ((z || z2) && (length2 = (length = bArr.length + i) + 1) < limit && ((byteBuffer.get(length) == 13 && byteBuffer.get(length2) == 10) || (byteBuffer.get(length) == 45 && byteBuffer.get(length2) == 45))) {
                int i2 = 0;
                while (true) {
                    if (i2 < bArr.length) {
                        if (byteBuffer.get(i + i2) != bArr[i2]) {
                            break;
                        }
                        i2++;
                    } else {
                        arrayList.add(Integer.valueOf(i));
                        break;
                    }
                }
            }
            i++;
        }
        int[] iArr = new int[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Map m37811() {
        return this.f49359;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m37806() {
        return C20195.unmodifiableList(this.f49348);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InputStream m37810() {
        return this.f49356;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m37808() {
        return this.f49360;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m37809() {
        return this.f49355;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37801(String str) {
        this.f49355 = str;
        this.f49360 = true;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m37794() {
        this.f49355 = null;
        this.f49360 = false;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC4003 m37807() {
        return this.f49364;
    }

    @Deprecated
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashMap m37803() {
        HashMap hashMap = new HashMap();
        for (String str : this.f49363.keySet()) {
            hashMap.put(str, (String) ((List) this.f49363.get(str)).get(0));
        }
        return hashMap;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Map m37813() {
        return this.f49363;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m37812() {
        return this.f49353;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m37804() {
        return this.f49351;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37802(HashMap hashMap) {
        long parseLong;
        RandomAccessFile randomAccessFile;
        ByteArrayOutputStream byteArrayOutputStream;
        DataOutput dataOutput;
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        ByteBuffer map;
        RandomAccessFile randomAccessFile2 = null;
        try {
            parseLong = this.f49359.containsKey("content-length") ? Long.parseLong((String) this.f49359.get("content-length")) : 0L;
            if (parseLong >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
                try {
                    randomAccessFile = new RandomAccessFile(this.f49362.m24583().m47759(), "rw");
                    byteArrayOutputStream = null;
                    dataOutput = randomAccessFile;
                } catch (Exception e) {
                    throw new Error(e);
                }
            } else {
                byteArrayOutputStream = new ByteArrayOutputStream();
                dataOutput = new DataOutputStream(byteArrayOutputStream);
                randomAccessFile = null;
            }
        } catch (Throwable th) {
            th = th;
            AbstractC4708.m13790(randomAccessFile2);
            throw th;
        }
        try {
            byte[] bArr = new byte[512];
            while (parseLong > 0) {
                int read = this.f49356.read(bArr, 0, (int) Math.min(parseLong, 512L));
                this.f49350 = read;
                if (read <= 0) {
                    throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Request body ended before Content-Length.");
                }
                parseLong -= read;
                dataOutput.write(bArr, 0, read);
            }
            if (byteArrayOutputStream != null) {
                map = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
            } else {
                convertMaybeLegacyFileChannelFromLibrary = C12084.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
                map = convertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile.length());
                randomAccessFile.seek(0L);
            }
            if (EnumC4003.POST.equals(this.f49364)) {
                C18114 c18114 = new C18114((String) this.f49359.get(e.f));
                if (c18114.m42235()) {
                    String m42231 = c18114.m42231();
                    if (m42231 == null || m42231.isEmpty()) {
                        throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                    }
                    m37792(c18114, map, this.f49363, hashMap);
                } else {
                    byte[] bArr2 = new byte[map.remaining()];
                    map.get(bArr2);
                    String trim = new String(bArr2, c18114.m42236()).trim();
                    if ("application/x-www-form-urlencoded".equalsIgnoreCase(c18114.m42232())) {
                        m37791(trim, this.f49363);
                    } else if (trim.length() != 0) {
                        hashMap.put("postData", trim);
                    }
                }
            } else if (EnumC4003.PUT.equals(this.f49364)) {
                hashMap.put("content", m37789(map, 0, map.limit(), (String) null));
            }
            AbstractC4708.m13790(randomAccessFile);
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            AbstractC4708.m13790(randomAccessFile2);
            throw th;
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private long m37795() {
        String str = (String) this.f49359.get("content-length");
        if (str == null) {
            return 0L;
        }
        return Long.parseLong(str);
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    private boolean m37787() {
        return this.f49349 != this.f49356.m43483();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m37797(String str) {
        double d;
        if (str == null) {
            return false;
        }
        boolean z = false;
        for (String str2 : str.split(",")) {
            String[] split = str2.split(l.b);
            if (split.length != 0) {
                String lowerCase = split[0].trim().toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    continue;
                } else {
                    int i = 1;
                    while (true) {
                        if (i >= split.length) {
                            d = 1.0d;
                            break;
                        }
                        String trim = split[i].trim();
                        int indexOf = trim.indexOf(61);
                        if (indexOf >= 0 && "q".equalsIgnoreCase(trim.substring(0, indexOf).trim())) {
                            try {
                                d = Double.parseDouble(trim.substring(indexOf + 1).trim());
                                break;
                            } catch (NumberFormatException unused) {
                                d = 0.0d;
                            }
                        } else {
                            i++;
                        }
                    }
                    if ("gzip".equals(lowerCase)) {
                        return d > 0.0d;
                    }
                    if ("*".equals(lowerCase)) {
                        z = d > 0.0d;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m37789(ByteBuffer byteBuffer, int i, int i2, String str) {
        FileOutputStream fileOutputStream;
        C20937 m24583;
        ByteBuffer duplicate;
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        if (i2 <= 0) {
            return "";
        }
        try {
            try {
                m24583 = this.f49362.m24583();
                duplicate = byteBuffer.duplicate();
                fileOutputStream = new FileOutputStream(m24583.m47759());
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            convertMaybeLegacyFileChannelFromLibrary = C12084.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel());
            duplicate.position(i).limit(i + i2);
            convertMaybeLegacyFileChannelFromLibrary.write(duplicate.slice());
            String m47759 = m24583.m47759();
            AbstractC4708.m13790(fileOutputStream);
            return m47759;
        } catch (Exception e2) {
            e = e2;
            throw new Error(e);
        } catch (Throwable th2) {
            th = th2;
            AbstractC4708.m13790(fileOutputStream);
            throw th;
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m37805() {
        return this.f49357;
    }
}
