package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: E9W1 */
/* renamed from: l.᩵֨᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19141 implements InterfaceC22895 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f60324 = C11321.m27961(C19141.class);

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static AtomicLong f60325 = new AtomicLong();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f60326;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f60329;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile long f60330;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C23373 f60332;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f60334;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f60336;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public InterfaceC15653 f60337;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f60335 = new AtomicInteger();

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public volatile int f60328 = -1;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile String f60327 = "?????";

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f60333 = new AtomicLong(0);

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f60331 = new AtomicBoolean(true);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22895 m44205() {
        if (C19141.class.isAssignableFrom(C19141.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    public C19141(C23373 c23373, String str) {
        c23373.m51800();
        this.f60332 = c23373;
        this.f60329 = str.toUpperCase();
        this.f60326 = this.f60327;
        c23373.m51809().getClass();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m44200(String str, String str2) {
        if (this.f60329.equalsIgnoreCase(str)) {
            return str2 == null || str2.startsWith("??") || this.f60327.equalsIgnoreCase(str2);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19141)) {
            return false;
        }
        C19141 c19141 = (C19141) obj;
        return m44200(c19141.f60329, c19141.f60327);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44198() {
        long incrementAndGet = this.f60333.incrementAndGet();
        InterfaceC2148 interfaceC2148 = f60324;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("Acquire tree " + incrementAndGet + " " + this);
        }
        if (incrementAndGet == 1) {
            synchronized (this) {
                if (this.f60331.compareAndSet(false, true)) {
                    interfaceC2148.mo7088("Reacquire session");
                    this.f60332.m51800();
                }
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m44194();
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m44194() {
        long decrementAndGet = this.f60333.decrementAndGet();
        InterfaceC2148 interfaceC2148 = f60324;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("Release tree " + decrementAndGet + " " + this);
        }
        if (decrementAndGet == 0) {
            synchronized (this) {
                interfaceC2148.mo7088("Usage dropped to zero, release session");
                if (this.f60331.compareAndSet(true, false)) {
                    this.f60332.m51813();
                }
            }
            return;
        }
        if (decrementAndGet >= 0) {
            return;
        }
        interfaceC2148.mo7080("Usage count dropped below zero " + this);
        throw new C13017("Usage count dropped below zero");
    }

    public final void finalize() {
        if (!m44202() || this.f60333.get() == 0) {
            return;
        }
        f60324.mo7104("Tree was not properly released");
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m44202() {
        return this.f60328 != -1 && this.f60332.m51811() && this.f60335.get() == 2;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m44204() {
        String str = this.f60327;
        if ("LPT1:".equals(str)) {
            return 32;
        }
        return "COMM".equals(str) ? 64 : 8;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m44208() {
        return this.f60329;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m44210() {
        this.f60334 = true;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m44203() {
        return this.f60334;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44199(InterfaceC15653 interfaceC15653) {
        this.f60337 = interfaceC15653;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC15653 m44211() {
        return this.f60337;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m44209() {
        if (this.f60335.get() == 2) {
            return this.f60336;
        }
        C20552 m51804 = this.f60332.m51804();
        try {
            boolean mo10545 = m51804.m47117().mo10545();
            m51804.m19171();
            return mo10545;
        } catch (Throwable th) {
            try {
                m51804.m19171();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [l.ۨ᩵᩵] */
    /* JADX WARN: Type inference failed for: r19v0, types: [l.۟ܺ᩵] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1543 m44195(InterfaceC7578 interfaceC7578, InterfaceC1543 interfaceC1543) {
        C2996 c2996;
        C4407 c4407;
        C23373 c23373 = this.f60332;
        c23373.m51800();
        try {
            C20552 m51804 = c23373.m51804();
            try {
                synchronized (m51804) {
                    m51804.m47114();
                    C4407 c44072 = null;
                    if (m44190(m51804) == 2) {
                        m51804.m19171();
                        c23373.m51813();
                        return null;
                    }
                    int andSet = this.f60335.getAndSet(1);
                    if (andSet == 1) {
                        if (m44190(m51804) != 2) {
                            throw new C3037("Tree disconnected while waiting for connection");
                        }
                        m51804.m19171();
                        c23373.m51813();
                        return null;
                    }
                    if (andSet == 2) {
                        m51804.m19171();
                        c23373.m51813();
                        return null;
                    }
                    InterfaceC2148 interfaceC2148 = f60324;
                    if (interfaceC2148.mo7086()) {
                        interfaceC2148.mo7088("Connection state was " + andSet);
                    }
                    try {
                        try {
                            String m51803 = c23373.m51803();
                            if (m51803 == null) {
                                throw new C3037("Transport disconnected while waiting for connection");
                            }
                            InterfaceC20594 m47117 = m51804.m47117();
                            String str = "\\\\" + m51803 + '\\' + this.f60329;
                            String str2 = this.f60326;
                            if (interfaceC2148.mo7086()) {
                                interfaceC2148.mo7088("treeConnect: unc=" + str + ",service=" + str2);
                            }
                            if (m51804.m47112()) {
                                ?? c11917 = new C11917(str, c23373.m51809());
                                if (interfaceC7578 != 0) {
                                    c11917.mo10438((AbstractC3429) interfaceC7578);
                                }
                                c4407 = c11917;
                                c2996 = null;
                            } else {
                                c2996 = new C2996(c23373.m51809(), (AbstractC11422) interfaceC1543);
                                c4407 = new C4407(c23373.getContext(), ((C8640) m47117).m22410(), str, str2, (AbstractC11422) interfaceC7578);
                            }
                            try {
                                InterfaceC9305 interfaceC9305 = (InterfaceC9305) c23373.m51796(c4407, c2996, Collections.EMPTY_SET);
                                m44193(m51804, c23373, interfaceC9305);
                                if (interfaceC1543 != null && interfaceC1543.mo28213()) {
                                    m51804.m19171();
                                    c23373.m51813();
                                    return interfaceC1543;
                                }
                                if (!m51804.m47112()) {
                                    m51804.m19171();
                                    c23373.m51813();
                                    return null;
                                }
                                InterfaceC1543 mo5290 = interfaceC9305.mo5290();
                                m51804.m19171();
                                c23373.m51813();
                                return mo5290;
                            } catch (IOException e) {
                                e = e;
                                c44072 = c4407;
                                if (c44072 != null && c44072.mo5429() != null) {
                                    InterfaceC9305 interfaceC93052 = (InterfaceC9305) c44072.mo5429();
                                    if (interfaceC93052.mo28213() && !interfaceC93052.mo28209() && interfaceC93052.getErrorCode() == 0) {
                                        if (!m51804.mo19180()) {
                                            m44193(m51804, c23373, interfaceC93052);
                                        }
                                        throw e;
                                    }
                                }
                                try {
                                    f60324.mo7081("Disconnect tree on treeConnectFailure", (Exception) e);
                                    m44201(true, true);
                                    throw e;
                                } finally {
                                    this.f60335.set(0);
                                }
                            }
                        } catch (IOException e2) {
                            e = e2;
                        }
                    } finally {
                        m51804.notifyAll();
                    }
                }
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1543 m44196(InterfaceC7578 interfaceC7578, InterfaceC1543 interfaceC1543, Set set) {
        C23373 c23373 = this.f60332;
        c23373.m51800();
        try {
            C20552 m51804 = c23373.m51804();
            if (interfaceC1543 != null) {
                try {
                    interfaceC1543.mo28216();
                } finally {
                }
            }
            String str = null;
            InterfaceC1543 m44195 = ((interfaceC7578 instanceof C12873) || (interfaceC7578 instanceof C14032)) ? null : m44195(interfaceC7578, interfaceC1543);
            if (interfaceC7578 != null && (m44195 == null || !m44195.mo28213())) {
                interfaceC7578.mo20323(this.f60328);
                if (!m51804.m47112()) {
                    AbstractC11422 abstractC11422 = (AbstractC11422) interfaceC7578;
                    str = this.f60327;
                    if (str == null) {
                        throw new C3037("Service is null in state " + this.f60335.get());
                    }
                    m44191(abstractC11422, str);
                }
                if (this.f60336 && !"IPC".equals(str) && !"IPC$".equals(this.f60329) && (interfaceC7578 instanceof InterfaceC16359)) {
                    InterfaceC16359 interfaceC16359 = (InterfaceC16359) interfaceC7578;
                    if (interfaceC16359.getPath() != null && interfaceC16359.getPath().length() > 0) {
                        InterfaceC2148 interfaceC2148 = f60324;
                        if (interfaceC2148.mo7086()) {
                            interfaceC2148.mo7088("Setting DFS request path from " + interfaceC16359.getPath() + " to " + interfaceC16359.mo6641());
                        }
                        interfaceC16359.mo6635();
                        interfaceC16359.mo6630(interfaceC16359.mo6641());
                    }
                }
                try {
                    InterfaceC1543 m51796 = c23373.m51796(interfaceC7578, interfaceC1543, set);
                    m51804.m19171();
                    c23373.m51813();
                    return m51796;
                } catch (C3037 e) {
                    if (e.m9291() == -1073741623) {
                        f60324.mo7088("Disconnect tree on NT_STATUS_NETWORK_NAME_DELETED");
                        m44201(true, true);
                    }
                    throw e;
                }
            }
            m51804.m19171();
            c23373.m51813();
            return m44195;
        } catch (Throwable th) {
            try {
                c23373.m51813();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m44201(boolean z, boolean z2) {
        boolean z3;
        C23373 c23373 = this.f60332;
        c23373.m51800();
        try {
            C20552 m51804 = c23373.m51804();
            try {
                synchronized (m51804) {
                    if (this.f60335.getAndSet(3) == 2) {
                        long j = this.f60333.get();
                        if ((!z2 || j == 1) && (z2 || j <= 0)) {
                            z3 = false;
                        } else {
                            f60324.mo7104("Disconnected tree while still in use " + this);
                            c23373.m51809().getClass();
                            z3 = true;
                        }
                        if (!z && this.f60328 != -1) {
                            try {
                                if (!m51804.m47112()) {
                                    m44196(new C12873(c23373.m51809()), new C7188(c23373.m51809()), Collections.EMPTY_SET);
                                } else {
                                    m44197(new C14032(c23373.m51809(), 4), new EnumC0214[0]);
                                }
                            } catch (C19369 e) {
                                f60324.mo7091("Tree disconnect failed", (Throwable) e);
                            }
                        }
                    } else {
                        z3 = false;
                    }
                    this.f60336 = false;
                    this.f60334 = false;
                    this.f60335.set(0);
                    m51804.notifyAll();
                }
                m51804.m19171();
                c23373.m51813();
                return z3;
            } finally {
            }
        } catch (Throwable th) {
            try {
                c23373.m51813();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23373 m44207() {
        C23373 c23373 = this.f60332;
        c23373.m51800();
        return c23373;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m44206() {
        return this.f60330;
    }

    public final int hashCode() {
        return (this.f60327.hashCode() * 7) + this.f60329.hashCode();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1543 m44197(AbstractC13306 abstractC13306, EnumC0214... enumC0214Arr) {
        return m44196(abstractC13306, abstractC13306.mo5429(), enumC0214Arr.length > 0 ? EnumSet.copyOf((Collection) Arrays.asList(enumC0214Arr)) : EnumSet.noneOf(EnumC0214.class));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44191(AbstractC11422 abstractC11422, String str) {
        int mo10463;
        if ("A:".equals(str) || (mo10463 = abstractC11422.mo10463()) == -94 || mo10463 == 4) {
            return;
        }
        if (mo10463 != 37 && mo10463 != 50) {
            if (mo10463 != 113) {
                switch (mo10463) {
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case 46:
                    case 47:
                        return;
                    default:
                        throw new C3037("Invalid operation for " + str + " service" + abstractC11422);
                }
            }
            return;
        }
        int m42528 = ((AbstractC18246) abstractC11422).m42528() & 255;
        if (m42528 == -41 || m42528 == 0 || m42528 == 16 || m42528 == 35 || m42528 == 38 || m42528 == 104 || m42528 == 83 || m42528 == 84) {
            return;
        }
        throw new C3037("Invalid operation for " + str + " service: " + abstractC11422);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m44193(C20552 c20552, C23373 c23373, InterfaceC9305 interfaceC9305) {
        if (!interfaceC9305.mo9134()) {
            throw new C3037("TreeID is invalid");
        }
        this.f60328 = interfaceC9305.m23892();
        String mo9135 = interfaceC9305.mo9135();
        if (mo9135 == null && !c20552.m47112()) {
            throw new C3037("Service is NULL");
        }
        if (((C13722) c20552.getContext().mo27540()).m32984() && (("IPC$".equals(this.f60329) || "IPC".equals(mo9135)) && !c23373.m51810().mo16137() && c23373.m51807() == null)) {
            throw new C3037("IPC signing is enforced, but no signing is available");
        }
        this.f60327 = mo9135;
        this.f60336 = interfaceC9305.mo9136();
        this.f60330 = f60325.incrementAndGet();
        this.f60335.set(2);
        try {
            m44192(c20552, c23373);
        } catch (C19369 e) {
            try {
                c20552.m19178();
            } catch (IOException e2) {
                f60324.mo7083("Failed to disconnect transport", (Throwable) e2);
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m44192(C20552 c20552, C23373 c23373) {
        boolean m47112 = c20552.m47112();
        InterfaceC2148 interfaceC2148 = f60324;
        if (!m47112 || c20552.m47115() == null || !((C13722) c23373.m51809()).m33012()) {
            interfaceC2148.mo7088("Secure negotiation does not apply");
            return;
        }
        C3450 c3450 = (C3450) c20552.m47117();
        if (c3450.mo10552().m48659(EnumC21485.SMB311)) {
            interfaceC2148.mo7088("Secure negotiation does not apply, is SMB3.1");
            return;
        }
        C4861 c4861 = new C4861(c23373.m51809(), c20552.m47099(c3450));
        interfaceC2148.mo7088("Sending VALIDATE_NEGOTIATE_INFO");
        C2745 c2745 = new C2745(c23373.m51809(), 1311236);
        c2745.m8490();
        c2745.m8488(new C5567(c4861.m14177(), c4861.m14180(), (short) c4861.m14178(), c4861.m14181()));
        try {
            C1333 c1333 = (C1333) ((C4156) m44197(c2745, EnumC0214.NO_RETRY)).m12557(C1333.class);
            if (c3450.m10542() != c1333.m4664() || c3450.m10549() != c1333.m4665() || c3450.m10541() != c1333.m4666() || !Arrays.equals(c3450.m10551(), c1333.m4667())) {
                interfaceC2148.mo7088("Secure negotiation failure");
                throw new C19369("Mismatched attributes validating negotiate info");
            }
            interfaceC2148.mo7088("Secure negotiation OK");
        } catch (C7976 e) {
            throw new C0920("Signature error during negotiate validation", e);
        } catch (C3037 e2) {
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7088(String.format("VALIDATE_NEGOTIATE_INFO response code 0x%x", Integer.valueOf(e2.m9291())));
            }
            interfaceC2148.mo7097("VALIDATE_NEGOTIATE_INFO returned error", e2);
            if ((((C4156) c2745.mo5429()).mo28213() && ((C4156) c2745.mo5429()).mo28214()) || e2.m9291() == -1073741790) {
                throw new C0920("Signature error during negotiate validation", e2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        return r0;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m44190(l.C20552 r3) {
        /*
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicInteger r0 = r2.f60335
            int r0 = r0.get()
            if (r0 == 0) goto L2d
            r1 = 2
            if (r0 != r1) goto Lc
            goto L2d
        Lc:
            r1 = 3
            if (r0 == r1) goto L25
            l.֫᩻֨ r0 = l.C19141.f60324     // Catch: java.lang.InterruptedException -> L1a
            java.lang.String r1 = "Waiting for transport"
            r0.mo7088(r1)     // Catch: java.lang.InterruptedException -> L1a
            r3.wait()     // Catch: java.lang.InterruptedException -> L1a
            goto L0
        L1a:
            r3 = move-exception
            l.ۗۚ᩵ r0 = new l.ۗۚ᩵
            java.lang.String r1 = r3.getMessage()
            r0.<init>(r1, r3)
            throw r0
        L25:
            l.ۗۚ᩵ r3 = new l.ۗۚ᩵
            java.lang.String r0 = "Disconnecting during tree connect"
            r3.<init>(r0)
            throw r3
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19141.m44190(l.᩷֨᩵):int");
    }

    public final String toString() {
        return "SmbTree[share=" + this.f60329 + ",service=" + this.f60327 + ",tid=" + this.f60328 + ",inDfs=" + this.f60336 + ",inDomainDfs=" + this.f60334 + ",connectionState=" + this.f60335 + ",usage=" + this.f60333.get() + "]";
    }
}
