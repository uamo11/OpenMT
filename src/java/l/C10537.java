package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 1799 */
/* renamed from: l.ۤ᩷ۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10537 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20790 f31606;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11691 f31607;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15799 f31608;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26457() {
        C20790.m47591().m47592();
    }

    public C10537(C11691 c11691, C15799 c15799) {
        C20790 m47591 = C20790.m47591();
        this.f31607 = c11691;
        this.f31608 = c15799;
        this.f31606 = m47591;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [l.۟᩷ۜ] */
    /* JADX WARN: Type inference failed for: r7v3, types: [l.۟᩷ۜ] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6, types: [l.ۙ᩷ۜ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2776 m26462(C14852 c14852, C9418 c9418, C15923 c15923) {
        ?? c7714;
        C4892 c4892;
        C17667 c17667;
        int i;
        int i2;
        String str;
        int i3;
        C15799 c15799;
        int i4;
        int i5;
        int i6;
        ArrayList arrayList;
        C1739 c1739;
        C4892 c48922;
        C13358 c13358;
        C15923 c159232 = c15923;
        String str2 = c9418.f28570;
        String str3 = c9418.f28572;
        boolean equals = "dex_method".equals(str3);
        String str4 = c9418.f28565;
        String str5 = c9418.f28571;
        String str6 = c9418.f28567;
        C15799 c157992 = this.f31608;
        if (equals) {
            C20790 c20790 = this.f31606;
            c20790.m47592();
            if (!"exact".equals(str2)) {
                c157992.getClass();
                if (C15799.m37396(str6)) {
                    c7714 = new C7714(str5, c20790);
                    Iterator it = c14852.f45308.iterator();
                    while (it.hasNext()) {
                        C7980 m28579 = this.f31607.m28579(c14852, (C17667) it.next(), c159232);
                        c7714.m20664(m28579.getType(), C6303.m17344(m28579, str5));
                    }
                } else {
                    c7714 = new C7714(str5, c20790);
                    Iterator it2 = c157992.m37408(c14852, str6, c159232).iterator();
                    while (it2.hasNext()) {
                        C7980 m37426 = c157992.m37426(c14852, str6, (C17667) it2.next(), c159232);
                        c7714.m20664(m37426.getType(), C6303.m17344(m37426, str5));
                    }
                }
            } else {
                C16555 mo40556 = c20790.mo40556(str4, str5);
                if (mo40556.f50865 == EnumC17967.FOUND) {
                    int i7 = mo40556.f50864.f32783 & 7;
                    c7714 = new C4892(str4, str5, i7 == 2 || i7 == 4);
                } else {
                    Iterator it3 = c157992.m37409(c14852, str6, false, c159232).iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            c17667 = null;
                            break;
                        }
                        c17667 = (C17667) it3.next();
                        if (str4.equals(C14844.m35246(c17667.f54033))) {
                            break;
                        }
                    }
                    if (c17667 == null) {
                        c4892 = new C4892(str4, str5, false);
                    } else {
                        Iterator it4 = c157992.m37414(c14852, str6, c17667, c159232).getMethods().iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                InterfaceC18444 interfaceC18444 = (InterfaceC18444) it4.next();
                                if (C15474.m36565(interfaceC18444, str5)) {
                                    c4892 = new C4892(str4, str5, C7714.m20642(interfaceC18444));
                                    break;
                                }
                            } else {
                                c4892 = new C4892(str4, str5, false);
                                break;
                            }
                        }
                    }
                }
            }
            c4892 = c7714;
        } else {
            c4892 = new C4892("", "", false);
        }
        C4892 c48923 = c4892;
        boolean z = "dex_method".equals(str3) && c48923.mo14251(str4, str5);
        ArrayList arrayList2 = new ArrayList();
        C3481 c3481 = new C3481();
        C12653 m30932 = C12653.m30932(c9418);
        C13358 c133582 = new C13358(this);
        C1739 c17392 = c9418.f28568;
        ArrayList m37408 = c157992.m37408(c14852, str6, c159232);
        int i8 = c17392.f6012;
        int i9 = c17392.f6014;
        int i10 = i8;
        while (i10 < m37408.size()) {
            C7980 m374262 = c157992.m37426(c14852, str6, (C17667) m37408.get(i10), c159232);
            int i11 = i10 == i8 ? i9 : 0;
            int i12 = 0;
            for (C16611 c16611 : m374262.getMethods()) {
                int i13 = i12 + 1;
                if (i12 < i11) {
                    i3 = i11;
                    i5 = i9;
                    i6 = i8;
                    arrayList = m37408;
                    c1739 = c17392;
                    str = str6;
                    c15799 = c157992;
                    c48922 = c48923;
                    i4 = i10;
                    c13358 = c133582;
                } else {
                    if (i10 == i8 && i12 == i9) {
                        i = i12;
                        i2 = c17392.f6013;
                    } else {
                        i = i12;
                        i2 = 0;
                    }
                    int i14 = i;
                    str = str6;
                    i3 = i11;
                    c15799 = c157992;
                    i4 = i10;
                    i5 = i9;
                    i6 = i8;
                    arrayList = m37408;
                    c1739 = c17392;
                    c48922 = c48923;
                    c13358 = c133582;
                    c133582.m32326(c9418, c48923, arrayList2, c16611, z, c3481, m30932);
                    int m39130 = c16611.m39130(i2, c13358);
                    C1739 c17393 = m39130 >= 0 ? new C1739(i4, i14, m39130) : null;
                    if (c17393 != null) {
                        return new C2776(c14852.f45300, c9418.f28572, c9418.f28565, c9418.f28571, str2, arrayList2, c17393);
                    }
                }
                i10 = i4;
                c133582 = c13358;
                i12 = i13;
                str6 = str;
                i11 = i3;
                c157992 = c15799;
                i9 = i5;
                i8 = i6;
                m37408 = arrayList;
                c17392 = c1739;
                c48923 = c48922;
            }
            i10++;
            c159232 = c15923;
            c157992 = c157992;
            c48923 = c48923;
        }
        return new C2776(c14852.f45300, c9418.f28572, c9418.f28565, c9418.f28571, str2, arrayList2, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m26460(C10537 c10537, C9418 c9418, InterfaceC8795 interfaceC8795, C16611 c16611, C12918 c12918, int i, EnumC0841 enumC0841, int i2, boolean z, C3481 c3481, C12653 c12653) {
        if (i2 != 3 || !enumC0841.f3315.startsWith("invoke-")) {
            return false;
        }
        AbstractC3912 m31418 = c12918.m31418();
        int m31415 = c12918.m31415(i);
        int m11936 = m31418.m11936(m31415);
        String str = c9418.f28571;
        String str2 = c9418.f28570;
        String str3 = c9418.f28565;
        if ("exact".equals(str2)) {
            if (!c12918.m31407(m11936, 0, str3.length(), str3) || !m26461(c12918, m31415, str, c12653)) {
                return false;
            }
            m26459(c3481, enumC0841, c12918.m31401(m11936), str, z);
            return true;
        }
        if (enumC0841.f3315.startsWith("invoke-polymorphic") || enumC0841.f3315.startsWith("invoke-static") || enumC0841.f3315.startsWith("invoke-direct") || enumC0841.f3315.startsWith("invoke-object-init")) {
            if (!c12918.m31407(m11936, 0, str3.length(), str3) || !m26461(c12918, m31415, str, c12653)) {
                return false;
            }
            m26459(c3481, enumC0841, c12918.m31401(m11936), str, z);
            return true;
        }
        if (enumC0841.f3315.startsWith("invoke-super")) {
            if (!m26461(c12918, m31415, str, c12653)) {
                return false;
            }
            String m31401 = c12918.m31401(m11936);
            boolean equals = str3.equals(m31401);
            if (!"slot".equals(str2)) {
                EnumC9501 mo14250 = interfaceC8795.mo14250(c16611.f51043.getType(), m31401, str3, str);
                if (mo14250 == EnumC9501.NONE) {
                    return false;
                }
                m26458(c3481, m31401, str, "super_call", mo14250.f28843);
                return true;
            }
            if (equals) {
                m26458(c3481, m31401, str, "super_call", "not_applicable");
                return true;
            }
            if (!interfaceC8795.mo14253(m31401, str3, str)) {
                return false;
            }
            m26458(c3481, m31401, str, "same_virtual_slot", "not_applicable");
            return true;
        }
        if (!enumC0841.f3315.startsWith("invoke-virtual") && !enumC0841.f3315.startsWith("invoke-interface")) {
            if (!c12918.m31407(m11936, 0, str3.length(), str3) || !m26461(c12918, m31415, str, c12653)) {
                return false;
            }
            m26459(c3481, enumC0841, c12918.m31401(m11936), str, z);
            return true;
        }
        if (!m26461(c12918, m31415, str, c12653)) {
            return false;
        }
        String m314012 = c12918.m31401(m11936);
        boolean equals2 = str3.equals(m314012);
        if ("slot".equals(str2)) {
            if (!str.equals(str)) {
                return false;
            }
            if (equals2) {
                m26458(c3481, m314012, str, "exact_reference", z ? "possible" : "not_applicable");
                return true;
            }
            if (!interfaceC8795.mo14253(m314012, str3, str)) {
                return false;
            }
            m26458(c3481, m314012, str, "same_virtual_slot", "not_applicable");
            return true;
        }
        if (!str.equals(str)) {
            return false;
        }
        if (equals2) {
            m26458(c3481, m314012, str, "exact_reference", z ? "possible" : "not_applicable");
            return true;
        }
        if (z) {
            if (!interfaceC8795.mo14252(m314012, str3, str)) {
                return false;
            }
            m26458(c3481, m314012, str, "possible_virtual_dispatch", "possible");
            return true;
        }
        if (!interfaceC8795.mo14253(m314012, str3, str)) {
            return false;
        }
        m26458(c3481, m314012, str, "same_virtual_slot", "not_applicable");
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26459(C3481 c3481, EnumC0841 enumC0841, String str, String str2, boolean z) {
        if (enumC0841.f3315.startsWith("invoke-super")) {
            m26458(c3481, str, str2, "super_call", "not_applicable");
            return;
        }
        if (enumC0841.f3315.startsWith("invoke-virtual") || enumC0841.f3315.startsWith("invoke-interface")) {
            m26458(c3481, str, str2, "exact_reference", z ? "possible" : "not_applicable");
        } else if (enumC0841.f3315.startsWith("invoke-polymorphic")) {
            m26458(c3481, str, str2, "exact_reference", "not_applicable");
        } else {
            m26458(c3481, str, str2, "exact_reference", "exact");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r8 <= r14) goto L27;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m26461(l.C12918 r11, int r12, java.lang.String r13, l.C12653 r14) {
        /*
            l.ۘۨ֡ r0 = r11.m31418()
            int r1 = r12 + 4
            int r1 = r0.mo11935(r1)
            int r2 = r14.f38112
            r3 = 0
            boolean r1 = r11.m31392(r1, r3, r2, r13)
            if (r1 != 0) goto L14
            return r3
        L14:
            int r12 = r12 + 2
            int r12 = r0.m11936(r12)
            l.ۘۨ֡ r0 = r11.m31418()
            int r12 = r11.m31399(r12)
            int r1 = r12 + 8
            int r1 = r0.mo11935(r1)
            int r2 = r14.f38113
            int r4 = r14.f38111
            int r14 = r14.f38114
            if (r1 <= 0) goto L7f
            int r5 = r0.mo11935(r1)
            int r1 = r1 + 4
            r6 = 0
        L37:
            if (r6 >= r5) goto L7f
            r7 = -1
            if (r2 < r14) goto L3d
            goto L68
        L3d:
            r8 = r2
        L3e:
            if (r8 >= r14) goto L4b
            char r9 = r13.charAt(r8)
            r10 = 91
            if (r9 != r10) goto L4b
            int r8 = r8 + 1
            goto L3e
        L4b:
            if (r8 < r14) goto L4e
            goto L68
        L4e:
            char r9 = r13.charAt(r8)
            r10 = 76
            if (r9 != r10) goto L63
            r9 = 59
            int r8 = r13.indexOf(r9, r8)
            if (r8 < 0) goto L68
            if (r8 >= r14) goto L68
            int r8 = r8 + 1
            goto L67
        L63:
            int r8 = r8 + 1
            if (r8 > r14) goto L68
        L67:
            r7 = r8
        L68:
            if (r7 >= 0) goto L6b
            goto L81
        L6b:
            int r8 = r6 * 2
            int r8 = r8 + r1
            int r8 = r0.m11936(r8)
            int r9 = r7 - r2
            boolean r2 = r11.m31407(r8, r2, r9, r13)
            if (r2 != 0) goto L7b
            goto L81
        L7b:
            int r6 = r6 + 1
            r2 = r7
            goto L37
        L7f:
            if (r2 == r14) goto L82
        L81:
            return r3
        L82:
            int r12 = r12 + 4
            int r12 = r0.mo11935(r12)
            int r14 = r13.length()
            int r14 = r14 - r4
            boolean r11 = r11.m31407(r12, r4, r14, r13)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10537.m26461(l.۬ۛ֡, int, java.lang.String, l.۫᩷ۜ):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26458(C3481 c3481, String str, String str2, String str3, String str4) {
        c3481.f11031 = C22870.m50967(str, "->", str2);
        c3481.f11030 = str3;
        c3481.f11029 = str4;
    }
}
