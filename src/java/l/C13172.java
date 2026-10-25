package l;

import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: I1KV */
/* renamed from: l.۬ܳۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13172 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f39398;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39399;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f39400;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f39401;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7528 f39402;

    public C13172(ViewOnClickListenerC7528 viewOnClickListenerC7528, int i, HashSet hashSet, String str) {
        this.f39402 = viewOnClickListenerC7528;
        this.f39399 = i;
        this.f39401 = hashSet;
        this.f39398 = str;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C12366 c12366;
        ViewOnClickListenerC7528 viewOnClickListenerC7528 = this.f39402;
        c12366 = viewOnClickListenerC7528.f23168;
        c12366.m30051();
        C22933 c22933 = new C22933((AbstractActivityC3346) viewOnClickListenerC7528.requireActivity());
        c22933.m51049(R.string.MT_Protector_res_0x7f1208d2);
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        this.f39400 = c22933;
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C8918 c8918;
        C12366 c12366;
        C12366 c123662;
        C12366 c123663;
        ViewOnClickListenerC7528 viewOnClickListenerC7528 = this.f39402;
        String str = this.f39398;
        HashSet hashSet = this.f39401;
        int i = this.f39399;
        if (i == 0) {
            C19277 c19277 = new C19277(hashSet.size());
            C22933 c22933 = this.f39400;
            C11003.requireNonNull(c22933);
            c19277.m44459(new C23595(c22933));
            c8918 = new C8918(str);
            try {
                C13533 c13533 = new C13533(new BufferedOutputStream(c8918.m23007()));
                C22706 c22706 = new C22706();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (!this.f39400.m51053()) {
                        c19277.m44460(1);
                        c8918.m23012(str2 + ".smali");
                        c12366 = viewOnClickListenerC7528.f23168;
                        c22706.m50718();
                        c12366.m30029(str2, c22706);
                        c13533.append((CharSequence) c22706.m50717());
                        c13533.flush();
                    } else {
                        c8918.close();
                        return;
                    }
                }
                c8918.close();
                return;
            } finally {
            }
        }
        if (i == 1) {
            C19277 c192772 = new C19277(hashSet.size());
            C22933 c229332 = this.f39400;
            C11003.requireNonNull(c229332);
            c192772.m44459(new C23595(c229332));
            Iterator it2 = hashSet.iterator();
            C19357 c19357 = null;
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                if (this.f39400.m51053()) {
                    return;
                }
                c192772.m44460(1);
                c123662 = viewOnClickListenerC7528.f23168;
                InterfaceC13508 m30066 = c123662.m30066(str3);
                C11003.requireNonNull(m30066);
                if (c19357 == null) {
                    c19357 = m30066.mo31673().m44986();
                }
                c19357.m44606((InterfaceC8566) m30066.mo31669());
                if (c19357.m48536()) {
                    throw new C1637(R.string.MT_Protector_res_0x7f120286);
                }
            }
            if (c19357 != null) {
                c19357.m48534(new C1011(C16999.m39866(str, new String[0])));
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        C19277 c192773 = new C19277(hashSet.size());
        C22933 c229333 = this.f39400;
        C11003.requireNonNull(c229333);
        c192773.m44459(new C23595(c229333));
        C21473 c21473 = new C21473();
        c8918 = new C8918(str);
        try {
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                String str4 = (String) it3.next();
                if (!this.f39400.m51053()) {
                    c192773.m44460(1);
                    c123663 = viewOnClickListenerC7528.f23168;
                    InterfaceC13508 m300662 = c123663.m30066(str4);
                    C11003.requireNonNull(m300662);
                    C19357 m44986 = m300662.mo31673().m44986();
                    m44986.m44606((InterfaceC8566) m300662.mo31669());
                    c21473.m48623();
                    m44986.m48534(c21473);
                    byte[] m10122 = C3310.m10119(ByteBuffer.wrap(c21473.m48622(), 0, c21473.m48625())).m10122();
                    c8918.m23012(str4 + ".class");
                    c8918.write(m10122);
                } else {
                    c8918.close();
                    return;
                }
            }
            c8918.close();
        } finally {
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        if (this.f39400.m51053()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f12003d);
            C16999.m39866(this.f39398, new String[0]).mo23552();
            return;
        }
        C21374.m48457(R.string.MT_Protector_res_0x7f1208d1);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C3764 c3764;
        c3764 = this.f39402.f23162;
        c3764.m11384((Throwable) exc);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C12366 c12366;
        c12366 = this.f39402.f23168;
        c12366.m30061();
        this.f39400.m51051();
    }
}
