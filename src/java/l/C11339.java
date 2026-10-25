package l;

import bin.mt.plus.R;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: 28AQ */
/* renamed from: l.ۧ᩻᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11339 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC1025 f33915;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC3163 f33916;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public AbstractC3163 f33919;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC22560 f33920;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C13887 f33921;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15249 f33924;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f33926;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C20323 f33929;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f33922 = C16895.m39756();

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List f33927 = C16895.m39756();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f33918 = new ThreadLocal();

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f33917 = new ThreadLocal();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f33925 = new AtomicReference();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f33928 = C16895.m39756();

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f33923 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28011(AbstractC3163 abstractC3163, AbstractC3163 abstractC31632, String str, String[] strArr, String str2, InterfaceC1025 interfaceC1025) {
        this.f33916 = abstractC3163;
        this.f33919 = abstractC31632;
        this.f33915 = interfaceC1025;
        AbstractC15440 m39866 = C16999.m39866(str2, new String[0]);
        this.f33926 = m39866;
        m39866.mo23552();
        this.f33926.m36508();
        C7538 c7538 = new C7538(this, interfaceC1025);
        if (abstractC31632 == null) {
            C15249 m36218 = C15249.m36218(c7538);
            this.f33924 = m36218;
            if (!abstractC3163.f9955.f11350) {
                m36218.m36246();
            }
            this.f33924.m36240(strArr, abstractC3163);
        } else {
            if (!str.endsWith("/")) {
                str = str.concat("/");
            }
            this.f33923 = str.length();
            C15249 m36215 = C15249.m36215(str, abstractC31632, new C4586(false), c7538);
            this.f33924 = m36215;
            if (!abstractC3163.f9955.f11350 || !abstractC31632.f9955.f11350) {
                m36215.m36246();
            }
            this.f33924.m36241(strArr, abstractC3163, abstractC31632, interfaceC1025);
        }
        C20323 c20323 = this.f33929;
        if (c20323 != null) {
            this.f33924.m36237(c20323);
        }
        interfaceC1025.setTitle(R.string.MT_Protector_res_0x7f1202d0);
        interfaceC1025.mo3550(this.f33924);
        interfaceC1025.mo3551();
        C4300 c4300 = new C4300(0);
        this.f33921 = new C13887(this, interfaceC1025);
        this.f33920 = new C2166(this, interfaceC1025, c4300);
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(abstractC3163.m9704());
        c4300.m12878();
        Iterator it = this.f33924.m36248().iterator();
        while (it.hasNext()) {
            m28005(newFixedThreadPool, (AbstractC1139) it.next());
        }
        C1802.m5992(newFixedThreadPool);
        c4300.m12879();
        Iterator it2 = this.f33927.iterator();
        while (it2.hasNext()) {
            C0349.m1793((C8918) it2.next());
        }
        Exception exc = (Exception) this.f33925.get();
        if (exc != null) {
            throw exc;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m28007(C11339 c11339, InterfaceC1025 interfaceC1025) {
        return interfaceC1025.mo1526() || c11339.f33925.get() != null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28012(C20323 c20323) {
        this.f33929 = c20323;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28005(ExecutorService executorService, AbstractC1139 abstractC1139) {
        executorService.submit(new RunnableC15148(1, this, abstractC1139));
        if (abstractC1139.m3888()) {
            Iterator it = abstractC1139.mo1983().m1988().iterator();
            while (it.hasNext()) {
                m28005(executorService, (AbstractC1139) it.next());
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28006(C11339 c11339, AbstractC1139 abstractC1139) {
        ThreadLocal threadLocal = c11339.f33917;
        if (c11339.f33921.mo1526()) {
            return;
        }
        c11339.f33918.set(abstractC1139.m3898());
        c11339.f33915.setName(abstractC1139.m3898());
        try {
            C8918 c8918 = (C8918) threadLocal.get();
            if (c8918 == null) {
                AbstractC15440 m36535 = c11339.f33926.m36535(".zip");
                C8918 c89182 = new C8918(m36535);
                threadLocal.set(c89182);
                c11339.f33927.add(c89182);
                c11339.f33922.add(m36535);
                c8918 = c89182;
            }
            if (abstractC1139.m3888()) {
                C3545 c3545 = new C3545(abstractC1139.m3900().substring(c11339.f33923) + "/");
                c3545.setTime(abstractC1139.m3887());
                C18996.m43833(c3545, abstractC1139);
                c8918.m23013(c3545);
            } else {
                C3545 c35452 = (abstractC1139.m3879() && abstractC1139.m3908()) ? new C3545(c11339.f33919.mo9709(abstractC1139.m3900()).substring(c11339.f33923)) : new C3545(abstractC1139.m3900().substring(c11339.f33923));
                c35452.setTime(abstractC1139.m3887());
                C18996.m43833(c35452, abstractC1139);
                c8918.m23013(c35452);
                InterfaceC17889 m33351 = c11339.f33916.m33351(abstractC1139.m3910());
                if (!abstractC1139.m3909()) {
                    AbstractC3163 abstractC3163 = c11339.f33916;
                    abstractC3163.getClass();
                    C15688 c15688 = (C15688) m33351;
                    InputStream mo9681 = abstractC3163.mo9681(0L, c15688.getPath());
                    try {
                        if (mo9681 == null) {
                            c11339.f33915.mo3549();
                            if (mo9681 != null) {
                                mo9681.close();
                                return;
                            }
                            return;
                        }
                        C14176.m33825(mo9681, c8918.m23007(), c15688.getSize(), c11339.f33920);
                        mo9681.close();
                    } finally {
                    }
                }
            }
            c11339.f33924.m47715();
            if (abstractC1139.m3893() != null) {
                c11339.f33928.add((String) abstractC1139.m3893());
            }
            c11339.f33915.mo3550(c11339.f33924);
            c11339.f33915.setProgress(c11339.f33924.m47712());
        } catch (Exception e) {
            AtomicReference atomicReference = c11339.f33925;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m28010() {
        return new ArrayList(this.f33922);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m28013() {
        return this.f33928;
    }
}
