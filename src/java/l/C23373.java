package l;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PrivilegedActionException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.Subject;

/* compiled from: E9ZA */
/* renamed from: l.᩻֨᩵, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23373 implements InterfaceC6440 {

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f75075 = C11321.m27961(C23373.class);

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public InterfaceC18663 f75076;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f75077;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f75078;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public byte[] f75079;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f75081;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f75082;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f75083;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f75084;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20552 f75086;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f75087;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC17065 f75089;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC5714 f75091;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f75092;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f75090 = new AtomicInteger();

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f75085 = null;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final AtomicLong f75088 = new AtomicLong(1);

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f75080 = new AtomicBoolean(true);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6440 m51806() {
        if (InterfaceC6440.class.isAssignableFrom(C23373.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    public C23373(InterfaceC18663 interfaceC18663, String str, String str2, C20552 c20552) {
        this.f75076 = interfaceC18663;
        this.f75083 = str2;
        this.f75092 = str;
        c20552.m19164();
        this.f75086 = c20552;
        this.f75082 = new ArrayList();
        this.f75091 = interfaceC18663.mo6355().mo16136().clone();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1023 m51809() {
        return this.f75076.mo27540();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m51805() {
        return this.f75083;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m51803() {
        return this.f75092;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m51795() {
        return this.f75088.get() > 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51800() {
        long incrementAndGet = this.f75088.incrementAndGet();
        InterfaceC2148 interfaceC2148 = f75075;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("Acquire session " + incrementAndGet + " " + this);
        }
        if (incrementAndGet == 1) {
            synchronized (this) {
                if (this.f75080.compareAndSet(false, true)) {
                    interfaceC2148.mo7088("Reacquire transport");
                    this.f75086.m19164();
                }
            }
        }
    }

    public final void finalize() {
        if (!m51811() || this.f75088.get() == 0) {
            return;
        }
        f75075.mo7104("Session was not properly released");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m51813();
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m51813() {
        long decrementAndGet = this.f75088.decrementAndGet();
        InterfaceC2148 interfaceC2148 = f75075;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("Release session " + decrementAndGet + " " + this);
        }
        if (decrementAndGet != 0) {
            if (decrementAndGet < 0) {
                throw new C13017("Usage count dropped below zero");
            }
            return;
        }
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Usage dropped to zero, release connection " + this.f75086);
        }
        synchronized (this) {
            if (this.f75080.compareAndSet(true, false)) {
                this.f75086.m19171();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19141 m51799(String str) {
        if (str == null) {
            str = "IPC$";
        }
        synchronized (this.f75082) {
            Iterator it = this.f75082.iterator();
            while (it.hasNext()) {
                C19141 c19141 = (C19141) it.next();
                if (c19141.m44200(str, (String) null)) {
                    c19141.m44198();
                    return c19141;
                }
            }
            C19141 c191412 = new C19141(this, str);
            c191412.m44198();
            this.f75082.add(c191412);
            return c191412;
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C20552 m51804() {
        C20552 c20552 = this.f75086;
        c20552.m19164();
        return c20552;
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m51808() {
        if (m51807() != null) {
            return false;
        }
        C20552 c20552 = this.f75086;
        if (c20552.m47110()) {
            return true;
        }
        return c20552.m47117().mo10550();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51792(InterfaceC17065 interfaceC17065) {
        C20552 c20552 = this.f75086;
        if (c20552.m47112()) {
            this.f75089 = interfaceC17065;
        } else {
            c20552.m47104(interfaceC17065);
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17065 m51807() {
        InterfaceC17065 interfaceC17065 = this.f75089;
        return interfaceC17065 != null ? interfaceC17065 : this.f75086.m47115();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1543 m51796(InterfaceC7578 interfaceC7578, InterfaceC1543 interfaceC1543, Set set) {
        String str;
        String str2;
        InterfaceC18663 interfaceC18663 = this.f75076;
        InterfaceC2148 interfaceC2148 = f75075;
        C20552 c20552 = this.f75086;
        c20552.m19164();
        if (interfaceC1543 != null) {
            try {
                interfaceC1543.mo28216();
                interfaceC1543.mo10437(this.f75077);
            } finally {
            }
        }
        try {
            if (set.contains(EnumC0214.NO_TIMEOUT)) {
                this.f75078 = -1L;
                str = "Have referral ";
                str2 = "Response: ";
            } else {
                str = "Have referral ";
                str2 = "Response: ";
                this.f75078 = System.currentTimeMillis() + ((C13722) interfaceC18663.mo27540()).m32993();
            }
            try {
                InterfaceC1543 interfaceC15432 = (InterfaceC1543) m51797(interfaceC7578, interfaceC1543);
                if (interfaceC15432 != null && interfaceC15432.mo28213()) {
                    interfaceC7578.mo10436((InterfaceC17065) null);
                    this.f75078 = System.currentTimeMillis() + ((C13722) interfaceC18663.mo27540()).m32993();
                    c20552.m19171();
                    return interfaceC15432;
                }
                if (interfaceC7578 instanceof C4407) {
                    C4407 c4407 = (C4407) interfaceC7578;
                    if (this.f75085 != null && c4407.getPath().endsWith("\\IPC$")) {
                        c4407.mo6630("\\\\" + this.f75085 + "\\IPC$");
                    }
                }
                interfaceC7578.mo10448(this.f75081);
                interfaceC7578.mo10447(this.f75087);
                if (interfaceC7578.getDigest() == null) {
                    interfaceC7578.mo10436(m51807());
                }
                boolean z = interfaceC7578 instanceof InterfaceC16359;
                String str3 = this.f75083;
                if (z) {
                    ((InterfaceC16359) interfaceC7578).mo6631(str3, this.f75092, ((InterfaceC16359) interfaceC7578).mo6641());
                }
                try {
                    if (interfaceC2148.mo7099()) {
                        interfaceC2148.mo7101("Request " + interfaceC7578);
                    }
                    try {
                        InterfaceC1543 m47111 = c20552.m47111(interfaceC7578, interfaceC1543, set);
                        if (interfaceC2148.mo7099()) {
                            interfaceC2148.mo7101("Response " + m47111);
                        }
                        interfaceC7578.mo10436((InterfaceC17065) null);
                        this.f75078 = System.currentTimeMillis() + ((C13722) interfaceC18663.mo27540()).m32993();
                        c20552.m19171();
                        return m47111;
                    } catch (C3037 e) {
                        if (e.m9291() != -1073740964 && e.m9291() != -1073741309) {
                            throw e;
                        }
                        if (!c20552.m47112()) {
                            throw e;
                        }
                        if (e.m9291() == -1073741309) {
                            try {
                                interfaceC2148.mo7104("Got NT_STATUS_USER_SESSION_DELETED, disconnecting transport");
                                c20552.m19178();
                            } catch (IOException e2) {
                                interfaceC2148.mo7083("Got NT_STATUS_USER_SESSION_DELETED, disconnected transport with error", (Throwable) e2);
                            }
                        }
                        interfaceC2148.mo7081("Session expired, trying reauth", (Exception) e);
                        InterfaceC1543 m51791 = m51791(c20552, str3, interfaceC7578, set);
                        interfaceC7578.mo10436((InterfaceC17065) null);
                        this.f75078 = System.currentTimeMillis() + ((C13722) interfaceC18663.mo27540()).m32993();
                        c20552.m19171();
                        return m51791;
                    }
                } catch (C7125 e3) {
                    if (interfaceC2148.mo7086()) {
                        interfaceC2148.mo7088(str + e3);
                    }
                    throw e3;
                } catch (C3037 e4) {
                    if (interfaceC2148.mo7099()) {
                        interfaceC2148.mo7097("Send failed", e4);
                        interfaceC2148.mo7101("Request: " + interfaceC7578);
                        interfaceC2148.mo7101(str2 + interfaceC1543);
                    }
                    throw e4;
                }
            } catch (GeneralSecurityException e5) {
                throw new C3037("Session setup failed", e5);
            }
        } catch (Throwable th) {
            interfaceC7578.mo10436((InterfaceC17065) null);
            this.f75078 = System.currentTimeMillis() + ((C13722) interfaceC18663.mo27540()).m32993();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [l.᩷֨᩵] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v6, types: [l.֫ۖ᩵] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC1543 m51790(C20552 c20552, String str) {
        Subject subject;
        C3450 c3450;
        InterfaceC2148 interfaceC2148;
        InterfaceC5714 interfaceC5714;
        ?? r9;
        C6272 c6272;
        C3450 c34502 = (C3450) c20552.m47117();
        byte[] m10535 = c34502.m10535();
        int i = ((c34502.m10542() & 2) != 0 || c20552.m47110()) ? 2 : 1;
        InterfaceC5714 interfaceC57142 = this.f75091;
        boolean mo16137 = interfaceC57142.mo16137();
        boolean m48659 = c34502.mo10552().m48659(EnumC21485.SMB311);
        Object obj = null;
        byte[] m47116 = m48659 ? c20552.m47116() : null;
        this.f75084 = m47116;
        InterfaceC2148 interfaceC21482 = f75075;
        if (m47116 != null && interfaceC21482.mo7086()) {
            byte[] bArr = this.f75084;
            interfaceC21482.mo7088("Initial session preauth hash ".concat(C12085.m29468(bArr, 0, bArr.length)));
        }
        boolean z = mo16137;
        long j = 0;
        InterfaceC15030 interfaceC15030 = null;
        C6272 c62722 = null;
        C3037 c3037 = null;
        while (true) {
            if (interfaceC15030 == null) {
                interfaceC15030 = m51798(c20552, str, c34502, !z, null);
                subject = null;
            } else {
                subject = null;
            }
            byte[] m51794 = m51794(interfaceC15030, m10535, subject);
            if (m51794 != null) {
                InterfaceC18663 context = this.f75086.getContext();
                int m10534 = c34502.m10534();
                long j2 = j;
                interfaceC2148 = interfaceC21482;
                c3450 = c34502;
                interfaceC5714 = interfaceC57142;
                ?? r92 = obj;
                C10506 c10506 = new C10506(context, i, m10534, 0L, m51794);
                c10506.mo10448(j2);
                c10506.mo10429();
                try {
                    c6272 = (C6272) c20552.m47111(c10506, r92, EnumSet.of(EnumC0214.RETAIN_PAYLOAD));
                    j = c6272.m10465();
                } catch (C22087 e) {
                    throw e;
                } catch (C3037 e2) {
                    C6272 c62723 = (C6272) c10506.mo5429();
                    if (e2.m9291() == -1073741811) {
                        throw new C22087("Login failed", e2);
                    }
                    if (!c62723.mo28213() || c62723.mo28209() || (c62723.m10446() != 0 && c62723.m10446() != -1073741802)) {
                        throw e2;
                    }
                    c3037 = e2;
                    c6272 = c62723;
                    j = j2;
                }
                this.f75076.mo27540().getClass();
                if (c6272.m17280() && !interfaceC5714.mo16135() && !interfaceC5714.mo16137()) {
                    throw new C22087(-1073741715);
                }
                if (!interfaceC5714.mo16137() && c6272.m17280()) {
                    z = true;
                }
                if ((c6272.m17279() & 4) != 0) {
                    throw new C0089("Server requires encryption, not yet supported.");
                }
                if (m48659) {
                    byte[] m10443 = c10506.m10443();
                    this.f75084 = c20552.m47107(m10443.length, m10443, this.f75084);
                    if (c6272.m10446() == -1073741802) {
                        byte[] m104432 = c6272.m10443();
                        this.f75084 = c20552.m47107(m104432.length, m104432, this.f75084);
                    }
                }
                c62722 = c6272;
                m10535 = c6272.m17281();
                r9 = r92;
            } else {
                c3450 = c34502;
                interfaceC2148 = interfaceC21482;
                interfaceC5714 = interfaceC57142;
                r9 = obj;
                m10535 = m51794;
            }
            boolean z2 = z;
            if (interfaceC15030.mo14524()) {
                interfaceC2148.mo7088("Context is established");
                this.f75085 = r9;
                byte[] mo14526 = interfaceC15030.mo14526();
                if (mo14526 != null) {
                    byte[] bArr2 = new byte[16];
                    System.arraycopy(mo14526, 0, bArr2, 0, Math.min(16, mo14526.length));
                    this.f75079 = bArr2;
                }
                boolean z3 = (c62722 == null || (c62722.m10460() & 8) == 0) ? false : true;
                if (!z2 && (m51808() || z3)) {
                    if (interfaceC15030.mo14526() != null && c62722 != null) {
                        if (this.f75084 != null && interfaceC2148.mo7086()) {
                            byte[] bArr3 = this.f75084;
                            interfaceC2148.mo7088("Final preauth integrity hash ".concat(C12085.m29468(bArr3, 0, bArr3.length)));
                        }
                        C6251 c6251 = new C6251(this.f75079, c3450.m10541(), this.f75084);
                        if (c3450.mo10552().m48659(EnumC21485.SMB300) || (c62722.m10460() & 8) != 0) {
                            c62722.mo10436(c6251);
                            byte[] m104433 = c62722.m10443();
                            if (!c62722.m30867(0, m104433.length, m104433)) {
                                throw new C3037("Signature validation failed");
                            }
                        }
                        m51792(c6251);
                    } else {
                        c20552.getContext().mo27540().getClass();
                    }
                } else if (interfaceC2148.mo7086()) {
                    interfaceC2148.mo7088("No digest setup " + z2 + " B " + m51808());
                }
                this.f75077 = true;
                this.f75090.set(2);
                this.f75081 = c62722.m10465();
                if (c3037 != null) {
                    throw c3037;
                }
                return c62722.m10466();
            }
            z = z2;
            interfaceC57142 = interfaceC5714;
            interfaceC21482 = interfaceC2148;
            obj = r9;
            c34502 = c3450;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m51794(InterfaceC15030 interfaceC15030, byte[] bArr, Subject subject) {
        if (subject == null) {
            return interfaceC15030.mo14525(bArr == null ? 0 : bArr.length, bArr);
        }
        try {
            return (byte[]) Subject.doAs(subject, new C17023(interfaceC15030, bArr));
        } catch (PrivilegedActionException e) {
            if (e.getException() instanceof C3037) {
                throw ((C3037) e.getException());
            }
            throw new C3037("Unexpected exception during context initialization", e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC15030 m51798(C20552 c20552, String str, C3450 c3450, boolean z, Subject subject) {
        InterfaceC2148 interfaceC2148 = f75075;
        String str2 = this.f75092;
        if (str2 == null) {
            str2 = c20552.m47109().mo1012();
            try {
                str2 = c20552.m47109().mo1015();
            } catch (Exception e) {
                interfaceC2148.mo7081("Failed to resolve host name", e);
            }
        }
        String str3 = str2;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Remote host is " + str3);
        }
        if (subject != null) {
            try {
                return (InterfaceC15030) Subject.doAs(subject, new C14200(this, str, str3, c3450, z));
            } catch (PrivilegedActionException e2) {
                if (e2.getException() instanceof C3037) {
                    throw ((C3037) e2.getException());
                }
                throw new C3037("Unexpected exception during context initialization", e2);
            }
        }
        return this.f75091.mo16134(this.f75086.getContext(), str3, c3450.m10535(), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed A[Catch: all -> 0x0143, TryCatch #0 {, blocks: (B:8:0x0028, B:9:0x0042, B:11:0x0048, B:13:0x0061, B:14:0x0067, B:16:0x006f, B:19:0x0077, B:22:0x00b9, B:24:0x00c8, B:26:0x00d0, B:30:0x00d9, B:31:0x00e1, B:33:0x00e2, B:35:0x00ed, B:36:0x00fb, B:38:0x010e, B:42:0x0114, B:44:0x0128, B:46:0x012e, B:49:0x0132, B:50:0x013a, B:52:0x013c, B:55:0x0142, B:56:0x0086, B:57:0x008d, B:61:0x0093, B:63:0x009f, B:65:0x00a5, B:67:0x00ab, B:70:0x0105, B:78:0x0107), top: B:7:0x0028, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010e A[Catch: all -> 0x0143, TryCatch #0 {, blocks: (B:8:0x0028, B:9:0x0042, B:11:0x0048, B:13:0x0061, B:14:0x0067, B:16:0x006f, B:19:0x0077, B:22:0x00b9, B:24:0x00c8, B:26:0x00d0, B:30:0x00d9, B:31:0x00e1, B:33:0x00e2, B:35:0x00ed, B:36:0x00fb, B:38:0x010e, B:42:0x0114, B:44:0x0128, B:46:0x012e, B:49:0x0132, B:50:0x013a, B:52:0x013c, B:55:0x0142, B:56:0x0086, B:57:0x008d, B:61:0x0093, B:63:0x009f, B:65:0x00a5, B:67:0x00ab, B:70:0x0105, B:78:0x0107), top: B:7:0x0028, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0142 A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.InterfaceC1543 m51791(l.C20552 r26, java.lang.String r27, l.InterfaceC7578 r28, java.util.Set r29) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23373.m51791(l.᩷֨᩵, java.lang.String, l.۟ܺ᩵, java.util.Set):l.֫ۖ᩵");
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x02a0, code lost:
    
        throw new l.C3037("NTLMv2 requires extended security (jcifs.smb.client.useExtendedSecurity must be true if jcifs.smb.lmCompatibility >= 3)");
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0343 A[LOOP:0: B:2:0x001d->B:74:0x0343, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0342 A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m51793(l.C20552 r19, java.lang.String r20, l.AbstractC11422 r21, l.AbstractC11422 r22) {
        /*
            Method dump skipped, instructions count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23373.m51793(l.᩷֨᩵, java.lang.String, l.ۨۖ᩵, l.ۨۖ᩵):void");
    }

    public final String toString() {
        return "SmbSession[credentials=" + this.f75076.mo6355() + ",targetHost=" + this.f75092 + ",targetDomain=" + this.f75083 + ",uid=" + this.f75087 + ",connectionState=" + this.f75090 + ",usage=" + this.f75088.get() + "]";
    }

    public final InterfaceC18663 getContext() {
        return this.f75086.getContext();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13927 m51797(InterfaceC7578 interfaceC7578, InterfaceC1543 interfaceC1543) {
        C20552 c20552 = this.f75086;
        c20552.m19164();
        try {
            synchronized (c20552) {
                while (!this.f75090.compareAndSet(0, 1)) {
                    try {
                        int i = this.f75090.get();
                        if (i == 2 || i == 3) {
                            c20552.m19171();
                            return interfaceC1543;
                        }
                        try {
                            this.f75086.wait();
                        } catch (InterruptedException e) {
                            throw new C3037(e.getMessage(), e);
                        }
                    } finally {
                        c20552.notifyAll();
                    }
                }
                try {
                    c20552.m47114();
                    InterfaceC2148 interfaceC2148 = f75075;
                    if (interfaceC2148.mo7086()) {
                        interfaceC2148.mo7088("sessionSetup: " + this.f75091);
                    }
                    this.f75087 = 0;
                    if (!c20552.m47112()) {
                        m51793(c20552, this.f75083, (AbstractC11422) interfaceC7578, (AbstractC11422) interfaceC1543);
                        c20552.m19171();
                        return interfaceC1543;
                    }
                    InterfaceC1543 m51790 = m51790(c20552, this.f75083);
                    c20552.m19171();
                    return m51790;
                } catch (Exception e2) {
                    f75075.mo7081("Session setup failed", e2);
                    if (this.f75090.compareAndSet(1, 0)) {
                        m51802(true, true);
                    }
                    throw e2;
                }
            }
        } catch (Throwable th) {
            try {
                c20552.m19171();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:21|22|(1:108)(2:26|27)|28|29|(8:32|33|34|36|37|38|39|30)|43|44|(3:85|86|(9:88|89|90|77|78|79|80|71|72))|(4:50|51|52|53)|77|78|79|80|71|72) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0127, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014e, code lost:
    
        r2 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.᩻֨᩵] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m51802(boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23373.m51802(boolean, boolean):boolean");
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Long m51814() {
        long j = this.f75078;
        if (j > 0) {
            return Long.valueOf(j);
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51801(InterfaceC18663 interfaceC18663, String str, String str2) {
        return C11003.equals(this.f75091, interfaceC18663.mo6355()) && C11003.equals(this.f75092, str) && C11003.equals(this.f75083, str2);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5714 m51810() {
        return this.f75091;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m51811() {
        return !this.f75086.mo19180() && this.f75090.get() == 2;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m51812() {
        return this.f75086.mo19172();
    }
}
