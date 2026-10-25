package l;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.security.GeneralSecurityException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;

/* compiled from: 42VH */
/* renamed from: l.ܰܺ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C13910 extends C4739 {

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static final String[] f41459 = {"C", "E", "S", "P"};

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final boolean f41460;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public SSLContext f41464;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public Socket f41466;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public String f41465 = "TLS";

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f41467 = true;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f41463 = true;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public TrustManager f41461 = C4349.m13051();

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final String f41462 = "TLS";

    /* renamed from: ۧ */
    public void mo26239(Socket socket) {
        throw null;
    }

    public C13910(boolean z) {
        this.f41460 = z;
    }

    @Override // l.C4739, l.AbstractC5445
    /* renamed from: ᩵ */
    public final void mo13881() {
        boolean z = this.f41460;
        if (z) {
            m15529();
            m33318();
        }
        super.mo13881();
        if (z) {
            return;
        }
        int mo26243 = mo26243("AUTH", this.f41465);
        if (334 == mo26243 || 234 == mo26243) {
            m33318();
            return;
        }
        throw new SSLException(m36351());
    }

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m33319() {
        for (int i = 0; i < 4; i++) {
            if (f41459[i].equals("P")) {
                if (200 != mo26243("PROT", "P")) {
                    throw new SSLException(m36351());
                }
                if ("C".equals("P")) {
                    m15532((C1526) null);
                    m15533((C7561) null);
                    return;
                } else {
                    m15532(new C1526(this.f41464));
                    m15533(new C7561(this.f41464));
                    m33316();
                    return;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // l.C4739, l.C15321, l.AbstractC5445
    /* renamed from: ۡ */
    public final void mo13861() {
        super.mo13861();
        Socket socket = this.f41466;
        if (socket != null) {
            socket.close();
        }
        m15532((C1526) null);
        m15533((C7561) null);
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m33320() {
        if (200 != mo26243("PBSZ", String.valueOf(0L))) {
            throw new SSLException(m36351());
        }
    }

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    private void m33316() {
        if (this.f41464 == null) {
            String str = this.f41462;
            TrustManager trustManager = this.f41461;
            TrustManager[] trustManagerArr = trustManager == null ? null : new TrustManager[]{trustManager};
            try {
                SSLContext sSLContext = SSLContext.getInstance(str);
                sSLContext.init(null, trustManagerArr, null);
                this.f41464 = sSLContext;
            } catch (GeneralSecurityException e) {
                throw new IOException("Could not initialize SSL context", e);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
    
        if (r4 != null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    @Override // l.C4739
    /* renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.net.Socket mo13874(java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13910.mo13874(java.lang.String, java.lang.String):java.net.Socket");
    }

    @Override // l.C15321, l.InterfaceC13224
    /* renamed from: ܽ */
    public int mo26243(String str, String str2) {
        int mo26243 = super.mo26243(str, str2);
        if (!"CCC".equals(str)) {
            return mo26243;
        }
        if (200 != mo26243) {
            throw new SSLException(m36351());
        }
        this.f16949.close();
        this.f16949 = this.f41466;
        this.f46977 = new BufferedReader(new InputStreamReader(this.f16949.getInputStream(), this.f46981));
        this.f46978 = new BufferedWriter(new OutputStreamWriter(this.f16949.getOutputStream(), this.f46981));
        return mo26243;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33317(boolean z) {
        this.f41467 = z;
    }

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final void m33318() {
        this.f41466 = this.f16949;
        m33316();
        Socket socket = this.f16949;
        SSLSocket sSLSocket = socket != null ? (SSLSocket) this.f41464.getSocketFactory().createSocket(socket, this.f16946, socket.getPort(), false) : null;
        sSLSocket.setEnableSessionCreation(this.f41467);
        boolean z = this.f41463;
        sSLSocket.setUseClientMode(z);
        if (!z) {
            sSLSocket.setNeedClientAuth(false);
            sSLSocket.setWantClientAuth(false);
        }
        sSLSocket.startHandshake();
        this.f16949 = sSLSocket;
        this.f46977 = new BufferedReader(new InputStreamReader(sSLSocket.getInputStream(), this.f46981));
        this.f46978 = new BufferedWriter(new OutputStreamWriter(sSLSocket.getOutputStream(), this.f46981));
    }
}
