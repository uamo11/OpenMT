package l;

import java.io.EOFException;
import java.util.ArrayDeque;

/* compiled from: T4F2 */
/* renamed from: l.۬ۧ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13062 implements InterfaceC1274 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C12521 f39084 = new C12521();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12521 f39085 = new C12521();

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10241 f39086;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f39087;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f39088;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f39089;

    public C13062(C10241 c10241, long j) {
        this.f39086 = c10241;
        this.f39087 = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        r11 = -1;
     */
    @Override // l.InterfaceC1274
    /* renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo4334(l.C12521 r11, long r12) {
        /*
            r10 = this;
        L0:
            l.ۤۧ֡ r12 = r10.f39086
            r0 = r12
            monitor-enter(r0)
            l.ۤۧ֡ r12 = r10.f39086     // Catch: java.lang.Throwable -> Lb4
            l.۫ۧ֡ r12 = r12.f30876     // Catch: java.lang.Throwable -> Lb4
            r12.m13925()     // Catch: java.lang.Throwable -> Lb4
            l.ۤۧ֡ r12 = r10.f39086     // Catch: java.lang.Throwable -> Lab
            l.ܰ֫֡ r13 = r12.f30872     // Catch: java.lang.Throwable -> Lab
            if (r13 == 0) goto L12
            goto L13
        L12:
            r13 = 0
        L13:
            boolean r1 = r10.f39088     // Catch: java.lang.Throwable -> Lab
            if (r1 != 0) goto La3
            java.util.ArrayDeque r12 = l.C10241.m25932(r12)     // Catch: java.lang.Throwable -> Lab
            r12.isEmpty()     // Catch: java.lang.Throwable -> Lab
            l.۫ܽ֡ r12 = r10.f39085     // Catch: java.lang.Throwable -> Lab
            long r1 = r12.size()     // Catch: java.lang.Throwable -> Lab
            r3 = -1
            r5 = 0
            int r12 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r12 <= 0) goto L64
            l.۫ܽ֡ r12 = r10.f39085     // Catch: java.lang.Throwable -> Lab
            long r1 = r12.size()     // Catch: java.lang.Throwable -> Lab
            r7 = 8192(0x2000, double:4.0474E-320)
            long r1 = java.lang.Math.min(r7, r1)     // Catch: java.lang.Throwable -> Lab
            long r11 = r12.mo4334(r11, r1)     // Catch: java.lang.Throwable -> Lab
            l.ۤۧ֡ r1 = r10.f39086     // Catch: java.lang.Throwable -> Lab
            long r7 = r1.f30869     // Catch: java.lang.Throwable -> Lab
            long r7 = r7 + r11
            r1.f30869 = r7     // Catch: java.lang.Throwable -> Lab
            if (r13 != 0) goto L86
            l.᩹ۧ֡ r1 = r1.f30870     // Catch: java.lang.Throwable -> Lab
            l.֫ܽ֡ r1 = r1.f72140     // Catch: java.lang.Throwable -> Lab
            int r1 = r1.m6393()     // Catch: java.lang.Throwable -> Lab
            int r1 = r1 / 2
            long r1 = (long) r1     // Catch: java.lang.Throwable -> Lab
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 < 0) goto L86
            l.ۤۧ֡ r1 = r10.f39086     // Catch: java.lang.Throwable -> Lab
            l.᩹ۧ֡ r2 = r1.f30870     // Catch: java.lang.Throwable -> Lab
            int r7 = r1.f30871     // Catch: java.lang.Throwable -> Lab
            long r8 = r1.f30869     // Catch: java.lang.Throwable -> Lab
            r2.m49926(r7, r8)     // Catch: java.lang.Throwable -> Lab
            l.ۤۧ֡ r1 = r10.f39086     // Catch: java.lang.Throwable -> Lab
            r1.f30869 = r5     // Catch: java.lang.Throwable -> Lab
            goto L86
        L64:
            boolean r12 = r10.f39089     // Catch: java.lang.Throwable -> Lab
            if (r12 != 0) goto L85
            if (r13 != 0) goto L85
            l.ۤۧ֡ r12 = r10.f39086     // Catch: java.lang.Throwable -> Lab
            r12.wait()     // Catch: java.lang.InterruptedException -> L78 java.lang.Throwable -> Lab
            l.ۤۧ֡ r12 = r10.f39086     // Catch: java.lang.Throwable -> Lb4
            l.۫ۧ֡ r12 = r12.f30876     // Catch: java.lang.Throwable -> Lb4
            r12.m29977()     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb4
            goto L0
        L78:
            java.lang.Thread r11 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lab
            r11.interrupt()     // Catch: java.lang.Throwable -> Lab
            java.io.InterruptedIOException r11 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> Lab
            r11.<init>()     // Catch: java.lang.Throwable -> Lab
            throw r11     // Catch: java.lang.Throwable -> Lab
        L85:
            r11 = r3
        L86:
            l.ۤۧ֡ r1 = r10.f39086     // Catch: java.lang.Throwable -> Lb4
            l.۫ۧ֡ r1 = r1.f30876     // Catch: java.lang.Throwable -> Lb4
            r1.m29977()     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb4
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 == 0) goto L9a
            l.ۤۧ֡ r13 = r10.f39086
            l.᩹ۧ֡ r13 = r13.f30870
            r13.m49939(r11)
            return r11
        L9a:
            if (r13 != 0) goto L9d
            return r3
        L9d:
            l.ۧܽ֡ r11 = new l.ۧܽ֡
            r11.<init>(r13)
            throw r11
        La3:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> Lab
            java.lang.String r12 = "stream closed"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Lab
            throw r11     // Catch: java.lang.Throwable -> Lab
        Lab:
            r11 = move-exception
            l.ۤۧ֡ r12 = r10.f39086     // Catch: java.lang.Throwable -> Lb4
            l.۫ۧ֡ r12 = r12.f30876     // Catch: java.lang.Throwable -> Lb4
            r12.m29977()     // Catch: java.lang.Throwable -> Lb4
            throw r11     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb4
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13062.mo4334(l.۫ܽ֡, long):long");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31631(InterfaceC6171 interfaceC6171, long j) {
        boolean z;
        boolean z2;
        long j2;
        while (j > 0) {
            synchronized (this.f39086) {
                z = this.f39089;
                z2 = this.f39085.size() + j > this.f39087;
            }
            if (z2) {
                interfaceC6171.skip(j);
                this.f39086.m25940(EnumC13499.FLOW_CONTROL_ERROR);
                return;
            }
            if (z) {
                interfaceC6171.skip(j);
                return;
            }
            long mo4334 = interfaceC6171.mo4334(this.f39084, j);
            if (mo4334 == -1) {
                throw new EOFException();
            }
            j -= mo4334;
            synchronized (this.f39086) {
                if (this.f39088) {
                    j2 = this.f39084.size();
                    this.f39084.m30706();
                } else {
                    boolean z3 = this.f39085.size() == 0;
                    this.f39085.m30709((InterfaceC1274) this.f39084);
                    if (z3) {
                        this.f39086.notifyAll();
                    }
                    j2 = 0;
                }
            }
            if (j2 > 0) {
                this.f39086.f30870.m49939(j2);
            }
        }
    }

    @Override // l.InterfaceC1274
    /* renamed from: ۢ */
    public final C15384 mo4333() {
        return this.f39086.f30876;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long size;
        ArrayDeque arrayDeque;
        synchronized (this.f39086) {
            this.f39088 = true;
            size = this.f39085.size();
            this.f39085.m30706();
            arrayDeque = this.f39086.f30873;
            arrayDeque.isEmpty();
            this.f39086.notifyAll();
        }
        if (size > 0) {
            this.f39086.f30870.m49939(size);
        }
        this.f39086.m25934();
    }
}
