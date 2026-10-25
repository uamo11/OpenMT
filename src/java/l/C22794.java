package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: S737 */
/* renamed from: l.᩺ۚ᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22794 implements InterfaceC2245 {

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Pattern f73599 = Pattern.compile("bytes (\\d+)-(\\d+)/(\\d+)");

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile boolean f73600;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile C18621 f73601;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C5861 f73602;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f73603;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile InputStream f73604;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC16687 f73605;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f73606;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private synchronized void m50881() {
        C22670 c22670;
        if (this.f73601 != null) {
            this.f73601.close();
            this.f73601 = null;
            this.f73604 = null;
        }
        InterfaceC16687 interfaceC16687 = this.f73605;
        this.f73605 = null;
        if (interfaceC16687 != null && (c22670 = this.f73602.f17982) != null) {
            c22670.m50661(interfaceC16687);
        }
    }

    @Override // l.InterfaceC2245
    /* renamed from: ֫ܽ */
    public final /* synthetic */ FileChannel mo7436() {
        return null;
    }

    @Override // l.InterfaceC2245
    /* renamed from: ۧ */
    public final /* synthetic */ InterfaceC2245 mo7438(long j, long j2) {
        return C15649.m36840(this, j, j2);
    }

    @Override // l.InterfaceC2245
    /* renamed from: ܽ */
    public final /* synthetic */ InterfaceC2245 mo7440(long j, long j2) {
        return C15649.m36839(this, j, j2);
    }

    @Override // l.InterfaceC2245
    /* renamed from: ᩻ܽ */
    public final /* synthetic */ boolean mo7441() {
        return false;
    }

    public C22794(C5861 c5861) {
        this.f73602 = c5861;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11506 m50883() {
        return this.f73602.f17988;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8743 m50874(C11749 c11749, long j, long j2, String str, String str2) {
        C9449 c9449 = new C9449();
        c9449.m24280(c11749);
        c9449.m24283("Range", "bytes=" + j + '-' + j2);
        c9449.m24283("Accept-Encoding", "identity");
        c9449.m24283("User-Agent", str2);
        if (str != null) {
            c9449.m24283("If-Range", str);
        }
        return c9449.m24274();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C22794(l.C17209 r22, java.lang.String r23, final java.lang.String r24, l.C11506 r25, l.C22670 r26) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22794.<init>(l.ܿ۟᩵, java.lang.String, java.lang.String, l.ۨۚ᩻, l.᩺֨᩻):void");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m50882(String str) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m50879(String str) {
        return (str == null || str.regionMatches(true, 0, "W/", 0, 2)) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10095 m50875(C18621 c18621, long j, long j2, long j3) {
        if (c18621.m43177() != 206) {
            throw new IOException("HTTP server did not return a partial response: " + c18621.m43177());
        }
        String m43169 = c18621.m43169("Content-Encoding");
        if (m43169 != null) {
            String lowerCase = m43169.trim().toLowerCase(Locale.ROOT);
            if (!lowerCase.isEmpty() && !lowerCase.equals("identity") && !lowerCase.equals("utf-8") && !lowerCase.equals("utf8")) {
                throw new IOException("Unsupported HTTP content encoding: ".concat(m43169));
            }
        }
        String m431692 = c18621.m43169("Content-Range");
        Matcher matcher = m431692 == null ? null : f73599.matcher(m431692.trim());
        if (matcher == null || !matcher.matches()) {
            throw new IOException("Missing or invalid HTTP Content-Range");
        }
        try {
            long parseLong = Long.parseLong(matcher.group(1));
            long parseLong2 = Long.parseLong(matcher.group(2));
            long parseLong3 = Long.parseLong(matcher.group(3));
            if (parseLong != j || parseLong2 != j2 || parseLong3 <= parseLong2 || (j3 >= 0 && parseLong3 != j3)) {
                throw new IOException(C20094.m46315("Unexpected HTTP Content-Range: ", m431692));
            }
            long j4 = (parseLong2 - parseLong) + 1;
            AbstractC0275 m43170 = c18621.m43170();
            if (m43170 == null) {
                throw new IOException("HTTP Range response has no body");
            }
            long mo1615 = m43170.mo1615();
            if (mo1615 < 0 || mo1615 == j4) {
                return new C10095(parseLong3);
            }
            throw new IOException("HTTP Range response length mismatch");
        } catch (NumberFormatException e) {
            throw new IOException("Invalid HTTP Content-Range", e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50877(C18621 c18621) {
        String m43169;
        C5861 c5861 = this.f73602;
        String str = c5861.f17986;
        String str2 = c5861.f17985;
        String str3 = c5861.f17986;
        if (m50879(str)) {
            String m431692 = c18621.m43169("ETag");
            if (m431692 != null && !str3.equals(m431692)) {
                throw new IOException("Remote resource ETag changed during reading");
            }
            return;
        }
        if (str2 != null) {
            String m431693 = c18621.m43169("Last-Modified");
            if (m431693 != null && !str2.equals(m431693)) {
                throw new IOException("Remote resource changed during reading");
            }
            return;
        }
        if (str3 != null && (m43169 = c18621.m43169("ETag")) != null && !str3.equals(m43169)) {
            throw new IOException("Remote resource ETag changed during reading");
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m50880() {
        if (this.f73600) {
            throw new IOException("Random access data is closed");
        }
    }

    @Override // l.InterfaceC2245
    public final void seek(long j) {
        m50880();
        if (j < 0 || j > this.f73602.f17990) {
            throw new IOException(C16014.m37865(j, "Seek position is outside the remote file: "));
        }
        if (j != this.f73603) {
            m50881();
            this.f73603 = j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [l.᩺ۚ᩻] */
    /* JADX WARN: Type inference failed for: r6v5, types: [long] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [l.ܽܰ᩵] */
    @Override // l.InterfaceC2245
    public final int read(byte[] bArr, int i, int i2) {
        m50880();
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f73603 >= this.f73602.f17990) {
            return -1;
        }
        InputStream inputStream = this.f73604;
        if (inputStream == null) {
            long j = this.f73602.f17990;
            long j2 = this.f73603;
            long min = Math.min(j - j2, 524288L) + j2;
            ?? r6 = min - 1;
            C5861 c5861 = this.f73602;
            InterfaceC16687 m40469 = this.f73602.f17984.m40469(m50874(c5861.f17983, this.f73603, r6, c5861.f17987, c5861.f17989));
            this.f73605 = m40469;
            C22670 c22670 = this.f73602.f17982;
            if (c22670 != null) {
                try {
                    c22670.m50659(m40469);
                } catch (IOException e) {
                    this.f73605 = null;
                    throw e;
                }
            }
            if (this.f73600) {
                m40469.cancel();
                m50876(m40469);
                throw new IOException("Random access data is closed");
            }
            try {
                C18621 execute = m40469.execute();
                try {
                } catch (IOException | RuntimeException e2) {
                    e = e2;
                    r6 = m40469;
                }
                try {
                    if (this.f73600) {
                        throw new IOException("Random access data is closed");
                    }
                    m50875(execute, this.f73603, r6, this.f73602.f17990);
                    m50877(execute);
                    this.f73604 = execute.m43170().m1611();
                    this.f73601 = execute;
                    this.f73606 = min;
                    if (this.f73600) {
                        m50881();
                        throw new IOException("Random access data is closed");
                    }
                    inputStream = this.f73604;
                    if (inputStream == null) {
                        throw new IOException("HTTP Range response was closed");
                    }
                } catch (IOException e3) {
                    e = e3;
                    execute.close();
                    m50876(r6);
                    throw e;
                } catch (RuntimeException e4) {
                    e = e4;
                    execute.close();
                    m50876(r6);
                    throw e;
                }
            } catch (IOException | RuntimeException e5) {
                m50876(m40469);
                throw e5;
            }
        }
        int min2 = (int) Math.min(i2, this.f73606 - this.f73603);
        int i3 = 0;
        while (i3 < min2) {
            try {
                int read = inputStream.read(bArr, i + i3, min2 - i3);
                if (read == -1) {
                    throw new EOFException("HTTP Range response body is truncated");
                }
                if (read != 0) {
                    i3 += read;
                }
            } catch (IOException | RuntimeException e6) {
                m50881();
                throw e6;
            }
        }
        long j3 = this.f73603 + i3;
        this.f73603 = j3;
        if (j3 == this.f73606) {
            m50881();
        }
        return i3;
    }

    @Override // l.InterfaceC2245
    public final void write(byte[] bArr, int i, int i2) {
        throw new IOException("HTTP random access data is read-only");
    }

    @Override // l.InterfaceC2245
    public final long length() {
        m50880();
        return this.f73602.f17990;
    }

    @Override // l.InterfaceC2245
    public final void setLength(long j) {
        throw new IOException("HTTP random access data is read-only");
    }

    @Override // l.InterfaceC2245
    public final long position() {
        m50880();
        return this.f73603;
    }

    @Override // l.InterfaceC2245
    /* renamed from: ܺ */
    public final void mo7439() {
        m50880();
    }

    @Override // l.InterfaceC2245
    public final String getName() {
        return this.f73602.f17983.toString();
    }

    @Override // l.InterfaceC2245
    /* renamed from: ۡ */
    public final InterfaceC2245 mo7437() {
        m50880();
        return new C22794(this.f73602);
    }

    @Override // l.InterfaceC2245
    public final boolean isClosed() {
        return this.f73600;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f73600) {
            return;
        }
        this.f73600 = true;
        InterfaceC16687 interfaceC16687 = this.f73605;
        if (interfaceC16687 != null) {
            interfaceC16687.cancel();
        }
        m50881();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50876(InterfaceC16687 interfaceC16687) {
        if (this.f73605 == interfaceC16687) {
            this.f73605 = null;
        }
        C22670 c22670 = this.f73602.f17982;
        if (c22670 != null) {
            c22670.m50661(interfaceC16687);
        }
    }
}
