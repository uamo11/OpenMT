package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: O8YX */
/* renamed from: l.᩵᩵֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19662 implements InterfaceC19124 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Map f63494;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final LinkedHashSet f63495;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final List f63496;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f63497;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f63498;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22775 f63499;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C16300 f63500;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f63501;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2728 f63502;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f63506;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List f63509;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f63510;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f63511;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Set f63514;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC5842 f63515;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f63516;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final List f63517;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f63513 = -1;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f63504 = 0;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f63512 = 0;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f63503 = 0;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f63508 = 0;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f63505 = 0;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9078 f63507 = new C9078(0);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17837 m45210(String str) {
        int i = 0;
        while (true) {
            int length = str.length();
            int i2 = i;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                char charAt = str.charAt(i2);
                if (charAt == '\n' || charAt == '\r') {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                break;
            }
            m45201(i, str.substring(i, i2));
            i = i2 + 1;
            if (i < str.length() && str.charAt(i2) == '\r' && str.charAt(i) == '\n') {
                i = i2 + 2;
            }
        }
        if (!str.isEmpty() && (i == 0 || i < str.length())) {
            m45201(i, str.substring(i));
        }
        m45200(this.f63516.size());
        InterfaceC11487 mo32166 = this.f63499.mo32166(new C4844(this.f63509, this.f63517, this.f63496, this.f63514, this.f63501, this.f63507));
        Iterator it = this.f63498.iterator();
        while (it.hasNext()) {
            ((InterfaceC2190) it.next()).mo7217(mo32166);
        }
        return this.f63502.mo7223();
    }

    static {
        int i = 0;
        Object[] objArr = {C22630.class, C6548.class, C14308.class, C20660.class, C12192.class, AbstractC18543.class, C15719.class};
        ArrayList arrayList = new ArrayList(7);
        while (i < 7) {
            Object obj = objArr[i];
            i = C8954.m23073(obj, arrayList, obj, i, 1);
        }
        f63495 = new LinkedHashSet(C20195.unmodifiableList(arrayList));
        HashMap hashMap = new HashMap();
        hashMap.put(C22630.class, new C23894());
        hashMap.put(C6548.class, new C1316());
        hashMap.put(C14308.class, new C0610());
        hashMap.put(C20660.class, new C15426());
        hashMap.put(C12192.class, new C6402());
        hashMap.put(AbstractC18543.class, new C1463());
        hashMap.put(C15719.class, new C22483());
        f63494 = C20195.unmodifiableMap(hashMap);
    }

    public C19662(ArrayList arrayList, InterfaceC22775 interfaceC22775, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, HashSet hashSet, EnumC5842 enumC5842, int i, int i2) {
        ArrayList arrayList5 = new ArrayList();
        this.f63516 = arrayList5;
        this.f63498 = new ArrayList();
        this.f63510 = arrayList;
        this.f63499 = interfaceC22775;
        this.f63509 = arrayList2;
        this.f63517 = arrayList3;
        this.f63496 = arrayList4;
        this.f63514 = hashSet;
        this.f63515 = enumC5842;
        this.f63497 = i;
        this.f63501 = i2;
        C2728 c2728 = new C2728();
        this.f63502 = c2728;
        arrayList5.add(new C18956(c2728, 0));
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static LinkedHashSet m45204() {
        return f63495;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m45199(ArrayList arrayList, LinkedHashSet linkedHashSet) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add((InterfaceC3601) f63494.get((Class) it.next()));
        }
        return arrayList2;
    }

    @Override // l.InterfaceC19124
    public final C16300 getLine() {
        return this.f63500;
    }

    @Override // l.InterfaceC19124
    public final int getIndex() {
        return this.f63504;
    }

    @Override // l.InterfaceC19124
    /* renamed from: ᩳ */
    public final int mo44153() {
        return this.f63503;
    }

    @Override // l.InterfaceC19124
    /* renamed from: ۧ */
    public final int mo44150() {
        return this.f63512;
    }

    @Override // l.InterfaceC19124
    /* renamed from: ܽ */
    public final int mo44151() {
        return this.f63505;
    }

    @Override // l.InterfaceC19124
    /* renamed from: ֫ */
    public final boolean mo44149() {
        return this.f63506;
    }

    @Override // l.InterfaceC19124
    /* renamed from: ܿ */
    public final InterfaceC2190 mo44152() {
        InterfaceC2190 interfaceC2190;
        interfaceC2190 = ((C18956) C18566.m43105(this.f63516, 1)).f59787;
        return interfaceC2190;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0101, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00b0, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        r12 = r0.size() - r13;
        r13 = ((l.C18956) r0.get(r13 - 1)).f59787;
        r2 = r11.f63504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a5, code lost:
    
        if ((r13.mo7223() instanceof l.C21365) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
    
        if (r13.mo7222() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ae, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        if (r4 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        r2 = r11.f63504;
        m45208();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
    
        if (r11.f63506 != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c0, code lost:
    
        if (r11.f63505 >= 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
    
        if (java.lang.Character.isLetter(java.lang.Character.codePointAt(r11.f63500.m38335(), r11.f63503)) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0171, code lost:
    
        m45207(r11.f63503);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0176, code lost:
    
        if (r6 != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017a, code lost:
    
        if (r11.f63506 != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0184, code lost:
    
        if (mo44152().mo7225() == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0186, code lost:
    
        ((l.C18956) l.C18566.m43105(r0, 1)).f59788 = r2;
        m45206();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0192, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0193, code lost:
    
        if (r12 <= 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0195, code lost:
    
        m45200(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x019c, code lost:
    
        if (r13.mo7222() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x019e, code lost:
    
        m45206();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a4, code lost:
    
        if (r11.f63506 != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a6, code lost:
    
        m45202(new l.C18956(new l.C14162(), r2));
        m45206();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b7, code lost:
    
        m45209();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ba, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00dc, code lost:
    
        if (r0.size() <= r11.f63497) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00df, code lost:
    
        r7 = new l.C4139(r13);
        r8 = r11.f63510.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ee, code lost:
    
        if (r8.hasNext() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f0, code lost:
    
        r9 = ((l.InterfaceC3601) r8.next()).mo2488(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fe, code lost:
    
        if (l.C12354.m29972(r9) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0102, code lost:
    
        if (r9 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x010b, code lost:
    
        r6 = r11.f63504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x010d, code lost:
    
        if (r12 <= 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x010f, code lost:
    
        m45200(r12);
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0117, code lost:
    
        if (r9.m47975() == (-1)) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0119, code lost:
    
        m45207(r9.m47975());
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0132, code lost:
    
        if (r9.m47977() >= 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0135, code lost:
    
        r7 = mo44152();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x013b, code lost:
    
        if ((r7 instanceof l.C14162) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x013d, code lost:
    
        r7 = ((l.C14162) r7).m33800(r9.m47977());
        m45200(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014c, code lost:
    
        r8 = r9.m47972();
        r9 = r8.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0152, code lost:
    
        if (r10 >= r9) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0154, code lost:
    
        r13 = r8[r10];
        m45202(new l.C18956(r13, r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x015e, code lost:
    
        if (r7 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0160, code lost:
    
        r13.mo7223().m1342(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0167, code lost:
    
        r4 = r13.mo7222();
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016e, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x014b, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0125, code lost:
    
        if (r9.m47973() == (-1)) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0127, code lost:
    
        m45205(r9.m47973());
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0104, code lost:
    
        m45207(r11.f63503);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m45201(int r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19662.m45201(int, java.lang.String):void");
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m45208() {
        int i = this.f63504;
        int i2 = this.f63512;
        this.f63506 = true;
        int length = this.f63500.m38335().length();
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = this.f63500.m38335().charAt(i);
            if (charAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (charAt != ' ') {
                this.f63506 = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.f63503 = i;
        this.f63508 = i2;
        this.f63505 = i2 - this.f63512;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m45207(int i) {
        int i2 = this.f63503;
        if (i >= i2) {
            this.f63504 = i2;
            this.f63512 = this.f63508;
        }
        int length = this.f63500.m38335().length();
        while (true) {
            int i3 = this.f63504;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                m45203();
            }
        }
        this.f63511 = false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m45205(int i) {
        int i2;
        int i3 = this.f63508;
        if (i >= i3) {
            this.f63504 = this.f63503;
            this.f63512 = i3;
        }
        int length = this.f63500.m38335().length();
        while (true) {
            i2 = this.f63512;
            if (i2 >= i || this.f63504 == length) {
                break;
            } else {
                m45203();
            }
        }
        if (i2 > i) {
            this.f63504--;
            this.f63512 = i;
            this.f63511 = true;
            return;
        }
        this.f63511 = false;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m45203() {
        char charAt = this.f63500.m38335().charAt(this.f63504);
        this.f63504++;
        if (charAt == '\t') {
            int i = this.f63512;
            this.f63512 = (4 - (i % 4)) + i;
        } else {
            this.f63512++;
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m45206() {
        CharSequence subSequence;
        if (this.f63511) {
            CharSequence subSequence2 = this.f63500.m38335().subSequence(this.f63504 + 1, this.f63500.m38335().length());
            int i = 4 - (this.f63512 % 4);
            StringBuilder sb = new StringBuilder(subSequence2.length() + i);
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(' ');
            }
            sb.append(subSequence2);
            subSequence = sb.toString();
        } else if (this.f63504 == 0) {
            subSequence = this.f63500.m38335();
        } else {
            subSequence = this.f63500.m38335().subSequence(this.f63504, this.f63500.m38335().length());
        }
        mo44152().mo7218(C16300.m38334(subSequence, (this.f63515 != EnumC5842.BLOCKS_AND_INLINES || this.f63504 >= this.f63500.m38337().m46027()) ? null : this.f63500.m38337().m46024(this.f63504)));
        m45209();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m45209() {
        int i;
        InterfaceC2190 interfaceC2190;
        if (this.f63515 == EnumC5842.NONE) {
            return;
        }
        int i2 = 1;
        while (true) {
            ArrayList arrayList = this.f63516;
            if (i2 >= arrayList.size()) {
                return;
            }
            C18956 c18956 = (C18956) arrayList.get(i2);
            i = c18956.f59788;
            int min = Math.min(i, this.f63504);
            if (this.f63500.m38335().length() - min != 0) {
                interfaceC2190 = c18956.f59787;
                interfaceC2190.mo7219(this.f63500.m38337().m46024(min));
            }
            i2++;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:2:0x0010 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m45202(l.C18956 r3) {
        /*
            r2 = this;
        L0:
            l.ۖ֨֡ r0 = r2.mo44152()
            l.ۖ֨֡ r1 = l.C18956.m43752(r3)
            l.ۨ֡֡ r1 = r1.mo7223()
            boolean r0 = r0.mo7220(r1)
            if (r0 != 0) goto L17
            r0 = 1
            r2.m45200(r0)
            goto L0
        L17:
            l.ۖ֨֡ r0 = r2.mo44152()
            l.ۨ֡֡ r0 = r0.mo7223()
            l.ۖ֨֡ r1 = l.C18956.m43752(r3)
            l.ۨ֡֡ r1 = r1.mo7223()
            r0.m1343(r1)
            java.util.ArrayList r0 = r2.f63516
            r0.add(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19662.m45202(l.ᩴ᩵֡):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45200(int i) {
        InterfaceC2190 interfaceC2190;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC2190 = ((C18956) C4248.m12790(this.f63516, 1)).f59787;
            Iterator it = interfaceC2190.mo7224().iterator();
            while (it.hasNext()) {
                this.f63507.m23435((C16425) it.next());
            }
            interfaceC2190.mo7221();
            this.f63498.add(interfaceC2190);
        }
    }
}
