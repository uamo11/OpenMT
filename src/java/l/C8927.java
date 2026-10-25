package l;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: 54FG */
/* renamed from: l.ۡܰ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8927 {

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f27139 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C20032.m46177("OkHttp ConnectionPool", true));

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Runnable f27140;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f27141;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9078 f27142;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f27143;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f27144;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f27145;

    public C8927() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f27140 = new RunnableC9633(this);
        this.f27143 = new ArrayDeque();
        this.f27142 = new C9078(1);
        this.f27144 = 5;
        this.f27145 = timeUnit.toNanos(5L);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23377 m23033(C4965 c4965, C15615 c15615, C5215 c5215) {
        Iterator it = this.f27143.iterator();
        while (it.hasNext()) {
            C23377 c23377 = (C23377) it.next();
            if (c23377.m51823(c4965, c5215)) {
                c15615.m36807(c23377, true);
                return c23377;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Socket m23032(C4965 c4965, C15615 c15615) {
        Iterator it = this.f27143.iterator();
        while (it.hasNext()) {
            C23377 c23377 = (C23377) it.next();
            if (c23377.m51823(c4965, null) && c23377.m51827() && c23377 != c15615.m36811()) {
                return c15615.m36803(c23377);
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23035(C23377 c23377) {
        if (!this.f27141) {
            this.f27141 = true;
            f27139.execute(this.f27140);
        }
        this.f27143.add(c23377);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m23034(C23377 c23377) {
        if (c23377.f75105 || this.f27144 == 0) {
            this.f27143.remove(c23377);
            return true;
        }
        notifyAll();
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m23031(long j) {
        synchronized (this) {
            Iterator it = this.f27143.iterator();
            C23377 c23377 = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                C23377 c233772 = (C23377) it.next();
                if (m23030(c233772, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - c233772.f75116;
                    if (j3 > j2) {
                        c23377 = c233772;
                        j2 = j3;
                    }
                }
            }
            long j4 = this.f27145;
            if (j2 < j4 && i <= this.f27144) {
                if (i > 0) {
                    return j4 - j2;
                }
                if (i2 > 0) {
                    return j4;
                }
                this.f27141 = false;
                return -1L;
            }
            this.f27143.remove(c23377);
            C20032.m46181(c23377.m51828());
            return 0L;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m23030(C23377 c23377, long j) {
        ArrayList arrayList = c23377.f75111;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C18872.m43580().mo43583(((C8561) reference).f26163, "A connection to " + c23377.m51829().f16325.f15638 + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i);
                c23377.f75105 = true;
                if (arrayList.isEmpty()) {
                    c23377.f75116 = j - this.f27145;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
