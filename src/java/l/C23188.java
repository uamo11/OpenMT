package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: 18YS */
/* renamed from: l.᩺᩵֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C23188 implements InterfaceC11487 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4844 f74532;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C9246 f74533;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final BitSet f74534;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f74535;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f74536;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f74537;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f74538;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C9784 f74539;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f74540 = new IdentityHashMap();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f74541;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f74542;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f74543;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f74544;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final BitSet f74545;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C16132 f74546;

    public C23188(C4844 c4844) {
        this.f74532 = c4844;
        ArrayList arrayList = new ArrayList(c4844.m14091());
        arrayList.add(new C2169());
        arrayList.add(new C18397());
        arrayList.add(new C0757());
        arrayList.add(new C8519());
        arrayList.add(new C14868());
        this.f74543 = arrayList;
        List m14090 = c4844.m14090();
        HashMap hashMap = new HashMap();
        Object[] objArr = {new C9225(), new C2875()};
        ArrayList arrayList2 = new ArrayList(2);
        int i = 0;
        while (i < 2) {
            Object obj = objArr[i];
            i = C8954.m23073(obj, arrayList2, obj, i, 1);
        }
        m51426(C20195.unmodifiableList(arrayList2), hashMap);
        m51426(m14090, hashMap);
        this.f74538 = hashMap;
        ArrayList arrayList3 = new ArrayList(c4844.m14094());
        arrayList3.add(new C0051());
        this.f74537 = arrayList3;
        Set m14092 = c4844.m14092();
        BitSet bitSet = new BitSet();
        Iterator it = m14092.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        bitSet.set(33);
        this.f74545 = bitSet;
        int m14093 = c4844.m14093();
        this.f74536 = m14093;
        this.f74535 = m14093 != Integer.MAX_VALUE;
        Set keySet = this.f74538.keySet();
        ArrayList arrayList4 = this.f74543;
        BitSet bitSet2 = (BitSet) bitSet.clone();
        Iterator it2 = keySet.iterator();
        while (it2.hasNext()) {
            bitSet2.set(((Character) it2.next()).charValue());
        }
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((InterfaceC14183) it3.next()).mo2897().iterator();
            while (it4.hasNext()) {
                bitSet2.set(((Character) it4.next()).charValue());
            }
        }
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(33);
        bitSet2.set(10);
        this.f74534 = bitSet2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51426(List list, HashMap hashMap) {
        C23335 c23335;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0072 interfaceC0072 = (InterfaceC0072) it.next();
            char mo1023 = interfaceC0072.mo1023();
            char mo1020 = interfaceC0072.mo1020();
            if (mo1023 == mo1020) {
                InterfaceC0072 interfaceC00722 = (InterfaceC0072) hashMap.get(Character.valueOf(mo1023));
                if (interfaceC00722 != null && interfaceC00722.mo1023() == interfaceC00722.mo1020()) {
                    if (interfaceC00722 instanceof C23335) {
                        c23335 = (C23335) interfaceC00722;
                    } else {
                        C23335 c233352 = new C23335(mo1023);
                        c233352.m51737(interfaceC00722);
                        c23335 = c233352;
                    }
                    c23335.m51737(interfaceC0072);
                    hashMap.put(Character.valueOf(mo1023), c23335);
                } else {
                    m51425(mo1023, interfaceC0072, hashMap);
                }
            } else {
                m51425(mo1023, interfaceC0072, hashMap);
                m51425(mo1020, interfaceC0072, hashMap);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51425(char c, InterfaceC0072 interfaceC0072, HashMap hashMap) {
        if (((InterfaceC0072) hashMap.put(Character.valueOf(c), interfaceC0072)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9246 m51434() {
        return this.f74533;
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x0396, code lost:
    
        if (r3.length() > 999) goto L173;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // l.InterfaceC11487
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo28307(l.C17712 r19, l.AbstractC0197 r20) {
        /*
            Method dump skipped, instructions count: 1451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23188.mo28307(l.ᩳ֨֡, l.֡ۚ֡):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12897 m51424(C17712 c17712) {
        C12897 c12897 = new C12897(c17712.m41444());
        c12897.m1342(c17712.m41447());
        return c12897;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m51433() {
        int i;
        C9784 c9784 = this.f74539;
        C9784 c97842 = c9784.f29595;
        this.f74539 = c97842;
        if (c97842 == null || (i = c9784.f29593) <= c97842.f29593) {
            return;
        }
        c97842.f29593 = i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C12897 m51431() {
        char m23725;
        C20535 m23724 = this.f74533.m23724();
        this.f74533.m23723();
        while (true) {
            m23725 = this.f74533.m23725();
            if (m23725 == 0 || this.f74534.get(m23725)) {
                break;
            }
            this.f74533.m23723();
        }
        C9246 c9246 = this.f74533;
        C17712 m23718 = c9246.m23718(m23724, c9246.m23724());
        String m41444 = m23718.m41444();
        if (m23725 == '\n') {
            int length = m41444.length();
            while (true) {
                length--;
                if (length < 0) {
                    length = -1;
                    break;
                }
                if (m41444.charAt(length) != ' ') {
                    break;
                }
            }
            int i = length + 1;
            this.f74544 = m41444.length() - i;
            m41444 = m41444.substring(0, i);
        } else if (m23725 == 0) {
            m41444 = m41444.substring(0, C8751.m22646(m41444.length() - 1, 0, m41444) + 1);
        }
        C12897 c12897 = new C12897(m41444);
        c12897.m1342(m23718.m41447());
        return c12897;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51430(C16132 c16132) {
        int i;
        boolean z;
        AbstractC0197 abstractC0197;
        HashMap hashMap = new HashMap();
        C16132 c161322 = this.f74546;
        while (c161322 != null) {
            C16132 c161323 = c161322.f49704;
            if (c161323 == c16132) {
                break;
            } else {
                c161322 = c161323;
            }
        }
        while (c161322 != null) {
            ArrayList arrayList = c161322.f49701;
            char c = c161322.f49703;
            InterfaceC0072 interfaceC0072 = (InterfaceC0072) this.f74538.get(Character.valueOf(c));
            if (!c161322.m38040() || interfaceC0072 == null) {
                c161322 = c161322.f49702;
            } else {
                C10489 c10489 = new C10489(c, (c161322.m38044() % 3) + (c161322.m38042() ? 3 : 0));
                C16132 c161324 = (C16132) hashMap.get(c10489);
                char mo1023 = interfaceC0072.mo1023();
                C16132 c161325 = c161322.f49704;
                C12897 c12897 = (C12897) arrayList.get(0);
                int i2 = 0;
                int i3 = 0;
                while (c161325 != null && c161325 != c16132 && c161325 != c161324) {
                    if (this.f74535) {
                        int max = Math.max(i2, m51423(c161325.m38043().m1352(), c12897));
                        C12897 m38043 = c161325.m38043();
                        if (max >= this.f74536) {
                            break;
                        }
                        i2 = max;
                        c12897 = m38043;
                    }
                    if (c161325.m38042() && c161325.f49703 == mo1023 && (i3 = interfaceC0072.mo1021(c161325, c161322)) > 0) {
                        i = i2 + 1;
                        abstractC0197 = c161325.m38043().m1352();
                        z = true;
                        break;
                    }
                    c161325 = c161325.f49704;
                }
                abstractC0197 = null;
                z = false;
                i = 0;
                if (z) {
                    for (int i4 = 0; i4 < i3; i4++) {
                        ((C12897) C4248.m12790(c161325.f49701, 1)).m1348();
                    }
                    for (int i5 = 0; i5 < i3; i5++) {
                        ((C12897) arrayList.remove(0)).m1348();
                    }
                    C16132 c161326 = c161322.f49704;
                    while (c161326 != null && c161326 != c161325) {
                        C16132 c161327 = c161326.f49704;
                        m51432(c161326);
                        c161326 = c161327;
                    }
                    if (abstractC0197 != null) {
                        m51428(abstractC0197, i);
                    }
                    if (c161325.f49701.size() == 0) {
                        m51432(c161325);
                    }
                    if (arrayList.size() == 0) {
                        C16132 c161328 = c161322.f49702;
                        m51432(c161322);
                        c161322 = c161328;
                    }
                } else {
                    hashMap.put(c10489, c161322.f49704);
                    if (!c161322.m38042()) {
                        m51432(c161322);
                    }
                    c161322 = c161322.f49702;
                }
            }
        }
        while (true) {
            C16132 c161329 = this.f74546;
            if (c161329 == null || c161329 == c16132) {
                return;
            } else {
                m51432(c161329);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51428(AbstractC0197 abstractC0197, int i) {
        if (this.f74535) {
            this.f74540.put(abstractC0197, Integer.valueOf(i));
            C9784 c9784 = this.f74539;
            if (c9784 == null || i <= c9784.f29593) {
                return;
            }
            c9784.f29593 = i;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m51423(AbstractC0197 abstractC0197, C12897 c12897) {
        int i = 0;
        while (abstractC0197 != null && abstractC0197 != c12897) {
            Integer num = (Integer) this.f74540.get(abstractC0197);
            if (num != null && num.intValue() > i) {
                i = num.intValue();
            }
            abstractC0197 = abstractC0197.m1352();
        }
        return i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m51432(C16132 c16132) {
        C16132 c161322 = c16132.f49704;
        if (c161322 != null) {
            c161322.f49702 = c16132.f49702;
        }
        C16132 c161323 = c16132.f49702;
        if (c161323 == null) {
            this.f74546 = c161322;
        } else {
            c161323.f49704 = c161322;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.֡ۚ֡] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51427(AbstractC0197 abstractC0197) {
        if (abstractC0197.m1341() == null) {
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(abstractC0197);
        while (!arrayDeque.isEmpty()) {
            AbstractC0197 abstractC01972 = (AbstractC0197) arrayDeque.removeLast();
            ?? m1341 = abstractC01972.m1341();
            AbstractC0197 m1349 = abstractC01972.m1349();
            int i = 0;
            C12897 c12897 = null;
            C12897 c128972 = null;
            for (C12897 c128973 = m1341; c128973 != null; c128973 = c128973.m1352()) {
                if (c128973 instanceof C12897) {
                    c128972 = c128973;
                    if (c12897 == null) {
                        c12897 = c128972;
                    }
                    i = c128972.m31335().length() + i;
                } else {
                    m51429(c12897, c128972, i);
                    if (c128973.m1341() != null) {
                        arrayDeque.addLast(c128973);
                    }
                    i = 0;
                    c12897 = null;
                    c128972 = null;
                }
                if (c128973 == m1349) {
                    break;
                }
            }
            m51429(c12897, c128972, i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51429(C12897 c12897, C12897 c128972, int i) {
        C4431 c4431;
        if (c12897 == null || c128972 == null || c12897 == c128972) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(c12897.m31335());
        if (this.f74541) {
            c4431 = new C4431();
            c4431.m13152(c12897.m1351());
        } else {
            c4431 = null;
        }
        AbstractC0197 m1352 = c12897.m1352();
        AbstractC0197 m13522 = c128972.m1352();
        while (m1352 != m13522) {
            sb.append(((C12897) m1352).m31335());
            if (c4431 != null) {
                c4431.m13152(m1352.m1351());
            }
            AbstractC0197 m13523 = m1352.m1352();
            m1352.m1348();
            m1352 = m13523;
        }
        c12897.m31334(sb.toString());
        if (c4431 != null) {
            c12897.m1342(c4431.m13151());
        }
    }
}
