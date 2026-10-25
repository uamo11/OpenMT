package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: A797 */
/* renamed from: l.۟᩷ۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7714 implements InterfaceC8795 {

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final String[] f23826 = new String[0];

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f23827;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17261 f23834;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f23837;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f23839 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f23828 = new HashMap();

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final HashSet f23832 = new HashSet();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet f23842 = new HashSet();

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final HashSet f23833 = new HashSet();

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final HashMap f23841 = new HashMap();

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final HashMap f23830 = new HashMap();

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashSet f23840 = new HashSet();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashSet f23843 = new HashSet();

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final HashSet f23836 = new HashSet();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashSet f23835 = new HashSet();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashSet f23831 = new HashSet();

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashSet f23829 = new HashSet();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f23838 = new ArrayDeque();

    public C7714(String str, C20790 c20790) {
        this.f23827 = str;
        this.f23834 = c20790;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20664(String str, C6303 c6303) {
        this.f23839.put(str, c6303);
        String str2 = c6303.f19486;
        if (str2 != null) {
            this.f23833.add(str2);
        }
        for (String str3 : c6303.f19487) {
            this.f23842.add(str3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r2 == false) goto L10;
     */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C6303 m20659(java.lang.String r9) {
        /*
            r8 = this;
            java.util.HashMap r0 = r8.f23828
            java.lang.Object r1 = r0.get(r9)
            l.ۛ᩷ۜ r1 = (l.C6303) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.util.HashMap r1 = r8.f23839
            java.lang.Object r1 = r1.get(r9)
            l.ۛ᩷ۜ r1 = (l.C6303) r1
            boolean r2 = r8.f23837
            if (r2 != 0) goto L70
            if (r1 == 0) goto L1f
            boolean r2 = l.C6303.m17348(r1)
            if (r2 != 0) goto L70
        L1f:
            java.util.HashSet r2 = r8.f23832
            if (r1 != 0) goto L2a
            boolean r3 = r2.contains(r9)
            if (r3 == 0) goto L2a
            goto L70
        L2a:
            l.ܿۢۜ r3 = r8.f23834     // Catch: java.lang.RuntimeException -> L5b
            java.lang.String r4 = r8.f23827     // Catch: java.lang.RuntimeException -> L5b
            l.ܽۢۜ r3 = r3.mo40556(r9, r4)     // Catch: java.lang.RuntimeException -> L5b
            l.ᩳۢۜ r4 = r3.f50865     // Catch: java.lang.RuntimeException -> L5b
            l.ᩳۢۜ r5 = l.EnumC17967.FOUND     // Catch: java.lang.RuntimeException -> L5b
            if (r4 != r5) goto L5d
            l.ۧۢۜ r3 = r3.f50864     // Catch: java.lang.RuntimeException -> L5b
            l.ۛ᩷ۜ r3 = l.C6303.m17345(r3)     // Catch: java.lang.RuntimeException -> L5b
            r0.put(r9, r3)     // Catch: java.lang.RuntimeException -> L5b
            java.lang.String r0 = r3.f19486     // Catch: java.lang.RuntimeException -> L5b
            if (r0 == 0) goto L4a
            java.util.HashSet r4 = r8.f23833     // Catch: java.lang.RuntimeException -> L5b
            r4.add(r0)     // Catch: java.lang.RuntimeException -> L5b
        L4a:
            java.lang.String[] r0 = r3.f19487     // Catch: java.lang.RuntimeException -> L5b
            int r4 = r0.length     // Catch: java.lang.RuntimeException -> L5b
            r5 = 0
        L4e:
            if (r5 >= r4) goto L5a
            r6 = r0[r5]     // Catch: java.lang.RuntimeException -> L5b
            java.util.HashSet r7 = r8.f23842     // Catch: java.lang.RuntimeException -> L5b
            r7.add(r6)     // Catch: java.lang.RuntimeException -> L5b
            int r5 = r5 + 1
            goto L4e
        L5a:
            return r3
        L5b:
            l.ܽۢۜ r3 = l.C16555.f50863
        L5d:
            l.ᩳۢۜ r0 = r3.f50865
            l.ᩳۢۜ r3 = l.EnumC17967.UNAVAILABLE
            if (r0 != r3) goto L67
            r9 = 1
            r8.f23837 = r9
            goto L70
        L67:
            if (r1 == 0) goto L6d
            l.C6303.m17349(r1)
            goto L70
        L6d:
            r2.add(r9)
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7714.m20659(java.lang.String):l.ۛ᩷ۜ");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m20661(String str) {
        C6303 c6303 = (C6303) this.f23839.get(str);
        return c6303 != null && m20659(str) == c6303;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private EnumC9501 m20631(String str, String str2, String str3, C14063 c14063, boolean z) {
        C23236 c23236 = c14063.f42487;
        if (str3.equals(str2)) {
            return EnumC9501.CONTRACT;
        }
        HashSet hashSet = new HashSet();
        while (str != null && hashSet.add(str)) {
            if (str.equals(str2)) {
                if (z && c23236.f74664 && m20660(str2, str3)) {
                    return EnumC9501.CONTRACT;
                }
                return EnumC9501.NONE;
            }
            C6303 m20659 = m20659(str);
            if (m20659 == null) {
                return EnumC9501.NONE;
            }
            if (str.equals(str3) && c23236.f74664) {
                return EnumC9501.CONTRACT;
            }
            if (m20659.m17352() && (m20659.m17351() || m20659.m17357() || (!m20659.m17355() && m20656(str, str2)))) {
                C23236 m51560 = C23236.m51560(str, m20659.m17354(), true);
                HashSet hashSet2 = c14063.f42489;
                String str4 = c23236.f74662;
                if (str4 != null) {
                    if (str4.equals(str)) {
                        return EnumC9501.POSSIBLE;
                    }
                    if (m20653(str, m51560, hashSet2)) {
                        return EnumC9501.NONE;
                    }
                } else if (m20653(str, m51560, hashSet2)) {
                    return EnumC9501.CONTRACT;
                }
                if (!m20659.m17355() && m20656(str, str2)) {
                    return EnumC9501.NONE;
                }
            }
            str = m20659.f19486;
        }
        return EnumC9501.NONE;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private C14063 m20646(String str) {
        HashMap hashMap = this.f23841;
        C14063 c14063 = (C14063) hashMap.get(str);
        if (c14063 != null) {
            return c14063;
        }
        C6303 m20659 = m20659(str);
        boolean z = m20659 != null && m20659.m17350();
        C23236 m20663 = z ? C23236.f74660 : m20663(str);
        HashSet hashSet = new HashSet();
        if (!z) {
            m20635(str, m20663, hashSet);
        }
        C14063 c140632 = new C14063(z, m20663, hashSet);
        hashMap.put(str, c140632);
        return c140632;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private C23236 m20663(String str) {
        C6303 m20659;
        C6303 m206592 = m20659(str);
        if (m206592 == null) {
            return C23236.f74660;
        }
        if (m206592.m17352()) {
            return C23236.m51560(str, m206592.m17354(), !m206592.m17353());
        }
        if (m206592.m17353()) {
            if (!m206592.m17356() && (m20659 = m20659("Ljava/lang/Object;")) != null && m20659.m17352() && m20659.m17351()) {
                return C23236.m51560("Ljava/lang/Object;", m20659.m17354(), true);
            }
            return m20655(str);
        }
        String str2 = m206592.f19486;
        HashSet hashSet = this.f23836;
        hashSet.clear();
        while (str2 != null && hashSet.add(str2)) {
            C6303 m206593 = m20659(str2);
            if (m206593 == null) {
                break;
            }
            if (m206593.m17352() && m20636(str, str2, m206593)) {
                C23236 m51560 = C23236.m51560(str2, m206593.m17354(), true);
                hashSet.clear();
                return m51560;
            }
            str2 = m206593.f19486;
        }
        hashSet.clear();
        return m20655(str);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C23236 m20655(String str) {
        HashSet hashSet = new HashSet();
        boolean m20651 = m20651(str, hashSet, new HashSet());
        if (hashSet.isEmpty()) {
            return m20651 ? C23236.f74659 : C23236.f74660;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Iterator it2 = hashSet.iterator();
            while (true) {
                if (it2.hasNext()) {
                    String str3 = (String) it2.next();
                    if (!str2.equals(str3)) {
                        HashSet hashSet2 = this.f23843;
                        hashSet2.clear();
                        boolean m20649 = m20649(str3, str2, hashSet2);
                        hashSet2.clear();
                        if (m20649) {
                            break;
                        }
                    }
                } else {
                    arrayList.add(str2);
                    break;
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        int i = 0;
        String str4 = null;
        while (it3.hasNext()) {
            String str5 = (String) it3.next();
            C6303 m20659 = m20659(str5);
            if (m20659 != null && m20659.m17354()) {
                i++;
                str4 = str5;
            }
        }
        return new C23236((String[]) arrayList.toArray(new String[arrayList.size()]), i == 1 ? str4 : null, false, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m20651(String str, HashSet hashSet, HashSet hashSet2) {
        C6303 m20659 = m20659(str);
        int i = 0;
        if (!hashSet2.add(str) || m20659 == null) {
            return false;
        }
        boolean m17356 = m20659.m17356();
        if (m20659.m17353()) {
            if (m20659.m17352()) {
                hashSet.add(str);
            }
            String[] strArr = m20659.f19487;
            int length = strArr.length;
            while (i < length) {
                m17356 |= m20651(strArr[i], hashSet, hashSet2);
                i++;
            }
            return m17356;
        }
        String[] strArr2 = m20659.f19487;
        int length2 = strArr2.length;
        while (i < length2) {
            m17356 |= m20651(strArr2[i], hashSet, hashSet2);
            i++;
        }
        String str2 = m20659.f19486;
        return str2 != null ? m20651(str2, hashSet, hashSet2) | m17356 : m17356;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20635(String str, C23236 c23236, HashSet hashSet) {
        C6303 m20659;
        ArrayDeque arrayDeque = this.f23838;
        arrayDeque.clear();
        for (String str2 : c23236.f74663) {
            if (hashSet.add(str2)) {
                arrayDeque.addLast(str2);
            }
        }
        if (c23236.f74661) {
            String[] strArr = c23236.f74663;
            if (strArr.length == 1 && (m20659 = m20659(strArr[0])) != null && m20659.m17351()) {
                HashSet hashSet2 = this.f23831;
                hashSet2.clear();
                m20633(str, hashSet);
                hashSet2.clear();
            }
        }
        while (!arrayDeque.isEmpty()) {
            String str3 = (String) arrayDeque.removeFirst();
            C6303 m206592 = m20659(str3);
            if (m206592 != null) {
                HashSet hashSet3 = this.f23835;
                hashSet3.clear();
                String str4 = m206592.f19486;
                if (str4 != null) {
                    m20632(str4, str3, hashSet);
                }
                if (m206592.m17351()) {
                    for (String str5 : m206592.f19487) {
                        m20632(str5, str3, hashSet);
                    }
                }
                hashSet3.clear();
            }
        }
        arrayDeque.clear();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20633(String str, HashSet hashSet) {
        C6303 m20659;
        if (this.f23831.add(str) && (m20659 = m20659(str)) != null) {
            int i = 0;
            if (m20659.m17353()) {
                if (m20659.m17352() && hashSet.add(str)) {
                    this.f23838.addLast(str);
                }
                String[] strArr = m20659.f19487;
                int length = strArr.length;
                while (i < length) {
                    m20633(strArr[i], hashSet);
                    i++;
                }
                return;
            }
            String[] strArr2 = m20659.f19487;
            int length2 = strArr2.length;
            while (i < length2) {
                m20633(strArr2[i], hashSet);
                i++;
            }
            String str2 = m20659.f19486;
            if (str2 != null) {
                m20633(str2, hashSet);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20632(String str, String str2, HashSet hashSet) {
        C6303 m20659;
        if (this.f23835.add(str) && (m20659 = m20659(str)) != null) {
            if (m20659.m17352() && m20636(str2, str, m20659) && hashSet.add(str)) {
                this.f23838.addLast(str);
            }
            String str3 = m20659.f19486;
            if (str3 != null) {
                m20632(str3, str2, hashSet);
            }
            for (String str4 : m20659.f19487) {
                m20632(str4, str2, hashSet);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m20653(String str, C23236 c23236, HashSet hashSet) {
        HashSet hashSet2 = this.f23829;
        hashSet2.clear();
        m20635(str, c23236, hashSet2);
        boolean m20641 = m20641(hashSet2, hashSet);
        hashSet2.clear();
        return m20641;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m20652(String str, C23236 c23236, String str2, C23236 c232362) {
        if (!c23236.f74664 && !c232362.f74664) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        if (c23236.f74664 && m20660(str2, str) && m20644(c232362, str)) {
            return true;
        }
        return c232362.f74664 && m20660(str, str2) && m20644(c23236, str2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20644(C23236 c23236, String str) {
        if (c23236.f74664) {
            return true;
        }
        C6303 m20659 = m20659(str);
        if (m20659 != null) {
            String[] strArr = c23236.f74663;
            if (strArr.length != 0) {
                for (String str2 : strArr) {
                    C6303 m206592 = m20659(str2);
                    if (m206592 != null) {
                        if (m206592.m17351()) {
                            return true;
                        }
                        if (!m20659.m17353() && c23236.f74661 && m206592.m17357()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m20641(HashSet hashSet, HashSet hashSet2) {
        HashSet hashSet3 = hashSet.size() <= hashSet2.size() ? hashSet : hashSet2;
        if (hashSet3 == hashSet) {
            hashSet = hashSet2;
        }
        Iterator it = hashSet3.iterator();
        while (it.hasNext()) {
            if (hashSet.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20638(String str, C23236 c23236, String str2, C23236 c232362) {
        if (m20661(str2) && c232362.f74663.length == 0 && m20662(str, str2) && m20640(str2, c232362, c23236)) {
            return true;
        }
        return m20661(str) && c23236.f74663.length == 0 && m20662(str2, str) && m20640(str, c23236, c232362);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (r2.isEmpty() != false) goto L51;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m20637(java.lang.String r18, l.C23236 r19, java.lang.String r20, l.C14063 r21, boolean r22) {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            r9 = r20
            r10 = r21
            boolean r0 = r7.m20661(r9)
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L19
            l.᩺᩷ۜ r0 = r10.f42487
            java.lang.String[] r0 = r0.f74663
            int r0 = r0.length
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            boolean r1 = r17.m20661(r18)
            r13 = r19
            if (r1 == 0) goto L2a
            java.lang.String[] r1 = r13.f74663
            int r1 = r1.length
            if (r1 != 0) goto L2a
            r1 = 1
            r14 = 1
            goto L2c
        L2a:
            r1 = 0
            r14 = 0
        L2c:
            if (r0 != 0) goto L32
            if (r14 != 0) goto L32
            goto Ld6
        L32:
            l.ۨ᩷ۜ r1 = r10.f42488
            if (r1 != 0) goto L4e
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r7.m20634(r9, r1, r2)
            l.ۨ᩷ۜ r2 = new l.ۨ᩷ۜ
            java.lang.String r3 = r7.m20630(r9)
            r2.<init>(r3, r1)
            r10.f42488 = r2
        L4e:
            l.ۨ᩷ۜ r15 = r10.f42488
            java.lang.String r1 = r15.f35711
            java.util.HashSet r2 = r15.f35710
            if (r1 != 0) goto L5c
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto Ld6
        L5c:
            if (r22 == 0) goto L89
            java.util.HashSet r3 = r7.f23832
            if (r1 == 0) goto L6a
            boolean r4 = r3.contains(r1)
            if (r4 != 0) goto L6a
            goto Ld6
        L6a:
            java.util.Iterator r4 = r2.iterator()
        L6e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L81
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r3.contains(r5)
            if (r5 != 0) goto L6e
            goto Ld6
        L81:
            if (r1 != 0) goto L89
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto Ld6
        L89:
            boolean r1 = r8.equals(r9)
            if (r1 == 0) goto L92
            r16 = r15
            goto Laa
        L92:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r7.m20634(r8, r1, r2)
            l.ۨ᩷ۜ r2 = new l.ۨ᩷ۜ
            java.lang.String r3 = r17.m20630(r18)
            r2.<init>(r3, r1)
            r16 = r2
        Laa:
            if (r0 == 0) goto Lc0
            l.᩺᩷ۜ r2 = r10.f42487
            r0 = r17
            r1 = r20
            r3 = r15
            r4 = r18
            r5 = r19
            r6 = r16
            boolean r0 = r0.m20639(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto Lc0
            goto Ld5
        Lc0:
            if (r14 == 0) goto Ld6
            l.᩺᩷ۜ r5 = r10.f42487
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r16
            r4 = r20
            r6 = r15
            boolean r0 = r0.m20639(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto Ld6
        Ld5:
            return r11
        Ld6:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7714.m20637(java.lang.String, l.᩺᩷ۜ, java.lang.String, l.ܰ᩷ۜ, boolean):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20639(String str, C23236 c23236, C11948 c11948, String str2, C23236 c232362, C11948 c119482) {
        C6303 c6303;
        boolean equals;
        if (c23236.f74663.length != 0 || !m20661(str2) || (c6303 = (C6303) this.f23839.get(str)) == null) {
            return false;
        }
        HashSet hashSet = c11948.f35710;
        String str3 = c11948.f35711;
        HashSet hashSet2 = c11948.f35710;
        boolean z = !hashSet.isEmpty() && hashSet2.equals(c119482.f35710);
        if (c6303.m17353()) {
            return z && m20643(c232362);
        }
        if (str3 == null) {
            equals = c119482.f35711 == null;
        } else {
            equals = str3.equals(c119482.f35711);
        }
        if (equals && hashSet2.equals(c119482.f35710)) {
            if (z && m20643(c232362)) {
                return true;
            }
            if (str3 != null && m20654(c232362, str3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20634(String str, HashSet hashSet, HashSet hashSet2) {
        String str2;
        if (hashSet2.add(str)) {
            C6303 m20659 = m20659(str);
            if (m20659 == null) {
                if (m20647(str)) {
                    hashSet.add(str);
                    return;
                }
                return;
            }
            for (String str3 : m20659.f19487) {
                m20634(str3, hashSet, hashSet2);
            }
            if (m20659.m17353() || (str2 = m20659.f19486) == null) {
                return;
            }
            m20634(str2, hashSet, hashSet2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20640(String str, C23236 c23236, C23236 c232362) {
        if (c23236.f74663.length != 0) {
            return false;
        }
        HashSet hashSet = this.f23831;
        hashSet.clear();
        boolean m20650 = m20650(str, hashSet);
        hashSet.clear();
        if (m20650 && m20643(c232362)) {
            return true;
        }
        String m20630 = m20630(str);
        return m20630 != null && m20654(c232362, m20630);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m20650(String str, HashSet hashSet) {
        String str2;
        if (!hashSet.add(str)) {
            return false;
        }
        C6303 m20659 = m20659(str);
        if (m20659 == null) {
            return m20647(str);
        }
        for (String str3 : m20659.f19487) {
            if (m20650(str3, hashSet)) {
                return true;
            }
        }
        return (m20659.m17353() || (str2 = m20659.f19486) == null || !m20650(str2, hashSet)) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m20630(String str) {
        HashSet hashSet = this.f23836;
        hashSet.clear();
        while (str != null && hashSet.add(str)) {
            C6303 m20659 = m20659(str);
            if (m20659 == null) {
                if (!m20657(str)) {
                    str = null;
                }
                hashSet.clear();
                return str;
            }
            if (m20659.m17353()) {
                hashSet.clear();
                return null;
            }
            str = m20659.f19486;
        }
        hashSet.clear();
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m20654(C23236 c23236, String str) {
        String str2;
        C6303 m20659;
        String[] strArr = c23236.f74663;
        return strArr.length == 0 || (c23236.f74661 && strArr.length == 1 && (m20659 = m20659((str2 = strArr[0]))) != null && (m20659.m17351() || m20659.m17357() || (!m20659.m17355() && m20656(str2, str))));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20643(C23236 c23236) {
        String[] strArr = c23236.f74663;
        if (strArr.length == 0) {
            return true;
        }
        for (String str : strArr) {
            C6303 m20659 = m20659(str);
            if (m20659 != null && m20659.m17351()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m20648(String str, String str2) {
        boolean equals = str.equals(str2);
        HashSet hashSet = new HashSet();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(str);
        while (true) {
            if (arrayDeque.isEmpty()) {
                return false;
            }
            String str3 = (String) arrayDeque.removeFirst();
            if (hashSet.add(str3)) {
                C6303 m20659 = m20659(str3);
                if (m20659 == null) {
                    if (m20647(str3) && (equals || str3.equals(str2))) {
                        return true;
                    }
                } else {
                    for (String str4 : m20659.f19487) {
                        arrayDeque.addLast(str4);
                    }
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m20658(String str, String str2) {
        boolean equals = str.equals(str2);
        HashSet hashSet = new HashSet();
        while (str != null && hashSet.add(str)) {
            C6303 m20659 = m20659(str);
            if (m20659 == null) {
                return m20657(str) && (equals || str.equals(str2));
            }
            str = m20659.f19486;
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m20647(String str) {
        return m20659(str) == null && this.f23842.contains(str);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m20657(String str) {
        return m20659(str) == null && this.f23833.contains(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20636(String str, String str2, C6303 c6303) {
        C6303 m20659 = m20659(str);
        if (c6303.m17351() || c6303.m17357()) {
            return true;
        }
        return m20659 != null && m20659.m17355() == c6303.m17355() && m20656(str, str2);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m20656(String str, String str2) {
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf == str2.lastIndexOf(47) && str.regionMatches(0, str2, 0, lastIndexOf + 1);
    }

    @Override // l.InterfaceC8795
    /* renamed from: ֫ */
    public final EnumC9501 mo14250(String str, String str2, String str3, String str4) {
        String str5;
        C23236 m20655;
        C23236 c23236;
        if (!this.f23827.equals(str4)) {
            return EnumC9501.NONE;
        }
        C14063 m20646 = m20646(str3);
        C23236 c232362 = m20646.f42487;
        if (m20646.f42483) {
            return EnumC9501.NONE;
        }
        C6303 m20659 = m20659(str);
        C6303 m206592 = m20659(str2);
        if (m20659 == null) {
            return EnumC9501.NONE;
        }
        boolean m20647 = m20647(str2);
        boolean m20657 = m20657(str2);
        if (m206592 == null || !m206592.m17353()) {
            if (m20647) {
                if (str.equals(str2) || !m20660(str, str2)) {
                    return EnumC9501.NONE;
                }
                return (str3.equals(str2) || (c232362.f74663.length == 0 && m20648(str3, str2))) ? EnumC9501.CONTRACT : EnumC9501.NONE;
            }
            if (m206592 == null && !m20657) {
                return EnumC9501.NONE;
            }
            if (m20659.m17353() || str.equals(str2) || !m20660(str, str2) || (str5 = m20659.f19486) == null) {
                return EnumC9501.NONE;
            }
            if (m20657) {
                if (c232362.f74663.length == 0 && m20658(str3, str2)) {
                    return EnumC9501.CONTRACT;
                }
                return m20631(str5, str2, str3, m20646, false);
            }
            C23236 m20663 = m20663(str2);
            if (m20663.f74663.length == 0) {
                if (m20663.f74664) {
                    if (!m20652(str2, m20663, str3, c232362)) {
                        return EnumC9501.NONE;
                    }
                    return m20631(str5, str2, str3, m20646, true);
                }
                String m20630 = m20630(str2);
                if (m20630 == null) {
                    return EnumC9501.NONE;
                }
                if (c232362.f74663.length == 0 && (m20658(str2, str3) || m20638(str2, m20663, str3, c232362) || m20637(str2, m20663, str3, m20646, false))) {
                    return EnumC9501.CONTRACT;
                }
                return m20631(str5, m20630, str3, m20646, false);
            }
            C23236 m206632 = m20663(str2);
            HashSet hashSet = new HashSet();
            m20635(str2, m206632, hashSet);
            if (hashSet.isEmpty()) {
                m20655 = C23236.f74660;
            } else {
                HashSet hashSet2 = new HashSet();
                String str6 = str5;
                while (str6 != null && hashSet2.add(str6)) {
                    C6303 m206593 = m20659(str6);
                    if (m206593 == null) {
                        break;
                    }
                    if (m206593.m17352()) {
                        C23236 m51560 = C23236.m51560(str6, m206593.m17354(), true);
                        if (m20653(str6, m51560, hashSet)) {
                            m20655 = m51560;
                            break;
                        }
                    }
                    str6 = m206593.f19486;
                }
                m20655 = m20655(str5);
                if (!m20653(str5, m20655, hashSet)) {
                    m20655 = C23236.f74660;
                }
            }
            C23236 c232363 = m20655;
            str2 = str5;
            c23236 = c232363;
        } else {
            if (str.equals(str2) || !m20660(str, str2)) {
                return EnumC9501.NONE;
            }
            c23236 = m20655(str2);
            if (c23236.f74664 && str3.equals(str2)) {
                return EnumC9501.CONTRACT;
            }
            if (c23236.f74663.length == 0 && c232362.f74663.length == 0 && (m20652(str2, c23236, str3, c232362) || m20648(str2, str3) || m20638(str2, c23236, str3, c232362) || m20637(str2, c23236, str3, m20646, false))) {
                return EnumC9501.CONTRACT;
            }
        }
        String str7 = c232362.f74662;
        if (str7 == null) {
            return m20653(str2, c23236, m20646.f42489) ? EnumC9501.CONTRACT : EnumC9501.NONE;
        }
        if (!str7.equals(c23236.f74662)) {
            return EnumC9501.NONE;
        }
        return EnumC9501.EXACT;
    }

    @Override // l.InterfaceC8795
    /* renamed from: ֫ */
    public final boolean mo14251(String str, String str2) {
        if (!this.f23827.equals(str2)) {
            return false;
        }
        C14063 m20646 = m20646(str);
        if (!m20646.f42483) {
            return m20646.f42487.f74662 != null;
        }
        C6303 m20659 = m20659(str);
        return m20659 != null && m20659.m17354();
    }

    @Override // l.InterfaceC8795
    /* renamed from: ֫ */
    public final boolean mo14252(String str, String str2, String str3) {
        if (!this.f23827.equals(str3)) {
            return false;
        }
        C14063 m20646 = m20646(str2);
        HashMap hashMap = m20646.f42484;
        C23236 c23236 = m20646.f42487;
        if (m20646.f42483) {
            return false;
        }
        String str4 = c23236.f74662;
        String str5 = c23236.f74662;
        if (str4 == null) {
            return false;
        }
        C6303 m20659 = m20659(str);
        if (m20659 != null && m20659.m17350()) {
            return false;
        }
        Boolean bool = (Boolean) hashMap.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        C23236 m20663 = m20663(str);
        boolean z = (m20663.f74664 || c23236.f74664) ? false : true;
        boolean equals = str5.equals(m20663.f74662);
        if (!equals) {
            equals = m20652(str, m20663, str2, c23236);
        }
        if (!equals && m20647(str)) {
            equals = !m20662(str2, str) ? false : m20643(m20663(str2));
        }
        if (!equals && m20657(str)) {
            equals = !m20662(str2, str) ? false : m20654(m20663(str2), str);
        }
        if (!equals && z) {
            equals = m20638(str, m20663, str2, c23236);
        }
        if (!equals && z && m20662(str2, str)) {
            equals = m20653(str, m20663, m20646.f42489);
        }
        if (!equals) {
            if (m20646.f42486 == null) {
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                ArrayDeque arrayDeque = new ArrayDeque();
                for (Map.Entry entry : this.f23839.entrySet()) {
                    if (m20661((String) entry.getKey()) && !((C6303) entry.getValue()).m17353()) {
                        String str6 = (String) entry.getKey();
                        C23236 m206632 = m20663(str6);
                        if (str5.equals(m206632.f74662)) {
                            hashSet2.clear();
                            m20635(str6, m206632, hashSet2);
                            hashSet4.clear();
                            arrayDeque.clear();
                            arrayDeque.addLast(str6);
                            while (!arrayDeque.isEmpty()) {
                                String str7 = (String) arrayDeque.removeFirst();
                                if (hashSet4.add(str7)) {
                                    C6303 m206592 = m20659(str7);
                                    if (m206592 == null) {
                                        if ((m20647(str7) && m20643(m206632)) || (m20657(str7) && m20654(m206632, str7))) {
                                            hashSet.add(str7);
                                        }
                                    } else {
                                        hashSet3.clear();
                                        C23236 m206633 = m20663(str7);
                                        m20635(str7, m206633, hashSet3);
                                        if (m20641(hashSet2, hashSet3) || m20640(str7, m206633, m206632)) {
                                            hashSet.add(str7);
                                        }
                                        String str8 = m206592.f19486;
                                        if (str8 != null) {
                                            arrayDeque.addLast(str8);
                                        }
                                        for (String str9 : m206592.f19487) {
                                            arrayDeque.addLast(str9);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                m20646.f42486 = hashSet;
            }
            equals = m20646.f42486.contains(str);
        }
        hashMap.put(str, Boolean.valueOf(equals));
        return equals;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    @Override // l.InterfaceC8795
    /* renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo14253(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            r8 = this;
            java.lang.String r0 = r8.f23827
            boolean r11 = r0.equals(r11)
            r0 = 0
            if (r11 != 0) goto Lb
            goto Ld9
        Lb:
            l.ܰ᩷ۜ r5 = r8.m20646(r10)
            java.util.HashSet r11 = r5.f42489
            java.util.HashMap r7 = r5.f42485
            l.᩺᩷ۜ r1 = r5.f42487
            l.ۛ᩷ۜ r2 = r8.m20659(r9)
            boolean r3 = r5.f42483
            if (r3 != 0) goto Ld9
            if (r2 == 0) goto L27
            boolean r2 = r2.m17350()
            if (r2 == 0) goto L27
            goto Ld9
        L27:
            java.lang.Object r2 = r7.get(r9)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L34
            boolean r9 = r2.booleanValue()
            return r9
        L34:
            l.᩺᩷ۜ r3 = r8.m20663(r9)
            boolean r2 = r8.m20652(r9, r3, r10, r1)
            if (r2 != 0) goto L55
            boolean r4 = r8.m20647(r9)
            if (r4 == 0) goto L55
            boolean r11 = r8.m20662(r10, r9)
            if (r11 != 0) goto L4b
            goto La1
        L4b:
            l.᩺᩷ۜ r11 = r8.m20663(r10)
        L4f:
            boolean r11 = r8.m20643(r11)
        L53:
            r2 = r11
            goto La9
        L55:
            if (r2 != 0) goto L6d
            boolean r4 = r8.m20657(r9)
            if (r4 == 0) goto L6d
            boolean r11 = r8.m20662(r10, r9)
            if (r11 != 0) goto L64
            goto La1
        L64:
            l.᩺᩷ۜ r11 = r8.m20663(r10)
            boolean r11 = r8.m20654(r11, r9)
            goto L53
        L6d:
            if (r2 != 0) goto La3
            boolean r4 = r11.isEmpty()
            if (r4 == 0) goto La3
            boolean r11 = r8.m20647(r10)
            if (r11 == 0) goto L87
            boolean r11 = r8.m20662(r9, r10)
            if (r11 != 0) goto L82
            goto La1
        L82:
            l.᩺᩷ۜ r11 = r8.m20663(r9)
            goto L4f
        L87:
            boolean r11 = r8.m20657(r10)
            if (r11 == 0) goto La1
            boolean r11 = r8.m20662(r9, r10)
            if (r11 != 0) goto L95
            r11 = 0
            goto L9d
        L95:
            l.᩺᩷ۜ r11 = r8.m20663(r9)
            boolean r11 = r8.m20654(r11, r10)
        L9d:
            if (r11 == 0) goto La1
            r2 = 1
            goto La9
        La1:
            r2 = 0
            goto La9
        La3:
            if (r2 != 0) goto La9
            boolean r2 = r8.m20653(r9, r3, r11)
        La9:
            if (r2 != 0) goto Ld0
            boolean r11 = r3.f74664
            if (r11 != 0) goto Lb4
            boolean r11 = r1.f74664
            if (r11 != 0) goto Lb4
            r0 = 1
        Lb4:
            if (r0 == 0) goto Lba
            boolean r2 = r8.m20638(r9, r3, r10, r1)
        Lba:
            if (r2 != 0) goto Ld0
            if (r0 == 0) goto Lc7
            r6 = 0
            r1 = r8
            r2 = r9
            r4 = r10
            boolean r10 = r1.m20637(r2, r3, r4, r5, r6)
            goto Ld1
        Lc7:
            r6 = 1
            r1 = r8
            r2 = r9
            r4 = r10
            boolean r10 = r1.m20637(r2, r3, r4, r5, r6)
            goto Ld1
        Ld0:
            r10 = r2
        Ld1:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)
            r7.put(r9, r11)
            return r10
        Ld9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7714.mo14253(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m20660(String str, String str2) {
        HashSet hashSet = this.f23840;
        hashSet.clear();
        boolean m20649 = m20649(str, str2, hashSet);
        hashSet.clear();
        return m20649;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m20649(String str, String str2, HashSet hashSet) {
        C6303 m20659;
        if (str.equals(str2)) {
            return true;
        }
        if (!hashSet.add(str) || (m20659 = m20659(str)) == null) {
            return false;
        }
        String str3 = m20659.f19486;
        if (str3 != null && (str3.equals(str2) || m20649(m20659.f19486, str2, hashSet))) {
            return true;
        }
        for (String str4 : m20659.f19487) {
            if (str4.equals(str2) || m20649(str4, str2, hashSet)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m20662(String str, String str2) {
        HashMap hashMap = this.f23830;
        HashMap hashMap2 = (HashMap) hashMap.get(str);
        Boolean bool = hashMap2 == null ? null : (Boolean) hashMap2.get(str2);
        if (bool != null) {
            return bool.booleanValue();
        }
        HashSet hashSet = this.f23840;
        hashSet.clear();
        boolean m20649 = m20649(str, str2, hashSet);
        hashSet.clear();
        HashMap hashMap3 = (HashMap) hashMap.get(str);
        if (hashMap3 == null) {
            hashMap3 = new HashMap();
            hashMap.put(str, hashMap3);
        }
        hashMap3.put(str2, Boolean.valueOf(m20649));
        return m20649;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m20642(InterfaceC18444 interfaceC18444) {
        int mo3567 = interfaceC18444.mo3567();
        if (EnumC15657.ABSTRACT.m36866(mo3567)) {
            return false;
        }
        return interfaceC18444.mo3570() != null || EnumC15657.NATIVE.m36866(mo3567);
    }
}
