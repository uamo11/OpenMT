package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: F70U */
/* renamed from: l.᩺ܰܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23034 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15587 f74125;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f74126 = new ArrayList();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f74127;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f74128;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f74129;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f74130;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f74131;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final String f74124 = UUID.randomUUID().toString();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final HashMap f74123 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m51172(String str) {
        synchronized (C23034.class) {
            AbstractC15440 m51193 = m51193();
            if (m51193.m36533()) {
                throw new IOException("Hex session root directory is unsafe");
            }
            if (m51193.mo23120()) {
                m51190(m51193);
                for (AbstractC15440 abstractC15440 : m51193.mo23549(true)) {
                    if (m51188(abstractC15440.getName()) && abstractC15440.mo23113() && !abstractC15440.m36533()) {
                        C23034 c23034 = new C23034(abstractC15440, abstractC15440.getName());
                        if (!abstractC15440.getName().equals(str) || !c23034.m51196()) {
                            try {
                                c23034.m51197();
                            } catch (IOException unused) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static synchronized C23034 m51185() {
        C23034 c23034;
        synchronized (C23034.class) {
            AbstractC15440 m51193 = m51193();
            if (m51193.m36533()) {
                throw new IOException("Hex session root directory is unsafe");
            }
            m51193.m36508();
            m51190(m51193);
            for (int i = 0; i < 100; i++) {
                String uuid = UUID.randomUUID().toString();
                AbstractC15440 m36526 = m51193.m36526(uuid);
                if (!m36526.mo23120()) {
                    if (m36526.mo23546()) {
                        c23034 = new C23034(m36526, uuid);
                        try {
                            c23034.m51192();
                            AbstractC15440 abstractC15440 = c23034.f74130;
                            m51176(abstractC15440, "Hex session owner file is unsafe");
                            abstractC15440.m36510(f74124);
                        } catch (IOException e) {
                            try {
                                c23034.m51197();
                            } catch (IOException e2) {
                                e.addSuppressed(e2);
                            }
                            throw e;
                        }
                    } else if (!m36526.mo23120()) {
                        throw new IOException("Unable to create hex session directory");
                    }
                }
            }
            throw new IOException("Unable to allocate hex session token");
        }
        return c23034;
    }

    public C23034(AbstractC15440 abstractC15440, String str) {
        this.f74131 = str;
        this.f74129 = abstractC15440;
        this.f74128 = abstractC15440.m36526("checkpoint");
        this.f74127 = abstractC15440.m36526("state.tmp");
        this.f74125 = abstractC15440.m36526("base").m36534();
        this.f74130 = abstractC15440.m36526("owner");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51174(String str, InterfaceC17066 interfaceC17066) {
        C6101 c6101;
        while (!interfaceC17066.mo1526()) {
            synchronized (C23034.class) {
                c6101 = (C6101) f74123.get(str);
            }
            if (c6101 != null) {
                EnumC10335 m17011 = c6101.m17011(interfaceC17066);
                if (m17011 != EnumC10335.SUPERSEDED) {
                    if (m17011 != EnumC10335.COMMITTED) {
                        throw c6101.m17010();
                    }
                    return;
                }
            } else {
                if (interfaceC17066.mo1526()) {
                    throw new C23821();
                }
                return;
            }
        }
        throw new C23821();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51177(InterfaceC17066 interfaceC17066) {
        if (interfaceC17066.mo1526()) {
            throw new C23821();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m51200() {
        return this.f74131;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15587 m51201() {
        return this.f74125;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m51203() {
        AbstractC15440 abstractC15440 = this.f74128;
        return abstractC15440.mo23119() && !abstractC15440.m36533();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m51196() {
        boolean m17018;
        synchronized (C23034.class) {
            C6101 c6101 = (C6101) f74123.get(this.f74131);
            m17018 = c6101 != null ? c6101.m17018() : m51203();
        }
        return m17018;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6101 m51194() {
        m51192();
        AbstractC15440 m36526 = this.f74129.m36526("state-" + UUID.randomUUID() + ".tmp");
        m51176(m36526, "Hex pending state file is unsafe");
        C6101 c6101 = new C6101(this, m36526);
        synchronized (C23034.class) {
            HashMap hashMap = f74123;
            C6101 c61012 = (C6101) hashMap.get(this.f74131);
            if (c61012 != null && c61012.f18690) {
                throw new IOException("Hex session deletion was requested");
            }
            hashMap.put(this.f74131, c6101);
            if (c61012 != null) {
                C6101.m17008(c61012);
            }
        }
        return c6101;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC6724 m51195(C15544 c15544) {
        C12451 c12451;
        C11746 c11746;
        m51192();
        if (!this.f74128.mo23119() || this.f74128.m36533()) {
            throw new IOException("Hex session checkpoint is unavailable");
        }
        synchronized (this.f74126) {
            c12451 = new C12451(this.f74128, c15544);
            ArrayList arrayList = this.f74126;
            c11746 = c12451.f37453;
            arrayList.add(c11746);
        }
        return c12451;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final BufferedInputStream m51202() {
        m51192();
        AbstractC15440 abstractC15440 = this.f74128;
        if (!abstractC15440.mo23119() || abstractC15440.m36533()) {
            throw new IOException("Hex session checkpoint does not exist: " + this.f74131);
        }
        return new BufferedInputStream(abstractC15440.mo27926());
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m51189(C23034 c23034) {
        synchronized (c23034.f74126) {
            Iterator it = c23034.f74126.iterator();
            while (it.hasNext()) {
                try {
                    ((C11746) it.next()).m28747();
                } catch (IOException unused) {
                }
            }
            c23034.f74126.clear();
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m51198() {
        synchronized (this.f74126) {
            Iterator it = this.f74126.iterator();
            while (it.hasNext()) {
                if (((C11746) it.next()).m28744()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m51199() {
        synchronized (C23034.class) {
            C6101 c6101 = (C6101) f74123.get(this.f74131);
            if (c6101 != null) {
                C6101.m17006(c6101, false);
            } else {
                m51179();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void m51179() {
        m51192();
        try {
            m51186(this.f74127);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        try {
            m51186(this.f74128);
        } catch (IOException e2) {
            if (e == null) {
                e = e2;
            } else {
                e.addSuppressed(e2);
            }
        }
        if (e != null) {
            throw e;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m51197() {
        synchronized (C23034.class) {
            C6101 c6101 = (C6101) f74123.get(this.f74131);
            if (c6101 != null) {
                C6101.m17006(c6101, true);
            } else {
                m51178();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51173(String str, Exception exc) {
        if ((exc instanceof C23821) || !m51188(str)) {
            return;
        }
        try {
            m51183(str);
        } catch (IOException e) {
            exc.addSuppressed(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m51178() {
        AbstractC15440 abstractC15440 = this.f74129;
        if (abstractC15440.m36533() || abstractC15440.mo23120()) {
            m51190(m51193());
            m51186(abstractC15440);
        }
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m51193() {
        return C16293.f50117.m36526("hex-sessions");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m51190(AbstractC15440 abstractC15440) {
        if (!abstractC15440.mo23113() || abstractC15440.m36533()) {
            throw new IOException("Hex session root directory is unavailable");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23034 m51171(String str, C16250 c16250) {
        C23034 c23034;
        if (m51188(str)) {
            m51174(str, C16360.m38504(c16250));
            synchronized (C23034.class) {
                AbstractC15440 m51193 = m51193();
                m51190(m51193);
                AbstractC15440 m36526 = m51193.m36526(str);
                if (!m36526.mo23113() || m36526.m36533()) {
                    throw new IOException("Hex session does not exist: " + str);
                }
                c23034 = new C23034(m36526, str);
                String str2 = f74124;
                AbstractC15440 abstractC15440 = c23034.f74130;
                String str3 = null;
                if (abstractC15440.mo23119() && !abstractC15440.m36533()) {
                    try {
                        str3 = abstractC15440.m36489();
                    } catch (IOException unused) {
                    }
                }
                if (!str2.equals(str3)) {
                    c23034.m51180();
                }
                c23034.m51192();
                AbstractC15440 abstractC154402 = c23034.f74130;
                m51176(abstractC154402, "Hex session owner file is unsafe");
                abstractC154402.m36510(f74124);
            }
            return c23034;
        }
        throw new IllegalArgumentException("Invalid hex session token");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m51183(String str) {
        if (m51188(str)) {
            synchronized (C23034.class) {
                C6101 c6101 = (C6101) f74123.get(str);
                if (c6101 != null) {
                    C6101.m17006(c6101, true);
                    return;
                }
                AbstractC15440 m51193 = m51193();
                if (m51193.mo23120()) {
                    m51190(m51193);
                    AbstractC15440 m36526 = m51193.m36526(str);
                    if (m36526.mo23113() && !m36526.m36533()) {
                        new C23034(m36526, str).m51178();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid hex session token");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m51188(String str) {
        if (str == null || str.length() != 36) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 8 || i == 13 || i == 18 || i == 23) {
                if (charAt != '-') {
                    return false;
                }
            } else if ((charAt < '0' || charAt > '9') && (charAt < 'a' || charAt > 'f')) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m51192() {
        m51190(m51193());
        AbstractC15440 abstractC15440 = this.f74129;
        if (!abstractC15440.mo23113() || abstractC15440.m36533()) {
            throw new IOException("Hex session directory is unavailable: " + this.f74131);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:5|(3:7|(1:21)(1:15)|(2:19|20))|22|23|25|20|3) */
    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m51180() {
        /*
            r5 = this;
            l.ܶ᩵ܿ r0 = r5.f74129     // Catch: java.lang.RuntimeException -> L58
            r1 = 1
            java.util.List r0 = r0.mo23549(r1)     // Catch: java.lang.RuntimeException -> L58
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.RuntimeException -> L58
        Lb:
            boolean r1 = r0.hasNext()     // Catch: java.lang.RuntimeException -> L58
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()     // Catch: java.lang.RuntimeException -> L58
            l.ܶ᩵ܿ r1 = (l.AbstractC15440) r1     // Catch: java.lang.RuntimeException -> L58
            java.lang.String r2 = r1.getName()     // Catch: java.lang.RuntimeException -> L58
            java.lang.String r3 = "state.tmp"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.RuntimeException -> L58
            if (r3 != 0) goto L54
            int r3 = r2.length()     // Catch: java.lang.RuntimeException -> L58
            int r3 = r3 + (-4)
            java.lang.String r4 = "state-"
            boolean r4 = r2.startsWith(r4)     // Catch: java.lang.RuntimeException -> L58
            if (r4 == 0) goto L48
            java.lang.String r4 = ".tmp"
            boolean r4 = r2.endsWith(r4)     // Catch: java.lang.RuntimeException -> L58
            if (r4 == 0) goto L48
            r4 = 6
            if (r3 <= r4) goto L48
            java.lang.String r3 = r2.substring(r4, r3)     // Catch: java.lang.RuntimeException -> L58
            boolean r3 = m51188(r3)     // Catch: java.lang.RuntimeException -> L58
            if (r3 == 0) goto L48
            r3 = 1
            goto L49
        L48:
            r3 = 0
        L49:
            if (r3 != 0) goto L54
            java.lang.String r3 = ".hex-base.tmp"
            boolean r2 = r2.endsWith(r3)     // Catch: java.lang.RuntimeException -> L58
            if (r2 != 0) goto L54
            goto Lb
        L54:
            m51186(r1)     // Catch: java.io.IOException -> Lb java.lang.RuntimeException -> L58
            goto Lb
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23034.m51180():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51176(AbstractC15440 abstractC15440, String str) {
        if (abstractC15440.m36533() || (abstractC15440.mo23120() && !abstractC15440.mo23119())) {
            throw new IOException(str);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m51186(AbstractC15440 abstractC15440) {
        boolean m36533 = abstractC15440.m36533();
        if (m36533 || abstractC15440.mo23120()) {
            if (abstractC15440.mo23113() && !m36533) {
                Iterator it = abstractC15440.mo23549(true).iterator();
                while (it.hasNext()) {
                    m51186((AbstractC15440) it.next());
                }
            }
            if (m36533 || abstractC15440.mo23120()) {
                if (m36533) {
                    if (abstractC15440.mo27929()) {
                        return;
                    }
                } else if (abstractC15440.mo23552()) {
                    return;
                }
                throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to delete hex session path: ")));
            }
        }
    }
}
