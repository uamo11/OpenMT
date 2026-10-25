package l;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: 27BS */
/* renamed from: l.۠ܳܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8236 implements Closeable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f25352;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream f25353;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f25354;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceC5414 f25355;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f25357;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f25358;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC4003 f25360;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f25361;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f25362;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f25363;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ArrayList f25364 = new ArrayList();

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Map f25359 = new C19526(this);

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f25356 = new HashMap();

    public C8236(InterfaceC5414 interfaceC5414, String str, InputStream inputStream, long j) {
        this.f25355 = interfaceC5414;
        this.f25354 = str;
        this.f25353 = inputStream;
        this.f25361 = j;
        this.f25362 = j < 0;
        this.f25363 = true;
        this.f25357 = "HTTP/1.1";
        this.f25358 = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.f25353;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21805(String str, String str2) {
        m21800(str, str2);
        if ("set-cookie".equalsIgnoreCase(str)) {
            this.f25364.add(new AbstractMap.SimpleImmutableEntry(str, str2));
            this.f25356.put(str.toLowerCase(Locale.US), str2);
            return;
        }
        ((C19526) this.f25359).put(str, str2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21803() {
        ((C19526) this.f25359).put("connection", "close");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m21812() {
        return "close".equals(m21802("connection"));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m21802(String str) {
        return (String) this.f25356.get(str.toLowerCase(Locale.US));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m21810() {
        return this.f25354;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21808(String str) {
        this.f25357 = "HTTP/1.0".equals(str) ? "HTTP/1.0" : "HTTP/1.1";
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21809(boolean z) {
        this.f25352 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21807(boolean z) {
        this.f25363 = z;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m21811(boolean z) {
        this.f25358 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd A[Catch: IOException -> 0x01ad, TryCatch #0 {IOException -> 0x01ad, blocks: (B:4:0x0016, B:6:0x0049, B:7:0x004e, B:9:0x0056, B:10:0x0064, B:11:0x0070, B:13:0x0076, B:15:0x008c, B:16:0x0092, B:18:0x0098, B:20:0x00ae, B:22:0x00b6, B:25:0x00c1, B:27:0x00c4, B:39:0x00f5, B:41:0x00fd, B:45:0x0109, B:48:0x0114, B:50:0x0118, B:55:0x0122, B:58:0x012d, B:62:0x0135, B:67:0x013e, B:70:0x014b, B:72:0x0151, B:73:0x0165, B:77:0x0173, B:79:0x017a, B:80:0x0189, B:81:0x0186, B:83:0x018f, B:84:0x019b, B:85:0x019e, B:92:0x0161, B:98:0x00d9, B:100:0x00e1, B:105:0x01a5, B:106:0x01ac), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118 A[Catch: IOException -> 0x01ad, TryCatch #0 {IOException -> 0x01ad, blocks: (B:4:0x0016, B:6:0x0049, B:7:0x004e, B:9:0x0056, B:10:0x0064, B:11:0x0070, B:13:0x0076, B:15:0x008c, B:16:0x0092, B:18:0x0098, B:20:0x00ae, B:22:0x00b6, B:25:0x00c1, B:27:0x00c4, B:39:0x00f5, B:41:0x00fd, B:45:0x0109, B:48:0x0114, B:50:0x0118, B:55:0x0122, B:58:0x012d, B:62:0x0135, B:67:0x013e, B:70:0x014b, B:72:0x0151, B:73:0x0165, B:77:0x0173, B:79:0x017a, B:80:0x0189, B:81:0x0186, B:83:0x018f, B:84:0x019b, B:85:0x019e, B:92:0x0161, B:98:0x00d9, B:100:0x00e1, B:105:0x01a5, B:106:0x01ac), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0131 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013e A[Catch: IOException -> 0x01ad, TRY_LEAVE, TryCatch #0 {IOException -> 0x01ad, blocks: (B:4:0x0016, B:6:0x0049, B:7:0x004e, B:9:0x0056, B:10:0x0064, B:11:0x0070, B:13:0x0076, B:15:0x008c, B:16:0x0092, B:18:0x0098, B:20:0x00ae, B:22:0x00b6, B:25:0x00c1, B:27:0x00c4, B:39:0x00f5, B:41:0x00fd, B:45:0x0109, B:48:0x0114, B:50:0x0118, B:55:0x0122, B:58:0x012d, B:62:0x0135, B:67:0x013e, B:70:0x014b, B:72:0x0151, B:73:0x0165, B:77:0x0173, B:79:0x017a, B:80:0x0189, B:81:0x0186, B:83:0x018f, B:84:0x019b, B:85:0x019e, B:92:0x0161, B:98:0x00d9, B:100:0x00e1, B:105:0x01a5, B:106:0x01ac), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014b A[Catch: IOException -> 0x01ad, TRY_ENTER, TryCatch #0 {IOException -> 0x01ad, blocks: (B:4:0x0016, B:6:0x0049, B:7:0x004e, B:9:0x0056, B:10:0x0064, B:11:0x0070, B:13:0x0076, B:15:0x008c, B:16:0x0092, B:18:0x0098, B:20:0x00ae, B:22:0x00b6, B:25:0x00c1, B:27:0x00c4, B:39:0x00f5, B:41:0x00fd, B:45:0x0109, B:48:0x0114, B:50:0x0118, B:55:0x0122, B:58:0x012d, B:62:0x0135, B:67:0x013e, B:70:0x014b, B:72:0x0151, B:73:0x0165, B:77:0x0173, B:79:0x017a, B:80:0x0189, B:81:0x0186, B:83:0x018f, B:84:0x019b, B:85:0x019e, B:92:0x0161, B:98:0x00d9, B:100:0x00e1, B:105:0x01a5, B:106:0x01ac), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0151 A[Catch: IOException -> 0x01ad, TryCatch #0 {IOException -> 0x01ad, blocks: (B:4:0x0016, B:6:0x0049, B:7:0x004e, B:9:0x0056, B:10:0x0064, B:11:0x0070, B:13:0x0076, B:15:0x008c, B:16:0x0092, B:18:0x0098, B:20:0x00ae, B:22:0x00b6, B:25:0x00c1, B:27:0x00c4, B:39:0x00f5, B:41:0x00fd, B:45:0x0109, B:48:0x0114, B:50:0x0118, B:55:0x0122, B:58:0x012d, B:62:0x0135, B:67:0x013e, B:70:0x014b, B:72:0x0151, B:73:0x0165, B:77:0x0173, B:79:0x017a, B:80:0x0189, B:81:0x0186, B:83:0x018f, B:84:0x019b, B:85:0x019e, B:92:0x0161, B:98:0x00d9, B:100:0x00e1, B:105:0x01a5, B:106:0x01ac), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0113  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m21804(java.io.OutputStream r12) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8236.m21804(java.io.OutputStream):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21798(PrintWriter printWriter, String str, String str2) {
        m21800(str, str2);
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m21800(String str, String str2) {
        Pattern pattern;
        if (str != null) {
            pattern = AbstractC4708.f14946;
            if (pattern.matcher(str).matches()) {
                if (str2 == null) {
                    throw new IllegalArgumentException("Invalid HTTP header value");
                }
                for (int i = 0; i < str2.length(); i++) {
                    char charAt = str2.charAt(i);
                    if ((charAt < ' ' && charAt != '\t') || charAt == 127) {
                        throw new IllegalArgumentException("Invalid HTTP header value");
                    }
                }
                if ("content-length".equalsIgnoreCase(str)) {
                    String trim = str2.trim();
                    if (trim.isEmpty()) {
                        throw new IllegalArgumentException("Invalid HTTP header value");
                    }
                    for (int i2 = 0; i2 < trim.length(); i2++) {
                        char charAt2 = trim.charAt(i2);
                        if (charAt2 < '0' || charAt2 > '9') {
                            throw new IllegalArgumentException("Invalid HTTP header value");
                        }
                    }
                    try {
                        Long.parseLong(trim);
                        return;
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("Invalid HTTP header value", e);
                    }
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid HTTP header name");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m21801(PrintWriter printWriter, long j) {
        String m21802 = m21802("content-length");
        if (m21802 != null) {
            try {
                return Long.parseLong(m21802);
            } catch (NumberFormatException unused) {
                AbstractC4708.f14944.severe("content-length was no number ".concat(m21802));
                return j;
            }
        }
        printWriter.print("Content-Length: " + j + "\r\n");
        return j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21797(OutputStream outputStream, long j) {
        byte[] bArr = new byte[(int) 16384];
        boolean z = j == -1;
        while (true) {
            if (j <= 0 && !z) {
                return;
            }
            int read = this.f25353.read(bArr, 0, (int) (z ? 16384L : Math.min(j, 16384L)));
            if (read <= 0) {
                return;
            }
            outputStream.write(bArr, 0, read);
            if (!z) {
                j -= read;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21806(EnumC4003 enumC4003) {
        this.f25360 = enumC4003;
    }
}
