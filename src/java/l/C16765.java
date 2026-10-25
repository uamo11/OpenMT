package l;

import java.io.File;
import java.io.IOException;

/* compiled from: D70T */
/* renamed from: l.ܽܽܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16765 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C7429 f51468;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18177 f51469;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f51470;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f51471 = true;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f51472;

    public C16765(C18177 c18177, long j, long j2, C7429 c7429) {
        this.f51469 = c18177;
        this.f51472 = j;
        this.f51470 = j2;
        this.f51468 = c7429;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m39441() {
        long j;
        synchronized (this.f51469) {
            m39439();
            j = this.f51470;
        }
        return j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16059 m39444(InterfaceC17066 interfaceC17066) {
        C7429 c7429;
        synchronized (this.f51469) {
            m39439();
            c7429 = this.f51468;
        }
        InterfaceC17066 m38504 = C16360.m38504(interfaceC17066);
        if (!m38504.mo1526()) {
            m39440();
            C16059 c16059 = null;
            try {
                C16059 c160592 = new C16059(this.f51469.f56540, this.f51472, this.f51470, c7429.f22836, c7429.f22840);
                try {
                    c160592.m37969();
                    m39440();
                    if (m38504.mo1526()) {
                        throw new C23821();
                    }
                    return c160592;
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    c16059 = c160592;
                    if (c16059 != null) {
                        try {
                            c16059.close();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Error e4) {
                e = e4;
            } catch (RuntimeException e5) {
                e = e5;
            }
        } else {
            throw new C23821();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9711 m39443(int i, int i2, C10275 c10275) {
        C7429 c7429;
        C9711 c9711;
        synchronized (this.f51469) {
            m39439();
            C9005.m23246(this.f51468.m19966(), i, i2);
            c7429 = this.f51468;
        }
        InterfaceC17066 m38504 = C16360.m38504(c10275);
        if (!m38504.mo1526()) {
            m39440();
            C9711 c97112 = null;
            try {
                c9711 = new C9711(this.f51469.f56540, this.f51472, this.f51470, C18177.m42355(C19631.m45102(c7429.f22836, i, i2), m38504), C13510.m32541(c7429.f22840, i, i2));
            } catch (IOException e) {
                e = e;
            } catch (Error e2) {
                e = e2;
            } catch (RuntimeException e3) {
                e = e3;
            }
            try {
                c9711.m24679();
                m39440();
                if (m38504.mo1526()) {
                    throw new C23821();
                }
                return c9711;
            } catch (IOException | Error | RuntimeException e4) {
                e = e4;
                c97112 = c9711;
                if (c97112 != null) {
                    try {
                        c97112.close();
                    } catch (IOException e5) {
                        e.addSuppressed(e5);
                    }
                }
                throw e;
            }
        }
        throw new C23821();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m39440() {
        synchronized (this.f51469) {
            m39439();
        }
        this.f51469.m42396();
        synchronized (this.f51469) {
            m39439();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9711 m39442(int i, int i2, File file, C7512 c7512) {
        C7429 c7429;
        Throwable th;
        C9711 c9711;
        C9711 m42312;
        synchronized (this.f51469) {
            m39439();
            C9005.m23246(this.f51468.m19966(), i, i2);
            if (i2 > 33554432) {
                throw new C21978();
            }
            c7429 = this.f51468;
        }
        InterfaceC17066 m38504 = C16360.m38504(c7512);
        if (m38504.mo1526()) {
            throw new C23821();
        }
        try {
            c9711 = new C9711(this.f51469.f56540, this.f51472, this.f51470, C19631.m45102(c7429.f22836, i, i2), C13510.m32541(c7429.f22840, i, i2));
            try {
                m42312 = C18177.m42312(c9711, file, m38504);
                r5 = m42312 != c9711 ? c9711 : null;
            } catch (IOException e) {
                e = e;
            } catch (Error e2) {
                e = e2;
            } catch (RuntimeException e3) {
                e = e3;
            }
        } catch (IOException | Error | RuntimeException e4) {
            th = e4;
            c9711 = null;
        }
        try {
            synchronized (this.f51469) {
                m39439();
            }
            if (r5 != null) {
                r5.close();
            }
            return m42312;
        } catch (IOException | Error | RuntimeException e5) {
            e = e5;
            c9711 = r5;
            r5 = m42312;
            th = e;
            if (r5 != null) {
                try {
                    r5.close();
                } catch (IOException e6) {
                    th.addSuppressed(e6);
                }
            }
            if (c9711 == null) {
                throw th;
            }
            try {
                c9711.close();
                throw th;
            } catch (IOException e7) {
                th.addSuppressed(e7);
                throw th;
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m39439() {
        if (this.f51471) {
            long j = this.f51472;
            C18177 c18177 = this.f51469;
            if (j == c18177.f56547 && !c18177.f56538) {
                return;
            }
        }
        throw new IllegalStateException("VersionHandle is not active");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f51469) {
            if (this.f51471) {
                this.f51471 = false;
                this.f51469.f56548.remove(this);
                C18177.m42332(this.f51469.m42363());
            }
        }
    }
}
