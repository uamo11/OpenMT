package l;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.concurrent.ThreadPoolExecutor;
import org.bouncycastle.crypto.prng.X931RNG;

/* compiled from: Q759 */
/* renamed from: l.ۙ᩶ۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4871 implements InterfaceC7505 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final Uri f15393;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f15394;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile RunnableC20394 f15395;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String f15396;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f15397;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f15398;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ThreadPoolExecutor f15399;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Object f15400;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 f15401;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f15402;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f15403;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile RunnableC20394 f15404;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile Thread f15405;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public volatile boolean f15406;

    public C4871(C17075 c17075, Uri uri, String str, long j) {
        this(0L, j, uri, c17075, str);
    }

    public C4871(long j, long j2, Uri uri, InterfaceC15097 interfaceC15097, String str) {
        ThreadPoolExecutor m26979 = C10767.m26979();
        this.f15400 = new Object();
        this.f15403 = new Object();
        if (j < 0) {
            throw new IllegalArgumentException("Resource offset must be non-negative");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("Resource length must be known");
        }
        if (j > C13132.FOREVER_NS - j2) {
            throw new IllegalArgumentException("Resource range overflows");
        }
        this.f15401 = interfaceC15097;
        this.f15393 = uri;
        this.f15394 = str;
        this.f15396 = str + "@" + j + ":" + j2;
        this.f15397 = j;
        this.f15402 = j2;
        this.f15398 = 262144;
        this.f15399 = m26979;
    }

    @Override // l.InterfaceC7505
    public final long length() {
        return this.f15402;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m14228(int i, long j) {
        int min = (int) Math.min(X931RNG.BLOCK64_RESEED_MAX, this.f15402 - (j * X931RNG.BLOCK64_RESEED_MAX));
        return min > 0 && i == min;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14226(int i, long j, C7693 c7693, byte[] bArr) {
        synchronized (this.f15403) {
            m14225();
            int i2 = 0;
            while (i2 < i) {
                int min = Math.min(32768, i - i2);
                byte[] bArr2 = new byte[min];
                System.arraycopy(bArr, i2, bArr2, 0, min);
                C1594.m5449().m5455(new C23215(j, this.f15396), bArr2, c7693).close();
                i2 += min;
                j++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0187, code lost:
    
        throw new java.io.EOFException("Preview resource ended before a complete page");
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x014f, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x018f, code lost:
    
        throw new java.io.EOFException("Preview resource ended before requested page");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0192, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0197, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0136, code lost:
    
        r4.m46711();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013c, code lost:
    
        if (r5 == 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013e, code lost:
    
        r4 = (r5 / 32768) * 32768;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014b, code lost:
    
        if ((r1 + r5) != r23.f15402) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014d, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0150, code lost:
    
        if (r2 == 0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0152, code lost:
    
        m14226(r2, r12, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015a, code lost:
    
        r8.close();
     */
    /* JADX WARN: Finally extract failed */
    @Override // l.InterfaceC7505
    /* renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo8637(long r24, byte[] r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4871.mo8637(long, byte[], int, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14225() {
        if (this.f15406 || Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("Preview read was canceled");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r1.m46708();
        r0 = r6.f15403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        if (r6.f15406 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0028, code lost:
    
        if (r6.f15395 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (r1.m46713() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        r6.f15395 = null;
        r6.f15404 = r1;
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0036, code lost:
    
        if (r8 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0038, code lost:
    
        if (r8 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003a, code lost:
    
        r1.m46709();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0062, code lost:
    
        throw new java.io.InterruptedIOException("Preview read was canceled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0066, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0067, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.RunnableC20394 m14224(l.InterfaceC21449 r7, l.C3104 r8) {
        /*
            Method dump skipped, instructions count: 171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4871.m14224(l.᩸۠֫, l.ۗ۠֫):l.᩶᩶ۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14227(RunnableC20394 runnableC20394) {
        synchronized (this.f15403) {
            if (this.f15404 == runnableC20394) {
                this.f15404 = null;
            }
            if (this.f15395 == null && this.f15404 == null && this.f15405 == Thread.currentThread()) {
                this.f15405 = null;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RunnableC20394 runnableC20394;
        RunnableC20394 runnableC203942;
        Thread thread;
        synchronized (this.f15403) {
            this.f15406 = true;
            runnableC20394 = this.f15395;
            runnableC203942 = this.f15404;
            thread = this.f15405;
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
        synchronized (this.f15400) {
            this.f15400.notifyAll();
        }
        RunnableC20394.m46707(th);
    }
}
