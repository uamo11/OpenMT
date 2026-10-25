package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* compiled from: MBGQ */
/* renamed from: l.֫ۘܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1579 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f5587;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20630 f5588;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f5589;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f5590;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f5591;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f5592;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC13717[] f5593;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final BitSet f5594;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f5595;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f5596;

    public C1579(C20630 c20630) {
        this.f5588 = c20630;
        int m47186 = c20630.m47186();
        this.f5596 = m47186;
        this.f5591 = new int[m47186];
        this.f5593 = new AbstractC13717[m47186];
        this.f5592 = new ArrayList();
        this.f5590 = new ArrayList();
        this.f5594 = new BitSet(c20630.m47190().size());
        this.f5595 = new ArrayList();
        this.f5589 = new ArrayList();
        this.f5587 = new ArrayList();
        for (int i = 0; i < this.f5596; i++) {
            this.f5591[i] = 0;
            this.f5593[i] = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5398(C20630 c20630) {
        BitSet bitSet;
        C1579 c1579 = new C1579(c20630);
        c1579.m5397(c20630.m47195());
        while (true) {
            ArrayList arrayList = c1579.f5592;
            boolean isEmpty = arrayList.isEmpty();
            bitSet = c1579.f5594;
            ArrayList arrayList2 = c1579.f5589;
            ArrayList arrayList3 = c1579.f5595;
            ArrayList arrayList4 = c1579.f5590;
            if (isEmpty && arrayList4.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
                break;
            }
            while (!arrayList.isEmpty()) {
                Iterator it = ((C16395) C4248.m12790(arrayList, 1)).m38615().iterator();
                while (it.hasNext()) {
                    AbstractC14278 abstractC14278 = (AbstractC14278) it.next();
                    if (abstractC14278 instanceof C13532) {
                        c1579.m5395((C13532) abstractC14278);
                    } else {
                        c1579.m5396(abstractC14278);
                    }
                }
            }
            while (!arrayList4.isEmpty()) {
                Iterator it2 = ((C16395) C4248.m12790(arrayList4, 1)).m38615().iterator();
                while (it2.hasNext()) {
                    AbstractC14278 abstractC142782 = (AbstractC14278) it2.next();
                    if (abstractC142782 instanceof C13532) {
                        c1579.m5395((C13532) abstractC142782);
                    }
                }
            }
            while (!arrayList2.isEmpty()) {
                AbstractC14278 abstractC142783 = (AbstractC14278) C4248.m12790(arrayList2, 1);
                if (bitSet.get(abstractC142783.m34044().m38609())) {
                    if (abstractC142783 instanceof C13532) {
                        c1579.m5395((C13532) abstractC142783);
                    } else {
                        c1579.m5396(abstractC142783);
                    }
                }
            }
            while (!arrayList3.isEmpty()) {
                AbstractC14278 abstractC142784 = (AbstractC14278) C4248.m12790(arrayList3, 1);
                if (bitSet.get(abstractC142784.m34044().m38609())) {
                    if (abstractC142784 instanceof C13532) {
                        c1579.m5395((C13532) abstractC142784);
                    } else {
                        c1579.m5396(abstractC142784);
                    }
                }
            }
        }
        for (int i = 0; i < c1579.f5596; i++) {
            if (c1579.f5591[i] == 1) {
                AbstractC13717[] abstractC13717Arr = c1579.f5593;
                if (abstractC13717Arr[i] instanceof AbstractC6162) {
                    AbstractC14278 m47194 = c20630.m47194(i);
                    if (!m47194.m34042().m48637().mo5253()) {
                        m47194.m34041(m47194.m34042().m48641((AbstractC6162) abstractC13717Arr[i]));
                        for (AbstractC14278 abstractC142785 : c20630.m47199(i)) {
                            if (!abstractC142785.mo29531()) {
                                C12122 c12122 = (C12122) abstractC142785;
                                C20069 mo29535 = abstractC142785.mo29535();
                                int m46260 = mo29535.m46260(i);
                                c12122.m29532(m46260, mo29535.m41004get(m46260).m48641((AbstractC6162) abstractC13717Arr[i]));
                            }
                        }
                    }
                }
            }
        }
        Iterator it3 = c1579.f5587.iterator();
        while (it3.hasNext()) {
            AbstractC14278 abstractC142786 = (AbstractC14278) it3.next();
            C16395 m34044 = abstractC142786.m34044();
            int size = m34044.m38603().size();
            int i2 = -1;
            for (int i3 = 0; i3 < size; i3++) {
                int i4 = m34044.m38603().get(i3);
                if (!bitSet.get(i4)) {
                    i2 = i4;
                }
            }
            if (size == 2 && i2 != -1) {
                m34044.m38611(new C1018(C12307.f36802, abstractC142786.mo29542().m37480(), (C21480) null, C20069.f65002));
                m34044.m38620(i2);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5397(C16395 c16395) {
        int m38609 = c16395.m38609();
        BitSet bitSet = this.f5594;
        if (!bitSet.get(m38609)) {
            this.f5592.add(c16395);
            bitSet.set(c16395.m38609());
        } else {
            this.f5590.add(c16395);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5394(int i, int i2) {
        C20630 c20630 = this.f5588;
        if (i2 == 2) {
            Iterator it = c20630.m47199(i).iterator();
            while (it.hasNext()) {
                this.f5589.add((AbstractC14278) it.next());
            }
            return;
        }
        Iterator it2 = c20630.m47199(i).iterator();
        while (it2.hasNext()) {
            this.f5595.add((AbstractC14278) it2.next());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m5399(int i, int i2, AbstractC13717 abstractC13717) {
        int[] iArr = this.f5591;
        if (i2 != 1) {
            if (iArr[i] == i2) {
                return false;
            }
            iArr[i] = i2;
            return true;
        }
        int i3 = iArr[i];
        AbstractC13717[] abstractC13717Arr = this.f5593;
        if (i3 == i2 && abstractC13717Arr[i].equals(abstractC13717)) {
            return false;
        }
        iArr[i] = i2;
        abstractC13717Arr[i] = abstractC13717;
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5395(C13532 c13532) {
        int m48652 = c13532.m34042().m48652();
        int[] iArr = this.f5591;
        int i = 2;
        if (iArr[m48652] == 2) {
            return;
        }
        C20069 mo29535 = c13532.mo29535();
        int size = mo29535.size();
        int i2 = 0;
        AbstractC13717 abstractC13717 = null;
        int i3 = 0;
        while (true) {
            if (i2 >= size) {
                i = i3;
                break;
            }
            int m32574 = c13532.m32574(i2);
            int m486522 = mo29535.m41004get(i2).m48652();
            int i4 = iArr[m486522];
            if (this.f5594.get(m32574)) {
                if (i4 != 1) {
                    i = i4;
                    break;
                }
                AbstractC13717[] abstractC13717Arr = this.f5593;
                if (abstractC13717 == null) {
                    abstractC13717 = abstractC13717Arr[m486522];
                    i3 = 1;
                } else if (!abstractC13717Arr[m486522].equals(abstractC13717)) {
                    break;
                }
            }
            i2++;
        }
        if (m5399(m48652, i, abstractC13717)) {
            m5394(m48652, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x00dd, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0096, code lost:
    
        if (r11 <= 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0099, code lost:
    
        if (r11 >= 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x009c, code lost:
    
        if (r11 < 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x009f, code lost:
    
        if (r11 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00a2, code lost:
    
        if (r11 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00cc, code lost:
    
        if (r11 > r12) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00cf, code lost:
    
        if (r11 <= r12) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00d2, code lost:
    
        if (r11 >= r12) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00d5, code lost:
    
        if (r11 < r12) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00d8, code lost:
    
        if (r11 != r12) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00db, code lost:
    
        if (r11 == r12) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0205, code lost:
    
        if (r6 != null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0093, code lost:
    
        if (r11 > 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00df, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00e0, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0200  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m5396(l.AbstractC14278 r17) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1579.m5396(l.ܳۘܺ):void");
    }
}
