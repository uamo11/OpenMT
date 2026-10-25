package l;

import android.os.SystemClock;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: E2B3 */
/* renamed from: l.ܽ۟ܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C16497 extends AbstractC20250 {

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f50694 = 0;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public ExecutorService f50701;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public C15249 f50702;

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public boolean f50700 = C4925.m14321();

    /* renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public List f50705 = C16895.m39756();

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public AtomicReference f50697 = new AtomicReference();

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public List f50698 = C16895.m39756();

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C4300 f50707 = new C4300();

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public C22079 f50696 = new C22079();

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public ThreadLocal f50695 = new ThreadLocal();

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public C4586 f50699 = new C4586(true);

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public HashSet f50708 = new HashSet();

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public ReentrantLock f50704 = new ReentrantLock();

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC22560 f50706 = new C1681(this);

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public InterfaceC19485 f50703 = new C10854(this);

    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    public C17222 mo2780() {
        String[] m11558 = m11558("ARG_PATHS");
        String m11535 = m11535("sourcePath");
        String m11556 = m11556("targetPath");
        int i = C18844.f59431;
        C8966 m43532 = C18844.m43532(new File(m11556));
        if (m43532 != null && !m43532.m23116().f12780.isEmpty()) {
            this.f50701 = Executors.newSingleThreadExecutor();
        } else if (ApplicationC20075.f65010.getBoolean("optimize_external_storage_dt", true) && (C16247.m38212(m11558) || C16247.m38212(m11556))) {
            this.f50701 = Executors.newSingleThreadExecutor();
        } else {
            this.f50701 = Executors.newFixedThreadPool(3);
        }
        boolean z = this instanceof C19038;
        if (z) {
            C17721.m41503(m11556, EnumC16309.MODIFY_DIRECTORY);
        } else {
            EnumC16309 enumC16309 = EnumC16309.MODIFY_DIRECTORY;
            C17721.m41505(C1493.m5161(m11535, enumC16309), C1493.m5161(m11556, enumC16309));
        }
        C16999.m39866(m11556, new String[0]).m36508();
        C15249 m36216 = C15249.m36216(m11556, this.f50699, this.f50703);
        this.f50702 = m36216;
        m36216.m36238(m11558);
        for (AbstractC1139 abstractC1139 : this.f50702.m36244()) {
            if (abstractC1139.m3893() != null) {
                this.f50698.add((String) abstractC1139.m3893());
                if (abstractC1139.m3888()) {
                    if (!z) {
                        C14463.m34559(abstractC1139.m3910());
                    }
                    m38859(abstractC1139.m3892());
                } else {
                    if (!z) {
                        C14463.m34560(abstractC1139.m3910());
                    }
                    C14463.m34554(abstractC1139.m3900(), true);
                }
            }
        }
        mo23260(this.f50702);
        m46501(true);
        this.f50696.m49672();
        this.f50707.m12878();
        Iterator it = this.f50702.m36248().iterator();
        while (it.hasNext()) {
            m38858((AbstractC1139) it.next());
        }
        C1802.m5992(this.f50701);
        if (mo1526()) {
            return C17222.m40521();
        }
        AtomicReference atomicReference = this.f50697;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
        Iterator it2 = this.f50702.m36248().iterator();
        while (it2.hasNext()) {
            C17909.m41888((AbstractC1139) it2.next());
        }
        Iterator it3 = this.f50705.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        SystemClock.sleep(100L);
        return C17222.m40520();
    }

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76966;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector_res_0x7f120a2c, m11531("targetPath"));
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public void mo2782() {
        m11536(R.string.MT_Protector_res_0x7f120647);
        mo23259("...");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m38858(final AbstractC1139 abstractC1139) {
        this.f50701.submit(new Runnable() { // from class: l.۟ܰܳ
            @Override // java.lang.Runnable
            public final void run() {
                AtomicReference atomicReference;
                C16497 c16497 = C16497.this;
                AtomicReference atomicReference2 = c16497.f50697;
                InterfaceC22560 interfaceC22560 = c16497.f50706;
                HashSet hashSet = c16497.f50708;
                C22079 c22079 = c16497.f50696;
                ReentrantLock reentrantLock = c16497.f50704;
                boolean mo1526 = c16497.mo1526();
                AbstractC1139 abstractC11392 = abstractC1139;
                if (mo1526 || atomicReference2.get() != null) {
                    abstractC11392.m3891();
                    return;
                }
                c16497.f50695.set(abstractC11392.m3898());
                c16497.mo23259(abstractC11392.m3898());
                abstractC11392.m3899();
                try {
                    try {
                        if (abstractC11392.m3909()) {
                            AbstractC15440 m3890 = abstractC11392.m3890();
                            AbstractC15440 m3892 = abstractC11392.m3892();
                            c22079.m49674(m3890.m36514(), EnumC16309.MODIFY_DIRECTORY, m3892, EnumC16309.MODIFY_FILE);
                            if (abstractC11392.m3879()) {
                                m3892.mo27929();
                            }
                            if (!abstractC11392.m3889() || !m3890.mo23551(m3892)) {
                                C20402.m46727(m3890.mo27935(), m3892.mo23554());
                                if (c16497.mo1526()) {
                                    return;
                                } else {
                                    m3890.mo27929();
                                }
                            }
                        } else if (abstractC11392.m3888()) {
                            if (!abstractC11392.m3879()) {
                                C17558 c17558 = new C17558();
                                c17558.m41050(abstractC11392.m3890());
                                AbstractC15440 m38922 = abstractC11392.m3892();
                                c22079.m49673(m38922, EnumC16309.MODIFY_FILE);
                                m38922.m36508();
                                c17558.m41052(m38922);
                                if (c16497.f50700 && m38922.mo27912()) {
                                    c16497.f50705.add(new RunnableC12086(2, m38922, abstractC11392));
                                }
                            }
                            c22079.m49673(abstractC11392.m3890().m36514(), EnumC16309.MODIFY_DIRECTORY);
                        } else {
                            AbstractC15440 m38902 = abstractC11392.m3890();
                            AbstractC15440 m38923 = abstractC11392.m3892();
                            reentrantLock.lock();
                            if (!abstractC11392.m3879() && (m38923.mo23120() || hashSet.contains(m38923.mo23554().toLowerCase()))) {
                                abstractC11392.m3903(true);
                                if (c16497.f50699.mo13496()) {
                                    atomicReference = atomicReference2;
                                    try {
                                        c16497.f50699.mo13491(abstractC11392.m3898(), C22306.m50047(abstractC11392.m3913(), abstractC11392.m3887()), C22306.m50048(m38923), false);
                                    } catch (Exception e) {
                                        e = e;
                                        while (true) {
                                            AtomicReference atomicReference3 = atomicReference;
                                            if (atomicReference3.compareAndSet(null, e) || atomicReference3.get() != null) {
                                                break;
                                            } else {
                                                atomicReference = atomicReference3;
                                            }
                                        }
                                        if (reentrantLock.isHeldByCurrentThread()) {
                                            reentrantLock.unlock();
                                        }
                                        abstractC11392.m3891();
                                        return;
                                    }
                                }
                                if (c16497.f50699.mo1526()) {
                                    c16497.cancel();
                                    if (reentrantLock.isHeldByCurrentThread()) {
                                        reentrantLock.unlock();
                                    }
                                    abstractC11392.m3891();
                                    return;
                                }
                                r12 = c16497.f50699.mo13493() == 1;
                                if (c16497.f50699.mo13493() == 2) {
                                    abstractC11392.m3911();
                                } else {
                                    C17558 c175582 = new C17558();
                                    c175582.m41050(m38923);
                                    abstractC11392.m3885(c175582.m41049());
                                }
                                if (c16497.f50699.mo13493() == 0 && c16497.f50699.mo13494() && m38923.mo29016()) {
                                    abstractC11392.m3897(true);
                                }
                            }
                            if (r12) {
                                reentrantLock.unlock();
                            } else if (!abstractC11392.m3879()) {
                                c22079.m49674(m38902.m36514(), EnumC16309.MODIFY_DIRECTORY, m38923, EnumC16309.MODIFY_FILE);
                                hashSet.add(m38923.mo23554().toLowerCase());
                                reentrantLock.unlock();
                                m38902.m36500(m38923, new C17558(), interfaceC22560);
                                if (c16497.mo1526()) {
                                    if (reentrantLock.isHeldByCurrentThread()) {
                                        reentrantLock.unlock();
                                    }
                                    abstractC11392.m3891();
                                    return;
                                }
                                m38902.mo27929();
                            } else if (abstractC11392.m3908()) {
                                while (true) {
                                    m38923 = m38923.m36492(true);
                                    if (!m38923.mo23120() && !hashSet.contains(m38923.mo23554().toLowerCase())) {
                                        break;
                                    }
                                }
                                c22079.m49674(m38902.m36514(), EnumC16309.MODIFY_DIRECTORY, m38923, EnumC16309.MODIFY_FILE);
                                hashSet.add(m38923.mo23554().toLowerCase());
                                reentrantLock.unlock();
                                if (abstractC11392.m3889() && m38902.mo23551(m38923)) {
                                    c16497.f50702.m47708(abstractC11392.mo1987().m3913());
                                } else {
                                    m38902.m36500(m38923, new C17558(), interfaceC22560);
                                    if (c16497.mo1526()) {
                                        if (reentrantLock.isHeldByCurrentThread()) {
                                            reentrantLock.unlock();
                                        }
                                        abstractC11392.m3891();
                                        return;
                                    }
                                    m38902.mo27929();
                                }
                                if (abstractC11392.m3893() != null) {
                                    abstractC11392.m3907(m38923.getName());
                                }
                            } else {
                                c22079.m49674(m38902.m36514(), EnumC16309.MODIFY_DIRECTORY, m38923, EnumC16309.MODIFY_FILE);
                                C17558 c175583 = new C17558();
                                c175583.m41048(abstractC11392.m3904());
                                c175583.m41047();
                                hashSet.add(m38923.mo23554().toLowerCase());
                                reentrantLock.unlock();
                                if (abstractC11392.m3880()) {
                                    m38923.mo29017(c16497);
                                } else {
                                    m38923.mo27929();
                                }
                                if (abstractC11392.m3889() && m38902.mo23551(m38923)) {
                                    c16497.f50702.m47708(abstractC11392.mo1987().m3913());
                                    c175583.m41052(m38923);
                                } else {
                                    m38902.m36500(m38923, c175583, interfaceC22560);
                                    if (c16497.mo1526()) {
                                        if (reentrantLock.isHeldByCurrentThread()) {
                                            reentrantLock.unlock();
                                        }
                                        abstractC11392.m3891();
                                        return;
                                    }
                                    m38902.mo27929();
                                }
                            }
                        }
                        if (reentrantLock.isHeldByCurrentThread()) {
                            reentrantLock.unlock();
                        }
                        abstractC11392.m3891();
                        c16497.f50702.m47715();
                        if (!abstractC11392.m3888()) {
                            if (!(c16497 instanceof C19038)) {
                                C14463.m34560(abstractC11392.m3910());
                            }
                            C14463.m34554(abstractC11392.m3900(), true);
                        }
                        if (abstractC11392.m3893() != null) {
                            c16497.f50698.add((String) abstractC11392.m3893());
                        }
                        c16497.mo23260(c16497.f50702);
                        c16497.mo11538(c16497.f50702.m47712());
                    } finally {
                        if (reentrantLock.isHeldByCurrentThread()) {
                            reentrantLock.unlock();
                        }
                        abstractC11392.m3891();
                    }
                } catch (Exception e2) {
                    e = e2;
                    atomicReference = atomicReference2;
                }
            }
        });
        if (abstractC1139.m3888()) {
            Iterator it = abstractC1139.mo1983().m1988().iterator();
            while (it.hasNext()) {
                m38858((AbstractC1139) it.next());
            }
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39041();
        }
        List list = this.f50698;
        if (list.isEmpty() || !m11525(c165602)) {
            return;
        }
        c165602.m39000((Collection) list);
        c165602.m39015();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m38859(AbstractC15440 abstractC15440) {
        for (AbstractC15440 abstractC154402 : abstractC15440.mo23549(true)) {
            if (abstractC154402.mo23113()) {
                m38859(abstractC154402);
            } else {
                C14463.m34554(abstractC154402.mo23554(), true);
            }
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public void mo2781(C17222 c17222) {
        if (!this.f50701.isShutdown()) {
            this.f50701.shutdownNow();
        }
        this.f50707.m12879();
        C15528.m36596();
        C9068.m23429();
    }
}
