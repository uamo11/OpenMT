package l;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: Y7KZ */
/* renamed from: l.ܽᩳ۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16803 extends C14190 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f51589;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC5144 f51590;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f51591;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39538(AbstractC5144 abstractC5144, AbstractC5144 abstractC51442) {
        AbstractC4308 abstractC4308;
        if (abstractC5144 == null || abstractC51442 == null) {
            return abstractC5144 == null && abstractC51442 == null;
        }
        AbstractC5144 m19471 = C7260.m19471(abstractC5144);
        AbstractC5144 m194712 = C7260.m19471(abstractC51442);
        AbstractC4308 abstractC43082 = m19471.f16086;
        if (abstractC43082 != null && abstractC43082.mo12915() != null && (abstractC4308 = m194712.f16086) != null && abstractC4308.mo12915() != null) {
            return C11003.equals(m19471.f16086.mo12915(), m194712.f16086.mo12915());
        }
        if (m19471.mo989() != m194712.mo989()) {
            return false;
        }
        AbstractC5144 abstractC51443 = this.f51590;
        boolean z = this.f51591;
        try {
            this.f51590 = m194712;
            m19471.mo988(this);
            return this.f51591;
        } finally {
            this.f51590 = abstractC51443;
            this.f51591 = z;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m39537(Iterable iterable, Iterable iterable2) {
        if (iterable == null || iterable2 == null) {
            return iterable == null && iterable2 == null;
        }
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!m39538((AbstractC5144) it.next(), (AbstractC5144) it2.next())) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1385(C7673 c7673) {
        C7673 c76732 = (C7673) this.f51590;
        AbstractC5698 abstractC5698 = c7673.f23697;
        AbstractC5698 abstractC56982 = c76732.f23697;
        if (abstractC5698 != null && abstractC56982 != null && C11003.equals(this.f51589.get(abstractC5698), abstractC56982)) {
            this.f51591 = true;
        } else {
            this.f51591 = c7673.f23697 == c76732.f23697;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1381(C6262 c6262) {
        C6262 c62622 = (C6262) this.f51590;
        this.f51591 = m39538(c6262.f19397, c62622.f19397) && c6262.f19396 == c62622.f19396;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1416(C18257 c18257) {
        C18257 c182572 = (C18257) this.f51590;
        this.f51591 = m39537(c18257.f56778, c182572.f56778) && m39538(c18257.f56779, c182572.f56779);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1413(C17551 c17551) {
        C17551 c175512 = (C17551) this.f51590;
        this.f51591 = m39538(c17551.f53650, c175512.f53650) && m39537(c17551.f53653, c175512.f53653);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1407(C15580 c15580) {
        C15580 c155802 = (C15580) this.f51590;
        this.f51591 = m39537(c15580.f48010, c155802.f48010) && m39538(c15580.f48011, c155802.f48011) && m39537(c15580.f48012, c155802.f48012) && c15580.f13845 == c155802.f13845;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1383(C6968 c6968) {
        C6968 c69682 = (C6968) this.f51590;
        this.f51591 = m39538(c6968.f21475, c69682.f21475) && m39538(c6968.f21476, c69682.f21476);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1423(C21080 c21080) {
        C21080 c210802 = (C21080) this.f51590;
        this.f51591 = m39538(c21080.f67987, c210802.f67987) && m39538(c21080.f67988, c210802.f67988);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1393(C9791 c9791) {
        C9791 c97912 = (C9791) this.f51590;
        this.f51591 = m39538(c9791.f29619, c97912.f29619) && m39538(c9791.f29618, c97912.f29618) && c9791.f2830 == c97912.f2830;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1390(C9085 c9085) {
        C9085 c90852 = (C9085) this.f51590;
        this.f51591 = m39538(c9085.f27533, c90852.f27533) && m39538(c9085.f27532, c90852.f27532) && c9085.f2830 == c90852.f2830;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1409(C16139 c16139) {
        this.f51591 = m39538(c16139.f49721, ((C16139) this.f51590).f49721);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1372(C2735 c2735) {
        C2735 c27352 = (C2735) this.f51590;
        this.f51591 = c2735.f8522 == c27352.f8522 && m39537(c2735.f8521, c27352.f8521);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1377(C4146 c4146) {
        this.f51591 = c4146.f13545 == ((C4146) this.f51590).f13545;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1371(C2322 c2322) {
        this.f51591 = m39538(c2322.f7456, ((C2322) this.f51590).f7456);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1418(C18963 c18963) {
        C18963 c189632 = (C18963) this.f51590;
        this.f51591 = m39537(c18963.f59815, c189632.f59815) && m39537(c18963.f59814, c189632.f59814);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1425(C21785 c21785) {
        this.f51591 = true;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1366(C0617 c0617) {
        C0617 c06172 = (C0617) this.f51590;
        this.f51591 = m39538(c0617.f2373, c06172.f2373) && m39538(c0617.f2372, c06172.f2372);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        C5557 c55572 = (C5557) this.f51590;
        this.f51591 = m39538(c5557.f17181, c55572.f17181) && c5557.f17180 == c55572.f17180 && m39537(c5557.f17185, c55572.f17185) && m39538(c5557.f17184, c55572.f17184) && m39537(c5557.f17183, c55572.f17183) && m39537(c5557.f17179, c55572.f17179);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1387(C8379 c8379) {
        C8379 c83792 = (C8379) this.f51590;
        this.f51591 = m39538(c8379.f25701, c83792.f25701) && m39538(c8379.f25699, c83792.f25699) && m39538(c8379.f25700, c83792.f25700);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1406(C15433 c15433) {
        this.f51591 = c15433.f47247 == ((C15433) this.f51590).f47247;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1421(C20374 c20374) {
        C20374 c203742 = (C20374) this.f51590;
        this.f51591 = m39538(c20374.f65770, c203742.f65770) && m39538(c20374.f65771, c203742.f65771);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1374(C3440 c3440) {
        this.f51591 = m39537(c3440.f10874, ((C3440) this.f51590).f10874);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1394(C10496 c10496) {
        this.f51591 = m39538(c10496.f31483, ((C10496) this.f51590).f31483);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1400(C13317 c13317) {
        C13317 c133172 = (C13317) this.f51590;
        this.f51591 = m39538(c13317.f39865, c133172.f39865) && m39537(c13317.f39866, c133172.f39866);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1397(C11907 c11907) {
        C11907 c119072 = (C11907) this.f51590;
        this.f51591 = m39537(c11907.f35587, c119072.f35587) && m39538(c11907.f35588, c119072.f35588) && m39537(c11907.f35586, c119072.f35586) && m39538(c11907.f35585, c119072.f35585);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1378(C4851 c4851) {
        C4851 c48512 = (C4851) this.f51590;
        this.f51591 = m39538(c4851.f15325, c48512.f15325) && m39538(c4851.f15326, c48512.f15326) && m39538(c4851.f15324, c48512.f15324);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1368(C1470 c1470) {
        C1470 c14702 = (C1470) this.f51590;
        this.f51591 = m39538(c1470.f5225, c14702.f5225) && m39538(c1470.f5226, c14702.f5226) && m39538(c1470.f5227, c14702.f5227);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1395(C10643 c10643) {
        C10643 c106432 = (C10643) this.f51590;
        this.f51591 = c10643.f32020 == c106432.f32020 && m39538(c10643.f32021, c106432.f32021);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1404(C14728 c14728) {
        C14728 c147282 = (C14728) this.f51590;
        this.f51591 = m39538(c14728.f44980, c147282.f44980) && m39538(c14728.f44979, c147282.f44979);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1414(C17698 c17698) {
        C17698 c176982 = (C17698) this.f51590;
        this.f51591 = c17698.f54160 == c176982.f54160 && m39538(c17698.f54159, c176982.f54159);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1217(C14169 c14169) {
        C14169 c141692 = (C14169) this.f51590;
        this.f51591 = m39537(c14169.f42775, c141692.f42775) && m39538(c14169.f42776, c141692.f42776) && c14169.f42773 == c141692.f42773;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1376(C3733 c3733) {
        C3733 c37332 = (C3733) this.f51590;
        this.f51591 = m39537(c3733.f11797, c37332.f11797) && m39538(c3733.f11799, c37332.f11799);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1427(C23342 c23342) {
        C23342 c233422 = (C23342) this.f51590;
        this.f51591 = c23342.f74996 == c233422.f74996 && C11003.equals(c23342.f74997, c233422.f74997);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        C8526 c85262 = (C8526) this.f51590;
        this.f51591 = m39538(c8526.f26046, c85262.f26046) && c8526.f26044 == c85262.f26044 && m39538(c8526.f26051, c85262.f26051) && m39537(c8526.f26047, c85262.f26047) && m39538(c8526.f26052, c85262.f26052) && m39537(c8526.f26048, c85262.f26048) && m39537(c8526.f26042, c85262.f26042) && m39538(c8526.f26043, c85262.f26043) && m39538(c8526.f26049, c85262.f26049);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1370(C2176 c2176) {
        C2176 c21762 = (C2176) this.f51590;
        this.f51591 = c2176.f7169 == c21762.f7169 && m39537(c2176.f7168, c21762.f7168);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1375(C3587 c3587) {
        C3587 c35872 = (C3587) this.f51590;
        this.f51591 = m39538(c3587.f11379, c35872.f11379) && m39538(c3587.f11378, c35872.f11378) && m39537(c3587.f11376, c35872.f11376);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r2.hasNext() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (m39537(r6.f57139, r0.f57139) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        if (r2 == null) goto L27;
     */
    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1417(l.C18404 r6) {
        /*
            r5 = this;
            l.ۚۚ۠ r0 = r5.f51590
            l.ᩴ֡۠ r0 = (l.C18404) r0
            l.۫᩵۠ r1 = r6.f57138
            l.۫᩵۠ r2 = r0.f57138
            boolean r1 = r5.m39538(r1, r2)
            if (r1 == 0) goto L6f
            l.ۖܶ۠ r1 = r6.f57140
            l.ۖܶ۠ r2 = r0.f57140
            boolean r1 = r5.m39537(r1, r2)
            if (r1 == 0) goto L6f
            l.ۖܶ۠ r1 = r6.f57137
            l.ۖܶ۠ r2 = r0.f57137
            boolean r1 = r5.m39537(r1, r2)
            if (r1 == 0) goto L6f
            l.ۖܶ۠ r1 = r6.f57141
            l.ۖܶ۠ r2 = r0.f57141
            if (r1 == 0) goto L5f
            if (r2 != 0) goto L2b
            goto L5f
        L2b:
            java.util.Iterator r1 = r1.iterator()
            java.util.Iterator r2 = r2.iterator()
        L33:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L52
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L52
            java.lang.Object r3 = r1.next()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.Object r4 = r2.next()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r3 = r5.m39537(r3, r4)
            if (r3 != 0) goto L33
            goto L6f
        L52:
            boolean r1 = r1.hasNext()
            if (r1 != 0) goto L6f
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L6f
            goto L63
        L5f:
            if (r1 != 0) goto L6f
            if (r2 != 0) goto L6f
        L63:
            l.ۖܶ۠ r6 = r6.f57139
            l.ۖܶ۠ r0 = r0.f57139
            boolean r6 = r5.m39537(r6, r0)
            if (r6 == 0) goto L6f
            r6 = 1
            goto L70
        L6f:
            r6 = 0
        L70:
            r5.f51591 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16803.mo1417(l.ᩴ֡۠):void");
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
        C19110 c191102 = (C19110) this.f51590;
        this.f51591 = m39538(c19110.f60199, c191102.f60199) && m39537(c19110.f60198, c191102.f60198) && m39538(c19110.f60196, c191102.f60196) && m39537(c19110.f60197, c191102.f60197) && m39538(c19110.f60195, c191102.f60195) && c19110.f60194 == c191102.f60194;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1365(C0058 c0058) {
        C0058 c00582 = (C0058) this.f51590;
        this.f51591 = m39538(c0058.f946, c00582.f946) && m39537(c0058.f947, c00582.f947);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1386(C7820 c7820) {
        C7820 c78202 = (C7820) this.f51590;
        this.f51591 = m39537(c7820.f24198, c78202.f24198) && m39538(c7820.f24199, c78202.f24199) && c7820.f24200 == c78202.f24200;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1399(C12759 c12759) {
        C12759 c127592 = (C12759) this.f51590;
        this.f51591 = m39538(c12759.f38349, c127592.f38349) && m39537(c12759.f38348, c127592.f38348);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1391(C9232 c9232) {
        C9232 c92322 = (C9232) this.f51590;
        this.f51591 = c9232.f27940 == c92322.f27940 && c9232.f27942 == c92322.f27942 && c9232.f27944 == c92322.f27944 && m39538(c9232.f27945, c92322.f27945) && m39537(c9232.f27947, c92322.f27947);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1398(C12054 c12054) {
        C12054 c120542 = (C12054) this.f51590;
        this.f51591 = c12054.f36053 == c120542.f36053 && c12054.f36054 == c120542.f36054 && m39538(c12054.f36052, c120542.f36052);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1216(C9938 c9938) {
        this.f51591 = m39538(c9938.f30017, ((C9938) this.f51590).f30017);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1426(C22637 c22637) {
        C22637 c226372 = (C22637) this.f51590;
        this.f51591 = m39538(c22637.f73103, c226372.f73103) && m39537(c22637.f73102, c226372.f73102);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1401(C13464 c13464) {
        C13464 c134642 = (C13464) this.f51590;
        this.f51591 = m39538(c13464.f40197, c134642.f40197) && m39537(c13464.f40199, c134642.f40199);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1384(C7115 c7115) {
        C7115 c71152 = (C7115) this.f51590;
        this.f51591 = m39538(c7115.f21831, c71152.f21831) && m39538(c7115.f21830, c71152.f21830);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1369(C1616 c1616) {
        this.f51591 = m39538(c1616.f5680, ((C1616) this.f51590).f5680);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1367(C1323 c1323) {
        C1323 c13232 = (C1323) this.f51590;
        this.f51591 = m39537(c1323.f4738, c13232.f4738) && c1323.f4739 == c13232.f4739 && c1323.f4746 == c13232.f4746;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1396(C10789 c10789) {
        C10789 c107892 = (C10789) this.f51590;
        this.f51591 = m39538(c10789.f32445, c107892.f32445) && m39537(c10789.f32449, c107892.f32449) && m39538(c10789.f32448, c107892.f32448) && m39537(c10789.f32446, c107892.f32446);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1411(C16432 c16432) {
        C16432 c164322 = (C16432) this.f51590;
        this.f51591 = m39538(c16432.f50542, c164322.f50542) && m39537(c16432.f50541, c164322.f50541);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1429(C23901 c23901) {
        this.f51591 = m39538(c23901.f77274, ((C23901) this.f51590).f77274);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1420(C19256 c19256) {
        this.f51591 = c19256.f60620 == ((C19256) this.f51590).f60620;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1415(C17844 c17844) {
        C17844 c178442 = (C17844) this.f51590;
        this.f51591 = m39538(c17844.f54511, c178442.f54511) && m39538(c17844.f54512, c178442.f54512);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1373(C2882 c2882) {
        this.f51591 = c2882.f9190 == ((C2882) this.f51590).f9190;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1412(C17138 c17138) {
        this.f51591 = m39537(c17138.f52525, ((C17138) this.f51590).f52525);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1403(C14315 c14315) {
        C14315 c143152 = (C14315) this.f51590;
        this.f51591 = c14315.f43169 == c143152.f43169 && m39537(c14315.f43170, c143152.f43170) && m39537(c14315.f43168, c143152.f43168);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1410(C16286 c16286) {
        C16286 c162862 = (C16286) this.f51590;
        this.f51591 = m39538(c16286.f50075, c162862.f50075) && m39538(c16286.f50076, c162862.f50076);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1428(C23488 c23488) {
        this.f51591 = m39537(c23488.f75416, ((C23488) this.f51590).f75416);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1382(C6555 c6555) {
        C6555 c65552 = (C6555) this.f51590;
        this.f51591 = m39538(c6555.f20226, c65552.f20226) && c6555.f2830 == c65552.f2830;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1422(C20667 c20667) {
        this.f51591 = m39538(c20667.f66557, ((C20667) this.f51590).f66557);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        C9378 c93782 = (C9378) this.f51590;
        boolean z = m39538(c9378.f28486, c93782.f28486) && c9378.f28484 == c93782.f28484 && m39538(c9378.f28483, c93782.f28483) && m39538(c9378.f28488, c93782.f28488) && m39538(c9378.f28487, c93782.f28487);
        this.f51591 = z;
        if (z) {
            this.f51589.put(c9378.f28489, c93782.f28489);
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1389(C8672 c8672) {
        C8672 c86722 = (C8672) this.f51590;
        this.f51591 = m39538(c8672.f26445, c86722.f26445) && m39538(c8672.f26444, c86722.f26444);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1408(C15726 c15726) {
        C15726 c157262 = (C15726) this.f51590;
        this.f51591 = m39538(c15726.f48502, c157262.f48502) && m39538(c15726.f48501, c157262.f48501);
    }

    public C16803(C2609 c2609, C2609 c26092) {
        this.f51589 = new HashMap();
        HashMap hashMap = new HashMap();
        Iterator it = c26092.iterator();
        Iterator it2 = c2609.iterator();
        while (it2.hasNext()) {
            AbstractC5698 abstractC5698 = (AbstractC5698) it2.next();
            if (!it.hasNext()) {
                break;
            } else {
                hashMap.put(abstractC5698, (AbstractC5698) it.next());
            }
        }
        this.f51589 = hashMap;
    }
}
