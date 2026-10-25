package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

/* compiled from: E7TQ */
/* renamed from: l.᩻۠֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23565 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17215 f75641;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14392 f75642;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f75643 = new ArrayDeque();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f75645 = new ArrayDeque();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final PriorityQueue f75644 = new PriorityQueue();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f75646 = -1;

    public C23565(InterfaceC14392 interfaceC14392) {
        this.f75642 = interfaceC14392;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52032(int i) {
        C22632.m50634(i >= 0);
        this.f75646 = i;
        m52030(i);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m52035() {
        return this.f75646;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r9 < r0.f52819) goto L32;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m52033(long r9, l.C17714 r11) {
        /*
            r8 = this;
            int r0 = r8.f75646
            if (r0 == 0) goto L9c
            r1 = -1
            java.util.PriorityQueue r2 = r8.f75644
            if (r0 == r1) goto L21
            int r0 = r2.size()
            int r3 = r8.f75646
            if (r0 < r3) goto L21
            java.lang.Object r0 = r2.peek()
            l.ܿ۠֫ r0 = (l.C17215) r0
            java.lang.String r3 = l.C3603.f11424
            long r3 = r0.f52819
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L21
            goto L9c
        L21:
            java.util.ArrayDeque r0 = r8.f75643
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L2f
            l.ᩳ֨֫ r0 = new l.ᩳ֨֫
            r0.<init>()
            goto L35
        L2f:
            java.lang.Object r0 = r0.pop()
            l.ᩳ֨֫ r0 = (l.C17714) r0
        L35:
            int r3 = r11.m41457()
            r0.m41481(r3)
            byte[] r3 = r11.m41482()
            int r11 = r11.m41485()
            byte[] r4 = r0.m41482()
            int r5 = r0.m41457()
            r6 = 0
            java.lang.System.arraycopy(r3, r11, r4, r6, r5)
            l.ܿ۠֫ r11 = r8.f75641
            if (r11 == 0) goto L60
            long r3 = r11.f52819
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 != 0) goto L60
            java.util.ArrayList r9 = r11.f52818
            r9.add(r0)
            return
        L60:
            java.util.ArrayDeque r11 = r8.f75645
            boolean r3 = r11.isEmpty()
            if (r3 == 0) goto L6e
            l.ܿ۠֫ r11 = new l.ܿ۠֫
            r11.<init>()
            goto L74
        L6e:
            java.lang.Object r11 = r11.pop()
            l.ܿ۠֫ r11 = (l.C17215) r11
        L74:
            java.util.ArrayList r3 = r11.f52818
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r7 == 0) goto L80
            r6 = 1
        L80:
            l.C22632.m50631(r6)
            boolean r4 = r3.isEmpty()
            l.C22632.m50634(r4)
            r11.f52819 = r9
            r3.add(r0)
            r2.add(r11)
            r8.f75641 = r11
            int r9 = r8.f75646
            if (r9 == r1) goto L9b
            r8.m52030(r9)
        L9b:
            return
        L9c:
            l.ܳ۠֫ r0 = r8.f75642
            r0.mo14710(r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23565.m52033(long, l.ᩳ֨֫):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52031() {
        this.f75644.clear();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52034() {
        m52030(0);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m52030(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = this.f75644;
            if (priorityQueue.size() <= i) {
                return;
            }
            C17215 c17215 = (C17215) priorityQueue.poll();
            String str = C3603.f11424;
            int i2 = 0;
            while (true) {
                arrayList = c17215.f52818;
                if (i2 >= arrayList.size()) {
                    break;
                }
                this.f75642.mo14710(c17215.f52819, (C17714) arrayList.get(i2));
                this.f75643.push((C17714) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            C17215 c172152 = this.f75641;
            if (c172152 != null && c172152.f52819 == c17215.f52819) {
                this.f75641 = null;
            }
            this.f75645.push(c17215);
        }
    }
}
