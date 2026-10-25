package l;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: D7LF */
/* renamed from: l.֡ۨ֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0384 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f1812;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f1813;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C2609 f1814;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C6735 f1815;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C6319 f1816;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2609 f1817;

    public C0384() {
        throw null;
    }

    public C0384(C6735 c6735, C2609 c2609, C2609 c26092) {
        this.f1813 = new LinkedHashMap();
        this.f1812 = new HashMap();
        this.f1817 = c2609;
        this.f1814 = c26092;
        this.f1815 = c6735;
        this.f1816 = c6735.f20923;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2609 m1876() {
        return m1853(new C15966(1));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 m1866() {
        return m1853(new C0444(1));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m1856() {
        return m1853(new C18282(3));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C2609 m1853(Predicate predicate) {
        C18837 c18837 = new C18837();
        Iterator it = this.f1814.iterator();
        while (it.hasNext()) {
            C0779 c0779 = (C0779) ((AbstractC4308) it.next());
            if (predicate.test(c0779)) {
                c18837.m43511(c0779.f14167);
            }
        }
        return c18837.m43517();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m1873(C2609 c2609) {
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            if (((AbstractC4308) it.next()).m12928(this.f1817)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2609 m1871(AbstractC4308 abstractC4308) {
        C18837 c18837 = new C18837();
        Iterator it = this.f1817.iterator();
        while (it.hasNext()) {
            AbstractC4308 abstractC43082 = (AbstractC4308) it.next();
            if (abstractC4308.mo12912(abstractC43082)) {
                c18837.m43511(abstractC43082);
            }
        }
        return c18837.m43517();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2609 m1877(C2609 c2609) {
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            c18837.m43512(m1871((AbstractC4308) it.next()));
        }
        C18837 c188372 = new C18837();
        Iterator it2 = c18837.iterator();
        while (it2.hasNext()) {
            AbstractC4308 abstractC4308 = (AbstractC4308) it2.next();
            if (!c188372.contains(abstractC4308)) {
                c188372.m43511(abstractC4308);
            }
        }
        return c188372.m43517();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m1868(AbstractC4308 abstractC4308) {
        return this.f1816.m17488(abstractC4308, this.f1817, this.f1814);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 m1867(C2609 c2609) {
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            c18837.m43511(m1868((AbstractC4308) it.next()));
        }
        return c18837.m43517();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m1859(AbstractC4308 abstractC4308) {
        C2609 c2609 = this.f1817;
        C18837 c18837 = new C18837();
        Iterator it = this.f1814.iterator();
        while (it.hasNext()) {
            C0779 c0779 = (C0779) ((AbstractC4308) it.next());
            c18837.m43511(c0779.m2971() != null ? c0779.m2971() : c0779.f14167);
        }
        return this.f1816.m17488(abstractC4308, c2609, c18837.m43517());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m1857(C2609 c2609) {
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            c18837.m43511(m1859((AbstractC4308) it.next()));
        }
        return c18837.m43517();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1864(C2609 c2609, InterfaceC3748 interfaceC3748) {
        this.f1813.put(interfaceC3748, m1877(c2609));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m1872() {
        m1875(this.f1817.m8244(m1876()));
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m1875(C2609 c2609) {
        LinkedHashMap linkedHashMap = this.f1813;
        C12919 c12919 = null;
        for (Map.Entry entry : new LinkedHashMap(linkedHashMap).entrySet()) {
            if (!AbstractC4308.m12903((C2609) entry.getValue(), this.f1817.m8244(c2609))) {
                try {
                    ((InterfaceC3748) entry.getKey()).mo4673(this);
                    linkedHashMap.remove(entry.getKey());
                } catch (C12919 e) {
                    if (c12919 == null) {
                        c12919 = e;
                    }
                }
            }
        }
        if (c12919 != null) {
            throw c12919;
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2609 m1874() {
        C18837 c18837 = new C18837();
        Iterator it = this.f1814.iterator();
        while (it.hasNext()) {
            C0779 c0779 = (C0779) ((AbstractC4308) it.next());
            C6319 c6319 = this.f1815.f20923;
            C0779 c07792 = new C0779((C8541) c0779.f14167, c0779.f2879, c6319);
            c0779.m2964(c07792, c6319);
            c18837.m43511(c07792);
        }
        return c18837.m43517();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m1870(C2609 c2609) {
        C12171.m29642(c2609 != null);
        C18837 c18837 = new C18837();
        C18837 c188372 = new C18837();
        while (c2609.m8249() && this.f1814.m8249()) {
            C2609 c26092 = this.f1814;
            C0779 c0779 = (C0779) c26092.f8240;
            C0779 c07792 = (C0779) c2609.f8240;
            if (c0779.f14167 == c07792.f14167) {
                c07792.m2964(c0779, this.f1816);
                this.f1814 = this.f1814.f8241;
                c2609 = c2609.f8241;
                c18837.m43511(c0779);
                c188372.m43511(c0779.f14167);
            } else {
                this.f1814 = c26092.f8241;
            }
        }
        this.f1814 = c18837.m43517();
        this.f1817 = c188372.m43517();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1861(C0384 c0384, boolean z) {
        C2609 c2609 = c0384.f1817;
        C2609 m8244 = this.f1817.m8244(c2609);
        c2609.getClass();
        c0384.f1817 = m8244.m8248(c2609);
        C2609 m1874 = z ? m1874() : this.f1814;
        C2609 c26092 = c0384.f1814;
        C2609 m82442 = m1874.m8244(c26092);
        c26092.getClass();
        c0384.f1814 = m82442.m8248(c26092);
        Iterator it = this.f1817.iterator();
        while (it.hasNext()) {
            c0384.f1813.put(new InterfaceC3748() { // from class: l.ۡۨ֨
                @Override // l.InterfaceC3748
                /* renamed from: ֫ */
                public final void mo4673(C0384 c03842) {
                    C0384.this.m1872();
                }
            }, C2609.of(it.next()));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0384 m1855(C2609 c2609, boolean z, final C1386 c1386) {
        if (c2609.m8245() != this.f1817.m8245()) {
            Iterator it = this.f1817.iterator();
            while (true) {
                if (it.hasNext()) {
                    AbstractC4308 abstractC4308 = (AbstractC4308) it.next();
                    if (abstractC4308.m12913(EnumC9454.TYPEVAR) && ((C8541) abstractC4308).mo22227()) {
                        break;
                    }
                } else {
                    final C19436 c19436 = new C19436(this);
                    C5378.stream(c2609).forEach(new Consumer() { // from class: l.ᩴۨ֨
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C23517.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            ((AbstractC4308) obj).mo2962(C19436.this, (Object) null);
                        }
                    });
                    if (c19436.f62872.size() != this.f1817.m8245()) {
                        C2609 m8235 = C2609.m8235((Iterable) c19436.f62872);
                        C2609 m8244 = this.f1817.m8244(m8235);
                        C18837 c18837 = new C18837();
                        Iterator it2 = m8235.iterator();
                        while (it2.hasNext()) {
                            C0779 c0779 = (C0779) m1868((AbstractC4308) it2.next());
                            C12171.m29642(c0779.f2881.isEmpty());
                            C8541 c8541 = (C8541) c0779.f14167;
                            InterfaceC5013 interfaceC5013 = c0779.f2879;
                            C6319 c6319 = this.f1816;
                            C0779 c07792 = new C0779(c8541, interfaceC5013, c6319);
                            c0779.m2964(c07792, c6319);
                            EnumC19125[] values = EnumC19125.values();
                            int length = values.length;
                            char c = 0;
                            int i = 0;
                            while (i < length) {
                                EnumC19125 enumC19125 = values[i];
                                EnumC19125[] enumC19125Arr = new EnumC19125[1];
                                enumC19125Arr[c] = enumC19125;
                                c07792.m2966(enumC19125, (C2609) C5378.stream(c0779.m2963(enumC19125Arr)).filter(new C3379(3, m8244)).collect(C2609.m8240()));
                                i++;
                                c = 0;
                            }
                            c18837.m43511(c07792);
                        }
                        C0384 c0384 = new C0384(this.f1815, m8235, c18837.m43517());
                        Iterator it3 = c0384.f1817.iterator();
                        while (it3.hasNext()) {
                            final AbstractC4308 abstractC43082 = (AbstractC4308) it3.next();
                            c0384.m1864(C2609.of((Object) abstractC43082), new InterfaceC3748() { // from class: l.᩷ۨ֨
                                @Override // l.InterfaceC3748
                                /* renamed from: ֫ */
                                public final void mo4673(C0384 c03842) {
                                    AbstractC4308 abstractC43083 = abstractC43082;
                                    AbstractC4308 m1859 = c03842.m1859(abstractC43083);
                                    Iterator it4 = ((Set) c19436.f62870.get(abstractC43083)).iterator();
                                    while (true) {
                                        boolean hasNext = it4.hasNext();
                                        C0384 c03843 = C0384.this;
                                        if (hasNext) {
                                            ((C0779) c03843.m1868((AbstractC4308) it4.next())).m2972(m1859);
                                        } else {
                                            c03843.f1815.m18349(c03843, c1386);
                                            c03843.m1872();
                                            return;
                                        }
                                    }
                                }
                            });
                        }
                        if (z) {
                            final C2609 m82442 = m8244.m8244(C2609.m8235((Iterable) c19436.f62871));
                            c0384.m1864(m8235, new InterfaceC3748() { // from class: l.ۢۨ֨
                                @Override // l.InterfaceC3748
                                /* renamed from: ֫ */
                                public final void mo4673(C0384 c03842) {
                                    C2609 c26092 = m82442;
                                    C1386 c13862 = c1386;
                                    C0384 c03843 = C0384.this;
                                    c03843.m1863(c26092, c13862);
                                    c03843.m1872();
                                }
                            });
                        }
                        return c0384;
                    }
                }
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cc, code lost:
    
        r1.m18349(r13, r15);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m1854(l.AbstractC16612 r14, l.C1386 r15) {
        /*
            r13 = this;
            l.ۚۛ֨ r0 = new l.ۚۛ֨
            l.ۜۨ֨ r1 = r13.f1815
            l.C11003.requireNonNull(r1)
            r0.<init>(r1, r13, r15)
            r1.m18349(r13, r15)
            l.֡ۛ֨ r2 = new l.֡ۛ֨
            r2.<init>(r0)
        L12:
            boolean r0 = r14.mo7999()
            if (r0 != 0) goto Lf4
            java.lang.String r0 = l.C6735.m18331(r1)
            r3 = 0
            if (r0 == 0) goto L9b
            l.ۖܶ۠ r0 = l.C6735.m18345(r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            l.ۚۛ֨ r5 = r2.f1476
            l.֡ۨ֨ r5 = r5.f16125
            l.ۖܶ۠ r5 = r5.f1814
            java.util.Iterator r5 = r5.iterator()
        L32:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L78
            java.lang.Object r6 = r5.next()
            l.ۙ֨֨ r6 = (l.AbstractC4308) r6
            l.֨֨֨ r6 = (l.C0779) r6
            l.ۙ֨֨ r7 = r6.f14167
            r8 = 1
            l.᩵֨֨[] r9 = new l.EnumC19125[r8]
            l.᩵֨֨ r10 = l.EnumC19125.f60272
            r9[r3] = r10
            l.ۖܶ۠ r9 = r6.m2963(r9)
            l.᩵֨֨[] r10 = new l.EnumC19125[r8]
            l.᩵֨֨ r11 = l.EnumC19125.f60273
            r10[r3] = r11
            l.ۖܶ۠ r10 = r6.m2963(r10)
            l.᩵֨֨[] r11 = new l.EnumC19125[r8]
            l.᩵֨֨ r12 = l.EnumC19125.f60275
            r11[r3] = r12
            l.ۖܶ۠ r6 = r6.m2963(r11)
            r11 = 4
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r3] = r7
            r11[r8] = r9
            r7 = 2
            r11[r7] = r10
            r7 = 3
            r11[r7] = r6
            java.lang.String r6 = "var %s - upper bounds = %s, lower bounds = %s, eq bounds = %s\\n"
            java.lang.String r6 = java.lang.String.format(r6, r11)
            r4.append(r6)
            goto L32
        L78:
            java.util.ArrayList r3 = r2.f1475
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "inferenceGraph"
            r5.<init>(r6)
            int r6 = r2.hashCode()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r4 = r4.toString()
            java.lang.String r3 = l.C5226.m15018(r3, r5, r4)
            l.ۖܶ۠ r0 = r0.m8246(r3)
            l.C6735.m18340(r1, r0)
        L9b:
            l.᩵ۛ֨ r0 = r14.mo21304(r2)
            java.lang.Object r3 = r0.f28700
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            l.ۖܶ۠ r3 = l.C2609.m8235(r3)
            l.ۖܶ۠ r4 = r13.m1874()
        Lab:
            r5 = 0
            l.ۖܶ۠ r6 = r13.m1876()     // Catch: l.C12919 -> Ld8
            boolean r6 = l.AbstractC4308.m12903(r6, r3)     // Catch: l.C12919 -> Ld8
            if (r6 == 0) goto Le1
            l.ᩴۛ֨[] r6 = l.EnumC18565.values()     // Catch: l.C12919 -> Ld8
            int r7 = r6.length     // Catch: l.C12919 -> Ld8
            r8 = 0
        Lbc:
            if (r8 >= r7) goto Ld3
            r9 = r6[r8]     // Catch: l.C12919 -> Ld8
            java.util.EnumSet r9 = r9.f57619     // Catch: l.C12919 -> Ld8
            l.ۖܶ۠ r9 = r13.m1858(r3, r9)     // Catch: l.C12919 -> Ld8
            boolean r9 = r9.m8249()     // Catch: l.C12919 -> Ld8
            if (r9 == 0) goto Ld0
            r1.m18349(r13, r15)     // Catch: l.C12919 -> Ld8
            goto Lab
        Ld0:
            int r8 = r8 + 1
            goto Lbc
        Ld3:
            l.۬ۛ֨ r6 = l.C6735.m18338(r5)     // Catch: l.C12919 -> Ld8
            throw r6     // Catch: l.C12919 -> Ld8
        Ld8:
            r13.m1870(r4)
            r1.m18352(r3, r13)
            r1.m18349(r13, r15)
        Le1:
            java.util.ArrayList r3 = r2.f1475
            boolean r3 = r3.contains(r0)
            l.C12171.m29642(r3)
            java.util.ArrayList r3 = r2.f1475
            r3.remove(r0)
            r2.m1468(r0, r5)
            goto L12
        Lf4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0384.m1854(l.ܽۨ֨, l.֨᩸۠):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1862(C1386 c1386) {
        C6735 c6735 = this.f1815;
        C11003.requireNonNull(c6735);
        m1854(new C15906(this, c6735), c1386);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1863(C2609 c2609, C1386 c1386) {
        C6735 c6735 = this.f1815;
        C11003.requireNonNull(c6735);
        m1854(new C2502(this, c6735, c2609, c2609), c1386);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m1869(C2609 c2609, C1386 c1386) {
        C6735 c6735 = this.f1815;
        C11003.requireNonNull(c6735);
        m1854(new C3913(this, c6735, c2609.m8247(m1876())), c1386);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1865(boolean z, C1386 c1386, EnumSet enumSet) {
        C6735 c6735;
        while (true) {
            C2609 m1858 = m1858(this.f1817, enumSet);
            boolean isEmpty = m1876().isEmpty();
            c6735 = this.f1815;
            if (isEmpty || z) {
                break;
            }
            if (m1858.isEmpty()) {
                c6735.m18352(m1876(), this);
                break;
            }
            Iterator it = this.f1814.iterator();
            while (it.hasNext()) {
                ((C0779) ((AbstractC4308) it.next())).m2965(this.f1816, m1858, m1857(m1858));
            }
        }
        c6735.m18349(this, c1386);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m1858(C2609 c2609, EnumSet enumSet) {
        C18837 c18837 = new C18837();
        Iterator it = c2609.m8247(m1876()).iterator();
        while (it.hasNext()) {
            C0779 c0779 = (C0779) m1868((AbstractC4308) it.next());
            Iterator it2 = enumSet.iterator();
            while (true) {
                if (it2.hasNext()) {
                    EnumC10969 enumC10969 = (EnumC10969) it2.next();
                    if (enumC10969.mo5982(c0779, this)) {
                        c0779.m2972(enumC10969.mo5983(c0779, this));
                        c18837.m43511(c0779.f14167);
                        break;
                    }
                }
            }
        }
        return c18837.m43517();
    }

    public final String toString() {
        return "Inference vars: " + this.f1817 + "\nUndet vars: " + this.f1814;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m1860(AbstractC5144 abstractC5144, AbstractC4308 abstractC4308, boolean z) {
        HashMap hashMap = this.f1812;
        AbstractC4308 abstractC43082 = (AbstractC4308) hashMap.get(abstractC5144);
        if (abstractC43082 != null) {
            return abstractC43082;
        }
        AbstractC4308 m17523 = this.f1816.m17523(abstractC4308);
        if (m17523 != abstractC4308 && !z) {
            hashMap.put(abstractC5144, m17523);
        }
        return m17523;
    }
}
