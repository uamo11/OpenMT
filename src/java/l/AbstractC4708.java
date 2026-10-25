package l;

import com.alipay.sdk.m.w.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: 27BS */
/* renamed from: l.ۙܳܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC4708 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f14949;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile ServerSocket f14950;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Thread f14952;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f14947 = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Pattern f14943 = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f14945 = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f14946 = Pattern.compile("[-!#$%&'*+.^_`|~0-9A-Za-z]+");

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Logger f14944 = Logger.getLogger(AbstractC4708.class.getName());

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC20231 f14951 = new C8942();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C23758 f14948 = new C23758();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m13778(char c) {
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

    /* JADX WARN: Incorrect condition in loop: B:3:0x002c */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13799() {
        /*
            r3 = this;
            java.net.ServerSocket r0 = new java.net.ServerSocket
            r0.<init>()
            r3.f14950 = r0
            java.net.ServerSocket r0 = r3.f14950
            r1 = 1
            r0.setReuseAddress(r1)
            l.᩸ܳܳ r0 = new l.᩸ܳܳ
            r0.<init>(r3)
            java.lang.Thread r2 = new java.lang.Thread
            r2.<init>(r0)
            r3.f14952 = r2
            r2.setDaemon(r1)
            java.lang.Thread r1 = r3.f14952
            java.lang.String r2 = "NanoHttpd Main Listener"
            r1.setName(r2)
            java.lang.Thread r1 = r3.f14952
            r1.start()
        L28:
            boolean r1 = l.RunnableC21642.m48909(r0)
            if (r1 != 0) goto L3c
            java.io.IOException r1 = l.RunnableC21642.m48908(r0)
            if (r1 != 0) goto L3c
            r1 = 10
            java.lang.Thread.sleep(r1)     // Catch: java.lang.Throwable -> L3a
            goto L28
        L3a:
            goto L28
        L3c:
            java.io.IOException r1 = l.RunnableC21642.m48908(r0)
            if (r1 != 0) goto L43
            return
        L43:
            java.io.IOException r0 = l.RunnableC21642.m48908(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC4708.m13799():void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final void m13790(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else {
                    if (obj instanceof ServerSocket) {
                        ((ServerSocket) obj).close();
                        return;
                    }
                    throw new IllegalArgumentException("Unknown object to close");
                }
            } catch (IOException e) {
                f14944.log(Level.SEVERE, "Could not close", (Throwable) e);
            }
        }
    }

    public AbstractC4708(int i) {
        this.f14949 = i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m13788(String str) {
        return m13781(str, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m13781(String str, boolean z) {
        StringBuilder sb = new StringBuilder(str.length());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '%') {
                byteArrayOutputStream.reset();
                while (i < str.length() && str.charAt(i) == '%') {
                    int i2 = i + 2;
                    if (i2 >= str.length()) {
                        throw new IllegalArgumentException("Incomplete percent encoding");
                    }
                    int m13778 = m13778(str.charAt(i + 1));
                    int m137782 = m13778(str.charAt(i2));
                    if (m13778 < 0 || m137782 < 0) {
                        throw new IllegalArgumentException("Invalid percent encoding");
                    }
                    byteArrayOutputStream.write((m13778 << 4) + m137782);
                    i += 3;
                }
                sb.append(new String(byteArrayOutputStream.toByteArray(), Charset.forName(a.D)));
            } else {
                if (charAt == '+' && z) {
                    charAt = ' ';
                }
                sb.append(charAt);
                i++;
            }
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo13797(C8236 c8236) {
        if (c8236.m21810() != null) {
            return c8236.m21810().toLowerCase().contains("text/") || c8236.m21810().toLowerCase().contains("/json");
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m13795() {
        if (this.f14950 == null) {
            return -1;
        }
        return this.f14950.getLocalPort();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m13798() {
        return m13800() && !this.f14950.isClosed() && this.f14952.isAlive();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8236 m13782(EnumC1180 enumC1180, PipedInputStream pipedInputStream) {
        return new C8236(enumC1180, "application/zip", pipedInputStream, -1L);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8236 m13783(InterfaceC5414 interfaceC5414, String str, InputStream inputStream, long j) {
        return new C8236(interfaceC5414, str, inputStream, j);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8236 m13784(InterfaceC5414 interfaceC5414, String str, String str2) {
        byte[] bArr;
        C18114 c18114 = new C18114(str);
        if (str2 == null) {
            return new C8236(interfaceC5414, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            if (!Charset.forName(c18114.m42236()).newEncoder().canEncode(str2)) {
                c18114 = c18114.m42233();
            }
            bArr = str2.getBytes(c18114.m42236());
        } catch (UnsupportedEncodingException e) {
            f14944.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e);
            bArr = new byte[0];
        }
        return new C8236(interfaceC5414, c18114.m42234(), new ByteArrayInputStream(bArr), bArr.length);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8236 mo13796(C15996 c15996) {
        HashMap hashMap = new HashMap();
        EnumC4003 m37807 = c15996.m37807();
        if (EnumC4003.PUT.equals(m37807) || EnumC4003.POST.equals(m37807)) {
            try {
                c15996.m37802(hashMap);
            } catch (IOException e) {
                return m13784(EnumC1180.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e.getMessage());
            } catch (C15290 e2) {
                return m13784(e2.m36300(), "text/plain", e2.getMessage());
            }
        }
        c15996.m37803().put("NanoHttpd.QUERY_STRING", c15996.m37812());
        return m13784(EnumC1180.NOT_FOUND, "text/plain", "Not Found");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo13801() {
        try {
            m13790(this.f14950);
            this.f14948.m52406();
            Thread thread = this.f14952;
            if (thread != null) {
                thread.join();
            }
        } catch (Exception e) {
            f14944.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m13800() {
        return (this.f14950 == null || this.f14952 == null) ? false : true;
    }
}
