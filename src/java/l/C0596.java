package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: 640U */
/* renamed from: l.֡ᩴ۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0596 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14258 f2321;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C2609 f2322;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C2609 f2323;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1302 f2324;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2562 f2325;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C2609 f2326;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Set f2327;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f2328;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f2329;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5431 f2330;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C2609 f2331;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f2332;

    public C0596(C1302 c1302, int i, Set set, C5431 c5431) {
        C4541 c4541;
        this.f2324 = c1302;
        this.f2325 = new C2562(1);
        this.f2321 = new C14258(1);
        this.f2332 = i;
        if (i != 1) {
            C5431 c54312 = new C5431(c1302.f4637, null);
            this.f2330 = c54312;
            c4541 = c1302.f4663;
            c4541.m13340(c54312);
        } else {
            C12171.m29637(c5431);
            this.f2330 = c5431;
        }
        this.f2323 = C2609.m8239();
        this.f2322 = C2609.m8239();
        this.f2326 = C2609.m8239();
        this.f2327 = set;
    }

    public C0596(C1302 c1302, C2609 c2609, C2609 c26092, Set set, C5431 c5431) {
        this(c1302, 1, set, c5431);
        this.f2331 = c2609;
        this.f2329 = new HashMap();
        this.f2323 = C1302.m4509(c1302, c2609).m8248(c26092.m8250());
        this.f2322 = C1302.m4495(c1302, c2609);
        C2609 m8239 = C2609.m8239();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C1323 c1323 = (C1323) it.next();
            if (c1323.f4745.mo21322("module-info", EnumC16866.SOURCE) && c1323.f4738.m8249()) {
                Iterator it2 = c1323.f4738.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        AbstractC5144 abstractC5144 = (AbstractC5144) it2.next();
                        if (!abstractC5144.m14709(EnumC18550.f57491)) {
                            if (abstractC5144.m14709(EnumC18550.f57554)) {
                                m8239 = m8239.m8246(c1323.f4739);
                            }
                        }
                    }
                }
            }
        }
        this.f2326 = m8239.m8250();
        m2461();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0596 m2457(LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap) {
        C4541 c4541;
        C4541 c45412;
        C4541 c45413;
        C4541 c45414;
        int i = this.f2332 + 1;
        Set set = this.f2327;
        C1302 c1302 = this.f2324;
        C0596 c0596 = new C0596(c1302, i, set, null);
        m2456();
        HashMap hashMap = this.f2329;
        c0596.f2329 = hashMap;
        c4541 = c1302.f4663;
        C2609 m13329 = c4541.m13329((Set) linkedHashSet, true);
        C2609 c2609 = this.f2331;
        c2609.getClass();
        C2609 m8248 = m13329.m8248(c2609);
        c0596.f2331 = m8248;
        if (c0596.m2462()) {
            c45414 = c1302.f4663;
            c45414.m13344(C2609.m8239());
            return c0596;
        }
        c45412 = c1302.f4663;
        c45412.m13344(m8248);
        c0596.f2331 = m8248;
        c0596.m2455(hashMap);
        C2609 m2455 = c0596.m2455(linkedHashMap);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((Map) C13843.computeIfAbsent(c0596.f2329, (C0052) entry.getKey(), new C7320(1))).putAll((Map) entry.getValue());
        }
        C2609 c26092 = c0596.f2331;
        c45413 = c0596.f2324.f4663;
        c45413.m13338(c26092);
        if (c0596.m2462()) {
            return c0596;
        }
        C2609 m4509 = C1302.m4509(c1302, m13329);
        C2609 m8239 = C2609.m8239();
        Iterator it = m2455.iterator();
        while (it.hasNext()) {
            C14163 c14163 = (C14163) it.next();
            if (!c14163.f42766.mo21322("package-info", EnumC16866.CLASS) || c14163.m16089().f24146 != c14163) {
                m8239 = m8239.m8246(c14163);
            }
        }
        C2609 m8250 = m8239.m8250();
        m4509.getClass();
        c0596.f2323 = m8250.m8248(m4509);
        C2609 m4495 = C1302.m4495(c1302, m13329);
        C2609 m82392 = C2609.m8239();
        Iterator it2 = m2455.iterator();
        while (it2.hasNext()) {
            C14163 c141632 = (C14163) it2.next();
            if (c141632.f42766.mo21322("package-info", EnumC16866.CLASS) && c141632.m16089().f24146 == c141632) {
                m82392 = m82392.m8246((C7814) c141632.f17561);
            }
        }
        C2609 m82502 = m82392.m8250();
        m4495.getClass();
        c0596.f2322 = m82502.m8248(m4495);
        c0596.f2326 = C2609.m8239();
        c0596.m2461();
        return c0596;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2458() {
        m2456();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m2462() {
        C17530 c17530;
        boolean z;
        boolean z2;
        C1302 c1302 = this.f2324;
        c17530 = c1302.f4650;
        if (c17530.f53540 > 0) {
            return true;
        }
        Iterator it = ((C18837) this.f2330.m15516()).iterator();
        while (it.hasNext()) {
            C16719 c16719 = (C16719) it.next();
            int i = C21059.f67927[c16719.mo29297().ordinal()];
            if (i == 1) {
                z2 = c1302.f4656;
                if (z2) {
                    return true;
                }
            } else {
                if (i == 2) {
                    z = c1302.f4643;
                    if (!z && c16719.m39346(EnumC20043.RECOVERABLE)) {
                    }
                    return true;
                }
                continue;
            }
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2461() {
        C21290 c21290;
        c21290 = this.f2324.f4652;
        C9770 c9770 = new C9770(c21290);
        this.f2328 = new LinkedHashSet();
        Iterator it = this.f2323.iterator();
        while (it.hasNext()) {
            c9770.m24774((InterfaceC11970) it.next(), (Set) this.f2328);
        }
        Iterator it2 = this.f2322.iterator();
        while (it2.hasNext()) {
            c9770.m24774((InterfaceC11970) it2.next(), (Set) this.f2328);
        }
        Iterator it3 = this.f2326.iterator();
        while (it3.hasNext()) {
            c9770.m24774((InterfaceC11970) it3.next(), (Set) this.f2328);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C2609 m2455(HashMap hashMap) {
        C6136 c6136;
        C20661 c20661;
        C14163 m47260;
        InterfaceC6403 interfaceC6403;
        C20661 c206612;
        InterfaceC6403 interfaceC64032;
        C20661 c206613;
        C2609 m8239 = C2609.m8239();
        for (Map.Entry entry : hashMap.entrySet()) {
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                C1302 c1302 = this.f2324;
                c6136 = c1302.f4660;
                AbstractC10370 m30652 = c6136.f18880.m30652((String) entry2.getKey());
                InterfaceC18278 interfaceC18278 = (InterfaceC18278) entry2.getValue();
                EnumC16866 mo21321 = interfaceC18278.mo21321();
                EnumC16866 enumC16866 = EnumC16866.CLASS;
                if (mo21321 != enumC16866) {
                    throw new AssertionError(interfaceC18278);
                }
                if (interfaceC18278.mo21322("package-info", enumC16866)) {
                    AbstractC10370 m26172 = m30652.m26172(0, m30652.m26170((byte) 46));
                    c206612 = c1302.f4661;
                    C7814 m47266 = c206612.m47266((C0052) entry.getKey(), m26172);
                    if (m47266.f24146 == null) {
                        c206613 = c1302.f4661;
                        m47266.f24146 = c206613.m47261((C0052) entry.getKey(), C12780.m31093(m30652), m47266);
                    }
                    m47260 = m47266.f24146;
                    m47260.m33817();
                    if (m47260.f42766 == null) {
                        m47260.f42766 = interfaceC18278;
                    }
                    interfaceC64032 = c1302.f4654;
                    m47260.f17564 = interfaceC64032;
                } else {
                    c20661 = c1302.f4661;
                    m47260 = c20661.m47260((C0052) entry.getKey(), m30652);
                    m47260.m33817();
                    m47260.f42766 = interfaceC18278;
                    interfaceC6403 = c1302.f4654;
                    m47260.f17564 = interfaceC6403;
                    AbstractC5698 abstractC5698 = m47260.f17561;
                    if (abstractC5698.f17559 == EnumC1296.f4579) {
                        abstractC5698.mo16064().mo26382(m47260);
                    }
                }
                m8239 = m8239.m8246(m47260);
            }
        }
        return m8239.m8250();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r3 != false) goto L6;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2460(boolean r12, boolean r13) {
        /*
            r11 = this;
            l.ۚܶ۠ r0 = r11.f2330
            l.ۖܶ۠ r1 = r11.f2323
            l.֨ᩴ۠ r2 = r11.f2324
            boolean r3 = l.C1302.m4517(r2)
            l.᩹ܶ۠ r4 = r2.f4637
            r5 = 1
            if (r3 != 0) goto L15
            boolean r3 = l.C1302.m4505(r2)
            if (r3 == 0) goto L5a
        L15:
            if (r12 == 0) goto L1c
            l.ۖܶ۠ r3 = l.C2609.m8239()
            goto L1d
        L1c:
            r3 = r1
        L1d:
            if (r12 == 0) goto L22
            java.util.Set r6 = java.util.Collections.EMPTY_SET
            goto L24
        L22:
            java.util.LinkedHashSet r6 = r11.f2328
        L24:
            int r7 = r11.f2332
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "{"
            r8.<init>(r9)
            java.lang.String r9 = ", "
            java.lang.String r3 = r3.m8241(r9)
            r8.append(r3)
            java.lang.String r3 = "}"
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r12)
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r10 = 0
            r9[r10] = r7
            r9[r5] = r3
            r3 = 2
            r9[r3] = r6
            r3 = 3
            r9[r3] = r8
            java.lang.String r3 = "x.print.rounds"
            r4.m50118(r3, r9)
        L5a:
            l.᩺ۖ֨ r3 = l.C1302.m4490(r2)
            boolean r3 = r3.m50708()
            if (r3 != 0) goto L72
            l.᩺ۖ֨ r3 = l.C1302.m4490(r2)
            l.᩷ۖ֨ r6 = new l.᩷ۖ֨
            l.ۜۖ֨ r7 = l.EnumC6466.ANNOTATION_PROCESSING_ROUND
            r6.<init>(r7)
            r3.m50709(r6)
        L72:
            if (r12 == 0) goto La7
            l.ܽᩴ۠ r12 = l.C1302.m4519(r2)     // Catch: java.lang.Throwable -> Lc9
            r12.getClass()     // Catch: java.lang.Throwable -> Lc9
            java.util.Set r12 = java.util.Collections.EMPTY_SET     // Catch: java.lang.Throwable -> Lc9
            l.۠ᩴ۠ r1 = new l.۠ᩴ۠     // Catch: java.lang.Throwable -> Lc9
            r1.<init>(r5, r13, r12, r2)     // Catch: java.lang.Throwable -> Lc9
            l.ܺᩴ۠ r12 = l.C1302.m4515(r2)     // Catch: java.lang.Throwable -> Lc9
            r12.getClass()     // Catch: java.lang.Throwable -> Lc9
            java.util.ArrayList r13 = r12.f49661     // Catch: java.lang.Throwable -> Lc9
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> Lc9
        L8f:
            boolean r3 = r13.hasNext()     // Catch: java.lang.Throwable -> Lc9
            if (r3 == 0) goto Lb0
            java.lang.Object r3 = r13.next()     // Catch: java.lang.Throwable -> Lc9
            l.᩵ᩴ۠ r3 = (l.C19648) r3     // Catch: java.lang.Throwable -> Lc9
            boolean r6 = r3.f63396     // Catch: java.lang.Throwable -> Lc9
            if (r6 == 0) goto L8f
            l.֨ᩴ۠ r6 = r12.f49660     // Catch: java.lang.Throwable -> Lc9
            l.᩸᩸۠ r3 = r3.f63397     // Catch: java.lang.Throwable -> Lc9
            l.C1302.m4499(r6, r3, r1)     // Catch: java.lang.Throwable -> Lc9
            goto L8f
        La7:
            java.util.LinkedHashSet r12 = r11.f2328     // Catch: java.lang.Throwable -> Lc9
            l.ۖܶ۠ r13 = r11.f2322     // Catch: java.lang.Throwable -> Lc9
            l.ۖܶ۠ r3 = r11.f2326     // Catch: java.lang.Throwable -> Lc9
            l.C1302.m4498(r2, r12, r1, r13, r3)     // Catch: java.lang.Throwable -> Lc9
        Lb0:
            l.᩺ۖ֨ r12 = l.C1302.m4490(r2)
            boolean r12 = r12.m50708()
            if (r12 != 0) goto Lc8
            l.᩺ۖ֨ r12 = l.C1302.m4490(r2)
            l.᩷ۖ֨ r13 = new l.᩷ۖ֨
            l.ۜۖ֨ r0 = l.EnumC6466.ANNOTATION_PROCESSING_ROUND
            r13.<init>(r0)
            r12.m50707(r13)
        Lc8:
            return
        Lc9:
            r12 = move-exception
            l.ܳۗܽ r13 = new l.ܳۗܽ     // Catch: java.lang.Throwable -> Lde
            r13.<init>(r5)     // Catch: java.lang.Throwable -> Lde
            r0.m15517(r13)     // Catch: java.lang.Throwable -> Lde
            r4.m50112(r0)     // Catch: java.lang.Throwable -> Lde
            l.ۙۡ۠ r13 = l.C1302.m4514(r2)     // Catch: java.lang.Throwable -> Lde
            r0 = 0
            r13.m13340(r0)     // Catch: java.lang.Throwable -> Lde
            throw r12     // Catch: java.lang.Throwable -> Lde
        Lde:
            r12 = move-exception
            l.᩺ۖ֨ r13 = l.C1302.m4490(r2)
            boolean r13 = r13.m50708()
            if (r13 != 0) goto Lf7
            l.᩺ۖ֨ r13 = l.C1302.m4490(r2)
            l.᩷ۖ֨ r0 = new l.᩷ۖ֨
            l.ۜۖ֨ r1 = l.EnumC6466.ANNOTATION_PROCESSING_ROUND
            r0.<init>(r1)
            r13.m50707(r0)
        Lf7:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0596.m2460(boolean, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2459(boolean z) {
        Predicate predicate;
        C4541 c4541;
        if (z) {
            predicate = this.f2321;
        } else {
            predicate = this.f2325;
        }
        C5431 c5431 = this.f2330;
        c5431.m15517(predicate);
        C1302 c1302 = this.f2324;
        c1302.f4637.m50112(c5431);
        c4541 = c1302.f4663;
        c4541.m13340((C5431) null);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m2456() {
        C13809 c13809;
        Set<C1323> set;
        C15240 c15240;
        C13809 c138092;
        C16824 c16824;
        C17530 c17530;
        C4541 c4541;
        C3267 c3267;
        C6319 c6319;
        C13395 c13395;
        C21290 c21290;
        C20661 c20661;
        Iterator m49777;
        C20661 c206612;
        Iterator m497772;
        InterfaceC6403 interfaceC6403;
        C14190 c14190;
        C1302 c1302 = this.f2324;
        c13809 = c1302.f4649;
        Iterator it = c13809.m33129().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            set = this.f2327;
            if (!hasNext) {
                break;
            } else {
                set.add(((C1755) it.next()).f6075);
            }
        }
        for (C1323 c1323 : set) {
            c14190 = c1302.f4635;
            c14190.mo10758(c1323);
        }
        c15240 = c1302.f4666;
        c15240.m36115();
        c138092 = c1302.f4649;
        c138092.m33128();
        c16824 = c1302.f4667;
        c16824.m39560();
        c17530 = c1302.f4650;
        c17530.f53540 = 0;
        c4541 = c1302.f4663;
        c4541.m13348();
        c3267 = c1302.f4658;
        c3267.m10061();
        c6319 = c1302.f4642;
        c6319.m17499();
        c13395 = c1302.f4665;
        c13395.m32415();
        c21290 = c1302.f4652;
        c21290.m48324();
        c20661 = c1302.f4661;
        c20661.getClass();
        m49777 = C22159.m49777(c20661.f66517.values(), new C11213(5));
        while (m49777.hasNext()) {
            if (((C14163) m49777.next()).f17559 == EnumC1296.f4581) {
                c206612 = c1302.f4661;
                c206612.getClass();
                m497772 = C22159.m49777(c206612.f66517.values(), new C11213(5));
                while (m497772.hasNext()) {
                    C14163 c14163 = (C14163) m497772.next();
                    if (c14163.f42766 != null || c14163.f17559 == EnumC1296.f4581) {
                        EnumC1296 enumC1296 = c14163.f17559;
                        c14163.m33817();
                        if (enumC1296 == EnumC1296.f4581) {
                            c14163.f17560 = new C19955(c14163, c14163.f17560.mo4958(), null);
                        }
                        if (c14163.f17564.mo7078()) {
                            interfaceC6403 = c1302.f4654;
                            c14163.f17564 = interfaceC6403;
                        }
                    }
                }
                return;
            }
        }
    }
}
