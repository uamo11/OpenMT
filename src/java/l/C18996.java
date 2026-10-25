package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: V8BV */
/* renamed from: l.ᩴ᩶᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18996 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC4179 f59872;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15249 f59873;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f59874;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC13921 f59875;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43837(AbstractC15440 abstractC15440, AbstractC13921 abstractC13921, String[] strArr, InterfaceC4179 interfaceC4179) {
        this.f59875 = abstractC13921;
        this.f59872 = interfaceC4179;
        boolean z = false;
        if (strArr.length == 1 && !strArr[0].endsWith("/")) {
            z = true;
        }
        this.f59874 = z;
        C15249 m36218 = C15249.m36218(new C9824(interfaceC4179));
        this.f59873 = m36218;
        m36218.m36240(strArr, abstractC13921);
        C8918 c8918 = new C8918(abstractC15440);
        try {
            c8918.m23018(36);
            if (abstractC13921.mo7652()) {
                m43834(c8918);
            } else {
                Iterator it = this.f59873.m36248().iterator();
                while (it.hasNext()) {
                    m43835(c8918, (AbstractC1139) it.next());
                }
            }
            c8918.close();
        } catch (Throwable th) {
            try {
                c8918.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43833(C3545 c3545, AbstractC1139 abstractC1139) {
        C15538 c15538 = new C15538();
        if (abstractC1139.m3909()) {
            c15538.m36634(abstractC1139.m3906());
        }
        C18264 m3904 = abstractC1139.m3904();
        if (m3904 != null) {
            c15538.m36633(Integer.valueOf(m3904.f56795));
        }
        c3545.m10775(c15538);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43835(C8918 c8918, AbstractC1139 abstractC1139) {
        if (this.f59872.mo1526()) {
            return;
        }
        this.f59873.m47715();
        InterfaceC4179 interfaceC4179 = this.f59872;
        this.f59873.m47714();
        this.f59873.getClass();
        interfaceC4179.mo12627(abstractC1139);
        if (!this.f59874) {
            this.f59872.getClass();
            this.f59872.setProgress(this.f59873.m47712());
        }
        if (abstractC1139.m3888()) {
            C3545 c3545 = new C3545(abstractC1139.m3900() + "/");
            c3545.setTime(abstractC1139.m3887());
            m43833(c3545, abstractC1139);
            c8918.m23013(c3545);
        } else {
            C3545 c35452 = new C3545(abstractC1139.m3900());
            c35452.setTime(abstractC1139.m3887());
            m43833(c35452, abstractC1139);
            c8918.m23013(c35452);
            InterfaceC17889 m33351 = this.f59875.m33351(abstractC1139.m3910());
            if (abstractC1139.m3909()) {
                this.f59872.getClass();
            } else if (!this.f59874) {
                InputStream mo7636 = this.f59875.mo7636((AbstractActivityC3346) null, m33351);
                try {
                    if (mo7636 == null) {
                        this.f59872.mo12626();
                        if (mo7636 != null) {
                            mo7636.close();
                            return;
                        }
                        return;
                    }
                    C14176.m33825(mo7636, c8918.m23007(), ((C15688) m33351).getSize(), new C9118(this));
                    mo7636.close();
                } catch (Throwable th) {
                    if (mo7636 != null) {
                        try {
                            mo7636.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } else {
                C19404 mo28347 = this.f59875.mo28347(m33351);
                try {
                    if (mo28347 == null) {
                        this.f59872.mo12626();
                        if (mo28347 != null) {
                            mo28347.close();
                            return;
                        }
                        return;
                    }
                    C19277 m44686 = mo28347.m44686();
                    InterfaceC4179 interfaceC41792 = this.f59872;
                    C11003.requireNonNull(interfaceC41792);
                    m44686.m44459(new C6290(interfaceC41792));
                    OutputStream m23007 = c8918.m23007();
                    final InterfaceC4179 interfaceC41793 = this.f59872;
                    C11003.requireNonNull(interfaceC41793);
                    C14176.m33825(mo28347, m23007, -1L, new InterfaceC5627() { // from class: l.᩷᩶᩻
                        @Override // l.InterfaceC5627
                        /* renamed from: ᩷֫ */
                        public final /* synthetic */ void mo1648() {
                            throw null;
                        }

                        @Override // l.InterfaceC17066
                        /* renamed from: ᩻ */
                        public final boolean mo1526() {
                            return InterfaceC4179.this.mo1526();
                        }
                    });
                    mo28347.close();
                } catch (Throwable th3) {
                    if (mo28347 != null) {
                        try {
                            mo28347.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            }
            this.f59873.m47708(abstractC1139.mo1987().m3913());
        }
        if (!this.f59872.mo1526() && abstractC1139.m3888()) {
            Iterator it = abstractC1139.mo1983().m1988().iterator();
            while (it.hasNext()) {
                m43835(c8918, (AbstractC1139) it.next());
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43834(C8918 c8918) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList(this.f59873.m36248());
        while (!linkedList.isEmpty()) {
            AbstractC1139 abstractC1139 = (AbstractC1139) linkedList.removeFirst();
            if (abstractC1139.m3888()) {
                arrayList.add(abstractC1139.mo1983());
                linkedList.addAll(0, abstractC1139.mo1983().m1988());
            } else {
                hashMap.put(this.f59875.m33351(abstractC1139.m3910()), abstractC1139.mo1987());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0433 c0433 = (C0433) it.next();
            this.f59873.m47715();
            InterfaceC4179 interfaceC4179 = this.f59872;
            this.f59873.m47714();
            this.f59873.getClass();
            interfaceC4179.mo12627(c0433);
            C3545 c3545 = new C3545(c0433.m3900() + "/");
            c3545.setTime(c0433.m3887());
            m43833(c3545, c0433);
            c8918.m23013(c3545);
            if (this.f59872.mo1526()) {
                return;
            }
        }
        IOException[] iOExceptionArr = {null};
        this.f59875.mo7640(hashMap.keySet(), new C2768(this, hashMap, c8918, iOExceptionArr));
        IOException iOException = iOExceptionArr[0];
        if (iOException != null) {
            throw iOException;
        }
    }
}
