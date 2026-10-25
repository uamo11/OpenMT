package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: G8N2 */
/* renamed from: l.ܰۖۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13530 implements InterfaceC1368, InterfaceC9505 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17714 f40350;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f40351;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long[][] f40352;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f40353;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C17714 f40354;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f40355;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f40356;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C17714 f40357;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayList f40358;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f40359;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f40360;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f40361;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f40362;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C17805 f40363;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C17714 f40364;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6950 f40365;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f40366;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f40367;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f40368;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f40369;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f40370;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17714 f40371;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f40372;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f40373;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC14545 f40374 = AbstractC14545.of();

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C2633 f40375;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f40376;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f40377;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f40378;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f40379;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C22703[] f40380;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f40381;

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4838() {
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    @Override // l.InterfaceC9505
    /* renamed from: ܿ */
    public final boolean mo6829() {
        return true;
    }

    public C13530(InterfaceC6950 interfaceC6950, int i) {
        this.f40365 = interfaceC6950;
        this.f40353 = i;
        this.f40351 = (i & 4) != 0 ? 3 : 0;
        this.f40363 = new C17805();
        this.f40358 = new ArrayList();
        this.f40371 = new C17714(16);
        this.f40359 = new ArrayDeque();
        this.f40357 = new C17714(C16509.f50737);
        this.f40350 = new C17714(6);
        this.f40354 = new C17714();
        this.f40356 = -1;
        this.f40362 = InterfaceC21830.f69942;
        this.f40380 = new C22703[0];
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        InterfaceC3860 m40114 = C17099.m40114(interfaceC8424, (this.f40353 & 2) != 0);
        this.f40374 = m40114 != null ? AbstractC14545.of((Object) m40114) : AbstractC14545.of();
        return m40114 == null;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܳ */
    public final List mo4842() {
        return this.f40374;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        if ((this.f40353 & 16) == 0) {
            interfaceC21830 = new C9067(interfaceC21830, this.f40365);
        }
        this.f40362 = interfaceC21830;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        this.f40359.clear();
        this.f40373 = 0;
        this.f40356 = -1;
        this.f40369 = 0;
        this.f40378 = 0;
        this.f40379 = 0;
        this.f40355 = false;
        if (j == 0) {
            if (this.f40351 == 3) {
                this.f40363.m41735();
                this.f40358.clear();
                return;
            } else {
                this.f40351 = 0;
                this.f40373 = 0;
                return;
            }
        }
        for (C22703 c22703 : this.f40380) {
            C20628 c20628 = c22703.f73349;
            int m11036 = C3603.m11036(c20628.f66358, j2, false);
            while (true) {
                if (m11036 < 0) {
                    m11036 = -1;
                    break;
                } else if ((c20628.f66353[m11036] & 1) != 0) {
                    break;
                } else {
                    m11036--;
                }
            }
            if (m11036 == -1) {
                m11036 = c20628.m47166(j2);
            }
            c22703.f73347 = m11036;
            C0331 c0331 = c22703.f73350;
            if (c0331 != null) {
                c0331.m1750();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:245:0x0246, code lost:
    
        r25 = r7;
        r16 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x069d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x069f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x04b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x069f A[SYNTHETIC] */
    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo4837(l.InterfaceC8424 r32, l.C23615 r33) {
        /*
            Method dump skipped, instructions count: 1705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13530.mo4837(l.۠᩷ۧ, l.᩻ۢۧ):int");
    }

    @Override // l.InterfaceC9505
    /* renamed from: ۜ */
    public final long mo6827() {
        return this.f40377;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2 A[EDGE_INSN: B:66:0x00d2->B:67:0x00d2 BREAK  A[LOOP:1: B:29:0x006c->B:57:0x00ce], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e6  */
    @Override // l.InterfaceC9505
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C6682 mo1721(long r18) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13530.mo1721(long):l.ۜۢۧ");
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0002 A[SYNTHETIC] */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m32568(long r32) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13530.m32568(long):void");
    }
}
