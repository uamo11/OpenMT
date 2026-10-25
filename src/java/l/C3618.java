package l;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: A9YW */
/* renamed from: l.ۘ֨᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3618 implements InterfaceC18435 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f11463 = C11321.m27961(C3618.class);

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicLong f11464 = new AtomicLong(1);

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C17729 f11465;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C2207 f11466;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        m11101();
    }

    public C3618(C17729 c17729, C2207 c2207) {
        this.f11465 = c17729;
        c2207.m7332();
        this.f11466 = c2207;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C23373 m11098() {
        return this.f11466.m7340();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m11097() {
        this.f11466.m7331(this.f11465, (InterfaceC16359) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m11089(int i) {
        C23373 m7340 = this.f11466.m7340();
        try {
            if (m7340 != null) {
                C20552 m51804 = m7340.m51804();
                try {
                    boolean mo10548 = m51804.m47117().mo10548(i);
                    m51804.m19171();
                    m7340.m51813();
                    return mo10548;
                } finally {
                }
            }
            throw new C3037("Not connected");
        } catch (Throwable th) {
            if (m7340 != null) {
                try {
                    m7340.m51813();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m11095() {
        return this.f11466.m7341();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1023 m11094() {
        return this.f11466.m7338();
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final long m11099() {
        return this.f11466.m7339();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1543 m11087(InterfaceC7578 interfaceC7578, InterfaceC1543 interfaceC1543, EnumC0214... enumC0214Arr) {
        return this.f11466.m7327(this.f11465, interfaceC7578, interfaceC1543, enumC0214Arr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11088() {
        if (this.f11464.incrementAndGet() == 1) {
            this.f11466.m7332();
        }
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m11101() {
        long decrementAndGet = this.f11464.decrementAndGet();
        if (decrementAndGet == 0) {
            this.f11466.m7334();
        } else if (decrementAndGet < 0) {
            throw new C13017("Usage count dropped below zero");
        }
    }

    public final void finalize() {
        if (this.f11464.get() != 0) {
            f11463.mo7104("Tree handle was not properly released " + this.f11465.m41522());
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long m11092() {
        C23373 m7340 = this.f11466.m7340();
        try {
            C20552 m51804 = m7340.m51804();
            try {
                if (!(m51804.m47117() instanceof C8640)) {
                    m51804.m19171();
                    m7340.m51813();
                    return 0L;
                }
                long j = ((C8640) r2).m22410().f40398 * 1000 * 60;
                m51804.m19171();
                m7340.m51813();
                return j;
            } finally {
            }
        } catch (Throwable th) {
            if (m7340 != null) {
                try {
                    m7340.m51813();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m11093() {
        C23373 m7340 = this.f11466.m7340();
        try {
            C20552 m51804 = m7340.m51804();
            try {
                InterfaceC20594 m47117 = m51804.m47117();
                if (!(m47117 instanceof C8640)) {
                    m51804.m19171();
                    m7340.m51813();
                    return null;
                }
                String str = ((C8640) m47117).m22410().f40400;
                m51804.m19171();
                m7340.m51813();
                return str;
            } finally {
            }
        } catch (Throwable th) {
            if (m7340 != null) {
                try {
                    m7340.m51813();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int m11086() {
        return this.f11466.m7337();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m11090(InterfaceC18435 interfaceC18435) {
        if (!C12354.m29972(interfaceC18435)) {
            return false;
        }
        return this.f11466.m7333(((C3618) interfaceC18435).f11466);
    }

    public final int getSendBufferSize() {
        C23373 m7340 = this.f11466.m7340();
        try {
            C20552 m51804 = m7340.m51804();
            try {
                int sendBufferSize = m51804.m47117().getSendBufferSize();
                m51804.m19171();
                m7340.m51813();
                return sendBufferSize;
            } finally {
            }
        } catch (Throwable th) {
            if (m7340 != null) {
                try {
                    m7340.m51813();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m11091() {
        C23373 m7340 = this.f11466.m7340();
        try {
            C20552 m51804 = m7340.m51804();
            try {
                int mo10547 = m51804.m47117().mo10547();
                m51804.m19171();
                m7340.m51813();
                return mo10547;
            } finally {
            }
        } catch (Throwable th) {
            if (m7340 != null) {
                try {
                    m7340.m51813();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m11102() {
        C23373 m7340 = this.f11466.m7340();
        try {
            C20552 m51804 = m7340.m51804();
            try {
                int mo10544 = m51804.m47117().mo10544();
                m51804.m19171();
                m7340.m51813();
                return mo10544;
            } finally {
            }
        } catch (Throwable th) {
            if (m7340 != null) {
                try {
                    m7340.m51813();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m11096() {
        C23373 m7340 = this.f11466.m7340();
        try {
            C20552 m51804 = m7340.m51804();
            try {
                boolean mo10550 = m51804.m47117().mo10550();
                m51804.m19171();
                m7340.m51813();
                return mo10550;
            } finally {
            }
        } catch (Throwable th) {
            if (m7340 != null) {
                try {
                    m7340.m51813();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m11100() {
        try {
            C23373 m7340 = this.f11466.m7340();
            try {
                C20552 m51804 = m7340.m51804();
                try {
                    boolean m47112 = m51804.m47112();
                    m51804.m19171();
                    m7340.m51813();
                    return m47112;
                } finally {
                }
            } finally {
            }
        } catch (C3037 e) {
            f11463.mo7081("Failed to connect for determining SMB2 support", (Exception) e);
            return false;
        }
    }
}
