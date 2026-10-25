package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;

/* compiled from: B749 */
/* renamed from: l.ܿ᩸ۜ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17613 implements InterfaceC7505 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C5127 f53806;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Throwable f53807;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f53808;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C20177 f53809;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C3104 f53810;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f53811;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f53812;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f53813;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Thread f53814;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Object f53815;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21449 f53816;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C7693 f53817;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final long f53818;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final int f53819;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public RunnableC20394 f53820;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public RunnableC20394 f53821;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object f53822;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f53823;

    public C17613(InterfaceC21449 interfaceC21449, C3104 c3104, long j, C20177 c20177) {
        C5127 c5127 = new C5127();
        this.f53815 = new Object();
        this.f53822 = new Object();
        if (j <= 0) {
            throw new IllegalArgumentException("MPEG-TS segment length must be positive");
        }
        int min = (int) ((Math.min(j, 524144) / 188) * 188);
        if (min < 940) {
            throw new IllegalArgumentException("MPEG-TS segment is too short to preview");
        }
        this.f53816 = interfaceC21449;
        this.f53810 = c3104;
        this.f53818 = j;
        this.f53819 = min;
        this.f53809 = c20177;
        this.f53806 = c5127;
    }

    @Override // l.InterfaceC7505
    public final long length() {
        m41175();
        return this.f53823;
    }

    @Override // l.InterfaceC7505
    /* renamed from: ۧ */
    public final void mo8637(long j, byte[] bArr, int i, int i2) {
        m41175();
        synchronized (this.f53822) {
            m41176();
            if (j < 0 || i < 0 || i2 < 0 || i > bArr.length - i2 || j > this.f53823 - i2) {
                throw new EOFException("MPEG-TS preview read exceeds clip length");
            }
            byte[] bArr2 = this.f53813;
            if (bArr2 == null) {
                throw new InterruptedIOException("MPEG-TS preview clip was closed");
            }
            System.arraycopy(bArr2, (int) j, bArr, i, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        r1 = r8.f53822;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004a, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
    
        if (r8.f53814 != java.lang.Thread.currentThread()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0053, code lost:
    
        r8.f53814 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0055, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0057, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m41175() {
        /*
            Method dump skipped, instructions count: 167
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17613.m41175():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C7546 m41170() {
        C1594 m5449 = C1594.m5449();
        int i = this.f53819;
        C7693 m5453 = m5449.m5453(i);
        if (m5453 == null) {
            throw new IOException("MPEG-TS preview memory budget is exhausted");
        }
        try {
            byte[] bArr = new byte[i];
            C4515 m9467 = this.f53810.m9467();
            long j = i;
            m9467.m13280(j);
            RunnableC20394 m41171 = m41171(m9467.m13278());
            Throwable th = null;
            try {
                try {
                    long m46712 = m41171.m46712();
                    if (m46712 != -1 && m46712 < j) {
                        throw new EOFException("MPEG-TS preview source is shorter than expected");
                    }
                    C2091 c2091 = new C2091(this.f53816, bArr, this.f53819, this.f53818, new C13895(this));
                    C16184 c16184 = new C16184(c2091, 0L, this.f53818);
                    C11264 c11264 = new C11264();
                    C15729 m14680 = this.f53806.m14680();
                    if (!m14680.mo4841(c16184)) {
                        throw new IOException("MPEG-TS preview source could not be recognized");
                    }
                    if (m41169(c2091.m6870(), bArr) < 0) {
                        throw new IOException("MPEG-TS preview packet alignment is invalid");
                    }
                    c16184.mo22066();
                    m14680.mo4840(c11264);
                    C23615 c23615 = new C23615();
                    while (!c11264.m27875()) {
                        m41176();
                        int mo4837 = m14680.mo4837(c16184, c23615);
                        if (mo4837 == 1) {
                            throw new IOException("Unexpected seek while scanning MPEG-TS preview");
                        }
                        if (mo4837 == -1) {
                            break;
                        }
                    }
                    if (!c11264.m27875()) {
                        throw new IOException("No decodable video keyframe found in MPEG-TS preview");
                    }
                    int m41169 = m41169(c2091.m6870(), bArr);
                    int m6870 = (((c2091.m6870() - m41169) / 188) * 188) + m41169;
                    if (m6870 <= 0) {
                        throw new IOException("MPEG-TS preview does not contain a complete packet");
                    }
                    C7546 c7546 = new C7546(m6870, c11264.m27876(), m5453, bArr);
                    try {
                        try {
                            m41171.m46711();
                            return c7546;
                        } finally {
                        }
                    } catch (IOException | Error | RuntimeException e) {
                        throw e;
                    }
                } catch (Throwable th2) {
                    try {
                        try {
                            m41171.m46711();
                        } finally {
                        }
                    } catch (IOException | Error | RuntimeException e2) {
                        if (0 != 0 && null != e2) {
                            th.addSuppressed(e2);
                        } else if (0 == 0) {
                            throw e2;
                        }
                    }
                    throw th2;
                }
            } catch (IOException | Error | RuntimeException e3) {
                throw e3;
            }
        } catch (Throwable th3) {
            m5453.close();
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        r1.m46708();
        r0 = r7.f53822;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0022, code lost:
    
        if (r7.f53812 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0026, code lost:
    
        if (r7.f53820 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r1.m46713() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        r7.f53820 = null;
        r7.f53821 = r1;
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        if (r2 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0036, code lost:
    
        if (r2 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0038, code lost:
    
        r1.m46709();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0051, code lost:
    
        throw new java.io.InterruptedIOException("MPEG-TS preview read was canceled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0055, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0056, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.RunnableC20394 m41171(l.C3104 r8) {
        /*
            r7 = this;
            l.᩶᩶ۜ r1 = new l.᩶᩶ۜ
            l.᩸۠֫ r0 = r7.f53816
            java.util.concurrent.ThreadPoolExecutor r2 = l.C10767.m26979()
            r1.<init>(r0, r8, r2)
            r8 = 0
            r2 = 0
            java.lang.Object r0 = r7.f53822     // Catch: java.lang.Throwable -> L6b
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L6b
            r7.m41176()     // Catch: java.lang.Throwable -> L5d
            r7.f53820 = r1     // Catch: java.lang.Throwable -> L5d
            r3 = 1
            r1.m46710()     // Catch: java.lang.Throwable -> L58
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L58
            r1.m46708()     // Catch: java.lang.Throwable -> L55
            java.lang.Object r0 = r7.f53822     // Catch: java.lang.Throwable -> L55
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L55
            boolean r4 = r7.f53812     // Catch: java.lang.Throwable -> L52
            if (r4 != 0) goto L33
            l.᩶᩶ۜ r4 = r7.f53820     // Catch: java.lang.Throwable -> L52
            if (r4 != r1) goto L33
            boolean r4 = r1.m46713()     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L33
            r7.f53820 = r8     // Catch: java.lang.Throwable -> L52
            r7.f53821 = r1     // Catch: java.lang.Throwable -> L52
            r2 = 1
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L4a
            if (r2 != 0) goto L49
            r1.m46709()     // Catch: java.lang.Throwable -> L3b
        L3b:
            java.lang.Object r0 = r7.f53822
            monitor-enter(r0)
            l.᩶᩶ۜ r2 = r7.f53820     // Catch: java.lang.Throwable -> L46
            if (r2 != r1) goto L44
            r7.f53820 = r8     // Catch: java.lang.Throwable -> L46
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            goto L49
        L46:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r8
        L49:
            return r1
        L4a:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = "MPEG-TS preview read was canceled"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L55
            throw r0     // Catch: java.lang.Throwable -> L55
        L52:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            throw r4     // Catch: java.lang.Throwable -> L55
        L55:
            r0 = move-exception
            r5 = r7
            goto L64
        L58:
            r4 = move-exception
            r5 = r7
            r3 = r4
            r4 = 1
            goto L60
        L5d:
            r3 = move-exception
            r4 = 0
            r5 = r7
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            throw r3     // Catch: java.lang.Throwable -> L62
        L62:
            r0 = move-exception
            r3 = r4
        L64:
            r6 = r1
            r1 = r0
            r0 = r2
            r2 = r6
            goto L71
        L69:
            r3 = move-exception
            goto L60
        L6b:
            r0 = move-exception
            r3 = 0
            r5 = r7
            r2 = r1
            r1 = r0
            r0 = 0
        L71:
            if (r0 != 0) goto L8a
            if (r3 == 0) goto L79
            r2.m46709()     // Catch: java.lang.Throwable -> L7c
            goto L7c
        L79:
            r2.m46711()     // Catch: java.lang.Throwable -> L7c
        L7c:
            java.lang.Object r0 = r5.f53822
            monitor-enter(r0)
            l.᩶᩶ۜ r3 = r5.f53820     // Catch: java.lang.Throwable -> L87
            if (r3 != r2) goto L85
            r5.f53820 = r8     // Catch: java.lang.Throwable -> L87
        L85:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            goto L8a
        L87:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            throw r8
        L8a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17613.m41171(l.ۗ۠֫):l.᩶᩶ۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41174(RunnableC20394 runnableC20394) {
        synchronized (this.f53822) {
            if (this.f53821 == runnableC20394) {
                this.f53821 = null;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RunnableC20394 runnableC20394;
        RunnableC20394 runnableC203942;
        Thread thread;
        C7693 c7693;
        synchronized (this.f53822) {
            this.f53812 = true;
            runnableC20394 = this.f53820;
            runnableC203942 = this.f53821;
            thread = this.f53814;
        }
        if (runnableC20394 != null) {
            try {
                runnableC20394.m46709();
            } catch (Throwable th) {
                th = th;
            }
        }
        th = null;
        if (thread != null && thread != Thread.currentThread()) {
            thread.interrupt();
        }
        if (runnableC203942 != null) {
            try {
                runnableC203942.m46711();
            } catch (Throwable th2) {
                th = th2;
                if (th != null) {
                    if (th != th) {
                        th.addSuppressed(th);
                    }
                }
            }
        }
        th = th;
        if (thread != Thread.currentThread()) {
            synchronized (this.f53815) {
            }
        }
        synchronized (this.f53822) {
            this.f53813 = null;
            c7693 = this.f53817;
            this.f53817 = null;
        }
        if (c7693 != null) {
            c7693.close();
        }
        m41172(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m41176() {
        if (this.f53812 || Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("MPEG-TS preview read was canceled");
        }
        this.f53809.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        r0 = r0 + 1;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m41169(int r4, byte[] r5) {
        /*
            r0 = 187(0xbb, float:2.62E-43)
            int r4 = r4 + (-940)
            int r4 = java.lang.Math.min(r0, r4)
            r0 = 0
        L9:
            if (r0 > r4) goto L21
            r1 = 0
        Lc:
            r2 = 5
            if (r1 >= r2) goto L20
            int r2 = r1 * 188
            int r2 = r2 + r0
            r2 = r5[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 71
            if (r2 == r3) goto L1d
            int r0 = r0 + 1
            goto L9
        L1d:
            int r1 = r1 + 1
            goto Lc
        L20:
            return r0
        L21:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17613.m41169(int, byte[]):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41172(Throwable th) {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th != null) {
            throw new IOException("MPEG-TS preview operation failed", th);
        }
    }
}
