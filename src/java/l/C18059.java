package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: HAYQ */
/* renamed from: l.ᩳ۫᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C18059 implements InterfaceC10318, InterfaceC9593 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f56270 = AtomicReferenceFieldUpdater.newUpdater(C18059.class, Object.class, "_state");
    public volatile /* synthetic */ Object _parentHandle;
    public volatile /* synthetic */ Object _state;

    /* renamed from: ֫ */
    public String mo26920() {
        return "Job was cancelled";
    }

    /* renamed from: ۡ */
    public boolean mo3349() {
        return false;
    }

    /* renamed from: ۧ */
    public boolean mo22960(Throwable th) {
        return false;
    }

    /* renamed from: ܺ */
    public void mo34675() {
    }

    /* renamed from: ܽ */
    public void mo3351(Object obj) {
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean mo42129() {
        return true;
    }

    public C18059(boolean z) {
        this._state = z ? C17353.f53157 : C17353.f53156;
        this._parentHandle = null;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0017 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m42119(l.C18059 r3, l.C11004 r4, l.C2269 r5, java.lang.Object r6) {
        /*
            r3.getClass()
            l.ۖۗ᩵ r5 = m42117(r5)
            if (r5 == 0) goto L20
        L9:
            l.ᩳ۫᩵ r0 = r5.f7361
            l.֫۫᩵ r1 = new l.֫۫᩵
            r1.<init>(r3, r4, r5, r6)
            r2 = 1
            l.ۡ۬᩵ r0 = l.C13139.m31869(r0, r1, r2)
            l.ۜ۫᩵ r1 = l.C6770.f21025
            if (r0 == r1) goto L1a
            return
        L1a:
            l.ۖۗ᩵ r5 = m42117(r5)
            if (r5 != 0) goto L9
        L20:
            java.lang.Object r4 = r3.m42116(r4, r6)
            r3.mo3351(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18059.m42119(l.ᩳ۫᩵, l.ۧ۫᩵, l.ۖۗ᩵, java.lang.Object):void");
    }

    @Override // l.InterfaceC18330
    public final InterfaceC17624 getKey() {
        return C12434.f37427;
    }

    @Override // l.InterfaceC14801
    /* renamed from: ֫ */
    public final InterfaceC18330 mo9082(InterfaceC17624 interfaceC17624) {
        C11233.m27805(interfaceC17624, "key");
        if (C11233.m27802(C12434.f37427, interfaceC17624)) {
            return this;
        }
        return null;
    }

    @Override // l.InterfaceC14801
    /* renamed from: ֫ */
    public final Object mo13850(Object obj, InterfaceC19763 interfaceC19763) {
        return interfaceC19763.mo6973(obj, this);
    }

    /* renamed from: ᩳ */
    public void mo3352(Object obj) {
        mo3351(obj);
    }

    @Override // l.InterfaceC14801
    /* renamed from: ֫ */
    public final InterfaceC14801 mo13851(InterfaceC14801 interfaceC14801) {
        return C16918.m39767(this, interfaceC14801);
    }

    @Override // l.InterfaceC14801
    /* renamed from: ۧ */
    public final InterfaceC14801 mo9085(InterfaceC17624 interfaceC17624) {
        return C16918.m39768(this, interfaceC17624);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m42120(InterfaceC20196 interfaceC20196, Object obj) {
        InterfaceC15673 interfaceC15673 = (InterfaceC15673) this._parentHandle;
        if (interfaceC15673 != null) {
            interfaceC15673.mo12010();
            this._parentHandle = C6770.f21025;
        }
        C5091 c5091 = null;
        C18497 c18497 = obj instanceof C18497 ? (C18497) obj : null;
        Throwable th = c18497 != null ? c18497.f57332 : null;
        if (interfaceC20196 instanceof AbstractC7495) {
            try {
                ((AbstractC7495) interfaceC20196).mo1250(th);
                return;
            } catch (Throwable th2) {
                mo26921(new C5091("Exception in completion handler " + interfaceC20196 + " for " + this, th2));
                return;
            }
        }
        C23703 mo20125 = interfaceC20196.mo20125();
        if (mo20125 != null) {
            for (C20697 c20697 = (C20697) mo20125.m47316(); !C11233.m27802(c20697, mo20125); c20697 = c20697.m47312()) {
                if (c20697 instanceof AbstractC7495) {
                    AbstractC7495 abstractC7495 = (AbstractC7495) c20697;
                    try {
                        abstractC7495.mo1250(th);
                    } catch (Throwable th3) {
                        if (c5091 == null) {
                            c5091 = new C5091("Exception in completion handler " + abstractC7495 + " for " + this, th3);
                            C8058 c8058 = C8058.f24861;
                        } else {
                            C10881.m27179(c5091, th3);
                        }
                    }
                }
            }
            if (c5091 != null) {
                mo26921(c5091);
            }
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC15673 m42131() {
        return (InterfaceC15673) this._parentHandle;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42126(InterfaceC10318 interfaceC10318) {
        C6770 c6770 = C6770.f21025;
        if (interfaceC10318 == null) {
            this._parentHandle = c6770;
            return;
        }
        interfaceC10318.start();
        InterfaceC15673 mo26068 = interfaceC10318.mo26068(this);
        this._parentHandle = mo26068;
        if (m42127() instanceof InterfaceC20196) {
            return;
        }
        mo26068.mo12010();
        this._parentHandle = c6770;
    }

    @Override // l.InterfaceC10318
    public final boolean start() {
        C15961 c15961;
        while (true) {
            Object m42127 = m42127();
            boolean z = m42127 instanceof C15961;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56270;
            if (z) {
                if (((C15961) m42127).mo20124()) {
                    return false;
                }
                c15961 = C17353.f53157;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, m42127, c15961)) {
                    if (atomicReferenceFieldUpdater.get(this) != m42127) {
                        break;
                    }
                }
                mo34675();
                return true;
            }
            if (!(m42127 instanceof C22312)) {
                return false;
            }
            C23703 mo20125 = ((C22312) m42127).mo20125();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, m42127, mo20125)) {
                if (atomicReferenceFieldUpdater.get(this) != m42127) {
                    break;
                }
            }
            mo34675();
            return true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42125(AbstractC7495 abstractC7495) {
        C15961 c15961;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            Object m42127 = m42127();
            if (!(m42127 instanceof AbstractC7495)) {
                if (!(m42127 instanceof InterfaceC20196) || ((InterfaceC20196) m42127).mo20125() == null) {
                    return;
                }
                abstractC7495.m47311();
                return;
            }
            if (m42127 != abstractC7495) {
                return;
            }
            c15961 = C17353.f53157;
            do {
                atomicReferenceFieldUpdater = f56270;
                if (atomicReferenceFieldUpdater.compareAndSet(this, m42127, c15961)) {
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == m42127);
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object m42128(Object obj) {
        Object m42115;
        C15050 c15050;
        C15050 c150502;
        do {
            m42115 = m42115(m42127(), obj);
            c15050 = C17353.f53152;
            if (m42115 != c15050) {
                c150502 = C17353.f53153;
            } else {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C18497 c18497 = obj instanceof C18497 ? (C18497) obj : null;
                throw new IllegalStateException(str, c18497 != null ? c18497.f57332 : null);
            }
        } while (m42115 == c150502);
        return m42115;
    }

    @Override // l.InterfaceC10318
    /* renamed from: ܽ */
    public boolean mo26070() {
        Object m42127 = m42127();
        return (m42127 instanceof InterfaceC20196) && ((InterfaceC20196) m42127).mo20124();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final Object m42116(C11004 c11004, Object obj) {
        Throwable th = null;
        C18497 c18497 = obj instanceof C18497 ? (C18497) obj : null;
        Throwable th2 = c18497 != null ? c18497.f57332 : null;
        synchronized (c11004) {
            c11004.m27325();
            ArrayList<Throwable> m27324 = c11004.m27324(th2);
            if (!m27324.isEmpty()) {
                Iterator it = m27324.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        th = next;
                        break;
                    }
                }
                th = th;
                if (th == null) {
                    th = (Throwable) m27324.get(0);
                }
            } else if (c11004.m27325()) {
                th = new C6084(mo26920(), null, this);
            }
            if (th != null && m27324.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(m27324.size()));
                for (Throwable th3 : m27324) {
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        C10881.m27179(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C18497(th, false);
        }
        if (th != null && (m42123(th) || mo22960(th))) {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            }
            ((C18497) obj).m42997();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56270;
        Object c4673 = obj instanceof InterfaceC20196 ? new C4673((InterfaceC20196) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c11004, c4673) && atomicReferenceFieldUpdater.get(this) == c11004) {
        }
        m42120((InterfaceC20196) c11004, obj);
        return obj;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private final boolean m42123(Throwable th) {
        if (!mo3349()) {
            boolean z = th instanceof CancellationException;
            InterfaceC15673 interfaceC15673 = (InterfaceC15673) this._parentHandle;
            return (interfaceC15673 == null || interfaceC15673 == C6770.f21025) ? z : interfaceC15673.mo7498(th) || z;
        }
        return true;
    }

    @Override // l.InterfaceC10318
    /* renamed from: ᩳ */
    public final CancellationException mo26071() {
        CancellationException cancellationException;
        Object m42127 = m42127();
        if (!(m42127 instanceof C11004)) {
            if (m42127 instanceof InterfaceC20196) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(m42127 instanceof C18497)) {
                return new C6084(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C18497) m42127).f57332;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new C6084(mo26920(), th, this) : cancellationException;
        }
        Throwable m27322 = ((C11004) m42127).m27322();
        if (m27322 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = m27322 instanceof CancellationException ? (CancellationException) m27322 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = mo26920();
        }
        return new C6084(concat, m27322, this);
    }

    @Override // l.InterfaceC10318
    /* renamed from: ֫ */
    public final InterfaceC8907 mo26067(boolean z, boolean z2, AbstractC7495 abstractC7495) {
        AbstractC7495 abstractC74952;
        Throwable th;
        int m47308;
        boolean z3;
        if (z) {
            AbstractC11729 abstractC11729 = abstractC7495 instanceof AbstractC11729 ? (AbstractC11729) abstractC7495 : null;
            if (abstractC11729 == null) {
                abstractC11729 = new C3262(abstractC7495);
            }
            abstractC74952 = abstractC11729;
        } else {
            abstractC74952 = abstractC7495;
        }
        abstractC74952.f23084 = this;
        loop0: while (true) {
            Object m42127 = m42127();
            if (m42127 instanceof C15961) {
                C15961 c15961 = (C15961) m42127;
                if (c15961.mo20124()) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f56270;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, m42127, abstractC74952)) {
                        if (atomicReferenceFieldUpdater.get(this) != m42127) {
                            break;
                        }
                    }
                    break loop0;
                }
                C23703 c23703 = new C23703();
                InterfaceC20196 c22312 = c15961.mo20124() ? c23703 : new C22312(c23703);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f56270;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, c15961, c22312) && atomicReferenceFieldUpdater2.get(this) == c15961) {
                }
            } else {
                if (!(m42127 instanceof InterfaceC20196)) {
                    if (z2) {
                        C18497 c18497 = m42127 instanceof C18497 ? (C18497) m42127 : null;
                        abstractC7495.invoke(c18497 != null ? c18497.f57332 : null);
                    }
                    return C6770.f21025;
                }
                InterfaceC20196 interfaceC20196 = (InterfaceC20196) m42127;
                C23703 mo20125 = interfaceC20196.mo20125();
                if (mo20125 != null) {
                    InterfaceC8907 interfaceC8907 = C6770.f21025;
                    if (z && (m42127 instanceof C11004)) {
                        synchronized (m42127) {
                            th = ((C11004) m42127).m27322();
                            if (th == null || ((abstractC7495 instanceof C2269) && !((C11004) m42127).m27327())) {
                                C16647 c16647 = new C16647(abstractC74952, this, (InterfaceC20196) m42127);
                                while (true) {
                                    int m473082 = mo20125.m47315().m47308(abstractC74952, mo20125, c16647);
                                    if (m473082 == 1) {
                                        z3 = true;
                                        break;
                                    }
                                    if (m473082 == 2) {
                                        z3 = false;
                                        break;
                                    }
                                }
                                if (z3) {
                                    if (th == null) {
                                        return abstractC74952;
                                    }
                                    interfaceC8907 = abstractC74952;
                                }
                            }
                            C8058 c8058 = C8058.f24861;
                        }
                    } else {
                        th = null;
                    }
                    if (th == null) {
                        C16647 c166472 = new C16647(abstractC74952, this, interfaceC20196);
                        do {
                            m47308 = mo20125.m47315().m47308(abstractC74952, mo20125, c166472);
                            if (m47308 == 1) {
                                break loop0;
                            }
                        } while (m47308 != 2);
                    } else {
                        if (z2) {
                            abstractC7495.invoke(th);
                        }
                        return interfaceC8907;
                    }
                } else {
                    AbstractC7495 abstractC74953 = (AbstractC7495) m42127;
                    abstractC74953.m47309(new C23703());
                    C20697 m47312 = abstractC74953.m47312();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f56270;
                    while (!atomicReferenceFieldUpdater3.compareAndSet(this, abstractC74953, m47312) && atomicReferenceFieldUpdater3.get(this) == abstractC74953) {
                    }
                }
            }
        }
        return abstractC74952;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m42121(C23703 c23703, Throwable th) {
        C5091 c5091 = null;
        for (C20697 c20697 = (C20697) c23703.m47316(); !C11233.m27802(c20697, c23703); c20697 = c20697.m47312()) {
            if (c20697 instanceof AbstractC11729) {
                AbstractC7495 abstractC7495 = (AbstractC7495) c20697;
                try {
                    abstractC7495.mo1250(th);
                } catch (Throwable th2) {
                    if (c5091 == null) {
                        c5091 = new C5091("Exception in completion handler " + abstractC7495 + " for " + this, th2);
                        C8058 c8058 = C8058.f24861;
                    } else {
                        C10881.m27179(c5091, th2);
                    }
                }
            }
        }
        if (c5091 != null) {
            mo26921(c5091);
        }
        m42123(th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 == l.C17353.f53155) goto L76;
     */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m42130(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18059.m42130(java.lang.Object):boolean");
    }

    @Override // l.InterfaceC10318
    /* renamed from: ֫ */
    public final void mo26069(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C6084(mo26920(), null, this);
        }
        m42130(cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // l.InterfaceC9593
    /* renamed from: ᩻ */
    public final CancellationException mo24530() {
        CancellationException cancellationException;
        Object m42127 = m42127();
        if (m42127 instanceof C11004) {
            cancellationException = ((C11004) m42127).m27322();
        } else if (m42127 instanceof C18497) {
            cancellationException = ((C18497) m42127).f57332;
        } else {
            if (m42127 instanceof InterfaceC20196) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + m42127).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new C6084("Parent job is ".concat(m42122(m42127)), cancellationException, this) : cancellationException2;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private final Throwable m42124(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C6084(mo26920(), null, this) : th;
        }
        if (obj != null) {
            return ((InterfaceC9593) obj).mo24530();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final C23703 m42118(InterfaceC20196 interfaceC20196) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C23703 mo20125 = interfaceC20196.mo20125();
        if (mo20125 != null) {
            return mo20125;
        }
        if (interfaceC20196 instanceof C15961) {
            return new C23703();
        }
        if (!(interfaceC20196 instanceof AbstractC7495)) {
            throw new IllegalStateException(("State should have list: " + interfaceC20196).toString());
        }
        AbstractC7495 abstractC7495 = (AbstractC7495) interfaceC20196;
        abstractC7495.m47309(new C23703());
        C20697 m47312 = abstractC7495.m47312();
        do {
            atomicReferenceFieldUpdater = f56270;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC7495, m47312)) {
                return null;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC7495);
        return null;
    }

    /* JADX WARN: Incorrect condition in loop: B:62:0x00d3 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m42115(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18059.m42115(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2269 m42117(C20697 c20697) {
        while (c20697.mo40262()) {
            c20697 = c20697.m47315();
        }
        while (true) {
            c20697 = c20697.m47312();
            if (!c20697.mo40262()) {
                if (c20697 instanceof C2269) {
                    return (C2269) c20697;
                }
                if (c20697 instanceof C23703) {
                    return null;
                }
            }
        }
    }

    @Override // l.InterfaceC10318
    /* renamed from: ֫ */
    public final InterfaceC15673 mo26068(C18059 c18059) {
        InterfaceC8907 mo26067;
        mo26067 = mo26067((r4 & 1) == 0, (r4 & 2) != 0, new C2269(c18059));
        return (InterfaceC15673) mo26067;
    }

    /* renamed from: ֫ */
    public void mo26921(C5091 c5091) {
        throw c5091;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + m42122(m42127()) + '}');
        sb.append('@');
        sb.append(C11024.m27354(this));
        return sb.toString();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static String m42122(Object obj) {
        if (!(obj instanceof C11004)) {
            return obj instanceof InterfaceC20196 ? ((InterfaceC20196) obj).mo20124() ? "Active" : "New" : obj instanceof C18497 ? "Cancelled" : "Completed";
        }
        C11004 c11004 = (C11004) obj;
        return c11004.m27325() ? "Cancelling" : c11004.m27327() ? "Completing" : "Active";
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Object m42127() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof AbstractC19286)) {
                return obj;
            }
            ((AbstractC19286) obj).mo33080(this);
        }
    }
}
