package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: C5XG */
/* renamed from: l.᩵ۡۚ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19357 extends AbstractC21411 {

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public boolean f62661;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public boolean f62662;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f62663;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f62664;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f62665;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public boolean f62666;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f62667;

    @Override // l.AbstractC21411
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo44614(C0949 c0949, Object obj) {
        InterfaceC14062 interfaceC14062 = (InterfaceC14062) obj;
        int mo2302 = interfaceC14062.mo2302();
        if (mo2302 == 0) {
            c0949.m49704(((InterfaceC3354) interfaceC14062).getValue());
            return;
        }
        if (mo2302 == 6) {
            c0949.m49709(((InterfaceC7587) interfaceC14062).getValue());
            return;
        }
        if (mo2302 == 2) {
            c0949.m49719(((InterfaceC18213) interfaceC14062).getValue());
            return;
        }
        if (mo2302 == 3) {
            c0949.m49705(((InterfaceC13231) interfaceC14062).getValue());
            return;
        }
        if (mo2302 == 4) {
            c0949.m49708(((InterfaceC13936) interfaceC14062).getValue());
            return;
        }
        if (mo2302 == 16) {
            c0949.m49707(((InterfaceC23109) interfaceC14062).getValue());
            return;
        }
        if (mo2302 == 17) {
            c0949.m49706(((InterfaceC12526) interfaceC14062).getValue());
            return;
        }
        switch (mo2302) {
            case 21:
                c0949.m49713(((C23610) interfaceC14062).f76529);
                return;
            case 22:
                c0949.m49715(((C14437) interfaceC14062).f44252);
                return;
            case 23:
                c0949.m49711(((C9500) interfaceC14062).f28837);
                return;
            case 24:
                c0949.m49716(((C8794) interfaceC14062).f26784);
                return;
            case 25:
                c0949.m49720(((C1738) interfaceC14062).f6011);
                return;
            case 26:
                c0949.m49712(((C17260) interfaceC14062).f52912);
                return;
            case 27:
                c0949.m49714(((C7713) interfaceC14062).f23825);
                return;
            case 28:
                c0949.m49710(((C12652) interfaceC14062).f38107);
                return;
            case 29:
                C13357 c13357 = (C13357) interfaceC14062;
                c0949.m49717(c13357.f39928, c13357.f39927);
                return;
            case 30:
                c0949.m49703();
                return;
            case 31:
                c0949.m49718(((InterfaceC4765) interfaceC14062).getValue());
                return;
            default:
                throw new C15431(null, "Unrecognized value type: %d", Integer.valueOf(interfaceC14062.mo2302()));
        }
    }

    public C19357(C7897 c7897) {
        super(c7897);
        this.f62664 = false;
    }

    @Override // l.AbstractC21411
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo44617() {
        return !this.f62663 && super.mo44617();
    }

    @Override // l.AbstractC21411
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18651 mo44612() {
        return new C18651(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15848 m44611(String str, String str2, String str3, int i, InterfaceC10410 interfaceC10410, Set set, Set set2) {
        C3855 c3855 = this.f68924;
        c3855.getClass();
        return new C15848(c3855.m11615(new C20330(str, str2, str3)), i, interfaceC10410 == null ? null : m44610(interfaceC10410), ((C9125) this.f68945).m23499(set), set2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1032 m44607(String str, String str2, List list, String str3, int i, Set set, Set set2, InterfaceC19150 interfaceC19150) {
        AbstractC14545 m34732;
        List of = list == null ? AbstractC14545.of() : list;
        C3149 c3149 = this.f68923;
        c3149.getClass();
        C12321 m9577 = c3149.m9577(new C4560(str, str2, str3, of));
        if (of == null) {
            m34732 = AbstractC14545.of();
        } else {
            m34732 = AbstractC14545.m34732(C4648.m13611(of.iterator(), new C6656(this)));
        }
        return new C1032(m9577, m34732, i, ((C9125) this.f68945).m23499(set), set2, interfaceC19150);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0657 m44605(String str, int i, String str2, List list, String str3, Set set, ArrayList arrayList, Collection collection) {
        AbstractC23698 abstractC23698;
        AbstractC23698 abstractC236982;
        C12652 c12652;
        C23589 m34448;
        List list2 = list;
        C7382 c7382 = null;
        String str4 = this.f62667 ? null : str3;
        if (list2 == null) {
            list2 = AbstractC14545.of();
        } else {
            HashSet hashSet = new HashSet(list2);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str5 = (String) it.next();
                if (!hashSet.contains(str5)) {
                    it.remove();
                } else {
                    hashSet.remove(str5);
                }
            }
        }
        if (arrayList != null) {
            AbstractC23698 m52242 = AbstractC23698.m52242(C8882.m22954(arrayList, C14145.f42693));
            AbstractC23698 m522422 = AbstractC23698.m52242(C8882.m22954(arrayList, C14145.f42692));
            InterfaceC20288 m32967 = C13710.m32967(m52242);
            if (m32967 != null) {
                abstractC236982 = m522422;
                abstractC23698 = m52242;
                c12652 = this.f68950.m10658((AbstractC8185) m32967);
            } else {
                abstractC236982 = m522422;
                c12652 = null;
                abstractC23698 = m52242;
            }
        } else {
            abstractC23698 = null;
            abstractC236982 = null;
            c12652 = null;
        }
        C14416 c14416 = this.f68957;
        C23589 m344482 = c14416.m34448(str);
        if (str2 != null) {
            m34448 = c14416.m34448(str2);
        } else {
            c14416.getClass();
            m34448 = null;
        }
        C1717 m41946 = ((C17945) this.f68946).m41946(list2);
        C13731 c13731 = (C13731) this.f68948;
        if (str4 != null) {
            c7382 = c13731.m33032(str4);
        } else {
            c13731.getClass();
        }
        C0657 c0657 = new C0657(m344482, i, m34448, m41946, c7382, ((C9125) this.f68945).m23499(set), abstractC23698, abstractC236982, collection, c12652);
        this.f68942.m46785(c0657);
        return c0657;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7382 m44616(String str) {
        return ((C13731) this.f68948).m33032(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7382 m44608(String str) {
        if (str != null) {
            return m44616(str);
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC11616 m44609(InterfaceC8293 interfaceC8293) {
        if (interfaceC8293 instanceof InterfaceC15347) {
            return m44616(((InterfaceC15347) interfaceC8293).getString());
        }
        if (interfaceC8293 instanceof InterfaceC21699) {
            return this.f68957.m34448(((InterfaceC21699) interfaceC8293).getType());
        }
        if (interfaceC8293 instanceof InterfaceC5471) {
            return this.f68923.m9577((InterfaceC5471) interfaceC8293);
        }
        if (interfaceC8293 instanceof InterfaceC18877) {
            return this.f68924.m11615((InterfaceC18877) interfaceC8293);
        }
        if (interfaceC8293 instanceof InterfaceC0531) {
            return this.f68928.m16734((InterfaceC0531) interfaceC8293);
        }
        if (interfaceC8293 instanceof InterfaceC4060) {
            return this.f68926.m8574((InterfaceC4060) interfaceC8293);
        }
        if (interfaceC8293 instanceof InterfaceC19583) {
            return this.f68954.m35848((InterfaceC19583) interfaceC8293);
        }
        throw new IllegalArgumentException("Could not determine type of reference");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44615(boolean z) {
        this.f62664 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0657 m44606(InterfaceC8566 interfaceC8566) {
        try {
            return m44604(interfaceC8566);
        } catch (Throwable th) {
            throw new RuntimeException(C20094.m46315("An error occurred with the class: ", C15472.m36561(1, 1, interfaceC8566.getType())), th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a3, code lost:
    
        if (l.C17177.m40411(r1.mo3565(), l.EnumC15657.STATIC.m36866(r1.mo3567())) <= ((l.C20768) r5).f67273) goto L25;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C0657 m44604(l.InterfaceC8566 r25) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19357.m44604(l.ۡ֫ۚ):l.֡᩷ۚ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19150 m44613(InterfaceC19150 interfaceC19150) {
        if (interfaceC19150 == null) {
            return null;
        }
        int mo3818 = interfaceC19150.mo3818();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z = this.f62664;
        for (InterfaceC22677 interfaceC22677 : interfaceC19150.mo3817()) {
            if (interfaceC22677 instanceof InterfaceC0804) {
                ((InterfaceC0804) interfaceC22677).mo3030(this);
            }
            if (z) {
                AbstractC9617 abstractC9617 = (AbstractC9617) interfaceC22677;
                EnumC0841 enumC0841 = abstractC9617.f29162;
                if ((enumC0841.f3319 & 2) != 0) {
                    switch (C3834.f12249[enumC0841.ordinal()]) {
                        case 1:
                            abstractC9617.f29162 = EnumC0841.f3050;
                            break;
                        case 2:
                            abstractC9617.f29162 = EnumC0841.f3158;
                            break;
                        case 3:
                            abstractC9617.f29162 = EnumC0841.f3069;
                            break;
                        case 4:
                            abstractC9617.f29162 = EnumC0841.f3055;
                            break;
                        case 5:
                            abstractC9617.f29162 = EnumC0841.f3074;
                            break;
                        case 6:
                            abstractC9617.f29162 = EnumC0841.f3198;
                            break;
                        case 7:
                            abstractC9617.f29162 = EnumC0841.f3279;
                            break;
                        case 8:
                            abstractC9617.f29162 = EnumC0841.f3217;
                            break;
                        case 9:
                            abstractC9617.f29162 = EnumC0841.f3275;
                            break;
                        case 10:
                            abstractC9617.f29162 = EnumC0841.f3141;
                            break;
                        case 11:
                            abstractC9617.f29162 = EnumC0841.f3249;
                            break;
                        case 12:
                            abstractC9617.f29162 = EnumC0841.f3249;
                            break;
                    }
                }
            }
            if (interfaceC22677 != null) {
                arrayList.add(interfaceC22677);
            }
        }
        List<InterfaceC5038> mo3811 = interfaceC19150.mo3811();
        ArrayList arrayList3 = new ArrayList(mo3811.size());
        for (InterfaceC5038 interfaceC5038 : mo3811) {
            int mo14555 = interfaceC5038.mo14555();
            int mo14557 = interfaceC5038.mo14557();
            List<InterfaceC2216> mo14556 = interfaceC5038.mo14556();
            ArrayList arrayList4 = new ArrayList(mo14556.size());
            for (InterfaceC2216 interfaceC2216 : mo14556) {
                String mo7393 = interfaceC2216.mo7393();
                arrayList4.add(new C8773(mo7393 == null ? null : this.f68957.m34448(mo7393), interfaceC2216.mo7391()));
            }
            arrayList3.add(new C9479(arrayList4, mo14555, mo14557));
        }
        for (InterfaceC7860 interfaceC7860 : interfaceC19150.mo3812()) {
            int mo8424 = interfaceC7860.mo8424();
            if (!this.f62667 || mo8424 != 9) {
                if (!this.f62665 || mo8424 != 10) {
                    if (!this.f62666 || (mo8424 != 7 && mo8424 != 8)) {
                        if (!this.f62661 || (mo8424 != 3 && mo8424 != 6 && mo8424 != 5)) {
                            if (interfaceC7860 instanceof InterfaceC0804) {
                                ((InterfaceC0804) interfaceC7860).mo3030(this);
                            }
                            arrayList2.add(interfaceC7860);
                        }
                    }
                }
            }
        }
        return new C20768(mo3818, arrayList, arrayList3, arrayList2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC14062 m44610(InterfaceC10410 interfaceC10410) {
        int mo2302 = interfaceC10410.mo2302();
        if (mo2302 == 0) {
            return new C6302(((InterfaceC3354) interfaceC10410).getValue());
        }
        if (mo2302 == 6) {
            return new C17966(((InterfaceC7587) interfaceC10410).getValue());
        }
        if (mo2302 == 2) {
            return new C20789(((InterfaceC18213) interfaceC10410).getValue());
        }
        if (mo2302 == 3) {
            return new C11947(((InterfaceC13231) interfaceC10410).getValue());
        }
        if (mo2302 == 4) {
            return new C16554(((InterfaceC13936) interfaceC10410).getValue());
        }
        if (mo2302 == 16) {
            return new C10911(((InterfaceC23109) interfaceC10410).getValue());
        }
        if (mo2302 == 17) {
            return new C23235(((InterfaceC12526) interfaceC10410).getValue());
        }
        C3855 c3855 = this.f68924;
        C14416 c14416 = this.f68957;
        switch (mo2302) {
            case 21:
                return new C23610(this.f68928.m16734(((InterfaceC16801) interfaceC10410).getValue()));
            case 22:
                return new C14437(this.f68954.m35848(((InterfaceC11158) interfaceC10410).getValue()));
            case 23:
                return new C9500(((C13731) this.f68948).m33032(((InterfaceC17507) interfaceC10410).getValue()));
            case 24:
                return new C8794(c14416.m34448(((InterfaceC14684) interfaceC10410).getValue()));
            case 25:
                return new C1738(c3855.m11615(((InterfaceC11821) interfaceC10410).getValue()));
            case 26:
                return new C17260(this.f68923.m9577(((InterfaceC1985) interfaceC10410).getValue()));
            case 27:
                return new C7713(c3855.m11615(((InterfaceC6176) interfaceC10410).getValue()));
            case 28:
                return new C12652(AbstractC14545.m34732(C4648.m13611(((InterfaceC20288) interfaceC10410).getValue().iterator(), new C2423(this))));
            case 29:
                InterfaceC22404 interfaceC22404 = (InterfaceC22404) interfaceC10410;
                return new C13357(c14416.m34448(interfaceC22404.getType()), AbstractC6079.m16989(C4648.m13611(interfaceC22404.getElements().iterator(), new C15827(this))));
            case 30:
                return C6677.f20741;
            case 31:
                return ((InterfaceC4765) interfaceC10410).getValue() ? C10536.f31603 : C10536.f31604;
            default:
                throw new C15431(null, "Unexpected encoded value type: %d", Integer.valueOf(interfaceC10410.mo2302()));
        }
    }
}
