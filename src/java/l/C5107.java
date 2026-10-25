package l;

import java.util.BitSet;

/* compiled from: 9BH0 */
/* renamed from: l.ۚۘܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C5107 extends EnumC0873 {
    public /* synthetic */ C5107() {
        this("UNSPECIFIED", 2);
    }

    public C5107(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC0873
    /* renamed from: ֫ */
    public int mo1286(BitSet bitSet, int i) {
        return bitSet.nextClearBit(i);
    }
}
