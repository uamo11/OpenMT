package l;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: 274A */
/* renamed from: l.᩷ۗۜ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20604 implements InterfaceC21449 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f66311;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC21449 f66312;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f66313 = new ArrayList();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C3104 f66314;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9315 f66315;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f66316;

    public C20604(C9315 c9315) {
        this.f66315 = c9315;
    }

    @Override // l.InterfaceC21449
    /* renamed from: ֫ */
    public final void mo5937(InterfaceC0486 interfaceC0486) {
        ArrayList arrayList = this.f66313;
        if (arrayList.contains(interfaceC0486)) {
            return;
        }
        arrayList.add(interfaceC0486);
        InterfaceC21449 interfaceC21449 = this.f66312;
        if (interfaceC21449 != null) {
            interfaceC21449.mo5937(interfaceC0486);
        }
    }

    @Override // l.InterfaceC21449
    /* renamed from: ֫ */
    public final long mo1620(C3104 c3104) {
        InterfaceC23425 interfaceC23425;
        C23713 c23713;
        InterfaceC21449 m23960;
        C23713 c237132;
        InterfaceC15097 interfaceC15097;
        if (this.f66312 != null) {
            throw new IOException("Data source is already open");
        }
        C9315 c9315 = this.f66315;
        interfaceC23425 = c9315.f28263;
        String mo10986 = interfaceC23425.mo10986(c3104);
        C4515 m9467 = c3104.m9467();
        m9467.m13282(mo10986);
        m9467.m13279(c3104.f9710 | 4);
        C3104 m13278 = m9467.m13278();
        c23713 = c9315.f28261;
        C16197 m52285 = c23713.m52285();
        this.f66314 = c3104;
        this.f66311 = 0L;
        this.f66316 = m52285 != null;
        if (m52285 == null) {
            interfaceC15097 = c9315.f28260;
            m23960 = interfaceC15097.mo6247();
        } else {
            m23960 = C9315.m23960(c9315, m52285);
        }
        this.f66312 = m23960;
        m47149();
        try {
            return this.f66312.mo1620(m13278);
        } catch (IOException | RuntimeException e) {
            if (!m47148(e)) {
                throw e;
            }
            InterfaceC21449 interfaceC21449 = this.f66312;
            if (interfaceC21449 != null) {
                try {
                    interfaceC21449.close();
                } catch (IOException | RuntimeException unused) {
                }
            }
            this.f66312 = null;
            Throwable th = e;
            while (true) {
                if (th == null) {
                    break;
                }
                if (th instanceof C8248) {
                    c237132 = c9315.f28261;
                    c237132.m52287();
                    break;
                }
                th = th.getCause();
            }
            this.f66316 = false;
            return m47147(c3104, e);
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m47149() {
        if (this.f66312 != null) {
            Iterator it = this.f66313.iterator();
            while (it.hasNext()) {
                this.f66312.mo5937((InterfaceC0486) it.next());
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m47148(Exception exc) {
        boolean z;
        for (Exception exc2 = exc; exc2 != null; exc2 = exc2.getCause()) {
            if (exc2 instanceof C8248) {
                return true;
            }
            z = this.f66315.f28264;
            if (z && (exc2 instanceof C22510)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) {
        C23713 c23713;
        InterfaceC21449 interfaceC21449 = this.f66312;
        if (interfaceC21449 == null) {
            throw new IOException("Data source is not open");
        }
        try {
            int read = interfaceC21449.read(bArr, i, i2);
            if (read > 0) {
                this.f66311 += read;
            }
            return read;
        } catch (IOException | RuntimeException e) {
            if (!this.f66316 || !m47148(e)) {
                throw e;
            }
            C3104 c3104 = this.f66314;
            if (c3104 == null) {
                throw new IOException("Media data spec is missing");
            }
            InterfaceC21449 interfaceC214492 = this.f66312;
            if (interfaceC214492 != null) {
                try {
                    interfaceC214492.close();
                } catch (IOException | RuntimeException unused) {
                }
            }
            this.f66312 = null;
            Throwable th = e;
            while (true) {
                if (th == null) {
                    break;
                }
                if (th instanceof C8248) {
                    c23713 = this.f66315.f28261;
                    c23713.m52287();
                    break;
                }
                th = th.getCause();
            }
            this.f66316 = false;
            long j = this.f66311;
            long j2 = c3104.f9713;
            m47147(c3104.m9466(j, j2 != -1 ? j2 - j : -1L), e);
            int read2 = this.f66312.read(bArr, i, i2);
            if (read2 > 0) {
                this.f66311 += read2;
            }
            return read2;
        }
    }

    @Override // l.InterfaceC21449
    /* renamed from: ܿ */
    public final Uri mo1621() {
        InterfaceC21449 interfaceC21449 = this.f66312;
        if (interfaceC21449 == null) {
            return null;
        }
        return interfaceC21449.mo1621();
    }

    @Override // l.InterfaceC21449
    /* renamed from: ֫ */
    public final Map mo5936() {
        InterfaceC21449 interfaceC21449 = this.f66312;
        return interfaceC21449 == null ? Collections.EMPTY_MAP : interfaceC21449.mo5936();
    }

    @Override // l.InterfaceC21449
    public final void close() {
        boolean z;
        C23713 c23713;
        InterfaceC21449 interfaceC21449 = this.f66312;
        try {
            if (interfaceC21449 != null) {
                try {
                    interfaceC21449.close();
                } catch (IOException | RuntimeException e) {
                    if (this.f66316) {
                        boolean m47148 = m47148(e);
                        Exception exc = e;
                        if (m47148) {
                            while (true) {
                                if (exc == null) {
                                    z = false;
                                    break;
                                } else {
                                    if (exc instanceof C8248) {
                                        z = true;
                                        break;
                                    }
                                    exc = exc.getCause();
                                }
                            }
                            if (z) {
                                c23713 = this.f66315.f28261;
                                c23713.m52287();
                            }
                        }
                    }
                    throw e;
                }
            }
        } finally {
            this.f66312 = null;
            this.f66314 = null;
            this.f66311 = 0L;
            this.f66316 = false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m47147(C3104 c3104, Exception exc) {
        C9315 c9315;
        InterfaceC15097 interfaceC15097;
        InterfaceC15097 interfaceC150972;
        boolean z;
        InterfaceC15097 interfaceC150973;
        Exception exc2 = exc;
        while (true) {
            c9315 = this.f66315;
            if (exc2 == null) {
                interfaceC15097 = c9315.f28260;
                break;
            }
            if (exc2 instanceof C22510) {
                interfaceC15097 = c9315.f28262;
                break;
            }
            exc2 = exc2.getCause();
        }
        InterfaceC21449 mo6247 = interfaceC15097.mo6247();
        this.f66312 = mo6247;
        m47149();
        try {
            return mo6247.mo1620(c3104);
        } catch (IOException | RuntimeException e) {
            interfaceC150972 = c9315.f28262;
            if (interfaceC15097 != interfaceC150972) {
                z = c9315.f28264;
                if (z) {
                    for (Throwable th = e; th != null; th = th.getCause()) {
                        if (th instanceof C22510) {
                            try {
                                mo6247.close();
                            } catch (IOException | RuntimeException unused) {
                            }
                            interfaceC150973 = c9315.f28262;
                            InterfaceC21449 mo62472 = interfaceC150973.mo6247();
                            this.f66312 = mo62472;
                            m47149();
                            return mo62472.mo1620(c3104);
                        }
                    }
                }
            }
            throw e;
        }
    }
}
