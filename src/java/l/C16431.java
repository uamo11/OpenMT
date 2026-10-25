package l;

import android.net.Uri;
import android.os.Build;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Q8FL */
/* renamed from: l.ܽۚۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16431 implements InterfaceC15097, InterfaceC1677 {

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f50522 = C16293.f50114.m36526(".media");

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f50523 = new AtomicInteger();

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f50524;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C23713 f50525;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile int f50526;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public InterfaceC5982 f50527;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile boolean f50528;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public IOException f50529;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f50530;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C17843 f50533;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC10788 f50534;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 f50535;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final String f50536;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f50537;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f50538;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile int f50539;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f50540 = new AtomicInteger();

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f50531 = new HashMap();

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EnumC7114 f50532 = EnumC7114.UNKNOWN;

    public C16431(ActivityC10227 activityC10227, AbstractC13921 abstractC13921, C17843 c17843, EnumC10788 enumC10788, C23713 c23713) {
        this.f50537 = activityC10227;
        this.f50535 = abstractC13921;
        this.f50533 = c17843;
        this.f50534 = enumC10788;
        this.f50525 = c23713;
        if (abstractC13921 instanceof C2499) {
            this.f50530 = null;
            this.f50536 = "local";
            return;
        }
        MessageDigest m34526 = C14460.m34526();
        abstractC13921.mo7639(m34526);
        String substring = C14460.m34531(m34526.digest()).substring(0, 8);
        this.f50536 = substring;
        AbstractC15440 m36526 = f50522.m36526(substring);
        if (abstractC13921 instanceof AbstractC3163) {
            this.f50530 = m36526;
            return;
        }
        this.f50530 = m36526.m36526(Integer.toHexString(f50523.incrementAndGet()) + "-" + Long.toHexString(System.nanoTime()));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 m38743() {
        return this.f50535;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38735(InterfaceC5982 interfaceC5982) {
        this.f50527 = interfaceC5982;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38739() {
        int i = this.f50539;
        this.f50539 = this.f50540.incrementAndGet();
        m38707(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m38721(int i) {
        return (i == 0 || this.f50528 || i != this.f50539) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38707(int i) {
        if (i == 0 || this.f50526 != i) {
            return;
        }
        this.f50526 = 0;
        InterfaceC5982 interfaceC5982 = this.f50527;
        if (interfaceC5982 != null) {
            C4925.m14315(new RunnableC13486(1, this, interfaceC5982));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38712(C16431 c16431, InterfaceC5982 interfaceC5982) {
        if (c16431.f50526 == 0) {
            interfaceC5982.accept(-2);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m38719(final C16431 c16431, final int i) {
        if (!c16431.m38721(i) || c16431.f50526 == i) {
            return;
        }
        c16431.f50526 = i;
        final InterfaceC5982 interfaceC5982 = c16431.f50527;
        if (interfaceC5982 != null) {
            C4925.m14315(new Runnable() { // from class: l.᩹֡ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C16431.m38710(C16431.this, i, interfaceC5982);
                }
            });
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38710(C16431 c16431, int i, InterfaceC5982 interfaceC5982) {
        if (c16431.f50526 == i) {
            interfaceC5982.accept(-1);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38709(final C16431 c16431, final int i, final int i2) {
        final InterfaceC5982 interfaceC5982;
        if (c16431.m38721(i) && (interfaceC5982 = c16431.f50527) != null) {
            C4925.m14315(new Runnable() { // from class: l.᩸֡ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C16431.m38711(C16431.this, i, interfaceC5982, i2);
                }
            });
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38711(C16431 c16431, int i, InterfaceC5982 interfaceC5982, int i2) {
        if (c16431.m38721(i)) {
            interfaceC5982.accept(i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fe  */
    /* JADX WARN: Type inference failed for: r18v0, types: [l.ܽۚۜ] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [l.֫ۚۜ] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [l.ܰܺܳ] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.ۗܺ᩷] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m38741(l.InterfaceC17889 r19) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16431.m38741(l.ᩳۜܳ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0060, code lost:
    
        if (r2.f5678 != 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0062, code lost:
    
        r8.f50531.remove(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0067, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        throw r3;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C1615 m38702(l.AbstractC15440 r9, l.InterfaceC17889 r10, java.lang.String r11) {
        /*
            r8 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            boolean r2 = r8.f50528
            if (r2 != 0) goto Lbd
            java.util.HashMap r2 = r8.f50531
            java.lang.Object r2 = r2.get(r11)
            l.֫ۚۜ r2 = (l.C1615) r2
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L93
            boolean r5 = r2.f5679
            if (r5 == 0) goto L3c
            int r1 = r2.f5678
            int r1 = r1 + r4
            r2.f5678 = r1
            r8.wait()     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L27
            int r1 = r2.f5678
            int r1 = r1 - r4
            r2.f5678 = r1
            r1 = 1
            goto L2
        L25:
            r9 = move-exception
            goto L36
        L27:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L25
            r9.interrupt()     // Catch: java.lang.Throwable -> L25
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L25
            java.lang.String r10 = "Interrupted while waiting for media cache"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L25
            throw r9     // Catch: java.lang.Throwable -> L25
        L36:
            int r10 = r2.f5678
            int r10 = r10 - r4
            r2.f5678 = r10
            throw r9
        L3c:
            boolean r4 = r2.f5677
            if (r4 == 0) goto L4d
            boolean r1 = r8.m38716(r10, r9)
            if (r1 == 0) goto L47
            return r3
        L47:
            java.util.HashMap r1 = r8.f50531
            r1.remove(r11)
            goto L1
        L4d:
            java.io.IOException r3 = r2.f5676
            if (r3 == 0) goto L68
            if (r1 != 0) goto L5e
            int r1 = r2.f5678
            if (r1 <= 0) goto L58
            goto L5e
        L58:
            java.util.HashMap r1 = r8.f50531
            r1.remove(r11)
            goto L1
        L5e:
            int r9 = r2.f5678
            if (r9 != 0) goto L67
            java.util.HashMap r9 = r8.f50531
            r9.remove(r11)
        L67:
            throw r3
        L68:
            boolean r3 = r2.f5675
            if (r3 == 0) goto L8c
            if (r1 != 0) goto L79
            int r1 = r2.f5678
            if (r1 <= 0) goto L73
            goto L79
        L73:
            java.util.HashMap r1 = r8.f50531
            r1.remove(r11)
            goto L1
        L79:
            int r9 = r2.f5678
            if (r9 != 0) goto L82
            java.util.HashMap r9 = r8.f50531
            r9.remove(r11)
        L82:
            l.ۘ֡ۜ r9 = new l.ۘ֡ۜ
            java.lang.String r10 = r10.getName()
            r9.<init>(r10)
            throw r9
        L8c:
            java.util.HashMap r1 = r8.f50531
            r1.remove(r11)
            goto L1
        L93:
            long r1 = r10.getSize()
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto Lb0
            boolean r9 = r8.m38716(r10, r9)
            if (r9 == 0) goto Lb0
            l.֫ۚۜ r9 = new l.֫ۚۜ
            r9.<init>(r0)
            r9.f5677 = r4
            java.util.HashMap r10 = r8.f50531
            r10.put(r11, r9)
            return r3
        Lb0:
            l.֫ۚۜ r9 = new l.֫ۚۜ
            r9.<init>(r0)
            r9.f5679 = r4
            java.util.HashMap r10 = r8.f50531
            r10.put(r11, r9)
            return r9
        Lbd:
            l.ۘ֡ۜ r9 = new l.ۘ֡ۜ
            java.lang.String r10 = r10.getName()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16431.m38702(l.ܶ᩵ܿ, l.ᩳۜܳ, java.lang.String):l.֫ۚۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38708(String str, C1615 c1615, IOException iOException, boolean z) {
        synchronized (this) {
            if (((C1615) this.f50531.get(str)) == c1615) {
                c1615.f5679 = false;
                if (!this.f50528 && !z && !(iOException instanceof C3586)) {
                    if (iOException != null) {
                        c1615.f5676 = iOException;
                        c1615.f5675 = false;
                        c1615.f5677 = false;
                    } else {
                        c1615.f5677 = true;
                        c1615.f5676 = null;
                        c1615.f5675 = false;
                    }
                    notifyAll();
                }
                c1615.f5675 = true;
                c1615.f5676 = null;
                c1615.f5677 = false;
                notifyAll();
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m38727(C16431 c16431, InterfaceC17889 interfaceC17889) {
        if (c16431.f50530 == null) {
            return false;
        }
        AbstractC15440 m36526 = c16431.f50530.m36526(m38724(interfaceC17889));
        synchronized (c16431) {
            if (m36526.mo23120()) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC13921 abstractC13921 = c16431.f50535;
                if ((abstractC13921 instanceof AbstractC3163) && ((AbstractC3163) abstractC13921).mo9689()) {
                    return true;
                }
            }
            try {
                InputStream mo7636 = c16431.f50535.mo7636(c16431.f50537, interfaceC17889);
                try {
                    if (mo7636 == null) {
                        throw new C2175(interfaceC17889.getName());
                    }
                    m36526.m36494(mo7636, interfaceC17889.getSize(), (InterfaceC5627) null);
                    mo7636.close();
                    return false;
                } finally {
                }
            } catch (IOException e) {
                m36526.mo27929();
                throw e;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m38723(C16431 c16431, InterfaceC17889 interfaceC17889) {
        return c16431.m38717(interfaceC17889, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m38717(InterfaceC17889 interfaceC17889, boolean z) {
        EnumC7114 enumC7114;
        boolean z2 = false;
        if (z || Build.VERSION.SDK_INT >= 23) {
            AbstractC13921 abstractC13921 = this.f50535;
            if (abstractC13921 instanceof AbstractC3163) {
                AbstractC3163 abstractC3163 = (AbstractC3163) abstractC13921;
                synchronized (this) {
                    while (!this.f50528) {
                        EnumC7114 enumC71142 = this.f50532;
                        if (enumC71142 == EnumC7114.RANGE_SUPPORTED) {
                            return true;
                        }
                        if (enumC71142 == EnumC7114.RANGE_UNSUPPORTED) {
                            return false;
                        }
                        if (enumC71142 == EnumC7114.ERROR) {
                            IOException iOException = this.f50529;
                            if (iOException == null) {
                                throw new IOException("Network range support probe failed");
                            }
                            throw iOException;
                        }
                        EnumC7114 enumC71143 = EnumC7114.PROBING;
                        if (enumC71142 == enumC71143) {
                            try {
                                wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException("Interrupted while probing network range support");
                            }
                        } else {
                            this.f50532 = enumC71143;
                            try {
                                z2 = abstractC3163.mo9689();
                                e = null;
                            } catch (IOException e) {
                                e = e;
                            }
                            synchronized (this) {
                                if (this.f50528) {
                                    this.f50532 = EnumC7114.UNKNOWN;
                                    this.f50529 = null;
                                    notifyAll();
                                    throw new C3586(interfaceC17889.getName());
                                }
                                this.f50529 = e;
                                if (e != null) {
                                    enumC7114 = EnumC7114.ERROR;
                                } else {
                                    enumC7114 = z2 ? EnumC7114.RANGE_SUPPORTED : EnumC7114.RANGE_UNSUPPORTED;
                                }
                                this.f50532 = enumC7114;
                                notifyAll();
                            }
                            if (e == null) {
                                return z2;
                            }
                            throw e;
                        }
                    }
                    throw new C3586(interfaceC17889.getName());
                }
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38713(C16431 c16431, InterfaceC17889 interfaceC17889) {
        if ((c16431.f50535 instanceof AbstractC3163) && !c16431.m38717(interfaceC17889, true)) {
            throw new C22510("Network storage does not support HLS range requests");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IOException m38701(C16431 c16431, IOException iOException) {
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if (th instanceof C6343) {
                synchronized (c16431) {
                    c16431.f50532 = EnumC7114.RANGE_UNSUPPORTED;
                    c16431.f50529 = null;
                    c16431.notifyAll();
                }
                return new C22510("Network storage does not support HLS range requests", iOException);
            }
        }
        return iOException;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m38724(InterfaceC17889 interfaceC17889) {
        MessageDigest m34526 = C14460.m34526();
        C14460.m34528(m34526, interfaceC17889.getPath());
        m34526.update((byte) 58);
        m34526.update(String.valueOf(interfaceC17889.getSize()).getBytes());
        m34526.update((byte) 58);
        m34526.update(String.valueOf(interfaceC17889.getTime()).getBytes());
        return C14460.m34531(m34526.digest()).substring(0, 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c0, code lost:
    
        if (r11.f50532 == l.EnumC7114.RANGE_SUPPORTED) goto L53;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C12053 m38733(l.InterfaceC17889 r12) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16431.m38733(l.ᩳۜܳ):l.۫֡ۜ");
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private C12053 m38730(InterfaceC17889 interfaceC17889) {
        String m38724 = m38724(interfaceC17889);
        AbstractC15440 m36526 = this.f50530.m36526(m38724);
        synchronized (this) {
            if (this.f50528) {
                return C12053.f36043;
            }
            C1615 c1615 = (C1615) this.f50531.get(m38724);
            if (c1615 != null) {
                if (c1615.f5679) {
                    return C12053.f36043;
                }
                if (c1615.f5677) {
                    if (m38716(interfaceC17889, m36526)) {
                        return C12053.m29428(m36526, C12053.m29430(interfaceC17889.getPath()));
                    }
                    this.f50531.remove(m38724);
                }
            }
            if (interfaceC17889.getSize() > 0 && m38716(interfaceC17889, m36526)) {
                C1615 c16152 = new C1615(0);
                c16152.f5677 = true;
                this.f50531.put(m38724, c16152);
                return C12053.m29428(m36526, C12053.m29430(interfaceC17889.getPath()));
            }
            return C12053.f36043;
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m38742() {
        synchronized (this) {
            if (this.f50528) {
                return;
            }
            this.f50528 = true;
            int i = this.f50539;
            this.f50539 = this.f50540.incrementAndGet();
            m38707(i);
            for (C1615 c1615 : this.f50531.values()) {
                if (c1615.f5679) {
                    c1615.f5679 = false;
                    c1615.f5675 = true;
                    c1615.f5676 = null;
                    c1615.f5677 = false;
                }
            }
            notifyAll();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m38740() {
        AbstractC15440 abstractC15440;
        synchronized (this) {
            if (!this.f50524 && (abstractC15440 = this.f50530) != null && !(this.f50535 instanceof AbstractC3163)) {
                this.f50524 = true;
                abstractC15440.mo23552();
            }
        }
    }

    @Override // l.InterfaceC15097
    /* renamed from: ֫ */
    public final InterfaceC21449 mo6247() {
        return this.f50534 == EnumC10788.HLS_DIRECT ? new C2881(this) : new C9937(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m38731(C3104 c3104, C23713 c23713) {
        return C20892.m47725(this.f50535, m38737(c3104.f9711), c23713.m52286());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC7505 m38732(Uri uri) {
        InterfaceC17889 m38737 = m38737(uri);
        AbstractC15440 abstractC15440 = this.f50530;
        if (abstractC15440 == null) {
            return new C4292(m38737.mo24433());
        }
        String m38724 = m38724(m38737);
        AbstractC15440 m36526 = abstractC15440.m36526(m38724);
        if (m38716(m38737, m36526)) {
            m38726(m38737, m38724);
            return new C4292(m36526);
        }
        if (this.f50535 instanceof AbstractC3163) {
            try {
                if (m38717(m38737, false)) {
                    return new C11348(m38705(m38737, m38724, false));
                }
            } catch (IOException unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17889 m38737(Uri uri) {
        C11197 m41814;
        C17843 c17843 = this.f50533;
        c17843.getClass();
        InterfaceC17889 m41812 = (uri == null || (m41814 = c17843.m41814(uri.getPath())) == null) ? null : C17843.m41812(m41814);
        if (m41812 != null) {
            return m41812;
        }
        String path = uri != null ? uri.getPath() : null;
        if (path == null) {
            throw new IOException("Media path is null");
        }
        InterfaceC17889 mo7638 = this.f50535.mo7638(path);
        if (mo7638 == null || !((C15688) mo7638).mo36969()) {
            throw new IOException("Media item not found: ".concat(path));
        }
        return mo7638;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23411 m38738(InterfaceC17889 interfaceC17889) {
        AbstractC15440 abstractC15440 = this.f50530;
        if (abstractC15440 == null) {
            return interfaceC17889.mo24433().m36513("r");
        }
        String m38724 = m38724(interfaceC17889);
        AbstractC15440 m36526 = abstractC15440.m36526(m38724);
        if (!m38716(interfaceC17889, m36526)) {
            if (m38717(interfaceC17889, false)) {
                return C0127.m1200(m38705(interfaceC17889, m38724, true).m33791());
            }
            return m36526.m36513("r");
        }
        m38726(interfaceC17889, m38724);
        return m36526.m36513("r");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m38706(C16431 c16431, String str) {
        return c16431.f50530.m36526(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m38716(l.InterfaceC17889 r9, l.AbstractC15440 r10) {
        /*
            r8 = this;
            boolean r0 = r10.mo23120()
            r1 = 0
            if (r0 == 0) goto L65
            long r2 = r9.getSize()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1e
            long r2 = r10.mo23127()
            long r4 = r9.getSize()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1e
            goto L65
        L1e:
            l.ܰܺܳ r0 = r8.f50535
            boolean r0 = r0 instanceof l.AbstractC3163
            if (r0 == 0) goto L64
            long r2 = r9.getSize()
            boolean r9 = r10.mo23120()
            if (r9 == 0) goto L61
            long r4 = r10.mo23127()
            r6 = 12
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L39
            goto L61
        L39:
            java.lang.String r9 = "r"
            l.᩻ۖܽ r9 = r10.m36513(r9)     // Catch: java.io.IOException -> L61
            int r10 = r9.readInt()     // Catch: java.lang.Throwable -> L57
            r0 = 358818181(0x15632185, float:4.5868727E-26)
            if (r10 != r0) goto L52
            long r4 = r9.readLong()     // Catch: java.lang.Throwable -> L57
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 != 0) goto L52
            r10 = 1
            goto L53
        L52:
            r10 = 0
        L53:
            r9.close()     // Catch: java.io.IOException -> L61
            goto L62
        L57:
            r10 = move-exception
            r9.close()     // Catch: java.lang.Throwable -> L5c
            goto L60
        L5c:
            r9 = move-exception
            r10.addSuppressed(r9)     // Catch: java.io.IOException -> L61
        L60:
            throw r10     // Catch: java.io.IOException -> L61
        L61:
            r10 = 0
        L62:
            if (r10 != 0) goto L65
        L64:
            r1 = 1
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16431.m38716(l.ᩳۜܳ, l.ܶ᩵ܿ):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ܶ֡ۜ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14159 m38705(final InterfaceC17889 interfaceC17889, String str, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC13921 abstractC13921 = this.f50535;
            if (abstractC13921 instanceof AbstractC3163) {
                final AbstractC3163 abstractC3163 = (AbstractC3163) abstractC13921;
                synchronized (this) {
                    if (this.f50528) {
                        throw new C3586(interfaceC17889.getName());
                    }
                    if (this.f50532 != EnumC7114.RANGE_SUPPORTED) {
                        IOException iOException = this.f50529;
                        if (iOException == null) {
                            throw new IOException("Network range cache is not ready");
                        }
                        throw iOException;
                    }
                    Object mo36970 = interfaceC17889.mo36970(R.id.MT_Protector_res_0x7f0a03e0);
                    if (mo36970 instanceof WeakReference) {
                        Object obj = ((WeakReference) mo36970).get();
                        if (obj instanceof C14159) {
                            C14159 c14159 = (C14159) obj;
                            if (c14159.m33793()) {
                                if (z) {
                                    this.f50538 = str;
                                }
                                return c14159;
                            }
                            interfaceC17889.mo36975(R.id.MT_Protector_res_0x7f0a03e0, null);
                        }
                    }
                    C14159 c141592 = new C14159(new InterfaceC23332() { // from class: l.ܶ֡ۜ
                        @Override // l.InterfaceC23332
                        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
                        public final InputStream mo35309(long j) {
                            return AbstractC3163.this.mo9681(j, interfaceC17889.getPath());
                        }
                    }, interfaceC17889.getName(), interfaceC17889.getSize(), this.f50530.m36526(str + ".page"));
                    interfaceC17889.mo36975(R.id.MT_Protector_res_0x7f0a03e0, new WeakReference(c141592));
                    if (z) {
                        this.f50538 = str;
                    }
                    return c141592;
                }
            }
        }
        throw new IOException("Network range cache is not available");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m38744(InterfaceC17889 interfaceC17889) {
        String m38724 = m38724(interfaceC17889);
        synchronized (this) {
            if (m38724.equals(this.f50538)) {
                Object mo36970 = interfaceC17889.mo36970(R.id.MT_Protector_res_0x7f0a03e0);
                if (mo36970 instanceof WeakReference) {
                    Object obj = ((WeakReference) mo36970).get();
                    if (obj instanceof C14159) {
                        C14159 c14159 = (C14159) obj;
                        try {
                            c14159.m33789();
                        } catch (IllegalStateException unused) {
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m38726(InterfaceC17889 interfaceC17889, String str) {
        synchronized (this) {
            if (str.equals(this.f50538)) {
                this.f50538 = null;
            }
            interfaceC17889.mo36975(R.id.MT_Protector_res_0x7f0a03e0, null);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13463 m38734(InterfaceC17889 interfaceC17889, String str) {
        if (Build.VERSION.SDK_INT < 23) {
            throw new IOException("Network preview data source is not available");
        }
        C23713 c23713 = this.f50525;
        if (c23713 != null && c23713.m52289()) {
            return new C13463(new C6282(m38718(interfaceC17889)));
        }
        C14159 m38705 = m38705(interfaceC17889, str, false);
        try {
            return new C13463(m38705.m33787());
        } catch (RuntimeException e) {
            m38705.close();
            throw e;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7505 m38736(InterfaceC17889 interfaceC17889, String str) {
        C23713 c23713 = this.f50525;
        if (c23713 != null && c23713.m52289()) {
            return m38718(interfaceC17889);
        }
        return new C11348(m38705(interfaceC17889, str, false));
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private C4871 m38718(InterfaceC17889 interfaceC17889) {
        C11881 c11881;
        C23713 c23713 = this.f50525;
        if (c23713 == null || !c23713.m52289() || interfaceC17889.getSize() < 0) {
            throw new IOException("Unified preview cache is not available");
        }
        String m47725 = C20892.m47725(this.f50535, interfaceC17889, c23713.m52286());
        boolean z = false;
        boolean z2 = c23713.m52288() != null && c23713.m52288().m38148(m47725, 0L, interfaceC17889.getSize());
        C14601 c14601 = new C14601(this);
        if (!z2 && this.f50532 == EnumC7114.RANGE_SUPPORTED) {
            z = true;
        }
        C17075 c17075 = new C17075(c23713, new C9315(c23713, c14601, new C7037(m47725)), m47725, z);
        C11197 m41814 = this.f50533.m41814(interfaceC17889.getPath());
        Uri uri = (m41814 == null || (c11881 = m41814.f33612) == null) ? null : c11881.f35426;
        if (uri == null) {
            throw new IOException("Media URI is missing");
        }
        return new C4871(c17075, uri, m47725, interfaceC17889.getSize());
    }
}
