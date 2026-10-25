package l;

import com.alipay.sdk.m.o.b;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: A4ET */
/* renamed from: l.ܶᩳ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C15384 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C15384 f47109 = new C8330();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f47110;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f47111;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f47112;

    /* renamed from: ۧ */
    public C15384 mo20329(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (j < 0) {
            throw new IllegalArgumentException(C16014.m37865(j, "timeout < 0: "));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.f47112 = timeUnit.toNanos(j);
        return this;
    }

    /* renamed from: ܳ */
    public long mo20330() {
        return this.f47112;
    }

    /* renamed from: ᩳ */
    public boolean mo20333() {
        return this.f47111;
    }

    /* renamed from: ܽ */
    public long mo20331() {
        if (!this.f47111) {
            throw new IllegalStateException("No deadline");
        }
        return this.f47110;
    }

    /* renamed from: ֫ */
    public C15384 mo20326(long j) {
        this.f47111 = true;
        this.f47110 = j;
        return this;
    }

    /* renamed from: ۧ */
    public C15384 mo20328() {
        this.f47112 = 0L;
        return this;
    }

    /* renamed from: ֫ */
    public C15384 mo20325() {
        this.f47111 = false;
        return this;
    }

    /* renamed from: ܿ */
    public void mo20332() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f47111 && this.f47110 - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36419(Object obj) {
        try {
            boolean mo20333 = mo20333();
            long mo20330 = mo20330();
            long j = 0;
            if (!mo20333 && mo20330 == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (mo20333 && mo20330 != 0) {
                mo20330 = Math.min(mo20330, mo20331() - nanoTime);
            } else if (mo20333) {
                mo20330 = mo20331() - nanoTime;
            }
            if (mo20330 > 0) {
                long j2 = mo20330 / 1000000;
                Long.signum(j2);
                obj.wait(j2, (int) (mo20330 - (1000000 * j2)));
                j = System.nanoTime() - nanoTime;
            }
            if (j >= mo20330) {
                throw new InterruptedIOException(b.n0);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
