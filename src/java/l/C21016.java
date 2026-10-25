package l;

import java.util.BitSet;

/* compiled from: L78E */
/* renamed from: l.᩷ܿۜ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21016 implements InterfaceC7274 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C9021 f67836;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C12918 f67837;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22706 f67838;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11138 f67839;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public BitSet f67840;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47828(C12918 c12918, C9021 c9021, C11138 c11138, C22706 c22706, BitSet bitSet) {
        this.f67837 = c12918;
        this.f67836 = c9021;
        this.f67839 = c11138;
        this.f67838 = c22706;
        this.f67840 = bitSet;
    }

    @Override // l.InterfaceC7274
    /* renamed from: ֫ */
    public final void mo19516(int i) {
        C12918 c12918 = this.f67837;
        C9021 c9021 = this.f67836;
        C11138 c11138 = this.f67839;
        C22706 c22706 = this.f67838;
        BitSet bitSet = this.f67840;
        if (bitSet == null || !bitSet.get(i)) {
            int i2 = c9021.f27385;
            c22706.m50718();
            c12918.m31385(i, c22706, false);
            c11138.m27626(c22706.m50717(), new C9727(c9021));
            if (bitSet == null || c9021.f27385 != i2) {
                return;
            }
            bitSet.set(i);
        }
    }
}
