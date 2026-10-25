package l;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: 4748 */
/* renamed from: l.֨۠ۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0991 implements AutoCloseable {

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Pattern f3693 = Pattern.compile("(?i)^bytes\\s+0-0/(\\d+)$");

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f3694;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ThreadPoolExecutor f3695;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C19337 f3696;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C19337 f3697;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f3698;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private synchronized void m3462() {
        if (this.f3694 || Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("HTTP range probe was canceled");
        }
    }

    public C0991() {
        ThreadPoolExecutor m26979 = C10767.m26979();
        this.f3698 = new HashMap();
        this.f3695 = m26979;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0285 m3463(Uri uri, InterfaceC15097 interfaceC15097) {
        EnumC5225 enumC5225;
        C0285 c0285;
        boolean z;
        String m47724 = C20892.m47724(uri, interfaceC15097);
        synchronized (this) {
            C18631 c18631 = (C18631) C13843.computeIfAbsent(this.f3698, m47724, new C2403());
            while (true) {
                EnumC5225 enumC52252 = c18631.f57791;
                enumC5225 = EnumC5225.PROBING;
                if (enumC52252 != enumC5225 || this.f3694) {
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("Interrupted while waiting for HTTP range probe");
                }
            }
            m3462();
            C0285 c02852 = c18631.f57790;
            if (c02852 != null) {
                return c02852;
            }
            IOException iOException = c18631.f57789;
            if (iOException != null) {
                throw iOException;
            }
            c18631.f57791 = enumC5225;
            try {
                c0285 = m3461(uri, interfaceC15097);
                e = null;
            } catch (IOException e) {
                e = e;
                c0285 = null;
            }
            synchronized (this) {
                if (this.f3694) {
                    notifyAll();
                    throw new InterruptedIOException("HTTP range probe was canceled");
                }
                if (e == null) {
                    c18631.f57790 = c0285;
                    z = c0285.f1631;
                    c18631.f57791 = z ? EnumC5225.SUPPORTED : EnumC5225.UNSUPPORTED;
                } else if (Thread.currentThread().isInterrupted()) {
                    c18631.f57791 = EnumC5225.UNKNOWN;
                } else {
                    c18631.f57789 = e;
                    c18631.f57791 = EnumC5225.ERROR;
                }
                notifyAll();
            }
            if (e == null) {
                return c0285;
            }
            throw e;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C0285 m3461(final Uri uri, InterfaceC15097 interfaceC15097) {
        final C19337 c19337;
        boolean z;
        boolean z2;
        Throwable th;
        Throwable th2;
        Throwable th3;
        C0285 c0285;
        synchronized (this) {
            while (true) {
                C19337 c193372 = this.f3696;
                int i = (c193372 == null ? 0 : 1) + (this.f3697 == null ? 0 : 1);
                if ((c193372 == null && i < 2) || this.f3694) {
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("Interrupted while waiting for HTTP range open");
                }
            }
            m3462();
            c19337 = new C19337(interfaceC15097.mo6247());
            this.f3696 = c19337;
        }
        try {
            this.f3695.execute(new Runnable() { // from class: l.ۘ۠ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C0991.m3459(C0991.this, c19337, uri);
                }
            });
            synchronized (this) {
                while (true) {
                    z = c19337.f60789;
                    if (z || this.f3694) {
                        break;
                    }
                    try {
                        wait();
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                        c19337.f60786 = true;
                        if (this.f3696 == c19337 && this.f3697 == null) {
                            this.f3696 = null;
                            this.f3697 = c19337;
                            notifyAll();
                        }
                        throw new InterruptedIOException("Interrupted while opening HTTP range probe");
                    }
                }
                m3462();
                z2 = c19337.f60788;
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                th = c19337.f60787;
                if (th instanceof IOException) {
                    throw ((IOException) th);
                }
                th2 = c19337.f60787;
                if (th2 instanceof RuntimeException) {
                    throw ((RuntimeException) th2);
                }
                th3 = c19337.f60787;
                if (th3 instanceof Error) {
                    throw ((Error) th3);
                }
                c0285 = c19337.f60791;
            }
            return c0285;
        } catch (RuntimeException e) {
            IOException iOException = new IOException("Unable to schedule HTTP range probe", e);
            m3460(c19337, iOException);
            throw iOException;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3460(C19337 c19337, IOException iOException) {
        InterfaceC21449 interfaceC21449;
        synchronized (this) {
            if (this.f3696 == c19337) {
                this.f3696 = null;
            }
            c19337.f60787 = iOException;
            c19337.f60789 = true;
            notifyAll();
        }
        try {
            interfaceC21449 = c19337.f60790;
            interfaceC21449.close();
        } catch (Throwable th) {
            iOException.addSuppressed(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3459(C0991 c0991, C19337 c19337, Uri uri) {
        InterfaceC21449 interfaceC21449;
        C19337 c193372;
        boolean z;
        InterfaceC21449 interfaceC214492;
        C19337 c193373;
        boolean z2;
        InterfaceC21449 interfaceC214493;
        C19337 c193374;
        boolean z3;
        try {
            c0991.m3462();
            interfaceC214492 = c19337.f60790;
            C0285 m3458 = m3458(interfaceC214492, uri);
            try {
                interfaceC214493 = c19337.f60790;
                interfaceC214493.close();
                boolean interrupted = Thread.interrupted();
                synchronized (c0991) {
                    if (c0991.f3696 == c19337) {
                        c0991.f3696 = null;
                    }
                    if (c0991.f3697 == c19337) {
                        c0991.f3697 = null;
                    }
                    if (c0991.f3697 == null && (c193374 = c0991.f3696) != null) {
                        z3 = c193374.f60786;
                        if (z3) {
                            c0991.f3697 = c0991.f3696;
                            c0991.f3696 = null;
                        }
                    }
                    c19337.f60791 = m3458;
                    c19337.f60787 = null;
                    c19337.f60788 = interrupted;
                    c19337.f60789 = true;
                    c0991.notifyAll();
                }
            } catch (Throwable unused) {
                boolean interrupted2 = Thread.interrupted();
                synchronized (c0991) {
                    if (c0991.f3696 == c19337) {
                        c0991.f3696 = null;
                    }
                    if (c0991.f3697 == c19337) {
                        c0991.f3697 = null;
                    }
                    if (c0991.f3697 == null && (c193373 = c0991.f3696) != null) {
                        z2 = c193373.f60786;
                        if (z2) {
                            c0991.f3697 = c0991.f3696;
                            c0991.f3696 = null;
                        }
                    }
                    c19337.f60791 = m3458;
                    c19337.f60787 = null;
                    c19337.f60788 = interrupted2;
                    c19337.f60789 = true;
                    c0991.notifyAll();
                }
            }
        } catch (Throwable th) {
            try {
                interfaceC21449 = c19337.f60790;
                interfaceC21449.close();
                boolean interrupted3 = Thread.interrupted();
                synchronized (c0991) {
                    if (c0991.f3696 == c19337) {
                        c0991.f3696 = null;
                    }
                    if (c0991.f3697 == c19337) {
                        c0991.f3697 = null;
                    }
                    if (c0991.f3697 == null && (c193372 = c0991.f3696) != null) {
                        z = c193372.f60786;
                        if (z) {
                            c0991.f3697 = c0991.f3696;
                            c0991.f3696 = null;
                        }
                    }
                    c19337.f60791 = null;
                    c19337.f60787 = th;
                    c19337.f60788 = interrupted3;
                    c19337.f60789 = true;
                    c0991.notifyAll();
                }
            } finally {
                boolean interrupted4 = Thread.interrupted();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if (r12 >= 0) goto L22;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C0285 m3458(l.InterfaceC21449 r12, android.net.Uri r13) {
        /*
            r0 = 0
            r1 = -1
            l.ۙ۠֫ r3 = new l.ۙ۠֫     // Catch: l.C23770 -> L6a
            r3.<init>()     // Catch: l.C23770 -> L6a
            r3.m13281(r13)     // Catch: l.C23770 -> L6a
            r4 = 0
            r3.m13286(r4)     // Catch: l.C23770 -> L6a
            r6 = 1
            r3.m13280(r6)     // Catch: l.C23770 -> L6a
            l.ۗ۠֫ r13 = r3.m13278()     // Catch: l.C23770 -> L6a
            long r8 = r12.mo1620(r13)     // Catch: l.C23770 -> L6a
            java.util.Map r13 = r12.mo5936()     // Catch: l.C23770 -> L6a
            java.lang.String r3 = "Content-Range"
            java.lang.String r3 = m3457(r3, r13)     // Catch: l.C23770 -> L6a
            boolean r10 = r12 instanceof l.InterfaceC20949     // Catch: l.C23770 -> L6a
            if (r10 == 0) goto L32
            l.᩷ܶ֫ r12 = (l.InterfaceC20949) r12     // Catch: l.C23770 -> L6a
            int r12 = r12.mo19698()     // Catch: l.C23770 -> L6a
            goto L33
        L32:
            r12 = -1
        L33:
            r10 = 206(0xce, float:2.89E-43)
            if (r12 != r10) goto L3c
            long r10 = m3456(r3)     // Catch: l.C23770 -> L6a
            goto L3d
        L3c:
            r10 = r1
        L3d:
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 == 0) goto L48
            l.֡۠ۜ r12 = new l.֡۠ۜ     // Catch: l.C23770 -> L6a
            r13 = 1
            r12.<init>(r10, r13)     // Catch: l.C23770 -> L6a
            return r12
        L48:
            java.lang.String r12 = "Content-Length"
            java.lang.String r12 = m3457(r12, r13)     // Catch: l.C23770 -> L6a
            if (r12 == 0) goto L59
            long r12 = java.lang.Long.parseLong(r12)     // Catch: java.lang.NumberFormatException -> L59 l.C23770 -> L6a
            int r3 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r3 < 0) goto L59
            goto L5a
        L59:
            r12 = r1
        L5a:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L63
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 <= 0) goto L63
            goto L64
        L63:
            r8 = r12
        L64:
            l.֡۠ۜ r12 = new l.֡۠ۜ     // Catch: l.C23770 -> L6a
            r12.<init>(r8, r0)     // Catch: l.C23770 -> L6a
            return r12
        L6a:
            r12 = move-exception
            int r13 = r12.f76941
            r3 = 416(0x1a0, float:5.83E-43)
            if (r13 != r3) goto L77
            l.֡۠ۜ r12 = new l.֡۠ۜ
            r12.<init>(r1, r0)
            return r12
        L77:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0991.m3458(l.᩸۠֫, android.net.Uri):l.֡۠ۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m3456(String str) {
        long parseLong;
        if (str == null) {
            return -1L;
        }
        Matcher matcher = f3693.matcher(str.trim());
        if (!matcher.matches()) {
            return -1L;
        }
        try {
            parseLong = Long.parseLong(matcher.group(1));
        } catch (NumberFormatException unused) {
        }
        if (parseLong > 0) {
            return parseLong;
        }
        return -1L;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m3457(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && ((String) entry.getKey()).equalsIgnoreCase(str) && entry.getValue() != null && !((List) entry.getValue()).isEmpty()) {
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f3694 = true;
            notifyAll();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3464() {
        synchronized (this) {
            this.f3694 = true;
            notifyAll();
        }
    }
}
