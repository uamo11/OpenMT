package l;

/* compiled from: I7LP */
/* renamed from: l.ܺ᩶֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC16154 extends AbstractC16860 {
    /* renamed from: ۫֫ */
    public abstract AbstractC4308 mo8503();

    /* renamed from: ܽ */
    public abstract C23420 mo8504(C23420 c23420);

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (r7 != null) goto L27;
     */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0083: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:37:0x0083 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    @Override // l.AbstractC16860
    /* renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC4308 mo18876(l.C23420 r14) {
        /*
            r13 = this;
            l.ۙ֨֨ r0 = r13.mo8503()
            l.᩻ۗ֨ r14 = r13.mo8504(r14)
            if (r0 == 0) goto L9e
            l.ۢ۠֨ r1 = l.EnumC9454.METHOD
            boolean r1 = r0.m12913(r1)
            if (r1 == 0) goto L9e
            boolean r1 = r0.mo12940()
            if (r1 == 0) goto L9e
            l.ܿۨ֨ r0 = (l.C17318) r0
            l.֫ۤ֨ r1 = r0.f53033
            l.֨᩸۠ r2 = r0.f53032
            l.ۜۨ֨ r3 = r0.f53030
            l.֡ۨ֨ r4 = r0.f53031
            l.֨᩸۠ r5 = new l.֨᩸۠
            r6 = 0
            r5.<init>(r6)
            l.ۖܶ۠ r7 = r4.m1874()     // Catch: java.lang.Throwable -> L87 l.C12919 -> L89
            l.᩶ᩴ֨ r8 = l.EnumC20347.UNCHECKED     // Catch: java.lang.Throwable -> L82 l.C12919 -> L85
            boolean r8 = r2.m4872(r8)     // Catch: java.lang.Throwable -> L82 l.C12919 -> L85
            if (r8 != 0) goto L63
            l.ۙ֨֨ r9 = r0.f32060     // Catch: java.lang.Throwable -> L82 l.C12919 -> L85
            boolean r9 = l.C6735.m18343(r3, r9, r14, r4)     // Catch: java.lang.Throwable -> L82 l.C12919 -> L85
            l.ۘ۬֨ r10 = r14.f75215
            if (r9 == 0) goto L48
            l.ۖܶ۠ r11 = l.C6735.m18333(r3, r0)     // Catch: java.lang.Throwable -> L82 l.C12919 -> L85
            r12 = 0
            l.֡ۨ֨ r2 = r4.m1855(r11, r12, r2)     // Catch: java.lang.Throwable -> L82 l.C12919 -> L85
            goto L49
        L48:
            r2 = r4
        L49:
            l.ۚۚ۠ r11 = r1.f6074     // Catch: java.lang.Throwable -> L82 l.C12919 -> L85
            l.ۙ֨֨ r11 = r3.m18347(r11, r14, r0, r2)     // Catch: java.lang.Throwable -> L82 l.C12919 -> L85
            if (r9 == 0) goto L63
            l.֡ۨ֨ r0 = r10.mo3857()     // Catch: java.lang.Throwable -> L82 l.C12919 -> L85
            l.ۜ۫֨ r1 = r10.mo3860()     // Catch: java.lang.Throwable -> L82 l.C12919 -> L85
            boolean r1 = r1.m18377()     // Catch: java.lang.Throwable -> L82 l.C12919 -> L85
            r2.m1861(r0, r1)     // Catch: java.lang.Throwable -> L82 l.C12919 -> L85
            if (r7 == 0) goto Lab
            goto L7e
        L63:
            r4.m1862(r5)     // Catch: java.lang.Throwable -> L82 l.C12919 -> L85
            l.ۙ֨֨ r0 = r4.m1859(r0)     // Catch: java.lang.Throwable -> L82 l.C12919 -> L85
            l.ۙ֨֨ r0 = r0.mo12923()     // Catch: java.lang.Throwable -> L82 l.C12919 -> L85
            if (r8 == 0) goto L76
            l.ۛ᩸֨ r2 = r3.f20923     // Catch: java.lang.Throwable -> L82 l.C12919 -> L85
            l.ۙ֨֨ r0 = r2.m17519(r0)     // Catch: java.lang.Throwable -> L82 l.C12919 -> L85
        L76:
            l.ۚۚ۠ r1 = r1.f6074     // Catch: java.lang.Throwable -> L82 l.C12919 -> L85
            l.ۙ֨֨ r11 = r14.mo13581(r1, r0)     // Catch: java.lang.Throwable -> L82 l.C12919 -> L85
            if (r7 == 0) goto Lab
        L7e:
            r4.m1870(r7)
            goto Lab
        L82:
            r14 = move-exception
            r6 = r7
            goto L98
        L85:
            r0 = move-exception
            goto L8b
        L87:
            r14 = move-exception
            goto L98
        L89:
            r0 = move-exception
            r7 = r6
        L8b:
            l.ۘ۬֨ r14 = r14.f75215     // Catch: java.lang.Throwable -> L82
            l.ܽܶ۠ r0 = r0.mo31425()     // Catch: java.lang.Throwable -> L82
            r14.mo1084(r6, r0)     // Catch: java.lang.Throwable -> L82
            l.C12171.m29636()     // Catch: java.lang.Throwable -> L82
            throw r6     // Catch: java.lang.Throwable -> L82
        L98:
            if (r6 == 0) goto L9d
            r4.m1870(r6)
        L9d:
            throw r14
        L9e:
            l.۫᩵۠ r0 = r13.f4048
            r0.getClass()
            l.۫᩵۠ r1 = r13.f51738
            l.ۙ֨֨ r1 = r1.f16086
            l.ۙ֨֨ r11 = r14.mo13581(r0, r1)
        Lab:
            java.util.Map r0 = r13.f51739
            r0.put(r14, r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC16154.mo18876(l.᩻ۗ֨):l.ۙ֨֨");
    }
}
