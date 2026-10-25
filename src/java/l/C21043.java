package l;

import java.util.BitSet;

/* compiled from: 5BHG */
/* renamed from: l.᩷ᩳܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21043 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public BitSet f67898;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public BitSet f67899;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f67900;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9048 f67901;

    public C21043(C9048 c9048, int i) {
        int i2;
        int i3;
        this.f67901 = c9048;
        this.f67900 = i;
        i2 = c9048.f27439;
        this.f67899 = new BitSet(i2);
        i3 = c9048.f27439;
        this.f67898 = new BitSet(i3);
        c9048.f27443 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47878() {
        return this.f67900;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47882(int i) {
        this.f67899.set(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47879(int i) {
        this.f67898.set(i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21064 m47881() {
        C16540 m23358;
        BitSet bitSet = this.f67898;
        C21064 c21064 = new C21064(bitSet.size());
        for (int nextSetBit = bitSet.nextSetBit(0); nextSetBit >= 0; nextSetBit = bitSet.nextSetBit(nextSetBit + 1)) {
            m23358 = this.f67901.m23358(nextSetBit);
            c21064.add(m23358.m38911().get(0));
        }
        c21064.mo20349();
        return c21064;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47880(C12533 c12533, int[] iArr) {
        C16540 m23358;
        BitSet bitSet = this.f67898;
        for (int nextSetBit = bitSet.nextSetBit(0); nextSetBit >= 0; nextSetBit = bitSet.nextSetBit(nextSetBit + 1)) {
            C9048 c9048 = this.f67901;
            m23358 = c9048.m23358(nextSetBit);
            int i = m23358.m38911().get(0);
            C12533 m30750 = c12533.m30750(this.f67900, nextSetBit);
            if (m30750 != null) {
                c9048.m23350(i, -1, null, m30750, iArr);
            } else {
                C13573.m32627(nextSetBit, iArr);
            }
        }
    }
}
