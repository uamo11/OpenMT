package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: 36B9 */
/* renamed from: l.᩷ۨ֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20846 implements InterfaceC19150 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f67488;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12918 f67489;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile BitSet f67490;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f67491 = -1;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16611 f67492;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47664(long j) {
        return j >= 0 && j <= 2147483647L;
    }

    public C20846(C12918 c12918, C16611 c16611, int i) {
        this.f67489 = c12918;
        this.f67492 = c16611;
        this.f67488 = i;
    }

    @Override // l.InterfaceC19150
    /* renamed from: ᩻ */
    public final int mo3818() {
        int i = this.f67491;
        if (i != -1) {
            return i;
        }
        int m11936 = this.f67489.m31418().m11936(this.f67488);
        this.f67491 = m11936;
        return m11936;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47669() {
        return this.f67489.m31418().mo11935(this.f67488 + 12);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m47667() {
        int i = this.f67488 + 16;
        int m47669 = m47669();
        BitSet bitSet = new BitSet();
        if (m47669 > 0) {
            int i2 = (m47669 * 2) + i;
            C18729 m11939 = this.f67489.m31418().m11939(i);
            try {
                C7897 mo27437 = this.f67489.mo27437();
                ArrayList arrayList = new ArrayList(mo3811());
                C15859 c15859 = new C15859();
                BitSet bitSet2 = new BitSet();
                c15859.add(0);
                while (!c15859.isEmpty()) {
                    m47662(mo27437, m11939, i, i2, c15859, bitSet, bitSet2);
                    if (arrayList.isEmpty()) {
                        break;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C15905 c15905 = (C15905) it.next();
                        int mo14555 = c15905.mo14555();
                        if (m47664(mo14555) && bitSet2.get(mo14555)) {
                            it.remove();
                            Iterator it2 = c15905.mo14556().iterator();
                            while (it2.hasNext()) {
                                m47663(c15859, bitSet2, ((AbstractC12213) it2.next()).mo7391());
                            }
                        }
                    }
                }
            } finally {
                m11939.m43359();
            }
        }
        this.f67490 = bitSet;
    }

    @Override // l.InterfaceC19150
    /* renamed from: ᩷ */
    public final Iterable mo3817() {
        int m47669 = m47669();
        int i = this.f67488 + 16;
        return new C17317(this, i, (m47669 * 2) + i, this.f67489.m31420() ? m47668() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0188 A[LOOP:1: B:11:0x0028->B:37:0x0188, LOOP_END] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m47662(l.C7897 r16, l.C18729 r17, int r18, int r19, l.C15859 r20, java.util.BitSet r21, java.util.BitSet r22) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20846.m47662(l.۠ۗ֡, l.ᩴۨ֡, int, int, l.ܺۢᩴ, java.util.BitSet, java.util.BitSet):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47663(C15859 c15859, BitSet bitSet, long j) {
        if (m47664(j)) {
            int i = (int) j;
            if (bitSet.get(i)) {
                return;
            }
            c15859.add(i);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private BitSet m47668() {
        BitSet bitSet;
        BitSet bitSet2 = this.f67490;
        if (bitSet2 != null) {
            return bitSet2;
        }
        synchronized (this) {
            bitSet = this.f67490;
            if (bitSet == null) {
                m47667();
                bitSet = this.f67490;
            }
        }
        return bitSet;
    }

    @Override // l.InterfaceC19150
    /* renamed from: ۜ */
    public final List mo3811() {
        AbstractC3912 m31418 = this.f67489.m31418();
        int i = this.f67488;
        int m11936 = m31418.m11936(i + 6);
        if (m11936 > 0) {
            int m51496 = C23202.m51496(m47669(), 2, i + 16, 3) & (-4);
            return new C23667(this, m51496, (m11936 * 8) + m51496, m11936);
        }
        return AbstractC14545.of();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private AbstractC20722 m47666() {
        C12918 c12918 = this.f67489;
        int mo11937 = c12918.m31418().mo11937(this.f67488 + 8);
        if (mo11937 == -1 || mo11937 == 0) {
            return AbstractC20722.m47328(c12918, 0, this);
        }
        C16611 c16611 = this.f67492;
        if (mo11937 < 0) {
            System.err.printf("%s: Invalid debug offset%n", c16611);
            return AbstractC20722.m47328(c12918, 0, this);
        }
        if (mo11937 >= c12918.m31418().length()) {
            System.err.printf("%s: Invalid debug offset%n", c16611);
            return AbstractC20722.m47328(c12918, 0, this);
        }
        return AbstractC20722.m47328(c12918, mo11937, this);
    }

    @Override // l.InterfaceC19150
    /* renamed from: ۢ */
    public final Iterable mo3812() {
        final BitSet m47668 = m47668();
        return C8882.m22954(m47666(), new InterfaceC18842() { // from class: l.ᩳۨ֡
            @Override // l.InterfaceC18842
            public final boolean apply(Object obj) {
                return C20846.m47665(m47668, (InterfaceC7860) obj);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m47665(BitSet bitSet, InterfaceC7860 interfaceC7860) {
        if (interfaceC7860.mo8424() != 10) {
            return true;
        }
        int mo14974 = interfaceC7860.mo14974();
        if (m47664(mo14974) && bitSet.get(mo14974)) {
            return true;
        }
        if (!(interfaceC7860 instanceof C5199)) {
            return false;
        }
        ((C5199) interfaceC7860).m14973();
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Iterator m47670() {
        return m47666().mo18118();
    }
}
