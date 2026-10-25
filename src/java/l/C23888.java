package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: Y6SG */
/* renamed from: l.᩻ᩴᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23888 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14715 f77235;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C6417 f77236;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C23721 f77237;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Executor f77238;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C14715 f77239;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f77240;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C1143 f77241;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C13576 f77242;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f77243;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f77244;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f77245;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile IOException f77246;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final UUID f77247;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final FutureC3575 f77249 = new FutureC3575();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f77248 = -1;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 m52636() {
        return this.f77245;
    }

    public C23888(C23721 c23721, InterfaceC20758 interfaceC20758, C1143 c1143, Executor executor) {
        this.f77237 = c23721;
        this.f77247 = c23721.m52352();
        C11003.requireNonNull(interfaceC20758);
        this.f77245 = interfaceC20758;
        C11003.requireNonNull(c1143);
        this.f77241 = c1143;
        C11003.requireNonNull(executor);
        this.f77238 = executor;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m52631(C13304 c13304) {
        return m52624(c13304, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m52633(C13304 c13304) {
        return m52624(c13304, true);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final IOException m52635() {
        return this.f77246;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52634() {
        synchronized (this) {
            if (!m52629()) {
                throw new IllegalStateException("Attachment collection requires a drained queue");
            }
        }
        try {
            C11481 m21144 = C7869.m21144(this.f77247, this.f77237.m52348());
            if (m21144 != null) {
                InterfaceC20758 interfaceC20758 = this.f77245;
                UUID uuid = this.f77247;
                Object[] objArr = {m21144};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                C11003.requireNonNull(obj);
                arrayList.add(obj);
                C11481.m28302(interfaceC20758, uuid, C20195.unmodifiableList(arrayList));
            }
            this.f77246 = null;
        } catch (IOException e) {
            this.f77246 = e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m52632(C23721 c23721) {
        return this.f77237 == c23721;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private FutureC3575 m52624(C13304 c13304, boolean z) {
        boolean z2;
        Throwable th;
        boolean z3;
        C14715 c14715;
        Throwable illegalStateException;
        C14715 c147152;
        C11003.requireNonNull(c13304);
        C14715 c147153 = new C14715(c13304, z);
        synchronized (this) {
            C14715 c147154 = this.f77235;
            z2 = true;
            th = null;
            z3 = false;
            if ((c147154 != null && c147154.f44934 == c13304) || ((c14715 = this.f77239) != null && c14715.f44934 == c13304)) {
                th = new IllegalStateException("Checkpoint is already queued");
                c147152 = null;
            } else {
                if (this.f77244) {
                    illegalStateException = new IllegalStateException("Checkpoint queue is closed");
                } else if (!this.f77247.equals(c13304.m32273())) {
                    illegalStateException = new IllegalArgumentException("Checkpoint belongs to another session");
                } else if (c13304.m32272() <= this.f77248) {
                    illegalStateException = new IllegalArgumentException("Checkpoint is out of order");
                } else {
                    this.f77248 = c13304.m32272();
                    if (this.f77235 == null) {
                        this.f77235 = c147153;
                        z2 = false;
                        z3 = true;
                        c147152 = null;
                    } else {
                        c147152 = this.f77239;
                        this.f77239 = c147153;
                        if (c147152 != null) {
                            this.f77243++;
                        }
                        z2 = false;
                    }
                }
                th = illegalStateException;
                c147152 = null;
                z2 = false;
            }
        }
        if (th != null) {
            if (!z2) {
                c13304.close();
            }
            c147153.f44935.m10914(th);
        }
        if (c147152 != null) {
            m52625(c147152);
            c147152.f44935.m10914((Throwable) new CancellationException("Checkpoint was superseded or discarded"));
        }
        if (z3) {
            m52628(c147153);
        }
        return c147153.f44935.m10921((InterfaceC21423) new C3435(3));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m52628(final C14715 c14715) {
        synchronized (this) {
            if (!this.f77244 && this.f77235 == c14715) {
                try {
                    this.f77238.execute(new Runnable() { // from class: l.ᩳᩴᩳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C23888.m52627(C23888.this, c14715);
                        }
                    });
                } catch (RuntimeException e) {
                    m52626(c14715, e);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m52627(l.C23888 r11, l.C14715 r12) {
        /*
            r0 = r11
            monitor-enter(r0)
            boolean r1 = r11.f77244     // Catch: java.lang.Throwable -> Lc4
            if (r1 != 0) goto Lc2
            l.ܳᩴᩳ r1 = r11.f77235     // Catch: java.lang.Throwable -> Lc4
            if (r1 == r12) goto Lc
            goto Lc2
        Lc:
            r1 = 1
            r12.f44937 = r1     // Catch: java.lang.Throwable -> Lc4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc4
            r1 = 0
            l.۬ᩴᩳ r0 = r12.f44934     // Catch: java.lang.Throwable -> L8e
            l.᩷۠ᩴ r2 = r11.f77245     // Catch: java.lang.Throwable -> L8e
            l.֨۬ᩳ r3 = r11.f77241     // Catch: java.lang.Throwable -> L8e
            long r2 = r0.m32270(r2, r3)     // Catch: java.lang.Throwable -> L8e
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L8e
            l.ܰۘᩳ r4 = r11.f77242     // Catch: java.lang.Throwable -> L8c
            if (r4 == 0) goto L4b
            l.᩻۬ᩳ r4 = r11.f77237     // Catch: java.lang.Throwable -> L8c
            l.ۗ᩻᩵ r4 = r4.m52354(r2)     // Catch: java.lang.Throwable -> L8c
            r4.m10930()     // Catch: java.lang.Throwable -> L8c
            l.ܰۘᩳ r5 = r11.f77242     // Catch: java.lang.Throwable -> L8c
            int r6 = r11.f77240     // Catch: java.lang.Throwable -> L8c
            l.۬ᩴᩳ r4 = r12.f44934     // Catch: java.lang.Throwable -> L8c
            android.os.Bundle r7 = r4.m32276()     // Catch: java.lang.Throwable -> L8c
            l.۬ᩴᩳ r4 = r12.f44934     // Catch: java.lang.Throwable -> L8c
            boolean r8 = r4.m32275()     // Catch: java.lang.Throwable -> L8c
            l.۬ᩴᩳ r4 = r12.f44934     // Catch: java.lang.Throwable -> L8c
            int r9 = r4.m32279()     // Catch: java.lang.Throwable -> L8c
            l.۬ᩴᩳ r4 = r12.f44934     // Catch: java.lang.Throwable -> L8c
            java.lang.String r10 = r4.m32274()     // Catch: java.lang.Throwable -> L8c
            r5.m32650(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8c
        L4b:
            boolean r4 = r12.f44936     // Catch: java.lang.Throwable -> L8c
            if (r4 == 0) goto L84
            l.᩻۬ᩳ r4 = r11.f77237     // Catch: java.lang.Throwable -> L8c
            l.ۗ᩻᩵ r2 = r4.m52354(r2)     // Catch: java.lang.Throwable -> L8c
            r2.m10930()     // Catch: java.lang.Throwable -> L8c
            l.۬ᩴᩳ r2 = r12.f44934     // Catch: java.lang.Throwable -> L8c
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.io.IOException -> L81 java.lang.Throwable -> L8c
            r3.<init>()     // Catch: java.io.IOException -> L81 java.lang.Throwable -> L8c
            l.ۨۙᩳ r2 = r2.m32271()     // Catch: java.io.IOException -> L81 java.lang.Throwable -> L8c
            r3.add(r2)     // Catch: java.io.IOException -> L81 java.lang.Throwable -> L8c
            l.᩻۬ᩳ r2 = r11.f77237     // Catch: java.io.IOException -> L81 java.lang.Throwable -> L8c
            byte[] r2 = r2.m52348()     // Catch: java.io.IOException -> L81 java.lang.Throwable -> L8c
            java.util.UUID r4 = r11.f77247     // Catch: java.io.IOException -> L81 java.lang.Throwable -> L8c
            l.ۨۙᩳ r2 = l.C7869.m21144(r4, r2)     // Catch: java.io.IOException -> L81 java.lang.Throwable -> L8c
            if (r2 == 0) goto L77
            r3.add(r2)     // Catch: java.io.IOException -> L81 java.lang.Throwable -> L8c
        L77:
            l.᩷۠ᩴ r2 = r11.f77245     // Catch: java.io.IOException -> L81 java.lang.Throwable -> L8c
            java.util.UUID r4 = r11.f77247     // Catch: java.io.IOException -> L81 java.lang.Throwable -> L8c
            l.C11481.m28302(r2, r4, r3)     // Catch: java.io.IOException -> L81 java.lang.Throwable -> L8c
            r11.f77246 = r1     // Catch: java.io.IOException -> L81 java.lang.Throwable -> L8c
            goto L84
        L81:
            r2 = move-exception
            r11.f77246 = r2     // Catch: java.lang.Throwable -> L8c
        L84:
            l.۬ᩴᩳ r2 = r12.f44934
            r2.close()
            r2 = r0
            r3 = r1
            goto L98
        L8c:
            r2 = move-exception
            goto L91
        L8e:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L91:
            l.۬ᩴᩳ r3 = r12.f44934
            r3.close()
            r3 = r2
            r2 = r0
        L98:
            r0 = r11
            monitor-enter(r0)
            l.ܳᩴᩳ r4 = r11.f77239     // Catch: java.lang.Throwable -> Lbf
            r11.f77239 = r1     // Catch: java.lang.Throwable -> Lbf
            r11.f77235 = r4     // Catch: java.lang.Throwable -> Lbf
            boolean r5 = r11.m52629()     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbf
            if (r5 == 0) goto Lac
            l.ۗ᩻᩵ r0 = r11.f77249
            r0.m10912(r1)
        Lac:
            if (r3 != 0) goto Lb4
            l.ۗ᩻᩵ r12 = r12.f44935
            r12.m10912(r2)
            goto Lb9
        Lb4:
            l.ۗ᩻᩵ r12 = r12.f44935
            r12.m10914(r3)
        Lb9:
            if (r4 == 0) goto Lbe
            r11.m52628(r4)
        Lbe:
            return
        Lbf:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbf
            throw r11
        Lc2:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc4
            return
        Lc4:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc4
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23888.m52627(l.᩻ᩴᩳ, l.ܳᩴᩳ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52626(C14715 c14715, RuntimeException runtimeException) {
        synchronized (this) {
            C14715 c147152 = this.f77235;
            if (c147152 != c14715) {
                return;
            }
            C14715 c147153 = this.f77239;
            this.f77239 = null;
            this.f77235 = null;
            this.f77243 = 1 + (c147153 == null ? 0 : 1) + this.f77243;
            m52625(c147152);
            if (c147153 != null) {
                m52625(c147153);
            }
            c147152.f44935.m10914((Throwable) runtimeException);
            if (c147153 != null) {
                c147153.f44935.m10914((Throwable) runtimeException);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m52630() {
        C14715 c14715;
        C14715 c147152;
        C14715 c147153;
        boolean m52629;
        synchronized (this) {
            this.f77244 = true;
            c14715 = this.f77235;
            c147152 = this.f77239;
            this.f77239 = null;
            if (c14715 == null || c14715.f44937) {
                c147153 = c14715;
                c14715 = null;
            } else {
                this.f77235 = null;
                c147153 = null;
            }
            this.f77243 = (c14715 == null ? 0 : 1) + (c147152 == null ? 0 : 1) + this.f77243;
        }
        if (c14715 != null) {
            m52625(c14715);
        }
        if (c147152 != null) {
            m52625(c147152);
        }
        if (c147153 != null) {
            c147153.f44934.close();
        }
        synchronized (this) {
            m52629 = m52629();
        }
        if (m52629) {
            this.f77249.m10912((Object) null);
        }
        if (c14715 != null) {
            this.f77249.m10907((Runnable) new RunnableC17538(0, c14715));
        }
        if (c147152 != null) {
            this.f77249.m10907((Runnable) new RunnableC17538(0, c147152));
        }
        return this.f77249.m10921((InterfaceC21423) new C5368());
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m52629() {
        return this.f77244 && this.f77235 == null && this.f77239 == null && this.f77243 == 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52625(C14715 c14715) {
        boolean m52629;
        c14715.f44934.close();
        synchronized (this) {
            this.f77243--;
            m52629 = m52629();
        }
        if (m52629) {
            this.f77249.m10912((Object) null);
        }
    }
}
