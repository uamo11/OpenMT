package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.EnumSet;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: 1A1B */
/* renamed from: l.ۖ֨᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C2207 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f7246 = 0;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f7247 = C11321.m27961(C2207.class);

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Random f7248 = new Random();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18663 f7249;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2207 f7250;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f7251;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile boolean f7252;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C19141 f7253;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC9263 f7254;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AtomicLong f7255;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private synchronized C19141 m7323() {
        C19141 c19141 = this.f7253;
        if (c19141 != null) {
            return c19141;
        }
        C2207 c2207 = this.f7250;
        if (c2207 == null) {
            return null;
        }
        return c2207.m7323();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private synchronized C19141 m7326() {
        C19141 c19141 = this.f7253;
        if (c19141 != null) {
            c19141.m44198();
            return c19141;
        }
        C2207 c2207 = this.f7250;
        if (c2207 == null) {
            return c19141;
        }
        C19141 m7326 = c2207.m7326();
        this.f7253 = m7326;
        return m7326;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C3618 m7328(C17729 c17729) {
        C23373 m7340 = m7340();
        try {
            if (m7341()) {
                C20552 m51804 = m7340.m51804();
                try {
                    if (m51804.mo19180() || m51804.m47108() == null) {
                        f7247.mo7088("Disconnecting failed tree and session");
                        m7336();
                    }
                    m51804.m19171();
                } finally {
                }
            }
            if (!m7341()) {
                C3618 m7329 = m7329(c17729, c17729.m41526());
                if (m7340 != null) {
                    m7340.m51813();
                }
                return m7329;
            }
            f7247.mo7101("Already connected");
            C3618 c3618 = new C3618(c17729, this);
            if (m7340 != null) {
                m7340.m51813();
            }
            return c3618;
        } finally {
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m7336() {
        C23373 m7340 = m7340();
        if (m7340 == null) {
            if (m7340 != null) {
                m7340.m51813();
            }
            return;
        }
        try {
            C20552 m51804 = m7340.m51804();
            try {
                synchronized (m51804) {
                    C19141 m7323 = m7323();
                    if (m7323 != null) {
                        try {
                            m7323.m44201(true, true);
                            this.f7253 = null;
                            this.f7251 = false;
                        } catch (Throwable th) {
                            this.f7253 = null;
                            this.f7251 = false;
                            throw th;
                        }
                    } else {
                        this.f7250.m7336();
                    }
                }
                m51804.m19171();
                m7340.m51813();
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m7341() {
        boolean z;
        C19141 m7323 = m7323();
        if (m7323 != null) {
            z = m7323.m44202();
        }
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized void m7322(C19141 c19141) {
        C19141 m7326 = m7326();
        if (m7326 == c19141) {
            if (m7326 != null) {
                m7326.m44194();
            }
            return;
        }
        try {
            boolean z = this.f7251;
            InterfaceC2148 interfaceC2148 = f7247;
            interfaceC2148.mo7088("Switching tree");
            interfaceC2148.mo7088("Acquired tree on switch " + c19141);
            c19141.m44198();
            this.f7251 = true;
            this.f7253 = c19141;
            if (m7326 != null && z) {
                m7326.m44194();
            }
            if (this.f7250 != null && this.f7252) {
                interfaceC2148.mo7088("Releasing delegate");
                this.f7252 = false;
                this.f7250.m7334();
            }
            if (m7326 != null) {
                m7326.m44194();
            }
        } finally {
        }
    }

    public C2207(InterfaceC18663 interfaceC18663) {
        this.f7255 = new AtomicLong();
        this.f7249 = interfaceC18663;
        this.f7250 = null;
    }

    public C2207(C2207 c2207) {
        this.f7255 = new AtomicLong();
        this.f7249 = c2207.f7249;
        this.f7250 = c2207;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C2207 m7324(C2207 c2207) {
        c2207.f7249.mo27540().getClass();
        return new C2207(c2207);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1023 m7338() {
        return this.f7249.mo27540();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7332() {
        long incrementAndGet = this.f7255.incrementAndGet();
        InterfaceC2148 interfaceC2148 = f7247;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("Acquire tree connection " + incrementAndGet + " " + this);
        }
        if (incrementAndGet == 1) {
            synchronized (this) {
                C19141 m7326 = m7326();
                if (m7326 != null) {
                    try {
                        if (!this.f7251) {
                            if (interfaceC2148.mo7086()) {
                                interfaceC2148.mo7088("Acquire tree on first usage " + m7326);
                            }
                            m7326.m44198();
                            this.f7251 = true;
                        }
                    } finally {
                    }
                }
                if (m7326 != null) {
                    m7326.m44194();
                }
                if (this.f7250 != null && !this.f7252) {
                    interfaceC2148.mo7088("Acquire delegate on first usage");
                    this.f7250.m7332();
                    this.f7252 = true;
                }
            }
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m7334() {
        long decrementAndGet = this.f7255.decrementAndGet();
        InterfaceC2148 interfaceC2148 = f7247;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("Release tree connection " + decrementAndGet + " " + this);
        }
        if (decrementAndGet != 0) {
            if (decrementAndGet >= 0) {
                return;
            }
            interfaceC2148.mo7080("Usage count dropped below zero " + this);
            throw new C13017("Usage count dropped below zero");
        }
        synchronized (this) {
            C19141 m7326 = m7326();
            try {
                if (this.f7251 && m7326 != null) {
                    if (interfaceC2148.mo7086()) {
                        interfaceC2148.mo7088("Tree connection no longer in use, release tree " + m7326);
                    }
                    this.f7251 = false;
                    m7326.m44194();
                }
                if (m7326 != null) {
                    m7326.m44194();
                }
                if (this.f7250 != null && this.f7252) {
                    this.f7252 = false;
                    this.f7250.m7334();
                }
            } finally {
            }
        }
        Object obj = this.f7254;
        if (obj != null) {
            synchronized (this) {
                try {
                    interfaceC2148.mo7088("Disconnecting exclusive transport");
                    this.f7254 = null;
                    this.f7253 = null;
                    this.f7251 = false;
                    ((AbstractRunnableC7146) obj).m19171();
                    ((AbstractRunnableC7146) obj).m19169(false, false);
                } catch (Exception e) {
                    f7247.mo7091("Failed to close exclusive transport", (Throwable) e);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0 A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.InterfaceC1543 m7327(l.C17729 r19, l.InterfaceC7578 r20, l.InterfaceC1543 r21, l.EnumC0214... r22) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2207.m7327(l.ᩳ֨᩵, l.۟ܺ᩵, l.֫ۖ᩵, l.֡ۚ᩵[]):l.֫ۖ᩵");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC1543 m7320(C17729 c17729, InterfaceC7578 interfaceC7578, InterfaceC1543 interfaceC1543, EnumSet enumSet) {
        for (int i = 10; i > 0; i--) {
            if (interfaceC7578 instanceof InterfaceC16359) {
                m7331(c17729, (InterfaceC16359) interfaceC7578);
            }
            try {
                C19141 m7326 = m7326();
                try {
                    if (m7326 == null) {
                        throw new C19369("Failed to get tree connection");
                    }
                    InterfaceC1543 m44196 = m7326.m44196(interfaceC7578, interfaceC1543, enumSet);
                    m7326.m44194();
                    return m44196;
                } finally {
                }
            } catch (C7125 e) {
                ((C8599) e.m19143()).mo22338();
                interfaceC7578.reset();
                f7247.mo7097("send0", e);
            }
        }
        throw new C19369("Loop in DFS referrals");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3618 m7335(C17729 c17729) {
        try {
            return m7328(c17729);
        } catch (UnknownHostException e) {
            throw new C3037("Failed to connect to server", e);
        } catch (C3037 e2) {
            throw e2;
        } catch (IOException e3) {
            throw new C3037("Failed to connect to server", e3);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C3618 m7329(C17729 c17729, String str) {
        return m7330(c17729, str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00d9 A[Catch: all -> 0x01c6, TryCatch #6 {, blocks: (B:4:0x0009, B:132:0x0069, B:9:0x00aa, B:10:0x00ad, B:12:0x00b9, B:14:0x00bf, B:17:0x00cc, B:18:0x00d0, B:23:0x00f3, B:27:0x010b, B:42:0x0170, B:50:0x01b1, B:52:0x01ba, B:56:0x01c5, B:102:0x01af, B:108:0x01ac, B:113:0x00d9, B:177:0x00a6, B:176:0x00a3, B:171:0x009d, B:115:0x0010, B:117:0x0018, B:118:0x0027, B:120:0x0035, B:131:0x0066, B:157:0x008b, B:167:0x009a, B:166:0x0097), top: B:3:0x0009, inners: #2, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f3 A[Catch: all -> 0x01c6, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0009, B:132:0x0069, B:9:0x00aa, B:10:0x00ad, B:12:0x00b9, B:14:0x00bf, B:17:0x00cc, B:18:0x00d0, B:23:0x00f3, B:27:0x010b, B:42:0x0170, B:50:0x01b1, B:52:0x01ba, B:56:0x01c5, B:102:0x01af, B:108:0x01ac, B:113:0x00d9, B:177:0x00a6, B:176:0x00a3, B:171:0x009d, B:115:0x0010, B:117:0x0018, B:118:0x0027, B:120:0x0035, B:131:0x0066, B:157:0x008b, B:167:0x009a, B:166:0x0097), top: B:3:0x0009, inners: #2, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0153 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00aa A[Catch: all -> 0x01c6, TryCatch #6 {, blocks: (B:4:0x0009, B:132:0x0069, B:9:0x00aa, B:10:0x00ad, B:12:0x00b9, B:14:0x00bf, B:17:0x00cc, B:18:0x00d0, B:23:0x00f3, B:27:0x010b, B:42:0x0170, B:50:0x01b1, B:52:0x01ba, B:56:0x01c5, B:102:0x01af, B:108:0x01ac, B:113:0x00d9, B:177:0x00a6, B:176:0x00a3, B:171:0x009d, B:115:0x0010, B:117:0x0018, B:118:0x0027, B:120:0x0035, B:131:0x0066, B:157:0x008b, B:167:0x009a, B:166:0x0097), top: B:3:0x0009, inners: #2, #19 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized l.C3618 m7330(l.C17729 r24, java.lang.String r25, l.InterfaceC15653 r26) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2207.m7330(l.ᩳ֨᩵, java.lang.String, l.ܺۖ᩵):l.ۘ֨᩵");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C19141 m7321(C17729 c17729, String str, String str2, InterfaceC9263 interfaceC9263, C19141 c19141, InterfaceC15653 interfaceC15653) {
        InterfaceC2148 interfaceC2148 = f7247;
        boolean mo7086 = interfaceC2148.mo7086();
        InterfaceC18663 interfaceC18663 = this.f7249;
        if (mo7086 && ((C20552) interfaceC9263).m47119() && !c17729.m41524()) {
            interfaceC18663.mo27540().getClass();
            interfaceC2148.mo7088("Signatures for file enabled but not required " + this);
        }
        if (interfaceC15653 != null) {
            c19141.m44210();
        }
        try {
            if (interfaceC2148.mo7099()) {
                interfaceC2148.mo7101("doConnect: " + str);
            }
            c19141.m44195((InterfaceC7578) null, (InterfaceC1543) null);
            c19141.m44198();
            return c19141;
        } catch (C22087 e) {
            interfaceC2148.mo7081("Authentication failed", (Exception) e);
            C23373 m44207 = c19141.m44207();
            try {
                if (!m44207.m51810().mo16137() && !m44207.m51810().mo16135()) {
                    c17729.m41522().toString();
                    if (!interfaceC18663.mo6360()) {
                        throw e;
                    }
                    interfaceC2148.mo7088("Trying to renew credentials after auth error");
                    C23373 m47102 = ((C20552) interfaceC9263).m47102(interfaceC18663, m44207.m51803(), m44207.m51805());
                    m47102.m51806();
                    try {
                        C19141 m51799 = m47102.m51799(str2);
                        m51799.m44205();
                        if (interfaceC15653 != null) {
                            try {
                                m51799.m44210();
                            } finally {
                            }
                        }
                        m51799.m44195((InterfaceC7578) null, (InterfaceC1543) null);
                        m51799.m44198();
                        m51799.m44194();
                        m47102.m51813();
                        m44207.m51813();
                        return m51799;
                    } finally {
                    }
                }
                try {
                    C23373 m471022 = ((C20552) interfaceC9263).m47102(interfaceC18663.mo6358(), m44207.m51803(), m44207.m51805());
                    m471022.m51806();
                    try {
                        C19141 m517992 = m471022.m51799(str2);
                        m517992.m44205();
                        try {
                            m517992.m44195((InterfaceC7578) null, (InterfaceC1543) null);
                            interfaceC2148.mo7088("Anonymous retry succeeded");
                            m517992.m44198();
                            m517992.m44194();
                            m471022.m51813();
                            m44207.m51813();
                            return m517992;
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            m471022.m51813();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    interfaceC2148.mo7081("Retry also failed", e2);
                    throw e;
                }
            } catch (Throwable th3) {
                try {
                    m44207.m51813();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC5962 m7331(C17729 c17729, InterfaceC16359 interfaceC16359) {
        if (interfaceC16359 instanceof C1584) {
            return c17729;
        }
        for (int i = 0; i < ((C13722) this.f7249.mo27540()).m33008() + 1; i++) {
            try {
                return m7325(c17729, interfaceC16359);
            } catch (C3037 e) {
                if (e.m9291() != -1073741275 && !(e.getCause() instanceof C1708)) {
                    throw e;
                }
                InterfaceC2148 interfaceC2148 = f7247;
                interfaceC2148.mo7081("resolveDfs", (Exception) e);
                if (interfaceC2148.mo7086()) {
                    interfaceC2148.mo7088("Retrying (" + i + ") resolveDfs: " + interfaceC16359);
                }
                interfaceC2148.mo7088("Disconnecting tree on DFS retry");
                m7336();
                try {
                    Thread.sleep(f7248.nextInt(OpenAuthTask.Duplex) + 500);
                } catch (InterruptedException e2) {
                    interfaceC2148.mo7081("resolveDfs", (Exception) e2);
                }
                m7335(c17729).close();
            }
        }
        return c17729;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private InterfaceC5962 m7325(C17729 c17729, InterfaceC16359 interfaceC16359) {
        String str;
        String str2;
        InterfaceC18663 interfaceC18663 = this.f7249;
        C3618 m7335 = m7335(c17729);
        try {
            C23373 m11098 = m7335.m11098();
            try {
                C20552 m51804 = m11098.m51804();
                try {
                    C19141 m7326 = m7326();
                    try {
                        m51804.m47114();
                        String path = interfaceC16359 != null ? interfaceC16359.getPath() : c17729.m41529();
                        if (interfaceC16359 != null) {
                            str = interfaceC16359.mo6641();
                        } else {
                            str = "\\" + c17729.m41527() + '\\' + c17729.m41523() + c17729.m41529();
                        }
                        boolean m44203 = m7326.m44203();
                        InterfaceC2148 interfaceC2148 = f7247;
                        if (m44203 || !m7326.m44209()) {
                            if (!m7326.m44203()) {
                                interfaceC2148.mo7101("Not in DFS");
                                m7326.m44194();
                                m51804.m19171();
                                m11098.m51813();
                                m7335.close();
                                return c17729;
                            }
                            InterfaceC15653 m44211 = m7326.m44211();
                            if (m44211 != null) {
                                if (interfaceC2148.mo7086()) {
                                    interfaceC2148.mo7088(String.format("Need to adjust request path %s (full: %s) -> %s", path, str, m44211));
                                }
                                String m41514 = c17729.m41514(m44211, path);
                                if (interfaceC16359 != null) {
                                    interfaceC16359.mo6630(m41514);
                                }
                                m7326.m44194();
                                m51804.m19171();
                                m11098.m51813();
                                m7335.close();
                                return c17729;
                            }
                            interfaceC2148.mo7088("No tree referral but in DFS");
                        }
                        if (interfaceC16359 != null) {
                            str2 = "Not in DFS";
                            interfaceC16359.mo6631(m11098.m51805(), m11098.m51803(), str);
                        } else {
                            str2 = "Not in DFS";
                        }
                        InterfaceC15653 m32495 = ((C13474) interfaceC18663.mo27541()).m32495(interfaceC18663, c17729.m41527(), c17729.m41523(), c17729.m41529());
                        if (m32495 == null) {
                            if (!m7326.m44203() || (interfaceC16359 instanceof C1584) || (interfaceC16359 instanceof C17106)) {
                                interfaceC2148.mo7101(str2);
                                m7326.m44194();
                                m51804.m19171();
                                m11098.m51813();
                                m7335.close();
                                return c17729;
                            }
                            if (interfaceC2148.mo7086()) {
                                interfaceC2148.mo7088("No referral available for  " + str);
                            }
                            throw new C19369("No referral but in domain DFS " + str);
                        }
                        if (interfaceC2148.mo7086()) {
                            interfaceC2148.mo7088("Resolved " + str + " -> " + m32495);
                        }
                        String m415142 = c17729.m41514(m32495, path);
                        if (interfaceC16359 != null) {
                            interfaceC16359.mo6630(m415142);
                        }
                        if (m7326.m44208().equals(m32495.mo22341())) {
                            m7326.m44194();
                            m51804.m19171();
                            m11098.m51813();
                            m7335.close();
                            return c17729;
                        }
                        InterfaceC15653 interfaceC15653 = m32495;
                        do {
                            if (interfaceC2148.mo7086()) {
                                interfaceC2148.mo7088("Need to switch tree for " + interfaceC15653);
                            }
                            try {
                                C3618 m7330 = m7330(c17729, m11098.m51803(), interfaceC15653);
                                try {
                                    interfaceC2148.mo7088("Switched tree");
                                    m7330.close();
                                    m7326.m44194();
                                    m51804.m19171();
                                    m11098.m51813();
                                    m7335.close();
                                    return c17729;
                                } finally {
                                }
                            } catch (IOException e) {
                                interfaceC2148.mo7081("Failed to connect tree", (Exception) e);
                                interfaceC15653 = interfaceC15653.next();
                            }
                        } while (interfaceC15653 != m32495);
                        throw new C19369("All referral tree connections failed", e);
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long m7339() {
        C19141 m7323 = m7323();
        if (m7323 == null) {
            return -1L;
        }
        return m7323.m44206();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23373 m7340() {
        C19141 m7323 = m7323();
        if (m7323 != null) {
            return m7323.m44207();
        }
        return null;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m7337() {
        C19141 m7326 = m7326();
        try {
            int m44204 = m7326.m44204();
            m7326.m44194();
            return m44204;
        } catch (Throwable th) {
            if (m7326 != null) {
                try {
                    m7326.m44194();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m7333(C2207 c2207) {
        C19141 m7326 = m7326();
        try {
            C19141 m73262 = c2207.m7326();
            boolean z = m7326 == m73262;
            if (m73262 != null) {
                m73262.m44194();
            }
            if (m7326 != null) {
                m7326.m44194();
            }
            return z;
        } catch (Throwable th) {
            if (m7326 != null) {
                try {
                    m7326.m44194();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
