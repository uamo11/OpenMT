package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: 4BHP */
/* renamed from: l.ۖۘܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2285 implements InterfaceC17101 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16395 f7383;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21480[] f7384;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC3696 f7385;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f7386;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashSet f7387;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15689 f7388;

    public C2285(RunnableC3696 runnableC3696, C16395 c16395) {
        C21480[][] c21480Arr;
        C21480[][] c21480Arr2;
        this.f7385 = runnableC3696;
        this.f7383 = c16395;
        c21480Arr = runnableC3696.f11658;
        this.f7384 = c21480Arr[c16395.m38609()];
        this.f7387 = new HashSet();
        this.f7386 = new HashMap();
        this.f7388 = new C15689(this);
        c21480Arr2 = runnableC3696.f11658;
        c21480Arr2[c16395.m38609()] = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7530() {
        RunnableC3696 runnableC3696;
        C21480[][] c21480Arr;
        C20630 c20630;
        C16395 c16395 = this.f7383;
        c16395.m38599(this);
        C8635 c8635 = new C8635(this);
        BitSet m38604 = c16395.m38604();
        int nextSetBit = m38604.nextSetBit(0);
        while (true) {
            runnableC3696 = this.f7385;
            if (nextSetBit < 0) {
                break;
            }
            c20630 = runnableC3696.f11661;
            ((C16395) c20630.m47190().get(nextSetBit)).m38602(c8635);
            nextSetBit = m38604.nextSetBit(nextSetBit + 1);
        }
        ArrayList m38615 = c16395.m38615();
        boolean z = true;
        for (int size = m38615.size() - 1; size >= 0; size--) {
            AbstractC14278 abstractC14278 = (AbstractC14278) m38615.get(size);
            AbstractC14278 abstractC142782 = (AbstractC14278) this.f7386.get(abstractC14278);
            if (abstractC142782 != null) {
                m38615.set(size, abstractC142782);
            } else if (abstractC14278.mo29536() && !this.f7387.contains(abstractC14278)) {
                m38615.remove(size);
            }
        }
        Iterator it = c16395.m38594().iterator();
        while (it.hasNext()) {
            C16395 c163952 = (C16395) it.next();
            if (c163952 != c16395) {
                C21480[] c21480Arr2 = this.f7384;
                if (!z) {
                    C21480[] c21480Arr3 = new C21480[c21480Arr2.length];
                    System.arraycopy(c21480Arr2, 0, c21480Arr3, 0, c21480Arr2.length);
                    c21480Arr2 = c21480Arr3;
                }
                c21480Arr = runnableC3696.f11658;
                c21480Arr[c163952.m38609()] = c21480Arr2;
                z = false;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m7528(int i, C21480 c21480) {
        int m48652 = c21480.m48652();
        C18658 m48653 = c21480.m48653();
        C21480[] c21480Arr = this.f7384;
        c21480Arr[i] = c21480;
        int length = c21480Arr.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            } else if (m48652 == c21480Arr[length].m48652()) {
                c21480Arr[length] = c21480;
            }
        }
        if (m48653 == null) {
            return;
        }
        RunnableC3696.m11261(this.f7385, c21480);
        int length2 = c21480Arr.length;
        while (true) {
            length2--;
            if (length2 < 0) {
                return;
            }
            C21480 c214802 = c21480Arr[length2];
            if (m48652 != c214802.m48652() && m48653.equals(c214802.m48653())) {
                c21480Arr[length2] = c214802.m48642((C18658) null);
            }
        }
    }

    @Override // l.InterfaceC17101
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7532(C13532 c13532) {
        m7533((AbstractC14278) c13532);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        if (r4 == 0) goto L29;
     */
    @Override // l.InterfaceC17101
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo7531(l.C12122 r9) {
        /*
            r8 = this;
            l.᩸ۡܺ r0 = r9.m34042()
            int r1 = r0.m48652()
            l.᩶ۡܺ r2 = r9.mo29535()
            r3 = 0
            l.᩸ۡܺ r2 = r2.m41004get(r3)
            int r2 = r2.m48652()
            l.ܺۘܺ r4 = r8.f7388
            r9.mo29539(r4)
            l.᩶ۡܺ r4 = r9.mo29535()
            l.᩸ۡܺ r4 = r4.m41004get(r3)
            int r4 = r4.m48652()
            l.᩸ۡܺ[] r5 = r8.f7384
            r2 = r5[r2]
            l.ᩴۡܺ r2 = r2.m48653()
            l.ᩴۡܺ r5 = r0.m48653()
            if (r5 != 0) goto L35
            r5 = r2
        L35:
            l.ۘۘܺ r6 = r8.f7385
            l.ᩴۡܺ r7 = l.RunnableC3696.m11262(r6, r4)
            if (r7 == 0) goto L45
            if (r5 == 0) goto L45
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L46
        L45:
            r3 = 1
        L46:
            l.۟ܺܺ r0 = r0.getType()
            l.᩸ۡܺ r0 = l.C21480.m48636(r4, r0, r5)
            boolean r4 = l.C5772.m16231()
            if (r4 == 0) goto La6
            if (r3 == 0) goto L67
            if (r5 == r2) goto L60
            if (r5 == 0) goto L67
            boolean r4 = r5.equals(r2)
            if (r4 == 0) goto L67
        L60:
            int r4 = l.RunnableC3696.m11266(r6)
            if (r4 != 0) goto L67
            goto La6
        L67:
            if (r3 == 0) goto L9d
            if (r2 != 0) goto L9d
            int r2 = l.RunnableC3696.m11266(r6)
            if (r2 != 0) goto L9d
            int r2 = r0.m48652()
            l.۟ܺܺ r3 = r0.getType()
            l.᩸ۡܺ r2 = l.C21480.m48632(r2, r3, r5)
            l.᩶ۡܺ r2 = l.C20069.m46252(r2)
            l.֨ۡܺ r3 = new l.֨ۡܺ
            l.ۗۡܺ r4 = l.C12307.m29858(r0)
            l.ۤۡܺ r5 = l.C10191.f30620
            r6 = 0
            r3.<init>(r4, r5, r6, r2)
            l.۫ۖܺ r2 = new l.۫ۖܺ
            l.ܽۘܺ r4 = r8.f7383
            r2.<init>(r3, r4)
            java.util.HashMap r3 = r8.f7386
            r3.put(r9, r2)
            r8.m7528(r1, r0)
            return
        L9d:
            r8.m7533(r9)
            java.util.HashSet r0 = r8.f7387
            r0.add(r9)
            return
        La6:
            r8.m7528(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2285.mo7531(l.۫ۖܺ):void");
    }

    @Override // l.InterfaceC17101
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo7534(C12122 c12122) {
        c12122.mo29539(this.f7388);
        m7533((AbstractC14278) c12122);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7533(AbstractC14278 abstractC14278) {
        int i;
        int i2;
        C21480 m34042 = abstractC14278.m34042();
        if (m34042 == null) {
            return;
        }
        int m48652 = m34042.m48652();
        RunnableC3696 runnableC3696 = this.f7385;
        if (RunnableC3696.m11264(runnableC3696, m48652)) {
            return;
        }
        i = runnableC3696.f11662;
        abstractC14278.m34038(i);
        m7528(m48652, abstractC14278.m34042());
        i2 = runnableC3696.f11662;
        runnableC3696.f11662 = i2 + 1;
    }
}
