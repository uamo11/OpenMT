package l;

import java.util.BitSet;

/* compiled from: 9BH0 */
/* renamed from: l.֡ۘܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public enum C0167 extends EnumC0873 {
    public /* synthetic */ C0167() {
        this("ODD", 1);
    }

    public C0167(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC0873
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo1286(BitSet bitSet, int i) {
        int nextClearBit = bitSet.nextClearBit(i);
        while (C14984.m35484(nextClearBit)) {
            nextClearBit = bitSet.nextClearBit(nextClearBit + 1);
        }
        return nextClearBit;
    }
}
