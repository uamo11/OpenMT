package l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: H4Y9 */
/* renamed from: l.᩷ۡ֫, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20765 extends AbstractC7379 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f67247;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public EnumC13728 f67248;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f67249;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10467 f67250;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f67251;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f67252;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final WeakReference f67253;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ArrayList f67254;

    @Override // l.AbstractC7379
    /* renamed from: ֫ */
    public final void mo19833(InterfaceC14413 interfaceC14413) {
        InterfaceC23586 interfaceC23586;
        C11233.m27805(interfaceC14413, "observer");
        m47433("addObserver");
        EnumC13728 enumC13728 = this.f67248;
        EnumC13728 enumC137282 = EnumC13728.DESTROYED;
        if (enumC13728 != enumC137282) {
            enumC137282 = EnumC13728.INITIALIZED;
        }
        C6653 c6653 = new C6653(interfaceC14413, enumC137282);
        if (((C6653) this.f67250.mo26347(interfaceC14413, c6653)) == null && (interfaceC23586 = (InterfaceC23586) this.f67253.get()) != null) {
            boolean z = this.f67247 != 0 || this.f67251;
            EnumC13728 m47436 = m47436(interfaceC14413);
            this.f67247++;
            while (c6653.m18172().compareTo(m47436) < 0 && this.f67250.m26348(interfaceC14413)) {
                EnumC13728 m18172 = c6653.m18172();
                ArrayList arrayList = this.f67254;
                arrayList.add(m18172);
                C5968 c5968 = EnumC22901.f73834;
                EnumC13728 m181722 = c6653.m18172();
                c5968.getClass();
                EnumC22901 m16709 = C5968.m16709(m181722);
                if (m16709 == null) {
                    throw new IllegalStateException("no event up from " + c6653.m18172());
                }
                c6653.m18173(interfaceC23586, m16709);
                arrayList.remove(arrayList.size() - 1);
                m47436 = m47436(interfaceC14413);
            }
            if (!z) {
                m47434();
            }
            this.f67247--;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47438(EnumC22901 enumC22901) {
        C11233.m27805(enumC22901, "event");
        m47433("handleLifecycleEvent");
        m47435(enumC22901.m50989());
    }

    @Override // l.AbstractC7379
    /* renamed from: ۧ */
    public final void mo19834(InterfaceC14413 interfaceC14413) {
        C11233.m27805(interfaceC14413, "observer");
        m47433("removeObserver");
        this.f67250.remove(interfaceC14413);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47437(EnumC13728 enumC13728) {
        C11233.m27805(enumC13728, "state");
        m47433("setCurrentState");
        m47435(enumC13728);
    }

    public C20765(InterfaceC23586 interfaceC23586) {
        new AtomicReference();
        this.f67249 = true;
        this.f67250 = new C10467();
        this.f67248 = EnumC13728.INITIALIZED;
        this.f67254 = new ArrayList();
        this.f67253 = new WeakReference(interfaceC23586);
    }

    @Override // l.AbstractC7379
    /* renamed from: ֫ */
    public final EnumC13728 mo19832() {
        return this.f67248;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final void m47435(EnumC13728 enumC13728) {
        EnumC13728 enumC137282 = this.f67248;
        if (enumC137282 == enumC13728) {
            return;
        }
        if (enumC137282 == EnumC13728.INITIALIZED && enumC13728 == EnumC13728.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.f67248 + " in component " + this.f67253.get()).toString());
        }
        this.f67248 = enumC13728;
        if (this.f67251 || this.f67247 != 0) {
            this.f67252 = true;
            return;
        }
        this.f67251 = true;
        m47434();
        this.f67251 = false;
        if (this.f67248 == EnumC13728.DESTROYED) {
            this.f67250 = new C10467();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private final EnumC13728 m47436(InterfaceC14413 interfaceC14413) {
        C6653 c6653;
        Map.Entry m26346 = this.f67250.m26346(interfaceC14413);
        EnumC13728 m18172 = (m26346 == null || (c6653 = (C6653) m26346.getValue()) == null) ? null : c6653.m18172();
        ArrayList arrayList = this.f67254;
        EnumC13728 enumC13728 = arrayList.isEmpty() ? null : (EnumC13728) C18566.m43105(arrayList, 1);
        EnumC13728 enumC137282 = this.f67248;
        C11233.m27805(enumC137282, "state1");
        if (m18172 == null || m18172.compareTo(enumC137282) >= 0) {
            m18172 = enumC137282;
        }
        return (enumC13728 == null || enumC13728.compareTo(m18172) >= 0) ? m18172 : enumC13728;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final void m47434() {
        InterfaceC23586 interfaceC23586 = (InterfaceC23586) this.f67253.get();
        if (interfaceC23586 != null) {
            while (this.f67250.size() != 0) {
                Map.Entry m27763 = this.f67250.m27763();
                C11233.m27799(m27763);
                EnumC13728 m18172 = ((C6653) m27763.getValue()).m18172();
                Map.Entry m27765 = this.f67250.m27765();
                C11233.m27799(m27765);
                EnumC13728 m181722 = ((C6653) m27765.getValue()).m18172();
                if (m18172 == m181722 && this.f67248 == m181722) {
                    break;
                }
                this.f67252 = false;
                EnumC13728 enumC13728 = this.f67248;
                Map.Entry m277632 = this.f67250.m27763();
                C11233.m27799(m277632);
                int compareTo = enumC13728.compareTo(((C6653) m277632.getValue()).m18172());
                ArrayList arrayList = this.f67254;
                if (compareTo < 0) {
                    Iterator descendingIterator = this.f67250.descendingIterator();
                    while (descendingIterator.hasNext() && !this.f67252) {
                        Map.Entry entry = (Map.Entry) descendingIterator.next();
                        C11233.m27803(entry, "next()");
                        InterfaceC14413 interfaceC14413 = (InterfaceC14413) entry.getKey();
                        C6653 c6653 = (C6653) entry.getValue();
                        while (c6653.m18172().compareTo(this.f67248) > 0 && !this.f67252 && this.f67250.m26348(interfaceC14413)) {
                            C5968 c5968 = EnumC22901.f73834;
                            EnumC13728 m181723 = c6653.m18172();
                            c5968.getClass();
                            EnumC22901 m16708 = C5968.m16708(m181723);
                            if (m16708 != null) {
                                arrayList.add(m16708.m50989());
                                c6653.m18173(interfaceC23586, m16708);
                                arrayList.remove(arrayList.size() - 1);
                            } else {
                                throw new IllegalStateException("no event down from " + c6653.m18172());
                            }
                        }
                    }
                }
                Map.Entry m277652 = this.f67250.m27765();
                if (!this.f67252 && m277652 != null && this.f67248.compareTo(((C6653) m277652.getValue()).m18172()) > 0) {
                    C13993 m27764 = this.f67250.m27764();
                    while (m27764.hasNext() && !this.f67252) {
                        Map.Entry entry2 = (Map.Entry) m27764.next();
                        InterfaceC14413 interfaceC144132 = (InterfaceC14413) entry2.getKey();
                        C6653 c66532 = (C6653) entry2.getValue();
                        while (c66532.m18172().compareTo(this.f67248) < 0 && !this.f67252 && this.f67250.m26348(interfaceC144132)) {
                            arrayList.add(c66532.m18172());
                            C5968 c59682 = EnumC22901.f73834;
                            EnumC13728 m181724 = c66532.m18172();
                            c59682.getClass();
                            EnumC22901 m16709 = C5968.m16709(m181724);
                            if (m16709 == null) {
                                throw new IllegalStateException("no event up from " + c66532.m18172());
                            }
                            c66532.m18173(interfaceC23586, m16709);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            }
            this.f67252 = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m47433(String str) {
        if (this.f67249 && !C4822.m14046().m14048()) {
            throw new IllegalStateException(C4860.m14172("Method ", str, " must be called on the main thread").toString());
        }
    }
}
