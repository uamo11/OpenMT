package l;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import net.engio.mbassy.listener.Handler;

/* compiled from: 84DG */
/* renamed from: l.᩻ۧۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23650 extends C13503 implements Closeable, InterfaceC8730 {

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f76606 = C11321.m27961(C23650.class);

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final C14477 f76607 = new C14477(new C19438(), new C2504(), new C17320(), new C18567());

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C22239 f76608;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C6717 f76609;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4332 f76610;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C1942 f76611;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C5470 f76612;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C9540 f76613;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC20123 f76614;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC4059 f76615;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f76616;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C15888 f76617;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21534 f76618;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C1278 f76619;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C21971 f76620;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C17464 f76621;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C22239 f76622;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52157(InterfaceC5386 interfaceC5386) {
        this.f76611.m13513((AbstractC7859) interfaceC5386);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21971 m52163() {
        return this.f76620;
    }

    public C23650(C4332 c4332, C21971 c21971, C17464 c17464, C5470 c5470) {
        C22239 c22239 = new C22239();
        this.f76608 = c22239;
        this.f76622 = new C22239();
        C9540 c9540 = new C9540();
        this.f76613 = c9540;
        C7277 c7277 = new C7277();
        this.f76616 = new ReentrantLock();
        this.f76610 = c4332;
        this.f76620 = c21971;
        C1814 m13024 = c4332.m13024();
        C21336 c21336 = new C21336(new C13739(), this, f76607);
        m13024.getClass();
        this.f76619 = new C1278(c4332.m13037(), c4332.m13026(), c21336);
        this.f76621 = c17464;
        this.f76612 = c5470;
        c17464.m40833(this);
        this.f76618 = new C21534();
        if (c4332.m13025()) {
            this.f76614 = new C3895(c4332.m13038());
        } else {
            f76606.mo7104("Signing is disabled for this connection.");
            this.f76614 = new C2732();
        }
        this.f76617 = new C15888(c4332.m13038());
        C1942 c1942 = new C1942(c22239, this.f76617);
        C10245 c10245 = new C10245();
        C11656 c11656 = new C11656(c9540);
        C7422 c7422 = new C7422(c22239, this.f76614);
        C6011 c6011 = new C6011(this.f76618);
        C12361 c12361 = new C12361(c9540);
        C13771 c13771 = new C13771(c7277, c9540);
        C13066 c13066 = new C13066();
        c13066.m13512(new C3189());
        c13771.m13512(c13066);
        c12361.m13512(c13771);
        c6011.m13512(c12361);
        c7422.m13512(c6011);
        c11656.m13512(c7422);
        c10245.m13512(c11656);
        c1942.m13512(c10245);
        this.f76611 = c1942;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m52158(false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52158(boolean z) {
        if (z || m32532()) {
            C17464 c17464 = this.f76621;
            C1278 c1278 = this.f76619;
            InterfaceC2148 interfaceC2148 = f76606;
            if (!z) {
                try {
                    Iterator it = this.f76608.m49947().iterator();
                    while (it.hasNext()) {
                        C15346 c15346 = (C15346) it.next();
                        try {
                            c15346.m36384();
                        } catch (IOException e) {
                            interfaceC2148.mo7098("Exception while closing session {}", Long.valueOf(c15346.m36383()), e);
                        }
                    }
                } finally {
                    c1278.m4339();
                    interfaceC2148.mo7087(m52160(), "Closed connection to {}");
                    c17464.m40834(new C11115(this.f76609.m18290().m2254(), this.f76609.m18290().m2252()));
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15346 m52154(C2921 c2921) {
        return new C15182(this, this.f76610, new C18006(this)).m35909(c2921);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16614 m52155(C16614 c16614) {
        C10847 m52153 = m52153(c16614, false);
        long m13023 = this.f76610.m13023();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC16490 interfaceC16490 = C2380.f7586;
        return (C16614) C17902.m41878(m13023, m52153);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #1 {all -> 0x00ca, blocks: (B:5:0x000f, B:8:0x0025, B:10:0x002d, B:12:0x0042, B:14:0x004d, B:17:0x0060, B:24:0x00c9, B:29:0x003e, B:16:0x005c), top: B:4:0x000f, inners: #0 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C10847 m52153(l.C16614 r14, boolean r15) {
        /*
            r13 = this;
            l.᩸ۧۘ r0 = r13.f76618
            l.ܽۨۖ r1 = r14.mo7973()
            boolean r1 = r1 instanceof l.C8148
            if (r1 != 0) goto Lcf
            java.util.concurrent.locks.ReentrantLock r1 = r13.f76616
            r1.lock()
            int r2 = r0.m48692()     // Catch: java.lang.Throwable -> Lca
            int r3 = r14.mo7975()     // Catch: java.lang.Throwable -> Lca
            r4 = 1
            int r3 = r3 - r4
            r5 = 65536(0x10000, float:9.1835E-41)
            int r3 = r3 / r5
            int r3 = java.lang.Math.abs(r3)     // Catch: java.lang.Throwable -> Lca
            int r3 = r3 + r4
            l.֫᩻֨ r5 = l.C23650.f76606
            if (r3 <= r4) goto L37
            l.ۜۧۘ r6 = r13.f76609     // Catch: java.lang.Throwable -> Lca
            boolean r6 = r6.m18286()     // Catch: java.lang.Throwable -> Lca
            if (r6 != 0) goto L37
            java.lang.String r3 = "Connection to {} does not support multi-credit requests."
            java.lang.String r6 = r13.m52160()     // Catch: java.lang.Throwable -> Lca
            r5.mo7095(r6, r3)     // Catch: java.lang.Throwable -> Lca
            goto L41
        L37:
            if (r3 >= r2) goto L3a
            goto L42
        L3a:
            if (r3 <= r4) goto L41
            if (r2 <= r4) goto L41
            int r3 = r2 + (-1)
            goto L42
        L41:
            r3 = 1
        L42:
            l.ۚ֫ۘ r6 = r14.mo3028()     // Catch: java.lang.Throwable -> Lca
            l.᩻ۨۖ r6 = (l.C23670) r6     // Catch: java.lang.Throwable -> Lca
            r6.m52196(r3)     // Catch: java.lang.Throwable -> Lca
            if (r2 != 0) goto L5c
            java.lang.String r6 = "There are no credits left to send {}, will block until there are more credits available."
            l.ۚ֫ۘ r7 = r14.mo3028()     // Catch: java.lang.Throwable -> Lca
            l.᩻ۨۖ r7 = (l.C23670) r7     // Catch: java.lang.Throwable -> Lca
            l.᩺ۛۖ r7 = r7.m52217()     // Catch: java.lang.Throwable -> Lca
            r5.mo7103(r7, r6)     // Catch: java.lang.Throwable -> Lca
        L5c:
            long[] r0 = r0.m48694(r3)     // Catch: java.lang.Throwable -> Lc8
            l.ۚ֫ۘ r6 = r14.mo3028()     // Catch: java.lang.Throwable -> Lca
            l.᩻ۨۖ r6 = (l.C23670) r6     // Catch: java.lang.Throwable -> Lca
            r7 = 0
            r8 = r0[r7]     // Catch: java.lang.Throwable -> Lca
            r6.m52205(r8)     // Catch: java.lang.Throwable -> Lca
            l.ۚ֫ۘ r0 = r14.mo3028()     // Catch: java.lang.Throwable -> Lca
            l.᩻ۨۖ r0 = (l.C23670) r0     // Catch: java.lang.Throwable -> Lca
            int r6 = 512 - r2
            int r6 = r6 - r3
            int r6 = java.lang.Math.max(r6, r3)     // Catch: java.lang.Throwable -> Lca
            r0.m52204(r6)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r0 = "Granted {} (out of {}) credits to {}"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lca
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lca
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lca
            r6[r7] = r3     // Catch: java.lang.Throwable -> Lca
            r6[r4] = r2     // Catch: java.lang.Throwable -> Lca
            r2 = 2
            r6[r2] = r14     // Catch: java.lang.Throwable -> Lca
            r5.mo7092(r0, r6)     // Catch: java.lang.Throwable -> Lca
            r1.unlock()
            l.ᩴۧۘ r0 = new l.ᩴۧۘ
            l.ܽۨۖ r8 = r14.mo7973()
            l.ۚ֫ۘ r1 = r14.mo3028()
            l.᩻ۨۖ r1 = (l.C23670) r1
            long r9 = r1.m52201()
            java.util.UUID r11 = java.util.UUID.randomUUID()
            r7 = r0
            r12 = r15
            r7.<init>(r8, r9, r11, r12)
            l.ۢۧۘ r15 = r13.f76613
            r15.m24413(r0)
            l.ܿۧۘ r15 = new l.ܿۧۘ
            l.ۚ֫ۘ r1 = r14.mo3028()
            l.᩻ۨۖ r1 = (l.C23670) r1
            long r1 = r1.m52203()
            r15.<init>(r13, r0, r1)
            l.ۧ۟ۖ r15 = r0.m43334(r15)
            goto Ld0
        Lc8:
            r14 = move-exception
            throw r14     // Catch: java.lang.Throwable -> Lca
        Lca:
            r14 = move-exception
            r1.unlock()
            throw r14
        Lcf:
            r15 = 0
        Ld0:
            l.֨ᩳۘ r0 = r13.f76619
            r0.m4341(r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23650.m52153(l.ܽۨۖ, boolean):l.ۧ۟ۖ");
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20829 m52161() {
        return this.f76609.m18285();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52156(C2380 c2380) {
        this.f76613.m24412(c2380);
        try {
            m52158(false);
        } catch (Exception e) {
            f76606.mo7082("{} while closing connection on error, ignoring: {}", e.getClass().getSimpleName(), e.getMessage());
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m52160() {
        return this.f76609.m18290().m2254();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52162(int i, String str) {
        C1278 c1278 = this.f76619;
        if (c1278.m4342()) {
            throw new IllegalStateException(C20094.m46315("This connection is already connected to ", m52160()));
        }
        c1278.m4340(new InetSocketAddress(str, i));
        C4332 c4332 = this.f76610;
        this.f76609 = new C6717(c4332.m13029(), str, i, c4332);
        new C5306(this, c4332, this.f76609).m15225();
        this.f76617.m37662(this.f76609);
        this.f76615 = new C19582();
        f76606.mo7087(m52160(), "Successfully connected to: {}");
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m52166() {
        return this.f76619.m4342();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C6717 m52167() {
        return this.f76609;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m52164() {
        return this.f76618.m48692();
    }

    @Handler
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52146(C23814 c23814) {
        this.f76608.m49950(Long.valueOf(c23814.m34931()));
        f76606.mo7100(Long.valueOf(c23814.m34931()), "Session << {} >> logged off");
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C22239 m52165() {
        return this.f76608;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C22239 m52159() {
        return this.f76622;
    }
}
