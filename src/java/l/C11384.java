package l;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* compiled from: A4E9 */
/* renamed from: l.ۨ֫֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11384 implements InterfaceC19145 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17209 f34050;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C15615 f34052;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10405 f34053;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6171 f34055;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f34054 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f34051 = 262144;

    public C11384(C17209 c17209, C15615 c15615, InterfaceC6171 interfaceC6171, InterfaceC10405 interfaceC10405) {
        this.f34050 = c17209;
        this.f34052 = c15615;
        this.f34055 = interfaceC6171;
        this.f34053 = interfaceC10405;
    }

    @Override // l.InterfaceC19145
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC5508 mo28141(C8743 c8743, long j) {
        if ("chunked".equalsIgnoreCase(c8743.m22615("Transfer-Encoding"))) {
            if (this.f34054 != 1) {
                throw new IllegalStateException("state: " + this.f34054);
            }
            this.f34054 = 2;
            return new C2917(this);
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f34054 != 1) {
            throw new IllegalStateException("state: " + this.f34054);
        }
        this.f34054 = 2;
        return new C12089(this, j);
    }

    @Override // l.InterfaceC19145
    public final void cancel() {
        C23377 m36811 = this.f34052.m36811();
        if (m36811 != null) {
            m36811.m51821();
        }
    }

    @Override // l.InterfaceC19145
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28144(C8743 c8743) {
        Proxy.Type type = this.f34052.m36811().m51829().m14992().type();
        StringBuilder sb = new StringBuilder();
        sb.append(c8743.m22620());
        sb.append(' ');
        if (!c8743.m22621() && type == Proxy.Type.HTTP) {
            sb.append(c8743.m22622());
        } else {
            C11749 m22622 = c8743.m22622();
            String m28772 = m22622.m28772();
            String m28777 = m22622.m28777();
            if (m28777 != null) {
                m28772 = m28772 + '?' + m28777;
            }
            sb.append(m28772);
        }
        sb.append(" HTTP/1.1");
        m28145(c8743.m22619(), sb.toString());
    }

    @Override // l.InterfaceC19145
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14910 mo28142(C18621 c18621) {
        C15615 c15615 = this.f34052;
        c15615.f48085.getClass();
        String m43169 = c18621.m43169("Content-Type");
        if (!C0799.m3019(c18621)) {
            return new C14910(m43169, 0L, C23852.m52567(m28139(0L)));
        }
        if ("chunked".equalsIgnoreCase(c18621.m43169("Transfer-Encoding"))) {
            C11749 m22622 = c18621.m43168().m22622();
            if (this.f34054 != 4) {
                throw new IllegalStateException("state: " + this.f34054);
            }
            this.f34054 = 5;
            return new C14910(m43169, -1L, C23852.m52567(new C12794(this, m22622)));
        }
        long m3017 = C0799.m3017(c18621);
        if (m3017 != -1) {
            return new C14910(m43169, m3017, C23852.m52567(m28139(m3017)));
        }
        if (this.f34054 != 4) {
            throw new IllegalStateException("state: " + this.f34054);
        }
        this.f34054 = 5;
        c15615.m36812();
        return new C14910(m43169, -1L, C23852.m52567(new C5739(this)));
    }

    @Override // l.InterfaceC19145
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo28146() {
        this.f34053.flush();
    }

    @Override // l.InterfaceC19145
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28143() {
        this.f34053.flush();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28145(C10338 c10338, String str) {
        if (this.f34054 != 0) {
            throw new IllegalStateException("state: " + this.f34054);
        }
        InterfaceC10405 interfaceC10405 = this.f34053;
        interfaceC10405.mo26251(str).mo26251("\r\n");
        int m26139 = c10338.m26139();
        for (int i = 0; i < m26139; i++) {
            interfaceC10405.mo26251(c10338.m26136(i)).mo26251(": ").mo26251(c10338.m26140(i)).mo26251("\r\n");
        }
        interfaceC10405.mo26251("\r\n");
        this.f34054 = 1;
    }

    @Override // l.InterfaceC19145
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3804 mo28140(boolean z) {
        int i = this.f34054;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.f34054);
        }
        try {
            String mo12303 = this.f34055.mo12303(this.f34051);
            this.f34051 -= mo12303.length();
            C21967 m49454 = C21967.m49454(mo12303);
            int i2 = m49454.f70360;
            C3804 c3804 = new C3804();
            c3804.m11482(m49454.f70362);
            c3804.m11475(i2);
            c3804.m11486(m49454.f70361);
            c3804.m11480(m28147());
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f34054 = 3;
                return c3804;
            }
            this.f34054 = 4;
            return c3804;
        } catch (EOFException e) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f34052);
            iOException.initCause(e);
            throw iOException;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C10338 m28147() {
        C12454 c12454 = new C12454();
        while (true) {
            String mo12303 = this.f34055.mo12303(this.f34051);
            this.f34051 -= mo12303.length();
            if (mo12303.length() != 0) {
                AbstractC8037.f24775.mo21352(c12454, mo12303);
            } else {
                return c12454.m30612();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1274 m28139(long j) {
        if (this.f34054 != 4) {
            throw new IllegalStateException("state: " + this.f34054);
        }
        this.f34054 = 5;
        return new C9973(this, j);
    }
}
