package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Z72R */
/* renamed from: l.֨ۚܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0914 extends AbstractC6138 implements InterfaceC3444 {

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public volatile String f3499;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public volatile long f3500;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f3501 = new AtomicBoolean();

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static final Semaphore f3498 = new Semaphore(1, true);

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static final C1769 f3497 = ConcurrentMapC10942.newKeySet();

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3270(AbstractActivityC3346 abstractActivityC3346, C17222 c17222, boolean z) {
    }

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76958;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        String str = this.f3499;
        return str == null ? m11556("archiveName") : str;
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector_res_0x7f1200da);
        m11555(R.string.MT_Protector_res_0x7f1200e2);
        mo11538(0);
    }

    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    public final C17222 mo2780() {
        C17222 m40520;
        String m14327;
        try {
            if (m11543().containsKey("sourceTempLease")) {
                this.f3500 = m11527("sourceTempLease");
            }
            AbstractC13921 m11526 = m11526();
            String m39854 = C16996.m39854(m11526);
            C1769 c1769 = f3497;
            if (!c1769.add(m39854)) {
                String m143272 = C4925.m14327(R.string.MT_Protector_res_0x7f1200dc);
                this.f3499 = m143272;
                C17222 m40518 = C17222.m40518(m143272);
                m3269();
                return m40518;
            }
            try {
                Semaphore semaphore = f3498;
                boolean tryAcquire = semaphore.tryAcquire();
                if (!tryAcquire) {
                    String m143273 = C4925.m14327(R.string.MT_Protector_res_0x7f1200db);
                    this.f3499 = m143273;
                    C17222 m405182 = C17222.m40518(m143273);
                    if (tryAcquire) {
                        semaphore.release();
                    }
                    c1769.remove(m39854);
                    m3269();
                    return m405182;
                }
                try {
                    C1474 m39851 = C16996.m39851(m11526);
                    C6266 m39839 = C16996.m39839(m11526, this);
                    if (m39839.m17276() != EnumC10647.CANCELED && !m3271()) {
                        if (!m39851.m5103(m11526)) {
                            String m143274 = C4925.m14327(R.string.MT_Protector_res_0x7f1200df);
                            this.f3499 = m143274;
                            C17222 m405183 = C17222.m40518(m143274);
                            if (tryAcquire) {
                                semaphore.release();
                            }
                            c1769.remove(m39854);
                            m3269();
                            return m405183;
                        }
                        int i = C5148.f16089[m39839.m17276().ordinal()];
                        if (i == 1) {
                            m40520 = C17222.m40520();
                        } else if (i != 2) {
                            if (i == 3) {
                                m14327 = m39839.m17274() == null ? C4925.m14327(R.string.MT_Protector_res_0x7f1200dd) : C4925.m14306(R.string.MT_Protector_res_0x7f1200de, m39839.m17274());
                                this.f3499 = m14327;
                            } else if (i == 4) {
                                m14327 = C4925.m14327(R.string.MT_Protector_res_0x7f1200e1);
                                this.f3499 = m14327;
                            } else {
                                if (i != 5) {
                                    throw new IncompatibleClassChangeError();
                                }
                                Exception iOException = m39839.m17275() == null ? new IOException("Archive test failed") : m39839.m17275();
                                this.f3499 = iOException.getMessage();
                                m40520 = C17222.m40517(iOException);
                            }
                            m40520 = C17222.m40518(m14327);
                        } else {
                            m40520 = C17222.m40521();
                        }
                        if (tryAcquire) {
                            semaphore.release();
                        }
                        c1769.remove(m39854);
                        m3269();
                        return m40520;
                    }
                    C17222 m40521 = C17222.m40521();
                    if (tryAcquire) {
                        semaphore.release();
                    }
                    c1769.remove(m39854);
                    m3269();
                    return m40521;
                } catch (IOException unused) {
                    String m143275 = C4925.m14327(R.string.MT_Protector_res_0x7f1200df);
                    this.f3499 = m143275;
                    C17222 m405184 = C17222.m40518(m143275);
                    if (tryAcquire) {
                        f3498.release();
                    }
                    f3497.remove(m39854);
                    m3269();
                    return m405184;
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    f3498.release();
                }
                f3497.remove(m39854);
                throw th;
            }
        } catch (Throwable th2) {
            m3269();
            throw th2;
        }
    }

    @Override // l.AbstractC3817
    public final void cancel() {
        this.f3501.set(true);
        super.cancel();
    }

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final boolean m3271() {
        return this.f3501.get() || mo1526();
    }

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    private void m3269() {
        long j = this.f3500;
        if (j != 0) {
            this.f3500 = 0L;
            AbstractC16891.m39726(j);
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        m3269();
        if (c17222.m40526()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1200e0);
        }
    }
}
