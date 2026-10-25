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

/* compiled from: I254 */
/* renamed from: l.ۡ᩺ܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C9193 extends AbstractC20250 {

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f27851 = 0;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public ExecutorService f27858;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public C15249 f27859;

    /* renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public String f27863;

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public boolean f27857 = C4925.m14321();

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public List f27865 = C16895.m39756();

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public AtomicReference f27854 = new AtomicReference();

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public List f27855 = C16895.m39756();

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C4300 f27864 = new C4300();

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public C22079 f27853 = new C22079();

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public ThreadLocal f27852 = new ThreadLocal();

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public C4586 f27856 = new C4586(false);

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public HashSet f27866 = new HashSet();

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public ReentrantLock f27861 = new ReentrantLock();

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC22560 f27862 = new C21188(this);

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public InterfaceC19485 f27860 = new C9899(this);

    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    public C17222 mo2780() {
        String[] m11558 = m11558("ARG_PATHS");
        String m11556 = m11556("targetPath");
        int i = C18844.f59431;
        C8966 m43532 = C18844.m43532(new File(m11556));
        this.f27863 = m11535("replacedName");
        if (m43532 != null && !m43532.m23116().f12780.isEmpty()) {
            this.f27858 = Executors.newSingleThreadExecutor();
        } else if (ApplicationC20075.f65010.getBoolean("optimize_external_storage_dt", true) && (C16247.m38212(m11558) || C16247.m38212(m11556))) {
            this.f27858 = Executors.newSingleThreadExecutor();
        } else {
            this.f27858 = Executors.newFixedThreadPool(3);
        }
        C17721.m41503(m11556, EnumC16309.MODIFY_DIRECTORY);
        C16999.m39866(m11556, new String[0]).m36508();
        C15249 m36216 = C15249.m36216(m11556, this.f27856, this.f27860);
        this.f27859 = m36216;
        m36216.m36236(this.f27863);
        this.f27859.m36242(m11558, (AbstractC13921) C2499.f7958, false, true);
        if (!this.f27859.m36243(true)) {
            cancel();
            return C17222.m40521();
        }
        m11536(R.string.MT_Protector_res_0x7f120200);
        mo23260(this.f27859);
        m46501(true);
        this.f27853.m49672();
        this.f27864.m12878();
        Iterator it = this.f27859.m36248().iterator();
        while (it.hasNext()) {
            m23626((AbstractC1139) it.next());
        }
        C1802.m5992(this.f27858);
        if (mo1526()) {
            return C17222.m40521();
        }
        AtomicReference atomicReference = this.f27854;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
        Iterator it2 = this.f27865.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        SystemClock.sleep(100L);
        return C17222.m40520();
    }

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76967;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        String str = this.f27863;
        return str != null ? C4925.m14306(R.string.MT_Protector_res_0x7f120a25, str) : C4925.m14306(R.string.MT_Protector_res_0x7f120a24, m11531("targetPath"));
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public void mo2782() {
        m11536(R.string.MT_Protector_res_0x7f120797);
        mo23259("...");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m23626(final AbstractC1139 abstractC1139) {
        this.f27858.submit(new Runnable() { // from class: l.ۜ᩺ܳ
            @Override // java.lang.Runnable
            public final void run() {
                AtomicReference atomicReference;
                C9193 c9193 = C9193.this;
                AtomicReference atomicReference2 = c9193.f27854;
                InterfaceC22560 interfaceC22560 = c9193.f27862;
                HashSet hashSet = c9193.f27866;
                C22079 c22079 = c9193.f27853;
                ReentrantLock reentrantLock = c9193.f27861;
                boolean mo1526 = c9193.mo1526();
                AbstractC1139 abstractC11392 = abstractC1139;
                if (mo1526 || atomicReference2.get() != null) {
                    abstractC11392.m3891();
                    return;
                }
                String m3898 = abstractC11392.m3898();
                String str = c9193.f27863;
                if (str != null && m3898.startsWith(str.concat("/"))) {
                    m3898 = m3898.substring(str.length() + 1);
                }
                c9193.f27852.set(m3898);
                c9193.mo23259(m3898);
                abstractC11392.m3899();
                try {
                    try {
                        if (abstractC11392.m3909()) {
                            AbstractC15440 m3890 = abstractC11392.m3890();
                            AbstractC15440 m3892 = abstractC11392.m3892();
                            c22079.m49673(m3892, EnumC16309.MODIFY_FILE);
                            C20402.m46727(m3890.mo27935(), m3892.mo23554());
                        } else if (!abstractC11392.m3888()) {
                            AbstractC15440 m38902 = abstractC11392.m3890();
                            AbstractC15440 m38922 = abstractC11392.m3892();
                            reentrantLock.lock();
                            if (!abstractC11392.m3879() && (m38922.mo23120() || hashSet.contains(m38922.mo23554()))) {
                                abstractC11392.m3903(true);
                                if (c9193.f27856.mo13496()) {
                                    atomicReference = atomicReference2;
                                    try {
                                        c9193.f27856.mo13491(abstractC11392.m3898(), C22306.m50047(abstractC11392.m3913(), abstractC11392.m3887()), C22306.m50048(m38922), m38922.mo29016());
                                    } catch (Exception e) {
                                        e = e;
                                        AtomicReference atomicReference3 = atomicReference;
                                        while (!atomicReference3.compareAndSet(null, e) && atomicReference3.get() == null) {
                                        }
                                        if (reentrantLock.isHeldByCurrentThread()) {
                                            reentrantLock.unlock();
                                        }
                                        abstractC11392.m3891();
                                        return;
                                    }
                                }
                                if (c9193.f27856.mo1526()) {
                                    c9193.cancel();
                                    return;
                                }
                                r12 = c9193.f27856.mo13493() == 1;
                                if (c9193.f27856.mo13493() == 2) {
                                    abstractC11392.m3911();
                                } else {
                                    C17558 c17558 = new C17558();
                                    c17558.m41050(m38922);
                                    abstractC11392.m3885(c17558.m41049());
                                }
                                if (c9193.f27856.mo13493() == 0 && c9193.f27856.mo13494() && m38922.mo29016()) {
                                    abstractC11392.m3897(true);
                                }
                            }
                            if (!r12 && (abstractC11392.m3908() || !C16999.m39878(m38902.mo23554(), m38922.mo23554()))) {
                                if (!abstractC11392.m3879()) {
                                    c22079.m49673(m38922, EnumC16309.MODIFY_FILE);
                                    hashSet.add(m38922.mo23554());
                                    reentrantLock.unlock();
                                    m38902.m36500(m38922, abstractC11392.m3901(), interfaceC22560);
                                } else if (abstractC11392.m3908()) {
                                    while (true) {
                                        m38922 = m38922.m36492(true);
                                        if (!m38922.mo23120() && !hashSet.contains(m38922.mo23554())) {
                                            break;
                                        }
                                    }
                                    c22079.m49673(m38922, EnumC16309.MODIFY_FILE);
                                    hashSet.add(m38922.mo23554());
                                    reentrantLock.unlock();
                                    m38902.m36500(m38922, abstractC11392.m3901(), interfaceC22560);
                                    if (abstractC11392.m3893() != null) {
                                        abstractC11392.m3907(m38922.getName());
                                    }
                                } else {
                                    c22079.m49673(m38922, EnumC16309.MODIFY_FILE);
                                    if (abstractC11392.m3880()) {
                                        m38922.mo29017(c9193);
                                    }
                                    hashSet.add(m38922.mo23554());
                                    reentrantLock.unlock();
                                    m38902.m36500(m38922, (C17558) null, interfaceC22560);
                                    C17558 m3901 = abstractC11392.m3901();
                                    if (m3901 != null) {
                                        m3901.m41052(m38922);
                                    }
                                }
                            }
                            reentrantLock.unlock();
                        } else if (!abstractC11392.m3879()) {
                            AbstractC15440 m38923 = abstractC11392.m3892();
                            c22079.m49673(m38923, EnumC16309.MODIFY_FILE);
                            m38923.m36508();
                            C17558 m39012 = abstractC11392.m3901();
                            if (m39012 != null) {
                                m39012.m41052(m38923);
                            }
                            if (c9193.f27857 && m38923.mo27912()) {
                                c9193.f27865.add(new RunnableC16203(2, m38923, abstractC11392));
                            }
                        }
                        if (reentrantLock.isHeldByCurrentThread()) {
                            reentrantLock.unlock();
                        }
                        abstractC11392.m3891();
                        c9193.f27859.m47715();
                        if (!abstractC11392.m3888()) {
                            C14463.m34554(abstractC11392.m3900(), true);
                        }
                        if (abstractC11392.m3893() != null) {
                            c9193.f27855.add((String) abstractC11392.m3893());
                        }
                        c9193.mo23260(c9193.f27859);
                        c9193.mo11538(c9193.f27859.m47712());
                    } catch (Exception e2) {
                        e = e2;
                        atomicReference = atomicReference2;
                    }
                } finally {
                    if (reentrantLock.isHeldByCurrentThread()) {
                        reentrantLock.unlock();
                    }
                    abstractC11392.m3891();
                }
            }
        });
        if (abstractC1139.m3888()) {
            Iterator it = abstractC1139.mo1983().m1988().iterator();
            while (it.hasNext()) {
                m23626((AbstractC1139) it.next());
            }
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39041();
        }
        List list = this.f27855;
        if (list.isEmpty() || !m11525(c165602)) {
            return;
        }
        c165602.m39000((Collection) list);
        c165602.m39015();
        if (this.f27863 != null) {
            c16560.m39000((Collection) list);
            c16560.m39015();
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public void mo2781(C17222 c17222) {
        if (!this.f27858.isShutdown()) {
            this.f27858.shutdownNow();
        }
        this.f27864.m12879();
        C15528.m36596();
    }
}
