package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: 29QV */
/* renamed from: l.ۘۘۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3687 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2318 f11635;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f11636;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f11637;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f11638;

    public C3687(int i) {
        int i2 = C21368.f68833;
        this.f11635 = new C2318(16);
        this.f11638 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19210 m11236() {
        return m11228(false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19210 m11242() {
        return m11228(true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C19210 m11228(boolean z) {
        if (this.f11635.isEmpty()) {
            return C19210.m44302();
        }
        this.f11638 = false;
        C2318 c2318 = this.f11635;
        if (this.f11637) {
            c2318 = C19210.m44292((C21368) c2318, false, false);
            m11230(c2318, z);
        }
        C19210 c19210 = new C19210(c2318, 0);
        c19210.f60478 = this.f11636;
        return c19210;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11230(C2318 c2318, boolean z) {
        for (int i = 0; i < c2318.m48427(); i++) {
            Map.Entry m48428 = c2318.m48428(i);
            m48428.setValue(m11227((InterfaceC18504) m48428.getKey(), m48428.getValue(), z));
        }
        for (Map.Entry entry : c2318.m48429()) {
            entry.setValue(m11227((InterfaceC18504) entry.getKey(), entry.getValue(), z));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m11227(InterfaceC18504 interfaceC18504, Object obj, boolean z) {
        if (obj == null || interfaceC18504.mo1140() != EnumC1694.MESSAGE) {
            return obj;
        }
        if (interfaceC18504.mo1129()) {
            if (!(obj instanceof List)) {
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
            }
            List list = (List) obj;
            for (int i = 0; i < list.size(); i++) {
                Object obj2 = list.get(i);
                Object m11226 = m11226(obj2, z);
                if (m11226 != obj2) {
                    if (list == obj) {
                        list = new ArrayList(list);
                    }
                    list.set(i, m11226);
                }
            }
            return list;
        }
        return m11226(obj, z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m11226(Object obj, boolean z) {
        if (!(obj instanceof InterfaceC9228)) {
            return obj;
        }
        InterfaceC9228 interfaceC9228 = (InterfaceC9228) obj;
        if (z) {
            return interfaceC9228.buildPartial();
        }
        return interfaceC9228.build();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Map m11244() {
        C2318 m44292;
        if (!this.f11636) {
            return this.f11635.m48430() ? this.f11635 : C20195.unmodifiableMap(this.f11635);
        }
        m44292 = C19210.m44292((C21368) this.f11635, false, true);
        if (this.f11635.m48430()) {
            m44292.mo7575();
            return m44292;
        }
        m11230(m44292, true);
        return m44292;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m11245(C0117 c0117) {
        if (c0117.mo1129()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f11635.get(c0117) != null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m11241(C0117 c0117) {
        return m11227((InterfaceC18504) c0117, m11234((InterfaceC18504) c0117), true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m11234(InterfaceC18504 interfaceC18504) {
        Object obj = this.f11635.get(interfaceC18504);
        return obj instanceof C9081 ? ((C9081) obj).m23442() : obj;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m11232() {
        C2318 m44292;
        if (this.f11638) {
            return;
        }
        m44292 = C19210.m44292((C21368) this.f11635, true, false);
        this.f11635 = m44292;
        this.f11638 = true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11243(C0117 c0117, Object obj) {
        m11232();
        if (c0117.mo1129()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                m11231((InterfaceC18504) c0117, next);
                this.f11637 = this.f11637 || (next instanceof InterfaceC9228);
            }
            obj = arrayList;
        } else {
            m11231((InterfaceC18504) c0117, obj);
        }
        if (obj instanceof C9081) {
            this.f11636 = true;
        }
        this.f11637 = this.f11637 || (obj instanceof InterfaceC9228);
        this.f11635.m48425(c0117, obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11237(C0117 c0117) {
        m11232();
        this.f11635.remove(c0117);
        if (this.f11635.isEmpty()) {
            this.f11636 = false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m11233(C0117 c0117, int i) {
        if (this.f11637) {
            m11232();
        }
        return m11226(m11235((InterfaceC18504) c0117, i), true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m11235(InterfaceC18504 interfaceC18504, int i) {
        if (!interfaceC18504.mo1129()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object m11234 = m11234(interfaceC18504);
        if (m11234 == null) {
            throw new IndexOutOfBoundsException();
        }
        return ((List) m11234).get(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11238(C0117 c0117, int i, Object obj) {
        m11232();
        if (!c0117.mo1129()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        this.f11637 = this.f11637 || (obj instanceof InterfaceC9228);
        Object m11234 = m11234((InterfaceC18504) c0117);
        if (m11234 == null) {
            throw new IndexOutOfBoundsException();
        }
        m11231((InterfaceC18504) c0117, obj);
        ((List) m11234).set(i, obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11239(C0117 c0117, Object obj) {
        List list;
        m11232();
        if (!c0117.mo1129()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        this.f11637 = this.f11637 || (obj instanceof InterfaceC9228);
        m11231((InterfaceC18504) c0117, obj);
        Object m11234 = m11234((InterfaceC18504) c0117);
        if (m11234 == null) {
            list = new ArrayList();
            this.f11635.m48425(c0117, list);
        } else {
            list = (List) m11234;
        }
        list.add(obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11231(InterfaceC18504 interfaceC18504, Object obj) {
        boolean m44310;
        m44310 = C19210.m44310(interfaceC18504.mo1142(), obj);
        if (m44310) {
            return;
        }
        if (interfaceC18504.mo1142().m19146() != EnumC1694.MESSAGE || !(obj instanceof InterfaceC9228)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC18504.getNumber()), interfaceC18504.mo1142().m19146(), obj.getClass().getName()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        return false;
     */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m11246() {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            l.ۖۚۖ r2 = r3.f11635
            int r2 = r2.m48427()
            if (r1 >= r2) goto L1a
            l.ۖۚۖ r2 = r3.f11635
            java.util.Map$Entry r2 = r2.m48428(r1)
            boolean r2 = l.C19210.m44299(r2)
            if (r2 != 0) goto L17
            goto L36
        L17:
            int r1 = r1 + 1
            goto L2
        L1a:
            l.ۖۚۖ r1 = r3.f11635
            java.lang.Iterable r1 = r1.m48429()
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r2 = l.C19210.m44299(r2)
            if (r2 != 0) goto L24
        L36:
            return r0
        L37:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3687.m11246():boolean");
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000c */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11240(l.C19210 r3) {
        /*
            r2 = this;
            r2.m11232()
            r0 = 0
        L4:
            l.᩸ۚۖ r1 = l.C19210.m44307(r3)
            int r1 = r1.m48427()
            if (r0 >= r1) goto L1c
            l.᩸ۚۖ r1 = l.C19210.m44307(r3)
            java.util.Map$Entry r1 = r1.m48428(r0)
            r2.m11229(r1)
            int r0 = r0 + 1
            goto L4
        L1c:
            l.᩸ۚۖ r3 = l.C19210.m44307(r3)
            java.lang.Iterable r3 = r3.m48429()
            java.util.Iterator r3 = r3.iterator()
        L28:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r2.m11229(r0)
            goto L28
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3687.m11240(l.᩵ۘۖ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11229(Map.Entry entry) {
        Object m44306;
        Object m443062;
        Object m443063;
        InterfaceC18504 interfaceC18504 = (InterfaceC18504) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof C9081;
        if (interfaceC18504.mo1129()) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            List list = (List) m11234(interfaceC18504);
            if (list == null) {
                list = new ArrayList();
                this.f11635.m48425(interfaceC18504, list);
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                m443063 = C19210.m44306(it.next());
                list.add(m443063);
            }
            return;
        }
        if (interfaceC18504.mo1140() != EnumC1694.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            C2318 c2318 = this.f11635;
            m44306 = C19210.m44306(value);
            c2318.m48425(interfaceC18504, m44306);
            return;
        }
        Object m11234 = m11234(interfaceC18504);
        if (m11234 == null) {
            C2318 c23182 = this.f11635;
            m443062 = C19210.m44306(value);
            c23182.m48425(interfaceC18504, m443062);
            if (z) {
                this.f11636 = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((C9081) value).m23442();
        }
        if (m11234 instanceof InterfaceC9228) {
            interfaceC18504.mo1124((InterfaceC9228) m11234, (InterfaceC8522) value);
        } else {
            this.f11635.m48425(interfaceC18504, interfaceC18504.mo1124(((InterfaceC8522) m11234).toBuilder(), (InterfaceC8522) value).build());
        }
    }
}
