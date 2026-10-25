package l;

import java.util.concurrent.locks.LockSupport;

/* compiled from: I6PU */
/* renamed from: l.ᩴ᩻᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19098 extends AbstractRunnableC4281 {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long f60138;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile Thread f60139 = Thread.currentThread();

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f60140;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f60141;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f60142;

    public C19098(long j, long j2, boolean z) {
        this.f60142 = z;
        this.f60141 = j;
        this.f60138 = j2;
    }

    @Override // l.AbstractRunnableC4281
    /* renamed from: ֫ */
    public final FutureC3575 mo2888(int i) {
        Thread thread = this.f60139;
        if (thread != null) {
            this.f60139 = null;
            LockSupport.unpark(thread);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r2 > 0) goto L15;
     */
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m43985() {
        /*
            r8 = this;
            boolean r0 = java.lang.Thread.interrupted()
            r1 = 1
            if (r0 == 0) goto L9
            r8.f60140 = r1
        L9:
            boolean r0 = r8.f60140
            if (r0 == 0) goto L11
            boolean r0 = r8.f60142
            if (r0 != 0) goto L2e
        L11:
            long r2 = r8.f60138
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L2a
            long r6 = r8.f60141
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L2e
            long r6 = java.lang.System.nanoTime()
            long r2 = r2 - r6
            r8.f60141 = r2
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L2e
        L2a:
            java.lang.Thread r0 = r8.f60139
            if (r0 != 0) goto L2f
        L2e:
            return r1
        L2f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19098.m43985():boolean");
    }

    @Override // l.AbstractRunnableC4281
    /* renamed from: ܳ */
    public final boolean mo5012() {
        return this.f60139 != null;
    }
}
