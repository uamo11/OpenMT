package l;

import java.util.IdentityHashMap;
import java.util.Iterator;

/* compiled from: C6PQ */
/* renamed from: l.᩻۫ۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23695 extends C17878 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean[] f76731;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f76732;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f76733;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f76734;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f76735;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C9585 f76736;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f76737;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5883[] f76738;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f76739;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f76740;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f76741 = new IdentityHashMap();

    /* JADX WARN: Removed duplicated region for block: B:107:0x01c5 A[LOOP:2: B:94:0x0183->B:107:0x01c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ca A[EDGE_INSN: B:108:0x01ca->B:121:0x01ca BREAK  A[LOOP:2: B:94:0x0183->B:107:0x01c5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C23695(l.C21631 r12) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23695.<init>(l.᩸ܳ֡):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m52238(C21631 c21631, int i, int i2, boolean z, int i3, boolean z2) {
        if (c21631 == C4665.f14830) {
            Iterator it = c21631.f69442.iterator();
            int i4 = -1;
            while (it.hasNext()) {
                AbstractC7086 abstractC7086 = (AbstractC7086) it.next();
                if (abstractC7086.f74154 == i && (abstractC7086 instanceof C18375)) {
                    C18375 c18375 = (C18375) abstractC7086;
                    if (c18375.m51210() == 2 && m52239(c18375, 0, i2, z) && m52239(c18375, 1, i3, z2)) {
                        if (i4 == -1) {
                            i4 = c18375.f21787;
                        }
                    }
                }
            }
            return i4;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[RETURN] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m52239(l.C18375 r3, int r4, int r5, boolean r6) {
        /*
            l.۬ۜ֡ r4 = r3.m51211(r4)
            l.᩺ܳ֡ r4 = r4.f38806
            l.᩺ܳ֡ r4 = l.C9585.m24503(r4)
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L2b
            int r6 = r4.m51210()
            if (r6 != r0) goto L51
            l.۬ۜ֡ r4 = r4.m51211(r1)
            boolean r6 = r4 instanceof l.C10823
            if (r6 == 0) goto L51
            l.ۧۜ֡ r4 = (l.C10823) r4
            int r6 = r4.f32554
            int r2 = r3.f74154
            if (r6 == r2) goto L25
            goto L51
        L25:
            l.᩺ܳ֡ r4 = r4.f38806
            l.᩺ܳ֡ r4 = l.C9585.m24503(r4)
        L2b:
            if (r5 >= 0) goto L32
            l.ܳ᩻֡ r3 = r3.f77840
            if (r4 != r3) goto L51
            goto L50
        L32:
            int r6 = r4.m51210()
            if (r6 != r0) goto L51
            l.۬ۜ֡ r4 = r4.m51211(r1)
            boolean r6 = r4 instanceof l.C8706
            if (r6 == 0) goto L51
            l.ۡۜ֡ r4 = (l.C8706) r4
            int r6 = r4.f26507
            if (r6 != r5) goto L51
            l.᩺ܳ֡ r4 = r4.f26506
            l.᩺ܳ֡ r4 = l.C9585.m24503(r4)
            l.ܳ᩻֡ r3 = r3.f77840
            if (r4 != r3) goto L51
        L50:
            return r0
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23695.m52239(l.ᩳ᩻֡, int, int, boolean):boolean");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52240() {
        int i = 0;
        while (true) {
            C5883[] c5883Arr = this.f76738;
            if (i >= c5883Arr.length) {
                this.f54599.clear();
                this.f76741.clear();
                this.f76739 = 0;
                return;
            }
            c5883Arr[i] = new C5883(c5883Arr[i].f18062, i);
            i++;
        }
    }
}
