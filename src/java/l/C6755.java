package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: W7SR */
/* renamed from: l.ۜ۫֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C6755 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f20966 = new ArrayList();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C1386 f20967;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0384 f20968;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC16761 f20969;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC13829 f20970;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6755 f20971;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 f20972;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12399 f20973;

    public C6755(C12399 c12399, EnumC13829 enumC13829, AbstractC5698 abstractC5698, EnumC16761 enumC16761, C0384 c0384, C6755 c6755, C1386 c1386) {
        this.f20973 = c12399;
        this.f20970 = enumC13829;
        this.f20972 = abstractC5698;
        this.f20969 = enumC16761;
        this.f20971 = c6755;
        this.f20967 = c1386;
        this.f20968 = c0384;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo18376(C1110 c1110, C23420 c23420, InterfaceC19456 interfaceC19456) {
        this.f20966.add(new C18750(this.f20973, c1110, c23420, interfaceC19456));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        if (r2 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
    
        if (m18377() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
    
        r4.m1869(l.C2609.m8235((java.lang.Iterable) m18378().f59252.mo28594()), r12.f20967);
        r4.m1872();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ea, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b9, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c1, code lost:
    
        if (r0.hasNext() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c3, code lost:
    
        ((l.C18750) r0.next()).f59253.f4048.f16086 = l.AbstractC4308.f13885;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo18375() {
        /*
            r12 = this;
        L0:
            java.util.ArrayList r0 = r12.f20966
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Lea
            l.ۖܶ۠ r1 = l.C2609.m8235(r0)
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L11:
            boolean r3 = r1.hasNext()
            l.֡ۨ֨ r4 = r12.f20968
            if (r3 == 0) goto Lb1
            java.lang.Object r3 = r1.next()
            l.ᩴ۫֨ r3 = (l.C18750) r3
            l.۫۫֨ r5 = r3.f59255
            l.᩻ۗ֨ r6 = r3.f59254
            l.֨۫֨ r7 = r3.f59253
            l.۫᩵۠ r8 = r7.f4048
            l.᩵۫֨ r9 = r3.f59252
            l.ܰ۬֨ r10 = r12.f20970
            int r10 = r10.ordinal()
            r11 = 1
            if (r10 == 0) goto L87
            if (r10 != r11) goto L7f
            boolean r10 = r9.mo28592()
            if (r10 == 0) goto L65
            l.۬۬֨ r4 = r5.f37355
            l.ۜ۫֨ r5 = r12.f20971
            if (r5 == r4) goto L11
            l.֡ۨ֨ r4 = r5.f20968
            l.ۖܶ۠ r4 = r4.f1817
            java.util.Set r10 = r9.mo28594()
            l.ۖܶ۠ r10 = l.C2609.m8235(r10)
            boolean r4 = l.AbstractC4308.m12903(r4, r10)
            if (r4 == 0) goto L11
            l.ܺ۫֨ r2 = new l.ܺ۫֨
            l.ۘ۬֨ r4 = r6.f75215
            r2.<init>(r4, r12)
            l.᩻ۗ֨ r2 = r6.mo38522(r2)
            r5.mo18376(r7, r2, r9)
            l.ۨۚ֨ r2 = l.AbstractC4308.f13886
            r8.f16086 = r2
            goto La4
        L65:
            boolean r2 = r12.m18377()
            r2 = r2 ^ r11
            java.lang.String r8 = "attribution shouldn't be happening here"
            l.C12171.m29641(r8, r2)
            l.ۙ֨֨ r2 = r6.f75219
            l.ۙ֨֨ r2 = r4.m1859(r2)
            l.᩻ۗ֨ r2 = r6.mo38523(r2)
            l.ۨ۬֨ r4 = r5.f37344
            l.C1110.m3820(r7, r2, r4)
            goto La4
        L7f:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Bad mode"
            r0.<init>(r1)
            throw r0
        L87:
            boolean r2 = r9.mo28592()
            if (r2 == 0) goto Laa
            l.ۘ۫֨ r2 = new l.ۘ۫֨
            r2.<init>(r3)
            r2.f12550 = r6
            r2.f12549 = r4
            l.֫ۤ֨ r4 = r7.f4049
            r2.f12548 = r4
            r8.mo988(r2)
            l.ۚ۫֨ r2 = r7.f4052
            l.۟᩵۠ r4 = r5.f37354
            r2.m15289(r4, r6)
        La4:
            r0.remove(r3)
            r2 = 1
            goto L11
        Laa:
            java.lang.String r0 = "Cannot get here"
            l.C12171.m29640(r0)
            r0 = 0
            throw r0
        Lb1:
            if (r2 != 0) goto L0
            boolean r1 = r12.m18377()
            if (r1 == 0) goto Ld2
            java.util.Iterator r0 = r0.iterator()
        Lbd:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lea
            java.lang.Object r1 = r0.next()
            l.ᩴ۫֨ r1 = (l.C18750) r1
            l.֨۫֨ r1 = r1.f59253
            l.۫᩵۠ r1 = r1.f4048
            l.ۨۚ֨ r2 = l.AbstractC4308.f13885
            r1.f16086 = r2
            goto Lbd
        Ld2:
            l.ᩴ۫֨ r0 = r12.m18378()     // Catch: l.C0925 -> Lea
            l.᩵۫֨ r0 = r0.f59252     // Catch: l.C0925 -> Lea
            java.util.Set r0 = r0.mo28594()     // Catch: l.C0925 -> Lea
            l.ۖܶ۠ r0 = l.C2609.m8235(r0)     // Catch: l.C0925 -> Lea
            l.֨᩸۠ r1 = r12.f20967     // Catch: l.C0925 -> Lea
            r4.m1869(r0, r1)     // Catch: l.C0925 -> Lea
            r4.m1872()     // Catch: l.C0925 -> Lea
            goto L0
        Lea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6755.mo18375():void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m18377() {
        if (this == this.f20973.f37355) {
            return false;
        }
        if (this.f20970 == EnumC13829.SPECULATIVE) {
            return true;
        }
        return this.f20971.m18377();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C18750 m18378() {
        C19271 c19271;
        C12399 c12399 = this.f20973;
        C6735 c6735 = c12399.f37349;
        C1386 c1386 = this.f20967;
        C0384 c0384 = this.f20968;
        c6735.m18349(c0384, c1386);
        C6735 c67352 = c12399.f37349;
        C11003.requireNonNull(c67352);
        final C0219 c0219 = new C0219(new C5159(c67352, c0384, c12399.f37343.f19598));
        ArrayList arrayList = this.f20966;
        C2609 c2609 = (C2609) C5378.stream(arrayList).map(new C18044()).collect(C2609.m8240());
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C23688 c23688 = (C23688) it.next();
            Iterator it2 = c2609.iterator();
            while (it2.hasNext()) {
                C23688 c236882 = (C23688) it2.next();
                if (c23688 != c236882) {
                    Set mo28593 = ((C18750) c236882.f28700).f59252.mo28593();
                    Iterator it3 = ((C18750) c23688.f28700).f59252.mo28594().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            AbstractC4308 abstractC4308 = (AbstractC4308) it3.next();
                            Iterator it4 = c0219.f1475.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    c19271 = null;
                                    break;
                                }
                                c19271 = (C19271) it4.next();
                                if (((C18837) c19271.f28700).contains(abstractC4308)) {
                                    break;
                                }
                            }
                            if (c19271 != null) {
                                final HashSet m44455 = c19271.m44455();
                                if (C5378.stream(mo28593).map(new Function() { // from class: l.ܿ۫֨
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public /* synthetic */ Function mo22274andThen(Function function) {
                                        return C20696.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public /* synthetic */ Function compose(Function function) {
                                        return C20696.$default$compose(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        AbstractC4308 abstractC43082 = (AbstractC4308) obj;
                                        Iterator it5 = C0219.this.f1475.iterator();
                                        while (it5.hasNext()) {
                                            C19271 c192712 = (C19271) it5.next();
                                            if (((C18837) c192712.f28700).contains(abstractC43082)) {
                                                return c192712;
                                            }
                                        }
                                        return null;
                                    }
                                }).anyMatch(new Predicate() { // from class: l.ܳ۫֨
                                    @Override // java.util.function.Predicate
                                    public /* synthetic */ Predicate and(Predicate predicate) {
                                        return C19285.$default$and(this, predicate);
                                    }

                                    @Override // java.util.function.Predicate
                                    /* renamed from: negate */
                                    public /* synthetic */ Predicate mo4928negate() {
                                        return C19285.$default$negate(this);
                                    }

                                    public /* synthetic */ Predicate or(Predicate predicate) {
                                        return C19285.$default$or(this, predicate);
                                    }

                                    @Override // java.util.function.Predicate
                                    public final boolean test(Object obj) {
                                        return m44455.contains((C19271) obj);
                                    }
                                })) {
                                    c23688.f76719.add(c236882);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        C2609 c26092 = (C2609) C5226.m15019(c2609).get(0);
        return (C18750) (c26092.m8245() == 1 ? ((C23688) c26092.get(0)).f28700 : arrayList.get(0));
    }
}
