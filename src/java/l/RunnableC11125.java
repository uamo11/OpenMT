package l;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: 35OM */
/* renamed from: l.ۧܽܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC11125 implements Runnable {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final int f33383;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7785 f33384;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f33385;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f33386;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f33387;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18180 f33388;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f33389;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17474 f33390;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f33391;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C18743 f33392;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f33393;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public RunnableC1644 f33394;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f33395;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f33396;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f33397;

    public RunnableC11125(C17474 c17474, int i, C18180 c18180, int i2, int i3) {
        AtomicInteger atomicInteger;
        this.f33390 = c17474;
        this.f33384 = c17474.f10015;
        this.f33387 = c17474.m9781();
        C12392 c12392 = c17474.f10021;
        this.f33391 = c12392.m30396();
        atomicInteger = c17474.f53403;
        this.f33396 = atomicInteger.get();
        this.f33383 = c12392.m30542();
        this.f33386 = c12392.mo25898();
        this.f33392 = c12392.m30544();
        this.f33385 = i;
        this.f33388 = c18180;
        this.f33393 = i2;
        this.f33397 = i3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27605() {
        RunnableC11125 runnableC11125;
        AtomicInteger atomicInteger;
        if (this.f33395) {
            return true;
        }
        runnableC11125 = this.f33390.f53406;
        if (runnableC11125 != this || this.f33390.f10026) {
            return true;
        }
        int i = this.f33396;
        atomicInteger = this.f33390.f53403;
        if (i != atomicInteger.get()) {
            return true;
        }
        C17474 c17474 = this.f33390;
        if (c17474.f10021.f37258 != c17474) {
            return true;
        }
        InterfaceC7785 interfaceC7785 = c17474.f10015;
        InterfaceC7785 interfaceC77852 = this.f33384;
        return (interfaceC7785 == interfaceC77852 && interfaceC77852.mo26548() == this.f33387) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x016d, code lost:
    
        if (m27605() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0175, code lost:
    
        if (r3 != r5.size()) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0177, code lost:
    
        r12.f33390.m40842(r5.size(), l.C6891.f21286, r4);
        r3 = l.C17474.m40859(r4, r12.f33393);
        l.C4925.m14315(new l.RunnableC1952(r12, r7, r4, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01e8, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01eb, code lost:
    
        r12.f33384.setReadOnly(false);
        r0 = new l.RunnableC23516(2, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0191, code lost:
    
        r6 = r12.f33390;
        r8 = r5.size();
        r9 = l.C6891.f21286;
        r6.m40842(r8, r9, r4);
        r6 = l.C17474.m40859(r4, r12.f33393);
        l.C4925.m14315(new l.RunnableC1952(r12, r0, r4, r6));
        r3 = l.C6891.m18662(new l.C11666(r2), r5.subList(r3, r5.size()), new l.C22954(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01c0, code lost:
    
        if (r3 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c6, code lost:
    
        if (m27605() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c9, code lost:
    
        r6 = new l.C20736(r4);
        r6.m47354(r3);
        r12.f33390.m40842(r5.size(), r9, r6);
        r3 = l.C17474.m40859(r6, r12.f33393);
        l.C4925.m14315(new l.RunnableC1952(r12, r7, r6, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01f7, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01fa, code lost:
    
        r12.f33384.setReadOnly(false);
        r0 = new l.RunnableC23516(2, r12);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.RunnableC11125.run():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27604(RunnableC11125 runnableC11125, Throwable th) {
        RunnableC11125 runnableC111252;
        C20736 c20736;
        C20736 c207362;
        AtomicInteger atomicInteger;
        try {
            runnableC111252 = runnableC11125.f33390.f53406;
            if (runnableC111252 == runnableC11125) {
                if (runnableC11125.f33389 && !runnableC11125.f33390.f10026) {
                    C17474 c17474 = runnableC11125.f33390;
                    if (c17474.f10021.f37258 == c17474) {
                        InterfaceC7785 interfaceC7785 = c17474.f10015;
                        InterfaceC7785 interfaceC77852 = runnableC11125.f33384;
                        if (interfaceC7785 == interfaceC77852 && interfaceC77852.mo26548() == runnableC11125.f33387) {
                            int i = runnableC11125.f33396;
                            atomicInteger = runnableC11125.f33390.f53403;
                            if (i == atomicInteger.get()) {
                            }
                        }
                    }
                }
                if (th != null && !runnableC11125.m27605()) {
                    runnableC11125.f33390.f53396 = th;
                }
                runnableC11125.f33390.f53406 = null;
                C17474 c174742 = runnableC11125.f33390;
                C20736 c207363 = c174742.f9998;
                c20736 = c174742.f53397;
                if (c207363 != c20736) {
                    C17474 c174743 = runnableC11125.f33390;
                    c207362 = c174743.f53397;
                    c174743.f9998 = c207362;
                }
                runnableC11125.f33390.f53401 = null;
                if (!runnableC11125.f33390.f10016) {
                    runnableC11125.f33390.f10019 = false;
                }
                runnableC11125.f33390.f10021.invalidate();
                C17474 c174744 = runnableC11125.f33390;
                c174744.f10021.m30500(c174744);
            }
        } finally {
            runnableC11125.f33394.run();
        }
    }
}
