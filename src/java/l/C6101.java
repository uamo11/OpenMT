package l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: F70U */
/* renamed from: l.ۛܰܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6101 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f18686;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f18687;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C8841 f18688;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Throwable f18689;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f18690;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f18692;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23034 f18693;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public EnumC10335 f18694 = EnumC10335.PENDING;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f18691 = Long.MIN_VALUE;

    public C6101(C23034 c23034, AbstractC15440 abstractC15440) {
        this.f18693 = c23034;
        this.f18687 = abstractC15440;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final BufferedOutputStream m17020() {
        synchronized (C23034.class) {
            m17009();
        }
        C23034.m51176(this.f18687, "Hex pending state file is unsafe");
        return new BufferedOutputStream(this.f18687.mo23555(false));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17014(C8841 c8841) {
        synchronized (C23034.class) {
            m17009();
            if (this.f18688 != null) {
                throw new IllegalStateException("Hex checkpoint view is already installed");
            }
            this.f18688 = c8841;
            this.f18691 = c8841.m22843();
            this.f18686 = true;
            C23034.class.notifyAll();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17012(long j) {
        synchronized (C23034.class) {
            m17009();
            this.f18691 = j;
            this.f18686 = true;
            C23034.class.notifyAll();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m17016() {
        long j;
        synchronized (C23034.class) {
            if (!this.f18686) {
                throw new IllegalStateException("Hex checkpoint generation is unavailable");
            }
            j = this.f18691;
        }
        return j;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C8841 m17017() {
        C8841 c8841;
        synchronized (C23034.class) {
            m17009();
            c8841 = this.f18688;
            if (c8841 == null) {
                throw new IOException("Hex checkpoint view is unavailable");
            }
            this.f18688 = null;
        }
        return c8841;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m17019() {
        synchronized (C23034.class) {
            m17009();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17015(boolean z) {
        AbstractC15440 abstractC15440;
        HashMap hashMap;
        String str;
        synchronized (C23034.class) {
            m17009();
            if (!this.f18687.mo23119() || this.f18687.m36533()) {
                throw new IOException("Hex pending state file is unavailable");
            }
            AbstractC15440 abstractC154402 = this.f18687;
            abstractC15440 = this.f18693.f74128;
            if (!abstractC154402.mo23551(abstractC15440)) {
                throw new IOException("Unable to commit pending hex checkpoint");
            }
            hashMap = C23034.f74123;
            str = this.f18693.f74131;
            C13843.remove(hashMap, str, this);
            this.f18694 = EnumC10335.COMMITTED;
            C23034.class.notifyAll();
        }
        if (z) {
            C23034.m51189(this.f18693);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17013(Throwable th) {
        HashMap hashMap;
        String str;
        HashMap hashMap2;
        String str2;
        synchronized (C23034.class) {
            hashMap = C23034.f74123;
            str = this.f18693.f74131;
            boolean z = hashMap.get(str) == this;
            C8841 c8841 = this.f18688;
            IOException e = null;
            this.f18688 = null;
            if (c8841 != null) {
                try {
                    c8841.close();
                } catch (IOException e2) {
                    e = e2;
                }
            }
            e = null;
            try {
                C23034.m51186(this.f18687);
            } catch (IOException e3) {
                e = e3;
            }
            if (e == null) {
                e = e;
            } else if (e != null) {
                e.addSuppressed(e);
            }
            if (z) {
                try {
                    if (this.f18690) {
                        this.f18693.m51178();
                    } else {
                        this.f18693.m51179();
                    }
                } catch (IOException e4) {
                    if (e == null) {
                        e = e4;
                    } else {
                        e.addSuppressed(e4);
                    }
                }
                hashMap2 = C23034.f74123;
                str2 = this.f18693.f74131;
                C13843.remove(hashMap2, str2, this);
            }
            if (this.f18694 == EnumC10335.PENDING) {
                this.f18694 = this.f18692 ? EnumC10335.DISCARDED : EnumC10335.FAILED;
                this.f18689 = th;
            }
            if (e != null) {
                Throwable th2 = this.f18689;
                if (th2 == null) {
                    this.f18689 = e;
                } else {
                    th2.addSuppressed(e);
                }
            }
            C23034.class.notifyAll();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC10335 m17011(InterfaceC17066 interfaceC17066) {
        EnumC10335 enumC10335;
        synchronized (C23034.class) {
            while (this.f18694 == EnumC10335.PENDING) {
                C23034.m51177(interfaceC17066);
                try {
                    C23034.class.wait(100L);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new IOException("Interrupted while waiting for hex checkpoint", e);
                }
            }
            C23034.m51177(interfaceC17066);
            enumC10335 = this.f18694;
        }
        return enumC10335;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final IOException m17010() {
        IOException iOException;
        synchronized (C23034.class) {
            iOException = new IOException(this.f18694 == EnumC10335.DISCARDED ? "Hex checkpoint write was discarded" : "Hex checkpoint write failed");
            Throwable th = this.f18689;
            if (th != null) {
                iOException.initCause(th);
            }
        }
        return iOException;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m17018() {
        return this.f18694 == EnumC10335.PENDING && !this.f18692;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m17008(C6101 c6101) {
        if (c6101.f18694 == EnumC10335.PENDING) {
            c6101.f18694 = EnumC10335.SUPERSEDED;
            C8841 c8841 = c6101.f18688;
            IOException e = null;
            c6101.f18688 = null;
            if (c8841 != null) {
                try {
                    c8841.close();
                } catch (IOException e2) {
                    e = e2;
                }
            }
            if (e != null) {
                Throwable th = c6101.f18689;
                if (th == null) {
                    c6101.f18689 = e;
                } else {
                    th.addSuppressed(e);
                }
            }
            C23034.class.notifyAll();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17006(C6101 c6101, boolean z) {
        c6101.f18692 = true;
        c6101.f18690 = z | c6101.f18690;
        C8841 c8841 = c6101.f18688;
        IOException e = null;
        c6101.f18688 = null;
        if (c8841 != null) {
            try {
                c8841.close();
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e != null) {
            Throwable th = c6101.f18689;
            if (th == null) {
                c6101.f18689 = e;
            } else {
                th.addSuppressed(e);
            }
        }
        C23034.class.notifyAll();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m17009() {
        HashMap hashMap;
        String str;
        if (this.f18694 == EnumC10335.PENDING && !this.f18692) {
            hashMap = C23034.f74123;
            str = this.f18693.f74131;
            if (hashMap.get(str) == this) {
                return;
            }
        }
        throw new IOException("Hex checkpoint write was canceled");
    }
}
