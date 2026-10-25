package l;

import com.alipay.sdk.m.o.b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: H4EU */
/* renamed from: l.ۙܽ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C4760 extends C15384 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final long f15118;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C4760 f15119;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final long f15120;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C4760 f15121;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f15122;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f15123;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo13924() {
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f15118 = millis;
        f15120 = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m13925() {
        C4760 c4760;
        if (this.f15122) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long mo20330 = mo20330();
        boolean mo20333 = mo20333();
        if (mo20330 != 0 || mo20333) {
            this.f15122 = true;
            synchronized (C4760.class) {
                if (f15119 == null) {
                    f15119 = new C4760();
                    C20283 c20283 = new C20283("Okio Watchdog");
                    c20283.setDaemon(true);
                    c20283.start();
                }
                long nanoTime = System.nanoTime();
                if (mo20330 != 0 && mo20333) {
                    this.f15123 = Math.min(mo20330, mo20331() - nanoTime) + nanoTime;
                } else if (mo20330 != 0) {
                    this.f15123 = mo20330 + nanoTime;
                } else {
                    if (!mo20333) {
                        throw new AssertionError();
                    }
                    this.f15123 = mo20331();
                }
                long j = this.f15123 - nanoTime;
                C4760 c47602 = f15119;
                while (true) {
                    c4760 = c47602.f15121;
                    if (c4760 == null || j < c4760.f15123 - nanoTime) {
                        break;
                    } else {
                        c47602 = c4760;
                    }
                }
                this.f15121 = c4760;
                c47602.f15121 = this;
                if (c47602 == f15119) {
                    C4760.class.notify();
                }
            }
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m13923() {
        if (!this.f15122) {
            return false;
        }
        this.f15122 = false;
        synchronized (C4760.class) {
            C4760 c4760 = f15119;
            while (c4760 != null) {
                C4760 c47602 = c4760.f15121;
                if (c47602 == this) {
                    c4760.f15121 = this.f15121;
                    this.f15121 = null;
                    return false;
                }
                c4760 = c47602;
            }
            return true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13922(boolean z) {
        if (m13923() && z) {
            throw mo13921((IOException) null);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public IOException mo13921(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(b.n0);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C4760 m13920() {
        C4760 c4760 = f15119.f15121;
        if (c4760 == null) {
            long nanoTime = System.nanoTime();
            C4760.class.wait(f15118);
            if (f15119.f15121 != null || System.nanoTime() - nanoTime < f15120) {
                return null;
            }
            return f15119;
        }
        long nanoTime2 = c4760.f15123 - System.nanoTime();
        if (nanoTime2 > 0) {
            long j = nanoTime2 / 1000000;
            C4760.class.wait(j, (int) (nanoTime2 - (1000000 * j)));
            return null;
        }
        f15119.f15121 = c4760.f15121;
        c4760.f15121 = null;
        return c4760;
    }
}
