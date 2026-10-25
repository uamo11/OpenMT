package l;

import java.io.IOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: K4CY */
/* renamed from: l.᩸֫֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21262 implements InterfaceC23037 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object f68593;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f68594;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17209 f68595;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile C15615 f68596;

    public C21262(C17209 c17209) {
        this.f68595 = c17209;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48268() {
        this.f68594 = true;
        C15615 c15615 = this.f68596;
        if (c15615 != null) {
            c15615.m36805();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m48270() {
        return this.f68594;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48269(Object obj) {
        this.f68593 = obj;
    }

    @Override // l.InterfaceC23037
    /* renamed from: ֫ */
    public final C18621 mo7384(C7855 c7855) {
        C18621 m21037;
        C8743 m48265;
        C8743 m21045 = c7855.m21045();
        InterfaceC16687 m21035 = c7855.m21035();
        AbstractC20216 m21043 = c7855.m21043();
        C15615 c15615 = new C15615(this.f68595.m40481(), m48264(m21045.m22622()), m21035, m21043, this.f68593);
        this.f68596 = c15615;
        int i = 0;
        C18621 c18621 = null;
        while (!this.f68594) {
            try {
                try {
                    m21037 = c7855.m21037(m21045, c15615, null, null);
                    if (c18621 != null) {
                        C3804 m43172 = m21037.m43172();
                        C3804 m431722 = c18621.m43172();
                        m431722.m11478((AbstractC0275) null);
                        m43172.m11488(m431722.m11474());
                        m21037 = m43172.m11474();
                    }
                    try {
                        m48265 = m48265(m21037, c15615.m36814());
                    } catch (IOException e) {
                        c15615.m36810();
                        throw e;
                    }
                } catch (IOException e2) {
                    if (!m48266(e2, c15615, !(e2 instanceof C22672), m21045)) {
                        throw e2;
                    }
                } catch (C6444 e3) {
                    if (!m48266(e3.m17801(), c15615, false, m21045)) {
                        throw e3.m17799();
                    }
                }
                if (m48265 == null) {
                    c15615.m36810();
                    return m21037;
                }
                C20032.m46179(m21037.m43170());
                int i2 = i + 1;
                if (i2 > 20) {
                    c15615.m36810();
                    throw new ProtocolException(C19370.m44628(i2, "Too many follow-up requests: "));
                }
                if (m48265.m22616() instanceof InterfaceC19851) {
                    c15615.m36810();
                    throw new HttpRetryException("Cannot retry streamed HTTP body", m21037.m43177());
                }
                if (!m48267(m21037, m48265.m22622())) {
                    c15615.m36810();
                    c15615 = new C15615(this.f68595.m40481(), m48264(m48265.m22622()), m21035, m21043, this.f68593);
                    this.f68596 = c15615;
                } else if (c15615.m36809() != null) {
                    throw new IllegalStateException("Closing the body of " + m21037 + " didn't close its backing stream. Bad interceptor?");
                }
                c18621 = m21037;
                m21045 = m48265;
                i = i2;
            } catch (Throwable th) {
                c15615.m36806((IOException) null);
                c15615.m36810();
                throw th;
            }
        }
        c15615.m36810();
        throw new IOException("Canceled");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C4965 m48264(C11749 c11749) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C23743 c23743;
        boolean m28780 = c11749.m28780();
        C17209 c17209 = this.f68595;
        if (m28780) {
            sSLSocketFactory = c17209.m40478();
            hostnameVerifier = c17209.m40479();
            c23743 = c17209.m40480();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            c23743 = null;
        }
        return new C4965(c11749.m28773(), c11749.m28771(), c17209.m40484(), c17209.m40474(), sSLSocketFactory, hostnameVerifier, c23743, c17209.m40483(), null, c17209.m40471(), c17209.m40477(), c17209.m40466());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        if (r5 == false) goto L28;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m48266(java.io.IOException r3, l.C15615 r4, boolean r5, l.C8743 r6) {
        /*
            r2 = this;
            r4.m36806(r3)
            l.ܿ۟᩵ r0 = r2.f68595
            boolean r0 = r0.m40467()
            r1 = 0
            if (r0 != 0) goto Ld
            goto L44
        Ld:
            if (r5 == 0) goto L1c
            l.ۖ۟᩵ r6 = r6.m22616()
            boolean r6 = r6 instanceof l.InterfaceC19851
            if (r6 != 0) goto L44
            boolean r6 = r3 instanceof java.io.FileNotFoundException
            if (r6 == 0) goto L1c
            return r1
        L1c:
            boolean r6 = r3 instanceof java.net.ProtocolException
            if (r6 == 0) goto L21
            return r1
        L21:
            boolean r6 = r3 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L2c
            boolean r3 = r3 instanceof java.net.SocketTimeoutException
            if (r3 == 0) goto L44
            if (r5 != 0) goto L44
            goto L3e
        L2c:
            boolean r5 = r3 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L39
            java.lang.Throwable r5 = r3.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L39
            goto L44
        L39:
            boolean r3 = r3 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r3 == 0) goto L3e
            return r1
        L3e:
            boolean r3 = r4.m36813()
            if (r3 != 0) goto L45
        L44:
            return r1
        L45:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21262.m48266(java.io.IOException, l.ܺ֫֡, boolean, l.ۡ۟᩵):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00dc, code lost:
    
        if (r1.equals("HEAD") == false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015d  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C8743 m48265(l.C18621 r10, l.C5215 r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21262.m48265(l.ᩴ۟᩵, l.ۚ۟᩵):l.ۡ۟᩵");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m48267(C18621 c18621, C11749 c11749) {
        C11749 m22622 = c18621.m43168().m22622();
        return m22622.m28773().equals(c11749.m28773()) && m22622.m28771() == c11749.m28771() && m22622.m28767().equals(c11749.m28767());
    }
}
