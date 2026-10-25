package l;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* compiled from: 14DT */
/* renamed from: l.᩻֫֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23377 extends AbstractC0362 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Socket f75103;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC6171 f75104;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f75105;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C5215 f75106;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Socket f75107;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22235 f75109;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC10405 f75110;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C13159 f75112;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8927 f75113;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f75114;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC14386 f75115;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f75108 = 1;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f75111 = new ArrayList();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f75116 = C13132.FOREVER_NS;

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6 A[ORIG_RETURN, RETURN] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m51822(int r6, int r7, int r8, int r9, boolean r10, l.AbstractC20216 r11) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23377.m51822(int, int, int, int, boolean, l.᩶ܰ᩵):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51818(int i, int i2, AbstractC20216 abstractC20216) {
        Socket createSocket;
        C5215 c5215 = this.f75106;
        Proxy m14992 = c5215.m14992();
        C4965 m14991 = c5215.m14991();
        if (m14992.type() == Proxy.Type.DIRECT || m14992.type() == Proxy.Type.HTTP) {
            createSocket = m14991.m14412().createSocket();
        } else {
            createSocket = new Socket(m14992);
        }
        this.f75107 = createSocket;
        abstractC20216.getClass();
        this.f75107.setSoTimeout(i2);
        try {
            C18872.m43580().mo43584(this.f75107, c5215.m14994(), i);
            try {
                this.f75104 = C23852.m52567(C23852.m52569(this.f75107));
                this.f75110 = C23852.m52568(C23852.m52566(this.f75107));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + c5215.m14994());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51819(C14204 c14204, int i, AbstractC20216 abstractC20216) {
        SSLSocket sSLSocket;
        EnumC14386 enumC14386;
        C5215 c5215 = this.f75106;
        if (c5215.m14991().m14406() == null) {
            List m14410 = c5215.m14991().m14410();
            EnumC14386 enumC143862 = EnumC14386.H2_PRIOR_KNOWLEDGE;
            if (m14410.contains(enumC143862)) {
                this.f75103 = this.f75107;
                this.f75115 = enumC143862;
                m51816(i);
                return;
            } else {
                this.f75103 = this.f75107;
                this.f75115 = EnumC14386.HTTP_1_1;
                return;
            }
        }
        abstractC20216.getClass();
        C4965 m14991 = c5215.m14991();
        try {
            try {
                sSLSocket = (SSLSocket) m14991.m14406().createSocket(this.f75107, m14991.m14405().m28773(), m14991.m14405().m28771(), true);
            } catch (AssertionError e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            sSLSocket = null;
        }
        try {
            C2577 m33868 = c14204.m33868(sSLSocket);
            if (m33868.m8176()) {
                C18872.m43580().mo8318(sSLSocket, m14991.m14405().m28773(), m14991.m14410());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            C13159 m31886 = C13159.m31886(session);
            if (!m14991.m14411().verify(m14991.m14405().m28773(), session)) {
                List m31890 = m31886.m31890();
                if (!m31890.isEmpty()) {
                    X509Certificate x509Certificate = (X509Certificate) m31890.get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + m14991.m14405().m28773() + " not verified:\n    certificate: " + C23743.m52389(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + C8288.m21883(x509Certificate));
                }
                throw new SSLPeerUnverifiedException("Hostname " + m14991.m14405().m28773() + " not verified (no certificates)");
            }
            m14991.m14402().m52391(m14991.m14405().m28773(), m31886.m31890());
            String mo8319 = m33868.m8176() ? C18872.m43580().mo8319(sSLSocket) : null;
            this.f75103 = sSLSocket;
            this.f75104 = C23852.m52567(C23852.m52569(sSLSocket));
            this.f75110 = C23852.m52568(C23852.m52566(this.f75103));
            this.f75112 = m31886;
            if (mo8319 != null) {
                enumC14386 = EnumC14386.m34359(mo8319);
            } else {
                enumC14386 = EnumC14386.HTTP_1_1;
            }
            this.f75115 = enumC14386;
            C18872.m43580().mo8317(sSLSocket);
            if (this.f75115 == EnumC14386.HTTP_2) {
                m51816(i);
            }
        } catch (AssertionError e2) {
            e = e2;
            if (!C20032.m46182(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            if (sSLSocket != null) {
                C18872.m43580().mo8317(sSLSocket);
            }
            C20032.m46181((Socket) sSLSocket);
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51816(int i) {
        this.f75103.setSoTimeout(0);
        C3891 c3891 = new C3891();
        c3891.m11754(this.f75103, this.f75106.m14991().m14405().m28773(), this.f75104, this.f75110);
        c3891.m11755(this);
        c3891.m11753(i);
        C22235 m11752 = c3891.m11752();
        this.f75109 = m11752;
        m11752.m49938();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0162, code lost:
    
        if (r2 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0165, code lost:
    
        l.C20032.m46181(r20.f75107);
        r20.f75107 = null;
        r20.f75110 = null;
        r20.f75104 = null;
        r10 = r5 + 1;
        r5 = null;
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [l.ܺ֫֡, l.ܿ۟᩵] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m51817(int r21, int r22, int r23, l.AbstractC20216 r24) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23377.m51817(int, int, int, l.᩶ܰ᩵):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51823(C4965 c4965, C5215 c5215) {
        if (this.f75111.size() >= this.f75108 || this.f75105) {
            return false;
        }
        AbstractC8037 abstractC8037 = AbstractC8037.f24775;
        C5215 c52152 = this.f75106;
        if (!abstractC8037.mo21354(c52152.m14991(), c4965)) {
            return false;
        }
        if (c4965.m14405().m28773().equals(c52152.m14991().m14405().m28773())) {
            return true;
        }
        if (this.f75109 == null || c5215 == null) {
            return false;
        }
        Proxy.Type type = c5215.m14992().type();
        Proxy.Type type2 = Proxy.Type.DIRECT;
        if (type != type2 || c52152.m14992().type() != type2 || !c52152.m14994().equals(c5215.m14994()) || c5215.m14991().m14411() != C8288.f25465 || !m51824(c4965.m14405())) {
            return false;
        }
        try {
            c4965.m14402().m52391(c4965.m14405().m28773(), this.f75112.m31890());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51824(C11749 c11749) {
        int m28771 = c11749.m28771();
        C5215 c5215 = this.f75106;
        if (m28771 == c5215.m14991().m14405().m28771()) {
            if (c11749.m28773().equals(c5215.m14991().m14405().m28773())) {
                return true;
            }
            if (this.f75112 != null) {
                if (C8288.m21885((X509Certificate) this.f75112.m31890().get(0), c11749.m28773())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19145 m51820(C17209 c17209, C7855 c7855, C15615 c15615) {
        if (this.f75109 != null) {
            return new C14473(c17209, c7855, c15615, this.f75109);
        }
        this.f75103.setSoTimeout(c7855.m21040());
        C15384 mo4333 = this.f75104.mo4333();
        long m21040 = c7855.m21040();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        mo4333.mo20329(m21040);
        this.f75110.mo8912().mo20329(c7855.m21044());
        return new C11384(c17209, c15615, this.f75104, this.f75110);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5215 m51829() {
        return this.f75106;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51821() {
        C20032.m46181(this.f75107);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Socket m51828() {
        return this.f75103;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51825(boolean z) {
        if (!this.f75103.isClosed() && !this.f75103.isInputShutdown() && !this.f75103.isOutputShutdown()) {
            C22235 c22235 = this.f75109;
            if (c22235 != null) {
                return c22235.m49936(System.nanoTime());
            }
            if (z) {
                try {
                    int soTimeout = this.f75103.getSoTimeout();
                    try {
                        this.f75103.setSoTimeout(1);
                        return !this.f75104.mo12308();
                    } finally {
                        this.f75103.setSoTimeout(soTimeout);
                    }
                } catch (SocketTimeoutException unused) {
                } catch (IOException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // l.AbstractC0362
    /* renamed from: ֫ */
    public final void mo1801(C10241 c10241) {
        c10241.m25937(EnumC13499.REFUSED_STREAM);
    }

    @Override // l.AbstractC0362
    /* renamed from: ֫ */
    public final void mo1802(C22235 c22235) {
        synchronized (this.f75113) {
            this.f75108 = c22235.m49922();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13159 m51826() {
        return this.f75112;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m51827() {
        return this.f75109 != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        C5215 c5215 = this.f75106;
        sb.append(c5215.m14991().m14405().m28773());
        sb.append(":");
        sb.append(c5215.m14991().m14405().m28771());
        sb.append(", proxy=");
        sb.append(c5215.m14992());
        sb.append(" hostAddress=");
        sb.append(c5215.m14994());
        sb.append(" cipherSuite=");
        C13159 c13159 = this.f75112;
        sb.append(c13159 != null ? c13159.m31888() : "none");
        sb.append(" protocol=");
        sb.append(this.f75115);
        sb.append('}');
        return sb.toString();
    }

    public C23377(C8927 c8927, C5215 c5215) {
        this.f75113 = c8927;
        this.f75106 = c5215;
    }
}
