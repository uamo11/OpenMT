package l;

import java.util.List;

/* compiled from: 18OR */
/* renamed from: l.᩶֫ۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19861 implements InterfaceC0536 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f64140;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f64141;

    public C19861(List list, List list2) {
        int i = AbstractC14545.f44556;
        C1846 c1846 = new C1846();
        C22632.m50631(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            c1846.m16264(new C21977((InterfaceC0536) list.get(i2), (List) list2.get(i2)));
        }
        this.f64141 = c1846.m6131();
        this.f64140 = -9223372036854775807L;
    }

    @Override // l.InterfaceC0536
    /* renamed from: ۜ */
    public final long mo2266() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            AbstractC14545 abstractC14545 = this.f64141;
            if (i >= abstractC14545.size()) {
                break;
            }
            C21977 c21977 = (C21977) abstractC14545.get(i);
            long mo2266 = c21977.mo2266();
            if ((c21977.m49460().contains(1) || c21977.m49460().contains(2) || c21977.m49460().contains(4)) && mo2266 != Long.MIN_VALUE) {
                j = Math.min(j, mo2266);
            }
            if (mo2266 != Long.MIN_VALUE) {
                j2 = Math.min(j2, mo2266);
            }
            i++;
        }
        if (j != C13132.FOREVER_NS) {
            this.f64140 = j;
            return j;
        }
        if (j2 == C13132.FOREVER_NS) {
            return Long.MIN_VALUE;
        }
        long j3 = this.f64140;
        return j3 != -9223372036854775807L ? j3 : j2;
    }

    @Override // l.InterfaceC0536
    /* renamed from: ۧ */
    public final long mo2267() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            AbstractC14545 abstractC14545 = this.f64141;
            if (i >= abstractC14545.size()) {
                break;
            }
            long mo2267 = ((C21977) abstractC14545.get(i)).mo2267();
            if (mo2267 != Long.MIN_VALUE) {
                j = Math.min(j, mo2267);
            }
            i++;
        }
        if (j == C13132.FOREVER_NS) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // l.InterfaceC0536
    /* renamed from: ۧ */
    public final void mo2268(long j) {
        int i = 0;
        while (true) {
            AbstractC14545 abstractC14545 = this.f64141;
            if (i >= abstractC14545.size()) {
                return;
            }
            ((C21977) abstractC14545.get(i)).mo2268(j);
            i++;
        }
    }

    @Override // l.InterfaceC0536
    /* renamed from: ֫ */
    public final boolean mo2265(C11469 c11469) {
        boolean z;
        boolean z2 = false;
        do {
            long mo2267 = mo2267();
            if (mo2267 == Long.MIN_VALUE) {
                return z2;
            }
            int i = 0;
            z = false;
            while (true) {
                AbstractC14545 abstractC14545 = this.f64141;
                if (i >= abstractC14545.size()) {
                    break;
                }
                long mo22672 = ((C21977) abstractC14545.get(i)).mo2267();
                boolean z3 = mo22672 != Long.MIN_VALUE && mo22672 <= c11469.f34255;
                if (mo22672 == mo2267 || z3) {
                    z |= ((C21977) abstractC14545.get(i)).mo2265(c11469);
                }
                i++;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // l.InterfaceC0536
    /* renamed from: ֫ */
    public final boolean mo2264() {
        int i = 0;
        while (true) {
            AbstractC14545 abstractC14545 = this.f64141;
            if (i >= abstractC14545.size()) {
                return false;
            }
            if (((C21977) abstractC14545.get(i)).mo2264()) {
                return true;
            }
            i++;
        }
    }
}
