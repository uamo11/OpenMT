package l;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: H8MM */
/* renamed from: l.ܺۚۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15729 implements InterfaceC1368 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f48507;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C17714 f48508;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f48509;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6950 f48510;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final List f48511;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C6558 f48512;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f48513;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final SparseArray f48514;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f48515;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f48516;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final SparseIntArray f48517;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC0207 f48518;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f48519;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20670 f48520;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f48521;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f48522;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f48523;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f48524;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20524 f48525;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f48526;

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4838() {
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    public C15729(int i, int i2, InterfaceC6950 interfaceC6950, C9248 c9248, C20524 c20524) {
        this.f48525 = c20524;
        this.f48526 = i;
        this.f48522 = i2;
        this.f48510 = interfaceC6950;
        if (i == 1 || i == 2) {
            this.f48511 = Collections.singletonList(c9248);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f48511 = arrayList;
            arrayList.add(c9248);
        }
        this.f48508 = new C17714(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f48523 = sparseBooleanArray;
        this.f48524 = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f48514 = sparseArray;
        this.f48517 = new SparseIntArray();
        this.f48520 = new C20670();
        this.f48513 = InterfaceC21830.f69942;
        this.f48516 = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (InterfaceC0207) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new C17141(new C9381(this)));
        this.f48518 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r2 = r2 + 1;
     */
    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo4841(l.InterfaceC8424 r7) {
        /*
            r6 = this;
            l.ᩳ֨֫ r0 = r6.f48508
            byte[] r0 = r0.m41482()
            l.ܺ᩷ۧ r7 = (l.C16184) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.mo22068(r1, r1, r2, r0)
            r2 = 0
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L2b
            r3 = 0
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r2 = r2 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.mo22062(r2, r1)
            r7 = 1
            return r7
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15729.mo4841(l.۠᩷ۧ):boolean");
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        if ((this.f48522 & 1) == 0) {
            interfaceC21830 = new C9067(interfaceC21830, this.f48510);
        }
        this.f48513 = interfaceC21830;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        C6558 c6558;
        C22632.m50634(this.f48526 != 2);
        List list = this.f48511;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C9248 c9248 = (C9248) list.get(i);
            boolean z = c9248.m23735() == -9223372036854775807L;
            if (!z) {
                long m23730 = c9248.m23730();
                z = (m23730 == -9223372036854775807L || m23730 == 0 || m23730 == j2) ? false : true;
            }
            if (z) {
                c9248.m23737(j2);
            }
        }
        if (j2 != 0 && (c6558 = this.f48512) != null) {
            c6558.m52772(j2);
        }
        this.f48508.m41481(0);
        this.f48517.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f48514;
            if (i2 < sparseArray.size()) {
                ((InterfaceC0207) sparseArray.valueAt(i2)).mo1450();
                i2++;
            } else {
                this.f48509 = 0;
                return;
            }
        }
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) {
        boolean z;
        boolean z2;
        long length = interfaceC8424.getLength();
        int i = 0;
        int i2 = this.f48526;
        boolean z3 = i2 == 2;
        if (this.f48507) {
            C20670 c20670 = this.f48520;
            if (length != -1 && !z3 && !c20670.m47290()) {
                return c20670.m47287(interfaceC8424, c23615, this.f48516);
            }
            if (this.f48521) {
                z = z3;
            } else {
                this.f48521 = true;
                if (c20670.m47288() != -9223372036854775807L) {
                    z = z3;
                    C6558 c6558 = new C6558(c20670.m47289(), c20670.m47288(), length, this.f48516);
                    this.f48512 = c6558;
                    this.f48513.mo3430(c6558.m52771());
                } else {
                    z = z3;
                    this.f48513.mo3430(new C20794(c20670.m47288()));
                }
            }
            if (this.f48515) {
                this.f48515 = false;
                mo4839(0L, 0L);
                if (interfaceC8424.getPosition() != 0) {
                    c23615.f76532 = 0L;
                    return 1;
                }
            }
            C6558 c65582 = this.f48512;
            if (c65582 != null && c65582.m52773()) {
                return this.f48512.m52770(interfaceC8424, c23615);
            }
        } else {
            z = z3;
        }
        C17714 c17714 = this.f48508;
        byte[] m41482 = c17714.m41482();
        int i3 = 188;
        if (9400 - c17714.m41485() < 188) {
            int m41457 = c17714.m41457();
            if (m41457 > 0) {
                System.arraycopy(m41482, c17714.m41485(), m41482, 0, m41457);
            }
            c17714.m41462(m41457, m41482);
        }
        while (true) {
            int m414572 = c17714.m41457();
            SparseArray sparseArray = this.f48514;
            if (m414572 < i3) {
                int m41483 = c17714.m41483();
                int read = interfaceC8424.read(m41482, m41483, 9400 - m41483);
                if (read == -1) {
                    while (i < sparseArray.size()) {
                        InterfaceC0207 interfaceC0207 = (InterfaceC0207) sparseArray.valueAt(i);
                        if (interfaceC0207 instanceof C22640) {
                            C22640 c22640 = (C22640) interfaceC0207;
                            z2 = z;
                            if (c22640.m50650(z2)) {
                                c22640.mo1451(1, new C17714());
                            }
                        } else {
                            z2 = z;
                        }
                        i++;
                        z = z2;
                    }
                    return -1;
                }
                c17714.m41486(m41483 + read);
                i3 = 188;
            } else {
                int m41485 = c17714.m41485();
                int m414832 = c17714.m41483();
                byte[] m414822 = c17714.m41482();
                int i4 = m41485;
                while (i4 < m414832 && m414822[i4] != 71) {
                    i4++;
                }
                c17714.m41484(i4);
                int i5 = i4 + 188;
                if (i5 > m414832) {
                    int i6 = (i4 - m41485) + this.f48509;
                    this.f48509 = i6;
                    if (i2 == 2 && i6 > 376) {
                        throw C9080.m23440("Cannot find sync byte. Most likely not a Transport Stream.", (Throwable) null);
                    }
                } else {
                    this.f48509 = 0;
                }
                int m414833 = c17714.m41483();
                if (i5 > m414833) {
                    return 0;
                }
                int m41493 = c17714.m41493();
                if ((8388608 & m41493) != 0) {
                    c17714.m41484(i5);
                    return 0;
                }
                int i7 = (4194304 & m41493) != 0 ? 1 : 0;
                int i8 = (2096896 & m41493) >> 8;
                boolean z4 = (m41493 & 32) != 0;
                InterfaceC0207 interfaceC02072 = (m41493 & 16) != 0 ? (InterfaceC0207) sparseArray.get(i8) : null;
                if (interfaceC02072 == null) {
                    c17714.m41484(i5);
                    return 0;
                }
                if (i2 != 2) {
                    int i9 = m41493 & 15;
                    SparseIntArray sparseIntArray = this.f48517;
                    int i10 = sparseIntArray.get(i8, i9 - 1);
                    sparseIntArray.put(i8, i9);
                    if (i10 == i9) {
                        c17714.m41484(i5);
                        return 0;
                    }
                    if (i9 != ((i10 + 1) & 15)) {
                        interfaceC02072.mo1450();
                    }
                }
                if (z4) {
                    int m41456 = c17714.m41456();
                    i7 |= (c17714.m41456() & 64) != 0 ? 2 : 0;
                    c17714.m41478(m41456 - 1);
                }
                boolean z5 = this.f48507;
                if (i2 == 2 || z5 || !this.f48524.get(i8, false)) {
                    c17714.m41486(i5);
                    interfaceC02072.mo1451(i7, c17714);
                    c17714.m41486(m414833);
                }
                if (i2 != 2 && !z5 && this.f48507 && length != -1) {
                    this.f48515 = true;
                }
                c17714.m41484(i5);
                return 0;
            }
        }
    }
}
